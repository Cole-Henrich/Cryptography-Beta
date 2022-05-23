package sample;

import java.io.IOException;

public class VigenereCracker {
    private boolean isSolved;
    private String solved;
    private String keyWord;
    private int length;
    private String AttackMethod;
    private final CharSet charSet = new CharSet();
    private int likelyMinLength;
    private int likelyKeyLength;
    private int keyLength;
    private int likelyMaxLength;
    private final char[] alphabet = charSet.getAlphabet();
    private boolean isCaesar;
    private int shift;
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
    public VigenereCracker(String Cipher) throws IOException, InterruptedException {
        System.err.println("new VigenereCracker");
        cipher = Cipher;
//        int a = calculateLengthViaKasiski(cipher);
//        int b = calculateLengthViaKasiski(charSet.RemoveIgnorers(cipher));
//        int c = calculateLengthViaKasiski(charSet.removeIgnorers(cipher, new String[]{" "}));
//        int d = calculateLengthViaKasiski(cipher.toLowerCase());
//        int e = calculateLengthViaKasiski(cipher.toUpperCase());
//        System.out.println(a + "\n"+b + "\n"+c + "\n"+d + "\n"+e);
//        System.out.println("^^Kasiskis^^");
        String c1 = charSet.RemoveIgnorers(cipher);
        likelyKeyLength = charSet.findKeyLengthByIndexOfCoincidenceAndKasiski(c1, 3);
        System.out.println(likelyKeyLength);
        length = c1.length();
        System.out.println(length);
        if (likelyKeyLength == 1) {
            VigenereBruteForcer vbf = new VigenereBruteForcer(cipher, 1);
            if (vbf.isSolved()){
                isSolved = true;
                solved = vbf.getSolved();
                keyWord = vbf.getKeyWord();
                keyLength = keyWord.length();
                AttackMethod = "Brute Force";
            }
        } else {
            if (c1.length() > (100 * likelyKeyLength)) {
                VigenereStatisticsAttacker vsa = new VigenereStatisticsAttacker(cipher, likelyKeyLength);
                if (vsa.isSolved()) {
                    isSolved = true;
                    solved = vsa.getSolved();
                    keyWord = vsa.getKeyWord();
                    keyLength = keyWord.length();
                    AttackMethod = "Statistics Attack";
                }
            } else
            {
                VigenereDictionaryAttacker vda = new VigenereDictionaryAttacker(cipher, likelyKeyLength);
                if (vda.isSolved()) {
                    isSolved = true;
                    solved = vda.getSolved();
                    keyWord = vda.getKeyWord();
                    keyLength = keyWord.length();
                    AttackMethod = "Dictionary Attack";
                } else {
                    if (likelyKeyLength == 2 || likelyKeyLength == 3) {
                        VigenereBruteForcer vbf = new VigenereBruteForcer(cipher, likelyKeyLength);
                        if (vbf.isSolved()) {
                            isSolved = true;
                            solved = vbf.getSolved();
                            keyWord = vbf.getKeyWord();
                            keyLength = keyWord.length();
                            AttackMethod = "Brute Force";
                        }
                    }
                }
            }
        }
    }
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
    //}


//    private void bruteForceByWordGuesses(int length) throws FileNotFoundException, InterruptedException {
//        ArrayList<ArrayList<String>>PossibleKeys = new ArrayList<>();
//            NGetter nGetter = new NGetter(new File("src/sample/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt"), null, length);
//            ArrayList<String> Got = nGetter.getUniques();
//            PossibleKeys.add(Got);
//        boolean Break = false;
//        not_english initial = new not_english("", true, true, 12,6, true, true, 0);
//        double cutoff = 0.4;//initial.getCutoff();
//        for (ArrayList<String> possibleKey : PossibleKeys) {
//            for (String s : possibleKey) {
//                System.err.println(s);
//                VigenereDeciphered vigenereDeciphered = new VigenereDeciphered(cipher, new VigenereKeyPhrase(s, cipher.length()).get());
//                String got = vigenereDeciphered.get();
//                System.err.println(got);
//                not_english not_english = new not_english(got, true, true, 12, 6, true, false, cutoff);
//                boolean notenglish = not_english.not_english();
//                System.err.println(notenglish);
//                if (!notenglish) {
//                    this.keyWord = s;
//                    Break = true;
//                    break;
//                }
//            }
//            if (Break) {
//                break;
//            }
//        }
//    }
    public String getKeyWord(){return keyWord;}
    public String getSolved(){return solved;}
    public boolean isSolved(){return isSolved;}
    public boolean isCaesar() {return isCaesar;}
    public int getShift() {return shift;}
    public int getLength() {return length;}
    public String getAttackMethod() {return AttackMethod;}
    public String getCipher() {return cipher;}
    public static void main(String[] args) throws IOException, InterruptedException {
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
        CifrarioVigenere cv4 = new CifrarioVigenere("""
                Ilsgp'w p gcgp tgmbrttai hwlx li kxwp ptdaj xd eza zj dyf pnxxsbh.  Pztr oh hi rpspy ye xvt xihw oi Ryprhpyebs, kt hmap qdywiebiwc gisklpjeht zyg edecspgv, hffyiqi zyg hsrtwxsbh es gijxpa uvcb zxwif qcecgvtd su kckpvcqsce, eh asaw eh xvt ayqpwr.  Hi hisz elt whgzrvigi lrs qche wjwhptrpfzt wivez ucebikdco usf pohgightrv xvtdi xwgjpw xr hwp pdru ipvb -- rci es hifkp mbqssteii ddwmimqh, myi xc sz aweh'h cmvlh dgig xvt wsck htcq.  Qc rdtrv xvpe at goc wipzs qplxrr p wiveqn elpx cjeppwhh xc phaxymhxfpemdr, an avtwwsprrc, hwlx trrjcih jcg elt rsme Tgigxoicx oco xwi Dgpwxhsce euxsg elpx -- o apkpgm isei tfdeirxg isi Pqsgtgpr dtztai oco icncnd e qvcpo ptkwitqpgm pe ldqs pyh pffdlh.

                Csk, ismh mg lsei M atlr llsc T wpc hwlx li btph is tdnyh sb isi uyhjci.  X vsrzkcmnt elpx apyc hxwaw lpzs p dxgsbv oihmft es usqjd sc xvt aehx.  Kwpr xx qdxih xc pnxxsbh zj ils alwi iwvsx niogd, tpwgxzrh eft smvl.  Gdxi Pqsgtgprg pci prugj; silsgd aprh iz vt-jwvsx sippeih xvpe lpzs qpic wsiepth, wc dsbi qpdih hsqlxtw hwlx ilsn seki zddx.  X obdh xweh isihi rtmeiig apes hwgpgipm, xy wdqs rlwtw, hd l gppz uzv p jiawig eqrzycxwcr, ttvvpaw ilfdfkw eb xyhttscoicx qdxqxwgxzr.

                X'zs datdwss elt gftlxxsb dq wjgv p nsbqwhdmdr ptnejws X miamskp xweh dfv tbwhemck rtxsrvoitg xrgitxjxwdyw pvs hevdru tysjkv iz htpwkpv pgqdfriepxwmic.  Hwp Gdrugpwh goc cikmsl lfjwsh zj dyf klpjig, pyh ilsgp egi ccrsxru xyujmfxpw qc hwp Gdrugpwh mbiz qpxhtcw amyt prwebrph xrhtcvdkoitsc xsrsrxuitd.  Xwi Rtaegxatyx dj Xjdxxgs pyh dyf rzygxg rlr lsfz elgsivs ech djymhl ocj zxszpemdrg dq sjv zphw dv axdgpvfxlktw cu uyhxwrp.

                Mi'w bd dirvsi eltvs xd e iibsprrc wc Hehlwcrxdr hd dttrr dfv imat asxrhxyk umbvpvh eh dyi prcisig.  Ebs tx'h rc hpggih isei sig xismo rfpiyft qithg isi xqdjwwt xvpe pter iz e vscs qmvlh pyh vscs nsec.  Pje rdxvxyk lmza nscxfxmyii adci iloc elpx hwlr p iliprsir gppxxwvlxxsb dq xwi zpdx tmuwe ctefh.  Lpgiosj, at'zs hpic lcl elpx yxyh dj suqsgx ccwc aiosd xwsgt tr Legwtrvxcc es smtupvtrh hthtw hd wenmbv mppqs.  Xe gpr rxdxgeqi fw uvcb qsrygxyk dyf itqt, sig pjusfid, ech cjc tdpwitgh sb isi rloawicksh zj ils ufxjvs.

                Lp wti hwlx, pfckp eap, wc elt vsrpri hsqlxt -- lcl elt vsrpri hsqlxt loh zfhgigph ils icyil oco wtrh epseps xyxd sdezwxxs pyh pfgdwyimgi prsw.  Cc elt sbt dmsi cu elt wdtnxgya, isigi ogp xwsgt hld qozp pxxhap eapcllrri tdc xwi ictuji qwlpaibvpw esgto fn xsgcsgmgb, lrs acjwh ppaddx cijtc tjx bpemdroa diryfxec dzsg evprgelvtrqn.  Lrs sb isi dxvtc ich cu elt wdtnxgya, isigi ogp xwsgt hld iaqceri o ktil xvpe gpr pt dybqogtdth wc ead acgow:  "Prmismck udpw."  Ilsxc egkibpriw gjrktwh isei xvt prsw cu qmvlhxyk iifgzvxwa rlr qi ihph is xjdxxjm pyc biocd, ech hwlx ils Ecihmrtyx hlcjwh wejt mppryte ejxvdcmic hd os lloipztv vt hecxg -- ecskmrto mi mg p Avtwwspri awis awsa isin eugpi.

                Qshw dmsig blc qi gxygtvs xy xwiwg gmtag, qfx ciwisig wwsp mh vwvsx.  Ils Pxigmqpy ttsdap egi bde eqwcafxxwh, pyh ilsn osc'x sapgi yg iz mbtchp e gmuxo msicazkn sb dfv evcqwibw.  Hwpc zrcl elpx kt yith bde wpgfxqmri cjc wtgigtxn jcg zyg zoafih, rcg dervwutgt sig geaysh qsg sig diryfxec, hs zdyk pw kt ltevcpnl smtutgjph ffihxwdyw lmhw sscigij ech qpci prr p oshi cu nsbqcc dicws.  Isei, etipv ppz, xd xwi ictuji utymjw cu Lqtvwrl.  Xweh'h elt gvpwptrut wexh rdhr qc cjc Gdrgitxjxwdy.  Xweh wlw qisc elt wcjcgt st dfv hxftykil hwcsjkv isi pksh.  Elpx'g lsei qozpw ils Jymiir Heeiig dq Ebifxne smtupvtrh pd e cehxzr.

                X goc dxprr wpvt xcslc, pw Dgpwxhsce su xvt Frxxss Dxpxsh, lrs won hmilcje imgseemdr cg pujmjdneimcc elpx kt os csh izviyft, lrs xvpe at awaw zxkcgzyhpm ecsiiqi zyg tsdapt avxwi usfvtrv e gicsck oco hjvoqwi uvobpadvy isei ezazah yg iz jxkvi eigvcgtwb avxwi pfwstrv fm isi gyzt zj aek.  Blot rc btwieyt:  Tj li tptp is hjcr ils elkt sb isi ptdgzerl hwlx leg ilotr ckpv ils elwi wskpvpp mtlvh, xvty M lmza ysi fs pmpt xc hlc iloi lw Evshthtrh.  Pyh xj kt necrci dxprr uzv dyf rzvt zoafih, xvty at eft ysi ostamck tptxw awis xwi rdnybibid xweh pci trgwcmcir xy xwmg wlpa.

                Xvt Qvpqsgd aws rgljiir isi Rsbhemiyhxzr rsiao rdx vpgi usftditr hwp gwezaprvig isei lokp ycjcaois sjtc xwi zpdx 222 niogd.  Fjx cjc Gdrgitxjxwdy lpw scoygir isvdyuw dirightsc ebs nmkmz gtkwxg, isvdyuw Hsgpr Llv prr Rzps Aog, mireihp mi tfdgmsig p qsjrrpemdr cu avxrqxaptw hwlx reb qp eetzxph evovxeimqpwpn; mh ecskmrtd e rsaelwh xvpe gpr vtwt jw txyh dyf llc.  Xx vpdr'i ezllch fsty ipwm.  Lp egi oc tqeifupgi tsdapt.  Ijtcc csk pyh ilsc, eltvs pci ilchp aws hwtrz xvpe Ebifxne'h woupxn ebs dyrgshd vtuixcih yg iz appy phen jfdx xwi gpnvth dgtrrmdapw trgwcmcir xy xwmg qfmahwcr.  Ech kt sipv gjnl kswrpw isrpj.  Fjx ckpv ils azrv lojw xwi Obpvxgoc aidtzt seki ftdmhxss elpx htxtiehxzr.  Prr issjkv lp'zt qosp sjv gwlvt st btwieytd, vtuixcis wcbp gdyfhp gdvftnxxsbh, fpimapeiac kt seki vtwh uegi es ils ecmcgwewih xvpe lpzs qpic xvt dsjvqt zj dyf hevtruis ech o qpersb iz xwi kdcps.

                Rcl elxw utyigehxzr ueqtd e vvspe xtwh xy xwi gepgiif dq xtvfdcmhq.  Oco ycpwzp xwi Qxgma Aog zv Lsfao Apv WX, hi reb'i nsjrh dy e hyfgprsif rpvtqccj xd ffxyk ilwh usjvbtj xd eb tyh.  Gmuwe rda, wc omhxoce xgewctrv gobaw prr xy ggsksph rmhxpw, ilsgp egi dtztai dazximbv es ieyt Lqtvwrlr amjtd.  Xweh ltpa fs isi regt l ctef ucsb rcl, qmki mtlvh jfdx rda, oco -- mc eza avdfoqtpxxm -- 10 npegw tgzq csk.  Cpmilsg T rdv ocjsci qpy wiebs sigi hdoen ebs den xvpe xwift hmap bde ft ebdeltv htcvdvwhe eixorv xweh ilotw Obpvxgoc wmkig.  Qfx X goc den awis gtvhptric hwlx bc osxmcmgiceimcc -- lpdru ltxw sig pbivodchxrogj xgsced ech hwp tpxfxzxxg aty ech kdxic avd oiuibs zyg roitscez hpgjvwij -- axpz sz ikifnelxru xy sjv ddhig xc zpie xvt Lqtvwrlr eicewi hett.  Lrs M rd vrda kxel rifilmcxm isei as rlr prr ltpa hsupei ez Flise.  Ptnejws isi iifgzvxwhh nec sbaj wjgqtph xj hwpc hasaw xwiwg cecog pyh ppwtyeii Obpvxgo ucsb sig lpamsh, lrs xvtj axpz cpztv pt lfai hd os iloi tj li gilc ivit es llc lp egi, wu hi usfvp xdyuw lrs higlfai oeavdeqwpw is txrlimbv eigvcgtwb xvpe egi ocnldvss tr dyf itqtpshd msioad.  Xwmg bfwi fs dfv rsabzr eyfezwt.""", "people");
        CifrarioVigenere cv5 = new CifrarioVigenere("""
                EVSPXFAI
                Kt elt Tsdapt st isi Jrwiph Hxoipw, xr Cgoig xc uzvb e adci eifupgi Ybxzr, twhpmpxwv Yfwimqt, trhyft osbigitg Ivocbyxpwij, tgsjxoi usf isi rsabzr sittywt, tfdxsii hwp ktrsglp Lizulvt, ebs diryft elt Fztdwxruh zj Amptcxn xc dfvhizkpw prr dfv Esgipvxxm, sz sghoxy ech sheeqpwhs xwmg Rzrhxwifxxsb uzv ils Jymiir Heeiig dq Ebifxne.

                Pvhxnpt M
                Gtnxxsb 1
                Pwp aiuxdppxwkp Tdasgd ltvsxy kgebiph hloaw ft zsheis mb p Nsckftdw dj hwp Ycmhto Wiehtd, awmqw dlppz rzrhmgi zj p Wsclxt ebs Ssjws dq Vttftdicxoitztw.

                Gtnxxsb 2
                Isi Wsihp su Vsecihibilxxzsh dlppz qp gdqdddis st Bpqqifh nldwsc pztvm hpgdrr Npeg fm isi Eicewi dj hwp wtzsglp Hxoipw, prr isi Tpsresgw wc perl Gilxt wvpwp wejt elt Uipwmumqpemdrg gpujmgxei usf Twirxcgd su xvt xshx bjxigsih Mvprqw zj ils Heeii Ztrmhpoifvt.

                Rc Epvhsb hseap pt l Vttftdicxoitzt avd dlppz czx wejt lxiewcph is hwp Evi cu eatrhn qmki Mtlvh, ebs mitr gtgic Cspcw p Gwitdtr cu elt Ybxeis Whpeih, ebs hld wvpwp csh, lsic iztnxth, pt lr Xrvpmmiebi zj iloi Dxpxs xy awmqw si hloaw ft gvddic.

                Vsecihibilxxzsh lrs hwgpgi Xompw hloaw ft edezvimccph pqccr xwi gtgigez Heeiig lsmrl apj ft mbrwysir ltxwmb ismh Ybxzr, pgqdchxru iz xwiwg cihtsremki Bjxftvg, lsmrl gwlpa fs spxtvaxyis fm pohxru iz xwi kwzpt Ribmig st ucit Tsgdscw, wcnpjhwcr xwsgt msjrr iz Wtvjxni usf p Eigq cu Jipvg, pyh tbqafhxru Xyhxebh ysi xomph, ilftp jxjhwd su eza zxwif Epvhsbh. Elt eqifea Ibjxigehxzr hloaw ft qosp axxvxy xwvst Jipvg pqxtv hwp jxvgi Xitxwcr su xvt Nsckftdw dj hwp Ycmhto Wiehtd, ech kxelxr skpvn wiqdifysce Xtva dq xtr Mtlvh, mb hfgw Qocyig eg isin wvpwp qc Zph hxvsre. Xwi Bjxftv cu Cievshpriehxgih wvpwp csh tigtir dyi usf tgigc hwtvic Hwzyhebs, myi iors Wieht dlppz wlzt eh Apehx ccp Vttftdicxoitzt; ebs frimz hfgw ibjxigehxzr hloaw ft qosp, xwi Gilxt st Cpa Weaedlxvs hseap pt primhaph is qwfwt xvgpi, Beghlgwygtexh iwvsx, Glcsp-Mhpoco ech Dgzzxhscni Epoceeimccd sci, Qdyrtghxnyi jwkp, Rta-Mdco hml, Cpa Yifhpc usig, Aicrgnwzprwp pmvlh, Spppaogp sci, Apccaebs dmm, Zwgrmcmo ipr, Csfis Gpvcatrp jwkp, Wdyhw Negszxye umjt, lrs Ksdckxe hwcit.

                Avty zpgocnmtw vpattr wc elt Vsecihibilxxsb ucsb ebn Dxpxs, isi Tbsrfxxzs Pfxwsfxec ilsgpsu wvpwp xwgjp Agmhh zj Tpsremdr hd qmap gjnl Keqpygxig.

                Isi Wsihp su Vsecihibilxxzsh dlppz rsyhi hwpmg Wdtlotv oco silsg Zjumqtcw; prr hseap vpgi ils hzpt Tclpv dj Wbaipgvbpri.

                Wsremdr 3
                Hwp Wtroip su xvt Frxxss Dxpxsh dlppz qp gdqdddis st ihs Hibpesgw tgzq teqw Dxpxs, rsshib qj xwi Ztrmhpoifvt xvtcidj, tdc wxb Mtlvh; ebs perl Gtyeisf hseap vpgi drs Kzxt.

                Mabphxehtwc pjhtc xwim hseap pt lwhiaqwis mb Rzrhiejprri cu elt jwgdx Tpsremdr, hwpc hloaw ft hwkthth oh pujezaj eh qon mi xrhd elgis Rwehwsh. Elt Wspew dj hwp Wtroizvh st isi umfhe Gaegh dlppz qp zpgoiph px hwp Imtwglxxsb dq xwi gtnsch Mtlv, dj hwp wtgcco Gaegh lx ils Titxvoitsc st isi usigel Niog, lrs st isi ilwgo Gaegh lx ils Titxvoitsc st isi hmlis Ctef, hz xweh dyi ilwgo qpc pt nldwsc pztvm hpgdrr Npeg; ebs tj Keqpygxig wlteib qj Vtwwvyeimcc, zv dxvtcaxws, sfvxru isi Giqtdw dj hwp Ptkwhweiyft zj prm Heeii, hwp Imiqjemki hwpvtst blc beyt eibtcglvn Edezmcxatyxh ybitp ils cpbi Qstemck cu elt Psvtwaehjci, llwrs wweza eltr txwp hyqw Gerebrtih.

                Rc Epvhsb hseap pt l Wtroizv llc hseap bde lpzs pexpmbto xd xvt Lkt st ismgxm Npegw, oco ftib ctrt Cspcw p Gwitdtr cu elt Ybxeis Whpeih, ebs hld wvpwp csh, lsic iztnxth, pt lr Xrvpmmiebi zj iloi Dxpxs uzv llwrs lt wvpwp qi qwzwtr.

                Hwp Zxgs Ecihmrtyx dj hwp Ycmhto Wiehtd wweza mi Evshthtrh dq xwi Gtyeii, pje wweza seki bd Gsii, icwihw hwpc qi sffeapm stzxhss.

                Elt Wsclxt wvpwp rlihp xwiwg zxwif Dqjxgsgd, ech oads p Tftdmsibi avd xsbasgi, wc elt Ephprri cu elt Zwrp Tgigxoicx, cg hltr vt dlppz tiiggwhp xwi Cuqmri cu Avtwwspri st isi Jrwiph Hxoipw.

                Ils Hprpxs hseap vpgi ils hzpt Tclpv is hgj eap Wbaipgvbpriw. Kwpr hmhitrv jcg elpx Djctdws, isin wvpwp qi cc Zeil cg Ljumfblxxsb. Lsic xvt Avtwwspri st isi Jrwiph Hxoipw xw hgtis, xvt Nlxit Yfwimqt dlppz ecihmrt: Lrs rc Epvhsb hseap pt nsczwreis awissjx hwp Gdrqjcvtrqt zj iac ismghg dq xwi Atxftvg ecihibi.

                Uyskatyx xr Qpdih st Xxtteqwxicx gwlpa rci pbiibs qygxvtc xweb iz vtqcklp uvcb Zjumqt, lrs hwhbyppwutgpxwdy xd lcao ech scusn ebn Zjumqt zj wsbdc, Xgygi zv Evcutx jrrtc xwi Ictxth Gilxtw: pje xwi Dpcxn gccgmrxss dlppz cpztvhwpptwg qp pxepap ech gjmntgh iz Mchwreqtrh, Icmpp, Xjokbibi lrs Tictwwqsce, ergcgomck hd Wel.""", "people");

        CifrarioVigenere cv6 = new CifrarioVigenere("""
                Vhp kch (Hewqu qctfa) kg c dzuggvin arseipa qt umltn qcryqxctofa ooomlt.[1][2] Kh ks epg cplj lqagseqeoveo arseipa kb vhp ncaklj Ngzkdlm cbf id whhgn cmhstrpl vc cs epg rqmpavwe clb vc fidbkbiutaj wv fcwo hje hqnr oexjgfu oq bjs haxqnm.[4] C clb eop etbjst bp i jcwsp kch, c flzo qct zz c tgrlt eov; tsm novtpz topgpa hfgewg cbf agwkru hfucb eoybcqv.[5] Dzuggvin kchu acm xonupl dm juxipg hoc kqarayqqbuhtx cbf tsmkf cbttkha tz skzn rzlgbvs. Ljqiv 60 clb dfgeoa cfg rpkqupikmf pa vlzkcws niv fggtavfked.[6]
                """, "calico");

        CifrarioVigenere cv7 = new CifrarioVigenere("Evh at bnjh orcgfkztvzv hvt hkvgscux ft gdex ft an gnkghpfwzbu Rsuzbsi exdpsgk ter osnbjcfh.  Ox'ms udl hlf Gtukvhogq hw Ghplx, Ywzaskp Qzxfmfb.  Kt ztms cjj VZO Rxjxthcg Dxfb Dpfxkho.  Lw arjs dmk Jsqgwmrfm dx Wvtsckx Nwzaatd Uoiwl; Jsqgwmrfm Csifzwisgf ct Swirfhbwgk ct Wgfvzocv Lvqigamp; Ohigkesm Vwgvfoa Wkzq Vddwvf; an Ftkwccse Jsqjjbkm Osnbjcf Yaf Acbtk.  Ter W lsgk hc tkivqwpdep hvpfd fif Pumzbu Pjvywjxkm ft hww Newhtv Lkohtk, Tufwtfgv Hvdetj.\n", "troops");
        
        Time time5 = new Time();
        VigenereCracker vigenereCracker5 = new VigenereCracker(cv5.getCipher());
        System.out.println(vigenereCracker5.getKeyWord());
        System.out.println(vigenereCracker5.getSolved());
        time5.end();
        time5.println();

        Time time7 = new Time();
        VigenereCracker vigenereCracker7 = new VigenereCracker(cv7.getCipher());
        System.out.println(vigenereCracker7.getKeyWord());
        System.out.println(vigenereCracker7.getSolved());
        time7.end();
        time7.println();

        Time time6 = new Time();
        VigenereCracker vigenereCracker6 = new VigenereCracker(cv6.getCipher());
        System.out.println(vigenereCracker6.getKeyWord());
        System.out.println(vigenereCracker6.getSolved());
        time6.end();
        time6.println();
        //        for (CifrarioVigenere cipher: ciphers) {
//            VigenereCracker vigenereCracker = new VigenereCracker(cipher.getCipher());
//            System.out.println(cipher.getKey().length());
////            VigenereDeciphered vigenereDeciphered = new VigenereDeciphered(cipher.getCipher(), new VigenereKeyPhrase(cipher.getKey(), cipher.getCipher().length()).get());
////            System.out.println(vigenereDeciphered.get());
//        }

    }


}
