package ru.volkova.test_javaCode.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.volkova.test_javaCode.dto.WalletsCreateDto;
import ru.volkova.test_javaCode.dto.WalletsDto;
import ru.volkova.test_javaCode.dto.WalletsUpdateDto;
import ru.volkova.test_javaCode.model.Wallets;
import ru.volkova.test_javaCode.repository.WalletsRepository;
@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletsService{
    private final WalletsRepository walletsRepository;

    @Override
    public WalletsDto getWalletById(Long id) {
        Wallets wallet = walletsRepository.findById(id).orElseThrow();
        return convertToDto(wallet);
    }

    @Override
    public WalletsDto createWallets(WalletsCreateDto walletsCreateDto) {
        Wallets wallets = walletsRepository.save(convertToEntity(walletsCreateDto));
        WalletsDto walletsDto = convertToDto(wallets);
        return walletsDto;
    }

    @Override
    public WalletsDto updateWallets(WalletsUpdateDto walletsUpdateDto) {
        Wallets wallets = walletsRepository.findById(walletsUpdateDto.getId()).orElseThrow();
        wallets.setBalance(walletsUpdateDto.getBalance());
        Wallets savedWallets = walletsRepository.save(wallets);
        WalletsDto walletsDto = convertToDto(savedWallets);
        return walletsDto;
    }


    private Wallets convertToEntity(WalletsCreateDto walletsCreateDto){
        return Wallets.builder()
                .balance(walletsCreateDto.getBalance())
                .build();
    }

    private WalletsDto convertToDto(Wallets wallet){
        return WalletsDto.builder()
                .id(wallet.getId())
                .balance(wallet.getBalance())
                .build();
    }
}
