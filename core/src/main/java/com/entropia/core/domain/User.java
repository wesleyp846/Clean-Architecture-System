package com.entropia.core.domain;

import com.entropia.core.domain.enums.UserTypeEnum;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class User {

    private UUID id;
    private String email;
    private String passworld;
    private TaxNumber taxNumber;
    private String fullName;
    private UserTypeEnum type;
    private TransactionPin transactionPin;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public User() {
    }

    public User(String email, String passworld, TaxNumber taxNumber, String fullName, UserTypeEnum type, TransactionPin transactionPin) {
        this.email = email;
        this.passworld = passworld;
        this.taxNumber = taxNumber;
        this.fullName = fullName;
        this.type = type;
        this.transactionPin = transactionPin;
    }

    public User(UUID id, String email, String passworld, TaxNumber taxNumber, String fullName, UserTypeEnum type, TransactionPin transactionPin, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.email = email;
        this.passworld = passworld;
        this.taxNumber = taxNumber;
        this.fullName = fullName;
        this.type = type;
        this.transactionPin = transactionPin;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public TaxNumber getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(TaxNumber taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UserTypeEnum getType() {
        return type;
    }

    public void setType(UserTypeEnum type) {
        this.type = type;
    }

    public TransactionPin getTransactionPin() {
        return transactionPin;
    }

    public void setTransactionPin(TransactionPin transactionPin) {
        this.transactionPin = transactionPin;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return id.equals(user.id) && email.equals(user.email) && passworld.equals(user.passworld) && taxNumber.equals(user.taxNumber) && fullName.equals(user.fullName) && type == user.type && transactionPin.equals(user.transactionPin) && createdAt.equals(user.createdAt) && Objects.equals(updateAt, user.updateAt);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + passworld.hashCode();
        result = 31 * result + taxNumber.hashCode();
        result = 31 * result + fullName.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + transactionPin.hashCode();
        result = 31 * result + createdAt.hashCode();
        result = 31 * result + Objects.hashCode(updateAt);
        return result;
    }
}
