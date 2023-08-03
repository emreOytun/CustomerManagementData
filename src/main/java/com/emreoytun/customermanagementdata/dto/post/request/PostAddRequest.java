package com.emreoytun.customermanagementdata.dto.post.request;

import lombok.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostAddRequest {

    @NotNull
    @NotBlank
    private String post;
    private String description;
}
