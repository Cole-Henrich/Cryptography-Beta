package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan9U{
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

public Scan9U(){
System.err.println("new Scan9U");
    System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));


Scanner u_thou = new Scanner(SubstitutionCracker2.cipher);
while(u_thou.hasNext()){
String next = u_thou.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_t,_h,_o})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = fourth.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_thou");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_thou.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_thou.close();
Scanner u_out = new Scanner(SubstitutionCracker2.cipher);
while(u_out.hasNext()){
String next = u_out.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,third},
new int[]{_o,_t})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = second.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_out");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_out.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_out.close();
Scanner u_our = new Scanner(SubstitutionCracker2.cipher);
while(u_our.hasNext()){
String next = u_our.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,third},
new int[]{_o,_r})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = second.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_our");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_our.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_our.close();
Scanner u_should = new Scanner(SubstitutionCracker2.cipher);
while(u_should.hasNext()){
String next = u_should.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_s,_h,_o,_l,_d})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = fourth.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_should");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_should.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_should.close();
Scanner u_us = new Scanner(SubstitutionCracker2.cipher);
while(u_us.hasNext()){
String next = u_us.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{second},
new int[]{_s})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = first.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_us");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_us.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_us.close();
Scanner u_house = new Scanner(SubstitutionCracker2.cipher);
while(u_house.hasNext()){
String next = u_house.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_h,_o,_s,_e})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = third.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_house");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_house.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_house.close();
Scanner u_unto = new Scanner(SubstitutionCracker2.cipher);
while(u_unto.hasNext()){
String next = u_unto.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_n,_t,_o})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = first.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_unto");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_unto.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_unto.close();
Scanner u_under = new Scanner(SubstitutionCracker2.cipher);
while(u_under.hasNext()){
String next = u_under.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_n,_d,_e,_r})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = first.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_under");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_under.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_under.close();
Scanner u_turned = new Scanner(SubstitutionCracker2.cipher);
while(u_turned.hasNext()){
String next = u_turned.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth},
new int[]{_t,_r,_n,_e,_d})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = second.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_turned");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_turned.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_turned.close();
Scanner u_round = new Scanner(SubstitutionCracker2.cipher);
while(u_round.hasNext()){
String next = u_round.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_r,_o,_n,_d})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = third.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_round");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_round.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_round.close();
Scanner u_hundred = new Scanner(SubstitutionCracker2.cipher);
while(u_hundred.hasNext()){
String next = u_hundred.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_h,_n,_d,_r,_e,_d})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = second.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_hundred");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_hundred.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_hundred.close();
Scanner u_until = new Scanner(SubstitutionCracker2.cipher);
while(u_until.hasNext()){
String next = u_until.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_n,_t,_i,_l})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = first.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_until");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_until.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_until.close();
Scanner u_thousand = new Scanner(SubstitutionCracker2.cipher);
while(u_thousand.hasNext()){
String next = u_thousand.next();
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
new int[]{_t,_h,_o,_s,_a,_n,_d})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = fourth.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_thousand");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_thousand.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_thousand.close();
Scanner u_thus = new Scanner(SubstitutionCracker2.cipher);
while(u_thus.hasNext()){
String next = u_thus.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_t,_h,_s})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = third.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_thus");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_thus.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_thus.close();
Scanner u_around = new Scanner(SubstitutionCracker2.cipher);
while(u_around.hasNext()){
String next = u_around.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_a,_r,_o,_n,_d})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = fourth.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_around");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_around.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_around.close();
Scanner u_returned = new Scanner(SubstitutionCracker2.cipher);
while(u_returned.hasNext()){
String next = u_returned.next();
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
new int[]{_r,_e,_t,_r,_n,_e,_d})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = fourth.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_returned");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_returned.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_returned.close();
Scanner u_understand = new Scanner(SubstitutionCracker2.cipher);
while(u_understand.hasNext()){
String next = u_understand.next();
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

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth},
new int[]{_n,_d,_e,_r,_s,_t,_a,_n,_d})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = first.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_understand");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_understand.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_understand.close();
Scanner u_soul = new Scanner(SubstitutionCracker2.cipher);
while(u_soul.hasNext()){
String next = u_soul.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_s,_o,_l})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = third.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_soul");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_soul.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_soul.close();
Scanner u_turn = new Scanner(SubstitutionCracker2.cipher);
while(u_turn.hasNext()){
String next = u_turn.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_t,_r,_n})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = second.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_turn");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_turn.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_turn.close();
Scanner u_return = new Scanner(SubstitutionCracker2.cipher);
while(u_return.hasNext()){
String next = u_return.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_r,_e,_t,_r,_n})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = fourth.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_return");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_return.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_return.close();
Scanner u_russian = new Scanner(SubstitutionCracker2.cipher);
while(u_russian.hasNext()){
String next = u_russian.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_r,_s,_s,_i,_a,_n})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = second.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_russian");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_russian.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_russian.close();
Scanner u_sound = new Scanner(SubstitutionCracker2.cipher);
while(u_sound.hasNext()){
String next = u_sound.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_s,_o,_n,_d})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = third.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_sound");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_sound.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_sound.close();
Scanner u_used = new Scanner(SubstitutionCracker2.cipher);
while(u_used.hasNext()){
String next = u_used.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_s,_e,_d})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = first.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_used");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_used.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_used.close();
Scanner u_understood = new Scanner(SubstitutionCracker2.cipher);
while(u_understood.hasNext()){
String next = u_understood.next();
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

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth},
new int[]{_n,_d,_e,_r,_s,_t,_o,_o,_d})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = first.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_understood");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_understood.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_understood.close();
Scanner u_run = new Scanner(SubstitutionCracker2.cipher);
while(u_run.hasNext()){
String next = u_run.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,third},
new int[]{_r,_n})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = second.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_run");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_run.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_run.close();
Scanner u_sure = new Scanner(SubstitutionCracker2.cipher);
while(u_sure.hasNext()){
String next = u_sure.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_s,_r,_e})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = second.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_sure");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_sure.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_sure.close();
Scanner u_use = new Scanner(SubstitutionCracker2.cipher);
while(u_use.hasNext()){
String next = u_use.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_s,_e})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = first.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_use");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_use.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_use.close();
Scanner u_saul = new Scanner(SubstitutionCracker2.cipher);
while(u_saul.hasNext()){
String next = u_saul.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_s,_a,_l})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = third.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_saul");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_saul.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_saul.close();
Scanner u_shouted = new Scanner(SubstitutionCracker2.cipher);
while(u_shouted.hasNext()){
String next = u_shouted.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_s,_h,_o,_t,_e,_d})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = fourth.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_shouted");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_shouted.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_shouted.close();
Scanner u_true = new Scanner(SubstitutionCracker2.cipher);
while(u_true.hasNext()){
String next = u_true.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_t,_r,_e})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = third.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_true");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_true.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_true.close();
Scanner u_sun = new Scanner(SubstitutionCracker2.cipher);
while(u_sun.hasNext()){
String next = u_sun.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,third},
new int[]{_s,_n})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = second.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_sun");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_sun.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_sun.close();
Scanner u_shut = new Scanner(SubstitutionCracker2.cipher);
while(u_shut.hasNext()){
String next = u_shut.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_s,_h,_t})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = third.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_shut");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_shut.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_shut.close();
Scanner u_south = new Scanner(SubstitutionCracker2.cipher);
while(u_south.hasNext()){
String next = u_south.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_s,_o,_t,_h})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = third.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_south");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_south.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_south.close();
Scanner u_hour = new Scanner(SubstitutionCracker2.cipher);
while(u_hour.hasNext()){
String next = u_hour.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_h,_o,_r})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = third.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_hour");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_hour.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_hour.close();
Scanner u_truth = new Scanner(SubstitutionCracker2.cipher);
while(u_truth.hasNext()){
String next = u_truth.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_t,_r,_t,_h})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = third.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_truth");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_truth.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_truth.close();
Scanner u_houses = new Scanner(SubstitutionCracker2.cipher);
while(u_houses.hasNext()){
String next = u_houses.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_h,_o,_s,_e,_s})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = third.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_houses");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_houses.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_houses.close();
Scanner u_united = new Scanner(SubstitutionCracker2.cipher);
while(u_united.hasNext()){
String next = u_united.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_n,_i,_t,_e,_d})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = first.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_united");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_united.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_united.close();
Scanner u_outside = new Scanner(SubstitutionCracker2.cipher);
while(u_outside.hasNext()){
String next = u_outside.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_o,_t,_s,_i,_d,_e})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = second.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_outside");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_outside.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_outside.close();
Scanner u_trust = new Scanner(SubstitutionCracker2.cipher);
while(u_trust.hasNext()){
String next = u_trust.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_t,_r,_s,_t})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = third.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_trust");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_trust.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_trust.close();
Scanner u_loud = new Scanner(SubstitutionCracker2.cipher);
while(u_loud.hasNext()){
String next = u_loud.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_l,_o,_d})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = third.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_loud");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_loud.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_loud.close();
Scanner u_rule = new Scanner(SubstitutionCracker2.cipher);
while(u_rule.hasNext()){
String next = u_rule.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_r,_l,_e})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = second.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_rule");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_rule.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasU){
u_rule.close();
Scanner u_unless = new Scanner(SubstitutionCracker2.cipher);
while(u_unless.hasNext()){
String next = u_unless.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_n,_l,_e,_s,_s})){
if (notAnotherVowel(SubstitutionCracker2.key[_u], _u)){
SubstitutionCracker2.key[_u] = first.toLowerCase();
SubstitutionCracker2.hasU=true;
System.err.println("SubstitutionCracker2.hasU=true; via Scanner u_unless");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

u_unless.close();
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
