package ru.volkova.test_javaCode.service;

import ru.volkova.test_javaCode.dto.WalletsCreateDto;
import ru.volkova.test_javaCode.dto.WalletsDto;
import ru.volkova.test_javaCode.dto.WalletsUpdateDto;
import ru.volkova.test_javaCode.model.Wallets;

public interface WalletsService {
    WalletsDto getWalletById(Long id);

    WalletsDto createWallets(WalletsCreateDto walletsCreateDto);

    WalletsDto updateWallets(WalletsUpdateDto walletsUpdateDto);

}
