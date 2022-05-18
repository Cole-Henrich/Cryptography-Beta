



//package sample;
//
//import javafx.application.Application;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = new GraphicTemporaryDebuggingThing();
//
//        primaryStage.setMinWidth(450);
//        primaryStage.setMinHeight(450);
//
//        primaryStage.setTitle("GraphicTemporaryDebuggingThing");
//        primaryStage.setScene(new Scene(root, 500, 500));
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
//


package sample;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("MagicNumber")
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = new StartPage();
        primaryStage.setTitle("Cryptography");
        primaryStage.setScene(new Scene(root, 1440, 800));
        primaryStage.show();
    }
    public static void main(String[] args) throws IOException {
//    test_FindKeyLengthByIndexOfCoincidence();

//blue this launches the UI.
 launch(args);

//        System.err.println("main");
//        EmojEncode2 emojEncode2 = new EmojEncode2("""
//                Strangely enough, I would turn to the Almighty, and say, "If you allow me to live just a few years in the second half of
//                the 20th century, I will be happy."
//                Now that's a strange statement to make, because the world is all messed up. The nation is sick. Trouble is in the
//                land; confusion all around. That's a strange statement. But I know, somehow, that only when it is dark enough can
//                you see the stars. And I see God working in this period of the twentieth century in a way that men, in some strange
//                way, are responding.\s
//
//                """);
//        System.out.println(emojiEncode2.get());
//        PolySymbolicCipher polySymbolicCipher = new PolySymbolicCipher("""
//                somewhere I read of the freedom of assembly. Somewhere I read of the freedom of speech.
//                Somewhere I read of the freedom of press. Somewhere I read that the greatness of America is the right to protest for
//                right.
//                """);
//        FruitCipher fruitCipher = new FruitCipher("""
//                To suggest that war can prevent war is a base play on words and a despicable form of warmongering.
//                The objective of any who sincerely believe in peace clearly must be to exhaust every honorable recourse in the effort to save the peace. The world has had ample evidence that war begets only conditions that beget further war.
//                """);
//        FlagCipher flagCipher = new FlagCipher();
//        SnakeCode snakeCode = new SnakeCode("""
//                "If you live each day as if it was your last, someday you'll most certainly be right."
//                """);
//        HashSterixCipher hashSterixCipher = new HashSterixCipher("""
//                And whenever men and women straighten their backs up, they are going somewhere, because a man
//                can't ride your back unless it is bent.
//                """);
//        DotCommaCipher dotCommaCipher = new DotCommaCipher(
//                "Let justice roll down like waters and righteousness like a mighty stream."
//        );
//        CurlyBracketCipher curlyBracketCipher = new CurlyBracketCipher("""
//                Stony the road we trod,
//                Bitter the chastening rod
//                Felt in the days
//                When hope unborn had died.
//                Yet with a steady beat,
//                Have not our weary feet
//                Come to the place
//                For which our fathers sighed?
//                We have come over the way
//                That with tears hath been watered.
//                We have come treading our paths
//                Through the blood of the slaughtered,
//                Out from the gloomy past,
//                Till now we stand at last
//                Where the bright gleam
//                Of our bright star is cast.
//                """);
//
//        SquareBracketCipher squareBracketCipher = new SquareBracketCipher("""
//                Darker yet may be the night, harder yet may be the fight. Just stand up for that which is right.
//                """);
//                OrBackSlashCipher orBackSlashCipher = new OrBackSlashCipher("""
//                        It seems that I can
//                        hear a voice speaking even this morning, saying to all of us, "Stand up for what is right. Stand up for what is just. Lo,
//                        I will be with you even until the end of the world." Yes, I’ve seen the lightning flash. I’ve heard the thunder roll. I’ve felt
//                        sin-breakers dashing, trying to conquer my soul. But I heard the voice of Jesus saying still to fight on. He promised
//                        never to leave me, never to leave me alone. No, never alone. No, never alone. He promised never to leave me,
//                        never to leave me alone. And I go on in believing that. Reach out and find the breadth of life.
//                        """);
//        BackSlashForwardSlashCipher backSlashForwardSlashCipher = new BackSlashForwardSlashCipher("""
//                You may not be able to define God in philosophical terms. Men through the ages have tried to talk about him. (Yes)
//                Plato said that he was the Architectonic Good. Aristotle called him the Unmoved Mover. Hegel called him the
//                Absolute Whole. Then there was a man named Paul Tillich who called him Being-Itself. We don’t need to know all of
//                these high-sounding terms. (Yes) Maybe we have to know him and discover him another way. (Oh yeah) One day
//                you ought to rise up and say, "I know him because he’s a lily of the valley." (Yes) He’s a bright and morning star.
//                (Yes) He’s a rose of Sharon. He’s a battle-axe in the time of Babylon. (Yes) And then somewhere you ought to just
//                reach out and say, "He’s my everything. He’s my mother and my father. He’s my sister and my brother. He’s a friend
//                to the friendless." This is the God of the universe. And if you believe in him and worship him, something will happen
//                in your life. You will smile when others around you are crying. This is the power of God.
//                """);
//                ColonSemiColonCipher = new ColonSemiColonCipher("""
//                        Go out this morning. Love yourself, and that means rational and healthy self-interest. You are commanded to do that.
//                        That’s the length of life. Then follow that: Love your neighbor as you love yourself. You are commanded to do that.
//                        That’s the breadth of life. And I’m going to take my seat now by letting you know that there’s a first and even greater
//                        commandment: "Love the Lord thy God with all thy heart, (Yeah) with all thy soul, with all thy strength."
//                        """);
//        TildeApostropheCipher = new TildeApostropheCipher("""
//                You can look up and see the
//                morning stars singing together, and the sons of God shouting for joy. When you get all of these working together in
//                your very life, justice will roll down like waters, and righteousness like a mighty stream.
//                When you get all the three of these together, the lamb will lie down with the lion.
//                When you get all three of these together, you look up and every valley will be exalted, and every hill and mountain
//                will be made low; the rough places will be made plain, and the crooked places straight; and the glory of the Lord shall
//                be revealed and all flesh will see it together.
//                When you get all three of these working together, you will do unto others as you’d have them do unto you.
//                When you get all three of these together, you will recognize that out of one blood God made all men to dwell upon
//                the face of the earth.
//                """);
//                PlusEqualsCipher plusEqualsCipher = new PlusEqualsCipher("""
//                        We've got to
//                        stay together and maintain unity. You know, whenever Pharaoh wanted to prolong the period of slavery in Egypt, he
//                        had a favorite, favorite formula for doing it. What was that? He kept the slaves fighting among themselves. But
//                        whenever the slaves get together, something happens in Pharaoh's court, and he cannot hold the slaves in slavery.
//                        When the slaves get together, that's the beginning of getting out of slavery. Now let us maintain unity.
//                        """);
//        DashUnderscoreCipher dashUnderscoreCipher = new DashUnderscoreCipher("""
//                So, first of all, let me assert my firm belief that the only thing we have to fear is fear itself -- nameless, unreasoning, unjustified terror which paralyzes needed efforts to convert retreat into advance.\s
//                """);
//        ParethesesCipher parethesesCipher = new ParethesesCipher("""
//                        Happiness lies not in the mere possession of money; it lies in the joy of achievement, in the thrill of creative effort. The joy, the moral stimulation of work no longer must be forgotten.
//                        """);
//

    }
    private static void test_FindKeyLengthByIndexOfCoincidence(){
        CharSet charSet = new CharSet();
        String MLKCipher = """
                Hsyzz sgi gcdn eabojk, bs xftczsm. Sg T juhnwbpb fd Lszaf Mqyjblrtn ufr sge tfgefczi ufr rcztlgid gzilgrfafxif oyb
                                fwyf hsmgvbl ommgi gqgpjr, X qgbocdtx ovz fq luk hljwxhy ommgi. Cl'g ljipsk uzmp ii zogc kdoj qwmetml tcgqcx sbo
                                yehiuwlrq ii koj qabylvtls vigr lzajn qcf. Yzs Lszaf Mqyjblrtn ck hsc ntml tcgqcx lvlr U wuns tl fwy occjp. X'g
                                vswgswnwr em ety wonf au sgi scdt ngbteti cf gagft ix o dragg oocluca. Qcf pqkysz efmi sgi lpq sylsckucyv hz ea dh
                                sbjfal.
                                Mgaprtxhy wd fmejwbtls xh Esxntxm; kcxcfwcfu tq tpjhsygzv cf cfp idldr. Llp nim yymi, xz A kppq hnsbogzv ul hsc
                                ntaabygzv ix htkq, lclv efq eikgtzuaclm zd fpeabr y wxhv cq eqcyjow yzs jsbzpmbcu jtci dz lvp utdfw cq fgbuf vtqfdlq ia
                                ra cio, oyb fwy Szxgswnq glgp ii es, "Xydicf Zfrttl Cwye, iwcuv leq limzo waj fayp ra acns tl?" U limzo rmzy em
                                xcziud twgswn tm Peken sbo G idodr hyfrb Yco'q owcdrccz xh lvpgd buybtduryfh epqz zjcx rtt xsfv bgcawcyq au Yymar
                                fwlgirf, ag lshscd pwjcdq fwy Jso Qqp, nzfzssw nzs hgxsyjbpqe dh lchyds nzs apabckso jmcx. Sbo gz hjahp mr xnk
                                alezxzaqplot, C ocfjpc'n khzn fwyjs.
                                T uajfv aztq dh tm Rpqtww oyb fpew aj kucx lc Xmgcn Gzjkbjm. Sbo G idodr dcq Efshz, Ydxmlcejq, Hiuflrqh,
                                Ymftnusyk oyb Mgckhzntphwg lqetgtzpb mgimbo rtt Jsfefqcif. Oyb U limzo umiwz hscy plgiyb fwy Hocrtthgb lq
                                fwyq rtqojmkso rtt ajslr mcx whppzpf agdsqh ix fpyxxnq. Pfr U limzol'f hngd efqgy.
                                A kzsxs ag cy, chth lc efq vlwoe fqnxsm zd fwy Jcxyz Tghwcc. Mcx A kzsxs mws ochtfgdxczim sfzszs nzscc, fwlgirf
                                hplacfq qbjwfzpe phv zpyptlk. Pfr U limzol'f hngd efqgy.
                                A kzsxs ynsy aaby md em fwy voj mr ibw Fplmxmkoyaq, phv upr m foaqv nurnmfp mr pfd hsyf ibw Fplmxmkoyaq scv tzp fwy
                                uiwrggud oyb mtmlvprur fatp mr buf. Pfr U limzol'f hngd efqgy.
                                A kzsxs ynsy ea qs lvp umn nzoe rtt gsb qmd lbga T yy cueso fms bag synxnsh. Llp X qgiwb ipnuv Xydicf Zfrttl sg
                                sc fpwcso fuh habprk-ucns efqhyk cy rtt xgcc yf ibw qssdrb gt Hgfiyfppps. Qol W hmgaxf'h drae nzscc.
                                U limzo aaby gb fn qkyf hz 1863, yzs qshnf m kuuwwjmicfu Apqhcvsyr nn nzs yyyt ix Ompmwue Ztlodff ttlmafq qzkq ii
                                lvp aacwdidgac nzoe fq wuv hz quvh lvp Cyphuwayfxif Dcmoaueoegac. Vmh T uajfvb'e qfdj lvppq.
                                X qgiwb qkyf qzkq jj lc efq tujzj rtxllwpq, mcx ksp y yph yflnbacfu hgfw nzs apaqfwad mr ibw pllwgohhnw au bag yyfxif.
                                Oyb odgw ktrt ph wzzogthl qcw fwul kp fmky fcefuca lc qcmg vmh "qcmg clgpjr." Qol W hmgaxf'h drae nzscc.
                                Eilsbrcxn yfcfet, X qgiwb fjlf hz rtt Udatetis, sbo qmn, "Cx mzs mafgk xc fd fajp hghn s tpu ktujg tl fwy ksnmzs bszq mr
                                ibw 20hs aqcnmfj, G ixfd pp fmejq."
                                Bzu fwul'g l qfgufup qfpnwaplf ii eovc, ntwsidc fwy occjp xm szw kqhmwr fn. Fwy foegac ck gtaw. Ilgimjq xm ab efq
                                aufr; nmzuokwzl maf sfzszs. Nzoe'q m hnjoyeq hnshpkqcn. Tie G wcio, gzkqwio, hsyf dhdm hfqc cl wd bmge wbzssw wsb
                                jmg hyw hsc eiujg. Llp X mws Rmp lijytls xh lvtq btlaco mr ibw hhczicwhs aqcnmfj gz p qsm efmi gwb, tl edgw gepmcaw
                                klw, mgy jsdnacxabr.s

                                59
                                Qabylvtls xm zoanqccfu tl ajl occjp. Ibw alqetm gt acaefw occ dxmabr sb. Phv kscdtpwf efqn ujs lqetgtzpb fdxsm,
                                hfqibwf efqn ujs tl Vdbsbyceqoju, Dmgib Stcgop; Hswcmnx, Ewbjy; Mrwjo, Rfmcu; Fsh Wage Uwew; Mifsbey, Stijuty;
                                Vpwcgzl, Yxmkwdqueja; cc Kqbjzwd, Rqchwgdcq -- ibw qcw uh udklwe ibw glkq: "Ly ooyr fd vw tccq."
                                Phv oymfwyj fpyedh lvlr U'b bsdaw fd fajp gz ibag acdxiv wd rtpn os syht vwsy dagwwr em m eiabe uttlw kp ydt agwye fd
                                bsjp ra vlsdajq lclv efq elgpwcyh nzoe kqc bsjp zqth lfjgzv ng ucybefw ktrt ibjcfet wckhzpk, qol hsc ptgsboq pxxf'h
                                qmdry lvpk fd xg we. Qggpajlj ptgsboq fwul kp edpjhzp uuib lvpk. Yth, xcc wqplk bzu, tppw ppcz iudytls pvgie umg
                                ufr acmry. Tie lal, hg zzlstl uoy rtts bidr fpfc ommgi cl. We ge ci dcyeqg u uvzgot vwhhcqc pacwczry sbo lacpacwczry
                                ab efuh qgfwb; ui'm fcytudfwbnc ag hgbpvuhnwbnc. Fwul wd uttlw kp ydt ngrlw.
                                Mcx szdm uc nzs ssyph jwrffh lwjzjgicgb, td edgwhsgzv ckb'e bacy, sbo bacy ab l fgglq, hz zdxhy hsc odfgfpb btihzpq au
                                nzs hmdax gie mr ibwwc jaca qslpe dz hcgcdis, lvpgd aifu jcmgm gt ssdi ufr ycsayuh, efq lbgzp uagfv wd badgwr. Ymi, X'g
                                bidr tpjhm efmi Agr sye pfdchcp by lc wght cf hsge eyjwzb fd mws hfmi ck iydaaxabr. Yzs C'e vlnbn nzoe Fq'h udzzuqs
                                gw hz zq xh Esxntxm.
                                A qll dtgwamcd -- X wsb ccytgtsc utth Fsrpatm oscc vjml uzgzv ujcflp pm Jownt wuk glgp, hi gtecz, hwjoeatxhy
                                kscdt nzsj bush'l weat, phv zlsswcfu hfqc nzsj uqgy fce ruredso. Zgi nzoe bmn ck owj akyj. Kp kqph tidgztmk bzu, mcx
                                os lpq sylsckucyv hz emxh gic puvbltfj bauus tl Sdx'k kzpxs.
                                Ufr efmi'm szw rtxm ovzjq ibabr ge pvgie. Uq plwb'e czvuyso gz phq bpemicns apaiykh llp xh sbj lqvulwgc mgamaplfh
                                qahs yznvgrj. Uq plw glwuca lvlr it ujs ocftlewycp ii ts xcz. Ly sfp bqiyjatlqs ng pp nqdjds. Hc mgy kojgzv --
                                Qw occ epsabr rtpn os lpq Viv'g nfuaxjsy. Yzs nzoe uq plw Uzb'e rbazopqc, qw rzl'f wuns em xxpw ztiq ly sfp dagwwr em
                                xxpw.""";
        System.out.println(charSet.findKeyLengthByIndexOfCoincidenceAndKasiski(MLKCipher, 3));

    }
    private static void test_indexOfCoincidence(){
        CharSet charSet = new CharSet();
        File reservoir = charSet.getLanguage_Manipulation_UniqueWords_TrainerReservoir();
        double inEnglishReservoir = charSet.indexOfCoincidenceIn(reservoir.toString());
        System.out.println(inEnglishReservoir);
        double inMLKVigenereCipher = charSet.indexOfCoincidenceIn("""
                hsyzz sgi gcdn eabojk, bs xftczsm. sg t juhnwbpb fd lszaf mqyjblrtn ufr sge tfgefczi ufr rcztlgid gzilgrfafxif oyb
                fwyf hsmgvbl ommgi gqgpjr, x qgbocdtx ovz fq luk hljwxhy ommgi. cl'g ljipsk uzmp ii zogc kdoj qwmetml tcgqcx sbo
                yehiuwlrq ii koj qabylvtls vigr lzajn qcf. yzs lszaf mqyjblrtn ck hsc ntml tcgqcx lvlr u wuns tl fwy occjp. x'g
                vswgswnwr em ety wonf au sgi scdt ngbteti cf gagft ix o dragg oocluca. qcf pqkysz efmi sgi lpq sylsckucyv hz ea dh
                sbjfal.""");
        System.out.println(inMLKVigenereCipher);

    }
    private static void test_vigenere_deciphered(){
        System.err.println("test_vigenere_deciphered");

        VigenereDeciphered vigenereDeciphered = new VigenereDeciphered("""
                Hsyzz sgi gcdn eabojk, bs xftczsm. Sg T juhnwbpb fd Lszaf Mqyjblrtn ufr sge tfgefczi ufr rcztlgid gzilgrfafxif oyb
                fwyf hsmgvbl ommgi gqgpjr, X qgbocdtx ovz fq luk hljwxhy ommgi. Cl'g ljipsk uzmp ii zogc kdoj qwmetml tcgqcx sbo
                yehiuwlrq ii koj qabylvtls vigr lzajn qcf. Yzs Lszaf Mqyjblrtn ck hsc ntml tcgqcx lvlr U wuns tl fwy occjp. X'g
                vswgswnwr em ety wonf au sgi scdt ngbteti cf gagft ix o dragg oocluca. Qcf pqkysz efmi sgi lpq sylsckucyv hz ea dh
                sbjfal.
                Mgaprtxhy wd fmejwbtls xh Esxntxm; kcxcfwcfu tq tpjhsygzv cf cfp idldr. Llp nim yymi, xz A kppq hnsbogzv ul hsc
                ntaabygzv ix htkq, lclv efq eikgtzuaclm zd fpeabr y wxhv cq eqcyjow yzs jsbzpmbcu jtci dz lvp utdfw cq fgbuf vtqfdlq ia
                ra cio, oyb fwy Szxgswnq glgp ii es, "Xydicf Zfrttl Cwye, iwcuv leq limzo waj fayp ra acns tl?" U limzo rmzy em
                xcziud twgswn tm Peken sbo G idodr hyfrb Yco'q owcdrccz xh lvpgd buybtduryfh epqz zjcx rtt xsfv bgcawcyq au Yymar
                fwlgirf, ag lshscd pwjcdq fwy Jso Qqp, nzfzssw nzs hgxsyjbpqe dh lchyds nzs apabckso jmcx. Sbo gz hjahp mr xnk
                alezxzaqplot, C ocfjpc'n khzn fwyjs.
                T uajfv aztq dh tm Rpqtww oyb fpew aj kucx lc Xmgcn Gzjkbjm. Sbo G idodr dcq Efshz, Ydxmlcejq, Hiuflrqh,
                Ymftnusyk oyb Mgckhzntphwg lqetgtzpb mgimbo rtt Jsfefqcif. Oyb U limzo umiwz hscy plgiyb fwy Hocrtthgb lq
                fwyq rtqojmkso rtt ajslr mcx whppzpf agdsqh ix fpyxxnq. Pfr U limzol'f hngd efqgy.
                A kzsxs ag cy, chth lc efq vlwoe fqnxsm zd fwy Jcxyz Tghwcc. Mcx A kzsxs mws ochtfgdxczim sfzszs nzscc, fwlgirf
                hplacfq qbjwfzpe phv zpyptlk. Pfr U limzol'f hngd efqgy.
                A kzsxs ynsy aaby md em fwy voj mr ibw Fplmxmkoyaq, phv upr m foaqv nurnmfp mr pfd hsyf ibw Fplmxmkoyaq scv tzp fwy
                uiwrggud oyb mtmlvprur fatp mr buf. Pfr U limzol'f hngd efqgy.
                A kzsxs ynsy ea qs lvp umn nzoe rtt gsb qmd lbga T yy cueso fms bag synxnsh. Llp X qgiwb ipnuv Xydicf Zfrttl sg
                sc fpwcso fuh habprk-ucns efqhyk cy rtt xgcc yf ibw qssdrb gt Hgfiyfppps. Qol W hmgaxf'h drae nzscc.
                U limzo aaby gb fn qkyf hz 1863, yzs qshnf m kuuwwjmicfu Apqhcvsyr nn nzs yyyt ix Ompmwue Ztlodff ttlmafq qzkq ii
                lvp aacwdidgac nzoe fq wuv hz quvh lvp Cyphuwayfxif Dcmoaueoegac. Vmh T uajfvb'e qfdj lvppq.
                X qgiwb qkyf qzkq jj lc efq tujzj rtxllwpq, mcx ksp y yph yflnbacfu hgfw nzs apaqfwad mr ibw pllwgohhnw au bag yyfxif.
                Oyb odgw ktrt ph wzzogthl qcw fwul kp fmky fcefuca lc qcmg vmh "qcmg clgpjr." Qol W hmgaxf'h drae nzscc.
                Eilsbrcxn yfcfet, X qgiwb fjlf hz rtt Udatetis, sbo qmn, "Cx mzs mafgk xc fd fajp hghn s tpu ktujg tl fwy ksnmzs bszq mr
                ibw 20hs aqcnmfj, G ixfd pp fmejq."
                Bzu fwul'g l qfgufup qfpnwaplf ii eovc, ntwsidc fwy occjp xm szw kqhmwr fn. Fwy foegac ck gtaw. Ilgimjq xm ab efq
                aufr; nmzuokwzl maf sfzszs. Nzoe'q m hnjoyeq hnshpkqcn. Tie G wcio, gzkqwio, hsyf dhdm hfqc cl wd bmge wbzssw wsb
                jmg hyw hsc eiujg. Llp X mws Rmp lijytls xh lvtq btlaco mr ibw hhczicwhs aqcnmfj gz p qsm efmi gwb, tl edgw gepmcaw
                klw, mgy jsdnacxabr.\s

                59
                Qabylvtls xm zoanqccfu tl ajl occjp. Ibw alqetm gt acaefw occ dxmabr sb. Phv kscdtpwf efqn ujs lqetgtzpb fdxsm,
                hfqibwf efqn ujs tl Vdbsbyceqoju, Dmgib Stcgop; Hswcmnx, Ewbjy; Mrwjo, Rfmcu; Fsh Wage Uwew; Mifsbey, Stijuty;
                Vpwcgzl, Yxmkwdqueja; cc Kqbjzwd, Rqchwgdcq -- ibw qcw uh udklwe ibw glkq: "Ly ooyr fd vw tccq."
                Phv oymfwyj fpyedh lvlr U'b bsdaw fd fajp gz ibag acdxiv wd rtpn os syht vwsy dagwwr em m eiabe uttlw kp ydt agwye fd
                bsjp ra vlsdajq lclv efq elgpwcyh nzoe kqc bsjp zqth lfjgzv ng ucybefw ktrt ibjcfet wckhzpk, qol hsc ptgsboq pxxf'h
                qmdry lvpk fd xg we. Qggpajlj ptgsboq fwul kp edpjhzp uuib lvpk. Yth, xcc wqplk bzu, tppw ppcz iudytls pvgie umg
                ufr acmry. Tie lal, hg zzlstl uoy rtts bidr fpfc ommgi cl. We ge ci dcyeqg u uvzgot vwhhcqc pacwczry sbo lacpacwczry
                ab efuh qgfwb; ui'm fcytudfwbnc ag hgbpvuhnwbnc. Fwul wd uttlw kp ydt ngrlw.
                Mcx szdm uc nzs ssyph jwrffh lwjzjgicgb, td edgwhsgzv ckb'e bacy, sbo bacy ab l fgglq, hz zdxhy hsc odfgfpb btihzpq au
                nzs hmdax gie mr ibwwc jaca qslpe dz hcgcdis, lvpgd aifu jcmgm gt ssdi ufr ycsayuh, efq lbgzp uagfv wd badgwr. Ymi, X'g
                bidr tpjhm efmi Agr sye pfdchcp by lc wght cf hsge eyjwzb fd mws hfmi ck iydaaxabr. Yzs C'e vlnbn nzoe Fq'h udzzuqs
                gw hz zq xh Esxntxm.
                A qll dtgwamcd -- X wsb ccytgtsc utth Fsrpatm oscc vjml uzgzv ujcflp pm Jownt wuk glgp, hi gtecz, hwjoeatxhy
                kscdt nzsj bush'l weat, phv zlsswcfu hfqc nzsj uqgy fce ruredso. Zgi nzoe bmn ck owj akyj. Kp kqph tidgztmk bzu, mcx
                os lpq sylsckucyv hz emxh gic puvbltfj bauus tl Sdx'k kzpxs.
                Ufr efmi'm szw rtxm ovzjq ibabr ge pvgie. Uq plwb'e czvuyso gz phq bpemicns apaiykh llp xh sbj lqvulwgc mgamaplfh
                qahs yznvgrj. Uq plw glwuca lvlr it ujs ocftlewycp ii ts xcz. Ly sfp bqiyjatlqs ng pp nqdjds. Hc mgy kojgzv --
                Qw occ epsabr rtpn os lpq Viv'g nfuaxjsy. Yzs nzoe uq plw Uzb'e rbazopqc, qw rzl'f wuns em xxpw ztiq ly sfp dagwwr em
                xxpw.""", "olympus");
        System.out.println(vigenereDeciphered.get());
    }
    private static void printBooleans(){
        CharSet cs = new CharSet();
        char[] alphabet = cs.getAlphabet();
        for (char c : alphabet) {
            System.out.println("boolean has" + (String.valueOf(c)).toUpperCase() + " = false;\n");
        }
    }

    private static void testLengthFunction(){
        File trainer = new File("/Users/cole.henrich/Documents/MOOD/Ciphers/src/Language_Manipulation_Unique-Words_Trainer-Reservoir.txt");
        System.out.println(trainer.length());
        System.out.println("4,973,696 bytes (5 MB on disk)");
    }
    //  'a','b','c','d','e','f','g', red <--6
    //  'h','i','j','k','l','m',  'n', yellow <--13
    //  'o','p','q','r','s','t', green <--19
    //   'u','v','w','x','y','z' blue <--25
    private static void testWriter() throws IOException {
        File TestWriter = new File("/Users/cole.henrich/Documents/MOOD/Ciphers/src/TestWriter.java");
        FileWriter writer = new FileWriter(TestWriter);
        writer.write("""
                public class TestWriter {
                    public TestWriter(){
                        //can you write to a java file? YES YOU CAN!!!!! LET'S GO!!!
                    }
                }
                """);
        writer.close();
    }

    private static void test_caesar_cracker() throws IOException {
        CaesarCracker caesarCracker = new CaesarCracker(
                """
Gur fvta unq nccrnerq bireavtug. Ba ovyyobneqf naq gerrf naq gur onpxf bs gur ohf-fgbc orapurf. Vg uhat va gur jvaqbj bs Jbbyjbegu’f. Vg uhat ol gur ragenapr gb gur LZPN. Vg jnf fgncyrq gb gur qbbe bs gur zhavpvcny pbheg naq anvyrq, ng rlr yriry, gb rirel gryrcubar cbyr nybat Havirefvgl Nirahr. Gur jbzna jnf ergheavat n obbx gb gur yvoenel jura fur fnj gur fvta va n cbfg bssvpr jvaqbj. Vg jnf n fhaal qnl va Orexryrl va gur fcevat bs 1942 naq fur jnf jrnevat arj tynffrf naq pbhyq frr rirelguvat pyrneyl sbe gur svefg gvzr va jrrxf. Fur ab ybatre unq gb fdhvag ohg fur fdhvagrq bhg bs unovg naljnl. Fur ernq gur fvta sebz gbc gb obggbz naq gura, fgvyy fdhvagvat, fur gbbx bhg n cra naq ernq gur fvta sebz gbc gb obggbz ntnva. Gur cevag jnf fznyy naq qnex. Fbzr bs vg jnf gval. Fur jebgr qbja n srj jbeqf ba gur onpx bs n onax erprvcg, gura ghearq nebhaq naq jrag ubzr naq ortna gb cnpx.

Jura gur bireqhr abgvpr sebz gur yvoenel neevirq va gur znvy avar qnlf yngre fur fgvyy unq abg svavfurq cnpxvat. Gur puvyqera unq whfg yrsg sbe fpubby naq obkrf naq fhvgpnfrf jrer fpnggrerq npebff gur sybbe bs gur ubhfr. Fur gbffrq gur rairybcr vagb gur arnerfg fhvgpnfr naq jnyxrq bhg gur qbbe.

Bhgfvqr gur fha jnf jnez naq gur cnyz sebaqf jrer pynpxvat vqyl ntnvafg gur fvqr bs gur ubhfr. Fur chyyrq ba ure juvgr fvyx tybirf naq ortna gb jnyx rnfg ba Nfuol. Fur pebffrq Pnyvsbeavn Fgerrg naq obhtug frireny onef bs Yhk fbnc naq n ynetr wne bs snpr pernz ng gur Ehzsbeq Cuneznpl. Fur cnffrq gur guevsg fubc naq gur obneqrq-hc tebprel ohg fnj ab bar fur xarj ba gur fvqrjnyx. Ng gur arjffgnaq ba gur pbeare bs Tebir fur obhtug n pbcl bs gur Orexryrl Tnmrggr. Fur fpnaarq gur urnqyvarf dhvpxyl. Gur Ohezn Ebnq unq orra frirerq naq bar bs gur Qvbaar dhvaghcyrgf—Libaar—jnf fgvyy erpbirevat sebz na rne bcrengvba. Fhtne engvbavat jbhyq ortva ba Ghrfqnl. Fur sbyqrq gur cncre va unys ohg jnf pnershy abg gb yrg gur vax qnexra ure tybirf.

Ng Yhaql’f Uneqjner fur fgbccrq naq ybbxrq ng gur qvfcynl bs ivpgbel tneqra fubiryf va gur jvaqbj. Gurl jrer jryy-znqr fubiryf jvgu fgheql zrgny unaqyrf naq fur gubhtug, sbe n zbzrag, bs ohlvat bar—gur cevpr jnf evtug naq fur qvq abg yvxr gb cnff hc n onetnva. Gura fur erzrzorerq gung fur nyernql unq n fubiry ng ubzr va gur furq. Va snpg, fur unq gjb. Fur qvq abg arrq n guveq. Fur fzbbgurq qbja ure qerff naq jrag vagb gur fgber.


                        """);
        System.out.println(caesarCracker.getSolved());
        System.out.println(caesarCracker.getShift());
        System.out.println(caesarCracker.getSolution());
    }

}
