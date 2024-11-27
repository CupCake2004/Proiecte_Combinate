package com.example.proiect_java_3;

import java.util.ArrayList;
public class VectoriMarius {
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

        // Ochelari:
        Gadget VRGoggles1 = new VRGoggles("VRGoggles 1", "Brand1", 2020, 250.0, 4.5, 10, "Ochelari cu sunet clar", 100, true);
        Gadget VRGoggles2 = new VRGoggles("VRGoggles 2", "Brand2", 2021, 475.0, 4.8, 5, "Ochelari performanti", 90, false);
        Gadget VRGoggles3 = new VRGoggles("VRGoggles 3", "Brand3", 2022, 550.0, 5.0, 8, "Ochleari cu display clar", 120, true);
        Gadget VRGoggles4 = new VRGoggles();
        Gadget VRGoggles5 = new VRGoggles((VRGoggles) VRGoggles3);
        System.out.println(VRGoggles1);
        System.out.println(VRGoggles2);
        System.out.println(VRGoggles3);
        System.out.println(VRGoggles4);
        System.out.println(VRGoggles5);

        // BoxePortabile:
        Gadget BoxaPortabila1 = new PortableSpeakers("BoxaPortabila 1", "Brand1", 2020, 250.0, 4.5, 10, "Boxe Portabile pentru sunet clar", 10000, true);
        Gadget BoxaPortabila2 = new PortableSpeakers("BoxaPortabila 2", "Brand2", 2021, 475.0, 4.8, 5, "Boxe Portabile performante", 15000, false);
        Gadget BoxaPortabila3 = new PortableSpeakers("BoxaPortabila 3", "Brand3", 2022, 550.0, 5.0, 8, "Boxe Portabile puternice", 20000, true);
        Gadget BoxaPortabila4 = new PortableSpeakers();
        Gadget BoxaPortabila5 = new PortableSpeakers((PortableSpeakers) BoxaPortabila3);
        System.out.println(BoxaPortabila1);
        System.out.println(BoxaPortabila2);
        System.out.println(BoxaPortabila3);
        System.out.println(BoxaPortabila4);
        System.out.println(BoxaPortabila5);

        // Vectorii Gadget:
        ArrayList<Gadget> listaGadget = new ArrayList<>();
        listaGadget.add(new Gadget("Oculus", "Meta", 2019, 120.0, 4.2, 12, "Ochelari VR pentru gaming de înaltă performanță"));
        listaGadget.add(new Gadget("Vive", "HTC", 2023, 100.0, 4.7, 6, "Sistem VR premium pentru realitate virtuală avansată"));
        listaGadget.add(new Gadget("Reverb", "HP", 2020, 110.0, 4.5, 8, "Ochelari VR pentru experiențe realiste în aplicații profesionale"));
        listaGadget.add(new Gadget("Quest", "Meta", 2022, 90.0, 4.3, 10, "Soluție VR autonomă pentru divertisment și productivitate"));
        listaGadget.add(new Gadget("Index", "Valve", 2021, 120.0, 4.6, 5, "Ochelari VR cu specificații avansate pentru entuziaști"));
        listaGadget.add(new Gadget("Pico", "Bytedance", 2020, 80.0, 4.4, 7, "Dispozitiv VR compact pentru utilizare versatilă"));
        listaGadget.add(new Gadget("Focus", "HTC", 2023, 100.0, 4.8, 6, "Ochelari VR all-in-one cu precizie ridicată"));
        listaGadget.add(new Gadget("Neo", "Lenovo", 2022, 90.0, 4.1, 15, "Dispozitiv VR pentru experiențe captivante în realitatea virtuală"));
        listaGadget.add(new Gadget("Vision Pro", "Apple", 2021, 110.0, 4.9, 4, "Ochelari VR premium pentru aplicații multimedia și profesionale"));
        listaGadget.add(new Gadget("Magic Leap", "Magic Leap", 2023, 120.0, 4.0, 10, "Platformă VR avansată pentru medii imersive"));
        for (Gadget gadget : listaGadget) {
            System.out.println(gadget);
        }


