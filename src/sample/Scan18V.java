package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan18V{
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

public Scan18V(){
System.err.println("new Scan18V");


Scanner v_have = new Scanner(SubstitutionCracker2.cipher);
while(v_have.hasNext()){
String next = v_have.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_h,_a,_e})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_have");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_have.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_have.close();
Scanner v_over = new Scanner(SubstitutionCracker2.cipher);
while(v_over.hasNext()){
String next = v_over.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_o,_e,_r})){
SubstitutionCracker2.key[_v] = second.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_over");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_over.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_over.close();
Scanner v_every = new Scanner(SubstitutionCracker2.cipher);
while(v_every.hasNext()){
String next = v_every.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_e,_e,_r,_y})){
SubstitutionCracker2.key[_v] = second.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_every");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_every.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_every.close();
Scanner v_very = new Scanner(SubstitutionCracker2.cipher);
while(v_very.hasNext()){
String next = v_very.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_r,_y})){
SubstitutionCracker2.key[_v] = first.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_very");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_very.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_very.close();
Scanner v_even = new Scanner(SubstitutionCracker2.cipher);
while(v_even.hasNext()){
String next = v_even.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_e,_e,_n})){
SubstitutionCracker2.key[_v] = second.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_even");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_even.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_even.close();
Scanner v_give = new Scanner(SubstitutionCracker2.cipher);
while(v_give.hasNext()){
String next = v_give.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_g,_i,_e})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_give");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_give.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_give.close();
Scanner v_never = new Scanner(SubstitutionCracker2.cipher);
while(v_never.hasNext()){
String next = v_never.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_n,_e,_e,_r})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_never");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_never.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_never.close();
Scanner v_having = new Scanner(SubstitutionCracker2.cipher);
while(v_having.hasNext()){
String next = v_having.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_h,_a,_i,_n,_g})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_having");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_having.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_having.close();
Scanner v_gave = new Scanner(SubstitutionCracker2.cipher);
while(v_gave.hasNext()){
String next = v_gave.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_g,_a,_e})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_gave");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_gave.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_gave.close();
Scanner v_given = new Scanner(SubstitutionCracker2.cipher);
while(v_given.hasNext()){
String next = v_given.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_g,_i,_e,_n})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_given");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_given.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_given.close();
Scanner v_love = new Scanner(SubstitutionCracker2.cipher);
while(v_love.hasNext()){
String next = v_love.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_l,_o,_e})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_love");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_love.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_love.close();
Scanner v_voice = new Scanner(SubstitutionCracker2.cipher);
while(v_voice.hasNext()){
String next = v_voice.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_i,_c,_e})){
SubstitutionCracker2.key[_v] = first.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_voice");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_voice.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_voice.close();
Scanner v_ever = new Scanner(SubstitutionCracker2.cipher);
while(v_ever.hasNext()){
String next = v_ever.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_e,_e,_r})){
SubstitutionCracker2.key[_v] = second.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_ever");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_ever.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_ever.close();
Scanner v_david = new Scanner(SubstitutionCracker2.cipher);
while(v_david.hasNext()){
String next = v_david.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_d,_a,_i,_d})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_david");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_david.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_david.close();
Scanner v_five = new Scanner(SubstitutionCracker2.cipher);
while(v_five.hasNext()){
String next = v_five.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_f,_i,_e})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_five");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_five.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_five.close();
Scanner v_believe = new Scanner(SubstitutionCracker2.cipher);
while(v_believe.hasNext()){
String next = v_believe.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh},
new int[]{_b,_e,_l,_i,_e,_e})){
SubstitutionCracker2.key[_v] = sixth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_believe");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_believe.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_believe.close();
Scanner v_seven = new Scanner(SubstitutionCracker2.cipher);
while(v_seven.hasNext()){
String next = v_seven.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_s,_e,_e,_n})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_seven");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_seven.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_seven.close();
Scanner v_leave = new Scanner(SubstitutionCracker2.cipher);
while(v_leave.hasNext()){
String next = v_leave.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_l,_e,_a,_e})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_leave");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_leave.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_leave.close();
Scanner v_above = new Scanner(SubstitutionCracker2.cipher);
while(v_above.hasNext()){
String next = v_above.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_a,_b,_o,_e})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_above");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_above.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_above.close();
Scanner v_government = new Scanner(SubstitutionCracker2.cipher);
while(v_government.hasNext()){
String next = v_government.next();
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
new int[]{_g,_o,_e,_r,_n,_m,_e,_n,_t})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_government");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_government.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_government.close();
Scanner v_received = new Scanner(SubstitutionCracker2.cipher);
while(v_received.hasNext()){
String next = v_received.next();
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
new int[]{_r,_e,_c,_e,_i,_e,_d})){
SubstitutionCracker2.key[_v] = sixth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_received");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_received.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_received.close();
Scanner v_themselves = new Scanner(SubstitutionCracker2.cipher);
while(v_themselves.hasNext()){
String next = v_themselves.next();
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
new int[]{_t,_h,_e,_m,_s,_e,_l,_e,_s})){
SubstitutionCracker2.key[_v] = eighth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_themselves");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_themselves.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_themselves.close();
Scanner v_live = new Scanner(SubstitutionCracker2.cipher);
while(v_live.hasNext()){
String next = v_live.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_l,_i,_e})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_live");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_live.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_live.close();
Scanner v_several = new Scanner(SubstitutionCracker2.cipher);
while(v_several.hasNext()){
String next = v_several.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_s,_e,_e,_r,_a,_l})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_several");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_several.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_several.close();
Scanner v_evil = new Scanner(SubstitutionCracker2.cipher);
while(v_evil.hasNext()){
String next = v_evil.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_e,_i,_l})){
SubstitutionCracker2.key[_v] = second.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_evil");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_evil.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_evil.close();
Scanner v_everything = new Scanner(SubstitutionCracker2.cipher);
while(v_everything.hasNext()){
String next = v_everything.next();
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
new int[]{_e,_e,_r,_y,_t,_h,_i,_n,_g})){
SubstitutionCracker2.key[_v] = second.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_everything");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_everything.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_everything.close();
Scanner v_moved = new Scanner(SubstitutionCracker2.cipher);
while(v_moved.hasNext()){
String next = v_moved.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_m,_o,_e,_d})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_moved");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_moved.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_moved.close();
Scanner v_living = new Scanner(SubstitutionCracker2.cipher);
while(v_living.hasNext()){
String next = v_living.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_l,_i,_i,_n,_g})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_living");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_living.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_living.close();
Scanner v_delivered = new Scanner(SubstitutionCracker2.cipher);
while(v_delivered.hasNext()){
String next = v_delivered.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth,seventh,eighth,ninth},
new int[]{_d,_e,_l,_i,_e,_r,_e,_d})){
SubstitutionCracker2.key[_v] = fifth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_delivered");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_delivered.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_delivered.close();
Scanner v_deliver = new Scanner(SubstitutionCracker2.cipher);
while(v_deliver.hasNext()){
String next = v_deliver.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth,seventh},
new int[]{_d,_e,_l,_i,_e,_r})){
SubstitutionCracker2.key[_v] = fifth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_deliver");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_deliver.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_deliver.close();
Scanner v_serve = new Scanner(SubstitutionCracker2.cipher);
while(v_serve.hasNext()){
String next = v_serve.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_s,_e,_r,_e})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_serve");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_serve.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_serve.close();
Scanner v_evidently = new Scanner(SubstitutionCracker2.cipher);
while(v_evidently.hasNext()){
String next = v_evidently.next();
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
new int[]{_e,_i,_d,_e,_n,_t,_l,_y})){
SubstitutionCracker2.key[_v] = second.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_evidently");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_evidently.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_evidently.close();
Scanner v_save = new Scanner(SubstitutionCracker2.cipher);
while(v_save.hasNext()){
String next = v_save.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_s,_a,_e})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_save");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_save.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_save.close();
Scanner v_servants = new Scanner(SubstitutionCracker2.cipher);
while(v_servants.hasNext()){
String next = v_servants.next();
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
new int[]{_s,_e,_r,_a,_n,_t,_s})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_servants");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_servants.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_servants.close();
Scanner v_receive = new Scanner(SubstitutionCracker2.cipher);
while(v_receive.hasNext()){
String next = v_receive.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh},
new int[]{_r,_e,_c,_e,_i,_e})){
SubstitutionCracker2.key[_v] = sixth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_receive");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_receive.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_receive.close();
Scanner v_servant = new Scanner(SubstitutionCracker2.cipher);
while(v_servant.hasNext()){
String next = v_servant.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_s,_e,_r,_a,_n,_t})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_servant");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_servant.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_servant.close();
Scanner v_loved = new Scanner(SubstitutionCracker2.cipher);
while(v_loved.hasNext()){
String next = v_loved.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_l,_o,_e,_d})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_loved");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_loved.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_loved.close();
Scanner v_everyone = new Scanner(SubstitutionCracker2.cipher);
while(v_everyone.hasNext()){
String next = v_everyone.next();
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
new int[]{_e,_e,_r,_y,_o,_n,_e})){
SubstitutionCracker2.key[_v] = second.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_everyone");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_everyone.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_everyone.close();
Scanner v_giving = new Scanner(SubstitutionCracker2.cipher);
while(v_giving.hasNext()){
String next = v_giving.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_g,_i,_i,_n,_g})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_giving");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_giving.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_giving.close();
Scanner v_lived = new Scanner(SubstitutionCracker2.cipher);
while(v_lived.hasNext()){
String next = v_lived.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_l,_i,_e,_d})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_lived");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_lived.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_lived.close();
Scanner v_covered = new Scanner(SubstitutionCracker2.cipher);
while(v_covered.hasNext()){
String next = v_covered.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_c,_o,_e,_r,_e,_d})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_covered");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_covered.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_covered.close();
Scanner v_evening = new Scanner(SubstitutionCracker2.cipher);
while(v_evening.hasNext()){
String next = v_evening.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_e,_e,_n,_i,_n,_g})){
SubstitutionCracker2.key[_v] = second.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_evening");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_evening.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_evening.close();
Scanner v_service = new Scanner(SubstitutionCracker2.cipher);
while(v_service.hasNext()){
String next = v_service.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_s,_e,_r,_i,_c,_e})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_service");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_service.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_service.close();
Scanner v_move = new Scanner(SubstitutionCracker2.cipher);
while(v_move.hasNext()){
String next = v_move.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_m,_o,_e})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_move");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_move.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_move.close();
Scanner v_movement = new Scanner(SubstitutionCracker2.cipher);
while(v_movement.hasNext()){
String next = v_movement.next();
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
new int[]{_m,_o,_e,_m,_e,_n,_t})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_movement");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_movement.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_movement.close();
Scanner v_heaven = new Scanner(SubstitutionCracker2.cipher);
while(v_heaven.hasNext()){
String next = v_heaven.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_h,_e,_a,_e,_n})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_heaven");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_heaven.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_heaven.close();
Scanner v_provide = new Scanner(SubstitutionCracker2.cipher);
while(v_provide.hasNext()){
String next = v_provide.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_p,_r,_o,_i,_d,_e})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_provide");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_provide.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_provide.close();
Scanner v_civil = new Scanner(SubstitutionCracker2.cipher);
while(v_civil.hasNext()){
String next = v_civil.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_c,_i,_i,_l})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_civil");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_civil.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_civil.close();
Scanner v_visit = new Scanner(SubstitutionCracker2.cipher);
while(v_visit.hasNext()){
String next = v_visit.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_i,_s,_i,_t})){
SubstitutionCracker2.key[_v] = first.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_visit");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_visit.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_visit.close();
Scanner v_conversation = new Scanner(SubstitutionCracker2.cipher);
while(v_conversation.hasNext()){
String next = v_conversation.next();
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
new int[]{_c,_o,_n,_e,_r,_s,_a,_t,_i,_o,_n})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_conversation");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_conversation.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_conversation.close();
Scanner v_leaves = new Scanner(SubstitutionCracker2.cipher);
while(v_leaves.hasNext()){
String next = v_leaves.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_l,_e,_a,_e,_s})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_leaves");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_leaves.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_leaves.close();
Scanner v_moving = new Scanner(SubstitutionCracker2.cipher);
while(v_moving.hasNext()){
String next = v_moving.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_m,_o,_i,_n,_g})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_moving");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_moving.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_moving.close();
Scanner v_served = new Scanner(SubstitutionCracker2.cipher);
while(v_served.hasNext()){
String next = v_served.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_s,_e,_r,_e,_d})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_served");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_served.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_served.close();
Scanner v_leaving = new Scanner(SubstitutionCracker2.cipher);
while(v_leaving.hasNext()){
String next = v_leaving.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_l,_e,_a,_i,_n,_g})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_leaving");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_leaving.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_leaving.close();
Scanner v_covenant = new Scanner(SubstitutionCracker2.cipher);
while(v_covenant.hasNext()){
String next = v_covenant.next();
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
new int[]{_c,_o,_e,_n,_a,_n,_t})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_covenant");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_covenant.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_covenant.close();
Scanner v_various = new Scanner(SubstitutionCracker2.cipher);
while(v_various.hasNext()){
String next = v_various.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_a,_r,_i,_o,_u,_s})){
SubstitutionCracker2.key[_v] = first.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_various");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_various.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_various.close();
Scanner v_silver = new Scanner(SubstitutionCracker2.cipher);
while(v_silver.hasNext()){
String next = v_silver.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_s,_i,_l,_e,_r})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_silver");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_silver.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_silver.close();
Scanner v_everybody = new Scanner(SubstitutionCracker2.cipher);
while(v_everybody.hasNext()){
String next = v_everybody.next();
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
new int[]{_e,_e,_r,_y,_b,_o,_d,_y})){
SubstitutionCracker2.key[_v] = second.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_everybody");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_everybody.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_everybody.close();
Scanner v_whatever = new Scanner(SubstitutionCracker2.cipher);
while(v_whatever.hasNext()){
String next = v_whatever.next();
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
new int[]{_w,_h,_a,_t,_e,_e,_r})){
SubstitutionCracker2.key[_v] = sixth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_whatever");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_whatever.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_whatever.close();
Scanner v_lives = new Scanner(SubstitutionCracker2.cipher);
while(v_lives.hasNext()){
String next = v_lives.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_l,_i,_e,_s})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_lives");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_lives.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_lives.close();
Scanner v_heavy = new Scanner(SubstitutionCracker2.cipher);
while(v_heavy.hasNext()){
String next = v_heavy.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_h,_e,_a,_y})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_heavy");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_heavy.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_heavy.close();
Scanner v_believed = new Scanner(SubstitutionCracker2.cipher);
while(v_believed.hasNext()){
String next = v_believed.next();
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
new int[]{_b,_e,_l,_i,_e,_e,_d})){
SubstitutionCracker2.key[_v] = sixth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_believed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_believed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_believed.close();
Scanner v_view = new Scanner(SubstitutionCracker2.cipher);
while(v_view.hasNext()){
String next = v_view.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_e,_w})){
SubstitutionCracker2.key[_v] = first.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_view");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_view.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_view.close();
Scanner v_whatsoever = new Scanner(SubstitutionCracker2.cipher);
while(v_whatsoever.hasNext()){
String next = v_whatsoever.next();
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
new int[]{_w,_h,_a,_t,_s,_o,_e,_e,_r})){
SubstitutionCracker2.key[_v] = eighth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_whatsoever");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_whatsoever.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_whatsoever.close();
Scanner v_twelve = new Scanner(SubstitutionCracker2.cipher);
while(v_twelve.hasNext()){
String next = v_twelve.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth},
new int[]{_t,_w,_e,_l,_e})){
SubstitutionCracker2.key[_v] = fifth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_twelve");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_twelve.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_twelve.close();
Scanner v_village = new Scanner(SubstitutionCracker2.cipher);
while(v_village.hasNext()){
String next = v_village.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_i,_l,_l,_a,_g,_e})){
SubstitutionCracker2.key[_v] = first.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_village");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_village.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_village.close();
Scanner v_ourselves = new Scanner(SubstitutionCracker2.cipher);
while(v_ourselves.hasNext()){
String next = v_ourselves.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth,eighth,ninth},
new int[]{_o,_u,_r,_s,_e,_l,_e,_s})){
SubstitutionCracker2.key[_v] = seventh.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_ourselves");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_ourselves.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_ourselves.close();
Scanner v_drove = new Scanner(SubstitutionCracker2.cipher);
while(v_drove.hasNext()){
String next = v_drove.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_d,_r,_o,_e})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_drove");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_drove.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_drove.close();
Scanner v_voices = new Scanner(SubstitutionCracker2.cipher);
while(v_voices.hasNext()){
String next = v_voices.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_o,_i,_c,_e,_s})){
SubstitutionCracker2.key[_v] = first.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_voices");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_voices.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_voices.close();
Scanner v_cover = new Scanner(SubstitutionCracker2.cipher);
while(v_cover.hasNext()){
String next = v_cover.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_c,_o,_e,_r})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_cover");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_cover.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_cover.close();
Scanner v_drive = new Scanner(SubstitutionCracker2.cipher);
while(v_drive.hasNext()){
String next = v_drive.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_d,_r,_i,_e})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_drive");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_drive.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_drive.close();
Scanner v_river = new Scanner(SubstitutionCracker2.cipher);
while(v_river.hasNext()){
String next = v_river.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_r,_i,_e,_r})){
SubstitutionCracker2.key[_v] = third.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_river");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_river.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_river.close();
Scanner v_arrived = new Scanner(SubstitutionCracker2.cipher);
while(v_arrived.hasNext()){
String next = v_arrived.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth,seventh},
new int[]{_a,_r,_r,_i,_e,_d})){
SubstitutionCracker2.key[_v] = fifth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_arrived");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_arrived.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_arrived.close();
Scanner v_whenever = new Scanner(SubstitutionCracker2.cipher);
while(v_whenever.hasNext()){
String next = v_whenever.next();
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
new int[]{_w,_h,_e,_n,_e,_e,_r})){
SubstitutionCracker2.key[_v] = sixth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_whenever");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_whenever.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_whenever.close();
Scanner v_private = new Scanner(SubstitutionCracker2.cipher);
while(v_private.hasNext()){
String next = v_private.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_p,_r,_i,_a,_t,_e})){
SubstitutionCracker2.key[_v] = fourth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_private");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_private.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_private.close();
Scanner v_removed = new Scanner(SubstitutionCracker2.cipher);
while(v_removed.hasNext()){
String next = v_removed.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth,seventh},
new int[]{_r,_e,_m,_o,_e,_d})){
SubstitutionCracker2.key[_v] = fifth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_removed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_removed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_removed.close();
Scanner v_whosoever = new Scanner(SubstitutionCracker2.cipher);
while(v_whosoever.hasNext()){
String next = v_whosoever.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth,eighth,ninth},
new int[]{_w,_h,_o,_s,_o,_e,_e,_r})){
SubstitutionCracker2.key[_v] = seventh.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_whosoever");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_whosoever.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasV){
v_whosoever.close();
Scanner v_remove = new Scanner(SubstitutionCracker2.cipher);
while(v_remove.hasNext()){
String next = v_remove.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth},
new int[]{_r,_e,_m,_o,_e})){
SubstitutionCracker2.key[_v] = fifth.toLowerCase();
SubstitutionCracker2.hasV=true;
System.err.println("SubstitutionCracker2.hasV=true; via Scanner v_remove");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

v_remove.close();
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
