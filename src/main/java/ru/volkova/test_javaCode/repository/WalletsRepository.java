package ru.volkova.test_javaCode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.volkova.test_javaCode.model.Wallets;

public interface WalletsRepository extends JpaRepository<Wallets, Long> {
}
