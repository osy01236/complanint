package com.complanint.service;


import com.complanint.Entity.ComplainRelay;
import com.complanint.Repository.ReplayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplayService {

    @Autowired
    private ReplayRepo replayRepo;

    public ComplainRelay getReply(long id) {
        return replayRepo.findById(id);
    }
}
