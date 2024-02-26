package dev.careeropz.commons.userinfo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserProfileCheckRequestDto {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
}
