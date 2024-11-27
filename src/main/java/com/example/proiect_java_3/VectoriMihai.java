package com.example.proiect_java_3;

import java.util.ArrayList;
public class VectoriMihai {
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

        Gadget Alarma1 = new SmartAlarm("SmartAlarm 1", "Brand1", 2020, 50.0, 4.5, 10, "Alarmă inteligentă cu notificări pe telefon", true, 5000);
        Gadget Alarma2 = new SmartAlarm("SmartAlarm 2", "Brand2", 2021, 65.0, 4.7, 5, "Alarmă cu detecție mișcare și control prin aplicație", false, 6000);
        Gadget Alarma3 = new SmartAlarm("SmartAlarm 3", "Brand3", 2022, 80.0, 4.8, 8, "Alarmă premium cu alarmă sonoră și vibrații", true, 3000);
        Gadget Alarma4 = new SmartAlarm();
        Gadget Alarma5 = new SmartAlarm((SmartAlarm) Alarma3);

        System.out.println(Alarma1);
        System.out.println(Alarma2);
        System.out.println(Alarma3);
        System.out.println(Alarma4);
        System.out.println(Alarma5);


        Gadget PrizaSmart1 = new SmartPlug("PrizaSmart 1", "Brand1", 2020, 30.0, 4.6, 15, "Priză inteligentă cu control prin aplicație", 100, true);
        Gadget PrizaSmart2 = new SmartPlug("PrizaSmart 2", "Brand2", 2021, 40.0, 4.7, 10, "Priză Wi-Fi cu programare și control vocal", 110, false);
        Gadget PrizaSmart3 = new SmartPlug("PrizaSmart 3", "Brand3", 2022, 35.0, 4.8, 20, "Priză inteligentă cu monitorizare consum energie", 120, true);
        Gadget PrizaSmart4 = new SmartPlug();
        Gadget PrizaSmart5 = new SmartPlug((SmartPlug) PrizaSmart3);

        System.out.println(PrizaSmart1);
        System.out.println(PrizaSmart2);
        System.out.println(PrizaSmart3);
        System.out.println(PrizaSmart4);
        System.out.println(PrizaSmart5);


        //Vectorii Gadget
        ArrayList<Gadget> listaGadget = new ArrayList<>();
        listaGadget.add(new Gadget("Amazon", "Smart Plug", 2021, 25.0, 4.7, 6, "Priză smart compatibilă cu Alexa"));
        listaGadget.add(new Gadget("TP-Link", "Kasa Smart Plug", 2020, 40.0, 4.5, 10, "Priză smart cu control vocal prin Alexa și Google Assistant"));
        listaGadget.add(new Gadget("Belkin", "WeMo Mini", 2022, 35.0, 4.6, 8, "Priză mică și compactă cu aplicație mobilă"));
        listaGadget.add(new Gadget("LIFX", "LIFX Smart Plug", 2022, 50.0, 4.6, 9, "Priză smart cu integrare cu LIFX și Google Home"));
        listaGadget.add(new Gadget("Geeni", "Smart Plug", 2021, 30.0, 4.4, 6, "Priză inteligentă cu funcții de programare"));
        listaGadget.add(new Gadget("Eufy", "Smart Plug", 2023, 45.0, 4.8, 5, "Priză smart cu control prin aplicația Eufy"));
        listaGadget.add(new Gadget("Samsung", "SmartThings Outlet", 2021, 40.0, 4.5, 10, "Priză smart cu automatizare Samsung SmartThings"));
        listaGadget.add(new Gadget("Meross", "Smart Plug", 2021, 30.0, 4.4, 7, "Priză smart cu control vocal Alexa și Google"));
        listaGadget.add(new Gadget("Kasa", "Smart Plug Mini", 2022, 25.0, 4.7, 11, "Priză smart compactă cu comenzi vocale"));

        for (Gadget gadget : listaGadget) {
            System.out.println(gadget);
        }



