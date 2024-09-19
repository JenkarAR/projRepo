package com.example.particle_data_dashboard.model;

public class Particle_Data {

	private String particleName;
    private String detector;
    private int energyLevel;

    // Constructor
    public Particle_Data(String particleName, String detector, int energyLevel) {
        this.particleName = particleName;
        this.detector = detector;
        this.energyLevel = energyLevel;
    }

    // Default constructor for serialization
    public Particle_Data() {
    }

    // Getters and setters
    public String getParticleName() {
        return particleName;
    }

    public void setParticleName(String particleName) {
        this.particleName = particleName;
    }

    public String getDetector() {
        return detector;
    }

    public void setDetector(String detector) {
        this.detector = detector;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}
