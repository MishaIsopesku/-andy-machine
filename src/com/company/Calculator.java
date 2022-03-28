package com.company;

public interface Calculator {
    int calculateTotal(CoinBundle enteredCoins);
    CoinBundle calculateChange(int enteredByUserMoney);
}
