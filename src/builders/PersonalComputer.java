package builders;

import components.*;

public interface PersonalComputer {

    void setCPU(CPU cpu);

    void setMotherboard(Motherboard motherboard);

    void setVideoCard(VideoCard videoCard);

    void setRAM(RAM ram);

    void setROM(ROM rom);

    void setCoolingSystem(CoolingSystem coolingSystem);

    void setPower(Power power);

    void setHull(Hull hull);
}
