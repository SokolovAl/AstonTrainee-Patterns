package creational_pattern.products;

import creational_pattern.components.*;

public class PC {
    private final CPU cpu;
    private final Motherboard motherboard;
    private final VideoCard videoCard;
    private final RAM ram;
    private final ROM rom;
    private final CoolingSystem coolingSystem;
    private final Power power;
    private final Hull hull;

    public PC(CPU cpu, Motherboard motherboard, VideoCard videoCard, RAM ram, ROM rom, CoolingSystem coolingSystem, Power power, Hull hull) {
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.videoCard = videoCard;
        this.ram = ram;
        this.rom = rom;
        this.coolingSystem = coolingSystem;
        this.power = power;
        this.hull = hull;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public RAM getRam() {
        return ram;
    }

    public ROM getRom() {
        return rom;
    }

    public CoolingSystem getCoolingSystem() {
        return coolingSystem;
    }

    public Power getPower() {
        return power;
    }

    public Hull getHull() {
        return hull;
    }

    @Override
    public String toString() {
        return "Here's your new PC:" +
                "\nCPU : " + cpu +
                ",\nMotherboard : " + motherboard +
                ",\nVideo card :" + videoCard +
                ",\nRAM : " + ram +
                ",\nROM : " + rom +
                ",\nCooling system : " + coolingSystem +
                ",\nPower : " + power +
                ",\nHull : " + hull;
    }
}
