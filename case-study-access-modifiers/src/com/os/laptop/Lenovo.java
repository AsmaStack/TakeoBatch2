package com.os.laptop;

public class Lenovo extends Laptop {
    private String specialFeature;
    public Lenovo(String cpu, String gpu, int memorySize, int storageSize, String specialFeature) {
        super(cpu, gpu, memorySize, storageSize, LaptopCategory.WORK);
        this.specialFeature = specialFeature;
    }

    public String getSpecialFeature() {
        return specialFeature;
    }

    public void setSpecialFeature(String specialFeature) {
        this.specialFeature = specialFeature;
    }

    @Override
    protected void printSpecs() {
        super.printSpecs();
        System.out.println("Special Feature: " + this.specialFeature);
    }
}
