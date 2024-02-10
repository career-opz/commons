package dev.careeropz.commons.jobprofile.commondto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobProfileProgressStepDto {
    private Integer progressStepId;
    private String uniqueId;
    private String title;
    private String description;
    private Date date;
    private ProgressUploadsDto uploads;
}