        ArrayList<VRGoggles> listaOchelari = new ArrayList<>();
        listaOchelari.add(new VRGoggles("Reverb", "HP", 2020, 110.0, 4.5, 8, "Ochelari VR pentru experiențe realiste în aplicații profesionale", 80, true));
        listaOchelari.add(new VRGoggles("Focus", "HTC", 2023, 100.0, 4.8, 6, "Ochelari VR all-in-one cu precizie ridicată", 90, false));
        listaOchelari.add(new VRGoggles("Index", "Valve", 2021, 120.0, 4.6, 5, "Ochelari VR cu specificații avansate pentru entuziaști", 100, false));
        listaOchelari.add(new VRGoggles("Quest", "Meta", 2022, 90.0, 4.3, 10, "Soluție VR autonomă pentru divertisment și productivitate", 120, false));
        listaOchelari.add(new VRGoggles("Vision Pro", "Apple", 2021, 110.0, 4.9, 4, "Ochelari VR premium pentru aplicații multimedia și profesionale", 90, true));
        listaOchelari.add(new VRGoggles("Neo", "Lenovo", 2022, 90.0, 4.1, 15, "Dispozitiv VR pentru experiențe captivante în realitatea virtuală", 110, true));
        listaOchelari.add(new VRGoggles("Oculus", "Meta", 2019, 120.0, 4.2, 12, "Ochelari VR pentru gaming de înaltă performanță", 90, true));
        listaOchelari.add(new VRGoggles("Magic Leap", "Magic Leap", 2023, 120.0, 4.0, 10, "Platformă VR avansată pentru medii imersive", 80, false));
        listaOchelari.add(new VRGoggles("Vive", "HTC", 2023, 100.0, 4.7, 6, "Sistem VR premium pentru realitate virtuală avansată", 100, true));
        listaOchelari.add(new VRGoggles("Pico", "Bytedance", 2020, 80.0, 4.4, 7, "Dispozitiv VR compact pentru utilizare versatilă", 90, false));

        for (VRGoggles ochelari : listaOchelari) {
            System.out.println(ochelari);
        }


        ArrayList<PortableSpeakers> listaBoxePortabile = new ArrayList<>();
        listaBoxePortabile.add(new PortableSpeakers("JBL", "Charge 5", 2020, 200.0, 4.8, 5, "Boxă portabilă cu sunet puternic și baterie mare", 15000, true));
        listaBoxePortabile.add(new PortableSpeakers("Sony", "SRS-XB43", 2021, 250.0, 4.7, 4, "Boxă portabilă cu bass profund și iluminare RGB", 20000, false));
        listaBoxePortabile.add(new PortableSpeakers("Bose", "SoundLink Flex", 2022, 300.0, 4.9, 6, "Boxă portabilă premium cu sunet clar", 25000, true));
        listaBoxePortabile.add(new PortableSpeakers("Ultimate Ears", "BOOM 3", 2021, 180.0, 4.6, 7, "Design rezistent la apă și sunet 360°", 10000, false));
        listaBoxePortabile.add(new PortableSpeakers("Anker", "Soundcore Motion+", 2020, 130.0, 4.5, 10, "Boxă portabilă cu tehnologie audio Hi-Res", 20000, true));
        listaBoxePortabile.add(new PortableSpeakers("Marshall", "Emberton", 2022, 300.0, 4.8, 3, "Sunet clasic Marshall într-un format compact", 15000, false));
        listaBoxePortabile.add(new PortableSpeakers("Harman Kardon", "Onyx Studio 7", 2021, 400.0, 4.7, 4, "Boxă premium cu sunet de înaltă calitate", 25000, true));
        listaBoxePortabile.add(new PortableSpeakers("Bang & Olufsen", "Beosound Explore", 2023, 280.0, 4.6, 6, "Design elegant și sunet impecabil", 10000, false));
        listaBoxePortabile.add(new PortableSpeakers("LG", "PL7 XBOOM Go", 2021, 220.0, 4.4, 8, "Boxă cu bass puternic și conectivitate Bluetooth", 20000, true));
        listaBoxePortabile.add(new PortableSpeakers("Samsung", "MX-T50", 2022, 350.0, 4.5, 5, "Sunet puternic pentru petreceri", 15000, false));

        for (PortableSpeakers boxeportabile : listaBoxePortabile) {
            System.out.println(boxeportabile);
        }

        // Filtrare:
        System.out.println("\n[FILTRARE] Gadgeturi:");
        for (int i = 0; i < listaGadget.size(); i++) {
            if (listaGadget.get(i).getPrice() > 400.0 && listaGadget.get(i).getRating() > 4.5) {
                System.out.println(listaGadget.get(i));
            }
        }

        System.out.println("\n[FILTRARE] Ochelari:");
        for (VRGoggles ochelari : listaOchelari) {
            if (ochelari.getFieldOfView()<=100 && ochelari.isWireless()) {
                System.out.println(ochelari);
            }
        }

        System.out.println("\n[FILTRARE] Boxe Portabile:");
        for (PortableSpeakers boxaportabila : listaBoxePortabile) {
            if (boxaportabila.getBatteryLife()>=15000 && boxaportabila.getPrice()>=300) {
                System.out.println(boxaportabila);
            }
        }
    }


}
