package com.complanint.Entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ComplainFile {
    private long Id;
    private long complainId;
    private String fileName;
    private String filePath;
    private LocalDateTime createdAt;
}
