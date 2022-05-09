package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan5S{
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

public Scan5S(){
System.err.println("new Scan5S");


Scanner s_his = new Scanner(SubstitutionCracker2.cipher);
while(s_his.hasNext()){
String next = s_his.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_h,_i})){
SubstitutionCracker2.key[_s] = third.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_his");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_his.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_his.close();
Scanner s_is = new Scanner(SubstitutionCracker2.cipher);
while(s_is.hasNext()){
String next = s_is.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{first},
new int[]{_i})){
SubstitutionCracker2.key[_s] = second.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_is");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_is.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_is.close();
Scanner s_as = new Scanner(SubstitutionCracker2.cipher);
while(s_as.hasNext()){
String next = s_as.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{first},
new int[]{_a})){
SubstitutionCracker2.key[_s] = second.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_as");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_as.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_as.close();
Scanner s_this = new Scanner(SubstitutionCracker2.cipher);
while(s_this.hasNext()){
String next = s_this.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,third},
new int[]{_t,_h,_i})){
SubstitutionCracker2.key[_s] = fourth.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_this");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_this.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_this.close();
Scanner s_she = new Scanner(SubstitutionCracker2.cipher);
while(s_she.hasNext()){
String next = s_she.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_h,_e})){
SubstitutionCracker2.key[_s] = first.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_she");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_she.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_she.close();
Scanner s_so = new Scanner(SubstitutionCracker2.cipher);
while(s_so.hasNext()){
String next = s_so.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{second},
new int[]{_o})){
SubstitutionCracker2.key[_s] = first.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_so");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_so.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_so.close();
Scanner s_these = new Scanner(SubstitutionCracker2.cipher);
while(s_these.hasNext()){
String next = s_these.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_t,_h,_e,_e})){
SubstitutionCracker2.key[_s] = fourth.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_these");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_these.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_these.close();
Scanner s_has = new Scanner(SubstitutionCracker2.cipher);
while(s_has.hasNext()){
String next = s_has.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_h,_a})){
SubstitutionCracker2.key[_s] = third.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_has");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_has.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_has.close();
Scanner s_see = new Scanner(SubstitutionCracker2.cipher);
while(s_see.hasNext()){
String next = s_see.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_e,_e})){
SubstitutionCracker2.key[_s] = first.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_see");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_see.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_see.close();
Scanner s_those = new Scanner(SubstitutionCracker2.cipher);
while(s_those.hasNext()){
String next = s_those.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth},
new int[]{_t,_h,_o,_e})){
SubstitutionCracker2.key[_s] = fourth.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_those");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_those.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_those.close();
Scanner s_son = new Scanner(SubstitutionCracker2.cipher);
while(s_son.hasNext()){
String next = s_son.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_o,_n})){
SubstitutionCracker2.key[_s] = first.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_son");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_son.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_son.close();
Scanner s_its = new Scanner(SubstitutionCracker2.cipher);
while(s_its.hasNext()){
String next = s_its.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,second},
new int[]{_i,_t})){
SubstitutionCracker2.key[_s] = third.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_its");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_its.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_its.close();
Scanner s_hast = new Scanner(SubstitutionCracker2.cipher);
while(s_hast.hasNext()){
String next = s_hast.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_h,_a,_t})){
SubstitutionCracker2.key[_s] = third.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_hast");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_hast.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_hast.close();
Scanner s_set = new Scanner(SubstitutionCracker2.cipher);
while(s_set.hasNext()){
String next = s_set.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_e,_t})){
SubstitutionCracker2.key[_s] = first.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_set");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_set.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_set.close();
Scanner s_sent = new Scanner(SubstitutionCracker2.cipher);
while(s_sent.hasNext()){
String next = s_sent.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_n,_t})){
SubstitutionCracker2.key[_s] = first.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_sent");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_sent.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_sent.close();
Scanner s_saith = new Scanner(SubstitutionCracker2.cipher);
while(s_saith.hasNext()){
String next = s_saith.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_a,_i,_t,_h})){
SubstitutionCracker2.key[_s] = first.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_saith");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_saith.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_saith.close();
Scanner s_sons = new Scanner(SubstitutionCracker2.cipher);
while(s_sons.hasNext()){
String next = s_sons.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(first.equalsIgnoreCase(fourth)){
if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_o,_n})){
SubstitutionCracker2.key[_s] = first.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_sons");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_sons.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_sons.close();
Scanner s_seen = new Scanner(SubstitutionCracker2.cipher);
while(s_seen.hasNext()){
String next = s_seen.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_e,_e,_n})){
SubstitutionCracker2.key[_s] = first.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_seen");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_seen.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_seen.close();
Scanner s_sat = new Scanner(SubstitutionCracker2.cipher);
while(s_sat.hasNext()){
String next = s_sat.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_a,_t})){
SubstitutionCracker2.key[_s] = first.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_sat");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_sat.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_sat.close();
Scanner s_soon = new Scanner(SubstitutionCracker2.cipher);
while(s_soon.hasNext()){
String next = s_soon.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_o,_o,_n})){
SubstitutionCracker2.key[_s] = first.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_soon");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_soon.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_soon.close();
Scanner s_state = new Scanner(SubstitutionCracker2.cipher);
while(s_state.hasNext()){
String next = s_state.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_t,_a,_t,_e})){
SubstitutionCracker2.key[_s] = first.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_state");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_state.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_state.close();
Scanner s_nations = new Scanner(SubstitutionCracker2.cipher);
while(s_nations.hasNext()){
String next = s_nations.next();
if (next.length()==7){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,fifth,sixth},
new int[]{_n,_a,_t,_i,_o,_n})){
SubstitutionCracker2.key[_s] = seventh.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_nations");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_nations.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_nations.close();
Scanner s_states = new Scanner(SubstitutionCracker2.cipher);
while(s_states.hasNext()){
String next = s_states.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(first.equalsIgnoreCase(sixth)){
if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth},
new int[]{_t,_a,_t,_e})){
SubstitutionCracker2.key[_s] = first.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_states");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_states.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_states.close();
Scanner s_sea = new Scanner(SubstitutionCracker2.cipher);
while(s_sea.hasNext()){
String next = s_sea.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_e,_a})){
SubstitutionCracker2.key[_s] = first.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_sea");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_sea.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_sea.close();
Scanner s_sit = new Scanner(SubstitutionCracker2.cipher);
while(s_sit.hasNext()){
String next = s_sit.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_i,_t})){
SubstitutionCracker2.key[_s] = first.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_sit");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_sit.close();
break;
   }
  }
 }
if(!SubstitutionCracker2.hasS){
s_sit.close();
Scanner s_sense = new Scanner(SubstitutionCracker2.cipher);
while(s_sense.hasNext()){
String next = s_sense.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(first.equalsIgnoreCase(fourth)){
if(massCalc_notAnyOther(new String[]{second,third,fifth},
new int[]{_e,_n,_e})){
SubstitutionCracker2.key[_s] = first.toLowerCase();
SubstitutionCracker2.hasS=true;
System.err.println("SubstitutionCracker2.hasS=true; via Scanner s_sense");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

s_sense.close();
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
