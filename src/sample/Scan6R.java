package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan6R{
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

public Scan6R(){
System.err.println("new Scan6R");
    System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));


Scanner r_her = new Scanner(SubstitutionCracker2.cipher);
while(r_her.hasNext()){
String next = r_her.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_h,_e})){
SubstitutionCracker2.key[_r] = third.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_her");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_her.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_her.close();
Scanner r_their = new Scanner(SubstitutionCracker2.cipher);
while(r_their.hasNext()){
String next = r_their.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_t,_h,_e,_i})){
SubstitutionCracker2.key[_r] = fifth.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_their");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_their.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_their.close();
Scanner r_are = new Scanner(SubstitutionCracker2.cipher);
while(r_are.hasNext()){
String next = r_are.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,third},
new int[]{_a,_e})){
SubstitutionCracker2.key[_r] = second.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_are");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_are.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_are.close();
Scanner r_or = new Scanner(SubstitutionCracker2.cipher);
while(r_or.hasNext()){
String next = r_or.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{first},
new int[]{_o})){
SubstitutionCracker2.key[_r] = second.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_or");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_or.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_or.close();
Scanner r_there = new Scanner(SubstitutionCracker2.cipher);
while(r_there.hasNext()){
String next = r_there.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_t,_h,_e,_e})){
SubstitutionCracker2.key[_r] = fourth.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_there");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_there.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_there.close();
Scanner r_other = new Scanner(SubstitutionCracker2.cipher);
while(r_other.hasNext()){
String next = r_other.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_o,_t,_h,_e})){
SubstitutionCracker2.key[_r] = fifth.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_other");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_other.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_other.close();
Scanner r_nor = new Scanner(SubstitutionCracker2.cipher);
while(r_nor.hasNext()){
String next = r_nor.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_n,_o})){
SubstitutionCracker2.key[_r] = third.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_nor");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_nor.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_nor.close();
Scanner r_another = new Scanner(SubstitutionCracker2.cipher);
while(r_another.hasNext()){
String next = r_another.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_a,_n,_o,_t,_h,_e})){
SubstitutionCracker2.key[_r] = seventh.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_another");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_another.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_another.close();
Scanner r_three = new Scanner(SubstitutionCracker2.cipher);
while(r_three.hasNext()){
String next = r_three.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_t,_h,_e,_e})){
SubstitutionCracker2.key[_r] = third.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_three");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_three.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_three.close();
Scanner r_hear = new Scanner(SubstitutionCracker2.cipher);
while(r_hear.hasNext()){
String next = r_hear.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_h,_e,_a})){
SubstitutionCracker2.key[_r] = fourth.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_hear");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_hear.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_hear.close();
Scanner r_neither = new Scanner(SubstitutionCracker2.cipher);
while(r_neither.hasNext()){
String next = r_neither.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_n,_e,_i,_t,_h,_e})){
SubstitutionCracker2.key[_r] = seventh.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_neither");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_neither.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_neither.close();
Scanner r_here = new Scanner(SubstitutionCracker2.cipher);
while(r_here.hasNext()){
String next = r_here.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_h,_e,_e})){
SubstitutionCracker2.key[_r] = third.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_here");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_here.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_here.close();
Scanner r_heart = new Scanner(SubstitutionCracker2.cipher);
while(r_heart.hasNext()){
String next = r_heart.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_h,_e,_a,_t})){
SubstitutionCracker2.key[_r] = fourth.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_heart");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_heart.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_heart.close();
Scanner r_art = new Scanner(SubstitutionCracker2.cipher);
while(r_art.hasNext()){
String next = r_art.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,third},
new int[]{_a,_t})){
SubstitutionCracker2.key[_r] = second.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_art");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_art.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_art.close();
Scanner r_near = new Scanner(SubstitutionCracker2.cipher);
while(r_near.hasNext()){
String next = r_near.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_n,_e,_a})){
SubstitutionCracker2.key[_r] = fourth.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_near");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_near.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_near.close();
Scanner r_rest = new Scanner(SubstitutionCracker2.cipher);
while(r_rest.hasNext()){
String next = r_rest.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_s,_t})){
SubstitutionCracker2.key[_r] = first.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_rest");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_rest.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_rest.close();
Scanner r_ran = new Scanner(SubstitutionCracker2.cipher);
while(r_ran.hasNext()){
String next = r_ran.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_a,_n})){
SubstitutionCracker2.key[_r] = first.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_ran");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_ran.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_ran.close();
Scanner r_earth = new Scanner(SubstitutionCracker2.cipher);
while(r_earth.hasNext()){
String next = r_earth.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_e,_a,_t,_h})){
SubstitutionCracker2.key[_r] = third.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_earth");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_earth.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_earth.close();
Scanner r_others = new Scanner(SubstitutionCracker2.cipher);
while(r_others.hasNext()){
String next = r_others.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth},
new int[]{_o,_t,_h,_e,_s})){
SubstitutionCracker2.key[_r] = fifth.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_others");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_others.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_others.close();
Scanner r_rose = new Scanner(SubstitutionCracker2.cipher);
while(r_rose.hasNext()){
String next = r_rose.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_s,_e})){
SubstitutionCracker2.key[_r] = first.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_rose");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_rose.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_rose.close();
Scanner r_rather = new Scanner(SubstitutionCracker2.cipher);
while(r_rather.hasNext()){
String next = r_rather.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(first.equalsIgnoreCase(sixth)){
if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_a,_t,_h,_e})){
SubstitutionCracker2.key[_r] = first.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_rather");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_rather.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_rather.close();
Scanner r_hair = new Scanner(SubstitutionCracker2.cipher);
while(r_hair.hasNext()){
String next = r_hair.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_h,_a,_i})){
SubstitutionCracker2.key[_r] = fourth.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_hair");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_hair.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_hair.close();
Scanner r_air = new Scanner(SubstitutionCracker2.cipher);
while(r_air.hasNext()){
String next = r_air.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_a,_i})){
SubstitutionCracker2.key[_r] = third.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_air");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_air.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_air.close();
Scanner r_reason = new Scanner(SubstitutionCracker2.cipher);
while(r_reason.hasNext()){
String next = r_reason.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_e,_a,_s,_o,_n})){
SubstitutionCracker2.key[_r] = first.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_reason");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_reason.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_reason.close();
Scanner r_either = new Scanner(SubstitutionCracker2.cipher);
while(r_either.hasNext()){
String next = r_either.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_e,_i,_t,_h,_e})){
SubstitutionCracker2.key[_r] = sixth.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_either");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_either.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_either.close();
Scanner r_rise = new Scanner(SubstitutionCracker2.cipher);
while(r_rise.hasNext()){
String next = r_rise.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_s,_e})){
SubstitutionCracker2.key[_r] = first.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_rise");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_rise.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_rise.close();
Scanner r_enter = new Scanner(SubstitutionCracker2.cipher);
while(r_enter.hasNext()){
String next = r_enter.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_e,_n,_t,_e})){
SubstitutionCracker2.key[_r] = fifth.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_enter");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_enter.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_enter.close();
Scanner r_horse = new Scanner(SubstitutionCracker2.cipher);
while(r_horse.hasNext()){
String next = r_horse.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_h,_o,_s,_e})){
SubstitutionCracker2.key[_r] = third.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_horse");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_horse.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_horse.close();
Scanner r_short = new Scanner(SubstitutionCracker2.cipher);
while(r_short.hasNext()){
String next = r_short.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_s,_h,_o,_t})){
SubstitutionCracker2.key[_r] = fourth.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_short");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_short.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasR){
r_short.close();
Scanner r_horses = new Scanner(SubstitutionCracker2.cipher);
while(r_horses.hasNext()){
String next = r_horses.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_h,_o,_s,_e,_s})){
SubstitutionCracker2.key[_r] = third.toLowerCase();
SubstitutionCracker2.hasR=true;
System.err.println("SubstitutionCracker2.hasR=true; via Scanner r_horses");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

r_horses.close();
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
