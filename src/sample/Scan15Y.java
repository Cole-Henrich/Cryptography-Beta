package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan15Y{
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

public Scan15Y(){
System.err.println("new Scan15Y");


Scanner y_they = new Scanner(SubstitutionCracker2.cipher);
while(y_they.hasNext()){
String next = y_they.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_t,_h,_e})){
if (notAnotherVowel(fourth,_y)){
SubstitutionCracker2.key[_y] = fourth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_they");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_they.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_they.close();
Scanner y_you = new Scanner(SubstitutionCracker2.cipher);
while(y_you.hasNext()){
String next = y_you.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_o,_u})){
if (notAnotherVowel(first,_y)){
SubstitutionCracker2.key[_y] = first.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_you");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_you.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_you.close();
Scanner y_my = new Scanner(SubstitutionCracker2.cipher);
while(y_my.hasNext()){
String next = y_my.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{first},
new int[]{_m})){
if (notAnotherVowel(second,_y)){
SubstitutionCracker2.key[_y] = second.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_my");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_my.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_my.close();
Scanner y_thy = new Scanner(SubstitutionCracker2.cipher);
while(y_thy.hasNext()){
String next = y_thy.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_t,_h})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_thy");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_thy.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_thy.close();
Scanner y_your = new Scanner(SubstitutionCracker2.cipher);
while(y_your.hasNext()){
String next = y_your.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_u,_r})){
if (notAnotherVowel(first,_y)){
SubstitutionCracker2.key[_y] = first.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_your");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_your.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_your.close();
Scanner y_only = new Scanner(SubstitutionCracker2.cipher);
while(y_only.hasNext()){
String next = y_only.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_o,_n,_l})){
if (notAnotherVowel(fourth,_y)){
SubstitutionCracker2.key[_y] = fourth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_only");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_only.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_only.close();
Scanner y_any = new Scanner(SubstitutionCracker2.cipher);
while(y_any.hasNext()){
String next = y_any.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_a,_n})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_any");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_any.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_any.close();
Scanner y_may = new Scanner(SubstitutionCracker2.cipher);
while(y_may.hasNext()){
String next = y_may.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_m,_a})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_may");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_may.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_may.close();
Scanner y_day = new Scanner(SubstitutionCracker2.cipher);
while(y_day.hasNext()){
String next = y_day.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_d,_a})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_day");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_day.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_day.close();
Scanner y_many = new Scanner(SubstitutionCracker2.cipher);
while(y_many.hasNext()){
String next = y_many.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_m,_a,_n})){
if (notAnotherVowel(fourth,_y)){
SubstitutionCracker2.key[_y] = fourth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_many");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_many.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_many.close();
Scanner y_say = new Scanner(SubstitutionCracker2.cipher);
while(y_say.hasNext()){
String next = y_say.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_s,_a})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_say");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_say.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_say.close();
Scanner y_away = new Scanner(SubstitutionCracker2.cipher);
while(y_away.hasNext()){
String next = y_away.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_a,_w,_a})){
if (notAnotherVowel(fourth,_y)){
SubstitutionCracker2.key[_y] = fourth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_away");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_away.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_away.close();
Scanner y_way = new Scanner(SubstitutionCracker2.cipher);
while(y_way.hasNext()){
String next = y_way.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_w,_a})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_way");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_way.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_way.close();
Scanner y_why = new Scanner(SubstitutionCracker2.cipher);
while(y_why.hasNext()){
String next = y_why.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_w,_h})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_why");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_why.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_why.close();
Scanner y_young = new Scanner(SubstitutionCracker2.cipher);
while(y_young.hasNext()){
String next = y_young.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_o,_u,_n,_g})){
if (notAnotherVowel(first,_y)){
SubstitutionCracker2.key[_y] = first.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_young");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_young.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_young.close();
Scanner y_always = new Scanner(SubstitutionCracker2.cipher);
while(y_always.hasNext()){
String next = y_always.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth},
new int[]{_a,_l,_w,_a,_s})){
if (notAnotherVowel(fifth,_y)){
SubstitutionCracker2.key[_y] = fifth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_always");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_always.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_always.close();
Scanner y_eyes = new Scanner(SubstitutionCracker2.cipher);
while(y_eyes.hasNext()){
String next = y_eyes.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_e,_e,_s})){
if (notAnotherVowel(second,_y)){
SubstitutionCracker2.key[_y] = second.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_eyes");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_eyes.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_eyes.close();
Scanner y_days = new Scanner(SubstitutionCracker2.cipher);
while(y_days.hasNext()){
String next = y_days.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_d,_a,_s})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_days");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_days.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_days.close();
Scanner y_yet = new Scanner(SubstitutionCracker2.cipher);
while(y_yet.hasNext()){
String next = y_yet.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_e,_t})){
if (notAnotherVowel(first,_y)){
SubstitutionCracker2.key[_y] = first.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_yet");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_yet.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_yet.close();
Scanner y_years = new Scanner(SubstitutionCracker2.cipher);
while(y_years.hasNext()){
String next = y_years.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_e,_a,_r,_s})){
if (notAnotherVowel(first,_y)){
SubstitutionCracker2.key[_y] = first.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_years");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_years.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_years.close();
Scanner y_ye = new Scanner(SubstitutionCracker2.cipher);
while(y_ye.hasNext()){
String next = y_ye.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{second},
new int[]{_e})){
if (notAnotherVowel(first,_y)){
SubstitutionCracker2.key[_y] = first.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_ye");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_ye.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_ye.close();
Scanner y_holy = new Scanner(SubstitutionCracker2.cipher);
while(y_holy.hasNext()){
String next = y_holy.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_h,_o,_l})){
if (notAnotherVowel(fourth,_y)){
SubstitutionCracker2.key[_y] = fourth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_holy");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_holy.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_holy.close();
Scanner y_army = new Scanner(SubstitutionCracker2.cipher);
while(y_army.hasNext()){
String next = y_army.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_a,_r,_m})){
if (notAnotherVowel(fourth,_y)){
SubstitutionCracker2.key[_y] = fourth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_army");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_army.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_army.close();
Scanner y_city = new Scanner(SubstitutionCracker2.cipher);
while(y_city.hasNext()){
String next = y_city.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_c,_i,_t})){
if (notAnotherVowel(fourth,_y)){
SubstitutionCracker2.key[_y] = fourth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_city");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_city.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_city.close();
Scanner y_already = new Scanner(SubstitutionCracker2.cipher);
while(y_already.hasNext()){
String next = y_already.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_a,_l,_r,_e,_a,_d})){
if (notAnotherVowel(seventh,_y)){
SubstitutionCracker2.key[_y] = seventh.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_already");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_already.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_already.close();
Scanner y_lay = new Scanner(SubstitutionCracker2.cipher);
while(y_lay.hasNext()){
String next = y_lay.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_l,_a})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_lay");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_lay.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_lay.close();
Scanner y_year = new Scanner(SubstitutionCracker2.cipher);
while(y_year.hasNext()){
String next = y_year.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_a,_r})){
if (notAnotherVowel(first,_y)){
SubstitutionCracker2.key[_y] = first.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_year");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_year.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_year.close();
Scanner y_suddenly = new Scanner(SubstitutionCracker2.cipher);
while(y_suddenly.hasNext()){
String next = y_suddenly.next();
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
new int[]{_s,_u,_d,_d,_e,_n,_l})){
if (notAnotherVowel(eighth,_y)){
SubstitutionCracker2.key[_y] = eighth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_suddenly");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_suddenly.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_suddenly.close();
Scanner y_mary = new Scanner(SubstitutionCracker2.cipher);
while(y_mary.hasNext()){
String next = y_mary.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_m,_a,_r})){
if (notAnotherVowel(fourth,_y)){
SubstitutionCracker2.key[_y] = fourth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_mary");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_mary.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_mary.close();
Scanner y_family = new Scanner(SubstitutionCracker2.cipher);
while(y_family.hasNext()){
String next = y_family.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_f,_a,_m,_i,_l})){
if (notAnotherVowel(sixth,_y)){
SubstitutionCracker2.key[_y] = sixth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_family");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_family.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_family.close();
Scanner y_myself = new Scanner(SubstitutionCracker2.cipher);
while(y_myself.hasNext()){
String next = y_myself.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth},
new int[]{_m,_s,_e,_l,_f})){
if (notAnotherVowel(second,_y)){
SubstitutionCracker2.key[_y] = second.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_myself");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_myself.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_myself.close();
Scanner y_anything = new Scanner(SubstitutionCracker2.cipher);
while(y_anything.hasNext()){
String next = y_anything.next();
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
new int[]{_a,_n,_t,_h,_i,_n,_g})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_anything");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_anything.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_anything.close();
Scanner y_money = new Scanner(SubstitutionCracker2.cipher);
while(y_money.hasNext()){
String next = y_money.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_m,_o,_n,_e})){
if (notAnotherVowel(fifth,_y)){
SubstitutionCracker2.key[_y] = fifth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_money");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_money.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_money.close();
Scanner y_glory = new Scanner(SubstitutionCracker2.cipher);
while(y_glory.hasNext()){
String next = y_glory.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_g,_l,_o,_r})){
if (notAnotherVowel(fifth,_y)){
SubstitutionCracker2.key[_y] = fifth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_glory");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_glory.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_glory.close();
Scanner y_really = new Scanner(SubstitutionCracker2.cipher);
while(y_really.hasNext()){
String next = y_really.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_r,_e,_a,_l,_l})){
if (notAnotherVowel(sixth,_y)){
SubstitutionCracker2.key[_y] = sixth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_really");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_really.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_really.close();
Scanner y_country = new Scanner(SubstitutionCracker2.cipher);
while(y_country.hasNext()){
String next = y_country.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_c,_o,_u,_n,_t,_r})){
if (notAnotherVowel(seventh,_y)){
SubstitutionCracker2.key[_y] = seventh.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_country");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_country.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_country.close();
Scanner y_twenty = new Scanner(SubstitutionCracker2.cipher);
while(y_twenty.hasNext()){
String next = y_twenty.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_t,_w,_e,_n,_t})){
if (notAnotherVowel(sixth,_y)){
SubstitutionCracker2.key[_y] = sixth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_twenty");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_twenty.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_twenty.close();
Scanner y_trying = new Scanner(SubstitutionCracker2.cipher);
while(y_trying.hasNext()){
String next = y_trying.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_t,_r,_i,_n,_g})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_trying");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_trying.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_trying.close();
Scanner y_saying = new Scanner(SubstitutionCracker2.cipher);
while(y_saying.hasNext()){
String next = y_saying.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_s,_a,_i,_n,_g})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_saying");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_saying.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_saying.close();
Scanner y_early = new Scanner(SubstitutionCracker2.cipher);
while(y_early.hasNext()){
String next = y_early.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_e,_a,_r,_l})){
if (notAnotherVowel(fifth,_y)){
SubstitutionCracker2.key[_y] = fifth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_early");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_early.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_early.close();
Scanner y_destroy = new Scanner(SubstitutionCracker2.cipher);
while(y_destroy.hasNext()){
String next = y_destroy.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_d,_e,_s,_t,_r,_o})){
if (notAnotherVowel(seventh,_y)){
SubstitutionCracker2.key[_y] = seventh.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_destroy");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_destroy.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_destroy.close();
Scanner y_ready = new Scanner(SubstitutionCracker2.cipher);
while(y_ready.hasNext()){
String next = y_ready.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_r,_e,_a,_d})){
if (notAnotherVowel(fifth,_y)){
SubstitutionCracker2.key[_y] = fifth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_ready");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_ready.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_ready.close();
Scanner y_mercy = new Scanner(SubstitutionCracker2.cipher);
while(y_mercy.hasNext()){
String next = y_mercy.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_m,_e,_r,_c})){
if (notAnotherVowel(fifth,_y)){
SubstitutionCracker2.key[_y] = fifth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_mercy");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_mercy.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_mercy.close();
Scanner y_history = new Scanner(SubstitutionCracker2.cipher);
while(y_history.hasNext()){
String next = y_history.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_h,_i,_s,_t,_o,_r})){
if (notAnotherVowel(seventh,_y)){
SubstitutionCracker2.key[_y] = seventh.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_history");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_history.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_history.close();
Scanner y_immediately = new Scanner(SubstitutionCracker2.cipher);
while(y_immediately.hasNext()){
String next = y_immediately.next();
if (next.length()==11){
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth},
new int[]{_i,_m,_m,_e,_d,_i,_a,_t,_e,_l})){
if (notAnotherVowel(eleventh,_y)){
SubstitutionCracker2.key[_y] = eleventh.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_immediately");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_immediately.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_immediately.close();
Scanner y_says = new Scanner(SubstitutionCracker2.cipher);
while(y_says.hasNext()){
String next = y_says.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_s,_a,_s})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_says");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_says.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_says.close();
Scanner y_try = new Scanner(SubstitutionCracker2.cipher);
while(y_try.hasNext()){
String next = y_try.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_t,_r})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_try");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_try.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_try.close();
Scanner y_stay = new Scanner(SubstitutionCracker2.cipher);
while(y_stay.hasNext()){
String next = y_stay.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_s,_t,_a})){
if (notAnotherVowel(fourth,_y)){
SubstitutionCracker2.key[_y] = fourth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_stay");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_stay.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_stay.close();
Scanner y_military = new Scanner(SubstitutionCracker2.cipher);
while(y_military.hasNext()){
String next = y_military.next();
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
new int[]{_m,_i,_l,_i,_t,_a,_r})){
if (notAnotherVowel(eighth,_y)){
SubstitutionCracker2.key[_y] = eighth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_military");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_military.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_military.close();
Scanner y_finally = new Scanner(SubstitutionCracker2.cipher);
while(y_finally.hasNext()){
String next = y_finally.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_f,_i,_n,_a,_l,_l})){
if (notAnotherVowel(seventh,_y)){
SubstitutionCracker2.key[_y] = seventh.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_finally");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_finally.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_finally.close();
Scanner y_ways = new Scanner(SubstitutionCracker2.cipher);
while(y_ways.hasNext()){
String next = y_ways.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_w,_a,_s})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_ways");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_ways.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_ways.close();
Scanner y_carry = new Scanner(SubstitutionCracker2.cipher);
while(y_carry.hasNext()){
String next = y_carry.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_c,_a,_r,_r})){
if (notAnotherVowel(fifth,_y)){
SubstitutionCracker2.key[_y] = fifth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_carry");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_carry.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_carry.close();
Scanner y_enemy = new Scanner(SubstitutionCracker2.cipher);
while(y_enemy.hasNext()){
String next = y_enemy.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_e,_n,_e,_m})){
if (notAnotherVowel(fifth,_y)){
SubstitutionCracker2.key[_y] = fifth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_enemy");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_enemy.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_enemy.close();
Scanner y_dry = new Scanner(SubstitutionCracker2.cipher);
while(y_dry.hasNext()){
String next = y_dry.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_d,_r})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_dry");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_dry.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_dry.close();
Scanner y_necessary = new Scanner(SubstitutionCracker2.cipher);
while(y_necessary.hasNext()){
String next = y_necessary.next();
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
new int[]{_n,_e,_c,_e,_s,_s,_a,_r})){
if (notAnotherVowel(ninth,_y)){
SubstitutionCracker2.key[_y] = ninth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_necessary");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_necessary.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_necessary.close();
Scanner y_today = new Scanner(SubstitutionCracker2.cipher);
while(y_today.hasNext()){
String next = y_today.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_t,_o,_d,_a})){
if (notAnotherVowel(fifth,_y)){
SubstitutionCracker2.key[_y] = fifth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_today");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_today.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_today.close();
Scanner y_story = new Scanner(SubstitutionCracker2.cipher);
while(y_story.hasNext()){
String next = y_story.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_s,_t,_o,_r})){
if (notAnotherVowel(fifth,_y)){
SubstitutionCracker2.key[_y] = fifth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_story");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_story.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_story.close();
Scanner y_angry = new Scanner(SubstitutionCracker2.cipher);
while(y_angry.hasNext()){
String next = y_angry.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_a,_n,_g,_r})){
if (notAnotherVowel(fifth,_y)){
SubstitutionCracker2.key[_y] = fifth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_angry");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_angry.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_angry.close();
Scanner y_destroyed = new Scanner(SubstitutionCracker2.cipher);
while(y_destroyed.hasNext()){
String next = y_destroyed.next();
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
new int[]{_d,_e,_s,_t,_r,_o,_e,_d})){
if (notAnotherVowel(seventh,_y)){
SubstitutionCracker2.key[_y] = seventh.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_destroyed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_destroyed.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_destroyed.close();
Scanner y_system = new Scanner(SubstitutionCracker2.cipher);
while(y_system.hasNext()){
String next = y_system.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth},
new int[]{_s,_s,_t,_e,_m})){
if (notAnotherVowel(second,_y)){
SubstitutionCracker2.key[_y] = second.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_system");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_system.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_system.close();
Scanner y_security = new Scanner(SubstitutionCracker2.cipher);
while(y_security.hasNext()){
String next = y_security.next();
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
new int[]{_s,_e,_c,_u,_r,_i,_t})){
if (notAnotherVowel(eighth,_y)){
SubstitutionCracker2.key[_y] = eighth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_security");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_security.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_security.close();
Scanner y_cry = new Scanner(SubstitutionCracker2.cipher);
while(y_cry.hasNext()){
String next = y_cry.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_c,_r})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_cry");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_cry.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_cry.close();
Scanner y_lying = new Scanner(SubstitutionCracker2.cipher);
while(y_lying.hasNext()){
String next = y_lying.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_l,_i,_n,_g})){
if (notAnotherVowel(second,_y)){
SubstitutionCracker2.key[_y] = second.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_lying");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_lying.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_lying.close();
Scanner y_anyone = new Scanner(SubstitutionCracker2.cipher);
while(y_anyone.hasNext()){
String next = y_anyone.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_a,_n,_o,_n,_e})){
if (notAnotherVowel(third,_y)){
SubstitutionCracker2.key[_y] = third.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_anyone");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_anyone.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_anyone.close();
Scanner y_fifty = new Scanner(SubstitutionCracker2.cipher);
while(y_fifty.hasNext()){
String next = y_fifty.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_f,_i,_f,_t})){
if (notAnotherVowel(fifth,_y)){
SubstitutionCracker2.key[_y] = fifth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_fifty");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_fifty.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasY){
y_fifty.close();
Scanner y_merely = new Scanner(SubstitutionCracker2.cipher);
while(y_merely.hasNext()){
String next = y_merely.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_m,_e,_r,_e,_l})){
if (notAnotherVowel(sixth,_y)){
SubstitutionCracker2.key[_y] = sixth.toLowerCase();
SubstitutionCracker2.hasY=true;
System.err.println("SubstitutionCracker2.hasY=true; via Scanner y_merely");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

y_merely.close();
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
