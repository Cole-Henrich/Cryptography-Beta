package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan20J{
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

public Scan20J(){
System.err.println("new Scan20J");


Scanner j_just = new Scanner(SubstitutionCracker2.cipher);
while(j_just.hasNext()){
String next = j_just.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_u,_s,_t})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_just");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_just.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_just.close();
Scanner j_jesus = new Scanner(SubstitutionCracker2.cipher);
while(j_jesus.hasNext()){
String next = j_jesus.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_e,_s,_u,_s})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jesus");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jesus.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jesus.close();
Scanner j_joe = new Scanner(SubstitutionCracker2.cipher);
while(j_joe.hasNext()){
String next = j_joe.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_o,_e})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_joe");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_joe.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_joe.close();
Scanner j_judge = new Scanner(SubstitutionCracker2.cipher);
while(j_judge.hasNext()){
String next = j_judge.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_u,_d,_g,_e})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_judge");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_judge.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_judge.close();
Scanner j_juda = new Scanner(SubstitutionCracker2.cipher);
while(j_juda.hasNext()){
String next = j_juda.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_u,_d,_a})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_juda");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_juda.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_juda.close();
Scanner j_jerusalem = new Scanner(SubstitutionCracker2.cipher);
while(j_jerusalem.hasNext()){
String next = j_jerusalem.next();
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
new int[]{_e,_r,_u,_s,_a,_l,_e,_m})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jerusalem");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jerusalem.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jerusalem.close();
Scanner j_judgment = new Scanner(SubstitutionCracker2.cipher);
while(j_judgment.hasNext()){
String next = j_judgment.next();
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
new int[]{_u,_d,_g,_m,_e,_n,_t})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_judgment");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_judgment.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_judgment.close();
Scanner j_justice = new Scanner(SubstitutionCracker2.cipher);
while(j_justice.hasNext()){
String next = j_justice.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_u,_s,_t,_i,_c,_e})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_justice");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_justice.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_justice.close();
Scanner j_joy = new Scanner(SubstitutionCracker2.cipher);
while(j_joy.hasNext()){
String next = j_joy.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_o,_y})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_joy");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_joy.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_joy.close();
Scanner j_subject = new Scanner(SubstitutionCracker2.cipher);
while(j_subject.hasNext()){
String next = j_subject.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_s,_u,_b,_e,_c,_t})){
SubstitutionCracker2.key[_j] = fourth.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_subject");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_subject.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_subject.close();
Scanner j_john = new Scanner(SubstitutionCracker2.cipher);
while(j_john.hasNext()){
String next = j_john.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_h,_n})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_john");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_john.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_john.close();
Scanner j_jeremias = new Scanner(SubstitutionCracker2.cipher);
while(j_jeremias.hasNext()){
String next = j_jeremias.next();
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
new int[]{_e,_r,_e,_m,_i,_a,_s})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jeremias");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jeremias.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jeremias.close();
Scanner j_job = new Scanner(SubstitutionCracker2.cipher);
while(j_job.hasNext()){
String next = j_job.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_o,_b})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_job");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_job.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_job.close();
Scanner j_jews = new Scanner(SubstitutionCracker2.cipher);
while(j_jews.hasNext()){
String next = j_jews.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_w,_s})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jews");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jews.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jews.close();
Scanner j_joined = new Scanner(SubstitutionCracker2.cipher);
while(j_joined.hasNext()){
String next = j_joined.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_o,_i,_n,_e,_d})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_joined");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_joined.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_joined.close();
Scanner j_rejoice = new Scanner(SubstitutionCracker2.cipher);
while(j_rejoice.hasNext()){
String next = j_rejoice.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_r,_e,_o,_i,_c,_e})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_rejoice");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_rejoice.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_rejoice.close();
Scanner j_jonathan = new Scanner(SubstitutionCracker2.cipher);
while(j_jonathan.hasNext()){
String next = j_jonathan.next();
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
new int[]{_o,_n,_a,_t,_h,_a,_n})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jonathan");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jonathan.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jonathan.close();
Scanner j_jacob = new Scanner(SubstitutionCracker2.cipher);
while(j_jacob.hasNext()){
String next = j_jacob.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_a,_c,_o,_b})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jacob");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jacob.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jacob.close();
Scanner j_josue = new Scanner(SubstitutionCracker2.cipher);
while(j_josue.hasNext()){
String next = j_josue.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_s,_u,_e})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_josue");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_josue.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_josue.close();
Scanner j_joseph = new Scanner(SubstitutionCracker2.cipher);
while(j_joseph.hasNext()){
String next = j_joseph.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_o,_s,_e,_p,_h})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_joseph");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_joseph.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_joseph.close();
Scanner j_project = new Scanner(SubstitutionCracker2.cipher);
while(j_project.hasNext()){
String next = j_project.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_p,_r,_o,_e,_c,_t})){
SubstitutionCracker2.key[_j] = fourth.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_project");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_project.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_project.close();
Scanner j_join = new Scanner(SubstitutionCracker2.cipher);
while(j_join.hasNext()){
String next = j_join.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_i,_n})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_join");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_join.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_join.close();
Scanner j_judas = new Scanner(SubstitutionCracker2.cipher);
while(j_judas.hasNext()){
String next = j_judas.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_u,_d,_a,_s})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_judas");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_judas.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_judas.close();
Scanner j_adjutant = new Scanner(SubstitutionCracker2.cipher);
while(j_adjutant.hasNext()){
String next = j_adjutant.next();
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
new int[]{_a,_d,_u,_t,_a,_n,_t})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_adjutant");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_adjutant.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_adjutant.close();
Scanner j_jordan = new Scanner(SubstitutionCracker2.cipher);
while(j_jordan.hasNext()){
String next = j_jordan.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_o,_r,_d,_a,_n})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jordan");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jordan.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jordan.close();
Scanner j_judged = new Scanner(SubstitutionCracker2.cipher);
while(j_judged.hasNext()){
String next = j_judged.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_u,_d,_g,_e,_d})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_judged");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_judged.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_judged.close();
Scanner j_jumped = new Scanner(SubstitutionCracker2.cipher);
while(j_jumped.hasNext()){
String next = j_jumped.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_u,_m,_p,_e,_d})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jumped");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jumped.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jumped.close();
Scanner j_jaggers = new Scanner(SubstitutionCracker2.cipher);
while(j_jaggers.hasNext()){
String next = j_jaggers.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_a,_g,_g,_e,_r,_s})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jaggers");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jaggers.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jaggers.close();
Scanner j_unjust = new Scanner(SubstitutionCracker2.cipher);
while(j_unjust.hasNext()){
String next = j_unjust.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_u,_n,_u,_s,_t})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_unjust");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_unjust.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_unjust.close();
Scanner j_joab = new Scanner(SubstitutionCracker2.cipher);
while(j_joab.hasNext()){
String next = j_joab.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_a,_b})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_joab");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_joab.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_joab.close();
Scanner j_judges = new Scanner(SubstitutionCracker2.cipher);
while(j_judges.hasNext()){
String next = j_judges.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_u,_d,_g,_e,_s})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_judges");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_judges.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_judges.close();
Scanner j_object = new Scanner(SubstitutionCracker2.cipher);
while(j_object.hasNext()){
String next = j_object.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_o,_b,_e,_c,_t})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_object");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_object.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_object.close();
Scanner j_joyful = new Scanner(SubstitutionCracker2.cipher);
while(j_joyful.hasNext()){
String next = j_joyful.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_o,_y,_f,_u,_l})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_joyful");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_joyful.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_joyful.close();
Scanner j_jodie = new Scanner(SubstitutionCracker2.cipher);
while(j_jodie.hasNext()){
String next = j_jodie.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_d,_i,_e})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jodie");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jodie.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jodie.close();
Scanner j_judgments = new Scanner(SubstitutionCracker2.cipher);
while(j_judgments.hasNext()){
String next = j_judgments.next();
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
new int[]{_u,_d,_g,_m,_e,_n,_t,_s})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_judgments");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_judgments.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_judgments.close();
Scanner j_journey = new Scanner(SubstitutionCracker2.cipher);
while(j_journey.hasNext()){
String next = j_journey.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_o,_u,_r,_n,_e,_y})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_journey");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_journey.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_journey.close();
Scanner j_jungle = new Scanner(SubstitutionCracker2.cipher);
while(j_jungle.hasNext()){
String next = j_jungle.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_u,_n,_g,_l,_e})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jungle");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jungle.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jungle.close();
Scanner j_major = new Scanner(SubstitutionCracker2.cipher);
while(j_major.hasNext()){
String next = j_major.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_m,_a,_o,_r})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_major");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_major.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_major.close();
Scanner j_majesty = new Scanner(SubstitutionCracker2.cipher);
while(j_majesty.hasNext()){
String next = j_majesty.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_m,_a,_e,_s,_t,_y})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_majesty");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_majesty.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_majesty.close();
Scanner j_majority = new Scanner(SubstitutionCracker2.cipher);
while(j_majority.hasNext()){
String next = j_majority.next();
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
new int[]{_m,_a,_o,_r,_i,_t,_y})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_majority");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_majority.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_majority.close();
Scanner j_jobs = new Scanner(SubstitutionCracker2.cipher);
while(j_jobs.hasNext()){
String next = j_jobs.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_b,_s})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jobs");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jobs.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jobs.close();
Scanner j_benjamin = new Scanner(SubstitutionCracker2.cipher);
while(j_benjamin.hasNext()){
String next = j_benjamin.next();
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
new int[]{_b,_e,_n,_a,_m,_i,_n})){
SubstitutionCracker2.key[_j] = fourth.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_benjamin");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_benjamin.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_benjamin.close();
Scanner j_james = new Scanner(SubstitutionCracker2.cipher);
while(j_james.hasNext()){
String next = j_james.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_a,_m,_e,_s})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_james");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_james.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_james.close();
Scanner j_enjoyed = new Scanner(SubstitutionCracker2.cipher);
while(j_enjoyed.hasNext()){
String next = j_enjoyed.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_e,_n,_o,_y,_e,_d})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_enjoyed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_enjoyed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_enjoyed.close();
Scanner j_justified = new Scanner(SubstitutionCracker2.cipher);
while(j_justified.hasNext()){
String next = j_justified.next();
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
new int[]{_u,_s,_t,_i,_f,_i,_e,_d})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_justified");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_justified.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_justified.close();
Scanner j_enjoy = new Scanner(SubstitutionCracker2.cipher);
while(j_enjoy.hasNext()){
String next = j_enjoy.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_e,_n,_o,_y})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_enjoy");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_enjoy.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_enjoy.close();
Scanner j_rejoiced = new Scanner(SubstitutionCracker2.cipher);
while(j_rejoiced.hasNext()){
String next = j_rejoiced.next();
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
new int[]{_r,_e,_o,_i,_c,_e,_d})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_rejoiced");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_rejoiced.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_rejoiced.close();
Scanner j_rejected = new Scanner(SubstitutionCracker2.cipher);
while(j_rejected.hasNext()){
String next = j_rejected.next();
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
new int[]{_r,_e,_e,_c,_t,_e,_d})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_rejected");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_rejected.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_rejected.close();
Scanner j_julie = new Scanner(SubstitutionCracker2.cipher);
while(j_julie.hasNext()){
String next = j_julie.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_u,_l,_i,_e})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_julie");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_julie.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_julie.close();
Scanner j_johnnie = new Scanner(SubstitutionCracker2.cipher);
while(j_johnnie.hasNext()){
String next = j_johnnie.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_o,_h,_n,_n,_i,_e})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_johnnie");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_johnnie.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_johnnie.close();
Scanner j_joining = new Scanner(SubstitutionCracker2.cipher);
while(j_joining.hasNext()){
String next = j_joining.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_o,_i,_n,_i,_n,_g})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_joining");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_joining.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_joining.close();
Scanner j_josaphat = new Scanner(SubstitutionCracker2.cipher);
while(j_josaphat.hasNext()){
String next = j_josaphat.next();
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
new int[]{_o,_s,_a,_p,_h,_a,_t})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_josaphat");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_josaphat.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_josaphat.close();
Scanner j_judith = new Scanner(SubstitutionCracker2.cipher);
while(j_judith.hasNext()){
String next = j_judith.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_u,_d,_i,_t,_h})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_judith");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_judith.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_judith.close();
Scanner j_josias = new Scanner(SubstitutionCracker2.cipher);
while(j_josias.hasNext()){
String next = j_josias.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_o,_s,_i,_a,_s})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_josias");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_josias.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_josias.close();
Scanner j_joiada = new Scanner(SubstitutionCracker2.cipher);
while(j_joiada.hasNext()){
String next = j_joiada.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_o,_i,_a,_d,_a})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_joiada");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_joiada.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_joiada.close();
Scanner j_injustice = new Scanner(SubstitutionCracker2.cipher);
while(j_injustice.hasNext()){
String next = j_injustice.next();
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

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_i,_n,_u,_s,_t,_i,_c,_e})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_injustice");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_injustice.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_injustice.close();
Scanner j_jeroboam = new Scanner(SubstitutionCracker2.cipher);
while(j_jeroboam.hasNext()){
String next = j_jeroboam.next();
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
new int[]{_e,_r,_o,_b,_o,_a,_m})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jeroboam");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jeroboam.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jeroboam.close();
Scanner j_jerked = new Scanner(SubstitutionCracker2.cipher);
while(j_jerked.hasNext()){
String next = j_jerked.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_e,_r,_k,_e,_d})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jerked");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jerked.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jerked.close();
Scanner j_jealous = new Scanner(SubstitutionCracker2.cipher);
while(j_jealous.hasNext()){
String next = j_jealous.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_e,_a,_l,_o,_u,_s})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jealous");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jealous.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jealous.close();
Scanner j_judging = new Scanner(SubstitutionCracker2.cipher);
while(j_judging.hasNext()){
String next = j_judging.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_u,_d,_g,_i,_n,_g})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_judging");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_judging.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_judging.close();
Scanner j_justify = new Scanner(SubstitutionCracker2.cipher);
while(j_justify.hasNext()){
String next = j_justify.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_u,_s,_t,_i,_f,_y})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_justify");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_justify.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_justify.close();
Scanner j_jehu = new Scanner(SubstitutionCracker2.cipher);
while(j_jehu.hasNext()){
String next = j_jehu.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_h,_u})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jehu");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jehu.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jehu.close();
Scanner j_majestic = new Scanner(SubstitutionCracker2.cipher);
while(j_majestic.hasNext()){
String next = j_majestic.next();
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
new int[]{_m,_a,_e,_s,_t,_i,_c})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_majestic");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_majestic.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_majestic.close();
Scanner j_judea = new Scanner(SubstitutionCracker2.cipher);
while(j_judea.hasNext()){
String next = j_judea.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_u,_d,_e,_a})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_judea");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_judea.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_judea.close();
Scanner j_jump = new Scanner(SubstitutionCracker2.cipher);
while(j_jump.hasNext()){
String next = j_jump.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_u,_m,_p})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jump");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jump.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jump.close();
Scanner j_joakim = new Scanner(SubstitutionCracker2.cipher);
while(j_joakim.hasNext()){
String next = j_joakim.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_o,_a,_k,_i,_m})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_joakim");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_joakim.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_joakim.close();
Scanner j_jail = new Scanner(SubstitutionCracker2.cipher);
while(j_jail.hasNext()){
String next = j_jail.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_i,_l})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jail");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jail.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jail.close();
Scanner j_jealousy = new Scanner(SubstitutionCracker2.cipher);
while(j_jealousy.hasNext()){
String next = j_jealousy.next();
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
new int[]{_e,_a,_l,_o,_u,_s,_y})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jealousy");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jealousy.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jealousy.close();
Scanner j_jacket = new Scanner(SubstitutionCracker2.cipher);
while(j_jacket.hasNext()){
String next = j_jacket.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_a,_c,_k,_e,_t})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jacket");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jacket.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jacket.close();
Scanner j_joas = new Scanner(SubstitutionCracker2.cipher);
while(j_joas.hasNext()){
String next = j_joas.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_a,_s})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_joas");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_joas.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_joas.close();
Scanner j_joyous = new Scanner(SubstitutionCracker2.cipher);
while(j_joyous.hasNext()){
String next = j_joyous.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_o,_y,_o,_u,_s})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_joyous");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_joyous.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_joyous.close();
Scanner j_joyfully = new Scanner(SubstitutionCracker2.cipher);
while(j_joyfully.hasNext()){
String next = j_joyfully.next();
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
new int[]{_o,_y,_f,_u,_l,_l,_y})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_joyfully");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_joyfully.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_joyfully.close();
Scanner j_jericho = new Scanner(SubstitutionCracker2.cipher);
while(j_jericho.hasNext()){
String next = j_jericho.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_e,_r,_i,_c,_h,_o})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jericho");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jericho.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jericho.close();
Scanner j_adjutants = new Scanner(SubstitutionCracker2.cipher);
while(j_adjutants.hasNext()){
String next = j_adjutants.next();
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

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_a,_d,_u,_t,_a,_n,_t,_s})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_adjutants");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_adjutants.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_adjutants.close();
Scanner j_jury = new Scanner(SubstitutionCracker2.cipher);
while(j_jury.hasNext()){
String next = j_jury.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_u,_r,_y})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jury");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jury.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jury.close();
Scanner j_june = new Scanner(SubstitutionCracker2.cipher);
while(j_june.hasNext()){
String next = j_june.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_u,_n,_e})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_june");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_june.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_june.close();
Scanner j_joram = new Scanner(SubstitutionCracker2.cipher);
while(j_joram.hasNext()){
String next = j_joram.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_r,_a,_m})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_joram");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_joram.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_joram.close();
Scanner j_jolly = new Scanner(SubstitutionCracker2.cipher);
while(j_jolly.hasNext()){
String next = j_jolly.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_l,_l,_y})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jolly");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jolly.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jolly.close();
Scanner j_joke = new Scanner(SubstitutionCracker2.cipher);
while(j_joke.hasNext()){
String next = j_joke.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_k,_e})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_joke");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_joke.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_joke.close();
Scanner j_enjoying = new Scanner(SubstitutionCracker2.cipher);
while(j_enjoying.hasNext()){
String next = j_enjoying.next();
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
new int[]{_e,_n,_o,_y,_i,_n,_g})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_enjoying");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_enjoying.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_enjoying.close();
Scanner j_jane = new Scanner(SubstitutionCracker2.cipher);
while(j_jane.hasNext()){
String next = j_jane.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_n,_e})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jane");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jane.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jane.close();
Scanner j_japanese = new Scanner(SubstitutionCracker2.cipher);
while(j_japanese.hasNext()){
String next = j_japanese.next();
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
new int[]{_a,_p,_a,_n,_e,_s,_e})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_japanese");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_japanese.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_japanese.close();
Scanner j_injury = new Scanner(SubstitutionCracker2.cipher);
while(j_injury.hasNext()){
String next = j_injury.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_i,_n,_u,_r,_y})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_injury");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_injury.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_injury.close();
Scanner j_jonas = new Scanner(SubstitutionCracker2.cipher);
while(j_jonas.hasNext()){
String next = j_jonas.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_n,_a,_s})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_jonas");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_jonas.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_jonas.close();
Scanner j_judgeth = new Scanner(SubstitutionCracker2.cipher);
while(j_judgeth.hasNext()){
String next = j_judgeth.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_u,_d,_g,_e,_t,_h})){
SubstitutionCracker2.key[_j] = first.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_judgeth");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_judgeth.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasJ){
j_judgeth.close();
Scanner j_rejoicing = new Scanner(SubstitutionCracker2.cipher);
while(j_rejoicing.hasNext()){
String next = j_rejoicing.next();
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

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_r,_e,_o,_i,_c,_i,_n,_g})){
SubstitutionCracker2.key[_j] = third.toLowerCase();
SubstitutionCracker2.hasJ=true;
System.err.println("SubstitutionCracker2.hasJ=true; via Scanner j_rejoicing");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

j_rejoicing.close();
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
