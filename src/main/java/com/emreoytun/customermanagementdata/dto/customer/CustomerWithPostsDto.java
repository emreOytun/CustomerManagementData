package com.emreoytun.customermanagementdata.dto.customer;

import com.emreoytun.customermanagementdata.dto.customer.CustomerDto;
import com.emreoytun.customermanagementdata.dto.post.PostDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerWithPostsDto extends CustomerDto {
    private List<PostDto> posts;
}
