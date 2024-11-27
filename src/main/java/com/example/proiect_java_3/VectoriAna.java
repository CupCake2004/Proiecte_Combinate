package com.example.proiect_java_3;

import java.util.ArrayList;
public class VectoriAna {
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

        // Boxe:
        Gadget Boxa1 = new Boxe("Boxa 1", "Brand1", 2020, 250.0, 4.5, 10, "Boxe pentru sunet clar", "USB", true);
        Gadget Boxa2 = new Boxe("Boxa 2", "Brand2", 2021, 475.0, 4.8, 5, "Boxe performante", "USB", false);
        Gadget Boxa3 = new Boxe("Boxa 3", "Brand3", 2022, 550.0, 5.0, 8, "Boxe puternice", "Bluetooth", true);
        Gadget Boxa4 = new Boxe();
        Gadget Boxa5 = new Boxe((Boxe) Boxa3);
        System.out.println(Boxa1);
        System.out.println(Boxa2);
        System.out.println(Boxa3);
        System.out.println(Boxa4);
        System.out.println(Boxa5);

        // Casti:
        Gadget Casca1 = new Casti("Casca 1", "Brand1", 2020, 250.0, 4.5, 10, "Casti pentru sunet clar", true, true);
        Gadget Casca2 = new Casti("Casca 2", "Brand2", 2021, 475.0, 4.8, 5, "Casti performante", false, false);
        Gadget Casca3 = new Casti("Casca 3", "Brand3", 2022, 550.0, 5.0, 8, "Casti puternice", false, true);
        Gadget Casca4 = new Casti();
        Gadget Casca5 = new Casti((Casti) Casca3);
        System.out.println(Casca1);
        System.out.println(Casca2);
        System.out.println(Casca3);
        System.out.println(Casca4);
        System.out.println(Casca5);

        // Vectorii Gadget:
        ArrayList<Gadget> listaGadget = new ArrayList<>();
        listaGadget.add(new Gadget("JBL", "JBL", 2019, 308.0, 4.2, 12, "Model eficient pentru uz casnic"));
        listaGadget.add(new Gadget("Samsung", "Samsung", 2023, 600.0, 4.7, 6, "Model premium"));
        listaGadget.add(new Gadget("Sony", "Sony", 2020, 450.0, 4.5, 8, "Model versatil cu funcții avansate"));
        listaGadget.add(new Gadget("Philips", "Philips", 2022, 380.0, 4.3, 10, "Design ergonomic și eficiență ridicată"));
        listaGadget.add(new Gadget("LG", "LG", 2021, 520.0, 4.6, 5, "Gadget de top cu performanțe excelente"));
        listaGadget.add(new Gadget("Panasonic", "Panasonic", 2020, 400.0, 4.4, 7, "Model compact pentru uz zilnic"));
        listaGadget.add(new Gadget("Toshiba", "Toshiba", 2023, 470.0, 4.8, 6, "Model de înaltă calitate pentru profesioniști"));
        listaGadget.add(new Gadget("Sharp", "Sharp", 2022, 340.0, 4.1, 15, "Eficiență ridicată la un preț accesibil"));
        listaGadget.add(new Gadget("Bosch", "Bosch", 2021, 530.0, 4.9, 4, "Gadget profesional pentru uz intens"));
        listaGadget.add(new Gadget("Dell", "Dell", 2023, 410.0, 4.0, 10, "Model robust pentru utilizare îndelungată"));
        for (Gadget gadget : listaGadget) {
            System.out.println(gadget);
        }

