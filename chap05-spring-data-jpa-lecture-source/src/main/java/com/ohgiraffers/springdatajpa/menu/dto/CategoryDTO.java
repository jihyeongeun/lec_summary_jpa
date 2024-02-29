package com.ohgiraffers.springdatajpa.menu.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CategoryDTO {
    private int categoryCode;

    private String categoryName;

    private Integer refCategoryCode;
}
