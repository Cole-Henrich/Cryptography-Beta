package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan23Q{
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

public Scan23Q(){
System.err.println("new Scan23Q");


Scanner q_quite = new Scanner(SubstitutionCracker2.cipher);
while(q_quite.hasNext()){
String next = q_quite.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_u,_i,_t,_e})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quite");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quite.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quite.close();
Scanner q_question = new Scanner(SubstitutionCracker2.cipher);
while(q_question.hasNext()){
String next = q_question.next();
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
new int[]{_u,_e,_s,_t,_i,_o,_n})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_question");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_question.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_question.close();
Scanner q_quickly = new Scanner(SubstitutionCracker2.cipher);
while(q_quickly.hasNext()){
String next = q_quickly.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_u,_i,_c,_k,_l,_y})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quickly");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quickly.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quickly.close();
Scanner q_questions = new Scanner(SubstitutionCracker2.cipher);
while(q_questions.hasNext()){
String next = q_questions.next();
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
new int[]{_u,_e,_s,_t,_i,_o,_n,_s})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_questions");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_questions.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_questions.close();
Scanner q_quiet = new Scanner(SubstitutionCracker2.cipher);
while(q_quiet.hasNext()){
String next = q_quiet.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_u,_i,_e,_t})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quiet");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quiet.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quiet.close();
Scanner q_require = new Scanner(SubstitutionCracker2.cipher);
while(q_require.hasNext()){
String next = q_require.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_r,_e,_u,_i,_r,_e})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_require");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_require.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_require.close();
Scanner q_iniquity = new Scanner(SubstitutionCracker2.cipher);
while(q_iniquity.hasNext()){
String next = q_iniquity.next();
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
new int[]{_i,_n,_i,_u,_i,_t,_y})){
SubstitutionCracker2.key[_q] = fourth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_iniquity");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_iniquity.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_iniquity.close();
Scanner q_required = new Scanner(SubstitutionCracker2.cipher);
while(q_required.hasNext()){
String next = q_required.next();
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
new int[]{_r,_e,_u,_i,_r,_e,_d})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_required");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_required.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_required.close();
Scanner q_equal = new Scanner(SubstitutionCracker2.cipher);
while(q_equal.hasNext()){
String next = q_equal.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_e,_u,_a,_l})){
SubstitutionCracker2.key[_q] = second.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_equal");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_equal.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_equal.close();
Scanner q_iraq = new Scanner(SubstitutionCracker2.cipher);
while(q_iraq.hasNext()){
String next = q_iraq.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_i,_r,_a})){
SubstitutionCracker2.key[_q] = fourth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_iraq");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_iraq.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_iraq.close();
Scanner q_quality = new Scanner(SubstitutionCracker2.cipher);
while(q_quality.hasNext()){
String next = q_quality.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_u,_a,_l,_i,_t,_y})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quality");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quality.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quality.close();
Scanner q_quick = new Scanner(SubstitutionCracker2.cipher);
while(q_quick.hasNext()){
String next = q_quick.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_u,_i,_c,_k})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quick");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quick.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quick.close();
Scanner q_quietly = new Scanner(SubstitutionCracker2.cipher);
while(q_quietly.hasNext()){
String next = q_quietly.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_u,_i,_e,_t,_l,_y})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quietly");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quietly.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quietly.close();
Scanner q_requires = new Scanner(SubstitutionCracker2.cipher);
while(q_requires.hasNext()){
String next = q_requires.next();
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
new int[]{_r,_e,_u,_i,_r,_e,_s})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_requires");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_requires.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_requires.close();
Scanner q_square = new Scanner(SubstitutionCracker2.cipher);
while(q_square.hasNext()){
String next = q_square.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth},
new int[]{_s,_u,_a,_r,_e})){
SubstitutionCracker2.key[_q] = second.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_square");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_square.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_square.close();
Scanner q_request = new Scanner(SubstitutionCracker2.cipher);
while(q_request.hasNext()){
String next = q_request.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_r,_e,_u,_e,_s,_t})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_request");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_request.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_request.close();
Scanner q_unique = new Scanner(SubstitutionCracker2.cipher);
while(q_unique.hasNext()){
String next = q_unique.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_u,_n,_i,_u,_e})){
SubstitutionCracker2.key[_q] = fourth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_unique");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_unique.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_unique.close();
Scanner q_equally = new Scanner(SubstitutionCracker2.cipher);
while(q_equally.hasNext()){
String next = q_equally.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_e,_u,_a,_l,_l,_y})){
SubstitutionCracker2.key[_q] = second.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_equally");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_equally.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_equally.close();
Scanner q_queen = new Scanner(SubstitutionCracker2.cipher);
while(q_queen.hasNext()){
String next = q_queen.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_u,_e,_e,_n})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_queen");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_queen.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_queen.close();
Scanner q_quarter = new Scanner(SubstitutionCracker2.cipher);
while(q_quarter.hasNext()){
String next = q_quarter.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_u,_a,_r,_t,_e,_r})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quarter");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quarter.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quarter.close();
Scanner q_inquired = new Scanner(SubstitutionCracker2.cipher);
while(q_inquired.hasNext()){
String next = q_inquired.next();
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
new int[]{_i,_n,_u,_i,_r,_e,_d})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_inquired");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_inquired.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_inquired.close();
Scanner q_equestris = new Scanner(SubstitutionCracker2.cipher);
while(q_equestris.hasNext()){
String next = q_equestris.next();
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
new int[]{_e,_u,_e,_s,_t,_r,_i,_s})){
SubstitutionCracker2.key[_q] = second.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_equestris");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_equestris.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_equestris.close();
Scanner q_iniquities = new Scanner(SubstitutionCracker2.cipher);
while(q_iniquities.hasNext()){
String next = q_iniquities.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh,eighth,ninth,tenth},
new int[]{_i,_n,_i,_u,_i,_t,_i,_e,_s})){
SubstitutionCracker2.key[_q] = fourth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_iniquities");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_iniquities.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_iniquities.close();
Scanner q_frequently = new Scanner(SubstitutionCracker2.cipher);
while(q_frequently.hasNext()){
String next = q_frequently.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh,eighth,ninth,tenth},
new int[]{_f,_r,_e,_u,_e,_n,_t,_l,_y})){
SubstitutionCracker2.key[_q] = fourth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_frequently");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_frequently.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_frequently.close();
Scanner q_squadron = new Scanner(SubstitutionCracker2.cipher);
while(q_squadron.hasNext()){
String next = q_squadron.next();
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
new int[]{_s,_u,_a,_d,_r,_o,_n})){
SubstitutionCracker2.key[_q] = second.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_squadron");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_squadron.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_squadron.close();
Scanner q_iraqi = new Scanner(SubstitutionCracker2.cipher);
while(q_iraqi.hasNext()){
String next = q_iraqi.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_i,_r,_a,_i})){
SubstitutionCracker2.key[_q] = fourth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_iraqi");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_iraqi.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_iraqi.close();
Scanner q_quarters = new Scanner(SubstitutionCracker2.cipher);
while(q_quarters.hasNext()){
String next = q_quarters.next();
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
new int[]{_u,_a,_r,_t,_e,_r,_s})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quarters");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quarters.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quarters.close();
Scanner q_consequences = new Scanner(SubstitutionCracker2.cipher);
while(q_consequences.hasNext()){
String next = q_consequences.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh,eighth,ninth,tenth,eleventh,twelfth},
new int[]{_c,_o,_n,_s,_e,_u,_e,_n,_c,_e,_s})){
SubstitutionCracker2.key[_q] = sixth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_consequences");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_consequences.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_consequences.close();
Scanner q_inquire = new Scanner(SubstitutionCracker2.cipher);
while(q_inquire.hasNext()){
String next = q_inquire.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_i,_n,_u,_i,_r,_e})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_inquire");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_inquire.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_inquire.close();
Scanner q_consequence = new Scanner(SubstitutionCracker2.cipher);
while(q_consequence.hasNext()){
String next = q_consequence.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh,eighth,ninth,tenth,eleventh},
new int[]{_c,_o,_n,_s,_e,_u,_e,_n,_c,_e})){
SubstitutionCracker2.key[_q] = sixth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_consequence");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_consequence.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_consequence.close();
Scanner q_headquarters = new Scanner(SubstitutionCracker2.cipher);
while(q_headquarters.hasNext()){
String next = q_headquarters.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth,seventh,eighth,ninth,tenth,eleventh,twelfth},
new int[]{_h,_e,_a,_d,_u,_a,_r,_t,_e,_r,_s})){
SubstitutionCracker2.key[_q] = fifth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_headquarters");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_headquarters.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_headquarters.close();
Scanner q_questioned = new Scanner(SubstitutionCracker2.cipher);
while(q_questioned.hasNext()){
String next = q_questioned.next();
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
new int[]{_u,_e,_s,_t,_i,_o,_n,_e,_d})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_questioned");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_questioned.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_questioned.close();
Scanner q_equipment = new Scanner(SubstitutionCracker2.cipher);
while(q_equipment.hasNext()){
String next = q_equipment.next();
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
new int[]{_e,_u,_i,_p,_m,_e,_n,_t})){
SubstitutionCracker2.key[_q] = second.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_equipment");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_equipment.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_equipment.close();
Scanner q_subsequent = new Scanner(SubstitutionCracker2.cipher);
while(q_subsequent.hasNext()){
String next = q_subsequent.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh,eighth,ninth,tenth},
new int[]{_s,_u,_b,_s,_e,_u,_e,_n,_t})){
SubstitutionCracker2.key[_q] = sixth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_subsequent");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_subsequent.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_subsequent.close();
Scanner q_qaeda = new Scanner(SubstitutionCracker2.cipher);
while(q_qaeda.hasNext()){
String next = q_qaeda.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_a,_e,_d,_a})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_qaeda");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_qaeda.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_qaeda.close();
Scanner q_acquaintance = new Scanner(SubstitutionCracker2.cipher);
while(q_acquaintance.hasNext()){
String next = q_acquaintance.next();
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

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh,twelfth},
new int[]{_a,_c,_u,_a,_i,_n,_t,_a,_n,_c,_e})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_acquaintance");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_acquaintance.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_acquaintance.close();
Scanner q_acquainted = new Scanner(SubstitutionCracker2.cipher);
while(q_acquainted.hasNext()){
String next = q_acquainted.next();
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
new int[]{_a,_c,_u,_a,_i,_n,_t,_e,_d})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_acquainted");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_acquainted.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_acquainted.close();
Scanner q_quantity = new Scanner(SubstitutionCracker2.cipher);
while(q_quantity.hasNext()){
String next = q_quantity.next();
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
new int[]{_u,_a,_n,_t,_i,_t,_y})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quantity");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quantity.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quantity.close();
Scanner q_requirements = new Scanner(SubstitutionCracker2.cipher);
while(q_requirements.hasNext()){
String next = q_requirements.next();
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

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh,twelfth},
new int[]{_r,_e,_u,_i,_r,_e,_m,_e,_n,_t,_s})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_requirements");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_requirements.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_requirements.close();
Scanner q_inquiringly = new Scanner(SubstitutionCracker2.cipher);
while(q_inquiringly.hasNext()){
String next = q_inquiringly.next();
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

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh},
new int[]{_i,_n,_u,_i,_r,_i,_n,_g,_l,_y})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_inquiringly");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_inquiringly.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_inquiringly.close();
Scanner q_acquaintances = new Scanner(SubstitutionCracker2.cipher);
while(q_acquaintances.hasNext()){
String next = q_acquaintances.next();
if (next.length()==13){
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
String thirteenth = String.valueOf(next.charAt(12));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh,twelfth,thirteenth},
new int[]{_a,_c,_u,_a,_i,_n,_t,_a,_n,_c,_e,_s})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_acquaintances");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_acquaintances.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_acquaintances.close();
Scanner q_frequent = new Scanner(SubstitutionCracker2.cipher);
while(q_frequent.hasNext()){
String next = q_frequent.next();
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
new int[]{_f,_r,_e,_u,_e,_n,_t})){
SubstitutionCracker2.key[_q] = fourth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_frequent");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_frequent.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_frequent.close();
Scanner q_questioning = new Scanner(SubstitutionCracker2.cipher);
while(q_questioning.hasNext()){
String next = q_questioning.next();
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

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh},
new int[]{_u,_e,_s,_t,_i,_o,_n,_i,_n,_g})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_questioning");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_questioning.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_questioning.close();
Scanner q_inquiry = new Scanner(SubstitutionCracker2.cipher);
while(q_inquiry.hasNext()){
String next = q_inquiry.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_i,_n,_u,_i,_r,_y})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_inquiry");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_inquiry.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_inquiry.close();
Scanner q_squeezed = new Scanner(SubstitutionCracker2.cipher);
while(q_squeezed.hasNext()){
String next = q_squeezed.next();
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
new int[]{_s,_u,_e,_e,_z,_e,_d})){
SubstitutionCracker2.key[_q] = second.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_squeezed");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_squeezed.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_squeezed.close();
Scanner q_qualities = new Scanner(SubstitutionCracker2.cipher);
while(q_qualities.hasNext()){
String next = q_qualities.next();
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
new int[]{_u,_a,_l,_i,_t,_i,_e,_s})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_qualities");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_qualities.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_qualities.close();
Scanner q_equality = new Scanner(SubstitutionCracker2.cipher);
while(q_equality.hasNext()){
String next = q_equality.next();
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
new int[]{_e,_u,_a,_l,_i,_t,_y})){
SubstitutionCracker2.key[_q] = second.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_equality");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_equality.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_equality.close();
Scanner q_acquired = new Scanner(SubstitutionCracker2.cipher);
while(q_acquired.hasNext()){
String next = q_acquired.next();
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
new int[]{_a,_c,_u,_i,_r,_e,_d})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_acquired");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_acquired.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_acquired.close();
Scanner q_liquid = new Scanner(SubstitutionCracker2.cipher);
while(q_liquid.hasNext()){
String next = q_liquid.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth},
new int[]{_l,_i,_u,_i,_d})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_liquid");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_liquid.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_liquid.close();
Scanner q_quote = new Scanner(SubstitutionCracker2.cipher);
while(q_quote.hasNext()){
String next = q_quote.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_u,_o,_t,_e})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quote");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quote.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quote.close();
Scanner q_requested = new Scanner(SubstitutionCracker2.cipher);
while(q_requested.hasNext()){
String next = q_requested.next();
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
new int[]{_r,_e,_u,_e,_s,_t,_e,_d})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_requested");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_requested.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_requested.close();
Scanner q_rafiq = new Scanner(SubstitutionCracker2.cipher);
while(q_rafiq.hasNext()){
String next = q_rafiq.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_r,_a,_f,_i})){
SubstitutionCracker2.key[_q] = fifth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_rafiq");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_rafiq.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_rafiq.close();
Scanner q_requirement = new Scanner(SubstitutionCracker2.cipher);
while(q_requirement.hasNext()){
String next = q_requirement.next();
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

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh},
new int[]{_r,_e,_u,_i,_r,_e,_m,_e,_n,_t})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_requirement");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_requirement.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_requirement.close();
Scanner q_quo = new Scanner(SubstitutionCracker2.cipher);
while(q_quo.hasNext()){
String next = q_quo.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_u,_o})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quo");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quo.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quo.close();
Scanner q_sequence = new Scanner(SubstitutionCracker2.cipher);
while(q_sequence.hasNext()){
String next = q_sequence.next();
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
new int[]{_s,_e,_u,_e,_n,_c,_e})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_sequence");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_sequence.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_sequence.close();
Scanner q_tranquil = new Scanner(SubstitutionCracker2.cipher);
while(q_tranquil.hasNext()){
String next = q_tranquil.next();
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
new int[]{_t,_r,_a,_n,_u,_i,_l})){
SubstitutionCracker2.key[_q] = fifth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_tranquil");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_tranquil.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_tranquil.close();
Scanner q_consequently = new Scanner(SubstitutionCracker2.cipher);
while(q_consequently.hasNext()){
String next = q_consequently.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh,eighth,ninth,tenth,eleventh,twelfth},
new int[]{_c,_o,_n,_s,_e,_u,_e,_n,_t,_l,_y})){
SubstitutionCracker2.key[_q] = sixth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_consequently");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_consequently.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_consequently.close();
Scanner q_subsequently = new Scanner(SubstitutionCracker2.cipher);
while(q_subsequently.hasNext()){
String next = q_subsequently.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh,eighth,ninth,tenth,eleventh,twelfth},
new int[]{_s,_u,_b,_s,_e,_u,_e,_n,_t,_l,_y})){
SubstitutionCracker2.key[_q] = sixth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_subsequently");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_subsequently.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_subsequently.close();
Scanner q_inquiring = new Scanner(SubstitutionCracker2.cipher);
while(q_inquiring.hasNext()){
String next = q_inquiring.next();
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
new int[]{_i,_n,_u,_i,_r,_i,_n,_g})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_inquiring");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_inquiring.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_inquiring.close();
Scanner q_techniques = new Scanner(SubstitutionCracker2.cipher);
while(q_techniques.hasNext()){
String next = q_techniques.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth,eighth,ninth,tenth},
new int[]{_t,_e,_c,_h,_n,_i,_u,_e,_s})){
SubstitutionCracker2.key[_q] = seventh.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_techniques");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_techniques.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_techniques.close();
Scanner q_banquet = new Scanner(SubstitutionCracker2.cipher);
while(q_banquet.hasNext()){
String next = q_banquet.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_b,_a,_n,_u,_e,_t})){
SubstitutionCracker2.key[_q] = fourth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_banquet");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_banquet.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_banquet.close();
Scanner q_quarrel = new Scanner(SubstitutionCracker2.cipher);
while(q_quarrel.hasNext()){
String next = q_quarrel.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_u,_a,_r,_r,_e,_l})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quarrel");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quarrel.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quarrel.close();
Scanner q_que = new Scanner(SubstitutionCracker2.cipher);
while(q_que.hasNext()){
String next = q_que.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_u,_e})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_que");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_que.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_que.close();
Scanner q_quivering = new Scanner(SubstitutionCracker2.cipher);
while(q_quivering.hasNext()){
String next = q_quivering.next();
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
new int[]{_u,_i,_v,_e,_r,_i,_n,_g})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quivering");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quivering.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quivering.close();
Scanner q_squatting = new Scanner(SubstitutionCracker2.cipher);
while(q_squatting.hasNext()){
String next = q_squatting.next();
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
new int[]{_s,_u,_a,_t,_t,_i,_n,_g})){
SubstitutionCracker2.key[_q] = second.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_squatting");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_squatting.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_squatting.close();
Scanner q_quest = new Scanner(SubstitutionCracker2.cipher);
while(q_quest.hasNext()){
String next = q_quest.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_u,_e,_s,_t})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quest");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quest.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quest.close();
Scanner q_requiring = new Scanner(SubstitutionCracker2.cipher);
while(q_requiring.hasNext()){
String next = q_requiring.next();
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
new int[]{_r,_e,_u,_i,_r,_i,_n,_g})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_requiring");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_requiring.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_requiring.close();
Scanner q_quit = new Scanner(SubstitutionCracker2.cipher);
while(q_quit.hasNext()){
String next = q_quit.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_u,_i,_t})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quit");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quit.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quit.close();
Scanner q_inquiries = new Scanner(SubstitutionCracker2.cipher);
while(q_inquiries.hasNext()){
String next = q_inquiries.next();
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
new int[]{_i,_n,_u,_i,_r,_i,_e,_s})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_inquiries");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_inquiries.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_inquiries.close();
Scanner q_iraqis = new Scanner(SubstitutionCracker2.cipher);
while(q_iraqis.hasNext()){
String next = q_iraqis.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_i,_r,_a,_i,_s})){
SubstitutionCracker2.key[_q] = fourth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_iraqis");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_iraqis.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_iraqis.close();
Scanner q_conquered = new Scanner(SubstitutionCracker2.cipher);
while(q_conquered.hasNext()){
String next = q_conquered.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh,eighth,ninth},
new int[]{_c,_o,_n,_u,_e,_r,_e,_d})){
SubstitutionCracker2.key[_q] = fourth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_conquered");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_conquered.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_conquered.close();
Scanner q_quivered = new Scanner(SubstitutionCracker2.cipher);
while(q_quivered.hasNext()){
String next = q_quivered.next();
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
new int[]{_u,_i,_v,_e,_r,_e,_d})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quivered");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quivered.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quivered.close();
Scanner q_eloquent = new Scanner(SubstitutionCracker2.cipher);
while(q_eloquent.hasNext()){
String next = q_eloquent.next();
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
new int[]{_e,_l,_o,_u,_e,_n,_t})){
SubstitutionCracker2.key[_q] = fourth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_eloquent");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_eloquent.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_eloquent.close();
Scanner q_tranquillity = new Scanner(SubstitutionCracker2.cipher);
while(q_tranquillity.hasNext()){
String next = q_tranquillity.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth,seventh,eighth,ninth,tenth,eleventh,twelfth},
new int[]{_t,_r,_a,_n,_u,_i,_l,_l,_i,_t,_y})){
SubstitutionCracker2.key[_q] = fifth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_tranquillity");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_tranquillity.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_tranquillity.close();
Scanner q_quicken = new Scanner(SubstitutionCracker2.cipher);
while(q_quicken.hasNext()){
String next = q_quicken.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_u,_i,_c,_k,_e,_n})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quicken");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quicken.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quicken.close();
Scanner q_equipped = new Scanner(SubstitutionCracker2.cipher);
while(q_equipped.hasNext()){
String next = q_equipped.next();
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
new int[]{_e,_u,_i,_p,_p,_e,_d})){
SubstitutionCracker2.key[_q] = second.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_equipped");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_equipped.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_equipped.close();
Scanner q_technique = new Scanner(SubstitutionCracker2.cipher);
while(q_technique.hasNext()){
String next = q_technique.next();
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
new int[]{_t,_e,_c,_h,_n,_i,_u,_e})){
SubstitutionCracker2.key[_q] = seventh.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_technique");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_technique.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_technique.close();
Scanner q_queer = new Scanner(SubstitutionCracker2.cipher);
while(q_queer.hasNext()){
String next = q_queer.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_u,_e,_e,_r})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_queer");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_queer.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_queer.close();
Scanner q_qualified = new Scanner(SubstitutionCracker2.cipher);
while(q_qualified.hasNext()){
String next = q_qualified.next();
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
new int[]{_u,_a,_l,_i,_f,_i,_e,_d})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_qualified");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_qualified.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_qualified.close();
Scanner q_squatted = new Scanner(SubstitutionCracker2.cipher);
while(q_squatted.hasNext()){
String next = q_squatted.next();
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
new int[]{_s,_u,_a,_t,_t,_e,_d})){
SubstitutionCracker2.key[_q] = second.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_squatted");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_squatted.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_squatted.close();
Scanner q_squeeze = new Scanner(SubstitutionCracker2.cipher);
while(q_squeeze.hasNext()){
String next = q_squeeze.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth,sixth,seventh},
new int[]{_s,_u,_e,_e,_z,_e})){
SubstitutionCracker2.key[_q] = second.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_squeeze");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_squeeze.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_squeeze.close();
Scanner q_queens = new Scanner(SubstitutionCracker2.cipher);
while(q_queens.hasNext()){
String next = q_queens.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_u,_e,_e,_n,_s})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_queens");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_queens.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_queens.close();
Scanner q_conquer = new Scanner(SubstitutionCracker2.cipher);
while(q_conquer.hasNext()){
String next = q_conquer.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth,seventh},
new int[]{_c,_o,_n,_u,_e,_r})){
SubstitutionCracker2.key[_q] = fourth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_conquer");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_conquer.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_conquer.close();
Scanner q_quoted = new Scanner(SubstitutionCracker2.cipher);
while(q_quoted.hasNext()){
String next = q_quoted.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_u,_o,_t,_e,_d})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quoted");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quoted.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quoted.close();
Scanner q_tabaqui = new Scanner(SubstitutionCracker2.cipher);
while(q_tabaqui.hasNext()){
String next = q_tabaqui.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth,seventh},
new int[]{_t,_a,_b,_a,_u,_i})){
SubstitutionCracker2.key[_q] = fifth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_tabaqui");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_tabaqui.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_tabaqui.close();
Scanner q_inadequate = new Scanner(SubstitutionCracker2.cipher);
while(q_inadequate.hasNext()){
String next = q_inadequate.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh,eighth,ninth,tenth},
new int[]{_i,_n,_a,_d,_e,_u,_a,_t,_e})){
SubstitutionCracker2.key[_q] = sixth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_inadequate");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_inadequate.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_inadequate.close();
Scanner q_sequences = new Scanner(SubstitutionCracker2.cipher);
while(q_sequences.hasNext()){
String next = q_sequences.next();
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
new int[]{_s,_e,_u,_e,_n,_c,_e,_s})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_sequences");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_sequences.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_sequences.close();
Scanner q_quartermaster = new Scanner(SubstitutionCracker2.cipher);
while(q_quartermaster.hasNext()){
String next = q_quartermaster.next();
if (next.length()==13){
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
String thirteenth = String.valueOf(next.charAt(12));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh,twelfth,thirteenth},
new int[]{_u,_a,_r,_t,_e,_r,_m,_a,_s,_t,_e,_r})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quartermaster");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quartermaster.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quartermaster.close();
Scanner q_conquest = new Scanner(SubstitutionCracker2.cipher);
while(q_conquest.hasNext()){
String next = q_conquest.next();
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
new int[]{_c,_o,_n,_u,_e,_s,_t})){
SubstitutionCracker2.key[_q] = fourth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_conquest");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_conquest.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_conquest.close();
Scanner q_squarely = new Scanner(SubstitutionCracker2.cipher);
while(q_squarely.hasNext()){
String next = q_squarely.next();
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
new int[]{_s,_u,_a,_r,_e,_l,_y})){
SubstitutionCracker2.key[_q] = second.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_squarely");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_squarely.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_squarely.close();
Scanner q_acquire = new Scanner(SubstitutionCracker2.cipher);
while(q_acquire.hasNext()){
String next = q_acquire.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth,sixth,seventh},
new int[]{_a,_c,_u,_i,_r,_e})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_acquire");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_acquire.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_acquire.close();
Scanner q_adequate = new Scanner(SubstitutionCracker2.cipher);
while(q_adequate.hasNext()){
String next = q_adequate.next();
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
new int[]{_a,_d,_e,_u,_a,_t,_e})){
SubstitutionCracker2.key[_q] = fourth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_adequate");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_adequate.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_adequate.close();
Scanner q_uniquely = new Scanner(SubstitutionCracker2.cipher);
while(q_uniquely.hasNext()){
String next = q_uniquely.next();
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
new int[]{_u,_n,_i,_u,_e,_l,_y})){
SubstitutionCracker2.key[_q] = fourth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_uniquely");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_uniquely.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_uniquely.close();
Scanner q_requesting = new Scanner(SubstitutionCracker2.cipher);
while(q_requesting.hasNext()){
String next = q_requesting.next();
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
new int[]{_r,_e,_u,_e,_s,_t,_i,_n,_g})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_requesting");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_requesting.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_requesting.close();
Scanner q_requests = new Scanner(SubstitutionCracker2.cipher);
while(q_requests.hasNext()){
String next = q_requests.next();
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
new int[]{_r,_e,_u,_e,_s,_t,_s})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_requests");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_requests.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_requests.close();
Scanner q_exquisite = new Scanner(SubstitutionCracker2.cipher);
while(q_exquisite.hasNext()){
String next = q_exquisite.next();
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
new int[]{_e,_x,_u,_i,_s,_i,_t,_e})){
SubstitutionCracker2.key[_q] = third.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_exquisite");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_exquisite.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_exquisite.close();
Scanner q_quicker = new Scanner(SubstitutionCracker2.cipher);
while(q_quicker.hasNext()){
String next = q_quicker.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,seventh},
new int[]{_u,_i,_c,_k,_e,_r})){
SubstitutionCracker2.key[_q] = first.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_quicker");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_quicker.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasQ){
q_quicker.close();
Scanner q_consequent = new Scanner(SubstitutionCracker2.cipher);
while(q_consequent.hasNext()){
String next = q_consequent.next();
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

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,seventh,eighth,ninth,tenth},
new int[]{_c,_o,_n,_s,_e,_u,_e,_n,_t})){
SubstitutionCracker2.key[_q] = sixth.toLowerCase();
SubstitutionCracker2.hasQ=true;
System.err.println("SubstitutionCracker2.hasQ=true; via Scanner q_consequent");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

q_consequent.close();
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
            }
           }
          }
         }
        }
       }
      }
     }
    }
   }
  }
 }
