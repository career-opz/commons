package dev.careeropz.commons.jobprofile.requestdto;

import dev.careeropz.commons.jobprofile.commondto.JobProfileProgressStepDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobProfileRequestDto {
    private BasicInfoRequestDto basicInfo;
    private List<JobProfileProgressStepDto> progress;
}
