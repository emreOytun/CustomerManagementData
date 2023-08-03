package com.emreoytun.customermanagementdata.dto;

public interface IModelMapperService {
    /**
     * Creates an instance of the given target class and copies the properties of source object to this instance
     * meanwhile ignoring the given ignore properties.
     * @param sourceObj The source object to be copied to the instance of target class.
     * @param targetClass The target class whose instance will be created.
     * @param ignoreProperties The properties that will be ignored in copying.
     * @return An instance of the target class.
     * @param <Source> The source class.
     * @param <Target> The target class.
     */
    <Source, Target> Target map(Source sourceObj, Class<Target> targetClass, String... ignoreProperties);

    /**
     * Creates an instance of the given target class and copies the properties of source object to this instance
     * meanwhile ignoring the given ignore properties and copying the properties of the composed classes.
     * @param sourceObj The source object to be copied to the instance of target class.
     * @param targetClass The target class whose instance will be created.
     * @param ignoreProperties The properties that will be ignored in copying.
     * @return An instance of the target class.
     * @param <Source> The source class.
     * @param <Target> The target class.
     */
    <Source, Target> Target mapComposed(Source sourceObj, Class<Target> targetClass, String... ignoreProperties);

    /**
     * Copies the properties of source object to the target object meanwhile ignoring the given ignore properties.
     * @param sourceObj The source object to be copied to the instance of target class.
     * @param ignoreProperties The properties that will be ignored in copying.
     * @param <Source> The source class.
     * @param <Target> The target class.
     */
    <Source, Target> void copyProperties(Source sourceObj, Target targetObj, String... ignoreProperties);

    /**
     * Copies the properties of source object to the target object meanwhile ignoring the given ignore properties
     * and copying the properties of the composed classes.
     * @param sourceObj The source object to be copied to the instance of target class.
     * @param ignoreProperties The properties that will be ignored in copying.
     * @param <Source> The source class.
     * @param <Target> The target class.
     */
    <Source, Target> void copyPropertiesComposed(Source sourceObj, Target targetObj, String... ignoreProperties);
}
