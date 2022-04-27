package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan7D{
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

public Scan7D(){
System.err.println("new Scan7D");
    System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));


Scanner d_and = new Scanner(SubstitutionCracker2.cipher);
while(d_and.hasNext()){
String next = d_and.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_a,_n})){
SubstitutionCracker2.key[_d] = third.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_and");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_and.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_and.close();
Scanner d_had = new Scanner(SubstitutionCracker2.cipher);
while(d_had.hasNext()){
String next = d_had.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_h,_a})){
SubstitutionCracker2.key[_d] = third.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_had");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_had.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_had.close();
Scanner d_said = new Scanner(SubstitutionCracker2.cipher);
while(d_said.hasNext()){
String next = d_said.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_s,_a,_i})){
SubstitutionCracker2.key[_d] = fourth.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_said");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_said.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_said.close();
Scanner d_do = new Scanner(SubstitutionCracker2.cipher);
while(d_do.hasNext()){
String next = d_do.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{second},
new int[]{_o})){
SubstitutionCracker2.key[_d] = first.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_do");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_do.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_do.close();
Scanner d_did = new Scanner(SubstitutionCracker2.cipher);
while(d_did.hasNext()){
String next = d_did.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(first.equalsIgnoreCase(third)){
if(massCalc_notAnyOther(new String[]{second},
new int[]{_i})){
SubstitutionCracker2.key[_d] = first.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_did");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_did.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_did.close();
Scanner d_hand = new Scanner(SubstitutionCracker2.cipher);
while(d_hand.hasNext()){
String next = d_hand.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_h,_a,_n})){
SubstitutionCracker2.key[_d] = fourth.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_hand");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_hand.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_hand.close();
Scanner d_heard = new Scanner(SubstitutionCracker2.cipher);
while(d_heard.hasNext()){
String next = d_heard.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_h,_e,_a,_r})){
SubstitutionCracker2.key[_d] = fifth.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_heard");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_heard.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_heard.close();
Scanner d_head = new Scanner(SubstitutionCracker2.cipher);
while(d_head.hasNext()){
String next = d_head.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_h,_e,_a})){
SubstitutionCracker2.key[_d] = fourth.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_head");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_head.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_head.close();
Scanner d_stood = new Scanner(SubstitutionCracker2.cipher);
while(d_stood.hasNext()){
String next = d_stood.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_s,_t,_o,_o})){
SubstitutionCracker2.key[_d] = fifth.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_stood");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_stood.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_stood.close();
Scanner d_done = new Scanner(SubstitutionCracker2.cipher);
while(d_done.hasNext()){
String next = d_done.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_n,_e})){
SubstitutionCracker2.key[_d] = first.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_done");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_done.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_done.close();
Scanner d_hands = new Scanner(SubstitutionCracker2.cipher);
while(d_hands.hasNext()){
String next = d_hands.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_h,_a,_n,_s})){
SubstitutionCracker2.key[_d] = fourth.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_hands");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_hands.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_hands.close();
Scanner d_side = new Scanner(SubstitutionCracker2.cipher);
while(d_side.hasNext()){
String next = d_side.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_s,_i,_e})){
SubstitutionCracker2.key[_d] = third.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_side");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_side.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_side.close();
Scanner d_end = new Scanner(SubstitutionCracker2.cipher);
while(d_end.hasNext()){
String next = d_end.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_e,_n})){
SubstitutionCracker2.key[_d] = third.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_end");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_end.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_end.close();
Scanner d_door = new Scanner(SubstitutionCracker2.cipher);
while(d_door.hasNext()){
String next = d_door.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_o,_r})){
SubstitutionCracker2.key[_d] = first.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_door");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_door.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_door.close();
Scanner d_dear = new Scanner(SubstitutionCracker2.cipher);
while(d_dear.hasNext()){
String next = d_dear.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_a,_r})){
SubstitutionCracker2.key[_d] = first.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_dear");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_dear.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_dear.close();
Scanner d_need = new Scanner(SubstitutionCracker2.cipher);
while(d_need.hasNext()){
String next = d_need.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_n,_e,_e})){
SubstitutionCracker2.key[_d] = fourth.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_need");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_need.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_need.close();
Scanner d_tried = new Scanner(SubstitutionCracker2.cipher);
while(d_tried.hasNext()){
String next = d_tried.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_t,_r,_i,_e})){
SubstitutionCracker2.key[_d] = fifth.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_tried");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_tried.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_tried.close();
Scanner d_read = new Scanner(SubstitutionCracker2.cipher);
while(d_read.hasNext()){
String next = d_read.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_r,_e,_a})){
SubstitutionCracker2.key[_d] = fourth.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_read");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_read.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_read.close();
Scanner d_third = new Scanner(SubstitutionCracker2.cipher);
while(d_third.hasNext()){
String next = d_third.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_t,_h,_i,_r})){
SubstitutionCracker2.key[_d] = fifth.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_third");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_third.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_third.close();
Scanner d_stand = new Scanner(SubstitutionCracker2.cipher);
while(d_stand.hasNext()){
String next = d_stand.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_s,_t,_a,_n})){
SubstitutionCracker2.key[_d] = fifth.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_stand");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_stand.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_stand.close();
Scanner d_order = new Scanner(SubstitutionCracker2.cipher);
while(d_order.hasNext()){
String next = d_order.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_o,_r,_e,_r})){
SubstitutionCracker2.key[_d] = third.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_order");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_order.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_order.close();
Scanner d_send = new Scanner(SubstitutionCracker2.cipher);
while(d_send.hasNext()){
String next = d_send.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_s,_e,_n})){
SubstitutionCracker2.key[_d] = fourth.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_send");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_send.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_send.close();
Scanner d_does = new Scanner(SubstitutionCracker2.cipher);
while(d_does.hasNext()){
String next = d_does.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_e,_s})){
SubstitutionCracker2.key[_d] = first.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_does");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_does.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_does.close();
Scanner d_entered = new Scanner(SubstitutionCracker2.cipher);
while(d_entered.hasNext()){
String next = d_entered.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_e,_n,_t,_e,_r,_e})){
SubstitutionCracker2.key[_d] = seventh.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_entered");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_entered.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_entered.close();
Scanner d_death = new Scanner(SubstitutionCracker2.cipher);
while(d_death.hasNext()){
String next = d_death.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_e,_a,_t,_h})){
SubstitutionCracker2.key[_d] = first.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_death");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_death.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_death.close();
Scanner d_hard = new Scanner(SubstitutionCracker2.cipher);
while(d_hard.hasNext()){
String next = d_hard.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_h,_a,_r})){
SubstitutionCracker2.key[_d] = fourth.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_hard");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_hard.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_hard.close();
Scanner d_red = new Scanner(SubstitutionCracker2.cipher);
while(d_red.hasNext()){
String next = d_red.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_r,_e})){
SubstitutionCracker2.key[_d] = third.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_red");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_red.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_red.close();
Scanner d_raised = new Scanner(SubstitutionCracker2.cipher);
while(d_raised.hasNext()){
String next = d_raised.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth},
new int[]{_r,_a,_i,_s,_e})){
SubstitutionCracker2.key[_d] = sixth.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_raised");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_raised.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_raised.close();
Scanner d_started = new Scanner(SubstitutionCracker2.cipher);
while(d_started.hasNext()){
String next = d_started.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_s,_t,_a,_r,_t,_e})){
SubstitutionCracker2.key[_d] = seventh.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_started");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_started.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_started.close();
Scanner d_doth = new Scanner(SubstitutionCracker2.cipher);
while(d_doth.hasNext()){
String next = d_doth.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_t,_h})){
SubstitutionCracker2.key[_d] = first.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_doth");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_doth.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_doth.close();
Scanner d_dead = new Scanner(SubstitutionCracker2.cipher);
while(d_dead.hasNext()){
String next = d_dead.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(first.equalsIgnoreCase(fourth)){
if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_e,_a})){
SubstitutionCracker2.key[_d] = first.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_dead");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_dead.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_dead.close();
Scanner d_instead = new Scanner(SubstitutionCracker2.cipher);
while(d_instead.hasNext()){
String next = d_instead.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_i,_n,_s,_t,_e,_a})){
SubstitutionCracker2.key[_d] = seventh.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_instead");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_instead.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_instead.close();
Scanner d_rode = new Scanner(SubstitutionCracker2.cipher);
while(d_rode.hasNext()){
String next = d_rode.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_r,_o,_e})){
SubstitutionCracker2.key[_d] = third.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_rode");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_rode.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasD){
d_rode.close();
Scanner d_seed = new Scanner(SubstitutionCracker2.cipher);
while(d_seed.hasNext()){
String next = d_seed.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_s,_e,_e})){
SubstitutionCracker2.key[_d] = fourth.toLowerCase();
SubstitutionCracker2.hasD=true;
System.err.println("SubstitutionCracker2.hasD=true; via Scanner d_seed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

d_seed.close();
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
