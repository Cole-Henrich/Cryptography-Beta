package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class VigenereStatisticsAttacker {
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
    private boolean isSolved;
    private String solved;
    private String keyWord;
    private int[] shifts;
    private static final CharSet charSet = new CharSet(1);
    private final int[] etaoArray = charSet.getEtaoArray();
    private final char[] alphabet = charSet.getAlphabet();
    private char[] keyWordArray;
    public static final CifrarioVigenere UnCifrarioTest =  new CifrarioVigenere("""
            Hipkezoen Knmey, Oqbmetl Siyaia tnj arbfrks ut gwi Nkmkr Sdvpxs, lsyasj Tmkfvreal, fgavac ngd lfvtrql ol hudwr mhgh jt pblt zvvh hnr: Moqutpyx atr V pvr wekdyn lhfbrsq is ox wohu nsh.

                                Ximvg Hicmesprgw utvk qbbi ngd mcat. Rrtrrm 3,000 qpcf aabs cpwfxd -- gzzdwg hnk tbg invh ut gwsfx tgyrc jehm ag. Ojx ah tafaxrt hf zvr hinlotg ppr qbmobvhl gae vovc eaw tns ydwf hf zvni hnr. Nu dnhwnze ut gxqr tnj bb seed sqwrh gng ebse syye tns zteabnm cs ilvl muarcx.

                                Fh ot huxw fhlkaa sel, tt zvvh wnvrkr udye, hnis zdvr pe vohhi. Bgck abgi jx pxol -- pw n gazwbc eaw ay o ctscee; ob pxxl ltxsriw jaexs bjv gpo zcjtvf pexs gjvaxd zc nhlrl atr qjwg; bn g ehxig yikzq llrke g dyprr yerz sgsz mhk gxn; eaw hkfr, llrke g gvckyx szcat ss mhog ojmywitu vh wgblr pypgxxnkr on xux fofrh.

                                Ar kesszqie pizv etzrketqr ilr eibsf li yhsz. Kr ginw tnsvg rnfey. Kr evrls zvrxv caozcf is bnr nsngxf. Tnj ca ilvl dgm gweg faxyf ilrbr jsnil, jx rkqnap gae hsnjxl tnj arprvgg ut gwivk lojrh; qrg atr jdqrg atr pwmywrkb bu iixre qbase tnj sitvl vrksq, uvbf aifbhw bnr togxsa tnj tedq zhrk hupr 100 bmhkff. Ilrr wkfr xrahckbg. Weefitu ad sax, tnsl liam ahchi xuxix rnxpl eibsf. Vsax it o udvebbrs vcwgtnz, hutc ahw "jkrap vg tns Udyfx ol hut Pbkd lcetzrk."

                                Wk vbcse tlr hudwr phu unki gaeof yxzrl su hupx bmhkff bmtat rwit, eaw arz gwi fnrbwidvf phu pnixyxd hiecw ngd cchchf tnj vratrw egqu dxuxr xsojmyw tnsvg pvoey; arc eaw wuarc auh ggjr amsx tu hupx zhsz gvbtyx ol fhaif: B as al qvbmhkf'f ziriex; W nb ql liyhrg'w xxevse.

                                Li cty zfvqygx tu hut wrkvoqr dj n gec urciettoca -- nshgg Gargmptny fnxwrw it o gxqr hf vsnri ngd vzrcxl phu gnl xuxix bnimbg it wgh lbnr ut atiq tnj gnxh, "V vhucft xb lexjr"; "X avel jc zn tnkt." Gbq drpx mufr li tkikjr. Use roa oas cbnr lozxpvxs, tc jdvql cgb rpwr mhk opwi by yuie winkt. Tc qtiql cgb sxpy mhk szexl ilgqrh ma roaf udqrl. Bah bc xubs jol prq tlr hupx shlrcj, nsh fae tvch fhlgqr xr gae sszdvl hf zvbhi lhu rcith, ngd qbbl xutt ech weix tns hciawitu fjtchrz cs ilr Tmkfvrea ieudyt.

                                Wpkivhhgi gxaivrh yf t hgfq ivhmh. Zvr bshgtgwah qnr fgzy prq mhk sngxu fae uvki jty; zvr uprlh gbq ilr aegfg bel yaoz. Ojx nytkf nap bnr yisuiebnm, Ubs eaw gxopt avel "xsfisex yui nch ztkk mbj wgkotu, sxvz tnj ggteqyayh." Fd mg bs -- yc vi lnl bksa use mhkgr uezblosf. Hs vm magg qi shr uie cegbot.

                                Zri yf ketsj dye keycyki nzaobfi xuhsk kud trkpkhepxrw tnwf qeeuaxwp pgg tnj kud tyht gunxrfm uy ggxpy. Bn jsstrfx ol chg rnmiub jt avel tsitv jtvkf; vc thksawg dj ne Qgsqp eaw izg rmxexmogg ppybey, kr lmye nkjrg jnetkf.

                                Ytx hl rkbrl shk cuazxxzxnz hb ppy mhugr llb lexjr xr bnr jsstrfx -- oaf pdyetgkchh qrg atr jdqrg it iaxjbkm gbq ilrbr lozxpvxs gbq ppy mhugr llb iruhrrx hl hkfr px uhmk. Avchsnl zvni xux wufx dj ckozspimaz Assexgn bs tsitv sbnoguth, jx wozy ss roexmgwmaz it chg tbpex hb ziri Assexgn lals.

                                Ytx hl rkbrl xux txir htvkiz cs ilnm dgm. Adx gae nizpr ptpgqvic shr kjva, fhm tns ujqng cgdnrmgr fuf tdsq. Goz hut hrlixs gd hrltxcl, qyg mhk wzeyyle zc fpzr, tnj hb hieoe, gbq is onirr. Bc xubs lwehx Attocapp Qty ut Ftvibck oas Vrfespeprpx, wk qnc whfmub bcgr foxs gweg hrjwapvl zouratwf hf Gargmpt -- tu grgzr hux qbbqhgizwrh, xb ltxsavxuxn uie rshgtxm, nch gh bkhgtv bnr cceah.

                                Zhsz cs ppy, hn g rnn auxn uhutvf loauui xb lav chg gbgforrcgr, eez if giaxw uie rszfot dhgtble. Rsg jw exmkaotv uhw cs ppqr momsgwie ts ubr cegbot, of drr ieudyt, ef Tmkfvreal, utwgth aht ubyn ma hux uexis, uuz wa dye keycyki gh szoas avmh ubr prbmhkf, gd wgtnj ic use mhk qbjrgky cs nap yhvk.

                                Huxw zty hs gwi tkeghrhx yxsyca dj gaiy rnn, xux szfbckrlt xsojor mo zvbhi jao ghgpgxxd ag, gwi ubgnsfi xebbahr is gaoys gporg fxcz jw -- gaaz ghrl fxnys bu thkpugr cirw nuh ot e seekhvck zhmkbg. Xx ptn hs n aefmitu ixvgne.

                                Lce ilehumv gwivk ocb yxzrl -- atr gwvbngn mbj, xux lujrs saxs zvni xuxy rssi fraitr -- gwi zxn gbq lszxn cvb asfm tnsvg pvoey svvlg regff pkb mojol ainoe g zrvepr tnog hxvel yvvcif urouuipl bn zvr seednkgf, prq mhgh pppyl ot oya ss ns zc ot wgkotu nch sbrs oas yabtkr. Gweg bs uie reyeitu gdhnr atr vc eye tns Fttgxmhseh wgblr hb rszx.

                                Mgm Tdh oeeyg ldy ngd iczusem yui. Nch zty Mcq qprls zvr Jrvmej Ggpxrl ol Oztvvva.""", "pentagon");

    public VigenereStatisticsAttacker(String cipher, int likelyKeyLength) throws InterruptedException {
        System.err.println("new Vigenere Statistics Attacker");
        keyWord = "";
        keyWordArray = new char[likelyKeyLength];
        //green temp comment out System.out.println(cipher);
        String[] slices = slice(cipher, likelyKeyLength);
        //green temp comment out System.out.println(Arrays.toString(slices));
        for (int i = 0; i < slices.length; i++) {
//            System.out.println("started slice "+i);
            String slice = slices[i].toLowerCase();
            String sliceCopy = slice;
//            for (int j = 0; j < etaoArray.length; j++) {
            for (int j = 0; j < 26; j++) {
                String transposed = CaesarCracker.transpose(sliceCopy, j/*etaoArray[j]*/);
                HashMap<Character, Integer> counts = charSet.HashMapCountFrequencyIn(transposed);
                ArrayList<SortableV6> sorted = new ArrayList<>();
                ArrayList<SortableV6> finalSorted = sorted;
                counts.forEach((Char, Count) -> {
                    finalSorted.add(new SortableV6(Char, Count));
                });
                sorted = SortableV6.MOST_TO_LEAST_TOP_X(finalSorted, 8);
//                List<SortableV6> backwards = SortableV6.LEAST_TO_MOST(finalSorted).subList(0, 9);
                //green temp comment out System.out.println("___________________");
                //green temp comment out System.out.println(transposed);
//                for (SortableV6 s : sorted) {
//                    //green temp comment out System.out.println(s.getChar() + " " + s.getOccurrences());
//                }

//                int uncommonFoundLate = 0;
//                for (SortableV6 sv6 : backwards) {
//                    char c = sv6.getChar();
//                    if (c == 'q') uncommonFoundLate++;
//                    if (c == 'z') uncommonFoundLate++;
//                    if (c == 'x') uncommonFoundLate++;
//                    if (c == 'j') uncommonFoundLate++;
//                    if (c == 'k') uncommonFoundLate++;
//                    if (c == 'v') uncommonFoundLate++;
//                    if (c == 'b') uncommonFoundLate++;
//                    if (c == 'p') uncommonFoundLate++;
//                    if (c == 'y') uncommonFoundLate++;
//                    if (uncommonFoundLate > 3) break;
//                }
                int commonFoundEarly = 0;
                for (SortableV6 sv6 : sorted) {
                    char c = sv6.getChar();
                    if (c == 'e') commonFoundEarly++;
                    if (c == 't') commonFoundEarly++;
                    if (c == 'a') commonFoundEarly++;
                    if (c == 'o') commonFoundEarly++;
                    if (c == 'n') commonFoundEarly++;
                    if (c == 'i') commonFoundEarly++;
                    if (c == 's') commonFoundEarly++;
                    if (c == 'h') commonFoundEarly++;
                    if (c == 'r') commonFoundEarly++;
                    if (commonFoundEarly > 5) break;
                }
                boolean valid = (commonFoundEarly > 5 /*&& uncommonFoundLate > 3*/);
                if (valid) {
//                    System.out.println(j);
//                    System.out.println(Arrays.toString(etaoArray));
//                    StringBuilder sb2 = new StringBuilder();
//                    for (int Int : etaoArray) {
//                        sb2.append(charSet.getAlphabet()[Int]).append(",\s");
//                    }
//                    System.out.println(sb2.toString());
//                    System.out.println(etaoArray[j]);
                    char charFound = charSet.getAlphabet()[(26-j)%26/*etaoArray[j]*/];
                    keyWordArray[i] = charFound;
                    //green temp comment out System.out.println("***");
                    //green temp comment out System.out.println(charFound);
                }
                //}
            }
//            System.out.println("finished slice "+i);
        }
//        boolean missingParts = false;
//        ArrayList<Integer> missingIndices = new ArrayList<>();
//        for (int i = 0; i < keyWordArray.length; i++) {
//            char c = keyWordArray[i];
//            if (c == '\u0000') {
//                missingParts = true;
//                missingIndices.add(i);
//            }
//        }
        //if (!missingParts) {
            keyWord = charSet.buildStringFromCharArray(keyWordArray);
            VigenereKeyPhrase vkf = new VigenereKeyPhrase(keyWord, cipher.length());
            VigenereDeciphered vdc = new VigenereDeciphered(cipher, vkf.get());
            solved = vdc.get();
            isSolved = true;
        //}
//        else {
//            boolean Break = false;
//            for (int i = 0; i < missingIndices.size(); i++) {
//                for (int j = 0; j < alphabet.length; j++) {
//                    keyWordArray[missingIndices.get(i)] = alphabet[j];
//                    if (missingIndices.size() > 1) {
//                        for (int k = i; k < missingIndices.size(); k++) {
//                            for (int l = 0; l < alphabet.length; l++) {
//                                keyWordArray[missingIndices.get(k)] = alphabet[l];
//                                if (missingIndices.size() > 2) {
//                                    for (int m = k; m < missingIndices.size(); m++) {
//                                        for (int n = 0; n < alphabet.length; n++) {
//                                            keyWordArray[missingIndices.get(m)] = alphabet[n];
//                                            if (missingIndices.size() > 3){
//                                                for (int o = m; o < missingIndices.size(); o++) {
//                                                    for (int p = 0; p < alphabet.length; p++) {
//                                                        keyWordArray[missingIndices.get(o)] = alphabet[p];
//                                                        if (missingIndices.size() == 5) {
//                                                            for (int q = o; q < missingIndices.size(); q++) {
//                                                                for (int r = 0; r < alphabet.length; r++) {
//                                                                    keyWordArray[missingIndices.get(q)] = alphabet[r];
//                                                                    keyWord = charSet.buildStringFromCharArray(keyWordArray);
//                                                                    VigenereKeyPhrase vkf = new VigenereKeyPhrase(keyWord, cipher.length());
//                                                                    VigenereDeciphered vdc = new VigenereDeciphered(cipher, vkf.get());
//                                                                    not_english m1 = new not_english(vdc.get());
//                                                                    if (!m1.not_english()) {
//                                                                        solved = vdc.get();
//                                                                        isSolved = true;
//                                                                        Break = true;
//                                                                        break;
//                                                                    }
//                                                                }
//                                                                if (Break){break;}
//                                                            }
//                                                        }
//                                                        else {
//                                                            keyWord = charSet.buildStringFromCharArray(keyWordArray);
//                                                            VigenereKeyPhrase vkf = new VigenereKeyPhrase(keyWord, cipher.length());
//                                                            VigenereDeciphered vdc = new VigenereDeciphered(cipher, vkf.get());
//                                                            not_english m1 = new not_english(vdc.get());
//                                                            if (!m1.not_english()) {
//                                                                solved = vdc.get();
//                                                                isSolved = true;
//                                                                Break = true;
//                                                                break;
//                                                            }
//                                                        }
//                                                        if (Break) {break;}
//                                                    }
//                                                    if (Break) {break;}
//                                                }
//                                            }
//                                            else {
//                                                keyWord = charSet.buildStringFromCharArray(keyWordArray);
//                                                VigenereKeyPhrase vkf = new VigenereKeyPhrase(keyWord, cipher.length());
//                                                VigenereDeciphered vdc = new VigenereDeciphered(cipher, vkf.get());
//                                                not_english m1 = new not_english(vdc.get());
//                                                if (!m1.not_english()) {
//                                                    solved = vdc.get();
//                                                    isSolved = true;
//                                                    Break = true;
//                                                    break;
//                                                }
//                                            }
//                                            if (Break) {break;}
//                                        }
//                                        if (Break) {break;}
//                                    }
//                                }
//                                else {
//                                    keyWord = charSet.buildStringFromCharArray(keyWordArray);
//                                    VigenereKeyPhrase vkf = new VigenereKeyPhrase(keyWord, cipher.length());
//                                    VigenereDeciphered vdc = new VigenereDeciphered(cipher, vkf.get());
//                                    not_english m1 = new not_english(vdc.get());
//                                    if (!m1.not_english()) {
//                                        solved = vdc.get();
//                                        isSolved = true;
//                                        Break = true;
//                                        break;
//                                    }
//                                }
//                                if (Break) {break;}
//                            }
//                            if (Break) {break;}
//                        }
//                    }
//                    else {
//                        keyWord = charSet.buildStringFromCharArray(keyWordArray);
//                        VigenereKeyPhrase vkf = new VigenereKeyPhrase(keyWord, cipher.length());
//                        VigenereDeciphered vdc = new VigenereDeciphered(cipher, vkf.get());
//                        not_english m1 = new not_english(vdc.get());
//                        if (!m1.not_english()) {
//                            solved = vdc.get();
//                            isSolved = true;
//                            Break = true;
//                            break;
//                        }
//                    }
//                    if (Break) {break;}
//                }
//                if (Break) {break;}
//            }
//        }
    }
    public static String[] slice(String string, int numSlices){
//        0 6 12 18
//        1 7
        string = charSet.RemoveIgnorers(string.toLowerCase());
        String[] slices = new String[numSlices];
        for (int i = 0; i < slices.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; numSlices*j+i<string.length(); j++) {
                sb.append(string.charAt((numSlices*j)+i));
            }
            slices[i] = sb.toString();
        }
        return slices;
    }
