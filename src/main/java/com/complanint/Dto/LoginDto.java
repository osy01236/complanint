package com.complanint.Dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDto {
    @NotEmpty(message = "아이디를 입력하세요.")
    private String userId;

    @NotEmpty(message = "비밀번호를 입력하세요.")
    private String password;
}
