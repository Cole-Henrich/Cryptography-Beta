package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan21X{
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

public Scan21X(){
System.err.println("new Scan21X");


Scanner x_next = new Scanner(SubstitutionCracker2.cipher);
while(x_next.hasNext()){
String next = x_next.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_n,_e,_t})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_next");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_next.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_next.close();
Scanner x_six = new Scanner(SubstitutionCracker2.cipher);
while(x_six.hasNext()){
String next = x_six.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_s,_i})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_six");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_six.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_six.close();
Scanner x_expression = new Scanner(SubstitutionCracker2.cipher);
while(x_expression.hasNext()){
String next = x_expression.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth},
new int[]{_e,_p,_r,_e,_s,_s,_i,_o,_n})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_expression");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_expression.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_expression.close();
Scanner x_except = new Scanner(SubstitutionCracker2.cipher);
while(x_except.hasNext()){
String next = x_except.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth},
new int[]{_e,_c,_e,_p,_t})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_except");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_except.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_except.close();
Scanner x_expressed = new Scanner(SubstitutionCracker2.cipher);
while(x_expressed.hasNext()){
String next = x_expressed.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_p,_r,_e,_s,_s,_e,_d})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_expressed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_expressed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_expressed.close();
Scanner x_explain = new Scanner(SubstitutionCracker2.cipher);
while(x_explain.hasNext()){
String next = x_explain.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_e,_p,_l,_a,_i,_n})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_explain");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_explain.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_explain.close();
Scanner x_fixed = new Scanner(SubstitutionCracker2.cipher);
while(x_fixed.hasNext()){
String next = x_fixed.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_f,_i,_e,_d})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_fixed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_fixed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_fixed.close();
Scanner x_expected = new Scanner(SubstitutionCracker2.cipher);
while(x_expected.hasNext()){
String next = x_expected.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth},
new int[]{_e,_p,_e,_c,_t,_e,_d})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_expected");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_expected.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_expected.close();
Scanner x_explained = new Scanner(SubstitutionCracker2.cipher);
while(x_explained.hasNext()){
String next = x_explained.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_p,_l,_a,_i,_n,_e,_d})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_explained");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_explained.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_explained.close();
Scanner x_exceeding = new Scanner(SubstitutionCracker2.cipher);
while(x_exceeding.hasNext()){
String next = x_exceeding.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_c,_e,_e,_d,_i,_n,_g})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exceeding");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exceeding.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exceeding.close();
Scanner x_alexander = new Scanner(SubstitutionCracker2.cipher);
while(x_alexander.hasNext()){
String next = x_alexander.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh,eighth,ninth},
new int[]{_a,_l,_e,_a,_n,_d,_e,_r})){
SubstitutionCracker2.key[_x] = fourth.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_alexander");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_alexander.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_alexander.close();
Scanner x_expect = new Scanner(SubstitutionCracker2.cipher);
while(x_expect.hasNext()){
String next = x_expect.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth},
new int[]{_e,_p,_e,_c,_t})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_expect");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_expect.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_expect.close();
Scanner x_express = new Scanner(SubstitutionCracker2.cipher);
while(x_express.hasNext()){
String next = x_express.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_e,_p,_r,_e,_s,_s})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_express");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_express.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_express.close();
Scanner x_experienced = new Scanner(SubstitutionCracker2.cipher);
while(x_experienced.hasNext()){
String next = x_experienced.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh},
new int[]{_e,_p,_e,_r,_i,_e,_n,_c,_e,_d})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_experienced");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_experienced.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_experienced.close();
Scanner x_tax = new Scanner(SubstitutionCracker2.cipher);
while(x_tax.hasNext()){
String next = x_tax.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_t,_a})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_tax");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_tax.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_tax.close();
Scanner x_exactly = new Scanner(SubstitutionCracker2.cipher);
while(x_exactly.hasNext()){
String next = x_exactly.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_e,_a,_c,_t,_l,_y})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exactly");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exactly.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exactly.close();
Scanner x_expecting = new Scanner(SubstitutionCracker2.cipher);
while(x_expecting.hasNext()){
String next = x_expecting.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_p,_e,_c,_t,_i,_n,_g})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_expecting");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_expecting.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_expecting.close();
Scanner x_experience = new Scanner(SubstitutionCracker2.cipher);
while(x_experience.hasNext()){
String next = x_experience.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth},
new int[]{_e,_p,_e,_r,_i,_e,_n,_c,_e})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_experience");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_experience.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_experience.close();
Scanner x_exclaimed = new Scanner(SubstitutionCracker2.cipher);
while(x_exclaimed.hasNext()){
String next = x_exclaimed.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_c,_l,_a,_i,_m,_e,_d})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exclaimed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exclaimed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exclaimed.close();
Scanner x_exceedingly = new Scanner(SubstitutionCracker2.cipher);
while(x_exceedingly.hasNext()){
String next = x_exceedingly.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh},
new int[]{_e,_c,_e,_e,_d,_i,_n,_g,_l,_y})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exceedingly");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exceedingly.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exceedingly.close();
Scanner x_exam = new Scanner(SubstitutionCracker2.cipher);
while(x_exam.hasNext()){
String next = x_exam.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_e,_a,_m})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exam");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exam.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exam.close();
Scanner x_exalted = new Scanner(SubstitutionCracker2.cipher);
while(x_exalted.hasNext()){
String next = x_exalted.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_e,_a,_l,_t,_e,_d})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exalted");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exalted.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exalted.close();
Scanner x_exalt = new Scanner(SubstitutionCracker2.cipher);
while(x_exalt.hasNext()){
String next = x_exalt.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_e,_a,_l,_t})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exalt");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exalt.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exalt.close();
Scanner x_sixth = new Scanner(SubstitutionCracker2.cipher);
while(x_sixth.hasNext()){
String next = x_sixth.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_s,_i,_t,_h})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_sixth");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_sixth.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_sixth.close();
Scanner x_excited = new Scanner(SubstitutionCracker2.cipher);
while(x_excited.hasNext()){
String next = x_excited.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_e,_c,_i,_t,_e,_d})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_excited");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_excited.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_excited.close();
Scanner x_box = new Scanner(SubstitutionCracker2.cipher);
while(x_box.hasNext()){
String next = x_box.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_b,_o})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_box");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_box.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_box.close();
Scanner x_anxious = new Scanner(SubstitutionCracker2.cipher);
while(x_anxious.hasNext()){
String next = x_anxious.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_a,_n,_i,_o,_u,_s})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_anxious");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_anxious.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_anxious.close();
Scanner x_excellent = new Scanner(SubstitutionCracker2.cipher);
while(x_excellent.hasNext()){
String next = x_excellent.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_c,_e,_l,_l,_e,_n,_t})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_excellent");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_excellent.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_excellent.close();
Scanner x_example = new Scanner(SubstitutionCracker2.cipher);
while(x_example.hasNext()){
String next = x_example.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_e,_a,_m,_p,_l,_e})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_example");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_example.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_example.close();
Scanner x_exodus = new Scanner(SubstitutionCracker2.cipher);
while(x_exodus.hasNext()){
String next = x_exodus.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth},
new int[]{_e,_o,_d,_u,_s})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exodus");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exodus.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exodus.close();
Scanner x_extraordinary = new Scanner(SubstitutionCracker2.cipher);
while(x_extraordinary.hasNext()){
String next = x_extraordinary.next();
if (next.length()==13){
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
String twelfth = String.valueOf(next.charAt(11));
String thirteenth = String.valueOf(next.charAt(12));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh,twelfth,thirteenth},
new int[]{_e,_t,_r,_a,_o,_r,_d,_i,_n,_a,_r,_y})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_extraordinary");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_extraordinary.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_extraordinary.close();
Scanner x_execute = new Scanner(SubstitutionCracker2.cipher);
while(x_execute.hasNext()){
String next = x_execute.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_e,_e,_c,_u,_t,_e})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_execute");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_execute.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_execute.close();
Scanner x_excuse = new Scanner(SubstitutionCracker2.cipher);
while(x_excuse.hasNext()){
String next = x_excuse.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth},
new int[]{_e,_c,_u,_s,_e})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_excuse");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_excuse.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_excuse.close();
Scanner x_unexpectedly = new Scanner(SubstitutionCracker2.cipher);
while(x_unexpectedly.hasNext()){
String next = x_unexpectedly.next();
if (next.length()==12){
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
String twelfth = String.valueOf(next.charAt(11));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh,eighth,ninth,tenth,eleventh,twelfth},
new int[]{_u,_n,_e,_p,_e,_c,_t,_e,_d,_l,_y})){
SubstitutionCracker2.key[_x] = fourth.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_unexpectedly");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_unexpectedly.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_unexpectedly.close();
Scanner x_sixteen = new Scanner(SubstitutionCracker2.cipher);
while(x_sixteen.hasNext()){
String next = x_sixteen.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_s,_i,_t,_e,_e,_n})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_sixteen");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_sixteen.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_sixteen.close();
Scanner x_ox = new Scanner(SubstitutionCracker2.cipher);
while(x_ox.hasNext()){
String next = x_ox.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{first},
new int[]{_o})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_ox");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_ox.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_ox.close();
Scanner x_unexpected = new Scanner(SubstitutionCracker2.cipher);
while(x_unexpected.hasNext()){
String next = x_unexpected.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh,eighth,ninth,tenth},
new int[]{_u,_n,_e,_p,_e,_c,_t,_e,_d})){
SubstitutionCracker2.key[_x] = fourth.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_unexpected");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_unexpected.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_unexpected.close();
Scanner x_extended = new Scanner(SubstitutionCracker2.cipher);
while(x_extended.hasNext()){
String next = x_extended.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth},
new int[]{_e,_t,_e,_n,_d,_e,_d})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_extended");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_extended.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_extended.close();
Scanner x_oxen = new Scanner(SubstitutionCracker2.cipher);
while(x_oxen.hasNext()){
String next = x_oxen.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_o,_e,_n})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_oxen");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_oxen.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_oxen.close();
Scanner x_explaining = new Scanner(SubstitutionCracker2.cipher);
while(x_explaining.hasNext()){
String next = x_explaining.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth},
new int[]{_e,_p,_l,_a,_i,_n,_i,_n,_g})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_explaining");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_explaining.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_explaining.close();
Scanner x_exercise = new Scanner(SubstitutionCracker2.cipher);
while(x_exercise.hasNext()){
String next = x_exercise.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth},
new int[]{_e,_e,_r,_c,_i,_s,_e})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exercise");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exercise.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exercise.close();
Scanner x_executed = new Scanner(SubstitutionCracker2.cipher);
while(x_executed.hasNext()){
String next = x_executed.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth},
new int[]{_e,_e,_c,_u,_t,_e,_d})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_executed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_executed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_executed.close();
Scanner x_expressing = new Scanner(SubstitutionCracker2.cipher);
while(x_expressing.hasNext()){
String next = x_expressing.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth},
new int[]{_e,_p,_r,_e,_s,_s,_i,_n,_g})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_expressing");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_expressing.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_expressing.close();
Scanner x_external = new Scanner(SubstitutionCracker2.cipher);
while(x_external.hasNext()){
String next = x_external.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth},
new int[]{_e,_t,_e,_r,_n,_a,_l})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_external");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_external.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_external.close();
Scanner x_explanation = new Scanner(SubstitutionCracker2.cipher);
while(x_explanation.hasNext()){
String next = x_explanation.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh},
new int[]{_e,_p,_l,_a,_n,_a,_t,_i,_o,_n})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_explanation");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_explanation.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_explanation.close();
Scanner x_excitement = new Scanner(SubstitutionCracker2.cipher);
while(x_excitement.hasNext()){
String next = x_excitement.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth},
new int[]{_e,_c,_i,_t,_e,_m,_e,_n,_t})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_excitement");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_excitement.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_excitement.close();
Scanner x_examine = new Scanner(SubstitutionCracker2.cipher);
while(x_examine.hasNext()){
String next = x_examine.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_e,_a,_m,_i,_n,_e})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_examine");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_examine.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_examine.close();
Scanner x_examined = new Scanner(SubstitutionCracker2.cipher);
while(x_examined.hasNext()){
String next = x_examined.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth},
new int[]{_e,_a,_m,_i,_n,_e,_d})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_examined");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_examined.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_examined.close();
Scanner x_sixty = new Scanner(SubstitutionCracker2.cipher);
while(x_sixty.hasNext()){
String next = x_sixty.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_s,_i,_t,_y})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_sixty");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_sixty.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_sixty.close();
Scanner x_mixed = new Scanner(SubstitutionCracker2.cipher);
while(x_mixed.hasNext()){
String next = x_mixed.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_m,_i,_e,_d})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_mixed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_mixed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_mixed.close();
Scanner x_exchange = new Scanner(SubstitutionCracker2.cipher);
while(x_exchange.hasNext()){
String next = x_exchange.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth},
new int[]{_e,_c,_h,_a,_n,_g,_e})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exchange");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exchange.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exchange.close();
Scanner x_extra = new Scanner(SubstitutionCracker2.cipher);
while(x_extra.hasNext()){
String next = x_extra.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_e,_t,_r,_a})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_extra");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_extra.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_extra.close();
Scanner x_exchanged = new Scanner(SubstitutionCracker2.cipher);
while(x_exchanged.hasNext()){
String next = x_exchanged.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_c,_h,_a,_n,_g,_e,_d})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exchanged");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exchanged.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exchanged.close();
Scanner x_existence = new Scanner(SubstitutionCracker2.cipher);
while(x_existence.hasNext()){
String next = x_existence.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_i,_s,_t,_e,_n,_c,_e})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_existence");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_existence.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_existence.close();
Scanner x_executive = new Scanner(SubstitutionCracker2.cipher);
while(x_executive.hasNext()){
String next = x_executive.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_e,_c,_u,_t,_i,_v,_e})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_executive");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_executive.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_executive.close();
Scanner x_extent = new Scanner(SubstitutionCracker2.cipher);
while(x_extent.hasNext()){
String next = x_extent.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth},
new int[]{_e,_t,_e,_n,_t})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_extent");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_extent.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_extent.close();
Scanner x_examining = new Scanner(SubstitutionCracker2.cipher);
while(x_examining.hasNext()){
String next = x_examining.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_a,_m,_i,_n,_i,_n,_g})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_examining");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_examining.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_examining.close();
Scanner x_exhausted = new Scanner(SubstitutionCracker2.cipher);
while(x_exhausted.hasNext()){
String next = x_exhausted.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_h,_a,_u,_s,_t,_e,_d})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exhausted");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exhausted.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exhausted.close();
Scanner x_extremely = new Scanner(SubstitutionCracker2.cipher);
while(x_extremely.hasNext()){
String next = x_extremely.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_t,_r,_e,_m,_e,_l,_y})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_extremely");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_extremely.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_extremely.close();
Scanner x_exposed = new Scanner(SubstitutionCracker2.cipher);
while(x_exposed.hasNext()){
String next = x_exposed.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_e,_p,_o,_s,_e,_d})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exposed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exposed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exposed.close();
Scanner x_fix = new Scanner(SubstitutionCracker2.cipher);
while(x_fix.hasNext()){
String next = x_fix.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_f,_i})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_fix");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_fix.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_fix.close();
Scanner x_exact = new Scanner(SubstitutionCracker2.cipher);
while(x_exact.hasNext()){
String next = x_exact.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_e,_a,_c,_t})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exact");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exact.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exact.close();
Scanner x_complex = new Scanner(SubstitutionCracker2.cipher);
while(x_complex.hasNext()){
String next = x_complex.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_c,_o,_m,_p,_l,_e})){
SubstitutionCracker2.key[_x] = seventh.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_complex");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_complex.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_complex.close();
Scanner x_vexation = new Scanner(SubstitutionCracker2.cipher);
while(x_vexation.hasNext()){
String next = x_vexation.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh,eighth},
new int[]{_v,_e,_a,_t,_i,_o,_n})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_vexation");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_vexation.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_vexation.close();
Scanner x_anxiety = new Scanner(SubstitutionCracker2.cipher);
while(x_anxiety.hasNext()){
String next = x_anxiety.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_a,_n,_i,_e,_t,_y})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_anxiety");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_anxiety.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_anxiety.close();
Scanner x_exist = new Scanner(SubstitutionCracker2.cipher);
while(x_exist.hasNext()){
String next = x_exist.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_e,_i,_s,_t})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exist");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exist.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exist.close();
Scanner x_extreme = new Scanner(SubstitutionCracker2.cipher);
while(x_extreme.hasNext()){
String next = x_extreme.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_e,_t,_r,_e,_m,_e})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_extreme");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_extreme.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_extreme.close();
Scanner x_expectation = new Scanner(SubstitutionCracker2.cipher);
while(x_expectation.hasNext()){
String next = x_expectation.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh},
new int[]{_e,_p,_e,_c,_t,_a,_t,_i,_o,_n})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_expectation");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_expectation.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_expectation.close();
Scanner x_expectations = new Scanner(SubstitutionCracker2.cipher);
while(x_expectations.hasNext()){
String next = x_expectations.next();
if (next.length()==12){
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
String twelfth = String.valueOf(next.charAt(11));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh,twelfth},
new int[]{_e,_p,_e,_c,_t,_a,_t,_i,_o,_n,_s})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_expectations");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_expectations.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_expectations.close();
Scanner x_expensive = new Scanner(SubstitutionCracker2.cipher);
while(x_expensive.hasNext()){
String next = x_expensive.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_p,_e,_n,_s,_i,_v,_e})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_expensive");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_expensive.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_expensive.close();
Scanner x_existed = new Scanner(SubstitutionCracker2.cipher);
while(x_existed.hasNext()){
String next = x_existed.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_e,_i,_s,_t,_e,_d})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_existed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_existed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_existed.close();
Scanner x_fox = new Scanner(SubstitutionCracker2.cipher);
while(x_fox.hasNext()){
String next = x_fox.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_f,_o})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_fox");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_fox.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_fox.close();
Scanner x_excellency = new Scanner(SubstitutionCracker2.cipher);
while(x_excellency.hasNext()){
String next = x_excellency.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth},
new int[]{_e,_c,_e,_l,_l,_e,_n,_c,_y})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_excellency");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_excellency.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_excellency.close();
Scanner x_wax = new Scanner(SubstitutionCracker2.cipher);
while(x_wax.hasNext()){
String next = x_wax.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_w,_a})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_wax");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_wax.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_wax.close();
Scanner x_sixties = new Scanner(SubstitutionCracker2.cipher);
while(x_sixties.hasNext()){
String next = x_sixties.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_s,_i,_t,_i,_e,_s})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_sixties");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_sixties.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_sixties.close();
Scanner x_exception = new Scanner(SubstitutionCracker2.cipher);
while(x_exception.hasNext()){
String next = x_exception.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_c,_e,_p,_t,_i,_o,_n})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exception");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exception.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exception.close();
Scanner x_betwixt = new Scanner(SubstitutionCracker2.cipher);
while(x_betwixt.hasNext()){
String next = x_betwixt.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh},
new int[]{_b,_e,_t,_w,_i,_t})){
SubstitutionCracker2.key[_x] = sixth.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_betwixt");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_betwixt.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_betwixt.close();
Scanner x_pretext = new Scanner(SubstitutionCracker2.cipher);
while(x_pretext.hasNext()){
String next = x_pretext.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh},
new int[]{_p,_r,_e,_t,_e,_t})){
SubstitutionCracker2.key[_x] = sixth.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_pretext");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_pretext.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_pretext.close();
Scanner x_boxes = new Scanner(SubstitutionCracker2.cipher);
while(x_boxes.hasNext()){
String next = x_boxes.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_b,_o,_e,_s})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_boxes");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_boxes.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_boxes.close();
Scanner x_text = new Scanner(SubstitutionCracker2.cipher);
while(x_text.hasNext()){
String next = x_text.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_t,_e,_t})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_text");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_text.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_text.close();
Scanner x_xiv = new Scanner(SubstitutionCracker2.cipher);
while(x_xiv.hasNext()){
String next = x_xiv.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_i,_v})){
SubstitutionCracker2.key[_x] = first.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_xiv");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_xiv.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_xiv.close();
Scanner x_expose = new Scanner(SubstitutionCracker2.cipher);
while(x_expose.hasNext()){
String next = x_expose.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth},
new int[]{_e,_p,_o,_s,_e})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_expose");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_expose.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_expose.close();
Scanner x_xi = new Scanner(SubstitutionCracker2.cipher);
while(x_xi.hasNext()){
String next = x_xi.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{second},
new int[]{_i})){
SubstitutionCracker2.key[_x] = first.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_xi");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_xi.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_xi.close();
Scanner x_exercised = new Scanner(SubstitutionCracker2.cipher);
while(x_exercised.hasNext()){
String next = x_exercised.next();
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

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_e,_e,_r,_c,_i,_s,_e,_d})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exercised");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exercised.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exercised.close();
Scanner x_xvi = new Scanner(SubstitutionCracker2.cipher);
while(x_xvi.hasNext()){
String next = x_xvi.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_v,_i})){
SubstitutionCracker2.key[_x] = first.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_xvi");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_xvi.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_xvi.close();
Scanner x_vexed = new Scanner(SubstitutionCracker2.cipher);
while(x_vexed.hasNext()){
String next = x_vexed.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_v,_e,_e,_d})){
SubstitutionCracker2.key[_x] = third.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_vexed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_vexed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_vexed.close();
Scanner x_existing = new Scanner(SubstitutionCracker2.cipher);
while(x_existing.hasNext()){
String next = x_existing.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth},
new int[]{_e,_i,_s,_t,_i,_n,_g})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_existing");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_existing.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_existing.close();
Scanner x_xii = new Scanner(SubstitutionCracker2.cipher);
while(x_xii.hasNext()){
String next = x_xii.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_i,_i})){
SubstitutionCracker2.key[_x] = first.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_xii");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_xii.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_xii.close();
Scanner x_exhorted = new Scanner(SubstitutionCracker2.cipher);
while(x_exhorted.hasNext()){
String next = x_exhorted.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh,eighth},
new int[]{_e,_h,_o,_r,_t,_e,_d})){
SubstitutionCracker2.key[_x] = second.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_exhorted");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_exhorted.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasX){
x_exhorted.close();
Scanner x_perplexity = new Scanner(SubstitutionCracker2.cipher);
while(x_perplexity.hasNext()){
String next = x_perplexity.next();
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
new int[]{_p,_e,_r,_p,_l,_e,_i,_t,_y})){
SubstitutionCracker2.key[_x] = seventh.toLowerCase();
SubstitutionCracker2.hasX=true;
System.err.println("SubstitutionCracker2.hasX=true; via Scanner x_perplexity");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

x_perplexity.close();
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
