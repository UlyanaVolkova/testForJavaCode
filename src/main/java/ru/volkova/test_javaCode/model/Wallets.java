package ru.volkova.test_javaCode.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
public class Wallets {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@Column(nullable = false)
@Setter
    private Long balance;
}
