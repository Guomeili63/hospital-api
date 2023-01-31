package com.example.hospital.api.db.dao;


import com.example.hospital.api.db.pojo.DoctorEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface  DoctorDao {
    public ArrayList<HashMap> searchByPage(Map param);
    public long searchCount(Map param);

    //是否存在重复记录
    @Transactional
    public long searchCountByPid(String pid);
    public HashMap searchContent(int id);
    public void updatePhoto(Map param);
    public Integer searchIdByUuid(String uuid);
    public HashMap searchById(int id);

    @Transactional
    public void insert(DoctorEntity entity);

    public void update(Map param);


    public void deleteByIds(Integer[] ids);





}










