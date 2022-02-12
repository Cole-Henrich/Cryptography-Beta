package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan3N{
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

public Scan3N(){
System.err.println("new Scan3N");
    System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));


Scanner n_not = new Scanner(SubstitutionCracker2.cipher);
while(n_not.hasNext()){
String next = n_not.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_o,_t})){
SubstitutionCracker2.key[_n] = first.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_not");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_not.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_not.close();
Scanner n_on = new Scanner(SubstitutionCracker2.cipher);
while(n_on.hasNext()){
String next = n_on.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{first},
new int[]{_o})){
SubstitutionCracker2.key[_n] = second.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_on");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_on.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_on.close();
Scanner n_one = new Scanner(SubstitutionCracker2.cipher);
while(n_one.hasNext()){
String next = n_one.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,third},
new int[]{_o,_e})){
SubstitutionCracker2.key[_n] = second.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_one");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_one.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_one.close();
Scanner n_an = new Scanner(SubstitutionCracker2.cipher);
while(n_an.hasNext()){
String next = n_an.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{first},
new int[]{_a})){
SubstitutionCracker2.key[_n] = second.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_an");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_an.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_an.close();
Scanner n_no = new Scanner(SubstitutionCracker2.cipher);
while(n_no.hasNext()){
String next = n_no.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{second},
new int[]{_o})){
SubstitutionCracker2.key[_n] = first.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_no");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_no.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_no.close();
Scanner n_then = new Scanner(SubstitutionCracker2.cipher);
while(n_then.hasNext()){
String next = n_then.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_t,_h,_e})){
SubstitutionCracker2.key[_n] = fourth.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_then");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_then.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_then.close();
Scanner n_than = new Scanner(SubstitutionCracker2.cipher);
while(n_than.hasNext()){
String next = n_than.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_t,_h,_a})){
SubstitutionCracker2.key[_n] = fourth.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_than");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_than.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_than.close();
Scanner n_ten = new Scanner(SubstitutionCracker2.cipher);
while(n_ten.hasNext()){
String next = n_ten.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_t,_e})){
SubstitutionCracker2.key[_n] = third.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_ten");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_ten.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_ten.close();
Scanner n_none = new Scanner(SubstitutionCracker2.cipher);
while(n_none.hasNext()){
String next = n_none.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(first.equalsIgnoreCase(third)){
if(massCalc_notAnyOther(new String[]{second,fourth},
new int[]{_o,_e})){
SubstitutionCracker2.key[_n] = first.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_none");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_none.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_none.close();
Scanner n_anna = new Scanner(SubstitutionCracker2.cipher);
while(n_anna.hasNext()){
String next = n_anna.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(second.equalsIgnoreCase(third)){
if(massCalc_notAnyOther(new String[]{first,fourth},
new int[]{_a,_a})){
SubstitutionCracker2.key[_n] = second.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_anna");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_anna.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_anna.close();
Scanner n_onto = new Scanner(SubstitutionCracker2.cipher);
while(n_onto.hasNext()){
String next = n_onto.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_o,_t,_o})){
SubstitutionCracker2.key[_n] = second.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_onto");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_onto.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_onto.close();
Scanner n_tone = new Scanner(SubstitutionCracker2.cipher);
while(n_tone.hasNext()){
String next = n_tone.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_t,_o,_e})){
SubstitutionCracker2.key[_n] = third.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_tone");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_tone.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_tone.close();
Scanner n_eaten = new Scanner(SubstitutionCracker2.cipher);
while(n_eaten.hasNext()){
String next = n_eaten.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth},
new int[]{_e,_a,_t,_e})){
SubstitutionCracker2.key[_n] = fifth.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_eaten");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_eaten.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_eaten.close();
Scanner n_note = new Scanner(SubstitutionCracker2.cipher);
while(n_note.hasNext()){
String next = n_note.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_t,_e})){
SubstitutionCracker2.key[_n] = first.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_note");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_note.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_note.close();
Scanner n_tenth = new Scanner(SubstitutionCracker2.cipher);
while(n_tenth.hasNext()){
String next = n_tenth.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_t,_e,_t,_h})){
SubstitutionCracker2.key[_n] = third.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_tenth");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_tenth.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_tenth.close();
Scanner n_tent = new Scanner(SubstitutionCracker2.cipher);
while(n_tent.hasNext()){
String next = n_tent.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_t,_e,_t})){
SubstitutionCracker2.key[_n] = third.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_tent");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_tent.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_tent.close();
Scanner n_net = new Scanner(SubstitutionCracker2.cipher);
while(n_net.hasNext()){
String next = n_net.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_e,_t})){
SubstitutionCracker2.key[_n] = first.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_net");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_net.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasN){
n_net.close();
Scanner n_nathan = new Scanner(SubstitutionCracker2.cipher);
while(n_nathan.hasNext()){
String next = n_nathan.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(first.equalsIgnoreCase(sixth)){
if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_a,_t,_h,_a})){
SubstitutionCracker2.key[_n] = first.toLowerCase();
SubstitutionCracker2.hasN=true;
System.err.println("SubstitutionCracker2.hasN=true; via Scanner n_nathan");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

n_nathan.close();
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
