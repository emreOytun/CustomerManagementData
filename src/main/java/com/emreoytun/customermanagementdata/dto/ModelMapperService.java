package com.emreoytun.customermanagementdata.dto;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.Arrays;

// Makes conversions between Customer class and Dto classes.
// For most used ones.
@Service
public class ModelMapperService implements IModelMapperService {

    @Override
    public <Source, Target> Target map(Source sourceObj, Class<Target> targetClass, String... ignoreProperties) {
        try {
            Target targetObj = targetClass.newInstance();
            BeanUtils.copyProperties(sourceObj, targetObj);
            return targetObj;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public <Source, Target> void copyProperties(Source sourceObj, Target targetObj, String... ignoreProperties) {
        BeanUtils.copyProperties(sourceObj, targetObj, ignoreProperties);

        Field[] fields = sourceObj.getClass().getDeclaredFields();
        Arrays.stream(fields).forEach(field -> {
            if (!field.getType().isPrimitive() && !field.getType().isAssignableFrom(String.class)
            && !isFieldIgnored(field, ignoreProperties)) {
                field.setAccessible(true);
                try {
                    BeanUtils.copyProperties(field.get(sourceObj), targetObj);
                } catch (IllegalAccessException e) {
                }
            }
        });
    }

    private boolean isFieldIgnored(Field field, String... ignoreProperties) {
        for (String property : ignoreProperties) {
            if (field.getName().equals(property)) {
                return true;
            }
        }
        return false;
    }
}
