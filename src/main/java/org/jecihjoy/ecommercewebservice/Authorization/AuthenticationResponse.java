package org.jecihjoy.ecommercewebservice.Authorization;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class AuthenticationResponse {

    private final String jwtToken;

    public AuthenticationResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }

}
