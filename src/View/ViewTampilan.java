package View;

import javax.swing.JOptionPane;

import Controller.*;

public class ViewTampilan {
    public ViewTampilan() {
        view();
    }

    public static void view() {
        String menu = "Selamat datang di Aplikasi Input Data KTP" +
                "\nMenu:" +
                "\n1. Input Data KTP" +
                // "\n2. Lihat Data KTP" +
                "\n2. Keluar";

        String pilihan = JOptionPane.showInputDialog(null, menu, "Menu Utama", JOptionPane.QUESTION_MESSAGE);

        switch (pilihan) {
            case "1":
                new InputKTP();
                break;
            // case "2":
            // JOptionPane.showMessageDialog(null, "Lihat Data KTP dipilih.", "Info",
            // JOptionPane.INFORMATION_MESSAGE);
            // break;
            case "2":
                JOptionPane.showMessageDialog(null, "Terima kasih telah menggunakan aplikasi ini!", "Keluar",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilihan tidak valid! Silakan pilih 1 atau 2.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                view();
                break;
        }
    }

}