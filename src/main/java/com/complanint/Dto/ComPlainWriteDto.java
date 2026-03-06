package com.complanint.Dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComPlainWriteDto {
    @NotBlank(message = "제목은필수 이다.")
    private String title;
    @NotBlank(message="내용은 필수이다.")
    private String content;
    @NotBlank(message = "민원 유형은 필수다")
    private String category;

}
