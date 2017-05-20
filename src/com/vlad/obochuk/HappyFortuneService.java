package com.vlad.obochuk;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You are having good fortune today!";
    }
}