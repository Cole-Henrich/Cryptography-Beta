package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan16P{
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

public Scan16P(){
System.err.println("new Scan16P");


Scanner p_up = new Scanner(SubstitutionCracker2.cipher);
while(p_up.hasNext()){
String next = p_up.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{first},
new int[]{_u})){
SubstitutionCracker2.key[_p] = second.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_up");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_up.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_up.close();
Scanner p_upon = new Scanner(SubstitutionCracker2.cipher);
while(p_upon.hasNext()){
String next = p_upon.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_u,_o,_n})){
SubstitutionCracker2.key[_p] = second.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_upon");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_upon.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_upon.close();
Scanner p_people = new Scanner(SubstitutionCracker2.cipher);
while(p_people.hasNext()){
String next = p_people.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(first.equalsIgnoreCase(fourth)){
if(massCalc_notAnyOther(new String[]{second,third,fifth,sixth},
new int[]{_e,_o,_l,_e})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_people");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_people.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_people.close();
Scanner p_chapter = new Scanner(SubstitutionCracker2.cipher);
while(p_chapter.hasNext()){
String next = p_chapter.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_c,_h,_a,_t,_e,_r})){
SubstitutionCracker2.key[_p] = fourth.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_chapter");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_chapter.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_chapter.close();
Scanner p_prince = new Scanner(SubstitutionCracker2.cipher);
while(p_prince.hasNext()){
String next = p_prince.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_r,_i,_n,_c,_e})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_prince");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_prince.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_prince.close();
Scanner p_put = new Scanner(SubstitutionCracker2.cipher);
while(p_put.hasNext()){
String next = p_put.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_u,_t})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_put");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_put.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_put.close();
Scanner p_pierre = new Scanner(SubstitutionCracker2.cipher);
while(p_pierre.hasNext()){
String next = p_pierre.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_i,_e,_r,_r,_e})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_pierre");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_pierre.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_pierre.close();
Scanner p_place = new Scanner(SubstitutionCracker2.cipher);
while(p_place.hasNext()){
String next = p_place.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_l,_a,_c,_e})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_place");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_place.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_place.close();
Scanner p_part = new Scanner(SubstitutionCracker2.cipher);
while(p_part.hasNext()){
String next = p_part.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_r,_t})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_part");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_part.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_part.close();
Scanner p_help = new Scanner(SubstitutionCracker2.cipher);
while(p_help.hasNext()){
String next = p_help.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_h,_e,_l})){
SubstitutionCracker2.key[_p] = fourth.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_help");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_help.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_help.close();
Scanner p_princess = new Scanner(SubstitutionCracker2.cipher);
while(p_princess.hasNext()){
String next = p_princess.next();
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
new int[]{_r,_i,_n,_c,_e,_s,_s})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_princess");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_princess.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_princess.close();
Scanner p_power = new Scanner(SubstitutionCracker2.cipher);
while(p_power.hasNext()){
String next = p_power.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_w,_e,_r})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_power");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_power.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_power.close();
Scanner p_passed = new Scanner(SubstitutionCracker2.cipher);
while(p_passed.hasNext()){
String next = p_passed.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_a,_s,_s,_e,_d})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_passed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_passed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_passed.close();
Scanner p_pass = new Scanner(SubstitutionCracker2.cipher);
while(p_pass.hasNext()){
String next = p_pass.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_s,_s})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_pass");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_pass.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_pass.close();
Scanner p_spirit = new Scanner(SubstitutionCracker2.cipher);
while(p_spirit.hasNext()){
String next = p_spirit.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth},
new int[]{_s,_i,_r,_i,_t})){
SubstitutionCracker2.key[_p] = second.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_spirit");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_spirit.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_spirit.close();
Scanner p_open = new Scanner(SubstitutionCracker2.cipher);
while(p_open.hasNext()){
String next = p_open.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_o,_e,_n})){
SubstitutionCracker2.key[_p] = second.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_open");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_open.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_open.close();
Scanner p_peace = new Scanner(SubstitutionCracker2.cipher);
while(p_peace.hasNext()){
String next = p_peace.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_e,_a,_c,_e})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_peace");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_peace.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_peace.close();
Scanner p_hope = new Scanner(SubstitutionCracker2.cipher);
while(p_hope.hasNext()){
String next = p_hope.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_h,_o,_e})){
SubstitutionCracker2.key[_p] = third.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_hope");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_hope.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_hope.close();
Scanner p_perhaps = new Scanner(SubstitutionCracker2.cipher);
while(p_perhaps.hasNext()){
String next = p_perhaps.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(first.equalsIgnoreCase(sixth)){
if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,seventh},
new int[]{_e,_r,_h,_a,_s})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_perhaps");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_perhaps.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_perhaps.close();
Scanner p_plant = new Scanner(SubstitutionCracker2.cipher);
while(p_plant.hasNext()){
String next = p_plant.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_l,_a,_n,_t})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_plant");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_plant.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_plant.close();
Scanner p_poor = new Scanner(SubstitutionCracker2.cipher);
while(p_poor.hasNext()){
String next = p_poor.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_o,_r})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_poor");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_poor.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_poor.close();
Scanner p_past = new Scanner(SubstitutionCracker2.cipher);
while(p_past.hasNext()){
String next = p_past.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_s,_t})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_past");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_past.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_past.close();
Scanner p_emperor = new Scanner(SubstitutionCracker2.cipher);
while(p_emperor.hasNext()){
String next = p_emperor.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_e,_m,_e,_r,_o,_r})){
SubstitutionCracker2.key[_p] = third.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_emperor");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_emperor.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_emperor.close();
Scanner p_stopped = new Scanner(SubstitutionCracker2.cipher);
while(p_stopped.hasNext()){
String next = p_stopped.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(fourth.equalsIgnoreCase(fifth)){
if(massCalc_notAnyOther(new String[]{first,second,third,sixth,seventh},
new int[]{_s,_t,_o,_e,_d})){
SubstitutionCracker2.key[_p] = fourth.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_stopped");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_stopped.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_stopped.close();
Scanner p_opened = new Scanner(SubstitutionCracker2.cipher);
while(p_opened.hasNext()){
String next = p_opened.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth},
new int[]{_o,_e,_n,_e,_d})){
SubstitutionCracker2.key[_p] = second.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_opened");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_opened.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_opened.close();
Scanner p_napoleon = new Scanner(SubstitutionCracker2.cipher);
while(p_napoleon.hasNext()){
String next = p_napoleon.next();
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
new int[]{_n,_a,_o,_l,_e,_o,_n})){
SubstitutionCracker2.key[_p] = third.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_napoleon");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_napoleon.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_napoleon.close();
Scanner p_present = new Scanner(SubstitutionCracker2.cipher);
while(p_present.hasNext()){
String next = p_present.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_r,_e,_s,_e,_n,_t})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_present");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_present.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_present.close();
Scanner p_plants = new Scanner(SubstitutionCracker2.cipher);
while(p_plants.hasNext()){
String next = p_plants.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_l,_a,_n,_t,_s})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_plants");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_plants.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_plants.close();
Scanner p_appeared = new Scanner(SubstitutionCracker2.cipher);
while(p_appeared.hasNext()){
String next = p_appeared.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(second.equalsIgnoreCase(third)){
if(massCalc_notAnyOther(new String[]{first,fourth,fifth,sixth,seventh,eighth},
new int[]{_a,_e,_a,_r,_e,_d})){
SubstitutionCracker2.key[_p] = second.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_appeared");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_appeared.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_appeared.close();
Scanner p_president = new Scanner(SubstitutionCracker2.cipher);
while(p_president.hasNext()){
String next = p_president.next();
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
new int[]{_r,_e,_s,_i,_d,_e,_n,_t})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_president");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_president.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_president.close();
Scanner p_point = new Scanner(SubstitutionCracker2.cipher);
while(p_point.hasNext()){
String next = p_point.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_i,_n,_t})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_point");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_point.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_point.close();
Scanner p_prophecy = new Scanner(SubstitutionCracker2.cipher);
while(p_prophecy.hasNext()){
String next = p_prophecy.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(first.equalsIgnoreCase(fourth)){
if(massCalc_notAnyOther(new String[]{second,third,fifth,sixth,seventh,eighth},
new int[]{_r,_o,_h,_e,_c,_y})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_prophecy");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_prophecy.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_prophecy.close();
Scanner p_important = new Scanner(SubstitutionCracker2.cipher);
while(p_important.hasNext()){
String next = p_important.next();
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
new int[]{_i,_m,_o,_r,_t,_a,_n,_t})){
SubstitutionCracker2.key[_p] = third.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_important");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_important.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_important.close();
Scanner p_happened = new Scanner(SubstitutionCracker2.cipher);
while(p_happened.hasNext()){
String next = p_happened.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(third.equalsIgnoreCase(fourth)){
if(massCalc_notAnyOther(new String[]{first,second,fifth,sixth,seventh,eighth},
new int[]{_h,_a,_e,_n,_e,_d})){
SubstitutionCracker2.key[_p] = third.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_happened");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_happened.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_happened.close();
Scanner p_position = new Scanner(SubstitutionCracker2.cipher);
while(p_position.hasNext()){
String next = p_position.next();
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
new int[]{_o,_s,_i,_t,_i,_o,_n})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_position");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_position.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_position.close();
Scanner p_troops = new Scanner(SubstitutionCracker2.cipher);
while(p_troops.hasNext()){
String next = p_troops.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth},
new int[]{_t,_r,_o,_o,_s})){
SubstitutionCracker2.key[_p] = fifth.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_troops");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_troops.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_troops.close();
Scanner p_top = new Scanner(SubstitutionCracker2.cipher);
while(p_top.hasNext()){
String next = p_top.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_t,_o})){
SubstitutionCracker2.key[_p] = third.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_top");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_top.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_top.close();
Scanner p_priests = new Scanner(SubstitutionCracker2.cipher);
while(p_priests.hasNext()){
String next = p_priests.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_r,_i,_e,_s,_t,_s})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_priests");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_priests.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_priests.close();
Scanner p_praise = new Scanner(SubstitutionCracker2.cipher);
while(p_praise.hasNext()){
String next = p_praise.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_r,_a,_i,_s,_e})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_praise");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_praise.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_praise.close();
Scanner p_person = new Scanner(SubstitutionCracker2.cipher);
while(p_person.hasNext()){
String next = p_person.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_e,_r,_s,_o,_n})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_person");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_person.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_person.close();
Scanner p_deep = new Scanner(SubstitutionCracker2.cipher);
while(p_deep.hasNext()){
String next = p_deep.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_d,_e,_e})){
SubstitutionCracker2.key[_p] = fourth.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_deep");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_deep.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_deep.close();
Scanner p_spread = new Scanner(SubstitutionCracker2.cipher);
while(p_spread.hasNext()){
String next = p_spread.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth},
new int[]{_s,_r,_e,_a,_d})){
SubstitutionCracker2.key[_p] = second.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_spread");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_spread.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_spread.close();
Scanner p_pay = new Scanner(SubstitutionCracker2.cipher);
while(p_pay.hasNext()){
String next = p_pay.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_a,_y})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_pay");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_pay.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_pay.close();
Scanner p_support = new Scanner(SubstitutionCracker2.cipher);
while(p_support.hasNext()){
String next = p_support.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(third.equalsIgnoreCase(fourth)){
if(massCalc_notAnyOther(new String[]{first,second,fifth,sixth,seventh},
new int[]{_s,_u,_o,_r,_t})){
SubstitutionCracker2.key[_p] = third.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_support");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_support.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_support.close();
Scanner p_replied = new Scanner(SubstitutionCracker2.cipher);
while(p_replied.hasNext()){
String next = p_replied.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_r,_e,_l,_i,_e,_d})){
SubstitutionCracker2.key[_p] = third.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_replied");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_replied.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_replied.close();
Scanner p_simply = new Scanner(SubstitutionCracker2.cipher);
while(p_simply.hasNext()){
String next = p_simply.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_s,_i,_m,_l,_y})){
SubstitutionCracker2.key[_p] = fourth.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_simply");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_simply.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_simply.close();
Scanner p_especially = new Scanner(SubstitutionCracker2.cipher);
while(p_especially.hasNext()){
String next = p_especially.next();
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
new int[]{_e,_s,_e,_c,_i,_a,_l,_l,_y})){
SubstitutionCracker2.key[_p] = third.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_especially");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_especially.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_especially.close();
Scanner p_political = new Scanner(SubstitutionCracker2.cipher);
while(p_political.hasNext()){
String next = p_political.next();
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
new int[]{_o,_l,_i,_t,_i,_c,_a,_l})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_political");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_political.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_political.close();
Scanner p_temple = new Scanner(SubstitutionCracker2.cipher);
while(p_temple.hasNext()){
String next = p_temple.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_t,_e,_m,_l,_e})){
SubstitutionCracker2.key[_p] = fourth.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_temple");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_temple.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_temple.close();
Scanner p_prepared = new Scanner(SubstitutionCracker2.cipher);
while(p_prepared.hasNext()){
String next = p_prepared.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(first.equalsIgnoreCase(fourth)){
if(massCalc_notAnyOther(new String[]{second,third,fifth,sixth,seventh,eighth},
new int[]{_r,_e,_a,_r,_e,_d})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_prepared");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_prepared.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_prepared.close();
Scanner p_stop = new Scanner(SubstitutionCracker2.cipher);
while(p_stop.hasNext()){
String next = p_stop.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_s,_t,_o})){
SubstitutionCracker2.key[_p] = fourth.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_stop");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_stop.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_stop.close();
Scanner p_princes = new Scanner(SubstitutionCracker2.cipher);
while(p_princes.hasNext()){
String next = p_princes.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_r,_i,_n,_c,_e,_s})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_princes");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_princes.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_princes.close();
Scanner p_please = new Scanner(SubstitutionCracker2.cipher);
while(p_please.hasNext()){
String next = p_please.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_l,_e,_a,_s,_e})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_please");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_please.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_please.close();
Scanner p_plan = new Scanner(SubstitutionCracker2.cipher);
while(p_plan.hasNext()){
String next = p_plan.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_l,_a,_n})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_plan");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_plan.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_plan.close();
Scanner p_priest = new Scanner(SubstitutionCracker2.cipher);
while(p_priest.hasNext()){
String next = p_priest.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_r,_i,_e,_s,_t})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_priest");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_priest.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_priest.close();
Scanner p_steps = new Scanner(SubstitutionCracker2.cipher);
while(p_steps.hasNext()){
String next = p_steps.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_s,_t,_e,_s})){
SubstitutionCracker2.key[_p] = fourth.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_steps");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_steps.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_steps.close();
Scanner p_places = new Scanner(SubstitutionCracker2.cipher);
while(p_places.hasNext()){
String next = p_places.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_l,_a,_c,_e,_s})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_places");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_places.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_places.close();
Scanner p_happy = new Scanner(SubstitutionCracker2.cipher);
while(p_happy.hasNext()){
String next = p_happy.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(third.equalsIgnoreCase(fourth)){
if(massCalc_notAnyOther(new String[]{first,second,fifth},
new int[]{_h,_a,_y})){
SubstitutionCracker2.key[_p] = third.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_happy");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_happy.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_happy.close();
Scanner p_spent = new Scanner(SubstitutionCracker2.cipher);
while(p_spent.hasNext()){
String next = p_spent.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_s,_e,_n,_t})){
SubstitutionCracker2.key[_p] = second.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_spent");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_spent.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_spent.close();
Scanner p_gospel = new Scanner(SubstitutionCracker2.cipher);
while(p_gospel.hasNext()){
String next = p_gospel.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_g,_o,_s,_e,_l})){
SubstitutionCracker2.key[_p] = fourth.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_gospel");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_gospel.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_gospel.close();
Scanner p_phalaenopsis = new Scanner(SubstitutionCracker2.cipher);
while(p_phalaenopsis.hasNext()){
String next = p_phalaenopsis.next();
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

if(first.equalsIgnoreCase(ninth)){
if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh,eighth,tenth,eleventh,twelfth},
new int[]{_h,_a,_l,_a,_e,_n,_o,_s,_i,_s})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_phalaenopsis");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_phalaenopsis.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_phalaenopsis.close();
Scanner p_paul = new Scanner(SubstitutionCracker2.cipher);
while(p_paul.hasNext()){
String next = p_paul.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_u,_l})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_paul");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_paul.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_paul.close();
Scanner p_pulled = new Scanner(SubstitutionCracker2.cipher);
while(p_pulled.hasNext()){
String next = p_pulled.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_u,_l,_l,_e,_d})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_pulled");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_pulled.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_pulled.close();
Scanner p_group = new Scanner(SubstitutionCracker2.cipher);
while(p_group.hasNext()){
String next = p_group.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_g,_r,_o,_u})){
SubstitutionCracker2.key[_p] = fifth.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_group");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_group.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_group.close();
Scanner p_presence = new Scanner(SubstitutionCracker2.cipher);
while(p_presence.hasNext()){
String next = p_presence.next();
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
new int[]{_r,_e,_s,_e,_n,_c,_e})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_presence");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_presence.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_presence.close();
Scanner p_pray = new Scanner(SubstitutionCracker2.cipher);
while(p_pray.hasNext()){
String next = p_pray.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_r,_a,_y})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_pray");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_pray.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_pray.close();
Scanner p_appointed = new Scanner(SubstitutionCracker2.cipher);
while(p_appointed.hasNext()){
String next = p_appointed.next();
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

if(second.equalsIgnoreCase(third)){
if(massCalc_notAnyOther(new String[]{first,fourth,fifth,sixth,seventh,eighth,ninth},
new int[]{_a,_o,_i,_n,_t,_e,_d})){
SubstitutionCracker2.key[_p] = second.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_appointed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_appointed.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_appointed.close();
Scanner p_pollen = new Scanner(SubstitutionCracker2.cipher);
while(p_pollen.hasNext()){
String next = p_pollen.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_o,_l,_l,_e,_n})){
SubstitutionCracker2.key[_p] = first.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_pollen");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_pollen.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_pollen.close();
Scanner p_appear = new Scanner(SubstitutionCracker2.cipher);
while(p_appear.hasNext()){
String next = p_appear.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(second.equalsIgnoreCase(third)){
if(massCalc_notAnyOther(new String[]{first,fourth,fifth,sixth},
new int[]{_a,_e,_a,_r})){
SubstitutionCracker2.key[_p] = second.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_appear");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_appear.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasP){
p_appear.close();
Scanner p_company = new Scanner(SubstitutionCracker2.cipher);
while(p_company.hasNext()){
String next = p_company.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_c,_o,_m,_a,_n,_y})){
SubstitutionCracker2.key[_p] = fourth.toLowerCase();
SubstitutionCracker2.hasP=true;
System.err.println("SubstitutionCracker2.hasP=true; via Scanner p_company");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

p_company.close();
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
