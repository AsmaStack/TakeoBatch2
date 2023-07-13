package com.os.laptop;

public class Laptop {
    private String cpu;
    private String gpu;
    private int memorySize;
    private int storageSize;
    private LaptopCategory category;

    protected Laptop(String cpu, String gpu, int memorySize, int storageSize, LaptopCategory laptopCategory) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.category = laptopCategory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public LaptopCategory getCategory() {
        return category;
    }

    public void setCategory(LaptopCategory category) {
        this.category = category;
    }

    protected void printSpecs() {
        System.out.println("CPU: " + this.cpu);
        System.out.println("GPU: " + this.gpu);
        System.out.println("Memory Size: " + this.memorySize);
        System.out.println("Storage Size: " + this.storageSize);
    }

    public void print() {
        printSpecs();
        printCategory();
    }

    /*
    printCategory() method is available only inside this class. We can't access it outside this class and also children can't access it.
     */
    private void printCategory() {
        System.out.println("Category: " + this.category);
    }
}
