package View;
import Model.KTP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OutputKTP {
    JFrame frame;
    JPanel panel;

    public OutputKTP(KTP ktp){
        viewKTP(ktp);
    }

    public void viewKTP(KTP ktp){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize(); // GET MY SCREEN SIZE

        int screenWidth = screenSize.width; // GET PIXELS FOR WIDTH
        int screenHeight = screenSize.height; // GET PIXELS FOR HEIGHT

        final int FRAME_WIDTH = 700; // SET WIDTH
        final int FRAME_HEIGHT = 500; // SET WEIGHT

        int start_x = screenWidth / 2 - (FRAME_WIDTH / 2); // SET START LOCATION FOR X
        int start_y = screenHeight / 2 - (FRAME_HEIGHT / 2); // SET START LOCATION FOR Y

        frame = new JFrame("KTP"); // CREATE FRAME AND SET TITLE
        frame.setBackground(Color.CYAN); 
        
        frame.setBounds(start_x, start_y, FRAME_WIDTH, FRAME_HEIGHT); // SET FRAME BOUND
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setBackground(Color.CYAN); 
        panel.setLayout(null);
        panel.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

        JLabel titleLabel = new JLabel("REPUBLIK HARAPAN BANGSA");
        titleLabel.setBounds(250, 10, 200, 25);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(titleLabel);

        addLabelAndValue(panel, "NIK", ktp.getNik(), 20, 40);
        addLabelAndValue(panel, "Nama", ktp.getNama(), 20, 65);
        addLabelAndValue(panel, "Tempat Lahir", ktp.getTempatLahir(), 20, 90);
        addLabelAndValue(panel, "Tanggal Lahir", ktp.getTanggalLahir(), 20, 115);
        addLabelAndValue(panel, "Jenis Kelamin", ktp.getJenisKelamin(), 20, 140);
        addLabelAndValue(panel, "Alamat", ktp.getAlamat(), 20, 165);
        addLabelAndValue(panel, "RT/RW", ktp.getRtRw(), 20, 190);
        addLabelAndValue(panel, "Kelurahan/Desa", ktp.getKelDesa(), 20, 215);
        addLabelAndValue(panel, "Kecamatan", ktp.getKecamatan(), 20, 240);
        addLabelAndValue(panel, "Agama", ktp.getAgama(), 20, 265);
        addLabelAndValue(panel, "Status Perkawinan", ktp.getStatusPerkawinan(), 20, 290);
        addLabelAndValue(panel, "Pekerjaan", ktp.getPekerjaan(), 20, 315);
        addLabelAndValue(panel, "Kewarganegaraan", ktp.getKewarganegaraan(), 20, 340);
        addLabelAndValue(panel, "Berlaku Hingga", ktp.getBerlakuHingga(), 20, 365);

        ImageIcon photoIcon = new ImageIcon(ktp.getFotoFilePath().getAbsolutePath());
        JLabel photoLabel = new JLabel(photoIcon);
        photoLabel.setBounds(360, 50, 240, 200);
        panel.add(photoLabel);

        addLabelAndValue(panel, "Kota Pembuatan", ktp.getKotaPembuatan(), 380, 260);
        addLabelAndValue(panel, "Tanggal Pembuatan", ktp.getTanggalPembuatan(), 380, 285);

        ImageIcon signatureIcon = new ImageIcon(ktp.getTandaTanganFilePath().getAbsolutePath());
        JLabel signatureLabel = new JLabel(signatureIcon);
        signatureLabel.setBounds(360, 310, 240, 80);
        panel.add(signatureLabel);

        JButton printButton = new JButton("Back");
        printButton.setBounds(20, 335, 100, 30);

        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new ViewTampilan();
            }
        });
        
        frame.add(panel);
        frame.setVisible(true);

    }

    private void addLabelAndValue(JPanel panel, String label, String value, int x, int y) {

        JLabel jLabel = new JLabel(label);
        jLabel.setBounds(x, y, 400, 25);
        panel.add(jLabel);

        JLabel jValue = new JLabel(" : " + value);
        jValue.setBounds(x + 100, y, 400, 20);
        panel.add(jValue);

    }
}
