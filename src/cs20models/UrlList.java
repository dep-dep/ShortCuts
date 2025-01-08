/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs20models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Harde
 */
public class UrlList {

    UrlShorcut[] powList;
    int powCount;

    public UrlList() {
        powList = new UrlShorcut[10000];
        powCount = 0;
    }

    public UrlShorcut[] toArray() {
        UrlShorcut[] unBufferedPowList = new UrlShorcut[powCount];
        for (int i = 0; i < powCount; i++) {

            unBufferedPowList[i] = powList[i];
        }

        return unBufferedPowList;
    }

    public void addPow(UrlShorcut pp) {
        if (powCount >= powList.length) {
            return;
        }

        powList[powCount] = pp;
        powCount++;
    }

    public UrlShorcut getPow(String powSerial) {
        for (int i = 0; i < powCount; i++) {
            UrlShorcut pp = powList[i];
            if (pp.getSerial().equals(powSerial)) {
                return pp;
            }
        }
        return null;
    }

    public String getSaveString() {
        String saveStr = "";
        for (int i = 0; i < powCount; i++) {
            saveStr = saveStr + powList[i].getSaveString();
            saveStr = saveStr + "\n";
        }
        return saveStr;
    }
    public void saveToFile (String pathToFile) throws IOException {
    FileWriter fw = new FileWriter(pathToFile);
    PrintWriter pw = new PrintWriter(fw);
    String saveStr = this.getSaveString();
    pw.print(saveStr);
    pw.close();
    }
    
    public void openFromFile(String pathToFile) throws IOException  {
        File f = new File(pathToFile);
        Scanner sc = new Scanner(f);
        
        powList = new UrlShorcut[10000];
        
        powCount = 0;
        while (sc.hasNextLine()){
        String line = sc.nextLine();
        String[] fields = line.split(" ");

//        System.out.println(fields[3]);
        UrlShorcut pp = new UrlShorcut();
        
        pp.setName(fields[0]);
        pp.setRank(fields[1]);
        String serial = (fields[2]);
        pp.setSerial(serial);
//        System.out.println(pp.getGender());
        
        String urlLink = pp.getRank();
        if (serial.equalsIgnoreCase("a")) {
        pp.setaTF(true);
        pp.setaStr(urlLink);
        }
        if (serial.equalsIgnoreCase("b")) {
        pp.setbTF(true);
        pp.setbStr(urlLink);
        }
        if (serial.equalsIgnoreCase("c")) {
        pp.setcTF(true);
        pp.setcStr(urlLink);
        }
        if (serial.equalsIgnoreCase("d")) {
        pp.setdTF(true);
        pp.setdStr(urlLink);
        }
        if (serial.equalsIgnoreCase("e")) {
        pp.seteTF(true);
        pp.seteStr(urlLink);
        }
        if (serial.equalsIgnoreCase("f")) {
        pp.setfTF(true);
        pp.setfStr(urlLink);
        }
        if (serial.equalsIgnoreCase("g")) {
        pp.setgTF(true);
        pp.setgStr(urlLink);
        }
        if (serial.equalsIgnoreCase("h")) {
        pp.sethTF(true);
        pp.sethStr(urlLink);
        }
        if (serial.equalsIgnoreCase("i")) {
        pp.setiTF(true);
        pp.setiStr(urlLink);
        }
        if (serial.equalsIgnoreCase("j")) {
        pp.setjTF(true);
        pp.setjStr(urlLink);
        }
        if (serial.equalsIgnoreCase("k")) {
        pp.setkTF(true);
        pp.setkStr(urlLink);
        }
        if (serial.equalsIgnoreCase("l")) {
        pp.setlTF(true);
        pp.setlStr(urlLink);
        }
        if (serial.equalsIgnoreCase("m")) {
        pp.setmTF(true);
        pp.setmStr(urlLink);
        }
        if (serial.equalsIgnoreCase("n")) {
        pp.setnTF(true);
        pp.setnStr(urlLink);
        }
        if (serial.equalsIgnoreCase("o")) {
        pp.setoTF(true);
        pp.setoStr(urlLink);
        }
        if (serial.equalsIgnoreCase("p")) {
        pp.setpTF(true);
        pp.setpStr(urlLink);
        }
        if (serial.equalsIgnoreCase("q")) {
        pp.setqTF(true);
        pp.setqStr(urlLink);
        }
        if (serial.equalsIgnoreCase("r")) {
        pp.setrTF(true);
        pp.setrStr(urlLink);
        }
        if (serial.equalsIgnoreCase("s")) {
        pp.setsTF(true);
        pp.setsStr(urlLink);
        }
        if (serial.equalsIgnoreCase("t")) {
        pp.settTF(true);
        pp.settStr(urlLink);
        }
        if (serial.equalsIgnoreCase("u")) {
        pp.setuTF(true);
        pp.setvStr(urlLink);
        }
        if (serial.equalsIgnoreCase("v")) {
        pp.setvTF(true);
        pp.setvStr(urlLink);
        }
        if (serial.equalsIgnoreCase("w")) {
        pp.setwTF(true);
        pp.setwStr(urlLink);
        }
        if (serial.equalsIgnoreCase("x")) {
        pp.setxTF(true);
        pp.setxStr(urlLink);
        }
        if (serial.equalsIgnoreCase("y")) {
        pp.setyTF(true);
        pp.setyStr(urlLink);
        }
        if (serial.equalsIgnoreCase("z")) {
        pp.setzTF(true);
        pp.setzStr(urlLink);
        }
        if (serial.equalsIgnoreCase("1")) {
        pp.setOneTF(true);
        pp.setOneStr(urlLink);
        }
        if (serial.equalsIgnoreCase("2")) {
        pp.setTwoTF(true);
        pp.setTwoStr(urlLink);
        }
        if (serial.equalsIgnoreCase("3")) {
        pp.setThreeTF(true);
        pp.setThreeStr(urlLink);
        }
        if (serial.equalsIgnoreCase("4")) {
        pp.setFourTF(true);
        pp.setFourStr(urlLink);
        }
        if (serial.equalsIgnoreCase("5")) {
        pp.setFiveTF(true);
        pp.setFiveStr(urlLink);
        }
        if (serial.equalsIgnoreCase("6")) {
        pp.setSixTF(true);
        pp.setSixStr(urlLink);
        }
        if (serial.equalsIgnoreCase("7")) {
        pp.setSevenTF(true);
        pp.setSevenStr(urlLink);
        }
        if (serial.equalsIgnoreCase("8")) {
        pp.setEightTF(true);
        pp.setEightStr(urlLink);
        }
        if (serial.equalsIgnoreCase("9")) {
        pp.setNineTF(true);
        pp.setNineStr(urlLink);
        }
        if (serial.equalsIgnoreCase("0")) {
        pp.setZeroTF(true);
        pp.setZeroStr(urlLink);
        }
        
        this.addPow(pp);
        }
        
    }
    

}
