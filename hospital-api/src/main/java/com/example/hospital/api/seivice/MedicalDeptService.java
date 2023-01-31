package com.example.hospital.api.seivice;

import java.util.ArrayList;
import java.util.HashMap;

public interface MedicalDeptService {
    public ArrayList<HashMap> searchAll();
    public HashMap searchDeptAndSub();
}