//        System.out.println(cipher+"\n\n\n");
//        shifts = new int[likelyKeyLength];
//        String ciph = cipher.toLowerCase().replaceAll(" ", "");
//        System.out.println(ciph+"\n\n\n");
//        String[] slices = new String[likelyKeyLength];
//        int sliceNumber = 0;
//        char[] ciphArray = ciph.toCharArray();
//        System.out.println(Arrays.toString(ciphArray) +"\n\n\n");
//        for (int i = 0; i < ciphArray.length; i++) {
//            char c = ciphArray[i];
//            slices[i % likelyKeyLength] += c;
//        }
//        System.out.println(Arrays.toString(slices) +"\n\n\n");
//            ArrayList<HashMap<Character, Integer>> AllCharsAndOccurrences = new ArrayList<>();
//        for (int shift = 1; shift < 26; shift++) {
//            for (int i = 0; i < likelyKeyLength; i++) {
//                HashMap<Character, Integer> CharacterAndOccurrences = new HashMap<>();
//                String slice = slices[i];
//                StringBuilder sb = new StringBuilder();
//                for (int j = 0; j < slice.length(); j++) {
//                    sb.append(CaesarCracker.transpositionOf(slice.charAt(j), shift));
//                }
//                slice = sb.toString();
//                for (int j = 0; j < slice.length(); j++) {
//                    Integer count = CharacterAndOccurrences.get(slice.charAt(i));
//                    if (count == null) {
//                        CharacterAndOccurrences.put(slice.charAt(i), 1);
//                    } else {
//                        CharacterAndOccurrences.put(slice.charAt(i), count + 1);
//                    }
//                }
//                AllCharsAndOccurrences.add(CharacterAndOccurrences);
//            }
//            for (int j = 0; j < AllCharsAndOccurrences.size(); j++) {
//                HashMap<Character, Integer> hash = AllCharsAndOccurrences.get(j);
//                ArrayList<SortableV6> sortables = new ArrayList<>();
//                ArrayList<SortableV6> finalSortables = sortables;
//                hash.forEach((character, occurrences) -> {
//                    finalSortables.add(new SortableV6(character, occurrences));
//                });
//                sortables = SortableV6.MOST_TO_LEAST_TOP_X(finalSortables, 7);
//                HashMap<Character, Integer> topX = new HashMap<>();
//                for (SortableV6 sortable : sortables) {
//                    topX.put(sortable.getChar(), sortable.getOccurrences());
//                }
//                int commonCount = 0;
//                if (topX.containsKey('e')) {commonCount++;}
//                if (topX.containsKey('t')) {commonCount++;}
//                if (topX.containsKey('a')) {commonCount++;}
//                if (topX.containsKey('o')) {commonCount++;}
//                if (topX.containsKey('n')) {commonCount++;}
//                if (topX.containsKey('i')) {commonCount++;}
//                if (topX.containsKey('s')) {commonCount++;}
//                if (commonCount >= 4) {
//                    shifts[j] = shift;
//                }
//            }
//        }
//        StringBuilder keyBuilder = new StringBuilder();
//        for (int shift : shifts) {
//            keyBuilder.append(charSet.getAlphabet()[shift]);
//        }
//        keyWord = keyBuilder.toString();
//        VigenereKeyPhrase vkf = new VigenereKeyPhrase(keyWord, cipher.length());
//        VigenereDeciphered vdc = new VigenereDeciphered(cipher, vkf.get());
//        solved = vdc.get();
//        CharSet charSet = new CharSet();
//        int[][] frequencies = new int[likelyKeyLength][];
//        String[][] slices = new String[likelyKeyLength][];
//        for (int i = 0; i < cipher.length(); i++) {
//            slices[i%likelyKeyLength][(int) Math.floor((double)i/(double)likelyKeyLength)] = String.valueOf(cipher.charAt(i));
//        }
//        for (int i = 0; i < likelyKeyLength; i++) {
//            frequencies[i] = new int[]{26};
//            for (int j = 0; j < slices[i].length; j++) {
//                int index = charSet.indexOf(slices[i][j].charAt(0));
//                frequencies[i][index] += 1;
//            }
//            for (int j = 0; j < 26; j++) {
//                frequencies[i][j] = frequencies[i][j] / slices[i].length;
//            }
//        }
//        String[] key = new String[likelyKeyLength];
//        Arrays.fill(key, "A");
//        for (int i = 0; i < likelyKeyLength; i++) {
//            for (int j = 0; j < 26; j++) {
//                //String Slices
//                //A "slice" in Python is powerful way of referring to sub-parts of a string.
//                // The syntax is s[i:j] meaning the substring starting at index i, running up to but not including index j.
//
//                int testtable = 0;
//                for (int k = j; k < frequencies[i].length; k++) {
//                    testtable+=frequencies[i][k];
//                }
//                for (int k = 0; k < j; k++) {
//                    testtable+=frequencies[i][k];
//                }
//                if (charSet.cosangle(monofrequencies, testtable) > 0.9){
//                    key[i] = String.valueOf(charSet.getAlphabet()[j]);
//                }
//            }
//        }
//        plaintext = decrypt(ciphertext,key)
//        frequencies = []
//        for i in range(period):
//        frequencies.append([0]*26)
//        for j in range(len(slices[i])):
//        frequencies[i][ALPHABET.index(slices[i][j])] += 1
//        for j in range(26):
//        frequencies[i][j] = frequencies[i][j] / len(slices[i])
//        key = ['A']*period
//        for i in range(period):
//        for j in range(26):
//        testtable = frequencies[i][j:]+frequencies[i][:j]
//        if cosangle(monofrequencies,testtable) > 0.9:
//        key[i] = ALPHABET[j]
//        plaintext = decrypt(ciphertext,key)
  //  }
    public boolean isSolved() {
        return isSolved;
    }
    public String getSolved() {
        return solved;
    }
    public String getKeyWord() {
        return keyWord;
    }

    public static void main(String[] args) throws InterruptedException {
        Time time = new Time();
//        System.out.println(Arrays.toString(slice("Hello World! This is a Vigenere Cipher", "code".length())));
        VigenereStatisticsAttacker vsa0 = new VigenereStatisticsAttacker(UnCifrarioTest.getCipher(), UnCifrarioTest.getKey().length());
        System.out.println(vsa0.getKeyWord());
        System.out.println(vsa0.getSolved());
//        VigenereStatisticsAttacker vsa1 = new VigenereStatisticsAttacker("                Vhp kch (Hewqu qctfa) kg c dzuggvin arseipa qt umltn qcryqxctofa ooomlt.[1][2] Kh ks epg cplj lqagseqeoveo arseipa kb vhp ncaklj Ngzkdlm cbf id whhgn cmhstrpl vc cs epg rqmpavwe clb vc fidbkbiutaj wv fcwo hje hqnr oexjgfu oq bjs haxqnm.[4] C clb eop etbjst bp i jcwsp kch, c flzo qct zz c tgrlt eov; tsm novtpz topgpa hfgewg cbf agwkru hfucb eoybcqv.[5] Dzuggvin kchu acm xonupl dm juxipg hoc kqarayqqbuhtx cbf tsmkf cbttkha tz skzn rzlgbvs. Ljqiv 60 clb dfgeoa cfg rpkqupikmf pa vlzkcws niv fggtavfked.[6]\n", "calico".length());
//        System.out.println(vsa1.getKeyWord());
//        System.out.println(vsa1.getSolved());
        time.end();
        time.println();
    }

    private static void runTestsToFindIsETAO_or_NonETAO_Better() throws InterruptedException {
        Time overallTime = new Time();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1010; i++) {
            Time time = new Time();
            VigenereStatisticsAttacker vsa0 = new VigenereStatisticsAttacker(UnCifrarioTest.getCipher(), UnCifrarioTest.getKey().length());
            time.end();
//            System.out.println(vsa0.getKeyWord());
//            System.out.println(vsa0.getSolved());
            if (i > 9) {
                sb.append((double) time.getDuration() / 1000000000.0).append("\n");
            }
        }
        System.out.println(sb.toString());
        overallTime.end();
        overallTime.println();
    }

}
