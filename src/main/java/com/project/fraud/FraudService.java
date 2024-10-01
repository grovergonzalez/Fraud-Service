package com.project.fraud;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class FraudService {
    private final Set<String> blacklistedCards = new HashSet<>();

    public FraudService() {
        blacklistedCards.add("1234567812345678");
        blacklistedCards.add("8765432187654321");
    }

    public boolean isCardBlacklisted(String cardNumber) {
        return blacklistedCards.contains(cardNumber);
    }
}
