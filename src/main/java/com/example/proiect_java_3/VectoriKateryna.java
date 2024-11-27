package com.example.proiect_java_3;

import java.util.ArrayList;
public class VectoriKateryna {
    public static void main(String[] args) {
        // Gadget:
        Gadget Gadget1 = new Gadget("Model 1", "Brand 1", 2020, 250.0, 4.5, 10, "Gadget cu alimentare USB-A");
        Gadget Gadget2 = new Gadget("Model 2", "Brand 2", 2021, 475.0, 4.8, 5, "Gadget performant cu USB-C");
        Gadget Gadget3 = new Gadget("Model 3", "Brand 3", 2022, 550.0, 5.0, 8, "Gadget puternic cu Type-C");
        Gadget Gadget4 = new Gadget();
        Gadget Gadget5 = new Gadget(Gadget3);
        System.out.println(Gadget1);
        System.out.println(Gadget2);
        System.out.println(Gadget3);
        System.out.println(Gadget4);
        System.out.println(Gadget5);

        Gadget Reportofon1 = new Reportofon("Reportofon 1", "Brand1", 2020, 50.0, 4.5, 10, "Reportofon cu înregistrare audio de calitate", 5000, true);
        Gadget Reportofon2 = new Reportofon("Reportofon 2", "Brand2", 2021, 65.0, 4.7, 5, "Reportofon cu memorie extinsă și microfon integrat",4000, false);
        Gadget Reportofon3 = new Reportofon("Reportofon 3", "Brand3", 2022, 80.0, 4.8, 8, "Reportofon digital cu redare de sunet clar și opțiuni de editare", 3000, true);
        Gadget Reportofon4 = new Reportofon();  // Constructor implicit
        Gadget Reportofon5 = new Reportofon((Reportofon) Reportofon3);  // Copierea unui obiect Reportofon

        System.out.println(Reportofon1);
        System.out.println(Reportofon2);
        System.out.println(Reportofon3);
        System.out.println(Reportofon4);
        System.out.println(Reportofon5);


        Gadget MiniCamera1 = new MiniCamera("MiniCamera 1", "Brand1", 2020, 50.0, 4.5, 15, "Mini cameră cu înregistrare HD și detecție mișcare","USB", 2000, true);
        Gadget MiniCamera2 = new MiniCamera("MiniCamera 2", "Brand2", 2021, 60.0, 4.7, 10, "Mini cameră compactă cu conectivitate Wi-Fi și viziune nocturnă","Wireless", 5000, false);
        Gadget MiniCamera3 = new MiniCamera("MiniCamera 3", "Brand3", 2022, 70.0, 4.8, 20, "Mini cameră de securitate cu rezoluție 4K și alertă pe telefon","USB-C", 3000, true);
        Gadget MiniCamera4 = new MiniCamera();  // Constructor implicit
        Gadget MiniCamera5 = new MiniCamera((MiniCamera) MiniCamera3);  // Copierea unui obiect MiniCamera

        System.out.println(MiniCamera1);
        System.out.println(MiniCamera2);
        System.out.println(MiniCamera3);
        System.out.println(MiniCamera4);
        System.out.println(MiniCamera5);



        ArrayList<Gadget> listaGadget = new ArrayList<>();
        listaGadget.add(new Gadget("Nest", "Cam 360", 2020, 100.0, 4.7, 10, "Mini cameră de supraveghere 360° cu viziune nocturnă"));
        listaGadget.add(new Gadget("Arlo", "Essential", 2021, 120.0, 4.6, 6, "Mini cameră de exterior, rezistentă la intemperii"));
        listaGadget.add(new Gadget("Xiaomi", "Mi Home Security Camera", 2022, 40.0, 4.4, 15, "Cameră compactă cu monitorizare HD și detecție mișcare"));
        listaGadget.add(new Gadget("Wyze", "Cam v3", 2021, 30.0, 4.5, 8, "Mini cameră cu viziune nocturnă și audio bidirecțional"));
        listaGadget.add(new Gadget("Ring", "Indoor Cam", 2020, 60.0, 4.6, 7, "Mini cameră de interior cu conectivitate Wi-Fi"));
        listaGadget.add(new Gadget("Eufy", "Security 2K", 2023, 80.0, 4.8, 5, "Mini cameră 2K cu opțiuni de stocare locală"));
        listaGadget.add(new Gadget("Reolink", "Go", 2022, 150.0, 4.7, 4, "Mini cameră wireless pentru exterior cu autonomie mare"));
        listaGadget.add(new Gadget("Logitech", "Circle View", 2021, 130.0, 4.8, 6, "Mini cameră de exterior cu integrare Apple HomeKit"));
        listaGadget.add(new Gadget("TP-Link", "Tapo C200", 2020, 40.0, 4.3, 10, "Mini cameră PTZ (pan, tilt, zoom) cu detecție mișcare"));
        listaGadget.add(new Gadget("Lorex", "Wire-Free Camera", 2022, 200.0, 4.9, 3, "Mini cameră wireless pentru exterior, rezistentă la intemperii"));

        for (Gadget gadget : listaGadget) {
            System.out.println(gadget);
        }




        ArrayList<Reportofon> listaReportofon = new ArrayList<>();
        listaReportofon.add(new Reportofon("Sony", "ICD-PX470", 2020, 150.0, 4.8, 5, "Reportofon digital cu microfon integrat", 5000, true));
        listaReportofon.add(new Reportofon("Panasonic", "RR-XS470", 2021, 200.0, 4.7, 4, "Reportofon compact cu conectivitate USB", 4000, false));
        listaReportofon.add(new Reportofon("Olympus", "WS-852", 2022, 250.0, 4.9, 6, "Reportofon cu înregistrare de înaltă calitate și memorie mare", 3000, true));
        listaReportofon.add(new Reportofon("Tascam", "DR-05X", 2021, 180.0, 4.6, 7, "Reportofon cu calitate audio excelentă și suport pentru card microSD", 6000, false));
        listaReportofon.add(new Reportofon("Zoom", "H1n Handy Recorder", 2020, 130.0, 4.5, 10, "Reportofon portabil cu înregistrare stereo", 2500, false));
        listaReportofon.add(new Reportofon("Etekcity", "V30", 2022, 220.0, 4.8, 3, "Reportofon cu control vocal și conectivitate Bluetooth", 5000, true));
        listaReportofon.add(new Reportofon("Philips", "DVT2510", 2021, 250.0, 4.7, 4, "Reportofon cu monitorizare inteligentă a sunetului", 5000, false));
        listaReportofon.add(new Reportofon("Sony", "ICD-UX570", 2023, 280.0, 4.6, 6, "Reportofon digital cu înregistrare stereo și memorie internă mare", 4000, true));
        listaReportofon.add(new Reportofon("Olympus", "LS-P4", 2021, 300.0, 4.7, 5, "Reportofon de studio cu înregistrare de înaltă definiție", 3000, false));
        listaReportofon.add(new Reportofon("Zoom", "H4n Pro", 2022, 350.0, 4.9, 4, "Reportofon profesional cu patru canale de înregistrare", 2000, true));

        for (Reportofon reportofon : listaReportofon) {
            System.out.println(reportofon);
        }

        ArrayList<MiniCamera> listaMiniCamere = new ArrayList<>();
        listaMiniCamere.add(new MiniCamera("Nest", "Cam 360", 2020, 100.0, 4.7, 10, "Mini cameră de supraveghere 360° cu viziune nocturnă", "USB", 3000, true));
        listaMiniCamere.add(new MiniCamera("Arlo", "Essential", 2021, 120.0, 4.6, 6, "Mini cameră de exterior, rezistentă la intemperii", "Wireless", 4000, true));
        listaMiniCamere.add(new MiniCamera("Xiaomi", "Mi Home Security Camera", 2022, 40.0, 4.4, 15, "Cameră compactă cu monitorizare HD și detecție mișcare", "USB", 5000, false));
        listaMiniCamere.add(new MiniCamera("Wyze", "Cam v3", 2021, 30.0, 4.5, 8, "Mini cameră cu viziune nocturnă și audio bidirecțional", "USB-C", 2000, true));
        listaMiniCamere.add(new MiniCamera("Ring", "Indoor Cam", 2020, 60.0, 4.6, 7, "Mini cameră de interior cu conectivitate Wi-Fi", "Wireless", 3000, false));
        listaMiniCamere.add(new MiniCamera("Eufy", "Security 2K", 2023, 80.0, 4.8, 5, "Mini cameră 2K cu opțiuni de stocare locală", "USB", 6000, true));
        listaMiniCamere.add(new MiniCamera("Reolink", "Go", 2022, 150.0, 4.7, 4, "Mini cameră wireless pentru exterior cu autonomie mare", "Wireless", 7000, false));
        listaMiniCamere.add(new MiniCamera("Logitech", "Circle View", 2021, 130.0, 4.8, 6, "Mini cameră de exterior cu integrare Apple HomeKit", "USB-C", 5000, true));
        listaMiniCamere.add(new MiniCamera("TP-Link", "Tapo C200", 2020, 40.0, 4.3, 10, "Mini cameră PTZ (pan, tilt, zoom) cu detecție mișcare", "USB", 4000, false));
        listaMiniCamere.add(new MiniCamera("Lorex", "Wire-Free Camera", 2022, 200.0, 4.9, 3, "Mini cameră wireless pentru exterior, rezistentă la intemperii", "USB-C", 8000, true));

        for (MiniCamera camera : listaMiniCamere) {
            System.out.println(camera);
        }

        for (MiniCamera camera : listaMiniCamere) {
            System.out.println(camera);
        }


        // Filtrare:
        System.out.println("\n[FILTRARE] Gadgeturi:");
        for (Gadget gadget : listaGadget) {
            if (gadget.getPrice() > 100.0 && gadget.getRating() > 3.5) {
                System.out.println(gadget);
            }
        }

        System.out.println("\n[FILTRARE] Reportofoane:");
        for (Reportofon reportofon : listaReportofon) {
            if (reportofon.getMemory()>3000 && reportofon.isVoiceActivation()) {
                System.out.println(reportofon);
            }
        }

        System.out.println("\n[FILTRARE] Mini Camera:");
        for (MiniCamera minicamera : listaMiniCamere ) {
            if (minicamera.getBatteryCapacity()>=4000 && minicamera.isMotionDetection()) {
                System.out.println(minicamera);
            }
        }
    }


}