package com.emreoytun.customermanagementdata.dto.post.request;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostAddRequest {

    @NotNull
    @NotBlank
    private String post;
}
