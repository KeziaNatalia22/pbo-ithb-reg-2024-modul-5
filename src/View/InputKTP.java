package View;

import Controller.Controller;
import Model.KTP;

import java.util.Date;
import java.util.Properties;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;
import org.jdatepicker.impl.DateComponentFormatter;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class InputKTP {
    JFrame frame;
    JPanel panel;
    JTextField tfBerlakuHingga, tfKotaPembuatan, tfDetailNegara, tfNIK, tfNama, tfTempatLahir, tfAlamat, tfRtRw,
            tfKelDesa, tfKecamatan, tfTglPembuatan;
    JLabel lTempatLahir, lTglLahir, lJenisKelamin, lGolDarah, lAlamat, lRtRw, lKelDesa, lKecamatan, lAgama, ljudul,
            lNIK, lNama, lStatusKawin, lPekerjaan, lKewarganegaraan, lFoto, lTandaTangan, lBerlakuHingga,
            lKotaPembuatan, lTglPembuatan, lTitle, lDetailNegara, lPathFoto, lPathTTD, berlakuHingga, lPembuatan;
    UtilDateModel dateModel;
    JDatePanelImpl datePanel;
    JButton btnInsert;
    JDatePickerImpl datePickerTglLahir, datePickerTglBuat;
    JComboBox<String> agamaComboBox, statusPerkawinan;
    ButtonGroup buttonGroupJenisKelamin, buttonGroupKewarganegaraan, buttonGroupGolDarah;
    JCheckBox cbKaryawan, cbPNS, cbWiraswasta, cbAkademisi, cbPengangguran;
    JRadioButton rbPria, rbWanita, rbO, rbAB, rbA, rbB, rbWNI, rbWNA;
    String kewarganegaraan, jenisKelamin, golDarah, pekerjaan;
    File photoFile;
    File signatureFile;

    public InputKTP() {
        showForm();
    }

    public void showForm() {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize(); // GET MY SCREEN SIZE

        int screenWidth = screenSize.width; // GET PIXELS FOR WIDTH
        int screenHeight = screenSize.height; // GET PIXELS FOR HEIGHT

        final int FRAME_WIDTH = 1000; // SET WIDTH
        final int FRAME_HEIGHT = 700; // SET WEIGHT

        int start_x = screenWidth / 2 - (FRAME_WIDTH / 2); // SET START LOCATION FOR X
        int start_y = screenHeight / 2 - (FRAME_HEIGHT / 2); // SET START LOCATION FOR Y

        frame = new JFrame("Form Input Data Penduduk"); // CREATE FRAME AND SET TITLE

        frame.setBounds(start_x, start_y, FRAME_WIDTH, FRAME_HEIGHT); // SET FRAME BOUND
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

        lNIK = new JLabel("NIK");
        lNIK.setBounds(40, 10, 400, 25);
        panel.add(lNIK);

        tfNIK = new JTextField();
        tfNIK.setBounds(40, 40, 400, 25);
        panel.add(tfNIK);

        lNama = new JLabel("Nama");
        lNama.setBounds(40, 70, 400, 25);
        panel.add(lNama);

        tfNama = new JTextField();
        tfNama.setBounds(40, 95, 400, 25);
        panel.add(tfNama);

        lTempatLahir = new JLabel("Tempat Lahir");
        lTempatLahir.setBounds(40, 130, 400, 25);
        panel.add(lTempatLahir);

        tfTempatLahir = new JTextField();
        tfTempatLahir.setBounds(40, 155, 400, 25);
        panel.add(tfTempatLahir);

        lTglLahir = new JLabel("Tanggal Lahir");
        lTglLahir.setBounds(40, 190, 400, 25);
        panel.add(lTglLahir);

        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");

        datePanel = new JDatePanelImpl(model, p);
        datePickerTglLahir = new JDatePickerImpl(datePanel, new DateFormatter(new SimpleDateFormat("dd-MM-yyyy")));

        datePickerTglLahir.setBounds(40, 210, 400, 30);
        panel.add(datePickerTglLahir);

        lJenisKelamin = new JLabel("Jenis Kelamin");
        lJenisKelamin.setBounds(40, 250, 400, 25);
        panel.add(lJenisKelamin);

        buttonGroupJenisKelamin = new ButtonGroup();

        rbPria = new JRadioButton("Pria");
        rbPria.setBounds(40, 275, 50, 25);
        buttonGroupJenisKelamin.add(rbPria);

        rbWanita = new JRadioButton("Wanita");
        rbWanita.setBounds(90, 275, 100, 25);
        buttonGroupJenisKelamin.add(rbWanita);

        panel.add(rbPria);
        panel.add(rbWanita);

        buttonGroupGolDarah = new ButtonGroup();

        lGolDarah = new JLabel("Golongan Darah");
        lGolDarah.setBounds(40, 310, 400, 25);
        panel.add(lGolDarah);

        rbO = new JRadioButton("O");
        rbO.setBounds(40, 335, 50, 25);
        buttonGroupGolDarah.add(rbO);

        rbAB = new JRadioButton("AB");
        rbAB.setBounds(90, 335, 50, 25);
        buttonGroupGolDarah.add(rbAB);

        rbA = new JRadioButton("A");
        rbA.setBounds(140, 335, 50, 25);
        buttonGroupGolDarah.add(rbA);

        rbB = new JRadioButton("B");
        rbB.setBounds(190, 335, 50, 25);
        buttonGroupGolDarah.add(rbB);

        panel.add(rbO);
        panel.add(rbAB);
        panel.add(rbA);
        panel.add(rbB);

        lAlamat = new JLabel("Alamat");
        lAlamat.setBounds(40, 370, 400, 25);
        panel.add(lAlamat);

        tfAlamat = new JTextField();
        tfAlamat.setBounds(40, 395, 400, 25);
        panel.add(tfAlamat);

        lRtRw = new JLabel("RT/RW");
        lRtRw.setBounds(40, 420, 400, 25);
        panel.add(lRtRw);

        tfRtRw = new JTextField();
        tfRtRw.setBounds(40, 445, 400, 25);
        panel.add(tfRtRw);

        lKelDesa = new JLabel("Kelurahan/Desa");
        lKelDesa.setBounds(40, 470, 400, 25);
        panel.add(lKelDesa);

        tfKelDesa = new JTextField();
        tfKelDesa.setBounds(40, 495, 400, 25);
        panel.add(tfKelDesa);

        lKecamatan = new JLabel("Kecamatan");
        lKecamatan.setBounds(40, 520, 400, 25);
        panel.add(lKecamatan);

        tfKecamatan = new JTextField();
        tfKecamatan.setBounds(40, 545, 400, 25);
        panel.add(tfKecamatan);

        // Agama pindah kanan
        lAgama = new JLabel("Agama");
        lAgama.setBounds(500, 10, 400, 25);
        panel.add(lAgama);

        agamaComboBox = new JComboBox<>();
        agamaComboBox.addItem("KRISTEN");
        agamaComboBox.addItem("KATOLIK");
        agamaComboBox.addItem("ISLAM");
        agamaComboBox.addItem("HINDU");
        agamaComboBox.addItem("BUDDHA");
        agamaComboBox.setBounds(500, 35, 400, 25);
        panel.add(agamaComboBox);

        lStatusKawin = new JLabel("Status Perkawinan");
        lStatusKawin.setBounds(500, 65, 400, 25);
        panel.add(lStatusKawin);

        statusPerkawinan = new JComboBox<>();
        statusPerkawinan.addItem("BELUM_MENIKAH");
        statusPerkawinan.addItem("MENIKAH");
        statusPerkawinan.addItem("JANDA");
        statusPerkawinan.addItem("DUDA");
        statusPerkawinan.setBounds(500, 90, 400, 25);
        panel.add(statusPerkawinan);

        lPekerjaan = new JLabel("Pekerjaan");
        lPekerjaan.setBounds(500, 120, 400, 25);
        panel.add(lPekerjaan);

        cbKaryawan = new JCheckBox("Karyawan Swasta");
        cbKaryawan.setBounds(500, 140, 150, 25);
        panel.add(cbKaryawan);

        cbPNS = new JCheckBox("PNS");
        cbPNS.setBounds(650, 140, 100, 25);
        panel.add(cbPNS);

        cbWiraswasta = new JCheckBox("Wiraswatsa");
        cbWiraswasta.setBounds(750, 140, 100, 25);
        panel.add(cbWiraswasta);

        cbAkademisi = new JCheckBox("Akademisi");
        cbAkademisi.setBounds(500, 165, 150, 25);
        panel.add(cbAkademisi);

        cbPengangguran = new JCheckBox("Pengangguran");
        cbPengangguran.setBounds(650, 165, 150, 25);
        panel.add(cbPengangguran);

        cbPengangguran.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbPengangguran.isSelected()) {
                    cbKaryawan.setEnabled(false);
                    cbAkademisi.setEnabled(false);
                    cbPNS.setEnabled(false);
                    cbWiraswasta.setEnabled(false);

                    cbKaryawan.setSelected(false);
                    cbPNS.setSelected(false);
                    cbWiraswasta.setSelected(false);
                    cbAkademisi.setSelected(false);

                } else {
                    cbKaryawan.setEnabled(true);
                    cbAkademisi.setEnabled(true);
                    cbPNS.setEnabled(true);
                    cbWiraswasta.setEnabled(true);
                }
            }
        });

        lKewarganegaraan = new JLabel("Kewarganegaraan");
        lKewarganegaraan.setBounds(500, 200, 400, 25);
        panel.add(lKewarganegaraan);

        rbWNA = new JRadioButton("WNA");
        rbWNA.setBounds(500, 225, 100, 25);
        panel.add(rbWNA);

        rbWNI = new JRadioButton("WNI");
        rbWNI.setBounds(650, 225, 100, 25);
        panel.add(rbWNI);

        ButtonGroup citizenshipGroup = new ButtonGroup();
        citizenshipGroup.add(rbWNI);
        citizenshipGroup.add(rbWNA);

        JLabel countryLabel = new JLabel("Asal Negara"); // -> kode joel
        countryLabel.setBounds(500, 260, 400, 25);
        countryLabel.setVisible(false); 
        panel.add(countryLabel);

        JTextField citizenshipField = new JTextField();
        citizenshipField.setBounds(500, 285, 400, 25);
        citizenshipField.setVisible(false); 
        panel.add(citizenshipField);

        rbWNA.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                countryLabel.setVisible(true);
                citizenshipField.setVisible(true);

            }

        });

        rbWNI.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                countryLabel.setVisible(false);
                citizenshipField.setVisible(false);
                citizenshipField.setText("");

            }

        });


        lPathFoto = new JLabel("Foto");
        lPathFoto.setBounds(500, 310, 100, 25);
        panel.add(lPathFoto);


        JButton bPhoto = new JButton("Upload Photo");
        bPhoto.setBounds(500, 335, 200, 25);
        panel.add(bPhoto);

        bPhoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    photoFile = fileChooser.getSelectedFile();
                }
            }
        });

        lTandaTangan = new JLabel("Tanda Tangan");
        lTandaTangan.setBounds(500, 360, 200, 25);
        panel.add(lTandaTangan);
        
        JButton bTTD = new JButton("Upload TTD");
        bTTD.setBounds(500, 385, 200, 25);
        panel.add(bTTD);

        bTTD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    signatureFile = fileChooser.getSelectedFile();
                }
            }
        });

        lBerlakuHingga = new JLabel("Berlaku Hingga");
        lBerlakuHingga.setBounds(500, 410, 400, 25);
        panel.add(lBerlakuHingga);

        tfBerlakuHingga = new JTextField();
        tfBerlakuHingga.setBounds(500, 435, 400, 25);
        panel.add(tfBerlakuHingga);

        lKotaPembuatan = new JLabel("Kota Pembuatan");
        lKotaPembuatan.setBounds(500, 460, 400, 25);
        panel.add(lKotaPembuatan);

        tfKotaPembuatan = new JTextField();
        tfKotaPembuatan.setBounds(500, 485, 400, 25);
        panel.add(tfKotaPembuatan);

        lTglPembuatan = new JLabel("Tanggal Pembuatan");
        lTglPembuatan.setBounds(500, 510, 400, 25);
        panel.add(lTglPembuatan);

        datePickerTglBuat = new JDatePickerImpl(datePanel, new DateFormatter(new SimpleDateFormat("dd-MM-yyyy")));
        datePickerTglBuat.setBounds(500, 535, 400, 25);
        panel.add(datePickerTglBuat);

        btnInsert = new JButton("Submit Data!");
        btnInsert.setBounds(500, 575, 250, 25);
        panel.add(btnInsert);

        btnInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = tfNama.getText();
                String noKtp = tfNIK.getText();
                String tempatLahir = tfTempatLahir.getText();
                
                Date tglLahir = (Date) datePickerTglLahir.getModel().getValue();
                LocalDate tanggalLahirlocalDate = tglLahir.toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate();
                String tanggalLahirlocalDateFormatted = tanggalLahirlocalDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));            

                String jenisKelamin;
                if (rbPria.isSelected()) {
                    jenisKelamin = "Pria";
                } else {
                    jenisKelamin = "Wanita";
                } 

                String goldar = Controller.cekGoldar(rbA, rbAB, rbB, rbO);
                String alamat = tfAlamat.getText();
                String rtRw = tfRtRw.getText();
                String kelDesa = tfKelDesa.getText();
                String kecamatan = tfKecamatan.getText();

                String agama;
                if (agamaComboBox.getSelectedItem() != null) {
                    agama = agamaComboBox.getSelectedItem().toString();
                } else {
                    agama = ""; 
                }

                String statusKawin = (statusPerkawinan.getSelectedItem() != null)
                        ? statusPerkawinan.getSelectedItem().toString()
                        : "";

                String pekerjaan = Controller.cekPekerjaan(cbKaryawan, cbPNS, cbWiraswasta, cbAkademisi, cbPengangguran);

                String wargaNegaraAsal = rbWNA.isSelected() ? citizenshipField.getText() : "Indonesia";
                String kewarganegaraan;
                if (rbWNA.isSelected()) {
                    kewarganegaraan = "WNA " + wargaNegaraAsal;
                } else {
                    kewarganegaraan = "WNI";
                }

                String berlakuHingga = tfBerlakuHingga.getText();

                String kotaPembuatan = tfKotaPembuatan.getText();

                Date tglPembuatan = (Date) datePickerTglBuat.getModel().getValue();
                LocalDate tglPembuatanLocalDate = tglPembuatan.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
                String tglPembuatanFormatted = tglPembuatanLocalDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

                if (nama.isEmpty() || noKtp.isEmpty() || tempatLahir.isEmpty() || tglLahir == null || tanggalLahirlocalDateFormatted == null || 
                    jenisKelamin.isEmpty() || agama.isEmpty() || statusKawin.isEmpty() || pekerjaan.isEmpty() || 
                    alamat.isEmpty() || rtRw.isEmpty() || kelDesa.isEmpty() || kecamatan.isEmpty() || 
                    kewarganegaraan.isEmpty() || berlakuHingga.isEmpty() || kotaPembuatan.isEmpty() || 
                    tglPembuatanFormatted == null || photoFile == null || signatureFile == null) {
                    JOptionPane.showMessageDialog(null, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);

                } else {
                    // public KTP(String nik, String nama, String tempatLahir, String tanggalLahir, String jenisKelamin,
                    // String golDarah, String alamat, String rtRw, String kelDesa, String kecamatan, String agama,
                    // String statusPerkawinan, String pekerjaan, String kewarganegaraan, String wargaNegaraAsal,
                    // File fotoFilePath, File tandaTanganFilePath, String berlakuHingga, String kotaPembuatan,
                    // String tanggalPembuatan) {

                    KTP ktp = new KTP(
                        noKtp,
                        nama,
                        tempatLahir,
                        tanggalLahirlocalDateFormatted,
                        jenisKelamin,
                        goldar,
                        alamat,
                        rtRw,
                        kelDesa,
                        kecamatan,
                        agama,
                        statusKawin,
                        pekerjaan,
                        kewarganegaraan,
                        wargaNegaraAsal, 
                        photoFile, 
                        signatureFile, 
                        berlakuHingga,
                        kotaPembuatan,
                        tglPembuatanFormatted
                    );
                    System.out.println("Berhasil");
                    new OutputKTP(ktp);
                    frame.dispose();
                }

                
            }
        });


        frame.add(panel);
        frame.setVisible(true);
    }

}

// panel nya di grid