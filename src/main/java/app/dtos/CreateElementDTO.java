package app.dtos;

import lombok.Data;

@Data
public class CreateElementDTO {
    private String ipAddress;
    private String userName;
    private String content;
}