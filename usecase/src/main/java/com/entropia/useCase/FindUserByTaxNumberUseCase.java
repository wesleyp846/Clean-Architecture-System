package com.entropia.useCase;

import com.entropia.core.domain.User;

public interface FindUserByTaxNumberUseCase {

    User findByTaxNumber(String taxNumber);
}
