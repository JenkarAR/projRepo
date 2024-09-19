package com.example.particle_data_dashboard.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.particle_data_dashboard.model.Particle_Data;

@RestController
@RequestMapping("/api/particles")
public class P_Data_Controller {

    private String particleName = "Electron"; // Default particle
    private String detector = "LHC";
    private int energyLevel = 42; // Default energy level

    // Endpoint to get particle data
    @GetMapping("/data")
    public Particle_Data getParticleData() {
        return new Particle_Data(particleName, detector, energyLevel);
    }

    // Endpoint to update particle data from Postman
    @PostMapping("/update")
    public ResponseEntity<String> updateParticleData(@RequestBody Particle_Data newData) {
        this.particleName = newData.getParticleName();
        this.detector = newData.getDetector();
        this.energyLevel = newData.getEnergyLevel();
        return ResponseEntity.ok("Particle data updated successfully");
    }
}

