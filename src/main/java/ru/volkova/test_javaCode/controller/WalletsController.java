package ru.volkova.test_javaCode.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.volkova.test_javaCode.dto.WalletsCreateDto;
import ru.volkova.test_javaCode.dto.WalletsDto;
import ru.volkova.test_javaCode.dto.WalletsUpdateDto;
import ru.volkova.test_javaCode.service.WalletsService;
@Controller
@RequiredArgsConstructor
public class WalletsController {
    private final WalletsService walletsService;
@GetMapping("/wallets/{id}")
    WalletsDto getWalletsById(@PathVariable("id") Long id){
        return walletsService.getWalletById(id);
    }

    @PostMapping("/wallets/create")
    WalletsDto createWallets(@RequestBody @Valid WalletsCreateDto walletsCreateDto){
    return walletsService.createWallets(walletsCreateDto);
    }

    @PutMapping
    WalletsDto updateWallets(@RequestBody @Valid WalletsUpdateDto walletsUpdateDto){
    return walletsService.updateWallets(walletsUpdateDto);
    }
}
