package com.virtusa.traderapi.repositories;

import com.virtusa.traderapi.models.Bank;
import com.virtusa.traderapi.services.BankService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

@SpringBootTest
public class BankRepositoryTest {
    @Mock
    private BankRepo bankRepo;
    @InjectMocks
    private BankService bankService;
    @BeforeEach
    public void createMockResponse(){
        Bank bank = new Bank();
        bank.setBankId(1234);
        bank.setBankName("BoA");
        bank.setAddress("123 America Way");
        Optional<Bank> bankObj = Optional.of(bank);
        when(bankRepo.findById((1234L))).thenReturn(bankObj);
    }

    @Test
    public void textBankid(){
        assertEquals(1234, bankService.getBankById(1234).getBankId());
    }

}
