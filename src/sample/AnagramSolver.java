package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AnagramSolver {
    private static final double Default = 0.00005;
    private final CharSet charSet = new CharSet();
    private final File document = charSet.getLanguage_Manipulation_UniqueWords_TrainerReservoir();
    private ArrayList<String> fullList;
    public AnagramSolver(String letterset, double minimumFrequency) throws ManyCombinationsException, FileNotFoundException {
        fullList = charSet.removeDuplicates(
               charSet.CreateCombinations(
                       letterset
               )
       );
        System.out.println(
            StringFormat(
                    SelectMostFrequent(
                            minimumFrequency,
                            SortingAttribute.MOST_TO_LEAST(
                                  SortingAttribute.CountFrequencyIn(
                                          document, fullList, false
                                  )
                            )
                    )
            )
        );
    }
    private String StringFormat(ArrayList<String> arrayList){
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (String s : arrayList) {
            sb.append("\n");
            sb.append(s);
        }
        return sb.toString();
    }
    private ArrayList<String> SelectMostFrequent(double minimumFrequency, ArrayList<SortingAttribute> most_to_least) {
        ArrayList<String> rtn = new ArrayList<>();
        int top = 15;
        if (most_to_least.size() < top){
            top = most_to_least.size();
        }
        for (int i = 0; i < top; i++) {
            rtn.add(fullList.get(most_to_least.get(i).getIndex()));
        }
        return rtn;
    }

    public AnagramSolver(String letterset) throws ManyCombinationsException, FileNotFoundException {
        this(letterset, Default);
    }
}
