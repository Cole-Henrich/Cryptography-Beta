package sample;

public class SortableV2 {
    private int[] indices;
    private String[] crucialChars;
    public SortableV2(int[] Indices, String[] CrucialChars) {
        crucialChars = CrucialChars;
        indices = Indices;
    }

    public void setCrucialChars(String[] crucialChars) {
        this.crucialChars = crucialChars;
    }

    public String[] getCrucialChars() {
        return crucialChars;
    }

    public void setIndices(int[] indices) {
        this.indices = indices;
    }

    public int[] getIndices() {
        return indices;
    }
}
