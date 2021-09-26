package com.example.tuan3.service;


import com.example.tuan3.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
