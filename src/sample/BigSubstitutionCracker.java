package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class BigSubstitutionCracker {
    private final CharSet charSet = new CharSet();
    private final math math = new math();
    private final char[] alphabet = charSet.getAlphabet();
    private final char[] ignorers = charSet.getIgnorers();
    private String[] key;
    private ArrayList<String> lettersInUse;
    private String solved;
    private String cipher;
    private final int ex_a = 'H' - 'A';// using ASCII values, alternate way of getting index;
    // also equals 'h'-'a', but don't mix cases.
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
    private boolean hasA = false;

    private boolean hasB = false;

    private boolean hasC = false;

    private boolean hasD = false;

    private boolean hasE = false;

    private boolean hasF = false;

    private boolean hasG = false;

    private boolean hasH = false;

    private boolean hasI = false;

    private boolean hasJ = false;

    private boolean hasK = false;

    private boolean hasL = false;

    private boolean hasM = false;

    private boolean hasN = false;

    private boolean hasO = false;

    private boolean hasP = false;

    private boolean hasQ = false;

    private boolean hasR = false;

    private boolean hasS = false;

    private boolean hasT = false;

    private boolean hasU = false;

    private boolean hasV = false;

    private boolean hasW = false;

    private boolean hasX = false;

    private boolean hasY = false;

    private boolean hasZ = false;

    private boolean hasAll = false;
    private boolean isSolved = false;

    public BigSubstitutionCracker(String Cipher, String actualKey) {
        System.err.println("new BigSubstitutionCracker(String Cipher);");

        key = new String[alphabet.length];
        this.cipher = Cipher;

        String correctKey = new Metamorphose(actualKey).get_B();
        // that
        CipherEquivOfThat ciphEquiv = new CipherEquivOfThat(cipher);
        String that = ciphEquiv.get();
        key[_t] = String.valueOf(that.charAt(0)).toLowerCase();
        key[_h] = String.valueOf(that.charAt(1)).toLowerCase();
        key[_a] = String.valueOf(that.charAt(2)).toLowerCase();
        hasH = true;
        System.err.println("hasH = true;");
        hasA = true;
        System.err.println("hasA = true;");
        hasT = true;
        System.err.println("hasT = true;");
        System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
        System.err.println(correctKey);

//        Scanner hat = new Scanner(cipher);
//        System.err.println("Scanner hat");
//        while (hat.hasNext()) {
//            String next = hat.next();
//            if (next.length() == 4) {
//                String first = String.valueOf(next.charAt(0));
//                String fourth = String.valueOf(next.charAt(3));
//                if (first.equalsIgnoreCase(fourth)) {
//                    System.err.println(next);
//                    key[_t] = String.valueOf(next.charAt(0)).toLowerCase();
//                    key[_h] = String.valueOf(next.charAt(1)).toLowerCase();
//                    key[_a] = String.valueOf(next.charAt(2)).toLowerCase();
//                    hasH = true;
//                    System.err.println("hasH = true;");
//                    hasA = true;
//                    System.err.println("hasA = true;");
//                    hasT = true;
//                    System.err.println("hasT = true;");
//                    hat.close();
//                    System.err.println((Arrays.toString(this.key)).replaceAll("null", "\u0000"));
//                    System.err.println(correctKey);
//
//                    break;
//                }
//            }
//        }

        boolean[] has = new boolean[] { hasA, hasB, hasC, hasD, hasE, hasF, hasG, hasH, hasI, hasJ, hasK, hasL, hasM,
                hasN, hasO, hasP, hasQ, hasR, hasS, hasT, hasU, hasV, hasW, hasX, hasY, hasZ };
        boolean hasAll = true;
        int numLacking = 0;
        ArrayList<Integer> hasNot = new ArrayList<>();
        for (int i = 0; i < has.length; i++) {
            boolean Boolean = has[i];
            if (!Boolean) {
                hasNot.add(i);
                numLacking++;
                hasAll = false;
            }
        }
        if (!hasAll) {
            System.err.println("missing " + numLacking + " decoded equivalents");
            if (numLacking < 12) {
                System.err.println("Now attempting to brute force the remainder.");
                boolean Break = false;
                double reps = 0;
                ArrayList<String> a0 = new ArrayList<>();
                for (int i = 0; i < key.length; i++) {
                    if (key[i] != null) {
                        a0.add(key[i]);
                    }
                }
                ArrayList<String> a1 = charSet.StringToStringArrayList(charSet.charToStringArray(alphabet));
                ArrayList<String> a2 = charSet.inversionOf(a1, a0);
                int size = a2.size();
                String[] tempKey = key;
                for (int ax = 0; ax < size; ax++) {
                    tempKey[hasNot.get(0)] = a2.get(ax);
                    ArrayList<String> a3 = a2;
                    a3.remove(ax);
                    if (numLacking > 1) {
                        for (int bx = 0; bx < a3.size(); bx++) {
                            tempKey[hasNot.get(1)] = a3.get(bx);
                            ArrayList<String> a4 = a3;
                            a4.remove(ax);
                            if (numLacking > 2){
                                for (int cx = 0; cx < a4.size(); cx++) {
                                    tempKey[hasNot.get(2)] = a4.get(cx);
                                    ArrayList<String> a5 = a4;
                                    a4.remove(cx);
                                    if (numLacking > 3){
                                        for (int dx = 0; dx < a5.size(); dx++) {
                                            tempKey[hasNot.get(3)] = a5.get(dx);
                                            ArrayList<String> a6 = a5;
                                            a6.remove(dx);
                                            if (numLacking > 4) {
                                                for (int ex = 0; ex < a6.size(); ex++) {
                                                    tempKey[hasNot.get(4)] = a6.get(ex);
                                                    ArrayList<String> a7 = a6;
                                                    a7.remove(ex);
                                                    if (numLacking > 5) {
                                                        for (int fx = 0; fx < a7.size(); fx++) {
                                                            tempKey[hasNot.get(5)] = a7.get(fx);
                                                            ArrayList<String> a8 = a7;
                                                            a8.remove(fx);
                                                            if (numLacking > 6){
                                                                for (int gx = 0; gx < a8.size(); gx++) {
                                                                    tempKey[hasNot.get(6)] = a8.get(gx);
                                                                    ArrayList<String> a9 = a8;
                                                                    a9.remove(gx);
                                                                    if (numLacking > 7){
                                                                        for (int hx = 0; hx < a9.size(); hx++) {
                                                                            tempKey[hasNot.get(7)] = a9.get(hx);
                                                                            ArrayList<String> a10 = a9;
                                                                            a10.remove(hx);
                                                                            if (numLacking > 8) {
                                                                                for (int ix = 0; ix < a10.size(); ix++) {
                                                                                    tempKey[hasNot.get(8)] = a10.get(ix);
                                                                                    ArrayList<String> a11 = a10;
                                                                                    a11.remove(ix);
                                                                                    if (numLacking > 9) {
                                                                                        for (int jx = 0; jx < a11.size(); jx++) {
                                                                                            tempKey[hasNot.get(9)] = a11.get(jx);
                                                                                            ArrayList<String> a12 = a11;
                                                                                            a12.remove(jx);
                                                                                            if (numLacking == 11){
                                                                                                for (int kx = 0; kx < a12.size(); kx++) {
                                                                                                    tempKey[hasNot.get(10)] = a12.get(kx);
                                                                                                    if (check(tempKey)) {
                                                                                                        this.key = tempKey;
                                                                                                        this.isSolved = true;
                                                                                                        this.hasAll = true;
                                                                                                        Break = true;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                if (check(tempKey)) {
                                                                                                    this.key = tempKey;
                                                                                                    this.isSolved = true;
                                                                                                    this.hasAll = true;
                                                                                                    Break = true;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (Break){
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        if (check(tempKey)) {
                                                                                            this.key = tempKey;
                                                                                            this.isSolved = true;
                                                                                            this.hasAll = true;
                                                                                            Break = true;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (Break) {
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                            else {
                                                                                if (check(tempKey)) {
                                                                                    this.key = tempKey;
                                                                                    this.isSolved = true;
                                                                                    this.hasAll = true;
                                                                                    Break = true;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if (Break){
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        if (check(tempKey)) {
                                                                            this.key = tempKey;
                                                                            this.isSolved = true;
                                                                            this.hasAll = true;
                                                                            Break = true;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (Break){
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                if (check(tempKey)) {
                                                                    this.key = tempKey;
                                                                    this.isSolved = true;
                                                                    this.hasAll = true;
                                                                    Break = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (Break){
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        if (check(tempKey)) {
                                                            this.key = tempKey;
                                                            this.isSolved = true;
                                                            this.hasAll = true;
                                                            Break = true;
                                                            break;
                                                        }
                                                    }
                                                    if (Break) {
                                                        break;
                                                    }
                                                }
                                            }
                                            else {
                                                if (check(tempKey)) {
                                                    this.key = tempKey;
                                                    this.isSolved = true;
                                                    this.hasAll = true;
                                                    Break = true;
                                                    break;
                                                }
                                            }
                                            if (Break){
                                                break;
                                            }
                                        }
                                    }
                                    else {
                                        if (check(tempKey)) {
                                            this.key = tempKey;
                                            this.isSolved = true;
                                            this.hasAll = true;
                                            Break = true;
                                            break;
                                        }
                                    }
                                    if (Break){
                                        break;
                                    }
                                }
                            }
                            else {
                                if (check(tempKey)) {
                                    this.key = tempKey;
                                    this.isSolved = true;
                                    this.hasAll = true;
                                    Break = true;
                                    break;
                                }
                            }
                            if (Break){
                                break;
                            }
                        }
                    } else {
                        if (check(tempKey)) {
                            this.key = tempKey;
                            this.isSolved = true;
                            this.hasAll = true;
                            Break = true;
                            break;
                        }
                    }
                    if (Break) {
                        break;
                    }
                }
            }
            else {
                System.err.println("too many to brute force.");
            }
        }

        StringBuilder solver = new StringBuilder();
        for (int index = 0; index < cipher.length(); index++) {
            String Char = String.valueOf(cipher.charAt(index));
            if (isIgnorer(Char)) {
                solver.append(Char);
            } else {
                for (int keyIndex = 0; keyIndex < alphabet.length; keyIndex++) {
                    if (Char.equalsIgnoreCase(String.valueOf(alphabet[keyIndex]))) {
                        solver.append(key[keyIndex]);
                        break;
                    }
                }
            }
        }
        this.isSolved = true;
        this.solved = solver.toString();

        System.err.println(Arrays.toString(this.key));
    }

    // 'a','b','c','d','e','f','g', red <--6
    // 'h','i','j','k','l','m', 'n', yellow <--13
    // 'o','p','q','r','s','t', green <--19
    // 'u','v','w','x','y','z' blue <--25
    private boolean check(String[] tempKey) {
        boolean rtn = false;
        Scramble scramble = new Scramble(tempKey, this.getCipher());
        not_english not_english = new not_english(scramble.get());
        if (!not_english.not_english()) {
            rtn = true;
        }
        return rtn;
    }

    private boolean isIgnorer(String c) {
        boolean isIgnorer = false;
        for (char ignorer : ignorers) {
            if (String.valueOf(c).equalsIgnoreCase(String.valueOf(ignorer))) {
                isIgnorer = true;
                break;

            }
        }
        return isIgnorer;
    }

    private boolean thisChar_isNotAlreadyInTheKey(String betterNotAlreadyBeInTheKey) {
        boolean rtn = true;
        for (String keyChar : key) {
            if (keyChar != null) {
                if (keyChar.equalsIgnoreCase(betterNotAlreadyBeInTheKey)) {
                    rtn = false;
                    break;
                }
            }
        }
        return rtn;
    }

    private boolean massCalc_notAnyOther(String[] these, int[] spotsOfThese) {
        boolean rtn = true;
        boolean Break = false;
        for (int i = 0; i < these.length; i++) {
            String ThisString = these[i];
            int indexException = spotsOfThese[i];
            for (int j = 0; j < key.length; j++) {
                String KeyString = key[j];
                if (KeyString != null) {
                    if (KeyString.equalsIgnoreCase(ThisString) && j != indexException) {
                        rtn = false;
                        Break = true;
                        break;
                    }
                }
            }
            if (Break) {
                break;
            }
        }
        return rtn;
    }

    private boolean notAnotherVowel(String a, int b) {
        boolean rtn = true;
        int[] c = new int[] { _a, _e, _i, _o, _u, _y };
        ArrayList<Integer> d = new ArrayList<>();
        for (int e : c) {
            if (e != b) {
                d.add(e);
            }
        }
        for (Integer f : d) {
            if (a.equalsIgnoreCase(key[f])) {
                rtn = false;
                break;
            }
        }
        return rtn;
    }

    private boolean equalsIgnoreCase_andNotAnyOther(String This, int onlyEquals_charAtThisIndex) {
        return This.equalsIgnoreCase(String.valueOf(key[onlyEquals_charAtThisIndex]))
               && notAnyOther(onlyEquals_charAtThisIndex);
    }

    private boolean notAnyOther(int except_charAtThisIndex) {
        String except = String.valueOf(key[except_charAtThisIndex]);
        boolean notAnyOther = true;
        for (int i = 0; i < key.length; i++) {
            String k = key[i];
            if (except_charAtThisIndex != i) {
                if (except.equalsIgnoreCase(k)) {
                    notAnyOther = false;
                    break;
                }
            }
        }
        return notAnyOther;
    }

    private char[] replace(char[] original, char replaceChar) {
        ArrayList<Character> characters = new ArrayList<>();
        for (char o : original) {
            characters.add(o);
        }
        characters.remove(characters.indexOf(replaceChar));
        char[] rtn = new char[original.length - 1];
        for (int i = 0; i < rtn.length; i++) {
            rtn[i] = characters.get(i);
        }
        return rtn;
    }

    private char[] replace2(char[] original, char replaceChar) {
        ArrayList<Character> characters = new ArrayList<>();
        for (char o : original) {
            if (o != replaceChar) {
                characters.add(o);
            }
        }
        char[] rtn = new char[original.length - 1];
        for (int i = 0; i < rtn.length; i++) {
            rtn[i] = characters.get(i);
        }
        return rtn;
    }

    public ArrayList<String> getLettersInUse() {
        return lettersInUse;
    }

    public String[] getKey() {
        return key;
    }

    public String getSolved() {
        return solved;
    }

    public String getCipher() {
        return cipher;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public static void main(String[] args) {
        test0();
        test1();
    }

    public static void test1() {
        BigSubstitutionCracker sc = new BigSubstitutionCracker(
                """
                        Cffl zyzeoec.
                        Nflti, fpj wzhhfs donomzeq, fpj sti fw howz, fpj yzji wjzzlfa dtaz pelzj tnntdx oe t qzjozq fw\s
                        lzhokzjtnz tel lztlhi nzjjfjoqn tdnq. Nuz yodnoaq szjz oe tojghtezq fj oe nuzoj fwwodzq:\s
                        qzdjzntjozq, kpqoezqq aze tel sfaze, aohontji tel wzlzjth sfjxzjq, afaq tel ltlq, wjozelq\s
                        tel ezocukfjq. Nufpqtelq fw hoyzq szjz qpllzehi zelzl ki zyoh, lzqgodtkhz tdnq fw nzjjfj. Nuz\s
                        godnpjzq fw tojghtezq whioec oenf kpohloecq, wojzq kpjeoec, upcz ­­ upcz qnjpdnpjzq dfhhtgqoec\s
                        utyz wohhzl pq sonu loqkzhozw, nzjjokhz qtlezqq, tel t rpozn, peiozhloec teczj. Nuzqz tdnq fw\s
                        atqq apjlzj szjz oenzelzl nf wjocunze fpj etnofe oenf dutfq tel jznjztn. Kpn nuzi utyz\s
                        wtohzl. Fpj dfpenji oq qnjfec.
                        T cjztn gzfghz utq kzze afyzl nf lzwzel t cjztn etnofe. Nzjjfjoqn tnntdxq dte qutxz nuz\s
                        wfpeltnofeq fw fpj kocczqn kpohloecq, kpn nuzi dteefn nfpdu nuz wfpeltnofe fw Tazjodt. Nuzqz\s
                        tdnq qutnnzj qnzzh, kpn nuzi dteefn lzen nuz qnzzh fw Tazjodte jzqfhyz. Tazjodt stq ntjcznzl\s
                        wfj tnntdx kzdtpqz sz'jz nuz kjocunzqn kztdfe wfj wjzzlfa tel fggfjnpeoni oe nuz sfjhl. Tel\s
                        ef fez sohh xzzg nutn hocun wjfa quoeoec. Nflti, fpj etnofe qts zyoh ­­ nuz yzji sfjqn fw upate
                        etnpjz ­­ tel sz jzqgfelzl sonu nuz kzqn fw Tazjodt. Sonu nuz ltjoec fw fpj jzqdpz sfjxzjq,  sonu nuz dtjoec wfj qnjteczjq tel ezocukfjq suf dtaz nf coyz khffl tel uzhg oe tei sti nuzi\s
                        dfphl.
                        Oaazlotnzhi wfhhfsoec nuz wojqn tnntdx, O oaghzazenzl fpj cfyzjeazen'q zazjczedi jzqgfeqz\s
                        ghteq. Fpj aohontji oq gfszjwph, tel on'q gjzgtjzl. Fpj zazjczedi nztaq tjz sfjxoec oe Ezs
                        Ifjx Doni tel Stquoecnfe L.D. nf uzhg sonu hfdth jzqdpz zwwfjnq. Fpj wojqn gjofjoni oq nf czn uzhg\s
                        nf nufqz suf utyz kzze oebpjzl, tel nf ntxz zyzji gjzdtpnofe nf gjfnzdn fpj donomzeq tn ufaz\s
                        tel tjfpel nuz sfjhl wjfa wpjnuzj tnntdxq. Nuz wpednofeq fw fpj cfyzjeazen dfenoepz sonufpn
                        oenzjjpgnofe. Wzlzjth tczedozq oe Stquoecnfe suodu utl nf kz zytdptnzl nflti tjz jzfgzeoec\s
                        wfj zqqzenoth gzjqfeezh nfeocun tel sohh kz fgze wfj kpqoezqq nfafjjfs. Fpj woetedoth
                        oeqnonpnofeq jzatoe qnjfec, tel nuz Tazjodte zdfefai sohh kz fgze wfj kpqoezqq tq szhh.
                        Nuz qztjdu oq pelzjsti wfj nufqz suf szjz kzuoel nuzqz zyoh tdnq. O utyz lojzdnzl nuz wphh
                        jzqfpjdzq fw fpj oenzhhoczedz tel hts zewfjdzazen dfaapeonozq nf woel nufqz jzqgfeqokhz tel\s
                        nf kjoec nuza nf bpqnodz. Sz sohh atxz ef loqnoednofe kznszze nuz nzjjfjoqnq suf dfaaonnzl\s
                        nuzqz tdnq tel nufqz suf utjkfj nuza.\s
                        O tggjzdotnz qf yzji apdu nuz azakzjq fw Dfecjzqq suf utyz bfoezl az oe qnjfechi\s
                        dfelzaeoec nuzqz tnntdxq. Tel fe kzuthw fw nuz Tazjodte gzfghz, O nutex nuz atei sfjhl\s
                        hztlzjq suf utyz dthhzl nf fwwzj nuzoj dfelfhzedzq tel tqqoqntedz. Tazjodt tel fpj wjozelq\s
                        tel thhozq bfoe sonu thh nufqz suf sten gztdz tel qzdpjoni oe nuz sfjhl, tel sz qntel nfcznuzj\s
                        nf soe nuz stj tctoeqn nzjjfjoqa.\s
                        Nfeocun, O tqx wfj ifpj gjtizjq wfj thh nufqz suf cjozyz, wfj nuz duohljze sufqz sfjhlq utyz\s
                        kzze qutnnzjzl, wfj thh sufqz qzeqz fw qtwzni tel qzdpjoni utq kzze nujztnzezl. Tel O gjti\s
                        nuzi sohh kz dfawfjnzl ki t Gfszj cjztnzj nute tei fw pq, qgfxze nujfpcu nuz tczq oe Gqtha\s
                        23:
                        Zyze nufpcu O sthx nujfpcu nuz ythhzi fw nuz qutlfs fw lztnu, O wztj ef zyoh wfj ifp tjz sonu
                        az.
                        Nuoq oq t lti suze thh Tazjodteq wjfa zyzji sthx fw howz peonz oe fpj jzqfhyz wfj bpqnodz tel\s
                        gztdz. Tazjodt utq qnffl lfse zezaozq kzwfjz, tel sz sohh lf qf nuoq noaz. Efez fw pq sohh
                        zyzj wfjczn nuoq lti, izn sz cf wfjstjl nf lzwzel wjzzlfa tel thh nutn oq cffl tel bpqn oe fpj\s
                        sfjhl.
                        Nutex ifp. Cffl eocun. Tel Cfl khzqq Tazjodt.
                        """,
                "tkdlzwcuobxhaefgrjqnpysvim");
    }

    public static void test0() {
        // exkfyvbromspzdcqaihlugwjtn
        BigSubstitutionCracker sc = new BigSubstitutionCracker(
                """
                        Qicpcbuy
                                                     \s
                                       OL’H XYYD EPZCHL lyd tyeih hodky O voihl ied vci qcpolokep cvvoky. O weh lroilt-vogy el lry lozy, vcui tyeih cul cv pew hkrccp, iykydlpt zeiioyf, edf bydyieppt ozqeloydl wolr povy. E hyel od lry Oppodcoh pybohpeluiy ref cqydyf uq, edf hygyiep vioydfh hubbyhlyf lrel O iud, lrodsodb lrel zt wcis eh e kogop iobrlh pewtyi, edf kcdleklh vicz zt feth eh e kczzudolt cibedonyi, wcupf zesy zy e goexpy kedfofely. Evlyi fohkuhhodb ol wolr zt wovy, O ydlyiyf lry ieky edf qickyyfyf lc fc wrel ygyit voihl-lozy kedfofely fcyh: O lepsyf lc edtcdy wrc wcupf pohlyd. O wydl lc xpcks kpux zyylodbh edf kruikr hckoeph, xyeult hrcqh edf xeixyihrcqh. Ov lwc buth wyiy hledfodb cd e kcidyi, O wcupf kichh lry hliyyl lc redf lryz kezqeobd polyieluiy. Edf ygyitwryiy O wydl, O’f byl hczy gyihocd cv lry hezy lwc auyhlocdh.
                                                     \s
                                       “Wryiy’f tcu byl lrel vuddt dezy?”
                                                     \s
                                       Edf lryd: “Tcu hyyz posy e doky ydcubr but. Wrt fc tcu wedl lc bc odlc hczylrodb foilt edf dehlt posy qcpolokh?”
                                                     \s
                                       O weh vezopoei wolr lry auyhlocd, e geioedl cd lry auyhlocdh ehsyf cv zy tyeih yeipoyi, wryd O’f voihl eiiogyf od Krokebc lc wcis od pcw-odkczy dyobrxcirccfh. Ol hobdepyf e ktdokohz dcl hozqpt wolr qcpolokh xul wolr lry gyit dclocd cv e quxpok povy, e ktdokohz lrel—el pyehl od lry Hculr Hofy dyobrxcirccfh O hcubrl lc iyqiyhydl—ref xyyd dcuiohryf xt e bydyielocd cv xicsyd qiczohyh. Od iyhqcdhy, O wcupf uhueppt hzopy edf dcf edf het lrel O udfyihlccf lry hsyqlokohz, xul lrel lryiy weh—edf epweth ref xyyd—edclryi liefolocd lc qcpolokh, e liefolocd lrel hliylkryf vicz lry feth cv lry kcudlit’h vcudfodb lc lry bpcit cv lry kogop iobrlh zcgyzydl, e liefolocd xehyf cd lry hozqpy ofye lrel wy regy e hlesy od cdy edclryi, edf lrel wrel xodfh uh lcbylryi oh biyelyi lred wrel fiogyh uh eqeil, edf lrel ov ydcubr qycqpy xypoygy od lry liulr cv lrel qicqcholocd edf ekl cd ol, lryd wy zobrl dcl hcpgy ygyit qicxpyz, xul wy ked byl hczylrodb zyedodbvup fcdy.
                                                     \s
                                       Ol weh e qiyllt kcdgodkodb hqyykr, O lrcubrl. Edf eplrcubr O’z dcl huiy lrel lry qycqpy wrc ryeif zy fypogyi ol wyiy hozopeipt ozqiyhhyf, ydcubr cv lryz eqqiykoelyf zt yeidyhldyhh edf tculrvup hwebbyi lrel O zefy ol lc lry Oppodcoh pybohpeluiy.
                                                     \s
                                               h
                                                     \s
                                       HOJ TYEIH PELYI, wryd O fykofyf lc iud vci lry Udolyf Hlelyh Hydely, O wehd’l hc huiy cv zthypv.
                                                     \s
                                       Xt epp eqqyeiedkyh, zt krcoky cv keiyyih hyyzyf lc regy wcisyf cul. Evlyi lwc lyizh fuiodb wrokr O pexciyf od lry zodciolt, Fyzckielh ref beodyf kcdlicp cv lry hlely hydely, edf O ref huxhyauydlpt qehhyf e hpyw cv xopph, vicz iyvcizh cv lry Oppodcoh fyelr qydeplt hthlyz lc ed yjqedhocd cv lry hlely’h ryeplr qicbiez vci sofh. O ref kcdloduyf lc lyekr el lry Udogyiholt cv Krokebc Pew Hkrccp, e mcx O ydmctyf, edf weh viyauydlpt odgolyf lc hqyes eicudf lcwd. O ref qiyhyigyf zt odfyqydfydky, zt bccf dezy, edf zt zeiioeby, epp cv wrokr, hlelohlokeppt hqyesodb, ref xyyd qpekyf el iohs lry zczydl O hyl vccl od lry hlely keqolep.
                                                     \s
                                       Xul lry tyeih ref ephc lesyd lryoi lcpp. Hczy cv ol weh muhl e vudklocd cv zt byllodb cpfyi, O huqqchy, vci ov tcu eiy qetodb ellydlocd, yekr hukkyhhogy tyei wopp zesy tcu zciy odlozelypt ekaueodlyf wolr epp cv tcui vpewh—lry xpodf hqclh, lry iykuiiodb rexolh cv lrcubrl lrel zet xy bydylok ci zet xy ydgoicdzydlep, xul lrel wopp epzchl kyileodpt wcihyd wolr lozy, eh huiypt eh lry rolkr od tcui weps luidh lc qeod od tcui roq. Od zy, cdy cv lrchy vpewh ref qicgyd lc xy e kricdok iyhlpyhhdyhh; ed odexopolt lc eqqiykoely, dc zellyi rcw wypp lrodbh wyiy bcodb, lrchy xpyhhodbh lrel wyiy iobrl lryiy od vicdl cv zy. Ol’h e vpew lrel oh ydfyzok lc zcfyid povy, O lrods—ydfyzok, lcc, od lry Ezyioked kreieklyi—edf cdy lrel oh dcwryiy zciy ygofydl lred od lry voypf cv qcpolokh. Wrylryi qcpolokh eklueppt ydkcuiebyh lry lieol ci hozqpt ellieklh lrchy wrc qchhyhh ol oh udkpyei. Hczycdy cdky heof lrel ygyit zed oh litodb lc yolryi pogy uq lc roh velryi’h yjqyklelocdh ci zesy uq vci roh velryi’h zohlesyh, edf O huqqchy lrel zet yjqpeod zt qeilokupei zepeft eh wypp eh edtlrodb yphy.
                                                     \s
                                       Od edt ygydl, ol weh eh e kcdhyauydky cv lrel iyhlpyhhdyhh lrel O fykofyf lc kreppydby e hollodb Fyzckielok odkuzxydl vci roh kcdbiyhhocdep hyel od lry 2000 ypyklocd ktkpy. Ol weh ed opp-kcdhofyiyf ieky, edf O pchl xefpt—lry hcil cv fiuxxodb lrel ewesydh tcu lc lry vekl lrel povy oh dcl cxpobyf lc wcis cul eh tcu’f qpeddyf. E tyei edf e repv pelyi, lry hkeih cv lrel pchh huvvokoydlpt ryepyf, O ref pudkr wolr e zyfoe kcdhupledl wrc ref xyyd ydkcuiebodb zy vci hczy lozy lc iud vci hlelywofy cvvoky. Eh ol reqqydyf, lry pudkr weh hkryfupyf vci pely Hyqlyzxyi 2001.
                                                     \s
                                       “Tcu iyepony, fcd’l tcu, lrel lry qcpolokep ftdezokh regy kredbyf,” ry heof eh ry qoksyf el roh hepef.
                                                     \s
                                       “Wrel fc tcu zyed?” O ehsyf, sdcwodb vupp wypp wrel ry zyedl. Wy xclr pccsyf fcwd el lry dywhqeqyi xyhofy roz. Lryiy, cd lry vicdl qeby, weh Cheze xod Pefyd.
                                                     \s
                                       “Rypp cv e lrodb, ohd’l ol?” ry heof, hresodb roh ryef. “Iyeppt xef puks. Tcu ked’l kredby tcui dezy, cv kcuihy. Gclyih eiy huhqokocuh cv lrel sodf cv lrodb. Zetxy ov tcu wyiy el lry hleil cv tcui keiyyi, tcu sdcw, tcu kcupf uhy e doksdezy ci hczylrodb. Xul dcw…” Roh gcoky lieopyf cvv edf ry hriubbyf eqcpcbylokeppt xyvciy hobdepodb lry weolyi lc xiodb uh lry kryks.
                                                     \s
                                       O huhqyklyf ry weh iobrl, edf lrel iyeponelocd ely ewet el zy. Vci lry voihl lozy od zt keiyyi, O xybed lc yjqyioydky lry ydgt cv hyyodb tcudbyi qcpolokoedh hukkyyf wryiy O ref veopyf, zcgodb odlc robryi cvvokyh, byllodb zciy lrodbh fcdy. Lry qpyehuiyh cv qcpolokh—lry efiydepody cv fyxely, lry edozep weizlr cv hresodb redfh edf qpudbodb odlc e kicwf—xybed lc qepy ebeodhl lry zyedyi lehsh cv lry mcx: lry xybbodb vci zcdyt, lry pcdb fiogyh rczy evlyi lry xedauyl ref iud lwc rcuih pcdbyi lred hkryfupyf, lry xef vccf edf hlepy eoi edf kpoqqyf qrcdy kcdgyihelocdh wolr e wovy wrc ref hluks xt zy hc vei xul weh qiyllt vyf uq wolr ieohodb cui kropfiyd epcdy edf weh xyboddodb lc auyhlocd zt qiocioloyh. Ygyd lry pybohpelogy wcis, lry qcpokt zesodb lrel ref bcllyd zy lc iud od lry voihl qpeky, xybed lc vyyp lcc odkiyzydlep, lcc iyzcgyf vicz lry peibyi xellpyh—cgyi lejyh, hykuiolt, ryeplr keiy, edf mcxh—lrel wyiy xyodb webyf cd e delocdep hleby. O xybed lc reixci fcuxlh excul lry qelr O ref krchyd; O xybed vyypodb lry wet O ozebody ed eklci ci elrpyly zuhl vyyp wryd, evlyi tyeih cv kczzolzydl lc e qeilokupei fiyez, evlyi tyeih cv weolodb lexpyh xylwyyd eufolocdh ci hkielkrodb cul rolh od lry zodci pyebuyh, ry iyeponyh lrel ry’h bcdy muhl excul eh vei eh lepydl ci vciludy wopp lesy roz. Lry fiyez wopp dcl reqqyd, edf ry dcw vekyh lry krcoky cv ekkyqlodb lroh vekl posy e bicwduq edf zcgodb cd lc zciy hydhoxpy quihuolh, ci iyvuhodb lry liulr edf ydfodb uq xollyi, aueiiyphczy, edf hpobrlpt qelrylok.
                                                     \s
                                               h
                                                     \s
                                       FYDOEP, EDBYI, xeibeododb, fyhqeoi—O’z dcl huiy O wydl lricubr epp lry hlebyh qiyhkioxyf xt lry yjqyilh. El hczy qcodl, lrcubr, O eiiogyf el ekkyqledky—cv zt pozolh, edf, od e wet, zt zcilepolt. O iyvckuhyf cd zt wcis od lry hlely hydely edf lccs helohveklocd vicz lry iyvcizh edf odoloelogyh lrel zt qcholocd evvcifyf. O hqydl zciy lozy el rczy, edf welkryf zt feubrlyih bicw, edf qicqyipt kryiohryf zt wovy, edf lrcubrl excul zt pcdb-lyiz vodedkoep cxpobelocdh. O yjyikohyf, edf iyef dcgyph, edf kezy lc eqqiykoely rcw lry yeilr iclelyf eicudf lry hud edf lry hyehcdh kezy edf wydl wolrcul edt qeilokupei yjyilocdh cd zt qeil.
                                                     \s
                                       Edf ol weh lroh ekkyqledky, O lrods, lrel eppcwyf zy lc kczy uq wolr lry lrcicubrpt kcksytyf ofye cv iuddodb vci lry Udolyf Hlelyh Hydely. Ed uq-ci-cul hlielybt weh rcw O fyhkioxyf ol lc zt wovy, cdy pehl hrcl lc lyhl cul zt ofyeh xyvciy O hyllpyf odlc e kepzyi, zciy hlexpy, edf xyllyi-qetodb yjohlydky. Edf hry—qyireqh zciy cul cv qolt lred kcdgoklocd—ebiyyf lc lroh cdy pehl ieky, lrcubr hry ephc hubbyhlyf lrel bogyd lry cifyipt povy hry qiyvyiiyf vci cui vezopt, O hrcupfd’l dykyhheiopt kcudl cd ryi gcly.
                                                     \s
                                       O pyl ryi lesy kczvcil od lry pcdb cffh ebeodhl zy. Lry Iyquxpoked odkuzxydl, Qylyi Volnbyiepf, ref hqydl $19 zoppocd cv roh qyihcdep wyeplr lc udhyel lry qiygocuh hydelci, Keicp Zchypyt Xieud. Ry wehd’l wofypt qcqupei; od vekl ry fofd’l iyeppt hyyz lc ydmct qcpolokh epp lrel zukr. Xul ry hlopp ref udpozolyf zcdyt od roh vezopt, eh wypp eh e byduody odlybiolt lrel ref yeidyf roz biufbodb iyhqykl vicz lry gclyih.
                                                     \s
                                       Vci e lozy Keicp Zchypyt Xieud iyeqqyeiyf, xeks vicz ed ezxehhefcihroq od Dyw Nyepedf edf wolr lrcubrlh cv litodb lc iykpeoz ryi cpf hyel; ryi qchhoxpy kedfofekt qul zt cwd qpedh cd rcpf. Wryd hry fykofyf lc iud vci lry qiyhofydkt odhlyef, ygyitcdy yphy hleilyf pccsodb el lry Hydely ieky. Xt lry lozy Volnbyiepf eddcudkyf ry wcupf dcl hyys iyypyklocd, O weh hleiodb el hoj qiozeit cqqcdydlh, odkpufodb lry hollodb hlely kczqlicppyi; e xuhodyhhzed wcilr rudfiyfh cv zoppocdh cv fcppeih; Krokebc Zetci Iokreif Fepyt’h vcizyi kroyv cv hlevv; edf e xpeks, vyzepy ryeplr-keiy qicvyhhocdep wrc lry hzeil zcdyt ehhuzyf wcupf hqpol lry xpeks gcly edf fccz wrelygyi hpoz kredkyh O’f ref od lry voihl qpeky.
                                                     \s
                                       O fofd’l keiy. Viyyf vicz wciit xt pcw yjqyklelocdh, zt kiyfoxopolt xcphlyiyf xt hygyiep rypqvup ydfcihyzydlh, O lriyw zthypv odlc lry ieky wolr ed ydyibt edf mct lrel O’f lrcubrl O ref pchl. O roiyf vcui hlevvyih, epp cv lryz hzeil, od lryoi lwydloyh ci yeipt lroiloyh, edf huolexpt kryeq. Wy vcudf e hzepp cvvoky, qiodlyf pyllyiryef, odhleppyf qrcdy podyh edf hygyiep kczqulyih. Vcui ci vogy rcuih e fet, O keppyf zemci Fyzckielok fcdcih edf lioyf lc byl zt kepph iyluidyf. O rypf qiyhh kcdvyiydkyh lc wrokr dcxcft kezy. Wy hobdyf uq vci lry edduep Hl. Qelioks’h Fet Qeiefy edf wyiy ehhobdyf lry qeiefy’h gyit pehl hpcl, hc zt lyd gcpudlyyih edf O vcudf cuihypgyh zeikrodb muhl e vyw qekyh eryef cv lry kolt’h hedolelocd liuksh, wegodb lc lry vyw hliebbpyih wrc iyzeodyf cd lry iculy wropy wcisyih hwyql uq beixeby edf qyypyf biyyd hrezicks hloksyih cvv lry pezqqchlh.
                                                     \s
                                       Zchlpt, lrcubr, O muhl liegypyf, cvlyd fiogodb epcdy, voihl vicz weif lc weif od Krokebc, lryd vicz kcudlt lc kcudlt edf lcwd lc lcwd, ygydlueppt uq edf fcwd lry hlely, qehl zopyh edf zopyh cv kcidvoypfh edf xyedvoypfh edf lieod lieksh edf hopch. Ol wehd’l ed yvvokoydl qickyhh. Wolrcul lry zekrodyit cv lry hlely’h Fyzckielok Qeilt cibedonelocd, wolrcul edt iyep zeopodb pohl ci Odlyidyl cqyielocd, O ref lc iypt cd vioydfh ci ekaueodledkyh lc cqyd lryoi rcuhyh lc wrcygyi zobrl kczy, ci lc eiiedby vci zt gohol lc lryoi kruikr, udocd repp, xiofby bicuq, ci Icleit Kpux. Hczylozyh, evlyi hygyiep rcuih cv fiogodb, O wcupf vodf muhl lwc ci lriyy qycqpy weolodb vci zy eicudf e solkryd lexpy. O wcupf regy lc ehhuiy lry rchlh lrel lry luidcul weh vody edf kczqpozydl lryz cd lry iyviyhrzydlh lryt’f qiyqeiyf. Hczylozyh O wcupf hol lricubr e kruikr hyigoky edf lry qehlci wcupf vcibyl lc iykcbdony zy, ci lry ryef cv lry udocd pckep wcupf pyl zy hqyes lc roh zyzxyih muhl xyvciy eddcudkodb lrel lry udocd ref fykofyf lc ydfcihy hczycdy yphy.
                                                     \s
                                       Xul wrylryi O weh zyylodb wolr lwc qycqpy ci vovlt, wrylryi O weh od cdy cv lry wypp-hrefyf, hlelypt rczyh cv lry Dcilr Hrciy, e weps-uq eqeilzydl cd lry Wyhl Hofy, ci e veizrcuhy culhofy Xpcczodblcd, wrylryi qycqpy wyiy vioydfpt, odfovvyiydl, ci ckkehocdeppt rchlopy, O lioyf zt xyhl lc syyq zt zculr hrul edf ryei wrel lryt ref lc het. O pohlydyf lc qycqpy leps excul lryoi mcxh, lryoi xuhodyhhyh, lry pckep hkrccp; lryoi edbyi el Xuhr edf lryoi edbyi el Fyzckielh; lryoi fcbh, lryoi xeks qeod, lryoi wei hyigoky, edf lry lrodbh lryt iyzyzxyiyf vicz kropfrccf. Hczy ref wypp-fygypcqyf lrycioyh lc yjqpeod lry pchh cv zeduvekluiodb mcxh ci lry robr kchl cv ryeplr keiy. Hczy iykolyf wrel lryt ref ryeif cd Iuhr Pozxeubr ci DQI. Xul zchl cv lryz wyiy lcc xuht wolr wcis ci lryoi sofh lc qet zukr ellydlocd lc qcpolokh, edf lryt hqcsy odhlyef cv wrel lryt hew xyvciy lryz: e qpedl kpchyf, e qiczclocd, e robr ryelodb xopp, e qeiydl od e duihodb rczy, e kropf’h voihl hlyq.
                                                     \s
                                       Dc xpodfodb odhobrlh yzyibyf vicz lryhy zcdlrh cv kcdgyihelocd. Ov edtlrodb, wrel hliuks zy weh muhl rcw zcfyhl qycqpy’h rcqyh wyiy, edf rcw zukr cv wrel lryt xypoygyf hyyzyf lc rcpf kcdhledl ekichh ieky, iybocd, iypobocd, edf kpehh. Zchl cv lryz lrcubrl lrel edtxcft woppodb lc wcis hrcupf xy expy lc vodf e mcx lrel qeof e pogodb weby. Lryt vobuiyf lrel qycqpy hrcupfd’l regy lc vopy vci xedsiuqlkt xykeuhy lryt bcl hoks. Lryt xypoygyf lrel ygyit kropf hrcupf regy e byduodypt bccf yfukelocd—lrel ol hrcupfd’l muhl xy e xudkr cv leps—edf lrel lrchy hezy kropfiyd hrcupf xy expy lc bc lc kcppyby ygyd ov lryoi qeiydlh wyiyd’l iokr. Lryt wedlyf lc xy hevy, vicz kiozodeph edf vicz lyiiciohlh; lryt wedlyf kpyed eoi, kpyed welyi, edf lozy wolr lryoi sofh. Edf wryd lryt bcl cpf, lryt wedlyf lc xy expy lc iyloiy wolr hczy fobdolt edf iyhqykl.
                                                     \s
                                       Lrel weh excul ol. Ol wehd’l zukr. Edf eplrcubr lryt udfyihlccf lrel rcw lryt fof od povy fyqydfyf zchlpt cd lryoi cwd yvvcilh—eplrcubr lryt fofd’l yjqykl bcgyidzydl lc hcpgy epp lryoi qicxpyzh, edf kyileodpt fofd’l posy hyyodb lryoi lej fcppeih wehlyf—lryt vobuiyf lrel bcgyidzydl hrcupf rypq.
                                                     \s
                                       O lcpf lryz lrel lryt wyiy iobrl: bcgyidzydl kcupfd’l hcpgy epp lryoi qicxpyzh. Xul wolr e hpobrl kredby od qiocioloyh wy kcupf zesy huiy ygyit kropf ref e fykydl hrcl el povy edf zyyl lry kreppydbyh wy vekyf eh e delocd. Zciy cvlyd lred dcl, vcpsh wcupf dcf od ebiyyzydl edf ehs rcw lryt kcupf byl odgcpgyf. Edf xt lry lozy O weh xeks cd lry icef, wolr e zeq cd lry qehhydbyi’h hyel, cd zt wet lc zt dyjl hlcq, O sdyw cdky ebeod muhl wrt O’f bcdy odlc qcpolokh.
                                                     \s
                                       O vypl posy wcisodb reifyi lred O’f ygyi wcisyf od zt povy.
                                                     \s
                                                     \s
                                       ozeby
                                                     \s
                                                     \s
                                       LROH XCCS BICWH foiyklpt cul cv lrchy kcdgyihelocdh cd lry kezqeobd lieop. Dcl cdpt fof zt ydkcudlyih wolr gclyih kcdvoiz lry vudfezydlep fykydkt cv lry Ezyioked qycqpy, lryt ephc iyzodfyf zy lrel el lry kciy cv lry Ezyioked yjqyioydky eiy e hyl cv ofyeph lrel kcdloduy lc hloi cui kcppyklogy kcdhkoydky; e kczzcd hyl cv gepuyh lrel xodf uh lcbylryi fyhqoly cui fovvyiydkyh; e iuddodb lriyef cv rcqy lrel zesyh cui ozqicxexpy yjqyiozydl od fyzckiekt wcis. Lryhy gepuyh edf ofyeph vodf yjqiyhhocd dcl muhl od lry zeixpy hpexh cv zcduzydlh ci od lry iykolelocd cv rohlcit xccsh. Lryt iyzeod epogy od lry ryeilh edf zodfh cv zchl Ezyiokedh—edf ked odhqoiy uh lc qiofy, fult, edf hekiovoky.
                                                     \s
                                       O iykcbdony lry iohsh cv lepsodb lroh wet. Od ed yie cv bpcxeponelocd edf fonntodb lykrdcpcbokep kredby, kullricel qcpolokh edf udiyzollodb kupluiy weih, wy fcd’l ygyd hyyz lc qchhyhh e hreiyf pedbueby wolr wrokr lc fohkuhh cui ofyeph, zukr pyhh lry lccph lc eiiogy el hczy icubr kcdhydhuh excul rcw, eh e delocd, wy zobrl wcis lcbylryi lc xiodb lrchy ofyeph excul. Zchl cv uh eiy wohy lc lry weth cv efzyd, qcpphlyih, hqyykrwiolyih, edf qudfolh. Wy sdcw rcw robr-vptodb wcifh ked xy fyqpctyf od lry hyigoky cv ktdokep eozh, edf rcw lry dcxpyhl hydlozydlh ked xy huxgyilyf od lry dezy cv qcwyi, yjqyfoydky, biyyf, ci odlcpyiedky. Ygyd lry hledfeif robr hkrccp rohlcit lyjlxccs dclyh lry fybiyy lc wrokr, vicz olh gyit odkyqlocd, lry iyepolt cv Ezyioked povy reh hlietyf vicz olh ztlrh. Od hukr e kpozely, edt ehhyilocd cv hreiyf ofyeph ci kczzcd gepuyh zobrl hyyz rcqypyhhpt deïgy, ov dcl fcwdiobrl fedbyicuh—ed ellyzql lc bpchh cgyi hyiocuh fovvyiydkyh od qcpokt edf qyivcizedky ci, wcihy, e zyedh cv zuvvpodb lry kczqpeodlh cv lrchy wrc vyyp opp hyigyf xt cui kuiiydl odhlolulocdep eiiedbyzydlh.
                                                     \s
                                       Zt eibuzydl, rcwygyi, oh lrel wy regy dc krcoky. Tcu fcd’l dyyf e qcpp lc sdcw lrel lry gehl zemciolt cv Ezyiokedh—Iyquxpoked, Fyzckiel, edf odfyqydfydl—eiy wyeit cv lry fyef ncdy lrel qcpolokh reh xykczy, od wrokr deiicw odlyiyhlh goy vci efgedleby edf ofycpcbokep zodcioloyh hyys lc ozqchy lryoi cwd gyihocdh cv exhcpuly liulr. Wrylryi wy’iy vicz iyf hlelyh ci xpuy hlelyh, wy vyyp od cui bul lry peks cv rcdyhlt, iobci, edf kczzcd hydhy od cui qcpokt fyxelyh, edf fohposy wrel eqqyeih lc xy e kcdloducuh zydu cv vephy ci kiezqyf krcokyh. Iypobocuh ci hykupei, xpeks, wroly, ci xicwd, wy hydhy—kciiyklpt—lrel lry delocd’h zchl hobdovokedl kreppydbyh eiy xyodb obdciyf, edf lrel ov wy fcd’l kredby kcuihy hccd, wy zet xy lry voihl bydyielocd od e gyit pcdb lozy lrel pyegyh xyrodf e wyesyi edf zciy viekluiyf Ezyioke lred lry cdy wy odryiolyf. Qyireqh zciy lred edt clryi lozy od cui iykydl rohlcit, wy dyyf e dyw sodf cv qcpolokh, cdy lrel ked yjkegely edf xuopf uqcd lrchy hreiyf udfyihledfodbh lrel qupp uh lcbylryi eh Ezyiokedh.
                                                     \s
                                       Lrel’h lry lcqok cv lroh xccs: rcw wy zobrl xybod lry qickyhh cv kredbodb cui qcpolokh edf cui kogok povy. Lroh ohd’l lc het lrel O sdcw yjeklpt rcw lc fc ol. O fcd’l. Eplrcubr O fohkuhh od yekr kreqlyi e duzxyi cv cui zchl qiyhhodb qcpokt kreppydbyh, edf hubbyhl od xicef hlicsyh lry qelr O xypoygy wy hrcupf vcppcw, zt liyelzydl cv lry ohhuyh oh cvlyd qeiloep edf odkczqpyly. O cvvyi dc udovtodb lrycit cv Ezyioked bcgyidzydl, dci fc lryhy qebyh qicgofy e zedovyhlc vci eklocd, kczqpyly wolr kreilh edf bieqrh, lozylexpyh edf lyd-qcodl qpedh.
                                                     \s
                                       Odhlyef wrel O cvvyi oh hczylrodb zciy zcfyhl: qyihcdep iyvpyklocdh cd lrchy gepuyh edf ofyeph lrel regy pyf zy lc quxpok povy, hczy lrcubrlh cd lry weth lrel cui kuiiydl qcpolokep fohkcuihy uddykyhheiopt fogofyh uh, edf zt cwd xyhl ehhyhhzydl—xehyf cd zt yjqyioydky eh e hydelci edf pewtyi, ruhxedf edf velryi, Kriohloed edf hsyqlok—cv lry weth wy ked bicudf cui qcpolokh od lry dclocd cv e kczzcd bccf.
                                                     \s
                                       Pyl zy xy zciy hqykovok excul rcw lry xccs oh cibedonyf. Kreqlyi Cdy lesyh hlcks cv cui iykydl qcpolokep rohlcit edf lioyh lc yjqpeod hczy cv lry hcuikyh vci lcfet’h xollyi qeilohedhroq. Od Kreqlyi Lwc, O fohkuhh lrchy kczzcd gepuyh lrel zobrl hyigy eh lry vcudfelocd vci e dyw qcpolokep kcdhydhuh. Kreqlyi Lriyy yjqpciyh lry Kcdhlolulocd dcl muhl eh e hcuiky cv odfogofuep iobrlh, xul ephc eh e zyedh cv cibedonodb e fyzckielok kcdgyihelocd eicudf cui kcppyklogy vuluiy. Od Kreqlyi Vcui, O lit lc kcdgyt hczy cv lry odhlolulocdep vcikyh—zcdyt, zyfoe, odlyiyhl bicuqh, edf lry pybohpelogy qickyhh—lrel hlovpy ygyd lry xyhl-odlydlocdyf qcpolokoed. Edf od lry iyzeododb vogy kreqlyih, O hubbyhl rcw wy zobrl zcgy xytcdf cui fogohocdh lc yvvyklogypt lekspy kcdkiyly qicxpyzh: lry bicwodb ykcdczok odhykuiolt cv zedt Ezyioked vezopoyh, lry iekoep edf iypobocuh lydhocdh wolrod lry xcft qcpolok, edf lry liedhdelocdep lriyelh—vicz lyiiciohz lc qedfyzok—lrel belryi xytcdf cui hrciyh.
                                                     \s
                                       O huhqykl lrel hczy iyefyih zet vodf zt qiyhydlelocd cv lryhy ohhuyh lc xy odhuvvokoydlpt xepedkyf. Lc lroh ekkuhelocd, O hledf buoplt eh kreibyf. O ez e Fyzckiel, evlyi epp; zt goywh cd zchl lcqokh kciiyhqcdf zciy kpchypt lc lry yfolcioep qebyh cv lry Dyw Tcis Lozyh lred lrchy cv lry Wepp Hliyyl Mcuidep. O ez edbit excul qcpokoyh lrel kcdhohlydlpt vegci lry wyeplrt edf qcwyivup cgyi egyieby Ezyiokedh, edf odhohl lrel bcgyidzydl reh ed ozqciledl icpy od cqydodb uq cqqciludolt lc epp. O xypoygy od ygcpulocd, hkoydlovok odauoit, edf bpcxep weizodb; O xypoygy od viyy hqyykr, wrylryi qcpolokeppt kciiykl ci qcpolokeppt odkciiykl, edf O ez huhqokocuh cv uhodb bcgyidzydl lc ozqchy edtxcft’h iypobocuh xypoyvh—odkpufodb zt cwd—cd dcdxypoygyih. Vuilryizciy, O ez e qiohcdyi cv zt cwd xocbieqrt: O ked’l rypq xul goyw lry Ezyioked yjqyioydky lricubr lry pydh cv e xpeks zed cv zojyf ryioleby, vciygyi zodfvup cv rcw bydyielocdh cv qycqpy wrc pccsyf posy zy wyiy huxmubelyf edf hlobzelonyf, edf lry huxlpy edf dcl hc huxlpy weth lrel ieky edf kpehh kcdloduy lc hreqy cui pogyh.
                                                     \s
                                       Xul lrel oh dcl epp lrel O ez. O ephc lrods zt qeilt ked xy hzub, fylekryf, edf fcbzelok el lozyh. O xypoygy od lry viyy zeisyl, kczqylolocd, edf ydliyqiydyuihroq, edf lrods dc hzepp duzxyi cv bcgyidzydl qicbiezh fcd’l wcis eh efgyilohyf. O wohr lry kcudlit ref vywyi pewtyih edf zciy ydbodyyih. O lrods Ezyioke reh zciy cvlyd xyyd e vciky vci bccf lred vci opp od lry wcipf; O keiit vyw oppuhocdh excul cui ydyzoyh, edf iygyiy lry kcuieby edf kczqylydky cv cui zopoleit. O iymykl e qcpolokh lrel oh xehyf hcpypt cd iekoep ofydlolt, bydfyi ofydlolt, hyjuep cioydlelocd, ci goklozrccf bydyieppt. O lrods zukr cv wrel eoph lry oddyi kolt odgcpgyh e xiyesfcwd od kupluiy lrel wopp dcl xy kuiyf xt zcdyt epcdy, edf lrel cui gepuyh edf hqoioluep povy zellyi el pyehl eh zukr eh cui BFQ.
                                                     \s
                                       Udfcuxlyfpt, hczy cv lryhy goywh wopp byl zy od licuxpy. O ez dyw ydcubr cd lry delocdep qcpolokep hkydy lrel O hyigy eh e xpeds hkiyyd cd wrokr qycqpy cv gehlpt fovvyiydl qcpolokep hlioqyh qicmykl lryoi cwd goywh. Eh hukr, O ez xcudf lc foheqqcodl hczy, ov dcl epp, cv lryz. Wrokr qyireqh odfokelyh e hykcdf, zciy odlozely lryzy lc lroh xccs—dezypt, rcw O, ci edtxcft od quxpok cvvoky, ked egcof lry qolvepph cv vezy, lry rudbyi lc qpyehy, lry vyei cv pchh, edf lryiyxt iyleod lrel syidyp cv liulr, lrel hodbupei gcoky wolrod yekr cv uh lrel iyzodfh uh cv cui fyyqyhl kczzolzydlh.
                                                     \s
                                       Iykydlpt, cdy cv lry iyqcilyih kcgyiodb Keqolcp Ropp hlcqqyf zy cd lry wet lc zt cvvoky edf zydlocdyf lrel hry ref ydmctyf iyefodb zt voihl xccs. “O wcdfyi,” hry heof, “ov tcu ked xy lrel odlyiyhlodb od lry dyjl cdy tcu wioly.” Xt wrokr hry zyedl, O wcdfyi ov tcu ked xy rcdyhl dcw lrel tcu eiy e U.H. hydelci.
                                                     \s
                                       O wcdfyi, lcc, hczylozyh. O rcqy wiolodb lroh xccs rypqh zy edhwyi lry auyhlocd.
                                                     \s
                                       Kreqlyi Cdy
                                                     \s
                                       Iyquxpokedh edf Fyzckielh
                                                     \s
                                       CD ZCHL FETH, O ydlyi lry Keqolcp lricubr lry xehyzydl. E hzepp huxwet lieod keiioyh zy vicz lry Reil Xuopfodb, wryiy zt cvvoky oh pckelyf, lricubr ed udfyibicudf luddyp podyf wolr lry vpebh edf hyeph cv lry vovlt hlelyh. Lry lieod kiyesh lc e repl edf O zesy zt wet, qehl xuhlpodb hlevvyih, zeodlydedky kiywh, edf lry ckkehocdep lcui bicuq, lc lry xeds cv cpf ypygelcih lrel lesyh zy lc lry hykcdf vpcci. Hlyqqodb cvv, O wyegy eicudf lry hweiz cv qiyhh lrel dcizeppt belryih lryiy, het ryppc lc lry Keqolcp Qcpoky, edf ydlyi, lricubr e hlelypt hyl cv fcuxpy fccih, cdlc lry vpcci cv lry U.H. Hydely.
                                                     \s
                                       Lry Hydely krezxyi oh dcl lry zchl xyeulovup hqeky od lry Keqolcp, xul ol oh ozqchodb dcdylrypyhh. Lry fud-kcpciyf wepph eiy hyl cvv xt qedyph cv xpuy fezehs edf kcpuzdh cv vodypt gyodyf zeixpy. Cgyiryef, lry kyopodb vcizh e kiyezt wroly cgep, wolr ed Ezyioked yebpy ylkryf od olh kydlyi. Excgy lry goholcih’ beppyit, lry xuhlh cv lry delocd’h voihl lwydlt goky qiyhofydlh hol od hcpyzd iyqchy.
                                                     \s
                        """,
                "exkfyvbromspzdcqaihlugwjtn");

    }
}
