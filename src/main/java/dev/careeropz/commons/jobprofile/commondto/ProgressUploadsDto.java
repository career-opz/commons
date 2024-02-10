package dev.careeropz.commons.jobprofile.commondto;

import dev.careeropz.commons.dto.FileDataDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProgressUploadsDto {
    private FileDataDto cv;
    private FileDataDto coverLetter;
    private List<FileDataDto> other;
}
