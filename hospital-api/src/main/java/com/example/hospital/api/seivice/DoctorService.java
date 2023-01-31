package com.example.hospital.api.seivice;

import com.example.hospital.api.common.PageUtils;
import com.example.hospital.api.exception.HospitalException;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

public interface DoctorService {
    public PageUtils searchByPage(Map param);
    public HashMap searchContent(int id);
    public void updatePhoto(MultipartFile file, Integer doctorId);
    public HashMap searchById(int id);

    public void insert(Map param) throws HospitalException;

    public void update(Map param);

    public void deleteByIds(Integer[] ids);
}






