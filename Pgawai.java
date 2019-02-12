package com.company;

public class Pgawai {
    protected int tarif = 100000;
        public static void main(String[] args) {
            Supervisor SV = new Supervisor();
            Staff ST = new Staff();
            Gaji GJ = new Gaji();

            GJ.hitungGaji(SV.tarif);
            GJ.hitungGaji(ST.tarif);

        }
    }
