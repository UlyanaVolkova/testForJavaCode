package ru.volkova.test_javaCode.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class WalletsUpdateDto {

    private Long id;
    @Size(min = 0, message = "Баланс не может быть отрицательным")
    private Long balance;
}
