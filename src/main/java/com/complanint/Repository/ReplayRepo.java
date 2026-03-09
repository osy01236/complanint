package com.complanint.Repository;

import com.complanint.Entity.ComplainRelay;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReplayRepo {
    ComplainRelay findById(long id);
}
