package com.entropia.useCase;

import com.entropia.core.domain.Transaction;

public interface TransactionValidateUseCase {

    Boolean validate(Transaction transaction);
}
