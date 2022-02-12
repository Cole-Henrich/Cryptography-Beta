package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings({"FieldMayBeFinal", "FieldCanBeLocal", "LawOfDemeter", "ConditionalBreakInInfiniteLoop"})
public class LocatingEditedPlacesThroughComparingAnEditedFileAndANonEditedFile {
    ArrayList<String> contentsOfInitial;
    ArrayList<String> contentsOfEdited;
    private final CharSet charSet = new CharSet();
    private File edited;
    private File initial;
    private int numberOfEditsMade;
    private ArrayList<String> edits;
    private ArrayList<ArrayList<String>> contextOneBeforeOneAfter;
    private ArrayList<ArrayList<String>> contextTwoBeforeTwoAfter;
    private ArrayList<ArrayList<String>> contextThreeBeforeThreeAfter;
    private ArrayList<ArrayList<String>> contextFourBeforeFourAfter;
    private ArrayList<ArrayList<String>> contextTenBeforeTenAfter;

    private ArrayList<ArrayList<String>> mistake_contextOneBeforeOneAfter;
    private ArrayList<ArrayList<String>> mistake_contextTwoBeforeTwoAfter;
    private ArrayList<ArrayList<String>> mistake_contextThreeBeforeThreeAfter;
    private ArrayList<ArrayList<String>> mistake_contextFourBeforeFourAfter;
    private ArrayList<ArrayList<String>> mistake_contextTenBeforeTenAfter;



    public static void main(String[] args) throws FileNotFoundException {
        Filepackage AmericanDream1964 = CharSet.getAmericanDream1964();
        LocatingEditedPlacesThroughComparingAnEditedFileAndANonEditedFile a =
                new LocatingEditedPlacesThroughComparingAnEditedFileAndANonEditedFile(
                        AmericanDream1964.getMistaken(), AmericanDream1964.getCorrected()
                );
    }
    public LocatingEditedPlacesThroughComparingAnEditedFileAndANonEditedFile(File Initial, File Edited) throws FileNotFoundException {
        initial = Initial;
        edited = Edited;
        contentsOfInitial = charSet.fileToArrayListOfStrings(initial);
        contentsOfEdited  = charSet.fileToArrayListOfStrings(edited);
        numberOfEditsMade = contentsOfEdited.size() - contentsOfInitial.size();
        edits = new ArrayList<>();
        contextOneBeforeOneAfter = new ArrayList<>();
        contextTwoBeforeTwoAfter = new ArrayList<>();
        contextThreeBeforeThreeAfter = new ArrayList<>();
        contextFourBeforeFourAfter = new ArrayList<>();
        contextTenBeforeTenAfter = new ArrayList<>();

        mistake_contextOneBeforeOneAfter = new ArrayList<>();
        mistake_contextTwoBeforeTwoAfter = new ArrayList<>();
        mistake_contextThreeBeforeThreeAfter = new ArrayList<>();
        mistake_contextFourBeforeFourAfter = new ArrayList<>();
        mistake_contextTenBeforeTenAfter = new ArrayList<>();



        int i = 0;
        while (true){
            if (i == contentsOfInitial.size()){
                break;
            }
            if (!contentsOfInitial.get(i).equals(contentsOfEdited.get(i))){
                String edit = contentsOfEdited.get(i);
                edits.add(edit);
                if (i + 1 < contentsOfEdited.size() && i + 1 < contentsOfInitial.size() && i > 0){
                    ArrayList<String> contextOneBeforeOneAft = new ArrayList<>(Arrays.asList(
                            contentsOfEdited.get(i-1), edit, contentsOfEdited.get(i+1)
                    ));
                    contextOneBeforeOneAfter.add(contextOneBeforeOneAft);
                    ArrayList<String> mistake_contextOneBeforeOneAft = new ArrayList<>(Arrays.asList(
                            contentsOfInitial.get(i-1), edit, contentsOfInitial.get(i+1)
                    ));
                    mistake_contextOneBeforeOneAfter.add(mistake_contextOneBeforeOneAft);
                    if (i + 2 < contentsOfEdited.size() && i + 2 < contentsOfInitial.size() && i > 1){
                        ArrayList<String> contextTwoBeforeTwoAft = new ArrayList<>();
                        contextTwoBeforeTwoAft.add(contentsOfEdited.get(i-2));
                        contextTwoBeforeTwoAft.addAll(contextOneBeforeOneAft);
                        contextTwoBeforeTwoAft.add(contentsOfEdited.get(i+2));
                        contextTwoBeforeTwoAfter.add(contextTwoBeforeTwoAft);

                        ArrayList<String> mistake_contextTwoBeforeTwoAft = new ArrayList<>();
                        mistake_contextTwoBeforeTwoAft.add(contentsOfInitial.get(i-2));
                        mistake_contextTwoBeforeTwoAft.addAll(mistake_contextOneBeforeOneAft);
                        mistake_contextTwoBeforeTwoAft.add(contentsOfInitial.get(i+2));
                        mistake_contextTwoBeforeTwoAfter.add(mistake_contextTwoBeforeTwoAft);
                        
                        if (i + 3 < contentsOfEdited.size() && i + 3 < contentsOfInitial.size() && i > 2){
                            ArrayList<String> contextThreeBeforeThreeAft = new ArrayList<>();
                            contextThreeBeforeThreeAft.add(contentsOfEdited.get(i-3));
                            contextThreeBeforeThreeAft.addAll(contextTwoBeforeTwoAft);
                            contextThreeBeforeThreeAft.add(contentsOfEdited.get(i+3));
                            contextThreeBeforeThreeAfter.add(contextThreeBeforeThreeAft);

                            ArrayList<String> mistake_contextThreeBeforeThreeAft = new ArrayList<>();
                            mistake_contextThreeBeforeThreeAft.add(contentsOfInitial.get(i-3));
                            mistake_contextThreeBeforeThreeAft.addAll(mistake_contextTwoBeforeTwoAft);
                            mistake_contextThreeBeforeThreeAft.add(contentsOfInitial.get(i+3));
                            mistake_contextThreeBeforeThreeAfter.add(mistake_contextThreeBeforeThreeAft);
                            
                            if (i + 4 < contentsOfEdited.size() && i + 4 < contentsOfInitial.size() && i > 3){
                                ArrayList<String> contextFourBeforeFourAft = new ArrayList<>();
                                contextFourBeforeFourAft.add(contentsOfEdited.get(i-4));
                                contextFourBeforeFourAft.addAll(contextThreeBeforeThreeAft);
                                contextFourBeforeFourAft.add(contentsOfEdited.get(i+4));
                                contextFourBeforeFourAfter.add(contextFourBeforeFourAft);

                                ArrayList<String> mistake_contextFourBeforeFourAft = new ArrayList<>();
                                mistake_contextFourBeforeFourAft.add(contentsOfInitial.get(i-4));
                                mistake_contextFourBeforeFourAft.addAll(mistake_contextThreeBeforeThreeAft);
                                mistake_contextFourBeforeFourAft.add(contentsOfInitial.get(i+4));
                                mistake_contextFourBeforeFourAfter.add(mistake_contextFourBeforeFourAft);
                                
                                
                                if (i + 10 < contentsOfEdited.size() && i + 10 < contentsOfInitial.size() && i > 9) {
                                    ArrayList<String> contextTenBeforeTenAft = new ArrayList<>();
                                    ArrayList<String> mistake_contextTenBeforeTenAft = new ArrayList<>();
                                    for (int j = i-10; j < i+11; j++) {
                                        contextTenBeforeTenAft.add(contentsOfEdited.get(j));
                                        mistake_contextTenBeforeTenAft.add(contentsOfInitial.get(j));

                                    }
                                    contextTenBeforeTenAfter.add(contextTenBeforeTenAft);
                                    mistake_contextTenBeforeTenAfter.add(mistake_contextTenBeforeTenAft);

                                }
                            }
                        }
                    }
                }
            }
            i++;
        }
    }

