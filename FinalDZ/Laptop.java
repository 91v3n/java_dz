package FinalDZ;

public class Laptop {
    private String brand; // Фирма
    private String model; // Модель
    private double cpuFrequency; // Частота CPU
    private int ram; // ОЗУ
    private int gpuMemory; // Память GPU
    private int hddSize; // Размер HDD

    public Laptop(String brand, String model, double cpuFrequency, int ram, int gpuMemory, int hddSize) {
        this.brand = brand;
        this.model = model;
        this.cpuFrequency = cpuFrequency;
        this.ram = ram;
        this.gpuMemory = gpuMemory;
        this.hddSize = hddSize;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getCpuFrequency() {
        return cpuFrequency;
    }

    public int getRam() {
        return ram;
    }

    public int getGpuMemory() {
        return gpuMemory;
    }

    public int getHddSize() {
        return hddSize;
    }
}