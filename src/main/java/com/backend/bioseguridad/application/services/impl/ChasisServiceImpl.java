package com.backend.bioseguridad.application.services.impl;

import com.backend.bioseguridad.application.dto.ChasisDTO;
import com.backend.bioseguridad.application.services.ChasisService;
import org.springframework.stereotype.Service;

@Service
public class ChasisServiceImpl implements ChasisService {

    @Override
    public ChasisDTO getChasisInfo() {

        ChasisDTO chasisDTO = new ChasisDTO();
        chasisDTO.setCpus(4);
        chasisDTO.setMaxMemory(4096);
        chasisDTO.setTotalMemory(2048);
        chasisDTO.setFreeMemory(1024);
        chasisDTO.setElapsedTime(2.345);
        chasisDTO.setTotalSpace(1024);
        chasisDTO.setFreeSpace(512);

        return chasisDTO;
    }
}