        // Vectorii Boxe:
        ArrayList<Boxe> listaBoxe = new ArrayList<>();
        listaBoxe.add(new Boxe("Huawei", "Huawei", 2020, 480.0, 4.3, 4, "Sunet calitativ", "Bluetooth", true));
        listaBoxe.add(new Boxe("Xiaomi", "Xiaomi", 2021, 490.0, 4.4, 7, "Performanță ridicată", "USB", false));
        listaBoxe.add(new Boxe("Sony", "Sony", 2019, 520.0, 4.5, 6, "Claritate excelentă a sunetului", "Bluetooth", true));
        listaBoxe.add(new Boxe("JBL", "JBL", 2022, 560.0, 4.8, 5, "Bass profund și sunet echilibrat", "Bluetooth", true));
        listaBoxe.add(new Boxe("LG", "LG", 2023, 490.0, 4.6, 8, "Performanță audio excepțională", "USB", false));
        listaBoxe.add(new Boxe("Bose", "Bose", 2020, 600.0, 4.9, 3, "Sunet premium pentru profesioniști", "Bluetooth", true));
        listaBoxe.add(new Boxe("Panasonic", "Panasonic", 2021, 350.0, 4.4, 9, "Model accesibil cu funcții avansate", "USB", false));
        listaBoxe.add(new Boxe("Philips", "Philips", 2023, 270.0, 4.3, 7, "Design compact și sunet clar", "Bluetooth", true));
        listaBoxe.add(new Boxe("Samsung", "Samsung", 2022, 180.0, 4.7, 6, "Ideal pentru spații mari", "USB", false));
        listaBoxe.add(new Boxe("Sharp", "Sharp", 2019, 430.0, 4.2, 10, "Sunet balansat și claritate bună", "Bluetooth", true));
        for (Boxe boxa : listaBoxe) {
            System.out.println(boxa);
        }

        ArrayList<Casti> listaCasti = new ArrayList<>();
        listaCasti.add(new Casti("Sony WH-1000XM4", "Sony", 2020, 350.0, 4.8, 5, "Căști premium cu anulare activă a zgomotului", true, true));
        listaCasti.add(new Casti("Bose QuietComfort 45", "Bose", 2021, 400.0, 4.9, 4, "Anulare activă a zgomotului și confort superior", true, true));
        listaCasti.add(new Casti("JBL Tune 760NC", "JBL", 2022, 200.0, 4.5, 10, "Sunet echilibrat și anulare a zgomotului", true, true));
        listaCasti.add(new Casti("Apple AirPods Max", "Apple", 2021, 550.0, 4.7, 3, "Sunet excepțional și design premium", true, true));
        listaCasti.add(new Casti("Beats Studio 3", "Beats", 2020, 300.0, 4.6, 7, "Bass profund și anulare a zgomotului", true, true));
        listaCasti.add(new Casti("Sennheiser HD 450BT", "Sennheiser", 2022, 250.0, 4.4, 8, "Căști wireless cu anulare activă a zgomotului", true, true));
        listaCasti.add(new Casti("Philips TAPH802", "Philips", 2021, 180.0, 4.3, 9, "Căști wireless cu autonomie mare", false, true));
        listaCasti.add(new Casti("Logitech G435", "Logitech", 2023, 120.0, 4.2, 12, "Căști wireless pentru gaming", false, true));
        listaCasti.add(new Casti("HyperX Cloud II Wireless", "HyperX", 2021, 160.0, 4.6, 6, "Căști wireless pentru gaming cu surround sound", false, true));
        listaCasti.add(new Casti("Samsung Galaxy Buds Pro", "Samsung", 2022, 170.0, 4.5, 15, "Căști compacte cu anulare a zgomotului", true, true));
        for (Casti casca : listaCasti) {
            System.out.println(casca);
        }

        // Filtrare:
        System.out.println("\n[FILTRARE] Gadgeturi:");
        for (int i = 0; i < listaGadget.size(); i++) {
            if (listaGadget.get(i).getPrice() > 400.0 && listaGadget.get(i).getRating() > 4.5) {
                System.out.println(listaGadget.get(i));
            }
        }

        System.out.println("\n[FILTRARE] Boxe:");
        for (Boxe boxa : listaBoxe) {
            if (boxa.getType().equals("Bluetooth") && boxa.isWireless()) {
                System.out.println(boxa);
            }
        }

        System.out.println("\n[FILTRARE] Casti:");
        for (Casti casca : listaCasti) {
            if (casca.isNoiseCancelling() && casca.getYearOfManufacture()==2021) {
                System.out.println(casca);
            }
        }
    }


}
