package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan11F{
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

public Scan11F(){
System.err.println("new Scan11F");
    System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));


Scanner f_of = new Scanner(SubstitutionCracker2.cipher);
while(f_of.hasNext()){
String next = f_of.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{first},
new int[]{_o})){
SubstitutionCracker2.key[_f] = second.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_of");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_of.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_of.close();
Scanner f_for = new Scanner(SubstitutionCracker2.cipher);
while(f_for.hasNext()){
String next = f_for.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_o,_r})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_for");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_for.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_for.close();
Scanner f_from = new Scanner(SubstitutionCracker2.cipher);
while(f_from.hasNext()){
String next = f_from.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_r,_o,_m})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_from");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_from.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_from.close();
Scanner f_if = new Scanner(SubstitutionCracker2.cipher);
while(f_if.hasNext()){
String next = f_if.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{first},
new int[]{_i})){
SubstitutionCracker2.key[_f] = second.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_if");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_if.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_if.close();
Scanner f_after = new Scanner(SubstitutionCracker2.cipher);
while(f_after.hasNext()){
String next = f_after.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_a,_t,_e,_r})){
SubstitutionCracker2.key[_f] = second.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_after");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_after.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_after.close();
Scanner f_first = new Scanner(SubstitutionCracker2.cipher);
while(f_first.hasNext()){
String next = f_first.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_i,_r,_s,_t})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_first");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_first.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_first.close();
Scanner f_himself = new Scanner(SubstitutionCracker2.cipher);
while(f_himself.hasNext()){
String next = f_himself.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_h,_i,_m,_s,_e,_l})){
SubstitutionCracker2.key[_f] = seventh.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_himself");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_himself.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_himself.close();
Scanner f_left = new Scanner(SubstitutionCracker2.cipher);
while(f_left.hasNext()){
String next = f_left.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_l,_e,_t})){
SubstitutionCracker2.key[_f] = third.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_left");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_left.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_left.close();
Scanner f_therefore = new Scanner(SubstitutionCracker2.cipher);
while(f_therefore.hasNext()){
String next = f_therefore.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh,eighth,ninth},
new int[]{_t,_h,_e,_r,_e,_o,_r,_e})){
SubstitutionCracker2.key[_f] = sixth.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_therefore");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_therefore.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_therefore.close();
Scanner f_off = new Scanner(SubstitutionCracker2.cipher);
while(f_off.hasNext()){
String next = f_off.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(second.equalsIgnoreCase(third)){
if(massCalc_notAnyOther(new String[]{first},
new int[]{_o})){
SubstitutionCracker2.key[_f] = second.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_off");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_off.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_off.close();
Scanner f_found = new Scanner(SubstitutionCracker2.cipher);
while(f_found.hasNext()){
String next = f_found.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_u,_n,_d})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_found");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_found.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_found.close();
Scanner f_father = new Scanner(SubstitutionCracker2.cipher);
while(f_father.hasNext()){
String next = f_father.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_a,_t,_h,_e,_r})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_father");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_father.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_father.close();
Scanner f_felt = new Scanner(SubstitutionCracker2.cipher);
while(f_felt.hasNext()){
String next = f_felt.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_l,_t})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_felt");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_felt.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_felt.close();
Scanner f_life = new Scanner(SubstitutionCracker2.cipher);
while(f_life.hasNext()){
String next = f_life.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_l,_i,_e})){
SubstitutionCracker2.key[_f] = third.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_life");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_life.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_life.close();
Scanner f_forth = new Scanner(SubstitutionCracker2.cipher);
while(f_forth.hasNext()){
String next = f_forth.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_r,_t,_h})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_forth");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_forth.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_forth.close();
Scanner f_find = new Scanner(SubstitutionCracker2.cipher);
while(f_find.hasNext()){
String next = f_find.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_n,_d})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_find");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_find.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_find.close();
Scanner f_fear = new Scanner(SubstitutionCracker2.cipher);
while(f_fear.hasNext()){
String next = f_fear.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_a,_r})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_fear");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_fear.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_fear.close();
Scanner f_far = new Scanner(SubstitutionCracker2.cipher);
while(f_far.hasNext()){
String next = f_far.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_a,_r})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_far");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_far.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_far.close();
Scanner f_four = new Scanner(SubstitutionCracker2.cipher);
while(f_four.hasNext()){
String next = f_four.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_u,_r})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_four");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_four.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_four.close();
Scanner f_full = new Scanner(SubstitutionCracker2.cipher);
while(f_full.hasNext()){
String next = f_full.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_u,_l,_l})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_full");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_full.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_full.close();
Scanner f_fell = new Scanner(SubstitutionCracker2.cipher);
while(f_fell.hasNext()){
String next = f_fell.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_l,_l})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_fell");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_fell.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_fell.close();
Scanner f_fire = new Scanner(SubstitutionCracker2.cipher);
while(f_fire.hasNext()){
String next = f_fire.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_r,_e})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_fire");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_fire.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_fire.close();
Scanner f_half = new Scanner(SubstitutionCracker2.cipher);
while(f_half.hasNext()){
String next = f_half.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_h,_a,_l})){
SubstitutionCracker2.key[_f] = fourth.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_half");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_half.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_half.close();
Scanner f_front = new Scanner(SubstitutionCracker2.cipher);
while(f_front.hasNext()){
String next = f_front.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_r,_o,_n,_t})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_front");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_front.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_front.close();
Scanner f_often = new Scanner(SubstitutionCracker2.cipher);
while(f_often.hasNext()){
String next = f_often.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_o,_t,_e,_n})){
SubstitutionCracker2.key[_f] = second.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_often");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_often.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_often.close();
Scanner f_fall = new Scanner(SubstitutionCracker2.cipher);
while(f_fall.hasNext()){
String next = f_fall.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_l,_l})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_fall");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_fall.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_fall.close();
Scanner f_herself = new Scanner(SubstitutionCracker2.cipher);
while(f_herself.hasNext()){
String next = f_herself.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_h,_e,_r,_s,_e,_l})){
SubstitutionCracker2.key[_f] = seventh.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_herself");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_herself.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_herself.close();
Scanner f_filled = new Scanner(SubstitutionCracker2.cipher);
while(f_filled.hasNext()){
String next = f_filled.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_i,_l,_l,_e,_d})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_filled");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_filled.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_filled.close();
Scanner f_offer = new Scanner(SubstitutionCracker2.cipher);
while(f_offer.hasNext()){
String next = f_offer.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(second.equalsIgnoreCase(third)){
if(massCalc_notAnyOther(new String[]{first,fourth,fifth},
new int[]{_o,_e,_r})){
SubstitutionCracker2.key[_f] = second.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_offer");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_offer.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_offer.close();
Scanner f_feet = new Scanner(SubstitutionCracker2.cipher);
while(f_feet.hasNext()){
String next = f_feet.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_e,_t})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_feet");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_feet.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_feet.close();
Scanner f_offered = new Scanner(SubstitutionCracker2.cipher);
while(f_offered.hasNext()){
String next = f_offered.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(second.equalsIgnoreCase(third)){
if(massCalc_notAnyOther(new String[]{first,fourth,fifth,sixth,seventh},
new int[]{_o,_e,_r,_e,_d})){
SubstitutionCracker2.key[_f] = second.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_offered");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_offered.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_offered.close();
Scanner f_lifted = new Scanner(SubstitutionCracker2.cipher);
while(f_lifted.hasNext()){
String next = f_lifted.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_l,_i,_t,_e,_d})){
SubstitutionCracker2.key[_f] = third.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_lifted");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_lifted.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_lifted.close();
Scanner f_thereof = new Scanner(SubstitutionCracker2.cipher);
while(f_thereof.hasNext()){
String next = f_thereof.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_t,_h,_e,_r,_e,_o})){
SubstitutionCracker2.key[_f] = seventh.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_thereof");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_thereof.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_thereof.close();
Scanner f_feel = new Scanner(SubstitutionCracker2.cipher);
while(f_feel.hasNext()){
String next = f_feel.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_e,_l})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_feel");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_feel.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_feel.close();
Scanner f_afraid = new Scanner(SubstitutionCracker2.cipher);
while(f_afraid.hasNext()){
String next = f_afraid.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth},
new int[]{_a,_r,_a,_i,_d})){
SubstitutionCracker2.key[_f] = second.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_afraid");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_afraid.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_afraid.close();
Scanner f_free = new Scanner(SubstitutionCracker2.cipher);
while(f_free.hasNext()){
String next = f_free.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_r,_e,_e})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_free");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_free.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_free.close();
Scanner f_different = new Scanner(SubstitutionCracker2.cipher);
while(f_different.hasNext()){
String next = f_different.next();
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

if(third.equalsIgnoreCase(fourth)){
if(massCalc_notAnyOther(new String[]{first,second,fifth,sixth,seventh,eighth,ninth},
new int[]{_d,_i,_e,_r,_e,_n,_t})){
SubstitutionCracker2.key[_f] = third.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_different");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_different.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_different.close();
Scanner f_former = new Scanner(SubstitutionCracker2.cipher);
while(f_former.hasNext()){
String next = f_former.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_o,_r,_m,_e,_r})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_former");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_former.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_former.close();
Scanner f_itself = new Scanner(SubstitutionCracker2.cipher);
while(f_itself.hasNext()){
String next = f_itself.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_i,_t,_s,_e,_l})){
SubstitutionCracker2.key[_f] = sixth.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_itself");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_itself.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_itself.close();
Scanner f_faith = new Scanner(SubstitutionCracker2.cipher);
while(f_faith.hasNext()){
String next = f_faith.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_a,_i,_t,_h})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_faith");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_faith.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_faith.close();
Scanner f_fine = new Scanner(SubstitutionCracker2.cipher);
while(f_fine.hasNext()){
String next = f_fine.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_n,_e})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_fine");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_fine.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_fine.close();
Scanner f_flesh = new Scanner(SubstitutionCracker2.cipher);
while(f_flesh.hasNext()){
String next = f_flesh.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_l,_e,_s,_h})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_flesh");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_flesh.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_flesh.close();
Scanner f_field = new Scanner(SubstitutionCracker2.cipher);
while(f_field.hasNext()){
String next = f_field.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_i,_e,_l,_d})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_field");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_field.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_field.close();
Scanner f_fathers = new Scanner(SubstitutionCracker2.cipher);
while(f_fathers.hasNext()){
String next = f_fathers.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_a,_t,_h,_e,_r,_s})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_fathers");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_fathers.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_fathers.close();
Scanner f_friend = new Scanner(SubstitutionCracker2.cipher);
while(f_friend.hasNext()){
String next = f_friend.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_r,_i,_e,_n,_d})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_friend");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_friend.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_friend.close();
Scanner f_foot = new Scanner(SubstitutionCracker2.cipher);
while(f_foot.hasNext()){
String next = f_foot.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_o,_t})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_foot");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_foot.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_foot.close();
Scanner f_freedom = new Scanner(SubstitutionCracker2.cipher);
while(f_freedom.hasNext()){
String next = f_freedom.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_r,_e,_e,_d,_o,_m})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_freedom");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_freedom.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_freedom.close();
Scanner f_friends = new Scanner(SubstitutionCracker2.cipher);
while(f_friends.hasNext()){
String next = f_friends.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_r,_i,_e,_n,_d,_s})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_friends");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_friends.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_friends.close();
Scanner f_fled = new Scanner(SubstitutionCracker2.cipher);
while(f_fled.hasNext()){
String next = f_fled.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_l,_e,_d})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_fled");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_fled.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasF){
f_fled.close();
Scanner f_fallen = new Scanner(SubstitutionCracker2.cipher);
while(f_fallen.hasNext()){
String next = f_fallen.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_a,_l,_l,_e,_n})){
SubstitutionCracker2.key[_f] = first.toLowerCase();
SubstitutionCracker2.hasF=true;
System.err.println("SubstitutionCracker2.hasF=true; via Scanner f_fallen");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

f_fallen.close();
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
