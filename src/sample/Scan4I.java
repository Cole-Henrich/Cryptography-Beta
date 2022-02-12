package sample;

import java.util.Arrays;
import java.util.Scanner;

import static sample.SubstitutionCracker2.massCalc_notAnyOther;
import static sample.SubstitutionCracker2.notAnotherVowel;

public class Scan4I{
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

public Scan4I(){
System.err.println("new Scan4I");
    System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));


Scanner i_in = new Scanner(SubstitutionCracker2.cipher);
    System.err.println("i_in");
while(i_in.hasNext()){
String next = i_in.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{second},
new int[]{_n})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = first.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_in");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_in.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_in.close();
Scanner i_it = new Scanner(SubstitutionCracker2.cipher);
while(i_it.hasNext()){
String next = i_it.next();
if (next.length()==2){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));

if(massCalc_notAnyOther(new String[]{second},
new int[]{_t})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = first.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_it");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_it.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_it.close();
Scanner i_into = new Scanner(SubstitutionCracker2.cipher);
while(i_into.hasNext()){
String next = i_into.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{second,third,fourth},
new int[]{_n,_t,_o})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = first.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_into");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_into.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_into.close();
Scanner i_nation = new Scanner(SubstitutionCracker2.cipher);
while(i_nation.hasNext()){
String next = i_nation.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_n,_a,_t,_o,_n})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = fourth.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_nation");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_nation.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_nation.close();
Scanner i_attention = new Scanner(SubstitutionCracker2.cipher);
while(i_attention.hasNext()){
String next = i_attention.next();
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
new int[]{_a,_t,_t,_e,_n,_t,_o,_n})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = seventh.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_attention");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_attention.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_attention.close();
Scanner i_thin = new Scanner(SubstitutionCracker2.cipher);
while(i_thin.hasNext()){
String next = i_thin.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_t,_h,_n})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = third.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_thin");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_thin.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_thin.close();
Scanner i_nine = new Scanner(SubstitutionCracker2.cipher);
while(i_nine.hasNext()){
String next = i_nine.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_n,_n,_e})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = second.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_nine");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_nine.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_nine.close();
Scanner i_hit = new Scanner(SubstitutionCracker2.cipher);
while(i_hit.hasNext()){
String next = i_hit.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,third},
new int[]{_h,_t})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = second.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_hit");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_hit.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_hit.close();
Scanner i_notion = new Scanner(SubstitutionCracker2.cipher);
while(i_notion.hasNext()){
String next = i_notion.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_n,_o,_t,_o,_n})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = fourth.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_notion");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_notion.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_notion.close();
Scanner i_intention = new Scanner(SubstitutionCracker2.cipher);
while(i_intention.hasNext()){
String next = i_intention.next();
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

if(first.equalsIgnoreCase(seventh)){
if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth,eighth,ninth},
new int[]{_n,_t,_e,_n,_t,_o,_n})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = first.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_intention");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_intention.close();
break;
     }
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_intention.close();
Scanner i_tion = new Scanner(SubstitutionCracker2.cipher);
while(i_tion.hasNext()){
String next = i_tion.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_t,_o,_n})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = second.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_tion");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_tion.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_tion.close();
Scanner i_ninth = new Scanner(SubstitutionCracker2.cipher);
while(i_ninth.hasNext()){
String next = i_ninth.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,third,fourth,fifth},
new int[]{_n,_n,_t,_h})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = second.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_ninth");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_ninth.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_ninth.close();
Scanner i_attain = new Scanner(SubstitutionCracker2.cipher);
while(i_attain.hasNext()){
String next = i_attain.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fourth,sixth},
new int[]{_a,_t,_t,_a,_n})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = fifth.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_attain");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_attain.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_attain.close();
Scanner i_tie = new Scanner(SubstitutionCracker2.cipher);
while(i_tie.hasNext()){
String next = i_tie.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,third},
new int[]{_t,_e})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = second.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_tie");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_tie.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_tie.close();
Scanner i_thine = new Scanner(SubstitutionCracker2.cipher);
while(i_thine.hasNext()){
String next = i_thine.next();
if (next.length()==5){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));

if(massCalc_notAnyOther(new String[]{first,second,fourth,fifth},
new int[]{_t,_h,_n,_e})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = third.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_thine");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_thine.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_thine.close();
Scanner i_anoint = new Scanner(SubstitutionCracker2.cipher);
while(i_anoint.hasNext()){
String next = i_anoint.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{first,second,third,fifth,sixth},
new int[]{_a,_n,_o,_n,_t})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = fourth.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_anoint");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_anoint.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_anoint.close();
Scanner i_intent = new Scanner(SubstitutionCracker2.cipher);
while(i_intent.hasNext()){
String next = i_intent.next();
if (next.length()==6){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));

if(massCalc_notAnyOther(new String[]{second,third,fourth,fifth,sixth},
new int[]{_n,_t,_e,_n,_t})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = first.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_intent");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_intent.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_intent.close();
Scanner i_hint = new Scanner(SubstitutionCracker2.cipher);
while(i_hint.hasNext()){
String next = i_hint.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,third,fourth},
new int[]{_h,_n,_t})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = second.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_hint");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_hint.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_hint.close();
Scanner i_inn = new Scanner(SubstitutionCracker2.cipher);
while(i_inn.hasNext()){
String next = i_inn.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{second,third},
new int[]{_n,_n})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = first.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_inn");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_inn.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_inn.close();
Scanner i_tin = new Scanner(SubstitutionCracker2.cipher);
while(i_tin.hasNext()){
String next = i_tin.next();
if (next.length()==3){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));

if(massCalc_notAnyOther(new String[]{first,third},
new int[]{_t,_n})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = second.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_tin");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_tin.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_tin.close();
Scanner i_tain = new Scanner(SubstitutionCracker2.cipher);
while(i_tain.hasNext()){
String next = i_tain.next();
if (next.length()==4){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));

if(massCalc_notAnyOther(new String[]{first,second,fourth},
new int[]{_t,_a,_n})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = third.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_tain");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_tain.close();
break;
    }
   }
  }
 }
if(!SubstitutionCracker2.hasI){
i_tain.close();
Scanner i_initiate = new Scanner(SubstitutionCracker2.cipher);
while(i_initiate.hasNext()){
String next = i_initiate.next();
if (next.length()==8){
String first = String.valueOf(next.charAt(0));
String second = String.valueOf(next.charAt(1));
String third = String.valueOf(next.charAt(2));
String fourth = String.valueOf(next.charAt(3));
String fifth = String.valueOf(next.charAt(4));
String sixth = String.valueOf(next.charAt(5));
String seventh = String.valueOf(next.charAt(6));
String eighth = String.valueOf(next.charAt(7));

if(first.equalsIgnoreCase(third)&&first.equalsIgnoreCase(fifth)){
if(massCalc_notAnyOther(new String[]{second,fourth,sixth,seventh,eighth},
new int[]{_n,_t,_a,_t,_e})){
if (notAnotherVowel(SubstitutionCracker2.key[_i], _i)){
SubstitutionCracker2.key[_i] = first.toLowerCase();
SubstitutionCracker2.hasI=true;
System.err.println("SubstitutionCracker2.hasI=true; via Scanner i_initiate");
System.err.println((Arrays.toString(SubstitutionCracker2.key)).replaceAll("null", "\u0000"));
System.err.println(SubstitutionCracker2.correctKey);

i_initiate.close();
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
