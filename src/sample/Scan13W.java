package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan13W{
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

public Scan13W(){
System.err.println("new Scan13W");


Scanner w_was = new Scanner(SubstitutionCracker2.cipher);
while(w_was.hasNext()){
String next = w_was.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_a,_s})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_was");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_was.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_was.close();
Scanner w_with = new Scanner(SubstitutionCracker2.cipher);
while(w_with.hasNext()){
String next = w_with.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_t,_h})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_with");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_with.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_with.close();
Scanner w_were = new Scanner(SubstitutionCracker2.cipher);
while(w_were.hasNext()){
String next = w_were.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_r,_e})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_were");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_were.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_were.close();
Scanner w_when = new Scanner(SubstitutionCracker2.cipher);
while(w_when.hasNext()){
String next = w_when.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_h,_e,_n})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_when");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_when.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_when.close();
Scanner w_will = new Scanner(SubstitutionCracker2.cipher);
while(w_will.hasNext()){
String next = w_will.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_l,_l})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_will");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_will.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_will.close();
Scanner w_which = new Scanner(SubstitutionCracker2.cipher);
while(w_which.hasNext()){
String next = w_which.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_h,_i,_c,_h})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_which");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_which.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_which.close();
Scanner w_we = new Scanner(SubstitutionCracker2.cipher);
while(w_we.hasNext()){
String next = w_we.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{second},
new int[]{_e})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_we");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_we.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_we.close();
Scanner w_who = new Scanner(SubstitutionCracker2.cipher);
while(w_who.hasNext()){
String next = w_who.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_h,_o})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_who");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_who.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_who.close();
Scanner w_what = new Scanner(SubstitutionCracker2.cipher);
while(w_what.hasNext()){
String next = w_what.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_h,_a,_t})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_what");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_what.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_what.close();
Scanner w_would = new Scanner(SubstitutionCracker2.cipher);
while(w_would.hasNext()){
String next = w_would.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_u,_l,_d})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_would");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_would.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_would.close();
Scanner w_now = new Scanner(SubstitutionCracker2.cipher);
while(w_now.hasNext()){
String next = w_now.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_n,_o})){
SubstitutionCracker2.key[_w] = third.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_now");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_now.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_now.close();
Scanner w_went = new Scanner(SubstitutionCracker2.cipher);
while(w_went.hasNext()){
String next = w_went.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_n,_t})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_went");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_went.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_went.close();
Scanner w_down = new Scanner(SubstitutionCracker2.cipher);
while(w_down.hasNext()){
String next = w_down.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_d,_o,_n})){
SubstitutionCracker2.key[_w] = third.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_down");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_down.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_down.close();
Scanner w_how = new Scanner(SubstitutionCracker2.cipher);
while(w_how.hasNext()){
String next = w_how.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_h,_o})){
SubstitutionCracker2.key[_w] = third.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_how");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_how.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_how.close();
Scanner w_two = new Scanner(SubstitutionCracker2.cipher);
while(w_two.hasNext()){
String next = w_two.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,third},
new int[]{_t,_o})){
SubstitutionCracker2.key[_w] = second.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_two");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_two.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_two.close();
Scanner w_own = new Scanner(SubstitutionCracker2.cipher);
while(w_own.hasNext()){
String next = w_own.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,third},
new int[]{_o,_n})){
SubstitutionCracker2.key[_w] = second.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_own");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_own.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_own.close();
Scanner w_where = new Scanner(SubstitutionCracker2.cipher);
while(w_where.hasNext()){
String next = w_where.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_h,_e,_r,_e})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_where");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_where.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_where.close();
Scanner w_without = new Scanner(SubstitutionCracker2.cipher);
while(w_without.hasNext()){
String next = w_without.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_i,_t,_h,_o,_u,_t})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_without");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_without.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_without.close();
Scanner w_saw = new Scanner(SubstitutionCracker2.cipher);
while(w_saw.hasNext()){
String next = w_saw.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_s,_a})){
SubstitutionCracker2.key[_w] = third.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_saw");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_saw.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_saw.close();
Scanner w_whom = new Scanner(SubstitutionCracker2.cipher);
while(w_whom.hasNext()){
String next = w_whom.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_h,_o,_m})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_whom");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_whom.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_whom.close();
Scanner w_new = new Scanner(SubstitutionCracker2.cipher);
while(w_new.hasNext()){
String next = w_new.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_n,_e})){
SubstitutionCracker2.key[_w] = third.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_new");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_new.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_new.close();
Scanner w_whole = new Scanner(SubstitutionCracker2.cipher);
while(w_whole.hasNext()){
String next = w_whole.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_h,_o,_l,_e})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_whole");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_whole.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_whole.close();
Scanner w_word = new Scanner(SubstitutionCracker2.cipher);
while(w_word.hasNext()){
String next = w_word.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_r,_d})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_word");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_word.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_word.close();
Scanner w_while = new Scanner(SubstitutionCracker2.cipher);
while(w_while.hasNext()){
String next = w_while.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_h,_i,_l,_e})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_while");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_while.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_while.close();
Scanner w_words = new Scanner(SubstitutionCracker2.cipher);
while(w_words.hasNext()){
String next = w_words.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_r,_d,_s})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_words");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_words.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_words.close();
Scanner w_white = new Scanner(SubstitutionCracker2.cipher);
while(w_white.hasNext()){
String next = w_white.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_h,_i,_t,_e})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_white");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_white.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_white.close();
Scanner w_few = new Scanner(SubstitutionCracker2.cipher);
while(w_few.hasNext()){
String next = w_few.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_f,_e})){
SubstitutionCracker2.key[_w] = third.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_few");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_few.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_few.close();
Scanner w_toward = new Scanner(SubstitutionCracker2.cipher);
while(w_toward.hasNext()){
String next = w_toward.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_t,_o,_a,_r,_d})){
SubstitutionCracker2.key[_w] = third.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_toward");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_toward.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_toward.close();
Scanner w_well = new Scanner(SubstitutionCracker2.cipher);
while(w_well.hasNext()){
String next = w_well.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_l,_l})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_well");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_well.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_well.close();
Scanner w_andrew = new Scanner(SubstitutionCracker2.cipher);
while(w_andrew.hasNext()){
String next = w_andrew.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_a,_n,_d,_r,_e})){
SubstitutionCracker2.key[_w] = sixth.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_andrew");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_andrew.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_andrew.close();
Scanner w_want = new Scanner(SubstitutionCracker2.cipher);
while(w_want.hasNext()){
String next = w_want.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_n,_t})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_want");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_want.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_want.close();
Scanner w_whether = new Scanner(SubstitutionCracker2.cipher);
while(w_whether.hasNext()){
String next = w_whether.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_h,_e,_t,_h,_e,_r})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_whether");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_whether.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_whether.close();
Scanner w_woman = new Scanner(SubstitutionCracker2.cipher);
while(w_woman.hasNext()){
String next = w_woman.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_m,_a,_n})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_woman");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_woman.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_woman.close();
Scanner w_law = new Scanner(SubstitutionCracker2.cipher);
while(w_law.hasNext()){
String next = w_law.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_l,_a})){
SubstitutionCracker2.key[_w] = third.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_law");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_law.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_law.close();
Scanner w_whose = new Scanner(SubstitutionCracker2.cipher);
while(w_whose.hasNext()){
String next = w_whose.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_h,_o,_s,_e})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_whose");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_whose.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_whose.close();
Scanner w_world = new Scanner(SubstitutionCracker2.cipher);
while(w_world.hasNext()){
String next = w_world.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_r,_l,_d})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_world");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_world.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_world.close();
Scanner w_war = new Scanner(SubstitutionCracker2.cipher);
while(w_war.hasNext()){
String next = w_war.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_a,_r})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_war");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_war.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_war.close();
Scanner w_answered = new Scanner(SubstitutionCracker2.cipher);
while(w_answered.hasNext()){
String next = w_answered.next();
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
new int[]{_a,_n,_s,_e,_r,_e,_d})){
SubstitutionCracker2.key[_w] = fourth.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_answered");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_answered.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_answered.close();
Scanner w_wife = new Scanner(SubstitutionCracker2.cipher);
while(w_wife.hasNext()){
String next = w_wife.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_f,_e})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_wife");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_wife.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_wife.close();
Scanner w_moscow = new Scanner(SubstitutionCracker2.cipher);
while(w_moscow.hasNext()){
String next = w_moscow.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_m,_o,_s,_c,_o})){
SubstitutionCracker2.key[_w] = sixth.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_moscow");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_moscow.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_moscow.close();
Scanner w_within = new Scanner(SubstitutionCracker2.cipher);
while(w_within.hasNext()){
String next = w_within.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_i,_t,_h,_i,_n})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_within");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_within.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_within.close();
Scanner w_wanted = new Scanner(SubstitutionCracker2.cipher);
while(w_wanted.hasNext()){
String next = w_wanted.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_a,_n,_t,_e,_d})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_wanted");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_wanted.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_wanted.close();
Scanner w_women = new Scanner(SubstitutionCracker2.cipher);
while(w_women.hasNext()){
String next = w_women.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_m,_e,_n})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_women");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_women.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_women.close();
Scanner w_followed = new Scanner(SubstitutionCracker2.cipher);
while(w_followed.hasNext()){
String next = w_followed.next();
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
new int[]{_f,_o,_l,_l,_o,_e,_d})){
SubstitutionCracker2.key[_w] = sixth.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_followed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_followed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_followed.close();
Scanner w_water = new Scanner(SubstitutionCracker2.cipher);
while(w_water.hasNext()){
String next = w_water.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_a,_t,_e,_r})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_water");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_water.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_water.close();
Scanner w_dwell = new Scanner(SubstitutionCracker2.cipher);
while(w_dwell.hasNext()){
String next = w_dwell.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_d,_e,_l,_l})){
SubstitutionCracker2.key[_w] = second.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_dwell");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_dwell.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_dwell.close();
Scanner w_towards = new Scanner(SubstitutionCracker2.cipher);
while(w_towards.hasNext()){
String next = w_towards.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_t,_o,_a,_r,_d,_s})){
SubstitutionCracker2.key[_w] = third.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_towards");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_towards.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_towards.close();
Scanner w_wilt = new Scanner(SubstitutionCracker2.cipher);
while(w_wilt.hasNext()){
String next = w_wilt.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_l,_t})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_wilt");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_wilt.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_wilt.close();
Scanner w_written = new Scanner(SubstitutionCracker2.cipher);
while(w_written.hasNext()){
String next = w_written.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_r,_i,_t,_t,_e,_n})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_written");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_written.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_written.close();
Scanner w_answer = new Scanner(SubstitutionCracker2.cipher);
while(w_answer.hasNext()){
String next = w_answer.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_a,_n,_s,_e,_r})){
SubstitutionCracker2.key[_w] = fourth.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_answer");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_answer.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_answer.close();
Scanner w_dwelt = new Scanner(SubstitutionCracker2.cipher);
while(w_dwelt.hasNext()){
String next = w_dwelt.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_d,_e,_l,_t})){
SubstitutionCracker2.key[_w] = second.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_dwelt");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_dwelt.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_dwelt.close();
Scanner w_wish = new Scanner(SubstitutionCracker2.cipher);
while(w_wish.hasNext()){
String next = w_wish.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_s,_h})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_wish");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_wish.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_wish.close();
Scanner w_shew = new Scanner(SubstitutionCracker2.cipher);
while(w_shew.hasNext()){
String next = w_shew.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_s,_h,_e})){
SubstitutionCracker2.key[_w] = fourth.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_shew");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_shew.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_shew.close();
Scanner w_wise = new Scanner(SubstitutionCracker2.cipher);
while(w_wise.hasNext()){
String next = w_wise.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_s,_e})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_wise");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_wise.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_wise.close();
Scanner w_wisdom = new Scanner(SubstitutionCracker2.cipher);
while(w_wisdom.hasNext()){
String next = w_wisdom.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_i,_s,_d,_o,_m})){
SubstitutionCracker2.key[_w] = first.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_wisdom");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_wisdom.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_wisdom.close();
Scanner w_drew = new Scanner(SubstitutionCracker2.cipher);
while(w_drew.hasNext()){
String next = w_drew.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_d,_r,_e})){
SubstitutionCracker2.key[_w] = fourth.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_drew");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_drew.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_drew.close();
Scanner w_follow = new Scanner(SubstitutionCracker2.cipher);
while(w_follow.hasNext()){
String next = w_follow.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_f,_o,_l,_l,_o})){
SubstitutionCracker2.key[_w] = sixth.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_follow");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_follow.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasW){
w_follow.close();
Scanner w_show = new Scanner(SubstitutionCracker2.cipher);
while(w_show.hasNext()){
String next = w_show.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_s,_h,_o})){
SubstitutionCracker2.key[_w] = fourth.toLowerCase();
SubstitutionCracker2.hasW=true;
System.err.println("SubstitutionCracker2.hasW=true; via Scanner w_show");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

w_show.close();
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
