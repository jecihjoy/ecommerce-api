package org.jecihjoy.ecommercewebservice.Authorization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class AuthenticationRequest {

    private String userName;
    private String password;
}
