package com.entropia.useCase;

import com.entropia.core.domain.Transaction;

public interface TransferUseCase {

    Boolean transfer(Transaction transaction);
}
