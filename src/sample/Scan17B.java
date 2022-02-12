package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan17B{
    private final int _a = 0;
    private final int _b = 1;
    private final int _c = 2;
    private final int _d = 3;
    private final int _e = 4;
    private final int _f = 5;
    private final int _g = 6;
    private final int _h = 7;
    private final int _i = 8;
    private final int _j = 9;
    private final int _k = 10;
    private final int _l = 11;
    private final int _m = 12;
    private final int _n = 13;
    private final int _o = 14;
    private final int _p = 15;
    private final int _q = 16;
    private final int _r = 17;
    private final int _s = 18;
    private final int _t = 19;
    private final int _u = 20;
    private final int _v = 21;
    private final int _w = 22;
    private final int _x = 23;
    private final int _y = 24;
    private final int _z = 25;

public Scan17B(){
System.err.println("new Scan17B");


Scanner b_be = new Scanner(SubstitutionCracker2.cipher);
while(b_be.hasNext()){
String next = b_be.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{second},
new int[]{_e})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_be");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_be.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_be.close();
Scanner b_but = new Scanner(SubstitutionCracker2.cipher);
while(b_but.hasNext()){
String next = b_but.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_u,_t})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_but");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_but.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_but.close();
Scanner b_by = new Scanner(SubstitutionCracker2.cipher);
while(b_by.hasNext()){
String next = b_by.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{second},
new int[]{_y})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_by");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_by.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_by.close();
Scanner b_been = new Scanner(SubstitutionCracker2.cipher);
while(b_been.hasNext()){
String next = b_been.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_e,_n})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_been");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_been.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_been.close();
Scanner b_before = new Scanner(SubstitutionCracker2.cipher);
while(b_before.hasNext()){
String next = b_before.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_e,_f,_o,_r,_e})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_before");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_before.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_before.close();
Scanner b_about = new Scanner(SubstitutionCracker2.cipher);
while(b_about.hasNext()){
String next = b_about.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_a,_o,_u,_t})){
SubstitutionCracker2.key[_b] = second.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_about");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_about.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_about.close();
Scanner b_because = new Scanner(SubstitutionCracker2.cipher);
while(b_because.hasNext()){
String next = b_because.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_e,_c,_a,_u,_s,_e})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_because");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_because.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_because.close();
Scanner b_being = new Scanner(SubstitutionCracker2.cipher);
while(b_being.hasNext()){
String next = b_being.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_e,_i,_n,_g})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_being");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_being.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_being.close();
Scanner b_brought = new Scanner(SubstitutionCracker2.cipher);
while(b_brought.hasNext()){
String next = b_brought.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_r,_o,_u,_g,_h,_t})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_brought");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_brought.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_brought.close();
Scanner b_began = new Scanner(SubstitutionCracker2.cipher);
while(b_began.hasNext()){
String next = b_began.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_e,_g,_a,_n})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_began");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_began.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_began.close();
Scanner b_both = new Scanner(SubstitutionCracker2.cipher);
while(b_both.hasNext()){
String next = b_both.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_t,_h})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_both");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_both.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_both.close();
Scanner b_bring = new Scanner(SubstitutionCracker2.cipher);
while(b_bring.hasNext()){
String next = b_bring.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_r,_i,_n,_g})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_bring");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_bring.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_bring.close();
Scanner b_between = new Scanner(SubstitutionCracker2.cipher);
while(b_between.hasNext()){
String next = b_between.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_e,_t,_w,_e,_e,_n})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_between");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_between.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_between.close();
Scanner b_behold = new Scanner(SubstitutionCracker2.cipher);
while(b_behold.hasNext()){
String next = b_behold.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_e,_h,_o,_l,_d})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_behold");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_behold.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_behold.close();
Scanner b_behind = new Scanner(SubstitutionCracker2.cipher);
while(b_behind.hasNext()){
String next = b_behind.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_e,_h,_i,_n,_d})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_behind");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_behind.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_behind.close();
Scanner b_better = new Scanner(SubstitutionCracker2.cipher);
while(b_better.hasNext()){
String next = b_better.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_e,_t,_t,_e,_r})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_better");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_better.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_better.close();
Scanner b_become = new Scanner(SubstitutionCracker2.cipher);
while(b_become.hasNext()){
String next = b_become.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_e,_c,_o,_m,_e})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_become");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_become.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_become.close();
Scanner b_able = new Scanner(SubstitutionCracker2.cipher);
while(b_able.hasNext()){
String next = b_able.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_a,_l,_e})){
SubstitutionCracker2.key[_b] = second.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_able");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_able.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_able.close();
Scanner b_became = new Scanner(SubstitutionCracker2.cipher);
while(b_became.hasNext()){
String next = b_became.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_e,_c,_a,_m,_e})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_became");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_became.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_became.close();
Scanner b_remember = new Scanner(SubstitutionCracker2.cipher);
while(b_remember.hasNext()){
String next = b_remember.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh,eighth},
new int[]{_r,_e,_m,_e,_m,_e,_r})){
SubstitutionCracker2.key[_b] = sixth.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_remember");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_remember.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_remember.close();
Scanner b_best = new Scanner(SubstitutionCracker2.cipher);
while(b_best.hasNext()){
String next = b_best.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_s,_t})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_best");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_best.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_best.close();
Scanner b_blood = new Scanner(SubstitutionCracker2.cipher);
while(b_blood.hasNext()){
String next = b_blood.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_l,_o,_o,_d})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_blood");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_blood.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_blood.close();
Scanner b_number = new Scanner(SubstitutionCracker2.cipher);
while(b_number.hasNext()){
String next = b_number.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_n,_u,_m,_e,_r})){
SubstitutionCracker2.key[_b] = fourth.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_number");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_number.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_number.close();
Scanner b_beyond = new Scanner(SubstitutionCracker2.cipher);
while(b_beyond.hasNext()){
String next = b_beyond.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_e,_y,_o,_n,_d})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_beyond");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_beyond.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_beyond.close();
Scanner b_blessed = new Scanner(SubstitutionCracker2.cipher);
while(b_blessed.hasNext()){
String next = b_blessed.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_l,_e,_s,_s,_e,_d})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_blessed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_blessed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_blessed.close();
Scanner b_beside = new Scanner(SubstitutionCracker2.cipher);
while(b_beside.hasNext()){
String next = b_beside.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_e,_s,_i,_d,_e})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_beside");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_beside.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_beside.close();
Scanner b_brother = new Scanner(SubstitutionCracker2.cipher);
while(b_brother.hasNext()){
String next = b_brother.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_r,_o,_t,_h,_e,_r})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_brother");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_brother.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_brother.close();
Scanner b_battle = new Scanner(SubstitutionCracker2.cipher);
while(b_battle.hasNext()){
String next = b_battle.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_a,_t,_t,_l,_e})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_battle");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_battle.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_battle.close();
Scanner b_big = new Scanner(SubstitutionCracker2.cipher);
while(b_big.hasNext()){
String next = b_big.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_i,_g})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_big");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_big.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_big.close();
Scanner b_built = new Scanner(SubstitutionCracker2.cipher);
while(b_built.hasNext()){
String next = b_built.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_u,_i,_l,_t})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_built");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_built.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_built.close();
Scanner b_table = new Scanner(SubstitutionCracker2.cipher);
while(b_table.hasNext()){
String next = b_table.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_t,_a,_l,_e})){
SubstitutionCracker2.key[_b] = third.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_table");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_table.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_table.close();
Scanner b_body = new Scanner(SubstitutionCracker2.cipher);
while(b_body.hasNext()){
String next = b_body.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_d,_y})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_body");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_body.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_body.close();
Scanner b_boy = new Scanner(SubstitutionCracker2.cipher);
while(b_boy.hasNext()){
String next = b_boy.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_o,_y})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_boy");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_boy.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_boy.close();
Scanner b_brethren = new Scanner(SubstitutionCracker2.cipher);
while(b_brethren.hasNext()){
String next = b_brethren.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh,eighth},
new int[]{_r,_e,_t,_h,_r,_e,_n})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_brethren");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_brethren.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_brethren.close();
Scanner b_bear = new Scanner(SubstitutionCracker2.cipher);
while(b_bear.hasNext()){
String next = b_bear.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_a,_r})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_bear");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_bear.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_bear.close();
Scanner b_bad = new Scanner(SubstitutionCracker2.cipher);
while(b_bad.hasNext()){
String next = b_bad.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_a,_d})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_bad");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_bad.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_bad.close();
Scanner b_remembered = new Scanner(SubstitutionCracker2.cipher);
while(b_remembered.hasNext()){
String next = b_remembered.next();
if (next.length()==10){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));
String ninth = String.valueOf(next.charAt(8));
String tenth = String.valueOf(next.charAt(9));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh,eighth,ninth,tenth},
new int[]{_r,_e,_m,_e,_m,_e,_r,_e,_d})){
SubstitutionCracker2.key[_b] = sixth.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_remembered");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_remembered.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_remembered.close();
Scanner b_beginning = new Scanner(SubstitutionCracker2.cipher);
while(b_beginning.hasNext()){
String next = b_beginning.next();
if (next.length()==9){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));
String ninth = String.valueOf(next.charAt(8));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_g,_i,_n,_n,_i,_n,_g})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_beginning");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_beginning.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_beginning.close();
Scanner b_beautiful = new Scanner(SubstitutionCracker2.cipher);
while(b_beautiful.hasNext()){
String next = b_beautiful.next();
if (next.length()==9){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));
String ninth = String.valueOf(next.charAt(8));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_a,_u,_t,_i,_f,_u,_l})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_beautiful");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_beautiful.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_beautiful.close();
Scanner b_bread = new Scanner(SubstitutionCracker2.cipher);
while(b_bread.hasNext()){
String next = b_bread.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_r,_e,_a,_d})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_bread");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_bread.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_bread.close();
Scanner b_begot = new Scanner(SubstitutionCracker2.cipher);
while(b_begot.hasNext()){
String next = b_begot.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_e,_g,_o,_t})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_begot");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_begot.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_begot.close();
Scanner b_inhabitants = new Scanner(SubstitutionCracker2.cipher);
while(b_inhabitants.hasNext()){
String next = b_inhabitants.next();
if (next.length()==11){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));
String ninth = String.valueOf(next.charAt(8));
String tenth = String.valueOf(next.charAt(9));
String eleventh = String.valueOf(next.charAt(10));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth,seventh,eighth,ninth,tenth,eleventh},
new int[]{_i,_n,_h,_a,_i,_t,_a,_n,_t,_s})){
SubstitutionCracker2.key[_b] = fifth.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_inhabitants");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_inhabitants.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_inhabitants.close();
Scanner b_tribe = new Scanner(SubstitutionCracker2.cipher);
while(b_tribe.hasNext()){
String next = b_tribe.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_t,_r,_i,_e})){
SubstitutionCracker2.key[_b] = fourth.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_tribe");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_tribe.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_tribe.close();
Scanner b_terrible = new Scanner(SubstitutionCracker2.cipher);
while(b_terrible.hasNext()){
String next = b_terrible.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh,eighth},
new int[]{_t,_e,_r,_r,_i,_l,_e})){
SubstitutionCracker2.key[_b] = sixth.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_terrible");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_terrible.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_terrible.close();
Scanner b_build = new Scanner(SubstitutionCracker2.cipher);
while(b_build.hasNext()){
String next = b_build.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_u,_i,_l,_d})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_build");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_build.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_build.close();
Scanner b_born = new Scanner(SubstitutionCracker2.cipher);
while(b_born.hasNext()){
String next = b_born.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_r,_n})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_born");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_born.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_born.close();
Scanner b_blue = new Scanner(SubstitutionCracker2.cipher);
while(b_blue.hasNext()){
String next = b_blue.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_l,_u,_e})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_blue");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_blue.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_blue.close();
Scanner b_bless = new Scanner(SubstitutionCracker2.cipher);
while(b_bless.hasNext()){
String next = b_bless.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_l,_e,_s,_s})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_bless");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_bless.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_bless.close();
Scanner b_tabernacle = new Scanner(SubstitutionCracker2.cipher);
while(b_tabernacle.hasNext()){
String next = b_tabernacle.next();
if (next.length()==10){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));
String ninth = String.valueOf(next.charAt(8));
String tenth = String.valueOf(next.charAt(9));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh,eighth,ninth,tenth},
new int[]{_t,_a,_e,_r,_n,_a,_c,_l,_e})){
SubstitutionCracker2.key[_b] = third.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_tabernacle");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_tabernacle.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_tabernacle.close();
Scanner b_possible = new Scanner(SubstitutionCracker2.cipher);
while(b_possible.hasNext()){
String next = b_possible.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh,eighth},
new int[]{_p,_o,_s,_s,_i,_l,_e})){
SubstitutionCracker2.key[_b] = sixth.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_possible");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_possible.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_possible.close();
Scanner b_begin = new Scanner(SubstitutionCracker2.cipher);
while(b_begin.hasNext()){
String next = b_begin.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_e,_g,_i,_n})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_begin");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_begin.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_begin.close();
Scanner b_maybe = new Scanner(SubstitutionCracker2.cipher);
while(b_maybe.hasNext()){
String next = b_maybe.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_m,_a,_y,_e})){
SubstitutionCracker2.key[_b] = fourth.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_maybe");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_maybe.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_maybe.close();
Scanner b_boat = new Scanner(SubstitutionCracker2.cipher);
while(b_boat.hasNext()){
String next = b_boat.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_a,_t})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_boat");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_boat.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_boat.close();
Scanner b_business = new Scanner(SubstitutionCracker2.cipher);
while(b_business.hasNext()){
String next = b_business.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh,eighth},
new int[]{_u,_s,_i,_n,_e,_s,_s})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_business");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_business.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_business.close();
Scanner b_burnt = new Scanner(SubstitutionCracker2.cipher);
while(b_burnt.hasNext()){
String next = b_burnt.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_u,_r,_n,_t})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_burnt");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_burnt.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_burnt.close();
Scanner b_bound = new Scanner(SubstitutionCracker2.cipher);
while(b_bound.hasNext()){
String next = b_bound.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_u,_n,_d})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_bound");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_bound.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_bound.close();
Scanner b_husband = new Scanner(SubstitutionCracker2.cipher);
while(b_husband.hasNext()){
String next = b_husband.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_h,_u,_s,_a,_n,_d})){
SubstitutionCracker2.key[_b] = fourth.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_husband");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_husband.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_husband.close();
Scanner b_bed = new Scanner(SubstitutionCracker2.cipher);
while(b_bed.hasNext()){
String next = b_bed.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_e,_d})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_bed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_bed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_bed.close();
Scanner b_besides = new Scanner(SubstitutionCracker2.cipher);
while(b_besides.hasNext()){
String next = b_besides.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_e,_s,_i,_d,_e,_s})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_besides");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_besides.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_besides.close();
Scanner b_burning = new Scanner(SubstitutionCracker2.cipher);
while(b_burning.hasNext()){
String next = b_burning.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_u,_r,_n,_i,_n,_g})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_burning");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_burning.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_burning.close();
Scanner b_public = new Scanner(SubstitutionCracker2.cipher);
while(b_public.hasNext()){
String next = b_public.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_p,_u,_l,_i,_c})){
SubstitutionCracker2.key[_b] = third.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_public");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_public.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_public.close();
Scanner b_bright = new Scanner(SubstitutionCracker2.cipher);
while(b_bright.hasNext()){
String next = b_bright.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_r,_i,_g,_h,_t})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_bright");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_bright.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_bright.close();
Scanner b_probably = new Scanner(SubstitutionCracker2.cipher);
while(b_probably.hasNext()){
String next = b_probably.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(fourth.equalsIgnoreCase(sixth)){
if(massCalc_notAnyOther(new String[]{first,second,third,fifth,seventh,eighth},
new int[]{_p,_r,_o,_a,_l,_y})){
SubstitutionCracker2.key[_b] = fourth.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_probably");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_probably.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_probably.close();
Scanner b_bore = new Scanner(SubstitutionCracker2.cipher);
while(b_bore.hasNext()){
String next = b_bore.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_r,_e})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_bore");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_bore.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_bore.close();
Scanner b_impossible = new Scanner(SubstitutionCracker2.cipher);
while(b_impossible.hasNext()){
String next = b_impossible.next();
if (next.length()==10){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));
String ninth = String.valueOf(next.charAt(8));
String tenth = String.valueOf(next.charAt(9));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth,seventh,ninth,tenth},
new int[]{_i,_m,_p,_o,_s,_s,_i,_l,_e})){
SubstitutionCracker2.key[_b] = eighth.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_impossible");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_impossible.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_impossible.close();
Scanner b_buy = new Scanner(SubstitutionCracker2.cipher);
while(b_buy.hasNext()){
String next = b_buy.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_u,_y})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_buy");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_buy.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_buy.close();
Scanner b_herbert = new Scanner(SubstitutionCracker2.cipher);
while(b_herbert.hasNext()){
String next = b_herbert.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_h,_e,_r,_e,_r,_t})){
SubstitutionCracker2.key[_b] = fourth.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_herbert");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_herbert.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_herbert.close();
Scanner b_beasts = new Scanner(SubstitutionCracker2.cipher);
while(b_beasts.hasNext()){
String next = b_beasts.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_e,_a,_s,_t,_s})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_beasts");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_beasts.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_beasts.close();
Scanner b_burn = new Scanner(SubstitutionCracker2.cipher);
while(b_burn.hasNext()){
String next = b_burn.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_u,_r,_n})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_burn");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_burn.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_burn.close();
Scanner b_doubt = new Scanner(SubstitutionCracker2.cipher);
while(b_doubt.hasNext()){
String next = b_doubt.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_d,_o,_u,_t})){
SubstitutionCracker2.key[_b] = fourth.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_doubt");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_doubt.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_doubt.close();
Scanner b_petersburg = new Scanner(SubstitutionCracker2.cipher);
while(b_petersburg.hasNext()){
String next = b_petersburg.next();
if (next.length()==10){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));
String ninth = String.valueOf(next.charAt(8));
String tenth = String.valueOf(next.charAt(9));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth,eighth,ninth,tenth},
new int[]{_p,_e,_t,_e,_r,_s,_u,_r,_g})){
SubstitutionCracker2.key[_b] = seventh.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_petersburg");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_petersburg.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_petersburg.close();
Scanner b_begun = new Scanner(SubstitutionCracker2.cipher);
while(b_begun.hasNext()){
String next = b_begun.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_e,_g,_u,_n})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_begun");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_begun.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_begun.close();
Scanner b_beseech = new Scanner(SubstitutionCracker2.cipher);
while(b_beseech.hasNext()){
String next = b_beseech.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_e,_s,_e,_e,_c,_h})){
SubstitutionCracker2.key[_b] = first.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_beseech");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_beseech.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasB){
b_beseech.close();
Scanner b_unable = new Scanner(SubstitutionCracker2.cipher);
while(b_unable.hasNext()){
String next = b_unable.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_u,_n,_a,_l,_e})){
SubstitutionCracker2.key[_b] = fourth.toLowerCase();
SubstitutionCracker2.hasB=true;
System.err.println("SubstitutionCracker2.hasB=true; via Scanner b_unable");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

b_unable.close();
break;
   }
  }
 }

                                                                           }
                                                                          }
                                                                         }
                                                                        }
                                                                       }
                                                                      }
                                                                     }
                                                                    }
                                                                   }
                                                                  }
                                                                 }
                                                                }
                                                               }
                                                              }
                                                             }
                                                            }
                                                           }
                                                          }
                                                         }
                                                        }
                                                       }
                                                      }
                                                     }
                                                    }
                                                   }
                                                  }
                                                 }
                                                }
                                               }
                                              }
                                             }
                                            }
                                           }
                                          }
                                         }
                                        }
                                       }
                                      }
                                     }
                                    }
                                   }
                                  }
                                 }
                                }
                               }
                              }
                             }
                            }
                           }
                          }
                         }
                        }
                       }
                      }
                     }
                    }
                   }
                  }
                 }
                }
               }
              }
             }
            }
           }
          }
         }
        }
       }
      }
     }
    }
   }
  }
 }
