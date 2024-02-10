package dev.careeropz.commons.jobprofile.requestdto;

import dev.careeropz.commons.dto.CountryDto;
import dev.careeropz.commons.jobprofile.commondto.JobProfileStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BasicInfoRequestDto {
    private String companyName;
    private String industry;
    private CountryDto country;
    private String position;
    private String companyWebsite;
    private JobProfileStatus status;
    private LocalDate appliedDate;
}
