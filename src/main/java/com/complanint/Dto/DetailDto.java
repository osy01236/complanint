package com.complanint.Dto;

import com.complanint.Entity.Complain;
import com.complanint.Entity.ComplainRelay;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class DetailDto {
    private long id; // 수정을위해 primary key 필요
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private String category;
    private String status;
    private String reply; //민원답변내용
    private LocalDateTime replayAt; //답변 작성일
    private List<ImgDto> imgDtos;

    public DetailDto(Complain complain, ComplainRelay complainRelay){
        this.id= complain.getId();
        this.title=complain.getTitle();
        this.content=complain.getContent();
        this.createdAt=complain.getCreatedAt();
        this.category=complain.getCategory();
        this.status=complain.getStatus();
        if (complainRelay !=null){
            this.reply=complainRelay.getContent();
            this.replayAt=complainRelay.getCreatedAt();
        }

    }
}
