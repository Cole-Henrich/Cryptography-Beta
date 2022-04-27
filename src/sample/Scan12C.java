package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan12C{
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

public Scan12C(){
System.err.println("new Scan12C");
    System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));


Scanner c_came = new Scanner(SubstitutionCracker2.cipher);
while(c_came.hasNext()){
String next = c_came.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_m,_e})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_came");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_came.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_came.close();
Scanner c_come = new Scanner(SubstitutionCracker2.cipher);
while(c_come.hasNext()){
String next = c_come.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_m,_e})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_come");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_come.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_come.close();
Scanner c_could = new Scanner(SubstitutionCracker2.cipher);
while(c_could.hasNext()){
String next = c_could.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_u,_l,_d})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_could");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_could.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_could.close();
Scanner c_children = new Scanner(SubstitutionCracker2.cipher);
while(c_children.hasNext()){
String next = c_children.next();
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
new int[]{_h,_i,_l,_d,_r,_e,_n})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_children");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_children.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_children.close();
Scanner c_can = new Scanner(SubstitutionCracker2.cipher);
while(c_can.hasNext()){
String next = c_can.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_a,_n})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_can");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_can.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_can.close();
Scanner c_such = new Scanner(SubstitutionCracker2.cipher);
while(c_such.hasNext()){
String next = c_such.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_s,_u,_h})){
SubstitutionCracker2.key[_c] = third.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_such");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_such.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_such.close();
Scanner c_face = new Scanner(SubstitutionCracker2.cipher);
while(c_face.hasNext()){
String next = c_face.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_f,_a,_e})){
SubstitutionCracker2.key[_c] = third.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_face");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_face.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_face.close();
Scanner c_much = new Scanner(SubstitutionCracker2.cipher);
while(c_much.hasNext()){
String next = c_much.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_m,_u,_h})){
SubstitutionCracker2.key[_c] = third.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_much");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_much.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_much.close();
Scanner c_called = new Scanner(SubstitutionCracker2.cipher);
while(c_called.hasNext()){
String next = c_called.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_a,_l,_l,_e,_d})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_called");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_called.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_called.close();
Scanner c_once = new Scanner(SubstitutionCracker2.cipher);
while(c_once.hasNext()){
String next = c_once.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_o,_n,_e})){
SubstitutionCracker2.key[_c] = third.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_once");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_once.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_once.close();
Scanner c_french = new Scanner(SubstitutionCracker2.cipher);
while(c_french.hasNext()){
String next = c_french.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth},
new int[]{_f,_r,_e,_n,_h})){
SubstitutionCracker2.key[_c] = fifth.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_french");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_french.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_french.close();
Scanner c_each = new Scanner(SubstitutionCracker2.cipher);
while(c_each.hasNext()){
String next = c_each.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_e,_a,_h})){
SubstitutionCracker2.key[_c] = third.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_each");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_each.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_each.close();
Scanner c_cast = new Scanner(SubstitutionCracker2.cipher);
while(c_cast.hasNext()){
String next = c_cast.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_s,_t})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_cast");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_cast.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_cast.close();
Scanner c_second = new Scanner(SubstitutionCracker2.cipher);
while(c_second.hasNext()){
String next = c_second.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_s,_e,_o,_n,_d})){
SubstitutionCracker2.key[_c] = third.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_second");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_second.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_second.close();
Scanner c_call = new Scanner(SubstitutionCracker2.cipher);
while(c_call.hasNext()){
String next = c_call.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_l,_l})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_call");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_call.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_call.close();
Scanner c_count = new Scanner(SubstitutionCracker2.cipher);
while(c_count.hasNext()){
String next = c_count.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_u,_n,_t})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_count");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_count.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_count.close();
Scanner c_across = new Scanner(SubstitutionCracker2.cipher);
while(c_across.hasNext()){
String next = c_across.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth},
new int[]{_a,_r,_o,_s,_s})){
SubstitutionCracker2.key[_c] = second.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_across");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_across.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_across.close();
Scanner c_cause = new Scanner(SubstitutionCracker2.cipher);
while(c_cause.hasNext()){
String next = c_cause.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_a,_u,_s,_e})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_cause");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_cause.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_cause.close();
Scanner c_since = new Scanner(SubstitutionCracker2.cipher);
while(c_since.hasNext()){
String next = c_since.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_s,_i,_n,_e})){
SubstitutionCracker2.key[_c] = fourth.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_since");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_since.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_since.close();
Scanner c_commanded = new Scanner(SubstitutionCracker2.cipher);
while(c_commanded.hasNext()){
String next = c_commanded.next();
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
new int[]{_o,_m,_m,_a,_n,_d,_e,_d})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_commanded");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_commanded.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_commanded.close();
Scanner c_cannot = new Scanner(SubstitutionCracker2.cipher);
while(c_cannot.hasNext()){
String next = c_cannot.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_a,_n,_n,_o,_t})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_cannot");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_cannot.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_cannot.close();
Scanner c_certain = new Scanner(SubstitutionCracker2.cipher);
while(c_certain.hasNext()){
String next = c_certain.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_e,_r,_t,_a,_i,_n})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_certain");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_certain.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_certain.close();
Scanner c_cried = new Scanner(SubstitutionCracker2.cipher);
while(c_cried.hasNext()){
String next = c_cried.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_r,_i,_e,_d})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_cried");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_cried.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_cried.close();
Scanner c_cut = new Scanner(SubstitutionCracker2.cipher);
while(c_cut.hasNext()){
String next = c_cut.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_u,_t})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_cut");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_cut.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_cut.close();
Scanner c_carried = new Scanner(SubstitutionCracker2.cipher);
while(c_carried.hasNext()){
String next = c_carried.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_a,_r,_r,_i,_e,_d})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_carried");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_carried.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_carried.close();
Scanner c_chief = new Scanner(SubstitutionCracker2.cipher);
while(c_chief.hasNext()){
String next = c_chief.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_h,_i,_e,_f})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_chief");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_chief.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_chief.close();
Scanner c_nicholas = new Scanner(SubstitutionCracker2.cipher);
while(c_nicholas.hasNext()){
String next = c_nicholas.next();
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
new int[]{_n,_i,_h,_o,_l,_a,_s})){
SubstitutionCracker2.key[_c] = third.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_nicholas");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_nicholas.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_nicholas.close();
Scanner c_cities = new Scanner(SubstitutionCracker2.cipher);
while(c_cities.hasNext()){
String next = c_cities.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_i,_t,_i,_e,_s})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_cities");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_cities.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_cities.close();
Scanner c_countess = new Scanner(SubstitutionCracker2.cipher);
while(c_countess.hasNext()){
String next = c_countess.next();
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
new int[]{_o,_u,_n,_t,_e,_s,_s})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_countess");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_countess.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_countess.close();
Scanner c_officer = new Scanner(SubstitutionCracker2.cipher);
while(c_officer.hasNext()){
String next = c_officer.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth,seventh},
new int[]{_o,_f,_f,_i,_e,_r})){
SubstitutionCracker2.key[_c] = fifth.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_officer");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_officer.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_officer.close();
Scanner c_american = new Scanner(SubstitutionCracker2.cipher);
while(c_american.hasNext()){
String next = c_american.next();
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
new int[]{_a,_m,_e,_r,_i,_a,_n})){
SubstitutionCracker2.key[_c] = sixth.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_american");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_american.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_american.close();
Scanner c_child = new Scanner(SubstitutionCracker2.cipher);
while(c_child.hasNext()){
String next = c_child.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_h,_i,_l,_d})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_child");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_child.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_child.close();
Scanner c_fact = new Scanner(SubstitutionCracker2.cipher);
while(c_fact.hasNext()){
String next = c_fact.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_f,_a,_t})){
SubstitutionCracker2.key[_c] = third.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_fact");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_fact.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_fact.close();
Scanner c_notice = new Scanner(SubstitutionCracker2.cipher);
while(c_notice.hasNext()){
String next = c_notice.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth},
new int[]{_n,_o,_t,_i,_e})){
SubstitutionCracker2.key[_c] = fifth.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_notice");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_notice.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_notice.close();
Scanner c_christ = new Scanner(SubstitutionCracker2.cipher);
while(c_christ.hasNext()){
String next = c_christ.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_h,_r,_i,_s,_t})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_christ");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_christ.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_christ.close();
Scanner c_close = new Scanner(SubstitutionCracker2.cipher);
while(c_close.hasNext()){
String next = c_close.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_l,_o,_s,_e})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_close");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_close.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_close.close();
Scanner c_reached = new Scanner(SubstitutionCracker2.cipher);
while(c_reached.hasNext()){
String next = c_reached.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_r,_e,_a,_h,_e,_d})){
SubstitutionCracker2.key[_c] = fourth.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_reached");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_reached.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_reached.close();
Scanner c_court = new Scanner(SubstitutionCracker2.cipher);
while(c_court.hasNext()){
String next = c_court.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_u,_r,_t})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_court");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_court.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_court.close();
Scanner c_sacrifice = new Scanner(SubstitutionCracker2.cipher);
while(c_sacrifice.hasNext()){
String next = c_sacrifice.next();
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

if(third.equalsIgnoreCase(eighth)){
if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh,ninth},
new int[]{_s,_a,_r,_i,_f,_i,_e})){
SubstitutionCracker2.key[_c] = third.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_sacrifice");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_sacrifice.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_sacrifice.close();
Scanner c_noticed = new Scanner(SubstitutionCracker2.cipher);
while(c_noticed.hasNext()){
String next = c_noticed.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth,seventh},
new int[]{_n,_o,_t,_i,_e,_d})){
SubstitutionCracker2.key[_c] = fifth.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_noticed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_noticed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_noticed.close();
Scanner c_continued = new Scanner(SubstitutionCracker2.cipher);
while(c_continued.hasNext()){
String next = c_continued.next();
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
new int[]{_o,_n,_t,_i,_n,_u,_e,_d})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_continued");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_continued.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_continued.close();
Scanner c_course = new Scanner(SubstitutionCracker2.cipher);
while(c_course.hasNext()){
String next = c_course.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_o,_u,_r,_s,_e})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_course");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_course.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_course.close();
Scanner c_commander = new Scanner(SubstitutionCracker2.cipher);
while(c_commander.hasNext()){
String next = c_commander.next();
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
new int[]{_o,_m,_m,_a,_n,_d,_e,_r})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_commander");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_commander.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_commander.close();
Scanner c_church = new Scanner(SubstitutionCracker2.cipher);
while(c_church.hasNext()){
String next = c_church.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(first.equalsIgnoreCase(fifth)){
if(massCalc_notAnyOther(new String[]{second,third,fourth,sixth},
new int[]{_h,_u,_r,_h})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_church");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_church.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_church.close();
Scanner c_cold = new Scanner(SubstitutionCracker2.cipher);
while(c_cold.hasNext()){
String next = c_cold.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_l,_d})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_cold");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_cold.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_cold.close();
Scanner c_clear = new Scanner(SubstitutionCracker2.cipher);
while(c_clear.hasNext()){
String next = c_clear.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_l,_e,_a,_r})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_clear");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_clear.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_clear.close();
Scanner c_chase = new Scanner(SubstitutionCracker2.cipher);
while(c_chase.hasNext()){
String next = c_chase.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_h,_a,_s,_e})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_chase");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_chase.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_chase.close();
Scanner c_decided = new Scanner(SubstitutionCracker2.cipher);
while(c_decided.hasNext()){
String next = c_decided.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_d,_e,_i,_d,_e,_d})){
SubstitutionCracker2.key[_c] = third.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_decided");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_decided.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_decided.close();
Scanner c_faces = new Scanner(SubstitutionCracker2.cipher);
while(c_faces.hasNext()){
String next = c_faces.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_f,_a,_e,_s})){
SubstitutionCracker2.key[_c] = third.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_faces");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_faces.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_faces.close();
Scanner c_command = new Scanner(SubstitutionCracker2.cipher);
while(c_command.hasNext()){
String next = c_command.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_o,_m,_m,_a,_n,_d})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_command");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_command.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_command.close();
Scanner c_force = new Scanner(SubstitutionCracker2.cipher);
while(c_force.hasNext()){
String next = c_force.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_f,_o,_r,_e})){
SubstitutionCracker2.key[_c] = fourth.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_force");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_force.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_force.close();
Scanner c_care = new Scanner(SubstitutionCracker2.cipher);
while(c_care.hasNext()){
String next = c_care.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_r,_e})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_care");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_care.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_care.close();
Scanner c_common = new Scanner(SubstitutionCracker2.cipher);
while(c_common.hasNext()){
String next = c_common.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_o,_m,_m,_o,_n})){
SubstitutionCracker2.key[_c] = first.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_common");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_common.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasC){
c_common.close();
Scanner c_touched = new Scanner(SubstitutionCracker2.cipher);
while(c_touched.hasNext()){
String next = c_touched.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_t,_o,_u,_h,_e,_d})){
SubstitutionCracker2.key[_c] = fourth.toLowerCase();
SubstitutionCracker2.hasC=true;
System.err.println("SubstitutionCracker2.hasC=true; via Scanner c_touched");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

c_touched.close();
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
