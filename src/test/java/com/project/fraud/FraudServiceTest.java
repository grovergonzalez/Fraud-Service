package com.project.fraud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FraudServiceTest {

    @Autowired
    private FraudService fraudService;

    @Test
    public void isCardBlacklisted_ValidCard() {
        String blacklistedCard = "1234567812345678";

        boolean result = fraudService.isCardBlacklisted(blacklistedCard);

        assertThat(result).isTrue();
    }

    @Test
    public void isCardBlacklisted_NonBlacklistedCard() {
        String nonBlacklistedCard = "5555555555554444";

        boolean result = fraudService.isCardBlacklisted(nonBlacklistedCard);

        assertThat(result).isFalse();
    }
}