        ArrayList<SmartAlarm> listaAlarmeSmart = new ArrayList<>();
        listaAlarmeSmart.add(new SmartAlarm("Ring", "Alarm Pro", 2020, 200.0, 4.8, 5, "Sistem de alarmă inteligent cu conectivitate Wi-Fi", true, 15000));
        listaAlarmeSmart.add(new SmartAlarm("Nest", "Secure", 2021, 250.0, 4.7, 4, "Alarmă smart cu integrare Google Assistant", false, 20000));
        listaAlarmeSmart.add(new SmartAlarm("SimpliSafe", "Home Security", 2022, 300.0, 4.9, 6, "Alarmă cu detectare avansată a mișcării", true, 25000));
        listaAlarmeSmart.add(new SmartAlarm("Arlo", "Pro 4", 2021, 180.0, 4.6, 7, "Sistem de alarmă cu supraveghere video", false, 10000));
        listaAlarmeSmart.add(new SmartAlarm("Wyze", "Home Monitoring", 2020, 130.0, 4.5, 10, "Alarmă accesibilă cu funcții smart", true, 20000));
        listaAlarmeSmart.add(new SmartAlarm("ADT", "Command", 2022, 300.0, 4.8, 3, "Sistem de alarmă profesional cu integrare Alexa", false, 15000));
        listaAlarmeSmart.add(new SmartAlarm("Vivint", "Smart Home", 2021, 400.0, 4.7, 4, "Alarmă smart cu automatizare completă a locuinței", true, 25000));
        listaAlarmeSmart.add(new SmartAlarm("Eufy", "Security Alarm Kit", 2023, 280.0, 4.6, 6, "Kit complet de alarmă cu notificări mobile", false, 10000));
        listaAlarmeSmart.add(new SmartAlarm("Honeywell", "Smart Home", 2021, 220.0, 4.4, 8, "Alarmă smart cu senzori multipli", true, 20000));
        listaAlarmeSmart.add(new SmartAlarm("Abode", "Iota", 2022, 350.0, 4.5, 5, "Sistem de alarmă compact cu streaming video", false, 15000));

        for (SmartAlarm alarma : listaAlarmeSmart) {
            System.out.println(alarma);
        }



        ArrayList<SmartPlug> listaPrizeSmart = new ArrayList<>();
        listaPrizeSmart.add(new SmartPlug("TP-Link", "Kasa Smart Plug", 2020, 40.0, 4.5, 10, "Priză smart cu control vocal prin Alexa și Google Assistant", 15000, true));
        listaPrizeSmart.add(new SmartPlug("Amazon", "Smart Plug", 2021, 25.0, 4.7, 6, "Priză smart compatibilă cu Alexa", 10, false));
        listaPrizeSmart.add(new SmartPlug("Belkin", "WeMo Mini", 2022, 35.0, 4.6, 8, "Priză mică și compactă cu aplicație mobilă", 50, true));
        listaPrizeSmart.add(new SmartPlug("Meross", "Smart Plug", 2021, 30.0, 4.4, 7, "Priză smart cu control vocal Alexa și Google", 20, false));
        listaPrizeSmart.add(new SmartPlug("Xiaomi", "Mi Smart Plug", 2020, 20.0, 4.3, 12, "Priză accesibilă cu funcții smart", 40, true));
        listaPrizeSmart.add(new SmartPlug("Eufy", "Smart Plug", 2023, 45.0, 4.8, 5, "Priză smart cu control prin aplicația Eufy", 30, true));
        listaPrizeSmart.add(new SmartPlug("LIFX", "LIFX Smart Plug", 2022, 50.0, 4.6, 9, "Priză smart cu integrare cu LIFX și Google Home", 40, false));
        listaPrizeSmart.add(new SmartPlug("Samsung", "SmartThings Outlet", 2021, 40.0, 4.5, 10, "Priză smart cu automatizare Samsung SmartThings", 30, true));
        listaPrizeSmart.add(new SmartPlug("Kasa", "Smart Plug Mini", 2022, 25.0, 4.7, 11, "Priză smart compactă cu comenzi vocale", 10, false));
        listaPrizeSmart.add(new SmartPlug("Geeni", "Smart Plug", 2021, 30.0, 4.4, 6, "Priză inteligentă cu funcții de programare", 20, true));

        for (SmartPlug priza : listaPrizeSmart) {
            System.out.println(priza);
        }

        // Filtrare:
        System.out.println("\n[FILTRARE] Gadgeturi:");
        for (Gadget gadget : listaGadget) {
            if (gadget.getPrice() > 400.0 && gadget.getRating() > 4.5) {
                System.out.println(gadget);
            }
        }

        System.out.println("\n[FILTRARE] Alarme Smart:");
        for (SmartAlarm alarmasmart : listaAlarmeSmart) {
            if (alarmasmart.getBatteryBackup()>=4000 && alarmasmart.isSmartSensors()) {
                System.out.println(alarmasmart);
            }
        }

        System.out.println("\n[FILTRARE] Prize Smart:");
        for (SmartPlug prizasmart : listaPrizeSmart ) {
            if (prizasmart.getWattage()>=30 && prizasmart.getPrice()>=20) {
                System.out.println(prizasmart);
            }
        }
    }


}