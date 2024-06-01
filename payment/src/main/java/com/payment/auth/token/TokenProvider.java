package com.payment.auth.token;

import javax.crypto.SecretKey;

public class TokenProvider {

    private final SecretKey secretKey;
    private final long tokenExpirationPeriod;

    public TokenProvider(final SecretKey secretKey, final long tokenExpirationPeriod) {
        this.secretKey = secretKey;
        this.tokenExpirationPeriod = tokenExpirationPeriod;
    }

    public String createToken(final Long memberId, final MemberRole role)


}
