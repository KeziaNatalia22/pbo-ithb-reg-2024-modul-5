package Controller;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Controller {
    public static String cekPekerjaan (JCheckBox cbKaryawan, JCheckBox cbPNS, JCheckBox cbWiraswasta, JCheckBox cbAkademisi, JCheckBox cbPengangguran){
        String pekerjaan = "";
        if (cbKaryawan.isSelected()) {
            pekerjaan += "Karyawan Swasta, ";
        }
        if (cbPNS.isSelected()) {
            pekerjaan += "PNS, ";
        }
        if (cbWiraswasta.isSelected()) {
            pekerjaan += "Wiraswasta, ";
        }
        if (cbAkademisi.isSelected()) {
            pekerjaan += "Akademisi, ";
        }
        if (cbPengangguran.isSelected()) {
            pekerjaan = "Pengangguran, ";
        }

        return pekerjaan;
    }

    public static String cekGoldar(JRadioButton rbA, JRadioButton rbB, JRadioButton rbAB, JRadioButton rbO) {
        String goldar = "";
        if (rbA.isSelected()) {
            goldar = "A";
        } else if (rbB.isSelected()) {
            goldar = "B";
        } else if (rbAB.isSelected()) {
            goldar = "B";
        } else {
            goldar = "O";
        } 
        return goldar;
    }

}
