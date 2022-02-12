package sample;

public class RelFontSizer {
    private CharSet charSet = new CharSet();
    private double AreaBaseLine;
    private String Unit;
    private double Area;
    private final String syntax = "-fx-font-size:";
    private final String[] commonFontUnits = new String[]{
            "cm", "mm","in","px","pt","pc","em","ex","ch","rem","vw","vh","vmin","vmax","%"
    };
    public String s(double relativeFontSize){
        return (syntax+((int) Math.round((Area * relativeFontSize) / AreaBaseLine))+Unit+";");
    }
    public RelFontSizer(double area, String unit, double areaBaseline){
        setAreaBaseLine(areaBaseline);
        setUnit(unit);
        setArea(area);
    }
    private void setArea(double area) {
        Area = area;
    }
    private boolean setUnit(String unit) {
        boolean validUnit = false;
        if (unit.length()<6){//"vmax;" with the semicolon, would be 5.
            if (!charSet.containsIgnorers(unit, new String[]{";","%"})) {
                unit = unit.replaceAll(";", "");
                unit = unit.toLowerCase();
                boolean inCommonUnits = false;
                for (String commonUnit: commonFontUnits) {
                    if (unit.equalsIgnoreCase(commonUnit)){
                        inCommonUnits = true;
                        break;
                    }
                }
                if (inCommonUnits) {
                   validUnit = true;
                   Unit = unit;
                }
            }
        }
        return validUnit;
    }
    private void setAreaBaseLine(double areaBaseline) {
        AreaBaseLine = areaBaseline;
    }

    public RelFontSizer(double area){
        this(area, "pt", 1152000.0);
    }
}
