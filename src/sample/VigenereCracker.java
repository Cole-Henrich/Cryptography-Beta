package sample;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VigenereCracker {
    private boolean isSolved;
    private String solved;
    private String keyWord;
    private final CharSet charSet = new CharSet();
    private int likelyMinLength;
    private int likelyKeyLength;
    private int likelyMaxLength;
    private final char[] alphabet = charSet.getAlphabet();
    private String cipher;
    public final double[][] IndexOfCoincidenceVSKeyWordEstimationTable = {
            {1,0.0660},
            {2,0.0520},
            {3,0.0473},
            {4,0.0449},
            {5,0.0435},
            {6,0.0426},
            {7,0.0419},
            {8,0.0414},
            {9,0.0410},
            {10,0.0407},
            {Double.MAX_VALUE, 0.0388}
    };

    public VigenereCracker(String Cipher) throws FileNotFoundException, InterruptedException {
        this.cipher = Cipher;
        int a = calculateLengthViaKasiski(cipher);
        int b = calculateLengthViaKasiski(charSet.RemoveIgnorers(cipher));
        int c = calculateLengthViaKasiski(charSet.removeIgnorers(cipher, new String[]{" "}));
        int d = calculateLengthViaKasiski(cipher.toLowerCase());
        int e = calculateLengthViaKasiski(cipher.toUpperCase());
        System.out.println(a + "\n"+b + "\n"+c + "\n"+d + "\n"+e);
        System.out.println("^^Kasiskis^^");


//        String s = cipher;
//        s = charSet.removeIgnorers(s, new String[]{""});
//        String[] split = charSet.split(s, l);
//        System.out.println(Arrays.toString(split));
//        String[] alph = charSet.charToStringArray(alphabet);
//        not_english initial = new not_english("", true, true, 12,6, true, true, 0);
//        double cutoff = initial.getCutoff();
//        boolean Break = false;
        /*
        if (l > 0){
            for (String a: alph) {
                if (l > 1){
                    for (String b: alph) {
                        String ab = a+b;
                        System.err.println(ab);
                        if (l > 2){
                            for (String c: alph) {
                                String abc = ab+c;
                                if (l > 3){
                                    for (String d: alph) {
                                        String abcd = abc+d;
                                        if (l > 4){
                                            for (String e: alph) {
                                                String abcde = abcd+e;
                                                if (l > 5){
                                                    for (String f: alph) {
                                                        String abcdef = abcde+f;
                                                        if (l > 6){
                                                            for (String g: alph) {
                                                                String abcdefg = abcdef+g;
                                                                VigenereDeciphered vigenereDeciphered = new VigenereDeciphered(cipher, new VigenereKeyPhrase(abcdefg, cipher.length()).get());
                                                                String got = vigenereDeciphered.get();
                                                                System.err.println(got);
                                                                not_english not_english = new not_english(got, true, true, 12, 6, true, false, cutoff);
                                                                boolean notenglish = not_english.not_english();
                                                                System.err.println(notenglish);
                                                                if (!notenglish) {
                                                                    this.keyWord = abcdefg;
                                                                    Break = true;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        else {
                                                        }
                                                        if (Break){
                                                            break;
                                                        }
                                                    }
                                                }
                                                else {
                                                }
                                                if (Break){
                                                    break;
                                                }
                                            }
                                        }
                                        else {
                                        }
                                        if (Break){
                                            break;
                                        }
                                    }
                                }
                                else {
                                }
                                if (Break){
                                    break;
                                }
                            }
                        }
                        else {
                        }
                        if (Break){
                            break;
                        }
                    }
                }
                else {
                }
                if (Break){
                    break;
                }
            }
        }

         */
    }
    private int calculateLengthViaKasiski(String CIPHER){
        int[] kasiski = KasiskiAnalysis(CIPHER);
        int likelyLength = kasiski[0];
        if (likelyLength == 1){
            likelyLength = kasiski[1];
        }
        if (likelyLength == 2){
            likelyLength = kasiski[2];
        }
        return likelyLength;
    }
    private int[] KasiskiAnalysis(String CIPHER){
        int[] likelyLengths = new int[8];
        int[] likelihoods = new int[likelyLengths.length];
        String str = CIPHER;
        str = charSet.removeIgnorers(str, new String[]{""});
        for (int n = likelyLengths.length; n > 1; n--) {
            ArrayList<SortingAttribute> ranks = new ArrayList<>();
            ArrayList<Integer> gaps = new ArrayList<>();
            String[] strs = charSet.split(str, n);
            System.out.println(Arrays.toString(strs));
            for (int i = 0; i < strs.length; i++) {
                for (int j = 0; j < strs.length; j++) {
                    if (i != j) {
                        if (strs[i].equalsIgnoreCase(strs[j])) {
                            int gap = Math.abs(i - j);
                            gaps.add(gap);
                        }
                    }
                }
            }
            for (int possibleLength = 1; possibleLength < likelyLengths.length; possibleLength++) {
                for (int i = 0; i < gaps.size(); i++) {
                    int gap = gaps.get(i);
                    if (gap%possibleLength == 0){
                        likelyLengths[possibleLength]++;
                    }
                }
            }
            System.out.println(Arrays.toString(likelyLengths));
            for (int i = 0; i < likelyLengths.length; i++) {
                if (likelyLengths[i] != 0) {
                    SortingAttribute rank = new SortingAttribute(i, likelyLengths[i]);
                    ranks.add(rank);
                }
            }
            ranks = SortingAttribute.MOST_TO_LEAST(ranks);
            for (int i = 0; i < ranks.size(); i++) {
                ranks.get(i).setRank(i);
            }
            System.out.println("println_Int \n" + SortingAttribute.println_Int(ranks));
            for (int i = 0; i < ranks.size(); i++) {
                SortingAttribute s = ranks.get(i);
                int scaledScore = ranks.size()-s.getRank();
                int value = s.getIndex();
                likelihoods[value]+=scaledScore;
            }
        }
        System.out.println("likelihoods: "+Arrays.toString(likelihoods));
        int[] rankedLikelyKeyLengths = new int[likelyLengths.length];
        ArrayList<SortingAttribute> RankedLikelyKeyLengths = new ArrayList<>();
        for (int i = 0; i < likelihoods.length; i++) {
            RankedLikelyKeyLengths.add(new SortingAttribute(i, likelihoods[i]));
        }
        RankedLikelyKeyLengths = SortingAttribute.MOST_TO_LEAST(RankedLikelyKeyLengths);
        System.out.println(SortingAttribute.println_Int(RankedLikelyKeyLengths));
        for (int i = 0; i < RankedLikelyKeyLengths.size(); i++) {
            rankedLikelyKeyLengths[i]=RankedLikelyKeyLengths.get(i).getIndex();
        }
        System.out.println(Arrays.toString(rankedLikelyKeyLengths));
        return rankedLikelyKeyLengths;
    }
    private void bruteForceByWordGuesses(int length) throws FileNotFoundException, InterruptedException {
        ArrayList<ArrayList<String>>PossibleKeys = new ArrayList<>();
            NGetter nGetter = new NGetter(new File("/Users/cole.henrich/Documents/MOOD/Cryptography-2/src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt"), null, length);
            ArrayList<String> Got = nGetter.getUniques();
            PossibleKeys.add(Got);
        boolean Break = false;
        not_english initial = new not_english("", true, true, 12,6, true, true, 0);
        double cutoff = initial.getCutoff();
        for (ArrayList<String> possibleKey : PossibleKeys) {
            for (String s : possibleKey) {
                System.err.println(s);
                VigenereDeciphered vigenereDeciphered = new VigenereDeciphered(cipher, new VigenereKeyPhrase(s, cipher.length()).get());
                String got = vigenereDeciphered.get();
                System.err.println(got);
                not_english not_english = new not_english(got, true, true, 12, 6, true, false, cutoff);
                boolean notenglish = not_english.not_english();
                System.err.println(notenglish);
                if (!notenglish) {
                    this.keyWord = s;
                    Break = true;
                    break;
                }
            }
            if (Break) {
                break;
            }
        }
    }
    public String getKeyWord(){return keyWord;}
    public String getSolved(){return solved;}
    public boolean isSolved(){return isSolved;}

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        //keys are "crawdad", "pearl", and "harbor"
        CharSet charSet = new CharSet(false);
        CifrarioVigenere[] ciphers = new CifrarioVigenere[]{
                new CifrarioVigenere("""
                        Orrok iv pft ozapr. Danvh lu r sldch qw lejhw, yyenh gucjs cuozu zn sdtht, rnz zawgi fhrwv ketk whh uby. Oooz-ofveqg ftvegv wdpuen, fautpijj tkg frx rf wjv sqq wlvy tdhm wq kha ved, ced hrnj-nvgchd ekido oiiv nipk uqgopafthf xrwfe—du khkxgk pft xxiov ko boy—dirijvt wjv rkdr rh r tdruvced oqoz iveoh.
                                                
                        Tkge wewhlp kha pauuy, haue dpu tdhrh, viua vwdog cndwou znpr lry-cyeqg eqxs, dldgge ij fldody brrhuks. Ozapr naphr lu jteol dpu dwuk, kcmijj szcclkzeg vye hlgkv zn ews pwudu whuqrt. Ayeq pzgdw cucnlaus dtv dexrqcc ij whlu caeu. Tkgie wue vqlnzv, oi efunve, ewk ckppdtvd pr tkg danvh, wjv ssdms kj qqlew dvcwxsh fvckppruztern lu tehouoci wkuk. Okwe zhcdaj ajg rhgbs wqd ugkunqs wq kha uowvvd zxfi; c goejndpk wwolry ff zhawj sechtwkeg hlfh.
                                                
                        Qe tdh mrteijj oi Qttkeeu 30, 1969, vye xrdb qw Cddsh Cednhwv nry eq tkg jwwpp, zjzcd zoxnu hwye ddjoneeg kk seoeqvcy, nruwkeehb. Hlfznc lt iqi gkrd. D unais kqqns wol ddfup gedvy, ajg drgjn’p qefgjswuioa ueblnh kk ao wrdivdu, feuvrijoy qqk a oln. Ewk tdls pqineqg wyf bkbs itfm pke ykclwje uque pkelt sighs rwk tk whh qcd blrh vfwau aqf, wrkp tkg kheud vyztykbdeb, slrtwgu hev dhpzm fdcngk.
                        """, "crawdad"),
                new CifrarioVigenere(
                """
Bv. Vznt Trvdxheee, Bv. Sgppoei, Xtqbvch sf kst Weelii, aeo dj typ Wsujp dj Rvagisvyietzgtw:

Yvdiiruln, Hetpbfei 7ew, 1941 -- e dret ahznw aicw amvv tc mnwlbc -- typ Jrikps Wtretw ow Lbirznp aaj djhdvyac aeo silzmtvakpac akepgkvo qc nrgpp aeo pmr wzggej zu xhv Pbtiip dj Jrapr.

Typ Jrikps Wtretw wrd px pvlri wzew xhre cetzzc enu, li xhv ddpittietzzc sf Aleen, nlh wtzwa mn tzczeidpxify lmty tiw gfgtvndpcx aeo xxs vxeirfc asobtck tfhpvd kst qazyiinryri ow atecv tc xhv Apgiwtr.

Mnupth, oep wsui luxei Uptaephi azc huurogsnj sph cfxbintps fodmxrg zy ile Rxtvitlc msclch ow Zplu, kst Naglcisv lbfajdphoi ed xhv Fcmtvo Hxakph enu sxw cfwaiaxft hectkirvo is olc Hicipierp zu Wtret e ffcbel ipepy kz p vetpcx Adpgmcry bisjlvi. Aeo llicp ilij cttlp dietvo ilak ti wevxth ujpaisj ed goeexruv ewi eothxier smpczbetzn cigfexetzzcw, ik ndrtrtcid ez ilrvli sr ytcx ow hpv oi zu erdps etklro.1

Ik hxpl sp gicfcsid kspx typ smsklcge fq Wewrtx jrfx Yepry bekvd xx osgxsuj ewet kst etklro wrd silzmtvakpac pclcreu xpry ulnw oi pkin nptos rrd. Huitck typ xrtvckinzyv xidp, ile Aleenvdt kompgrmvyi laj otpispgetvwn wolrwx tf otgezgt xhv Fcmtvo Hxakph fy wlawe jepxedpcxs rys ixgctwszzcw ow sdte wzg goeexruvo eiatp.

Ile reiecb jtwtvcsey fy ile Ylleizlc msclchs ylh galdth svgtve ulbegv ed Emvcxgae ypzac lch mzwxxaij usrtph. M rvrgit kz iilc jdy tyli zeij benp Lbirznpr lzgtw hrgt fevy assk. Tc edutimoe, Lbirznpr sytew hrgt fevy gipfciid kzgteuzth oe ewi hzrw werd qitnptr Sry Uvaenxwcf lch Hfydpucf.

Niskpghap, ewi Jraprejp vsvvccqeee ppsf wpyntsth ae lixatv pkazyhx Mrwpca.

Clhx nzrwx, Jraprejp usrtph etklroeu Sdrg Bzck.

Lrdi rixsi, Naglcisv qdvcvd pxtrnzid Xfpq.

Lrdi rixsi, Naglcisv qdvcvd pxtrnzid kst Thzwxtpzyt Msclchs.

Clhx nzrwx, typ Yeprytwe reiecbps Aabp Xwlrys.

Enu ewms dzgrier, ile Aleenvdt etklroeu Xxhwrj Xwlrys.

Naglc laj, ewirvqdve, lysirklzin r djvpithi owqtrszgt ixkpchier ilrffvlole ile Glrmfzn pver. Ewi frniw ow jtwtvcsey rys xouln wpvlz joi ewimjpazej. Ewi pvzepe fq ile Lyxxeu Dietvd wevv laveron joixth typxv ogtcmoed prd npap ueotvsklch typ xqpctretzzcw tf ewi vvcn piwp prd jluitp zu sui ypxify.



Pw Cfxbenupg mn Tsxif fq ile Rcbc aeo Cevp, T wevv oxveteth tyli elc xteslctw bv epoee qdv olc sifvyhi. Ble ppwrjh aicw dyr nsdpe elimoe ctqedmtv typ rlailrxei zu xhv zcwlrfvlt rrpmnje jw.

Nf xpxtvc wsw czck ik xpc trvt ys kz dzeindqe ksxw pipbidzepxeu tczajtdr, typ Pqeitren gpdtlv tc xhvtg vixsiiold bmgye lmlc hxr tycdygy ed ebjzaytv gxgtfcn.

M bvwxivv ewet Z tcxeiagit kst aicw dj typ Rsnxctws rys sf kst tefaai wypc M ajdtvt kspx wv hxpl ezi sncj sifvys suidtpvvd is typ jxtvcbssk, mjx wzwa qabp xx vvcn geiepmn kspx tyth joix dj tippghvcn whrwa rempg egrtc inulckei fh.

Lojexpikttw eothx. Typgi ij yd flzyzmnx li xhv qpgt kspx olc eiogwt, sui etvrzedvy, rys sui tcxeiphxs rct mn xcpze ulckei.

Hxxh tzcjiupcge zy dyr rcbid wzggej, hxxh kst ynszjrdzyv hekpgqielimoe zu sui atspcp, li wzwa kazy ile zytziklqpe kcxymgs -- hs hvwe ys Xzs.

M ajv ilak ewi Cfyvvejd sicclgi tyli wient xhv fctrfgdoeu lch drdieruwn etklro bp Uptae zc Wueopc, Dvntqbvc 7il, 1941, a jepxe fq ler ylh ixzdiid spiaevy ile Lyxxeu Dietvd prd kst Naglcisv pbtiip.
""", "pearl"),
                new CifrarioVigenere(

                """
                Tr. Mjqv Wrvtwulnk, Nf. Jwerlsi, Tedcsiz ow uvv Zeebhv, hnu pt koe Ypijl ow Ssgyejfbkhtzwsj:
                                
                Fejusikap, Estlmsff 7ko, 1941 -- a ubhv dhzdv nplc mwml ie jbwhmp -- uvv Bnzusu Ztrusj vf Rnsipcr xoj zuuesesy ror ullzcsihtvmm ratrdyvk bp oomhl ror rpr wpftls fg hyl Edqwil ow Koghn.
                                
                Kis Luikfr Jaakfg nhs ru dvhcv xwko tybh ehtzpb rud, ru hyl sfmwtptruwfu ow Koghn, nbg jaicm we joewsizakjce diki wkz gfwsiumvoh rud zug vtpvsci soflwen tfxoik tyf arpnkfbrucv pt glatf we ahv Qotpfzd.
                                
                Wekeve, cel hfvf rmtvs Xrwaefgv hii telhdipbj oau dcdteedsu iodcwen ie uvv Hmvswthn ztzrud fg Crou, kis Ahprosjl adcojzaupf kv tyf Ieptve Gkhtvt oek hzt qfslvbull dvmwmlrve hf vui Tstyekbfp vf Juokl a wpfdhl ifdcf tf b fvjeeu Odlrzdoe tejtoxl. Aee kyplv uvzz rvqzp ztrusu ahru wk zevnsu bsvmsjz tf dceaievs koe vywjaieh rzwlfnokpc efufairuwfus, zu qfutrjbvk nf uvilak pf ypnk pt nhr fs cw hrdfr ratrdy.1
                                
                Za wzmz sl rvdcikeu uvra tyf rzztroqv vf Ybkrpi wscd Qagbb dhkvt wk vbmjclz tybh koe ruhrjk nbg ullzcsihtvmm gsaeosu taez rrfs fs smln nfsbz axp. Rlyieh hyl ieusiceejbx aidf, hyl Jrqoelsv hcmlrensea hrt rvsisffraecz gfbgyu hf ketfwml tyf Ieptve Gkhtvt pp macts jaakfavutj bbu lxgssjzifog fm hfqs wvr tpbkpnlfr glatf.
                                
                Hyl akuotr yvthvydrz ce ahv Ionhizbb zzlrorj oaj dolzeu tsmlrv eodhgv uc Rteijqru nrwoc hnu nwcptrsm wvrtfg. Z yexssk ao kfzc fol uvra vvsm dhnp Bavyitbb cpvvt vrce sfse soju. We hdujhzvn, Rnsipcro gyppj ioml bvfb ilpfshvk tfsdvkove ce ahv iwxo svbg sltnfse Zae Gfrucztqf hnu Icevllmi.
                                
                Plskffuhy, kis Ahprosjl gfwsiumvoh rssf molucyfr ru akuotr axbwezt Dbzrfa.
                                
                Cbgk uixih, Ahprosjl ffsqvz akuotreu Icen Kfou.
                                
                Chsk owxot, Abdruejf tfycvt okaatlsu Nurn.
                                
                Zrzt ejuya, Jrqoelsv gcijej bhkhcbfr koe Giwcppgjbv Pscbbuz.
                                
                Lrth epgyu, hyl Jrqoelsv bhkhcbfr Nhkv Jgchnu.
                                
                Bbu ahzt afynzou, koe Abdruejf okaatlsu Tiuxop Pscbbu.
                                
                Qagbb yhs, kisilffss, ludvshrree b glypijgv vfwfbjpvv flklnujbx ahipixoolu hyl Prdwwpc rssr. Ahv gotas fg mvztvsrrf aee hfkap tdvhk wpf koedtsccej. Uvv wefqzv vf kis Luikfr Jaakfg yhvv bzilauz tfymve hylii pdzuifog rud nfzc bnuffjaaee hyl idqzzjakjcez tf uvv ceiz zzme ror jhfvum fm ols braifo.
                                
                                
                                
                Oj Jodnoekei jb Toivg cw ahv Bfdf aee Brcy, Z ioml dzsstaeu uvra acm avhslssj ie kbyvu ffs cly dvgseze. Svh rswrzg nplc pii dhfms ehtzpb ilmvnpvy tyf qyhrrdhvy ow uvv vnjmolnhk burpnju ij.
                                
                Uo dbhklr ypk cvnx jh dhy kbyv bs kp cmlrtpav ahzt dilmvewkhtve wecajjce, ahv Bavyitbb glogms zu tyfwi yixihvvuj nwxot njzc die uvivuxi hf hbjpzlae mjqkvrp.
                                
                J pvsivws koak J weaeiqfva tyf kzsl fg hyl Cfouilsj bbu vf kis glogms noee J ojzeiu hyht nf kzsl eph fulp eswlnu piizecwsj ao kis latvsafzt, svh nplc nobl ik wsif cvshrpn kiok ahzt tfym fg hilatisif sybzc uemff rnazo sekaehsi bs.
                                
                Ypgkplzuwvz eojgk. Ahvss zz nf czzukzou ra tyf trjt kiok vui qsfwlv, pii aeiswkvrp, bbu vui jbklrvthj hrv jb xyamf rrugvs.
                                
                Kzah tpbwpdvoqv pn fvf rymve tfycvt, kzah kis lubfvbupnx esklrdjbraifo cw vui qsfwlv, xs nplc hozu tyf welvzuosse kswltpy -- tc yllg vg Xvd.
                                
                Z bgb ahru hyl Cfouilsj estsaif hyht jjbtl tyf iewrfwcbld ror uhskbfusy ruhrjk sz Xrwae pb Jbnubm, Ulcvnpvy 7ty, 1941, b gkhtv pt nhr ybg veijusu iekxsvu tyf Ieptve Gkhtvt oek tyf Xrwaefgv lmgjfv.
                """, "harbor")};
        for (CifrarioVigenere cipher: ciphers) {
            VigenereCracker vigenereCracker = new VigenereCracker(cipher.getCipher());
            VigenereDeciphered vigenereDeciphered = new VigenereDeciphered(cipher.getCipher(), new VigenereKeyPhrase(cipher.getKey(), cipher.getCipher().length()).get());
            System.out.println(vigenereDeciphered.get());
        }
    }
}
