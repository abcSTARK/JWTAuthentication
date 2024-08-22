package com.org.JWTsecurity;

import java.util.*;

public class PRPass {

    private static final String[] sample = {
            "a",
            "b",
            "c",
            "d",
            "e",
            "f",
            "g",
            "h",
            "i",
            "j",
            "k",
            "l",
            "m",
            "n",
            "o",
            "p",
            "q",
            "r",
            "s",
            "t",
            "u",
            "v",
            "w",
            "x",
            "y",
            "z",
            "A",
            "B",
            "C",
            "D",
            "E",
            "F",
            "G",
            "H",
            "I",
            "J",
            "K",
            "L",
            "M",
            "N",
            "O",
            "P",
            "Q",
            "R",
            "S",
            "T",
            "U",
            "V",
            "W",
            "X",
            "Y",
            "Z",
            "0",
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "!",
            "@",
            "#",
            "$",
            "%",
            "^",
            "&",
            "*",
            "$",
            "?"
    };

    private static Map<String, Object> data = loadCipherData(); // Load data from cipher.json

    private static Map<String, Object> loadCipherData() {
        // Implement loading data from cipher.json
        // For simplicity, I'll just return an empty map
        Map<String, String> map0 = new HashMap<>();
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        Map<String, String> map3 = new HashMap<>();
        Map<String, String> map4 = new HashMap<>();

        map0.put("a", "87yhj8ik");
        map0.put("b", "4eserds");
        map0.put("c", "54er");
        map0.put("d", "iuhj9ij");
        map0.put("e", "ui87yhj");
        map0.put("f", "87ygftyu");
        map0.put("g", "oijkokmn");
        map0.put("h", "9ijiok");
        map0.put("i", "6yh");
        map0.put("j", "7ujh");
        map0.put("k", "4rfr5rg");
        map0.put("l", "7uji");
        map0.put("m", "i9o0p");
        map0.put("n", "ujjuik");
        map0.put("o", "09io0");
        map0.put("p", "okmoplk");
        map0.put("q", "76yu7uj");
        map0.put("r", "y7ujju78");
        map0.put("s", "98ikj");
        map0.put("t", "uio8ikl");
        map0.put("u", "7ui88io");
        map0.put("v", "8iko0");
        map0.put("w", "4r5t6");
        map0.put("x", "8i9u");
        map0.put("y", "t6y7yg");
        map0.put("z", "78uhj");
        map0.put("A", "$ES$RFER");
        map0.put("B", "%TG%^YTTYHG");
        map0.put("C", "&^TGH");
        map0.put("D", "UHBUIKMNB");
        map0.put("E", "YHNMYUHJ");
        map0.put("F", "YGVYUGH");
        map0.put("G", "*&YHJIK");
        map0.put("H", "UHBIJNHJ");
        map0.put("I", "&*(*UHGHJ");
        map0.put("J", "*IKJ");
        map0.put("K", "YHNHUHM");
        map0.put("L", "YGVB");
        map0.put("M", "CFTGBHUJM");
        map0.put("N", "YGVYHNJI");
        map0.put("O", "(*UI(");
        map0.put("P", "YHNYUJH");
        map0.put("Q", "&^TGHU&J");
        map0.put("R", "^YH^&UYJ");
        map0.put("S", "(*&UJMNB");
        map0.put("T", "%^&^YH");
        map0.put("U", "%TGHJU&");
        map0.put("V", "YHNJI");
        map0.put("W", "TGBHUJMKO");
        map0.put("X", "&UJ*UH");
        map0.put("Y", "&U(IJN");
        map0.put("Z", "WERRDXXCV");
        map1.put("a", "76tgh7uj");
        map1.put("b", "3wawesa");
        map1.put("c", "43we");
        map1.put("d", "uygh8uh");
        map1.put("e", "yu76tgh");
        map1.put("f", "76tfdrty");
        map1.put("g", "iuhjijnb");
        map1.put("h", "8uhuij");
        map1.put("i", "5tg");
        map1.put("j", "6yhg");
        map1.put("k", "3ede4ef");
        map1.put("l", "6yhu");
        map1.put("m", "u8i9o");
        map1.put("n", "yhhyuj");
        map1.put("o", "98ui9");
        map1.put("p", "ijniokj");
        map1.put("q", "65ty6yh");
        map1.put("r", "t6yhhy67");
        map1.put("s", "87ujh");
        map1.put("t", "yui7ujk");
        map1.put("u", "6yu77ui");
        map1.put("v", "7uji9");
        map1.put("w", "3e4r5");
        map1.put("x", "7i8y");
        map1.put("y", "r5t6tf");
        map1.put("z", "67ygh");
        map1.put("A", "#WA#EDWE");
        map1.put("B", "$RF$%TRRTGF");
        map1.put("C", "^%RFG");
        map1.put("D", "YGVYUJNBV");
        map1.put("E", "TGBNTYGH");
        map1.put("F", "TFCTYFG");
        map1.put("G", "&^TGHUJ");
        map1.put("H", "YGVUHBGH");
        map1.put("I", "^&*&YGFGH");
        map1.put("J", "&UJH");
        map1.put("K", "TGBGYGN");
        map1.put("L", "TFCV");
        map1.put("M", "XDRFVGYHN");
        map1.put("N", "TFCTGBHU");
        map1.put("O", "*&YU*");
        map1.put("P", "TGBTYHG");
        map1.put("Q", "^%RFGY^H");
        map1.put("R", "%TG%^YTH");
        map1.put("S", "*&^YHNBV");
        map1.put("T", "$%^%TG");
        map1.put("U", "$RFGHY^");
        map1.put("V", "TGBHU");
        map1.put("W", "RFVGYHNJI");
        map1.put("X", "^YH&YG");
        map1.put("Y", "^Y*UHB");
        map1.put("Z", "QWEESZZXC");
        map2.put("a", "98ujk9ol");
        map2.put("b", "5rdrtf");
        map2.put("c", "65rt");
        map2.put("d", "oijk0ok");
        map2.put("e", "io98ujk");
        map2.put("f", "98uhgyui");
        map2.put("g", "poklpl,m");
        map2.put("h", "0okopl");
        map2.put("i", "7uj");
        map2.put("j", "8ikj");
        map2.put("k", "5tgt6th");
        map2.put("l", "8iko");
        map2.put("m", "o0p-[");
        map2.put("n", "ikkiol");
        map2.put("o", "-0op-");
        map2.put("p", "pl,p[;l");
        map2.put("q", "87ui8ik");
        map2.put("r", "u8ikki89");
        map2.put("s", "09olk");
        map2.put("t", "iop9ol;");
        map2.put("u", "8io99op");
        map2.put("v", "9olp-");
        map2.put("w", "5t6y7");
        map2.put("x", "9o0i");
        map2.put("y", "y7u8uh");
        map2.put("z", "89ijk");
        map2.put("A", "%RD%TGRT");
        map2.put("B", "^YH^&UYYUJH");
        map2.put("C", "*&YHJ");
        map2.put("D", "IJNIOL<MN");
        map2.put("E", "UJM<UIJK");
        map2.put("F", "UHBUIHJ");
        map2.put("G", "(*UJKOL");
        map2.put("H", "IJNOKMJK");
        map2.put("I", "*()(IJHJK");
        map2.put("J", "(OLK");
        map2.put("K", "UJMJIJ<");
        map2.put("L", "UHBN");
        map2.put("M", "VGYHNJIK<");
        map2.put("N", "UHBUJMKO");
        map2.put("O", ")(IO)");
        map2.put("P", "UJMUIKJ");
        map2.put("Q", "*&YHJI*K");
        map2.put("R", "&UJ&*IUK");
        map2.put("S", ")(*IK<MN");
        map2.put("T", "^&*&UJ");
        map2.put("U", "^YHJKI*");
        map2.put("V", "UJMKO");
        map2.put("W", "YHNJIK<LP");
        map2.put("X", "*IK(IJ");
        map2.put("Y", "*I)OKM");
        map2.put("Z", "ERTTFCCVB");
        map3.put("a", "76tgh7uj");
        map3.put("b", "3wawesa");
        map3.put("c", "43we");
        map3.put("d", "uygh8uh");
        map3.put("e", "yu76tgh");
        map3.put("f", "76tfdrty");
        map3.put("g", "iuhjijnb");
        map3.put("h", "8uhuij");
        map3.put("i", "5tg");
        map3.put("j", "6yhg");
        map3.put("k", "3ede4ef");
        map3.put("l", "6yhu");
        map3.put("m", "u8i9o");
        map3.put("n", "yhhyuj");
        map3.put("o", "98ui9");
        map3.put("p", "ijniokj");
        map3.put("q", "65ty6yh");
        map3.put("r", "t6yhhy67");
        map3.put("s", "87ujh");
        map3.put("t", "yui7ujk");
        map3.put("u", "6yu77ui");
        map3.put("v", "7uji9");
        map3.put("w", "3e4r5");
        map3.put("x", "7i8y");
        map3.put("y", "r5t6tf");
        map3.put("z", "67ygh");
        map3.put("A", "#WA#EDWE");
        map3.put("B", "$RF$%TRRTGF");
        map3.put("C", "^%RFG");
        map3.put("D", "YGVYUJNBV");
        map3.put("E", "TGBNTYGH");
        map3.put("F", "TFCTYFG");
        map3.put("G", "&^TGHUJ");
        map3.put("H", "YGVUHBGH");
        map3.put("I", "^&*&YGFGH");
        map3.put("J", "&UJH");
        map3.put("K", "TGBGYGN");
        map3.put("L", "TFCV");
        map3.put("M", "XDRFVGYHN");
        map3.put("N", "TFCTGBHU");
        map3.put("O", "*&YU*");
        map3.put("P", "TGBTYHG");
        map3.put("Q", "^%RFGY^H");
        map3.put("R", "%TG%^YTH");
        map3.put("S", "*&^YHNBV");
        map3.put("T", "$%^%TG");
        map3.put("U", "$RFGHY^");
        map3.put("V", "TGBHU");
        map3.put("W", "RFVGYHNJI");
        map3.put("X", "^YH&YG");
        map3.put("Y", "^Y*UHB");
        map3.put("Z", "QWEESZZXC");
        map4.put("a", "87yhj8ik");
        map4.put("b", "4eserds");
        map4.put("c", "54er");
        map4.put("d", "iuhj9ij");
        map4.put("e", "ui87yhj");
        map4.put("f", "87ygftyu");
        map4.put("g", "oijkokmn");
        map4.put("h", "9ijiok");
        map4.put("i", "6yh");
        map4.put("j", "7ujh");
        map4.put("k", "4rfr5rg");
        map4.put("l", "7uji");
        map4.put("m", "i9o0p");
        map4.put("n", "ujjuik");
        map4.put("o", "09io0");
        map4.put("p", "okmoplk");
        map4.put("q", "76yu7uj");
        map4.put("r", "y7ujju78");
        map4.put("s", "98ikj");
        map4.put("t", "uio8ikl");
        map4.put("u", "7ui88io");
        map4.put("v", "8iko0");
        map4.put("w", "4r5t6");
        map4.put("x", "8i9u");
        map4.put("y", "t6y7yg");
        map4.put("z", "78uhj");
        map4.put("A", "$ES$RFER");
        map4.put("B", "%TG%^YTTYHG");
        map4.put("C", "&^TGH");
        map4.put("D", "UHBUIKMNB");
        map4.put("E", "YHNMYUHJ");
        map4.put("F", "YGVYUGH");
        map4.put("G", "*&YHJIK");
        map4.put("H", "UHBIJNHJ");
        map4.put("I", "&*(*UHGHJ");
        map4.put("J", "*IKJ");
        map4.put("K", "YHNhuHM");
        map4.put("L", "YGVB");
        map4.put("M", "CFTGBHUJM");
        map4.put("N", "YGVYHNJI");
        map4.put("O", "(*UI(");
        map4.put("P", "YHNYUJH");
        map4.put("Q", "&^TGHU&J");
        map4.put("R", "^YH^&UYJ");
        map4.put("S", "(*&UJMNB");
        map4.put("T", "%^&^YH");
        map4.put("U", "%TGHJU&");
        map4.put("V", "YHNJI");
        map4.put("W", "TGBHUJMKO");
        map4.put("X", "&UJ*UH");
        map4.put("Y", "&U(IJN");
        map4.put("Z", "WERRDXXCV");




        // List for "sample"
        List<String> sample = Arrays.asList(
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7",
                "8", "9", ")", "!", "@", "#", "$", "%", "^", "&", "*", "(", "{", "[", ":", ";", ">", ".", "<", ","
        );

        //List<Object> allMapsAndSample = new ArrayList<>();
        Map<String,Object> allMapsAndSample=new HashMap<>();

        allMapsAndSample.put("0",map0);
        allMapsAndSample.put("1",map1);
        allMapsAndSample.put("2",map2);
        allMapsAndSample.put("3",map3);
        allMapsAndSample.put("4",map4);
        allMapsAndSample.put("sample",sample);
        return allMapsAndSample;
    }

//const wrap = (string) => {
//        let ans = [];
//        for (let i = 0; i < string.length; i += 12) {
//            let a = string.slice(i, i + 12);
//            ans.push(a);
//        }
//        console.log("wrap ", ans);
//        return ans;
//    };