    public ArrayList<ArrayList<String>> getMistake_contextTenBeforeTenAfter() {
        return mistake_contextTenBeforeTenAfter;
    }

    public ArrayList<ArrayList<String>> getMistake_contextFourBeforeFourAfter() {
        return mistake_contextFourBeforeFourAfter;
    }

    public ArrayList<ArrayList<String>> getMistake_contextThreeBeforeThreeAfter() {
        return mistake_contextThreeBeforeThreeAfter;
    }

    public ArrayList<ArrayList<String>> getMistake_contextTwoBeforeTwoAfter() {
        return mistake_contextTwoBeforeTwoAfter;
    }

    public ArrayList<ArrayList<String>> getMistake_contextOneBeforeOneAfter() {
        return mistake_contextOneBeforeOneAfter;
    }

    public ArrayList<ArrayList<String>> getContextTenBeforeTenAfter() {
        return contextTenBeforeTenAfter;
    }

    public ArrayList<ArrayList<String>> getContextFourBeforeFourAfter() {
        return contextFourBeforeFourAfter;
    }

    public ArrayList<ArrayList<String>> getContextThreeBeforeThreeAfter() {
        return contextThreeBeforeThreeAfter;
    }

    public ArrayList<ArrayList<String>> getContextTwoBeforeTwoAfter() {
        return contextTwoBeforeTwoAfter;
    }

    public ArrayList<ArrayList<String>> getContextOneBeforeOneAfter() {
        return contextOneBeforeOneAfter;
    }

    public ArrayList<String> getEdits() {
        return edits;
    }

    public int getNumberOfEditsMade() {
        return numberOfEditsMade;
    }
    public ArrayList<String> getContentsOfInitial() {
        return contentsOfInitial;
    }
    public ArrayList<String> getContentsOfEdited() {
        return contentsOfEdited;
    }

    public File getInitial() {
        return initial;
    }

    public File getEdited() {
        return edited;
    }
}
