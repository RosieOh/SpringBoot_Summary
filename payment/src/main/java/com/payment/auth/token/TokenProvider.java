package com.payment.auth.token;

import com.payment.member.constant.MemberRole;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import javax.crypto.SecretKey;
import java.util.Date;

import static java.lang.System.currentTimeMillis;

public class TokenProvider {

    private final SecretKey secretKey;
    private final long tokenExpirationPeriod;

    public TokenProvider(final SecretKey secretKey, final long tokenExpirationPeriod) {
        this.secretKey = secretKey;
        this.tokenExpirationPeriod = tokenExpirationPeriod;
    }

    public String createToken(final Long memberId, final MemberRole role) {
        final Claims claim = createClaims(memberId, role);
        return Jwts.builder()
                .claims(claim)
                .signWith(secretKey)
                .compact();
    }

    private Claims createClaims(final Long memberId, final MemberRole role) {
        return Jwts.claims()
                .subject(memberId.toString())
                .issuedAt(new Date(currentTimeMillis()))
                .expiration(createExpirationDate())
                .add("role", role.name())
                .build();
    }

    private Date createExpirationDate() {
        return generateTokenExpiration();
    }

    private Date generateTokenExpiration() {
        return new Date(new Date().getTime() + tokenExpirationPeriod);
    }

    public Claims getTokenClaims(final String token) {
        return Jwts.parser()
                .verifyWith(secretKey)
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }


}
