package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BigWordAndOccurrenceStore {

    private ArrayList<Map<String, Integer>> central;
    private Map<String, Integer> HashCentral;
    public BigWordAndOccurrenceStore(){

		WordAndOccurrenceStore1 ws1 = new WordAndOccurrenceStore1();
		Map<String, Integer> _1 = ws1.get();
		WordAndOccurrenceStore2 ws2 = new WordAndOccurrenceStore2();
		Map<String, Integer> _2 = ws2.get();
		WordAndOccurrenceStore3 ws3 = new WordAndOccurrenceStore3();
		Map<String, Integer> _3 = ws3.get();
		WordAndOccurrenceStore4 ws4 = new WordAndOccurrenceStore4();
		Map<String, Integer> _4 = ws4.get();
		WordAndOccurrenceStore5 ws5 = new WordAndOccurrenceStore5();
		Map<String, Integer> _5 = ws5.get();
		WordAndOccurrenceStore6 ws6 = new WordAndOccurrenceStore6();
		Map<String, Integer> _6 = ws6.get();
		WordAndOccurrenceStore7 ws7 = new WordAndOccurrenceStore7();
		Map<String, Integer> _7 = ws7.get();
		WordAndOccurrenceStore8 ws8 = new WordAndOccurrenceStore8();
		Map<String, Integer> _8 = ws8.get();
		WordAndOccurrenceStore9 ws9 = new WordAndOccurrenceStore9();
		Map<String, Integer> _9 = ws9.get();
		WordAndOccurrenceStore10 ws10 = new WordAndOccurrenceStore10();
		Map<String, Integer> _10 = ws10.get();
		WordAndOccurrenceStore11 ws11 = new WordAndOccurrenceStore11();
		Map<String, Integer> _11 = ws11.get();
		WordAndOccurrenceStore12 ws12 = new WordAndOccurrenceStore12();
		Map<String, Integer> _12 = ws12.get();
		WordAndOccurrenceStore13 ws13 = new WordAndOccurrenceStore13();
		Map<String, Integer> _13 = ws13.get();
		WordAndOccurrenceStore14 ws14 = new WordAndOccurrenceStore14();
		Map<String, Integer> _14 = ws14.get();
		WordAndOccurrenceStore15 ws15 = new WordAndOccurrenceStore15();
		Map<String, Integer> _15 = ws15.get();
		WordAndOccurrenceStore16 ws16 = new WordAndOccurrenceStore16();
		Map<String, Integer> _16 = ws16.get();
		WordAndOccurrenceStore17 ws17 = new WordAndOccurrenceStore17();
		Map<String, Integer> _17 = ws17.get();
		WordAndOccurrenceStore18 ws18 = new WordAndOccurrenceStore18();
		Map<String, Integer> _18 = ws18.get();
		WordAndOccurrenceStore19 ws19 = new WordAndOccurrenceStore19();
		Map<String, Integer> _19 = ws19.get();
		WordAndOccurrenceStore20 ws20 = new WordAndOccurrenceStore20();
		Map<String, Integer> _20 = ws20.get();
		WordAndOccurrenceStore21 ws21 = new WordAndOccurrenceStore21();
		Map<String, Integer> _21 = ws21.get();
		WordAndOccurrenceStore22 ws22 = new WordAndOccurrenceStore22();
		Map<String, Integer> _22 = ws22.get();
		WordAndOccurrenceStore23 ws23 = new WordAndOccurrenceStore23();
		Map<String, Integer> _23 = ws23.get();
		central = new ArrayList<>();
		HashCentral = new HashMap<>();
		ArrayList<Map<String, Integer>> a = new ArrayList<>();
		a.add(_1);
		a.add(_2);
		a.add(_3);
		a.add(_4);
		a.add(_5);
		a.add(_6);
		a.add(_7);
		a.add(_8);
		a.add(_9);
		a.add(_10);
		a.add(_11);
		a.add(_12);
		a.add(_13);
		a.add(_14);
		a.add(_15);
		a.add(_16);
		a.add(_17);
		a.add(_18);
		a.add(_19);
		a.add(_20);
		a.add(_21);
		a.add(_22);
		a.add(_23);
        for (Map<String, Integer> b: a) {
            Collections.addAll(central, b);
            if (b!= null) {b.forEach(HashCentral::put);}
        }
    }
    public Map<String, Integer> HashCentral(){return HashCentral;}
    public ArrayList<Map<String, Integer>> central(){return central;}
}
