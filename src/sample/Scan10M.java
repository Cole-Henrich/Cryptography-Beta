package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan10M{
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

public Scan10M(){
System.err.println("new Scan10M");


Scanner m_him = new Scanner(SubstitutionCracker2.cipher);
while(m_him.hasNext()){
String next = m_him.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_h,_i})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_him");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_him.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_him.close();
Scanner m_them = new Scanner(SubstitutionCracker2.cipher);
while(m_them.hasNext()){
String next = m_them.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_t,_h,_e})){
SubstitutionCracker2.key[_m] = fourth.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_them");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_them.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_them.close();
Scanner m_me = new Scanner(SubstitutionCracker2.cipher);
while(m_me.hasNext()){
String next = m_me.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{second},
new int[]{_e})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_me");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_me.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_me.close();
Scanner m_man = new Scanner(SubstitutionCracker2.cipher);
while(m_man.hasNext()){
String next = m_man.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_a,_n})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_man");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_man.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_man.close();
Scanner m_more = new Scanner(SubstitutionCracker2.cipher);
while(m_more.hasNext()){
String next = m_more.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_r,_e})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_more");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_more.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_more.close();
Scanner m_made = new Scanner(SubstitutionCracker2.cipher);
while(m_made.hasNext()){
String next = m_made.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_a,_d,_e})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_made");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_made.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_made.close();
Scanner m_some = new Scanner(SubstitutionCracker2.cipher);
while(m_some.hasNext()){
String next = m_some.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_s,_o,_e})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_some");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_some.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_some.close();
Scanner m_men = new Scanner(SubstitutionCracker2.cipher);
while(m_men.hasNext()){
String next = m_men.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_e,_n})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_men");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_men.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_men.close();
Scanner m_time = new Scanner(SubstitutionCracker2.cipher);
while(m_time.hasNext()){
String next = m_time.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_t,_i,_e})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_time");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_time.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_time.close();
Scanner m_am = new Scanner(SubstitutionCracker2.cipher);
while(m_am.hasNext()){
String next = m_am.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{first},
new int[]{_a})){
SubstitutionCracker2.key[_m] = second.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_am");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_am.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_am.close();
Scanner m_same = new Scanner(SubstitutionCracker2.cipher);
while(m_same.hasNext()){
String next = m_same.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_s,_a,_e})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_same");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_same.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_same.close();
Scanner m_must = new Scanner(SubstitutionCracker2.cipher);
while(m_must.hasNext()){
String next = m_must.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_u,_s,_t})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_must");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_must.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_must.close();
Scanner m_most = new Scanner(SubstitutionCracker2.cipher);
while(m_most.hasNext()){
String next = m_most.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_s,_t})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_most");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_most.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_most.close();
Scanner m_seemed = new Scanner(SubstitutionCracker2.cipher);
while(m_seemed.hasNext()){
String next = m_seemed.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_s,_e,_e,_e,_d})){
SubstitutionCracker2.key[_m] = fourth.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_seemed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_seemed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_seemed.close();
Scanner m_name = new Scanner(SubstitutionCracker2.cipher);
while(m_name.hasNext()){
String next = m_name.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_n,_a,_e})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_name");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_name.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_name.close();
Scanner m_room = new Scanner(SubstitutionCracker2.cipher);
while(m_room.hasNext()){
String next = m_room.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_r,_o,_o})){
SubstitutionCracker2.key[_m] = fourth.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_room");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_room.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_room.close();
Scanner m_mother = new Scanner(SubstitutionCracker2.cipher);
while(m_mother.hasNext()){
String next = m_mother.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_o,_t,_h,_e,_r})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_mother");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_mother.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_mother.close();
Scanner m_miss = new Scanner(SubstitutionCracker2.cipher);
while(m_miss.hasNext()){
String next = m_miss.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_s,_s})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_miss");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_miss.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_miss.close();
Scanner m_midst = new Scanner(SubstitutionCracker2.cipher);
while(m_midst.hasNext()){
String next = m_midst.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_i,_d,_s,_t})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_midst");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_midst.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_midst.close();
Scanner m_small = new Scanner(SubstitutionCracker2.cipher);
while(m_small.hasNext()){
String next = m_small.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_s,_a,_l,_l})){
SubstitutionCracker2.key[_m] = second.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_small");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_small.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_small.close();
Scanner m_moment = new Scanner(SubstitutionCracker2.cipher);
while(m_moment.hasNext()){
String next = m_moment.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(first.equalsIgnoreCase(third)){
if(massCalc_notAnyOther(new String[]{second,fourth,fifth,sixth},
new int[]{_o,_e,_n,_t})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_moment");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_moment.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_moment.close();
Scanner m_mind = new Scanner(SubstitutionCracker2.cipher);
while(m_mind.hasNext()){
String next = m_mind.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_i,_n,_d})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_mind");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_mind.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_mind.close();
Scanner m_moses = new Scanner(SubstitutionCracker2.cipher);
while(m_moses.hasNext()){
String next = m_moses.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_s,_e,_s})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_moses");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_moses.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_moses.close();
Scanner m_almost = new Scanner(SubstitutionCracker2.cipher);
while(m_almost.hasNext()){
String next = m_almost.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_a,_l,_o,_s,_t})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_almost");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_almost.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_almost.close();
Scanner m_times = new Scanner(SubstitutionCracker2.cipher);
while(m_times.hasNext()){
String next = m_times.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_t,_i,_e,_s})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_times");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_times.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_times.close();
Scanner m_mouth = new Scanner(SubstitutionCracker2.cipher);
while(m_mouth.hasNext()){
String next = m_mouth.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_u,_t,_h})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_mouth");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_mouth.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_mouth.close();
Scanner m_meet = new Scanner(SubstitutionCracker2.cipher);
while(m_meet.hasNext()){
String next = m_meet.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_e,_t})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_meet");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_meet.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_meet.close();
Scanner m_sometimes = new Scanner(SubstitutionCracker2.cipher);
while(m_sometimes.hasNext()){
String next = m_sometimes.next();
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

if(third.equalsIgnoreCase(seventh)){
if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,eighth,ninth},
new int[]{_s,_o,_e,_t,_i,_e,_s})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_sometimes");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_sometimes.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_sometimes.close();
Scanner m_remained = new Scanner(SubstitutionCracker2.cipher);
while(m_remained.hasNext()){
String next = m_remained.next();
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
new int[]{_r,_e,_a,_i,_n,_e,_d})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_remained");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_remained.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_remained.close();
Scanner m_home = new Scanner(SubstitutionCracker2.cipher);
while(m_home.hasNext()){
String next = m_home.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_h,_o,_e})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_home");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_home.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_home.close();
Scanner m_met = new Scanner(SubstitutionCracker2.cipher);
while(m_met.hasNext()){
String next = m_met.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_e,_t})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_met");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_met.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_met.close();
Scanner m_matter = new Scanner(SubstitutionCracker2.cipher);
while(m_matter.hasNext()){
String next = m_matter.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_a,_t,_t,_e,_r})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_matter");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_matter.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_matter.close();
Scanner m_multitude = new Scanner(SubstitutionCracker2.cipher);
while(m_multitude.hasNext()){
String next = m_multitude.next();
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
new int[]{_u,_l,_t,_i,_t,_u,_d,_e})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_multitude");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_multitude.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_multitude.close();
Scanner m_manner = new Scanner(SubstitutionCracker2.cipher);
while(m_manner.hasNext()){
String next = m_manner.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_a,_n,_n,_e,_r})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_manner");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_manner.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_manner.close();
Scanner m_smile = new Scanner(SubstitutionCracker2.cipher);
while(m_smile.hasNext()){
String next = m_smile.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_s,_i,_l,_e})){
SubstitutionCracker2.key[_m] = second.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_smile");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_smile.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_smile.close();
Scanner m_arm = new Scanner(SubstitutionCracker2.cipher);
while(m_arm.hasNext()){
String next = m_arm.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_a,_r})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_arm");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_arm.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_arm.close();
Scanner m_arms = new Scanner(SubstitutionCracker2.cipher);
while(m_arms.hasNext()){
String next = m_arms.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_a,_r,_s})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_arms");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_arms.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_arms.close();
Scanner m_means = new Scanner(SubstitutionCracker2.cipher);
while(m_means.hasNext()){
String next = m_means.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_e,_a,_n,_s})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_means");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_means.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_means.close();
Scanner m_mount = new Scanner(SubstitutionCracker2.cipher);
while(m_mount.hasNext()){
String next = m_mount.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_u,_n,_t})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_mount");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_mount.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_mount.close();
Scanner m_human = new Scanner(SubstitutionCracker2.cipher);
while(m_human.hasNext()){
String next = m_human.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_h,_u,_a,_n})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_human");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_human.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_human.close();
Scanner m_mean = new Scanner(SubstitutionCracker2.cipher);
while(m_mean.hasNext()){
String next = m_mean.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_a,_n})){
SubstitutionCracker2.key[_m] = first.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_mean");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_mean.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_mean.close();
Scanner m_remain = new Scanner(SubstitutionCracker2.cipher);
while(m_remain.hasNext()){
String next = m_remain.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_r,_e,_a,_i,_n})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_remain");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_remain.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_remain.close();
Scanner m_someone = new Scanner(SubstitutionCracker2.cipher);
while(m_someone.hasNext()){
String next = m_someone.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_s,_o,_e,_o,_n,_e})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_someone");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_someone.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_someone.close();
Scanner m_auma = new Scanner(SubstitutionCracker2.cipher);
while(m_auma.hasNext()){
String next = m_auma.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_a,_u,_a})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_auma");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_auma.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_auma.close();
Scanner m_enemies = new Scanner(SubstitutionCracker2.cipher);
while(m_enemies.hasNext()){
String next = m_enemies.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_e,_n,_e,_i,_e,_s})){
SubstitutionCracker2.key[_m] = fourth.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_enemies");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_enemies.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasM){
m_enemies.close();
Scanner m_tom = new Scanner(SubstitutionCracker2.cipher);
while(m_tom.hasNext()){
String next = m_tom.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_t,_o})){
SubstitutionCracker2.key[_m] = third.toLowerCase();
SubstitutionCracker2.hasM=true;
System.err.println("SubstitutionCracker2.hasM=true; via Scanner m_tom");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

m_tom.close();
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
