package com.entropia.core.domain;

import com.entropia.core.domain.enums.UserTypeEnum;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Wallet {

    private Long id;
    private BigDecimal balance;
    private User user;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public Wallet() {
    }

    public Wallet(BigDecimal balance, User user) {
        this.balance = balance;
        this.user = user;
        this.createdAt = LocalDateTime.now();
    }

    public Wallet(Long id, BigDecimal balance, User user, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.balance = balance;
        this.user = user;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void  receiveValue(BigDecimal value){

        this.balance.add(value);
    }

    public void  transfer(BigDecimal value){

        if (this.user.getType() == UserTypeEnum.SHOPKEEPER){
           throw
        }

        if (this.balance.compareTo(value) < 0){
            throw
        }

        this.balance.subtract(value);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
