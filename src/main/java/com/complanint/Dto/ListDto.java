package com.complanint.Dto;

import com.complanint.Entity.Complain;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ListDto {
    private long id;
    private String title;
    private String status;
    private LocalDateTime createdAt;

    public ListDto(Complain complain){
        this.id =complain.getId();
        this.title=complain.getTitle();
        this.status=complain.getStatus();
        this.createdAt=complain.getCreatedAt();

    }
}
