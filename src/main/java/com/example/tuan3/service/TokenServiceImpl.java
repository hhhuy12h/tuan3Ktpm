package com.example.tuan3.service;

import com.example.tuan3.entity.Token;
import com.example.tuan3.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TokenServiceImpl implements TokenService{


    @Autowired
    private TokenRepository tokenRepository;
    @Override
    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}
