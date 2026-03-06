package com.complanint.control;

import com.complanint.Dto.ComPlainWriteDto;
import com.complanint.service.ComplainService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.security.Principal;
import java.util.List;

@Controller
public class ComplainController {

    @Autowired
    private ComplainService complainService;


    @PostMapping("/writeSave")
    public String writeSave(@Valid ComPlainWriteDto complainWriteDto,
                            BindingResult bindingResult,
                            @RequestParam("imgFile")List<MultipartFile> multipartFiles,
                                                         Principal principal, Model model){
                            if (bindingResult.hasErrors()){
                                return"board/write";
                            }
                            //잘 입력했다면 테이블에 저장 되도록 해야함
                            //
                            try{
                                complainService.save(principal.getName(), complainWriteDto, multipartFiles);
                            } catch ( Exception e) {
                                model.addAttribute("message","이미지 또는 파일업 로드 실패");
                                return "board/write";
                            }
                            return "redirect:/";
    }



    @GetMapping("/write")
    public String writeComplain (Model model){
        model.addAttribute("complainWriteDto", new ComPlainWriteDto());
        return"board/write";
    }


}
