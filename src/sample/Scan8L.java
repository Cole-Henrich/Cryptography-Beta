package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan8L{
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

public Scan8L(){
System.err.println("new Scan8L");


Scanner l_shall = new Scanner(SubstitutionCracker2.cipher);
while(l_shall.hasNext()){
String next = l_shall.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(fourth.equalsIgnoreCase(fifth)){
if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_s,_h,_a})){
SubstitutionCracker2.key[_l] = fourth.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_shall");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_shall.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_shall.close();
Scanner l_all = new Scanner(SubstitutionCracker2.cipher);
while(l_all.hasNext()){
String next = l_all.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(second.equalsIgnoreCase(third)){
if(massCalc_notAnyOther(new String[]{first},
new int[]{_a})){
SubstitutionCracker2.key[_l] = second.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_all");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_all.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_all.close();
Scanner l_lord = new Scanner(SubstitutionCracker2.cipher);
while(l_lord.hasNext()){
String next = l_lord.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_r,_d})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_lord");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_lord.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_lord.close();
Scanner l_let = new Scanner(SubstitutionCracker2.cipher);
while(l_let.hasNext()){
String next = l_let.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_e,_t})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_let");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_let.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_let.close();
Scanner l_also = new Scanner(SubstitutionCracker2.cipher);
while(l_also.hasNext()){
String next = l_also.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_a,_s,_o})){
SubstitutionCracker2.key[_l] = second.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_also");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_also.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_also.close();
Scanner l_shalt = new Scanner(SubstitutionCracker2.cipher);
while(l_shalt.hasNext()){
String next = l_shalt.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_s,_h,_a,_t})){
SubstitutionCracker2.key[_l] = fourth.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_shalt");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_shalt.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_shalt.close();
Scanner l_old = new Scanner(SubstitutionCracker2.cipher);
while(l_old.hasNext()){
String next = l_old.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,third},
new int[]{_o,_d})){
SubstitutionCracker2.key[_l] = second.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_old");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_old.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_old.close();
Scanner l_little = new Scanner(SubstitutionCracker2.cipher);
while(l_little.hasNext()){
String next = l_little.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(first.equalsIgnoreCase(fifth)){
if(massCalc_notAnyOther(new String[]{second,third,fourth,sixth},
new int[]{_i,_t,_t,_e})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_little");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_little.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_little.close();
Scanner l_told = new Scanner(SubstitutionCracker2.cipher);
while(l_told.hasNext()){
String next = l_told.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_t,_o,_d})){
SubstitutionCracker2.key[_l] = third.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_told");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_told.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_told.close();
Scanner l_still = new Scanner(SubstitutionCracker2.cipher);
while(l_still.hasNext()){
String next = l_still.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(fourth.equalsIgnoreCase(fifth)){
if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_s,_t,_i})){
SubstitutionCracker2.key[_l] = fourth.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_still");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_still.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_still.close();
Scanner l_land = new Scanner(SubstitutionCracker2.cipher);
while(l_land.hasNext()){
String next = l_land.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_n,_d})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_land");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_land.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_land.close();
Scanner l_tell = new Scanner(SubstitutionCracker2.cipher);
while(l_tell.hasNext()){
String next = l_tell.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(third.equalsIgnoreCase(fourth)){
if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_t,_e})){
SubstitutionCracker2.key[_l] = third.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_tell");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_tell.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_tell.close();
Scanner l_israel = new Scanner(SubstitutionCracker2.cipher);
while(l_israel.hasNext()){
String next = l_israel.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_i,_s,_r,_a,_e})){
SubstitutionCracker2.key[_l] = sixth.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_israel");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_israel.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_israel.close();
Scanner l_last = new Scanner(SubstitutionCracker2.cipher);
while(l_last.hasNext()){
String next = l_last.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_s,_t})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_last");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_last.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_last.close();
Scanner l_till = new Scanner(SubstitutionCracker2.cipher);
while(l_till.hasNext()){
String next = l_till.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(third.equalsIgnoreCase(fourth)){
if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_t,_i})){
SubstitutionCracker2.key[_l] = third.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_till");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_till.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_till.close();
Scanner l_held = new Scanner(SubstitutionCracker2.cipher);
while(l_held.hasNext()){
String next = l_held.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_h,_e,_d})){
SubstitutionCracker2.key[_l] = third.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_held");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_held.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_held.close();
Scanner l_hold = new Scanner(SubstitutionCracker2.cipher);
while(l_hold.hasNext()){
String next = l_hold.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_h,_o,_d})){
SubstitutionCracker2.key[_l] = third.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_hold");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_hold.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_hold.close();
Scanner l_laid = new Scanner(SubstitutionCracker2.cipher);
while(l_laid.hasNext()){
String next = l_laid.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_i,_d})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_laid");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_laid.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_laid.close();
Scanner l_less = new Scanner(SubstitutionCracker2.cipher);
while(l_less.hasNext()){
String next = l_less.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_s,_s})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_less");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_less.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_less.close();
Scanner l_lest = new Scanner(SubstitutionCracker2.cipher);
while(l_lest.hasNext()){
String next = l_lest.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_s,_t})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_lest");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_lest.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_lest.close();
Scanner l_alone = new Scanner(SubstitutionCracker2.cipher);
while(l_alone.hasNext()){
String next = l_alone.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_a,_o,_n,_e})){
SubstitutionCracker2.key[_l] = second.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_alone");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_alone.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_alone.close();
Scanner l_led = new Scanner(SubstitutionCracker2.cipher);
while(l_led.hasNext()){
String next = l_led.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_e,_d})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_led");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_led.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_led.close();
Scanner l_least = new Scanner(SubstitutionCracker2.cipher);
while(l_least.hasNext()){
String next = l_least.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_e,_a,_s,_t})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_least");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_least.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_least.close();
Scanner l_soldiers = new Scanner(SubstitutionCracker2.cipher);
while(l_soldiers.hasNext()){
String next = l_soldiers.next();
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
new int[]{_s,_o,_d,_i,_e,_r,_s})){
SubstitutionCracker2.key[_l] = third.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_soldiers");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_soldiers.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_soldiers.close();
Scanner l_letter = new Scanner(SubstitutionCracker2.cipher);
while(l_letter.hasNext()){
String next = l_letter.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_e,_t,_t,_e,_r})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_letter");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_letter.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_letter.close();
Scanner l_lost = new Scanner(SubstitutionCracker2.cipher);
while(l_lost.hasNext()){
String next = l_lost.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_s,_t})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_lost");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_lost.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_lost.close();
Scanner l_else = new Scanner(SubstitutionCracker2.cipher);
while(l_else.hasNext()){
String next = l_else.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_e,_s,_e})){
SubstitutionCracker2.key[_l] = second.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_else");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_else.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_else.close();
Scanner l_lot = new Scanner(SubstitutionCracker2.cipher);
while(l_lot.hasNext()){
String next = l_lot.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_o,_t})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_lot");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_lot.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_lot.close();
Scanner l_altar = new Scanner(SubstitutionCracker2.cipher);
while(l_altar.hasNext()){
String next = l_altar.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_a,_t,_a,_r})){
SubstitutionCracker2.key[_l] = second.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_altar");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_altar.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_altar.close();
Scanner l_later = new Scanner(SubstitutionCracker2.cipher);
while(l_later.hasNext()){
String next = l_later.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_a,_t,_e,_r})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_later");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_later.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_later.close();
Scanner l_real = new Scanner(SubstitutionCracker2.cipher);
while(l_real.hasNext()){
String next = l_real.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_r,_e,_a})){
SubstitutionCracker2.key[_l] = fourth.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_real");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_real.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_real.close();
Scanner l_late = new Scanner(SubstitutionCracker2.cipher);
while(l_late.hasNext()){
String next = l_late.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_t,_e})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_late");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_late.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_late.close();
Scanner l_line = new Scanner(SubstitutionCracker2.cipher);
while(l_line.hasNext()){
String next = l_line.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_n,_e})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_line");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_line.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_line.close();
Scanner l_learned = new Scanner(SubstitutionCracker2.cipher);
while(l_learned.hasNext()){
String next = l_learned.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_e,_a,_r,_n,_e,_d})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_learned");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_learned.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_learned.close();
Scanner l_lie = new Scanner(SubstitutionCracker2.cipher);
while(l_lie.hasNext()){
String next = l_lie.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_i,_e})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_lie");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_lie.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_lie.close();
Scanner l_slain = new Scanner(SubstitutionCracker2.cipher);
while(l_slain.hasNext()){
String next = l_slain.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_s,_a,_i,_n})){
SubstitutionCracker2.key[_l] = second.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_slain");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_slain.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_slain.close();
Scanner l_lead = new Scanner(SubstitutionCracker2.cipher);
while(l_lead.hasNext()){
String next = l_lead.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_a,_d})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_lead");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_lead.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasL){
l_lead.close();
Scanner l_listened = new Scanner(SubstitutionCracker2.cipher);
while(l_listened.hasNext()){
String next = l_listened.next();
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
new int[]{_i,_s,_t,_e,_n,_e,_d})){
SubstitutionCracker2.key[_l] = first.toLowerCase();
SubstitutionCracker2.hasL=true;
System.err.println("SubstitutionCracker2.hasL=true; via Scanner l_listened");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

l_listened.close();
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
