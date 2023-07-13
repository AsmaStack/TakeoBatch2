package com.os.laptop;

public class Asus extends Laptop {
    private String model;

    public Asus(String cpu, String gpu, int memorySize, int storageSize, String model) {
        super(cpu, gpu, memorySize, storageSize, LaptopCategory.GAMING);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    protected void printSpecs() {
        super.printSpecs();
        System.out.println("Model: " + this.model);
    }
}
