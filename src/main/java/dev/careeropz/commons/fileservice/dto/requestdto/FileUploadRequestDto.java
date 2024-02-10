package dev.careeropz.commons.fileservice.dto.requestdto;


import dev.careeropz.commons.fileservice.dto.FileType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileUploadRequestDto {
    private FileType fileType;
    private String userId;
    private byte[] file;
    private String fileName;
}
