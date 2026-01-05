package com.example.movietalk.member.dto;

import com.example.movietalk.member.entity.constant.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CustomUserDTO {

  private Long mid;

  @NotBlank(message = "이메일은 필수입니다.")
  @Email(message = "이메일 형식이 아닙니다")
  private String email;

  @NotBlank(message = "비밀번호는 필수입니다.")
  @Size(min = 8, message = "비밀번호는 8자 이상입니다.")
  private String password;

  @NotBlank(message = "닉네임은 필수입니다.")
  @Size(min = 4, message = "닉네임은 최소 4자부터입니다.")
  private String nickname;

  private Role role;
}