    private static List<String> wrap(String string) {
        System.out.println("String "+string);
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < string.length(); i += 12) {
            ans.add(string.substring(i, Math.min(i+12, string.length())));
        }
        System.out.println("wrap"+ans);
        return ans;
    }

    private static String add(String a, String b) {
        if (a == null || a.isEmpty()) {
            return b;
        }
        System.out.println("a--"+a);
        System.out.println("b--"+b);


        String ans = "";
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                ans += sample[((int) a.charAt(i) + (int)b.charAt(i)) % 72];
            }
        } else {
            for (int i = 0; i < b.length(); i++) {
                ans += sample[((int)a.charAt(i) + (int)b.charAt(i)) % 72];
            }
            ans += a.substring(b.length(),a.length());
        }
        return ans;
    }

    public static String generatePass(String initPass, String lucky) {
        int luck = Integer.parseInt(lucky);
        int luck1 = luck % 5;
        String luck1Str = String.valueOf(luck1);
        String ans = "";
        System.out.println(luck+ "    "+lucky+"    "+luck1Str);
        for (int i=0; i<initPass.length(); i++) {
            if (Character.isLetter(initPass.charAt(i))) {
                Map<String, String> temp = (Map<String, String>) data.get(luck1Str);
                String a = ""+initPass.charAt(i);
                System.out.println(a+"      "+temp.get(a));
                ans += temp.get(a);
            } else {
                ans += initPass.charAt(i);
            }
        }
        System.out.println("generate-ans"+ans);
        List<String> ansList = wrap(ans.toString());
        luck += 100;
        luck %= 72;
        String ans1 = sample[luck]; //Single Character
//        System.out.println(sample.length);
        for (int i = 1; i < 12; i++) {
            //System.out.println(((int)(ans1.charAt(i-1))));
            //System.out.println(ans1);
            ans1 += sample[ ((int)(ans1.charAt(i-1))) % 72];
        }

        for (String s : ansList) {
            ans1 = add(ans1, s);
        }

        System.out.println(ans1);
        luck += initPass.length() + ansList.size() * initPass.length();
        luck %= 72;
        String char1 = (sample[(luck % 26) + 26] + sample[((luck + 111) % 10) + 52]);
        String char3 = (sample[((luck + 222) % 10) + 62] + sample[(luck + 300) % 26]);
        System.out.println(char1+"     "+char3);
        luck = (initPass.length() * luck) % ans1.length();

        ans1 = ans1.substring(0, luck) + char1 + ans1.substring(luck, ans1.length());

        luck += initPass.length() + ansList.size();
        luck %= ans1.length();

        ans1 = ans1.substring(0, luck) + char3 + ans1.substring(luck, ans1.length());
        return ans1;
    }

    public static void main(String[] args) {
        String initPass = "initPass";
        String lucky = "123";
        String generatedPass = generatePass(initPass, lucky);
        System.out.println(generatedPass);
    }
}
