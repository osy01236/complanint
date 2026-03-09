package com.complanint.Repository;

import com.complanint.Entity.Complain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComplainRepo {
    void save(Complain complain);

    Complain find(long userId);


    List<Complain> findByUserName(String username);

    Complain findById(long id);
}
