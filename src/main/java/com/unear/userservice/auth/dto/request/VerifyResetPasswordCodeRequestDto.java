package com.unear.userservice.auth.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;

@Getter
public class VerifyResetPasswordCodeRequestDto {

    @NotBlank(message = "이메일을 입력해주세요.")
    @Email(message = "올바른 이메일 형식이 아닙니다.")
    private String email;
    @NotBlank(message = "인증코드를 입력해주세요.")
    @Pattern(regexp = "^[0-9]{4}$", message = "인증코드는 4자리 숫자여야 합니다.")
    private String code;
}
