//package sample;
//
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//
//public class FifthJumblerSolver {
//    private final CharSet charSet = new CharSet();
//    public FifthJumblerSolver(String letters, int l1, int l2) throws FileNotFoundException {
//        System.out.println(
//                StringFormat(
//                        SelectMostFrequentPhrases(
//                                FindValidPhrases (
//                                        FinishListOfCommonWordsSeparatelyByFindingCommonSecondWords (
//                                                letters, l2,
//                                                FindCommonFirstWords (
//                                                        letters, l1
//                                                )
//                                        )
//                                )
//                        )
//                )
//        );
//
//    }
//    public ArrayList<String> FindCommonFirstWords(String letters, int length) throws FileNotFoundException {
//        ArrayList<String> all = charSet.removeDuplicates(charSet.combinations(letters, length));
//        ArrayList<SortingAttribute> counted = SortingAttribute.CountFrequencyIn(charSet.getLanguage_Manipulation_UniqueWords_TrainerReservoir(), all, false);
//        ArrayList<SortingAttribute> sorted = SortingAttribute.MOST_TO_LEAST(counted);
//        ArrayList<String> rtn = new ArrayList<>();
//        int top = 15;
//        if (sorted.size() < top){
//            top = sorted.size();
//        }
//        for (int i = 0; i < top; i++) {
//            rtn.add(all.get(sorted.get(i).getIndex()));
//        }
//        return rtn;
//    }
//}
