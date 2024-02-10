package dev.careeropz.commons.fileservice.dto.responseto;

import dev.careeropz.commons.fileservice.dto.FileType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FileUploadResponseDto {
    private String fileId;
    private String userId;
    private FileType fileType;
    private String fileName;
    private String location;
    private Date uploadedOn;
}
