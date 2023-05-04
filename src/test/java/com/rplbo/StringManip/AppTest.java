package com.rplbo.StringManip;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testSoal1()
    {
        StringGuided sg = new StringGuided("A man, a plan, a canoe, pasta, heros, rajahs, a coloratura, maps, snipe, percale,\n" +
                "macaroni, a gag, a banana bag, a tan, a tag, a banana bag again (or a camel), a crepe,\n" +
                "pins, Spam, a rut, a Rolo, cash, a jar, sore hats, a peon, a canal – Panama!");
        assertTrue(sg.cekPalindrom());
    }

    @Test
    public void testSoal2(){
        StringGuided sg2 = new StringGuided(" sAyA mAkaN NASI kUNinG 99 haRI");
        assertEquals("Saya Makan Nasi Kuning 99 Hari",sg2.ubahHurufBesarAwal());
    }

    @Test
    public void testSoal3(){
        StringGuided sg3 = new StringGuided(" sAyA beLI NasI GoRENG tanpa NASI");
        assertEquals("sAyA beLI GoRENG tanpa",sg3.hapusKataDalamString("nasi"));
    }

    @Test
    public void testSoal4(){
        StringGuided sg4 = new StringGuided("Hari Ini Mau makan Apa ?");
        assertEquals("? Apa makan Mau Ini Hari",sg4.balikKata());
    }
}
