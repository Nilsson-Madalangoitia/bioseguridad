package com.backend.bioseguridad.infraestructure.controllers;
import com.backend.bioseguridad.application.dto.ChasisDTO;
import com.backend.bioseguridad.application.services.ChasisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/chasis")
public class ChasisController {

    private final ChasisService chasisService;

    @Autowired
    public ChasisController(ChasisService chasisService) {
        this.chasisService = chasisService;
    }

    @GetMapping
    public ResponseEntity<ChasisDTO> getChasisInfo() {
        ChasisDTO chasisDTO = chasisService.getChasisInfo();
        return ResponseEntity.ok(chasisDTO);
    }
}
