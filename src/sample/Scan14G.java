package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan14G{
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

public Scan14G(){
System.err.println("new Scan14G");
    System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));


Scanner g_go = new Scanner(SubstitutionCracker2.cipher);
while(g_go.hasNext()){
String next = g_go.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{second},
new int[]{_o})){
SubstitutionCracker2.key[_g] = first.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_go");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_go.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_go.close();
Scanner g_god = new Scanner(SubstitutionCracker2.cipher);
while(g_god.hasNext()){
String next = g_god.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_o,_d})){
SubstitutionCracker2.key[_g] = first.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_god");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_god.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_god.close();
Scanner g_against = new Scanner(SubstitutionCracker2.cipher);
while(g_against.hasNext()){
String next = g_against.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_a,_a,_i,_n,_s,_t})){
SubstitutionCracker2.key[_g] = second.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_against");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_against.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_against.close();
Scanner g_things = new Scanner(SubstitutionCracker2.cipher);
while(g_things.hasNext()){
String next = g_things.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth},
new int[]{_t,_h,_i,_n,_s})){
SubstitutionCracker2.key[_g] = fifth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_things");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_things.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_things.close();
Scanner g_great = new Scanner(SubstitutionCracker2.cipher);
while(g_great.hasNext()){
String next = g_great.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_r,_e,_a,_t})){
SubstitutionCracker2.key[_g] = first.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_great");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_great.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_great.close();
Scanner g_through = new Scanner(SubstitutionCracker2.cipher);
while(g_through.hasNext()){
String next = g_through.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh},
new int[]{_t,_h,_r,_o,_u,_h})){
SubstitutionCracker2.key[_g] = sixth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_through");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_through.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_through.close();
Scanner g_might = new Scanner(SubstitutionCracker2.cipher);
while(g_might.hasNext()){
String next = g_might.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_m,_i,_h,_t})){
SubstitutionCracker2.key[_g] = third.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_might");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_might.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_might.close();
Scanner g_good = new Scanner(SubstitutionCracker2.cipher);
while(g_good.hasNext()){
String next = g_good.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_o,_d})){
SubstitutionCracker2.key[_g] = first.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_good");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_good.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_good.close();
Scanner g_thought = new Scanner(SubstitutionCracker2.cipher);
while(g_thought.hasNext()){
String next = g_thought.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth,seventh},
new int[]{_t,_h,_o,_u,_h,_t})){
SubstitutionCracker2.key[_g] = fifth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_thought");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_thought.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_thought.close();
Scanner g_long = new Scanner(SubstitutionCracker2.cipher);
while(g_long.hasNext()){
String next = g_long.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_l,_o,_n})){
SubstitutionCracker2.key[_g] = fourth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_long");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_long.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_long.close();
Scanner g_among = new Scanner(SubstitutionCracker2.cipher);
while(g_among.hasNext()){
String next = g_among.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_a,_m,_o,_n})){
SubstitutionCracker2.key[_g] = fifth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_among");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_among.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_among.close();
Scanner g_again = new Scanner(SubstitutionCracker2.cipher);
while(g_again.hasNext()){
String next = g_again.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_a,_a,_i,_n})){
SubstitutionCracker2.key[_g] = second.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_again");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_again.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_again.close();
Scanner g_according = new Scanner(SubstitutionCracker2.cipher);
while(g_according.hasNext()){
String next = g_according.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth,seventh,eighth},
new int[]{_a,_c,_c,_o,_r,_d,_i,_n})){
SubstitutionCracker2.key[_g] = ninth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_according");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_according.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_according.close();
Scanner g_get = new Scanner(SubstitutionCracker2.cipher);
while(g_get.hasNext()){
String next = g_get.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_e,_t})){
SubstitutionCracker2.key[_g] = first.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_get");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_get.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_get.close();
Scanner g_going = new Scanner(SubstitutionCracker2.cipher);
while(g_going.hasNext()){
String next = g_going.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(first.equalsIgnoreCase(fifth)){
if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_i,_n})){
SubstitutionCracker2.key[_g] = first.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_going");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_going.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_going.close();
Scanner g_something = new Scanner(SubstitutionCracker2.cipher);
while(g_something.hasNext()){
String next = g_something.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth,seventh,eighth},
new int[]{_s,_o,_m,_e,_t,_h,_i,_n})){
SubstitutionCracker2.key[_g] = ninth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_something");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_something.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_something.close();
Scanner g_right = new Scanner(SubstitutionCracker2.cipher);
while(g_right.hasNext()){
String next = g_right.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_r,_i,_h,_t})){
SubstitutionCracker2.key[_g] = third.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_right");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_right.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_right.close();
Scanner g_got = new Scanner(SubstitutionCracker2.cipher);
while(g_got.hasNext()){
String next = g_got.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_o,_t})){
SubstitutionCracker2.key[_g] = first.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_got");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_got.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_got.close();
Scanner g_nothing = new Scanner(SubstitutionCracker2.cipher);
while(g_nothing.hasNext()){
String next = g_nothing.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_n,_o,_t,_h,_i,_n})){
SubstitutionCracker2.key[_g] = seventh.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_nothing");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_nothing.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_nothing.close();
Scanner g_though = new Scanner(SubstitutionCracker2.cipher);
while(g_though.hasNext()){
String next = g_though.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth},
new int[]{_t,_h,_o,_u,_h})){
SubstitutionCracker2.key[_g] = fifth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_though");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_though.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_though.close();
Scanner g_thing = new Scanner(SubstitutionCracker2.cipher);
while(g_thing.hasNext()){
String next = g_thing.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_t,_h,_i,_n})){
SubstitutionCracker2.key[_g] = fifth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_thing");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_thing.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_thing.close();
Scanner g_high = new Scanner(SubstitutionCracker2.cipher);
while(g_high.hasNext()){
String next = g_high.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_h,_i,_h})){
SubstitutionCracker2.key[_g] = third.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_high");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_high.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_high.close();
Scanner g_together = new Scanner(SubstitutionCracker2.cipher);
while(g_together.hasNext()){
String next = g_together.next();
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
new int[]{_t,_o,_e,_t,_h,_e,_r})){
SubstitutionCracker2.key[_g] = third.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_together");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_together.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_together.close();
Scanner g_night = new Scanner(SubstitutionCracker2.cipher);
while(g_night.hasNext()){
String next = g_night.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_n,_i,_h,_t})){
SubstitutionCracker2.key[_g] = third.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_night");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_night.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_night.close();
Scanner g_coming = new Scanner(SubstitutionCracker2.cipher);
while(g_coming.hasNext()){
String next = g_coming.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_c,_o,_m,_i,_n})){
SubstitutionCracker2.key[_g] = sixth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_coming");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_coming.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_coming.close();
Scanner g_gone = new Scanner(SubstitutionCracker2.cipher);
while(g_gone.hasNext()){
String next = g_gone.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_n,_e})){
SubstitutionCracker2.key[_g] = first.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_gone");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_gone.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_gone.close();
Scanner g_general = new Scanner(SubstitutionCracker2.cipher);
while(g_general.hasNext()){
String next = g_general.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_e,_n,_e,_r,_a,_l})){
SubstitutionCracker2.key[_g] = first.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_general");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_general.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_general.close();
Scanner g_light = new Scanner(SubstitutionCracker2.cipher);
while(g_light.hasNext()){
String next = g_light.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_l,_i,_h,_t})){
SubstitutionCracker2.key[_g] = third.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_light");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_light.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_light.close();
Scanner g_along = new Scanner(SubstitutionCracker2.cipher);
while(g_along.hasNext()){
String next = g_along.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_a,_l,_o,_n})){
SubstitutionCracker2.key[_g] = fifth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_along");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_along.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_along.close();
Scanner g_seeing = new Scanner(SubstitutionCracker2.cipher);
while(g_seeing.hasNext()){
String next = g_seeing.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_s,_e,_e,_i,_n})){
SubstitutionCracker2.key[_g] = sixth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_seeing");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_seeing.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_seeing.close();
Scanner g_during = new Scanner(SubstitutionCracker2.cipher);
while(g_during.hasNext()){
String next = g_during.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_d,_u,_r,_i,_n})){
SubstitutionCracker2.key[_g] = sixth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_during");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_during.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_during.close();
Scanner g_sitting = new Scanner(SubstitutionCracker2.cipher);
while(g_sitting.hasNext()){
String next = g_sitting.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_s,_i,_t,_t,_i,_n})){
SubstitutionCracker2.key[_g] = seventh.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_sitting");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_sitting.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_sitting.close();
Scanner g_standing = new Scanner(SubstitutionCracker2.cipher);
while(g_standing.hasNext()){
String next = g_standing.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth,seventh},
new int[]{_s,_t,_a,_n,_d,_i,_n})){
SubstitutionCracker2.key[_g] = eighth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_standing");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_standing.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_standing.close();
Scanner g_strong = new Scanner(SubstitutionCracker2.cipher);
while(g_strong.hasNext()){
String next = g_strong.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_s,_t,_r,_o,_n})){
SubstitutionCracker2.key[_g] = sixth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_strong");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_strong.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_strong.close();
Scanner g_sight = new Scanner(SubstitutionCracker2.cipher);
while(g_sight.hasNext()){
String next = g_sight.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_s,_i,_h,_t})){
SubstitutionCracker2.key[_g] = third.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_sight");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_sight.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_sight.close();
Scanner g_feeling = new Scanner(SubstitutionCracker2.cipher);
while(g_feeling.hasNext()){
String next = g_feeling.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_f,_e,_e,_l,_i,_n})){
SubstitutionCracker2.key[_g] = seventh.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_feeling");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_feeling.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_feeling.close();
Scanner g_morning = new Scanner(SubstitutionCracker2.cipher);
while(g_morning.hasNext()){
String next = g_morning.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_m,_o,_r,_n,_i,_n})){
SubstitutionCracker2.key[_g] = seventh.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_morning");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_morning.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_morning.close();
Scanner g_large = new Scanner(SubstitutionCracker2.cipher);
while(g_large.hasNext()){
String next = g_large.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_l,_a,_r,_e})){
SubstitutionCracker2.key[_g] = fourth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_large");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_large.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_large.close();
Scanner g_daughter = new Scanner(SubstitutionCracker2.cipher);
while(g_daughter.hasNext()){
String next = g_daughter.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh,eighth},
new int[]{_d,_a,_u,_h,_t,_e,_r})){
SubstitutionCracker2.key[_g] = fourth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_daughter");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_daughter.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_daughter.close();
Scanner g_strange = new Scanner(SubstitutionCracker2.cipher);
while(g_strange.hasNext()){
String next = g_strange.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh},
new int[]{_s,_t,_r,_a,_n,_e})){
SubstitutionCracker2.key[_g] = sixth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_strange");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_strange.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_strange.close();
Scanner g_gathered = new Scanner(SubstitutionCracker2.cipher);
while(g_gathered.hasNext()){
String next = g_gathered.next();
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
new int[]{_a,_t,_h,_e,_r,_e,_d})){
SubstitutionCracker2.key[_g] = first.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_gathered");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_gathered.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_gathered.close();
Scanner g_ing = new Scanner(SubstitutionCracker2.cipher);
while(g_ing.hasNext()){
String next = g_ing.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_i,_n})){
SubstitutionCracker2.key[_g] = third.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_ing");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_ing.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_ing.close();
Scanner g_strength = new Scanner(SubstitutionCracker2.cipher);
while(g_strength.hasNext()){
String next = g_strength.next();
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
new int[]{_s,_t,_r,_e,_n,_t,_h})){
SubstitutionCracker2.key[_g] = sixth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_strength");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_strength.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_strength.close();
Scanner g_longer = new Scanner(SubstitutionCracker2.cipher);
while(g_longer.hasNext()){
String next = g_longer.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_l,_o,_n,_e,_r})){
SubstitutionCracker2.key[_g] = fourth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_longer");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_longer.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_longer.close();
Scanner g_doing = new Scanner(SubstitutionCracker2.cipher);
while(g_doing.hasNext()){
String next = g_doing.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_d,_o,_i,_n})){
SubstitutionCracker2.key[_g] = fifth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_doing");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_doing.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_doing.close();
Scanner g_enough = new Scanner(SubstitutionCracker2.cipher);
while(g_enough.hasNext()){
String next = g_enough.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth},
new int[]{_e,_n,_o,_u,_h})){
SubstitutionCracker2.key[_g] = fifth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_enough");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_enough.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_enough.close();
Scanner g_fight = new Scanner(SubstitutionCracker2.cipher);
while(g_fight.hasNext()){
String next = g_fight.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_f,_i,_h,_t})){
SubstitutionCracker2.key[_g] = third.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_fight");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_fight.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_fight.close();
Scanner g_turning = new Scanner(SubstitutionCracker2.cipher);
while(g_turning.hasNext()){
String next = g_turning.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_t,_u,_r,_n,_i,_n})){
SubstitutionCracker2.key[_g] = seventh.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_turning");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_turning.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_turning.close();
Scanner g_hearing = new Scanner(SubstitutionCracker2.cipher);
while(g_hearing.hasNext()){
String next = g_hearing.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_h,_e,_a,_r,_i,_n})){
SubstitutionCracker2.key[_g] = seventh.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_hearing");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_hearing.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_hearing.close();
Scanner g_drawing = new Scanner(SubstitutionCracker2.cipher);
while(g_drawing.hasNext()){
String next = g_drawing.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_d,_r,_a,_w,_i,_n})){
SubstitutionCracker2.key[_g] = seventh.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_drawing");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_drawing.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_drawing.close();
Scanner g_gate = new Scanner(SubstitutionCracker2.cipher);
while(g_gate.hasNext()){
String next = g_gate.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_t,_e})){
SubstitutionCracker2.key[_g] = first.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_gate");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_gate.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_gate.close();
Scanner g_grew = new Scanner(SubstitutionCracker2.cipher);
while(g_grew.hasNext()){
String next = g_grew.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_r,_e,_w})){
SubstitutionCracker2.key[_g] = first.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_grew");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_grew.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_grew.close();
Scanner g_getting = new Scanner(SubstitutionCracker2.cipher);
while(g_getting.hasNext()){
String next = g_getting.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(first.equalsIgnoreCase(seventh)){
if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_e,_t,_t,_i,_n})){
SubstitutionCracker2.key[_g] = first.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_getting");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_getting.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_getting.close();
Scanner g_concerning = new Scanner(SubstitutionCracker2.cipher);
while(g_concerning.hasNext()){
String next = g_concerning.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_c,_o,_n,_c,_e,_r,_n,_i,_n})){
SubstitutionCracker2.key[_g] = tenth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_concerning");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_concerning.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_concerning.close();
Scanner g_change = new Scanner(SubstitutionCracker2.cipher);
while(g_change.hasNext()){
String next = g_change.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth},
new int[]{_c,_h,_a,_n,_e})){
SubstitutionCracker2.key[_g] = fifth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_change");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_change.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_change.close();
Scanner g_running = new Scanner(SubstitutionCracker2.cipher);
while(g_running.hasNext()){
String next = g_running.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_r,_u,_n,_n,_i,_n})){
SubstitutionCracker2.key[_g] = seventh.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_running");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_running.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_running.close();
Scanner g_single = new Scanner(SubstitutionCracker2.cipher);
while(g_single.hasNext()){
String next = g_single.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_s,_i,_n,_l,_e})){
SubstitutionCracker2.key[_g] = fourth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_single");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_single.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_single.close();
Scanner g_sought = new Scanner(SubstitutionCracker2.cipher);
while(g_sought.hasNext()){
String next = g_sought.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_s,_o,_u,_h,_t})){
SubstitutionCracker2.key[_g] = fourth.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_sought");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_sought.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_sought.close();
Scanner g_holding = new Scanner(SubstitutionCracker2.cipher);
while(g_holding.hasNext()){
String next = g_holding.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_h,_o,_l,_d,_i,_n})){
SubstitutionCracker2.key[_g] = seventh.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_holding");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_holding.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_holding.close();
Scanner g_ought = new Scanner(SubstitutionCracker2.cipher);
while(g_ought.hasNext()){
String next = g_ought.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_o,_u,_h,_t})){
SubstitutionCracker2.key[_g] = third.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_ought");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_ought.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_ought.close();
Scanner g_waiting = new Scanner(SubstitutionCracker2.cipher);
while(g_waiting.hasNext()){
String next = g_waiting.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_w,_a,_i,_t,_i,_n})){
SubstitutionCracker2.key[_g] = seventh.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_waiting");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_waiting.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasG){
g_waiting.close();
Scanner g_angel = new Scanner(SubstitutionCracker2.cipher);
while(g_angel.hasNext()){
String next = g_angel.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_a,_n,_e,_l})){
SubstitutionCracker2.key[_g] = third.toLowerCase();
SubstitutionCracker2.hasG=true;
System.err.println("SubstitutionCracker2.hasG=true; via Scanner g_angel");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

g_angel.close();
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
