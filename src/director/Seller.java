package director;

import builders.PCBuilder;
import components.*;

public class Seller {

    public void createWorkPC(PCBuilder pcBuilder) {
        pcBuilder.setCPU(CPU.Core_i3_10100);
        pcBuilder.setMotherboard(Motherboard.Gigabyte_H510M_H);
        pcBuilder.setVideoCard(VideoCard.INNO3D_GeForce_GT_1030_LP);
        pcBuilder.setRAM(RAM.Goodram_Iridium_8Gb);
        pcBuilder.setROM(ROM.SSD_Kingston_A400_480Gb);
        pcBuilder.setCoolingSystem(CoolingSystem.AeroCool_Verkho_A_3P);
        pcBuilder.setPower(Power.Winard_500W);
        pcBuilder.setHull(Hull.DEEPCOOL_MATREXX_30);
    }

    public void createGamingPC(PCBuilder pcBuilder) {
        pcBuilder.setCPU(CPU.Core_i5_12600KF);
        pcBuilder.setMotherboard(Motherboard.ASUS_TUF_Gaming_Z690_Plus_D4);
        pcBuilder.setVideoCard(VideoCard.KFA2_GeForce_RTX_3070_Ti);
        pcBuilder.setRAM(RAM.GSkill_Ripjaws_V_3600_16Gb);
        pcBuilder.setROM(ROM.SSD_Kingston_A400_480Gb);
        pcBuilder.setCoolingSystem(CoolingSystem.Noctua_NH_U12S);
        pcBuilder.setPower(Power.Corsair_TX750M_750W);
        pcBuilder.setHull(Hull.MSI_MPG_GUNGNIR_110M);
    }
}
