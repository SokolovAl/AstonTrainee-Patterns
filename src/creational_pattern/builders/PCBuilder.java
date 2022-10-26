package creational_pattern.builders;

import creational_pattern.components.*;
import creational_pattern.products.PC;

public class PCBuilder implements PersonalComputer {
    private CPU cpu;
    private Motherboard motherboard;
    private VideoCard videoCard;
    private RAM ram;
    private ROM rom;
    private CoolingSystem coolingSystem;
    private Power power;
    private Hull hull;

    @Override
    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public void setRAM(RAM ram) {
        this.ram = ram;
    }

    @Override
    public void setROM(ROM rom) {
        this.rom = rom;
    }

    @Override
    public void setCoolingSystem(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    @Override
    public void setPower(Power power) {
        this.power = power;
    }

    @Override
    public void setHull(Hull hull) {
        this.hull = hull;
    }

    public PC getResult() {
        return new PC(cpu, motherboard, videoCard, ram, rom, coolingSystem, power, hull);
    }
}
