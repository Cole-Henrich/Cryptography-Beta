package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan19K{
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

public Scan19K(){
System.err.println("new Scan19K");


Scanner k_like = new Scanner(SubstitutionCracker2.cipher);
while(k_like.hasNext()){
String next = k_like.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_l,_i,_e})){
SubstitutionCracker2.key[_k] = third.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_like");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_like.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_like.close();
Scanner k_know = new Scanner(SubstitutionCracker2.cipher);
while(k_know.hasNext()){
String next = k_know.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_n,_o,_w})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_know");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_know.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_know.close();
Scanner k_make = new Scanner(SubstitutionCracker2.cipher);
while(k_make.hasNext()){
String next = k_make.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_m,_a,_e})){
SubstitutionCracker2.key[_k] = third.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_make");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_make.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_make.close();
Scanner k_take = new Scanner(SubstitutionCracker2.cipher);
while(k_take.hasNext()){
String next = k_take.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_t,_a,_e})){
SubstitutionCracker2.key[_k] = third.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_take");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_take.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_take.close();
Scanner k_king = new Scanner(SubstitutionCracker2.cipher);
while(k_king.hasNext()){
String next = k_king.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_n,_g})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_king");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_king.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_king.close();
Scanner k_back = new Scanner(SubstitutionCracker2.cipher);
while(k_back.hasNext()){
String next = k_back.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_b,_a,_c})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_back");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_back.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_back.close();
Scanner k_took = new Scanner(SubstitutionCracker2.cipher);
while(k_took.hasNext()){
String next = k_took.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_t,_o,_o})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_took");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_took.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_took.close();
Scanner k_looked = new Scanner(SubstitutionCracker2.cipher);
while(k_looked.hasNext()){
String next = k_looked.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_l,_o,_o,_e,_d})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_looked");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_looked.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_looked.close();
Scanner k_think = new Scanner(SubstitutionCracker2.cipher);
while(k_think.hasNext()){
String next = k_think.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_t,_h,_i,_n})){
SubstitutionCracker2.key[_k] = fifth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_think");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_think.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_think.close();
Scanner k_book = new Scanner(SubstitutionCracker2.cipher);
while(k_book.hasNext()){
String next = k_book.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_b,_o,_o})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_book");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_book.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_book.close();
Scanner k_look = new Scanner(SubstitutionCracker2.cipher);
while(k_look.hasNext()){
String next = k_look.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_l,_o,_o})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_look");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_look.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_look.close();
Scanner k_asked = new Scanner(SubstitutionCracker2.cipher);
while(k_asked.hasNext()){
String next = k_asked.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_a,_s,_e,_d})){
SubstitutionCracker2.key[_k] = third.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_asked");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_asked.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_asked.close();
Scanner k_knew = new Scanner(SubstitutionCracker2.cipher);
while(k_knew.hasNext()){
String next = k_knew.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_n,_e,_w})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_knew");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_knew.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_knew.close();
Scanner k_work = new Scanner(SubstitutionCracker2.cipher);
while(k_work.hasNext()){
String next = k_work.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_w,_o,_r})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_work");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_work.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_work.close();
Scanner k_taken = new Scanner(SubstitutionCracker2.cipher);
while(k_taken.hasNext()){
String next = k_taken.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_t,_a,_e,_n})){
SubstitutionCracker2.key[_k] = third.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_taken");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_taken.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_taken.close();
Scanner k_black = new Scanner(SubstitutionCracker2.cipher);
while(k_black.hasNext()){
String next = k_black.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_b,_l,_a,_c})){
SubstitutionCracker2.key[_k] = fifth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_black");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_black.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_black.close();
Scanner k_looking = new Scanner(SubstitutionCracker2.cipher);
while(k_looking.hasNext()){
String next = k_looking.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_l,_o,_o,_i,_n,_g})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_looking");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_looking.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_looking.close();
Scanner k_speak = new Scanner(SubstitutionCracker2.cipher);
while(k_speak.hasNext()){
String next = k_speak.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_s,_p,_e,_a})){
SubstitutionCracker2.key[_k] = fifth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_speak");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_speak.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_speak.close();
Scanner k_keep = new Scanner(SubstitutionCracker2.cipher);
while(k_keep.hasNext()){
String next = k_keep.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_e,_p})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_keep");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_keep.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_keep.close();
Scanner k_spoke = new Scanner(SubstitutionCracker2.cipher);
while(k_spoke.hasNext()){
String next = k_spoke.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_s,_p,_o,_e})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_spoke");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_spoke.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_spoke.close();
Scanner k_taking = new Scanner(SubstitutionCracker2.cipher);
while(k_taking.hasNext()){
String next = k_taking.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_t,_a,_i,_n,_g})){
SubstitutionCracker2.key[_k] = third.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_taking");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_taking.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_taking.close();
Scanner k_ask = new Scanner(SubstitutionCracker2.cipher);
while(k_ask.hasNext()){
String next = k_ask.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_a,_s})){
SubstitutionCracker2.key[_k] = third.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_ask");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_ask.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_ask.close();
Scanner k_kept = new Scanner(SubstitutionCracker2.cipher);
while(k_kept.hasNext()){
String next = k_kept.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_p,_t})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_kept");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_kept.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_kept.close();
Scanner k_known = new Scanner(SubstitutionCracker2.cipher);
while(k_known.hasNext()){
String next = k_known.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_n,_o,_w,_n})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_known");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_known.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_known.close();
Scanner k_walked = new Scanner(SubstitutionCracker2.cipher);
while(k_walked.hasNext()){
String next = k_walked.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_w,_a,_l,_e,_d})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_walked");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_walked.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_walked.close();
Scanner k_making = new Scanner(SubstitutionCracker2.cipher);
while(k_making.hasNext()){
String next = k_making.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_m,_a,_i,_n,_g})){
SubstitutionCracker2.key[_k] = third.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_making");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_making.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_making.close();
Scanner k_talk = new Scanner(SubstitutionCracker2.cipher);
while(k_talk.hasNext()){
String next = k_talk.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_t,_a,_l})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_talk");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_talk.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_talk.close();
Scanner k_kya = new Scanner(SubstitutionCracker2.cipher);
while(k_kya.hasNext()){
String next = k_kya.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_y,_a})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_kya");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_kya.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_kya.close();
Scanner k_seek = new Scanner(SubstitutionCracker2.cipher);
while(k_seek.hasNext()){
String next = k_seek.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_s,_e,_e})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_seek");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_seek.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_seek.close();
Scanner k_wicked = new Scanner(SubstitutionCracker2.cipher);
while(k_wicked.hasNext()){
String next = k_wicked.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_w,_i,_c,_e,_d})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_wicked");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_wicked.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_wicked.close();
Scanner k_kings = new Scanner(SubstitutionCracker2.cipher);
while(k_kings.hasNext()){
String next = k_kings.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_i,_n,_g,_s})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_kings");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_kings.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_kings.close();
Scanner k_kill = new Scanner(SubstitutionCracker2.cipher);
while(k_kill.hasNext()){
String next = k_kill.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_l,_l})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_kill");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_kill.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_kill.close();
Scanner k_spoken = new Scanner(SubstitutionCracker2.cipher);
while(k_spoken.hasNext()){
String next = k_spoken.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_s,_p,_o,_e,_n})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_spoken");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_spoken.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_spoken.close();
Scanner k_walk = new Scanner(SubstitutionCracker2.cipher);
while(k_walk.hasNext()){
String next = k_walk.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_w,_a,_l})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_walk");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_walk.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_walk.close();
Scanner k_works = new Scanner(SubstitutionCracker2.cipher);
while(k_works.hasNext()){
String next = k_works.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_w,_o,_r,_s})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_works");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_works.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_works.close();
Scanner k_talking = new Scanner(SubstitutionCracker2.cipher);
while(k_talking.hasNext()){
String next = k_talking.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_t,_a,_l,_i,_n,_g})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_talking");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_talking.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_talking.close();
Scanner k_kind = new Scanner(SubstitutionCracker2.cipher);
while(k_kind.hasNext()){
String next = k_kind.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_n,_d})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_kind");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_kind.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_kind.close();
Scanner k_killed = new Scanner(SubstitutionCracker2.cipher);
while(k_killed.hasNext()){
String next = k_killed.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_i,_l,_l,_e,_d})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_killed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_killed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_killed.close();
Scanner k_dark = new Scanner(SubstitutionCracker2.cipher);
while(k_dark.hasNext()){
String next = k_dark.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_d,_a,_r})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_dark");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_dark.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_dark.close();
Scanner k_thank = new Scanner(SubstitutionCracker2.cipher);
while(k_thank.hasNext()){
String next = k_thank.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_t,_h,_a,_n})){
SubstitutionCracker2.key[_k] = fifth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_thank");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_thank.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_thank.close();
Scanner k_struck = new Scanner(SubstitutionCracker2.cipher);
while(k_struck.hasNext()){
String next = k_struck.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_s,_t,_r,_u,_c})){
SubstitutionCracker2.key[_k] = sixth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_struck");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_struck.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_struck.close();
Scanner k_thinking = new Scanner(SubstitutionCracker2.cipher);
while(k_thinking.hasNext()){
String next = k_thinking.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth,seventh,eighth},
new int[]{_t,_h,_i,_n,_i,_n,_g})){
SubstitutionCracker2.key[_k] = fifth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_thinking");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_thinking.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_thinking.close();
Scanner k_speaking = new Scanner(SubstitutionCracker2.cipher);
while(k_speaking.hasNext()){
String next = k_speaking.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth,seventh,eighth},
new int[]{_s,_p,_e,_a,_i,_n,_g})){
SubstitutionCracker2.key[_k] = fifth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_speaking");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_speaking.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_speaking.close();
Scanner k_knowing = new Scanner(SubstitutionCracker2.cipher);
while(k_knowing.hasNext()){
String next = k_knowing.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_n,_o,_w,_i,_n,_g})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_knowing");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_knowing.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_knowing.close();
Scanner k_working = new Scanner(SubstitutionCracker2.cipher);
while(k_working.hasNext()){
String next = k_working.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_w,_o,_r,_i,_n,_g})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_working");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_working.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_working.close();
Scanner k_kingdom = new Scanner(SubstitutionCracker2.cipher);
while(k_kingdom.hasNext()){
String next = k_kingdom.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_i,_n,_g,_d,_o,_m})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_kingdom");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_kingdom.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_kingdom.close();
Scanner k_broken = new Scanner(SubstitutionCracker2.cipher);
while(k_broken.hasNext()){
String next = k_broken.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_b,_r,_o,_e,_n})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_broken");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_broken.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_broken.close();
Scanner k_break = new Scanner(SubstitutionCracker2.cipher);
while(k_break.hasNext()){
String next = k_break.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_b,_r,_e,_a})){
SubstitutionCracker2.key[_k] = fifth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_break");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_break.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_break.close();
Scanner k_drink = new Scanner(SubstitutionCracker2.cipher);
while(k_drink.hasNext()){
String next = k_drink.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_d,_r,_i,_n})){
SubstitutionCracker2.key[_k] = fifth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_drink");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_drink.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_drink.close();
Scanner k_makes = new Scanner(SubstitutionCracker2.cipher);
while(k_makes.hasNext()){
String next = k_makes.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_m,_a,_e,_s})){
SubstitutionCracker2.key[_k] = third.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_makes");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_makes.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_makes.close();
Scanner k_knowledge = new Scanner(SubstitutionCracker2.cipher);
while(k_knowledge.hasNext()){
String next = k_knowledge.next();
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
new int[]{_n,_o,_w,_l,_e,_d,_g,_e})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_knowledge");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_knowledge.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_knowledge.close();
Scanner k_shook = new Scanner(SubstitutionCracker2.cipher);
while(k_shook.hasNext()){
String next = k_shook.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_s,_h,_o,_o})){
SubstitutionCracker2.key[_k] = fifth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_shook");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_shook.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_shook.close();
Scanner k_talked = new Scanner(SubstitutionCracker2.cipher);
while(k_talked.hasNext()){
String next = k_talked.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_t,_a,_l,_e,_d})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_talked");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_talked.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_talked.close();
Scanner k_broke = new Scanner(SubstitutionCracker2.cipher);
while(k_broke.hasNext()){
String next = k_broke.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_b,_r,_o,_e})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_broke");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_broke.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_broke.close();
Scanner k_asking = new Scanner(SubstitutionCracker2.cipher);
while(k_asking.hasNext()){
String next = k_asking.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_a,_s,_i,_n,_g})){
SubstitutionCracker2.key[_k] = third.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_asking");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_asking.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_asking.close();
Scanner k_knows = new Scanner(SubstitutionCracker2.cipher);
while(k_knows.hasNext()){
String next = k_knows.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_n,_o,_w,_s})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_knows");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_knows.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_knows.close();
Scanner k_worked = new Scanner(SubstitutionCracker2.cipher);
while(k_worked.hasNext()){
String next = k_worked.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_w,_o,_r,_e,_d})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_worked");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_worked.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_worked.close();
Scanner k_week = new Scanner(SubstitutionCracker2.cipher);
while(k_week.hasNext()){
String next = k_week.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_w,_e,_e})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_week");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_week.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_week.close();
Scanner k_weeks = new Scanner(SubstitutionCracker2.cipher);
while(k_weeks.hasNext()){
String next = k_weeks.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_w,_e,_e,_s})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_weeks");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_weeks.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_weeks.close();
Scanner k_walking = new Scanner(SubstitutionCracker2.cipher);
while(k_walking.hasNext()){
String next = k_walking.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_w,_a,_l,_i,_n,_g})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_walking");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_walking.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_walking.close();
Scanner k_keeping = new Scanner(SubstitutionCracker2.cipher);
while(k_keeping.hasNext()){
String next = k_keeping.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_e,_e,_p,_i,_n,_g})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_keeping");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_keeping.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_keeping.close();
Scanner k_ark = new Scanner(SubstitutionCracker2.cipher);
while(k_ark.hasNext()){
String next = k_ark.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_a,_r})){
SubstitutionCracker2.key[_k] = third.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_ark");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_ark.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_ark.close();
Scanner k_kissed = new Scanner(SubstitutionCracker2.cipher);
while(k_kissed.hasNext()){
String next = k_kissed.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_i,_s,_s,_e,_d})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_kissed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_kissed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_kissed.close();
Scanner k_likely = new Scanner(SubstitutionCracker2.cipher);
while(k_likely.hasNext()){
String next = k_likely.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_l,_i,_e,_l,_y})){
SubstitutionCracker2.key[_k] = third.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_likely");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_likely.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_likely.close();
Scanner k_workers = new Scanner(SubstitutionCracker2.cipher);
while(k_workers.hasNext()){
String next = k_workers.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_w,_o,_r,_e,_r,_s})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_workers");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_workers.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_workers.close();
Scanner k_smoke = new Scanner(SubstitutionCracker2.cipher);
while(k_smoke.hasNext()){
String next = k_smoke.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_s,_m,_o,_e})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_smoke");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_smoke.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_smoke.close();
Scanner k_looks = new Scanner(SubstitutionCracker2.cipher);
while(k_looks.hasNext()){
String next = k_looks.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_l,_o,_o,_s})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_looks");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_looks.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_looks.close();
Scanner k_attack = new Scanner(SubstitutionCracker2.cipher);
while(k_attack.hasNext()){
String next = k_attack.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_a,_t,_t,_a,_c})){
SubstitutionCracker2.key[_k] = sixth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_attack");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_attack.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_attack.close();
Scanner k_thanks = new Scanner(SubstitutionCracker2.cipher);
while(k_thanks.hasNext()){
String next = k_thanks.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth},
new int[]{_t,_h,_a,_n,_s})){
SubstitutionCracker2.key[_k] = fifth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_thanks");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_thanks.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_thanks.close();
Scanner k_strike = new Scanner(SubstitutionCracker2.cipher);
while(k_strike.hasNext()){
String next = k_strike.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth},
new int[]{_s,_t,_r,_i,_e})){
SubstitutionCracker2.key[_k] = fifth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_strike");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_strike.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_strike.close();
Scanner k_darkness = new Scanner(SubstitutionCracker2.cipher);
while(k_darkness.hasNext()){
String next = k_darkness.next();
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
new int[]{_d,_a,_r,_n,_e,_s,_s})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_darkness");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_darkness.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_darkness.close();
Scanner k_pocket = new Scanner(SubstitutionCracker2.cipher);
while(k_pocket.hasNext()){
String next = k_pocket.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_p,_o,_c,_e,_t})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_pocket");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_pocket.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_pocket.close();
Scanner k_liked = new Scanner(SubstitutionCracker2.cipher);
while(k_liked.hasNext()){
String next = k_liked.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_l,_i,_e,_d})){
SubstitutionCracker2.key[_k] = third.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_liked");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_liked.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_liked.close();
Scanner k_mark = new Scanner(SubstitutionCracker2.cipher);
while(k_mark.hasNext()){
String next = k_mark.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_m,_a,_r})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_mark");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_mark.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_mark.close();
Scanner k_neck = new Scanner(SubstitutionCracker2.cipher);
while(k_neck.hasNext()){
String next = k_neck.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_n,_e,_c})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_neck");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_neck.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_neck.close();
Scanner k_sake = new Scanner(SubstitutionCracker2.cipher);
while(k_sake.hasNext()){
String next = k_sake.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_s,_a,_e})){
SubstitutionCracker2.key[_k] = third.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_sake");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_sake.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_sake.close();
Scanner k_thick = new Scanner(SubstitutionCracker2.cipher);
while(k_thick.hasNext()){
String next = k_thick.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_t,_h,_i,_c})){
SubstitutionCracker2.key[_k] = fifth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_thick");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_thick.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_thick.close();
Scanner k_sick = new Scanner(SubstitutionCracker2.cipher);
while(k_sick.hasNext()){
String next = k_sick.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_s,_i,_c})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_sick");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_sick.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_sick.close();
Scanner k_wemmick = new Scanner(SubstitutionCracker2.cipher);
while(k_wemmick.hasNext()){
String next = k_wemmick.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_w,_e,_m,_m,_i,_c})){
SubstitutionCracker2.key[_k] = seventh.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_wemmick");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_wemmick.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_wemmick.close();
Scanner k_knoweth = new Scanner(SubstitutionCracker2.cipher);
while(k_knoweth.hasNext()){
String next = k_knoweth.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_n,_o,_w,_e,_t,_h})){
SubstitutionCracker2.key[_k] = first.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_knoweth");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_knoweth.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_knoweth.close();
Scanner k_folks = new Scanner(SubstitutionCracker2.cipher);
while(k_folks.hasNext()){
String next = k_folks.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_f,_o,_l,_s})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_folks");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_folks.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasK){
k_folks.close();
Scanner k_shaking = new Scanner(SubstitutionCracker2.cipher);
while(k_shaking.hasNext()){
String next = k_shaking.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_s,_h,_a,_i,_n,_g})){
SubstitutionCracker2.key[_k] = fourth.toLowerCase();
SubstitutionCracker2.hasK=true;
System.err.println("SubstitutionCracker2.hasK=true; via Scanner k_shaking");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

k_shaking.close();
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
