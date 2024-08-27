package com.entropia.useCase;

import com.entropia.core.domain.Transaction;

public interface UserNotificationUseCase {

    Boolean notificate(Transaction transaction, String email);
}
