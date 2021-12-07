package com.example.owi;

import android.content.Context;

import com.example.owi.jenis.Anjing;
import com.example.owi.jenis.Hewan;
import com.example.owi.jenis.KuraKura;
import com.example.owi.jenis.Ular;

import java.util.ArrayList;
import java.util.List;

public class DataHewan {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<KuraKura> initDataKuraKura(Context ctx) {
        List<KuraKura> kurakuras = new ArrayList<>();
        kurakuras.add(new KuraKura("Aldabra", "Pulau Aldabra",
                "Kura-kura Aldabra mempunyai karapas berwarna coklat kehitam-hitaman dengan dome yang tinggi. Memiliki kaki yang besar dan kekar untuk menopang tubuhnya yang sangat berat. Kura-kura ini mempunyai leher yang sangat panjang digunakan untuk meraih cabang dan ranting pohon sampai ketinggian 1 meter lebih dari tanah.", R.drawable.aldabra));
        kurakuras.add(new KuraKura("Asian", "Asia",
                "Asian kura-kura hutan ( Manouria emys ), juga dikenal umum sebagai kura-kura coklat Asia , adalah spesies dari kura-kura di keluarga Testudinidae . Spesies ini endemik untuk Asia Tenggara . Hal ini diyakini sebagai salah satu kura-kura hidup yang paling primitif, berdasarkan studi molekuler dan morfologis.", R.drawable.asian));
        kurakuras.add(new KuraKura("Indian", "Indian",
                "kura-kura ini memiliki ciri khas pada tempurungnya yang membentuk pola seperti bintang", R.drawable.indian));
        return kurakuras;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        return anjings;
    }

    private static List<Ular> iniDataUlar(Context ctx) {
        List<Ular> Ulars = new ArrayList<>();
        Ulars.add(new Ular("Piton", "Asia dan Eropa", "adalah sebutan umum untuk semua jenis ular pembelit yang diklasifikasikan sebagai familia Pythonidae.", R.drawable.piton));
        Ulars.add(new Ular("Mamba", "Afrika", "adalah sebutan umum untuk empat spesies ular berbisa mematikan yang semuanya diklasifikasikan sebagai genus Dendroaspis.", R.drawable.mamba));
        Ulars.add(new Ular("Cobra", "Asia", "adalah ular berbisa beberapa genus dari keluarga Elapidae.", R.drawable.cobra)
        );;
        return Ulars;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKuraKura(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(iniDataUlar(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }
}
