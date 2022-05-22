package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class not_french {
    private boolean not_french;
    private int validWords;
    private int docLength;
    private double validityFactor;
    private ArrayList<String> words;
    private BigArrayStore biggy;
    private double cutoff;
    private final CharSet charSet = new CharSet(true);

    public not_french(String string, boolean ignoreSpaces, boolean ignorePunctuation) throws InterruptedException {
        this(string, ignoreSpaces, ignorePunctuation, true, false, 0);
    }
    public not_french(String string, boolean ignoreSpaces, boolean ignorePuncuation, boolean optimize, boolean calculateCutoff, double Cutoff) throws InterruptedException {

        cutoff = Cutoff;
        if (ignorePuncuation) {
            string = charSet.removeIgnorers(string, new String[]{" "});
        }
        if (ignoreSpaces){
            string = string.replaceAll(" ", "");
        }
        if (calculateCutoff) {
            cutoff = calculateCutoff();
        }
        String[] textSplit = string.split(" ");
        docLength = textSplit.length;
        biggy = new BigArrayStore();
        words = biggy.central();
        int validWords = 0;
        for (int i = 0; i < textSplit.length; i++) {
            String word = textSplit[i];
            if (optimize){
                if (i >= 10) {
                    if (validWords <= 2) {
                        not_french = true;
                        break;
                    } else {
                        if (i >= 15){
                            if ( validWords <= 3){
                                not_french = true;
                                break;
                            }
                            else {
                                if (i == 20){
                                    if ( validWords <= 8){
                                        not_french = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (words.contains(charSet.RemoveIgnorers(word))) {
                validWords++;
                validityFactor = (double) validWords / (double) docLength;
                not_french = (validWords <= (cutoff * docLength));
                if (optimize) {
                    if (!not_french) {
                        break;
                    }
                }
            }
        }
        this.validWords = validWords;
//        this.validityFactor = (double)validWords/(double)docLength;
//        not_french = (validWords <= (cutoff*docLength));


//        System.out.println(string);
//        biggy = new BigArrayStore();
//        words = biggy.central();
//        this.docLength = string.length();
//        int validWords = 0;
//        int wordsCounted = 0;
//        boolean Break = false;
////        for (int i = fromInclusive; i >= toInclusive; i--) {
////            String[] split = charSet.split(string, i);
////            for (String str : split) {
////                wordsCounted++;
////                for (String word : words) {
////                    validityFactor = ((double) validWords) / ((double) wordsCounted);
////                    this.not_french = validityFactor < cutoff;
////                    if (str.equalsIgnoreCase(word)) {
////                        System.out.println(word);
////                        validWords++;
////                        break;
////                    }
////                    if (optimize) {
////                        if (!not_french) {
////                            Break = true;
////                            this.validWords = validWords;
////                            break;
////                        }
////                    }
////                    if (optimize && Break){
////                        break;
////                    }
////                }
////            }
////            if (optimize && Break){
////                break;
////            }
////        }
    }
    public not_french(File file) throws FileNotFoundException {
        this(file, CharSet.EngMinValidityFactor);
    }
    public not_french(String string) throws InterruptedException {
        this(string, CharSet.EngMinValidityFactor);
    }
    public not_french(File file, double cutoff) throws FileNotFoundException {
        this(file, cutoff, false);
    }
    public not_french(File file, double cutoff, boolean optimize) throws FileNotFoundException {
        this.cutoff = cutoff;
        biggy = new BigArrayStore();
        words = biggy.central();
        int docLength = 0;
        Scanner counter = new Scanner(file);
        while (counter.hasNext()){if (counter.next() != null){docLength++;}}
        this.docLength = docLength;

        int validWords = 0;
        Scanner reader = new Scanner(file);
        int i = 0;
        while (reader.hasNext()) {
            if (optimize){
                if (i >=8 ) {
                    if (validWords < 4){
                        not_french = true;
                        break;
                    }
                    else {
                        if (i >= 10) {
                            if (validWords < 5) {
                                not_french = true;
                                break;
                            } else {
                                if (i >= 16) {
                                    if (validWords <= 9) {
                                        not_french = true;
                                        break;
                                    } else {
                                        if (i >= 20) {
                                            if (validWords <= 12) {
                                                not_french = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (words.contains(charSet.removeIgnorers(reader.next(), new String[]{""}))){
                validWords++;
                if (optimize){
                    validityFactor = (double)validWords/(double)docLength;
                    not_french = (validWords <= (cutoff*docLength));
                    if (!not_french){
                        break;
                    }
                }
            }
            i++;
        }
        this.validWords = validWords;
//        biggy = new BigArrayStore();
//        words = biggy.central();
//        int docLength = 0;
//        Scanner counter = new Scanner(file);
//        while (counter.hasNext()){if (counter.next() != null){docLength++;}}
//        this.docLength = docLength;
//
//        int validWords = 0;
//        Scanner reader = new Scanner(file);
//        while (reader.hasNext()) {
//            if (words.contains(charSet.removeIgnorers(reader.next(), new String[]{""}))){
//                validWords++;
//                if (optimize){
//                    validityFactor = (double)validWords/(double)docLength;
//                    not_french = (validWords <= (cutoff*docLength));
//                    if (!not_french){
//                        break;
//                    }
//                }
//            }
//        }
//        this.validWords = validWords;
//        validityFactor = (double)validWords/(double)docLength;
//        not_french = (validWords <= (cutoff*docLength));
    }
    public not_french(String string, double cutoff) throws InterruptedException {
        this(string, false, true, true, false, cutoff);
    }

    public double getCutoff() {
        return cutoff;
    }
    public double getValidityFactor() {return validityFactor;}
    public boolean not_french(){return not_french;}
    public int getValidWords(){return validWords;}
    public int getDocLength(){return docLength;}

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        test_ValidityFactorInVigenereCipher();
    }
    private static void test_ValidityFactorInVigenereCipher() throws InterruptedException {
        String vigenereEncoded = """
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

                                Uyskatyx xr Qpdih st Xxtteqwxicx gwlpa rci pbiibs qygxvtc xweb iz vtqcklp uvcb Zjumqt, lrs hwhbyppwutgpxwdy xd lcao ech scusn ebn Zjumqt zj wsbdc, Xgygi zv Evcutx jrrtc xwi Ictxth Gilxtw: pje xwi Dpcxn gccgmrxss dlppz cpztvhwpptwg qp pxepap ech gjmntgh iz Mchwreqtrh, Icmpp, Xjokbibi lrs Tictwwqsce, ergcgomck hd Wel.
                """;
        not_french not_french = new not_french(vigenereEncoded, false, true, false, false, 0);
        System.out.println(not_french.getValidityFactor());

    }
    private static void test_a() throws FileNotFoundException, InterruptedException {
        sample.not_french not_french1 = new not_french("""
                There's a core principle that we will apply to all of our actions.  Even as we clean up the mess at Guantanamo, we will constantly reevaluate our approach, subject our decisions to review from other branches of government, as well as the public.  We seek the strongest and most sustainable legal framework for addressing these issues in the long term -- not to serve immediate politics, but to do what's right over the long term.  By doing that we can leave behind a legacy that outlasts my administration, my presidency, that endures for the next President and the President after that -- a legacy that protects the American people and enjoys a broad legitimacy at home and abroad.

                Now, this is what I mean when I say that we need to focus on the future.  I recognize that many still have a strong desire to focus on the past.  When it comes to actions of the last eight years, passions are high.  Some Americans are angry; others want to re-fight debates that have been settled, in some cases debates that they have lost.  I know that these debates lead directly, in some cases, to a call for a fuller accounting, perhaps through an independent commission.

                I've opposed the creation of such a commission because I believe that our existing democratic institutions are strong enough to deliver accountability.  The Congress can review abuses of our values, and there are ongoing inquiries by the Congress into matters like enhanced interrogation techniques.  The Department of Justice and our courts can work through and punish any violations of our laws or miscarriages of justice.

                It's no secret there is a tendency in Washington to spend our time pointing fingers at one another.  And it's no secret that our media culture feeds the impulse that lead to a good fight and good copy.  But nothing will contribute more than that than a extended relitigation of the last eight years.  Already, we've seen how that kind of effort only leads those in Washington to different sides to laying blame.  It can distract us from focusing our time, our efforts, and our politics on the challenges of the future.

                We see that, above all, in the recent debate -- how the recent debate has obscured the truth and sent people into opposite and absolutist ends.  On the one side of the spectrum, there are those who make little allowance for the unique challenges posed by terrorism, and would almost never put national security over transparency.  And on the other end of the spectrum, there are those who embrace a view that can be summarized in two words:  "Anything goes."  Their arguments suggest that the ends of fighting terrorism can be used to justify any means, and that the President should have blanket authority to do whatever he wants -- provided it is a President with whom they agree.

                Both sides may be sincere in their views, but neither side is right.  The American people are not absolutist, and they don't elect us to impose a rigid ideology on our problems.  They know that we need not sacrifice our security for our values, nor sacrifice our values for our security, so long as we approach difficult questions with honesty and care and a dose of common sense.  That, after all, is the unique genius of America.  That's the challenge laid down by our Constitution.  That has been the source of our strength through the ages.  That's what makes the United States of America different as a nation.

                I can stand here today, as President of the United States, and say without exception or equivocation that we do not torture, and that we will vigorously protect our people while forging a strong and durable framework that allows us to fight terrorism while abiding by the rule of law.  Make no mistake:  If we fail to turn the page on the approach that was taken over the past several years, then I will not be able to say that as President.  And if we cannot stand for our core values, then we are not keeping faith with the documents that are enshrined in this hall.

                The Framers who drafted the Constitution could not have foreseen the challenges that have unfolded over the last 222 years.  But our Constitution has endured through secession and civil rights, through World War and Cold War, because it provides a foundation of principles that can be applied pragmatically; it provides a compass that can help us find our way.  It hasn't always been easy.  We are an imperfect people.  Every now and then, there are those who think that America's safety and success requires us to walk away from the sacred principles enshrined in this building.  And we hear such voices today.  But over the long haul the American people have resisted that temptation.  And though we've made our share of mistakes, required some course corrections, ultimately we have held fast to the principles that have been the source of our strength and a beacon to the world.

                Now this generation faces a great test in the specter of terrorism.  And unlike the Civil War or World War II, we can't count on a surrender ceremony to bring this journey to an end.  Right now, in distant training camps and in crowded cities, there are people plotting to take American lives.  That will be the case a year from now, five years from now, and -- in all probability -- 10 years from now.  Neither I nor anyone can stand here today and say that there will not be another terrorist attack that takes American lives.  But I can say with certainty that my administration -- along with our extraordinary troops and the patriotic men and women who defend our national security -- will do everything in our power to keep the American people safe.  And I do know with certainty that we can and will defeat al Qaeda.  Because the terrorists can only succeed if they swell their ranks and alienate America from our allies, and they will never be able to do that if we stay true to who we are, if we forge tough and durable approaches to fighting terrorism that are anchored in our timeless ideals.  This must be our common purpose""");
        not_french not_french3 = new not_french("""
                PREAMBLE
                We the People of the United States, in Order to form a more perfect Union, establish Justice, insure domestic Tranquility, provide for the common defense, promote the general Welfare, and secure the Blessings of Liberty to ourselves and our Posterity, do ordain and establish this Constitution for the United States of America.
                                
                Article I
                Section 1
                All legislative Powers herein granted shall be vested in a Congress of the United States, which shall consist of a Senate and House of Representatives.
                                
                Section 2
                The House of Representatives shall be composed of Members chosen every second Year by the People of the several States, and the Electors in each State shall have the Qualifications requisite for Electors of the most numerous Branch of the State Legislature.
                                
                No Person shall be a Representative who shall not have attained to the Age of twenty five Years, and been seven Years a Citizen of the United States, and who shall not, when elected, be an Inhabitant of that State in which he shall be chosen.
                                
                Representatives and direct Taxes shall be apportioned among the several States which may be included within this Union, according to their respective Numbers, which shall be determined by adding to the whole Number of free Persons, including those bound to Service for a Term of Years, and excluding Indians not taxed, three fifths of all other Persons. The actual Enumeration shall be made within three Years after the first Meeting of the Congress of the United States, and within every subsequent Term of ten Years, in such Manner as they shall by Law direct. The Number of Representatives shall not exceed one for every thirty Thousand, but each State shall have at Least one Representative; and until such enumeration shall be made, the State of New Hampshire shall be entitled to chuse three, Massachusetts eight, Rhode-Island and Providence Plantations one, Connecticut five, New-York six, New Jersey four, Pennsylvania eight, Delaware one, Maryland six, Virginia ten, North Carolina five, South Carolina five, and Georgia three.
                                
                When vacancies happen in the Representation from any State, the Executive Authority thereof shall issue Writs of Election to fill such Vacancies.
                                
                The House of Representatives shall chuse their Speaker and other Officers; and shall have the sole Power of Impeachment.
                                
                Section 3
                The Senate of the United States shall be composed of two Senators from each State, chosen by the Legislature thereof, for six Years; and each Senator shall have one Vote.
                                
                Immediately after they shall be assembled in Consequence of the first Election, they shall be divided as equally as may be into three Classes. The Seats of the Senators of the first Class shall be vacated at the Expiration of the second Year, of the second Class at the Expiration of the fourth Year, and of the third Class at the Expiration of the sixth Year, so that one third may be chosen every second Year; and if Vacancies happen by Resignation, or otherwise, during the Recess of the Legislature of any State, the Executive thereof may make temporary Appointments until the next Meeting of the Legislature, which shall then fill such Vacancies.
                                
                No Person shall be a Senator who shall not have attained to the Age of thirty Years, and been nine Years a Citizen of the United States, and who shall not, when elected, be an Inhabitant of that State for which he shall be chosen.
                                
                The Vice President of the United States shall be President of the Senate, but shall have no Vote, unless they be equally divided.
                                
                The Senate shall chuse their other Officers, and also a President pro tempore, in the Absence of the Vice President, or when he shall exercise the Office of President of the United States.
                                
                The Senate shall have the sole Power to try all Impeachments. When sitting for that Purpose, they shall be on Oath or Affirmation. When the President of the United States is tried, the Chief Justice shall preside: And no Person shall be convicted without the Concurrence of two thirds of the Members present.
                                
                Judgment in Cases of Impeachment shall not extend further than to removal from Office, and disqualification to hold and enjoy any Office of honor, Trust or Profit under the United States: but the Party convicted shall nevertheless be liable and subject to Indictment, Trial, Judgment and Punishment, according to Law""");

        System.out.println(not_french1.getValidityFactor());
        System.out.println(not_french1.not_french());
        not_french not_french2 = new not_french(new File("src/sample/obama_not_french_test"));
        System.out.println(not_french2.getValidityFactor());
        System.out.println(not_french2.not_french());
        System.out.println(not_french3.getValidityFactor());
        System.out.println(not_french3.not_french());

    }
    private static void test_not_french() throws FileNotFoundException {
        String[] pathnames = new String[]{"src/sample/document.txt", "src/sample/spanish.txt", "src/sample/russian.txt", "src/sample/obama.txt", "src/sample/belides_english.txt", "src/sample/orpheus_latin.txt", "src/sample/french.txt", "src/sample/stringStorer.txt"};
        for (String pathname : pathnames) {
            File document = new File(pathname);
            not_french not_french = new not_french(document);
            System.out.println(("\n\n" + pathname +
                    "\n" + not_french.not_french() +
                    "\n" + not_french.getDocLength() +
                    "\n" + not_french.getValidWords())+
                    "\n" + not_french.getValidityFactor());
        }
    }
    private double calculateCutoff() throws InterruptedException {
        //System.err.println("English - Barbara Jordan DNC Address 1976");
        sample.not_french not_french = new not_french("""
                Thank you ladies and gentlemen for a very warm reception.
                                
                It was one hundred and forty-four years ago that members of the Democratic Party first met in convention to select a Presidential candidate. Since that time, Democrats have continued to convene once every four years and draft a party platform and nominate a Presidential candidate. And our meeting this week is a continuation of that tradition. But there is something different about tonight. There is something special about tonight. What is different? What is special?
                                
                I, Barbara Jordan, am a keynote speaker.
                                
                When -- A lot of years passed since 1832, and during that time it would have been most unusual for any national political party to ask a Barbara Jordan to deliver a keynote address. But tonight, here I am. And I feel -- I feel that notwithstanding the past that my presence here is one additional bit of evidence that the American Dream need not forever be deferred.
                                
                Now -- Now that I have this grand distinction, what in the world am I supposed to say? I could easily spend this time praising the accomplishments of this party and attacking the Republicans -- but I don't choose to do that. I could list the many problems which Americans have. I could list the problems which cause people to feel cynical, angry, frustrated: problems which include lack of integrity in government; the feeling that the individual no longer counts; the reality of material and spiritual poverty; the feeling that the grand American experiment is failing or has failed. I could recite these problems, and then I could sit down and offer no solutions. But I don't choose to do that either. The citizens of America expect more. They deserve and they want more than a recital of problems.
                                
                We are a people in a quandary about the present. We are a people in search of our future. We are a people in search of a national community. We are a people trying not only to solve the problems of the present, unemployment, inflation, but we are attempting on a larger scale to fulfill the promise of America. We are attempting to fulfill our national purpose, to create and sustain a society in which all of us are equal.
                                
                Throughout -- Throughout our history, when people have looked for new ways to solve their problems and to uphold the principles of this nation, many times they have turned to political parties. They have often turned to the Democratic Party. What is it? What is it about the Democratic Party that makes it the instrument the people use when they search for ways to shape their future? Well I believe the answer to that question lies in our concept of governing. Our concept of governing is derived from our view of people. It is a concept deeply rooted in a set of beliefs firmly etched in the national conscience of all of us.
                                
                Now what are these beliefs? First, we believe in equality for all and privileges for none. This is a belief -- This is a belief that each American, regardless of background, has equal standing in the public forum -- all of us. Because -- Because we believe this idea so firmly, we are an inclusive rather than an exclusive party. Let everybody come.
                                
                I think it no accident that most of those immigrating to America in the 19th century identified with the Democratic Party. We are a heterogeneous party made up of Americans of diverse backgrounds. We believe that the people are the source of all governmental power; that the authority of the people is to be extended, not restricted.
                                
                This -- This can be accomplished only by providing each citizen with every opportunity to participate in the management of the government. They must have that, we believe. We believe that the government which represents the authority of all the people, not just one interest group, but all the people, has an obligation to actively -- underscore actively -- seek to remove those obstacles which would block individual achievement -- obstacles emanating from race, sex, economic condition. The government must remove them, seek to remove them.
                                
                We -- We are a party -- We are a party of innovation. We do not reject our traditions, but we are willing to adapt to changing circumstances, when change we must. We are willing to suffer the discomfort of change in order to achieve a better future. We have a positive vision of the future founded on the belief that the gap between the promise and reality of America can one day be finally closed. We believe that.
                                
                This, my friends is the bedrock of our concept of governing. This is a part of the reason why Americans have turned to the Democratic Party. These are the foundations upon which a national community can be built. Let all understand that these guiding principles cannot be discarded for short-term political gains. They represent what this country is all about. They are indigenous to the American idea. And these are principles which are not negotiable.
                                
                                
                \s
                In other times -- In other times, I could stand here and give this kind of exposition on the beliefs of the Democratic Party and that would be enough. But today that is not enough. People want more. That is not sufficient reason for the majority of the people of this country to decide to vote Democratic. We have made mistakes. We realize that. We admit our mistakes. In our haste to do all things for all people, we did not foresee the full consequences of our actions. And when the people raised their voices, we didn't hear. But our deafness was only a temporary condition, and not an irreversible condition.
                                
                Even as I stand here and admit that we have made mistakes, I still believe that as the people of America sit in judgment on each party, they will recognize that our mistakes were mistakes of the heart. They'll recognize that.
                                
                And now -- now we must look to the future. Let us heed the voice of the people and recognize their common sense. If we do not, we not only blaspheme our political heritage, we ignore the common ties that bind all Americans. Many fear the future. Many are distrustful of their leaders, and believe that their voices are never heard. Many seek only to satisfy their private work -- wants; to satisfy their private interests. But this is the great danger America faces -- that we will cease to be one nation and become instead a collection of interest groups: city against suburb, region against region, individual against individual; each seeking to satisfy private wants. If that happens, who then will speak for America? Who then will speak for the common good?
                                
                This is the question which must be answered in 1976: Are we to be one people bound together by common spirit, sharing in a common endeavor; or will we become a divided nation? For all of its uncertainty, we cannot flee the future. We must not become the "New Puritans" and reject our society. We must address and master the future together. It can be done if we restore the belief that we share a sense of national community, that we share a common national endeavor. It can be done.
                                
                There is no executive order; there is no law that can require the American people to form a national community. This we must do as individuals, and if we do it as individuals, there is no President of the United States who can veto that decision.
                                
                As a first step -- As a first step, we must restore our belief in ourselves. We are a generous people, so why can't we be generous with each other? We need to take to heart the words spoken by Thomas Jefferson:
                                
                Let us restore the social intercourse -- "Let us restore to social intercourse that harmony and that affection without which liberty and even life are but dreary things."
                                
                A nation is formed by the willingness of each of us to share in the responsibility for upholding the common good. A government is invigorated when each one of us is willing to participate in shaping the future of this nation. In this election year, we must define the "common good" and begin again to shape a common future. Let each person do his or her part. If one citizen is unwilling to participate, all of us are going to suffer. For the American idea, though it is shared by all of us, is realized in each one of us.
                                
                And now, what are those of us who are elected public officials supposed to do? We call ourselves "public servants" but I'll tell you this: We as public servants must set an example for the rest of the nation. It is hypocritical for the public official to admonish and exhort the people to uphold the common good if we are derelict in upholding the common good. More is required -- More is required of public officials than slogans and handshakes and press releases. More is required. We must hold ourselves strictly accountable. We must provide the people with a vision of the future.
                                
                If we promise as public officials, we must deliver. If -- If we as public officials propose, we must produce. If we say to the American people, "It is time for you to be sacrificial" -- sacrifice. If the public official says that, we [public officials] must be the first to give. We must be. And again, if we make mistakes, we must be willing to admit them. We have to do that. What we have to do is strike a balance between the idea that government should do everything and the idea, the belief, that government ought to do nothing. Strike a balance.
                                
                Let there be no illusions about the difficulty of forming this kind of a national community. It's tough, difficult, not easy. But a spirit of harmony will survive in America only if each of us remembers that we share a common destiny; if each of us remembers, when self-interest and bitterness seem to prevail, that we share a common destiny.
                                
                I have confidence that we can form this kind of national community.
                                
                I have confidence that the Democratic Party can lead the way.
                                
                I have that confidence.
                                
                We cannot improve on the system of government handed down to us by the founders of the Republic. There is no way to improve upon that. But what we can do is to find new ways to implement that system and realize our destiny.
                                
                Now I began this speech by commenting to you on the uniqueness of a Barbara Jordan making a keynote address. Well I am going to close my speech by quoting a Republican President and I ask you that as you listen to these words of Abraham Lincoln, relate them to the concept of a national community in which every last one of us participates:
                                
                "As I would not be a slave, so I would not be a master." This -- This -- "This expresses my idea of Democracy. Whatever differs from this, to the extent of the difference, is no Democracy."
                                
                Thank you.
                                
                                
                """,true, true);
        //Thread.sleep(2000);
        //System.err.println("Latin - In Catilinam Cicerone");
        sample.not_french not_french1 = new not_french("""

                [4] II. Decrevit quondam senatus, ut L. Opimius consul videret, ne quid res publica detrimenti caperet; nox nulla intercessit; interfectus est propter quasdam seditionum suspiciones C. Gracchus, clarissimo patre, avo, maioribus, occisus est cum liberis M. Fulvius consularis. Simili senatus consulto C. Mario et L. Valerio consulibus est permissa res publica; num unum diem postea L. Saturninum tribunum pl. et C. Servilium praetorem mors ac rei publicae poena remorata est? At [vero] nos vicesimum iam diem patimur hebescere aciem horum auctoritatis. Habemus enim huiusce modi senatus consultum, verum inclusum in tabulis tamquam in vagina reconditum, quo ex senatus consulto confestim te interfectum esse, Catilina, convenit. Vivis, et vivis non ad deponendam, sed ad confirmandam audaciam. Cupio, patres conscripti, me esse clementem, cupio in tantis rei publicae periculis me non dissolutum videri, sed iam me ipse inertiae nequitiaeque condemno.




                [5] Castra sunt in Italia contra populum Romanum in Etruriae faucibus conlocata, crescit in dies singulos hostium numerus; eorum autem castrorum imperatorem ducemque hostium intra moenia atque adeo in senatu videtis intestinam aliquam cotidie perniciem rei publicae molientem. Si te iam, Catilina, comprehendi, si interfici iussero, credo, erit verendum mihi, ne non potius hoc omnes boni serius a me quam quisquam crudelius factum esse dicat. Verum ego hoc, quod iam pridem factum esse oportuit, certa de causa nondum adducor ut faciam. Tum denique interficiere, cum iam nemo tam inprobus, tam perditus, tam tui similis inveniri poterit, qui id non iure factum esse fateatur. [6] Quamdiu quisquam erit, qui te defendere audeat, vives, et vives ita, ut [nunc] vivis, multis meis et firmis praesidiis obsessus, ne commovere te contra rem publicam possis. Multorum te etiam oculi et aures non sentientem, sicut adhuc fecerunt, speculabuntur atque custodient.

                III. Etenim quid est, Catilina, quod iam amplius expectes, si neque nox tenebris obscurare coetus nefarios nec privata domus parietibus continere voces coniurationis tuae potest, si illustrantur, si erumpunt omnia? Muta iam istam mentem, mihi crede, obliviscere caedis atque incendiorum. Teneris undique; luce sunt clariora nobis tua consilia omnia; quae iam mecum licet recognoscas.

                [7] Meministine me ante diem XII Kalendas Novembris dicere in senatu fore in armis certo die, qui dies futurus esset ante diem VI Kal. Novembris, C. Manlium, audaciae satellitem atque administrum tuae? Num me fefellit, Catilina, non modo res tanta, tam atrox tamque incredibilis, verum, id quod multo magis est admirandum, dies? Dixi ego idem in senatu caedem te optumatium contulisse in ante diem V Kalendas Novembris, tum cum multi principes civitatis Roma non tam sui conservandi quam tuorum consiliorum reprimendorum causa profugerunt. Num infitiari potes te illo ipso die meis praesidiis, mea diligentia circumclusum commovere te contra rem publicam non potuisse, cum tu discessu ceterorum nostra tamen, qui remansissemus, caede te contentum esse dicebas?

                [8] Quid? cum te Praeneste Kalendis ipsis Novembribus occupaturum nocturno impetu esse confideres, sensistine illam coloniam meo iussu meis praesidiis, custodiis, vigiliis esse munitam? Nihil agis, nihil moliris, nihil cogitas, quod non ego non modo audiam, sed etiam videam planeque sentiam. IV. Recognosce tandem mecum noctem illam superiorem; iam intelleges multo me vigilare acrius ad salutem quam te ad perniciem rei publicae. Dico te priore nocte venisse inter falcarios--non agam obscure--in M. Laecae domum; convenisse eodem complures eiusdem amentiae scelerisque socios. Num negare audes? quid taces? Convincam, si negas. Video enim esse hic in senatu quosdam, qui tecum una fuerunt.

                [9] O di inmortales! ubinam gentium sumus? in qua urbe vivimus? quam rem publicam habemus? Hic, hic sunt in nostro numero, patres conscripti, in hoc orbis terrae sanctissimo gravissimoque consilio, qui de nostro omnium interitu, qui de huius urbis atque adeo de orbis terrarum exitio cogitent! Hos ego video consul et de re publica sententiam rogo et, quos ferro trucidari oportebat, eos nondum voce volnero!

                Fuisti igitur apud Laecam illa nocte, Catilina, distribuisti partes Italiae, statuisti, quo quemque proficisci placeret, delegisti, quos Romae relinqueres, quos tecum educeres, discripsisti urbis partes ad incendia, confirmasti te ipsum iam esse exiturum, dixisti paulum tibi esse etiam nunc morae, quod ego viverem. Reperti sunt duo equites Romani, qui te ista cura liberarent et sese illa ipsa nocte paulo ante lucem me in meo lectulo interfecturos [esse] pollicerentur. [10] Haec ego omnia vixdum etiam coetu vestro dimisso comperi; domum meam maioribus praesidiis munivi atque firmavi, exclusi eos, quos tu ad me salutatum mane miseras, cum illi ipsi venissent, quos ego iam multis ac summis viris ad me id temporis venturos esse praedixeram.

                V. Quae cum ita sint, Catilina, perge, quo coepisti, egredere aliquando ex urbe; patent portae; proficiscere. Nimium diu te imperatorem tua illa Manliana castra desiderant. Educ tecum etiam omnes tuos, si minus, quam plurimos; purga urbem. Magno me metu liberabis, dum modo inter me atque te murus intersit. Nobiscum versari iam diutius non potes; non feram, non patiar, non sinam. [11] Magna dis inmortalibus habenda est atque huic ipsi Iovi Statori, antiquissimo custodi huius urbis, gratia, quod hanc tam taetram, tam horribilem tamque infestam rei publicae pestem totiens iam effugimus.

                Non est saepius in uno homine summa salus periclitanda rei publicae. Quamdiu mihi consuli designato, Catilina, insidiatus es, non publico me praesidio, sed privata diligentia defendi. Cum proximis comitiis consularibus me consulem in campo et competitores tuos interficere voluisti, compressi conatus tuos nefarios amicorum praesidio et copiis nullo tumultu publice concitato; denique, quotienscumque me petisti, per me tibi obstiti, quamquam videbam perniciem meam cum magna calamitate rei publicae esse coniunctam.

                [12] Nunc iam aperte rem publicam universam petis, templa deorum inmortalium, tecta urbis, vitam omnium civium, Italiam [denique] totam ad exitium et vastitatem vocas. Quare, quoniam id, quod est primum, et quod huius imperii disciplinaeque maiorum proprium est, facere nondum audeo, faciam id, quod est ad severitatem lenius et ad communem salutem utilius. Nam si te interfici iussero, residebit in re publica reliqua coniuratorum manus; sin tu, quod te iam dudum hortor, exieris, exhaurietur ex urbe tuorum comitum magna et perniciosa sentina rei publicae. [13] Quid est, Catilina? num dubitas id me imperante facere, quod iam tua sponte faciebas? Exire ex urbe iubet consul hostem. Interrogas me, num in exilium; non iubeo, sed, si me consulis, suadeo.

                VI. Quid est enim, Catilina, quod te iam in hac urbe delectare possit? in qua nemo est extra istam coniurationem perditorum hominum, qui te non metuat, nemo, qui non oderit.

                Quae nota domesticae turpitudinis non inusta vitae tuae est? quod privatarum rerum dedecus non haeret in fama? quae lubido ab oculis, quod facinus a manibus umquam tuis, quod flagitium a toto corpore afuit? cui tu adulescentulo, quem corruptelarum inlecebris inretisses, non aut ad audaciam ferrum aut ad lubidinem facem praetulisti? [14] Quid vero? nuper cum morte superioris uxoris novis nuptiis domum vacuefecisses, nonne etiam alio incredibili scelere hoc scelus cumulasti? quod ego praetermitto et facile patior sileri, ne in hac civitate tanti facinoris inmanitas aut extitisse aut non vindicata esse videatur. Praetermitto ruinas fortunarum tuarum, quas omnis inpendere tibi proxumis Idibus senties; ad illa venio, quae non ad privatam ignominiam vitiorum tuorum, non ad domesticam tuam difficultatem ac turpitudinem sed ad summam rem publicam atque ad omnium nostrum vitam salutemque pertinent. [15] Potestne tibi haec lux, Catilina, aut huius caeli spiritus esse iucundus, cum scias esse horum neminem, qui nesciat te pridie Kalendas Ianuarias Lepido et Tullo consulibus stetisse in comitio cum telo, manum consulum et principum civitatis interficiendorum causa paravisse, sceleri ac furori tuo non mentem aliquam aut timorem tuum sed fortunam populi Romani obstitisse?

                Ac iam illa omitto--neque enim sunt aut obscura aut non multa commissa postea--quotiens tu me designatum, quotiens consulem interficere conatus es! quot ego tuas petitiones ita coniectas, ut vitari posse non viderentur, parva quadam declinatione et, ut aiunt, corpore effugi! nihil [agis, nihil] adsequeris [, nihil moliris] neque tamen conari ac velle desistis. [16] Quotiens tibi iam extorta est ista sica de manibus, quotiens [vero] excidit casu aliquo et elapsa est! [tamen ea carere diutius non potes] quae quidem quibus abs te initiata sacris ac devota sit, nescio, quod eam necesse putas esse in consulis corpore defigere.

                VII. Nunc vero quae tua est ista vita? Sic enim iam tecum loquar, non ut odio permotus esse videar, quo debeo, sed ut misericordia, quae tibi nulla debetur. Venisti paulo ante in senatum. Quis te ex hac tanta frequentia totque tuis amicis ac necessariis salutavit? Si hoc post hominum memoriam contigit nemini, vocis expectas contumeliam, cum sis gravissimo iudicio taciturnitatis oppressus? Quid, quod adventu tuo ista subsellia vacuefacta sunt, quod omnes consulares, qui tibi persaepe ad caedem constituti fuerunt, simul atque adsedisti, partem istam subselliorum nudam atque inanem reliquerunt, quo tandem animo [hoc] tibi ferundum putas?

                [17] Servi mehercule mei si me isto pacto metuerent, ut te metuunt omnes cives tui, domum meam relinquendam putarem; tu tibi urbem non arbitraris? et, si me meis civibus iniuria suspectum tam graviter atque offensum viderem, carere me aspectu civium quam infestis omnium oculis conspici mallem; tu cum conscientia scelerum tuorum agnoscas odium omnium iustum et iam diu tibi debitum, dubitas, quorum mentes sensusque volneras, eorum aspectum praesentiamque vitare? Si te parentes timerent atque odissent tui neque eos ulla ratione placare posses, ut opinor, ab eorum oculis aliquo concederes. Nunc te patria, quae communis est parens omnium nostrum, odit ac metuit et iam diu nihil te iudicat nisi de parricidio suo cogitare; huius tu neque auctoritatem verebere nec iudicium sequere nec vim pertimesces?

                [18] Quae tecum, Catilina, sic agit et quodam modo tacita loquitur: "Nullum iam aliquot annis facinus exstitit nisi per te, nullum flagitium sine te; tibi uni multorum civium neces, tibi vexatio direptioque sociorum inpunita fuit ac libera; tu non solum ad neglegendas leges et quaestiones, verum etiam ad evertendas perfringendasque valuisti. Superiora illa, quamquam ferenda non fuerunt, tamen, ut potui, tuli; nunc vero me totam esse in metu propter unum te, quicquid increpuerit, Catilinam timeri, nullum videri contra me consilium iniri posse, quod a tuo scelere abhorreat, non est ferendum. Quam ob rem discede atque hunc mihi timorem eripe; si est verus, ne opprimar, sin falsus, ut tandem aliquando timere desinam."

                [19] VIII. Haec si tecum, ita ut dixi, patria loquatur, nonne impetrare debeat, etiamsi vim adhibere non possit? Quid, quod tu te ipse in custodiam dedisti, quod vitandae suspicionis causa ad M'. Lepidum te habitare velle dixisti? A quo non receptus etiam ad me venire ausus es atque, ut domi meae te adservarem, rogasti. Cum a me quoque id responsum tulisses, me nullo modo posse isdem parietibus tuto esse tecum, qui magno in periculo essem, quod isdem moenibus contineremur, ad Q. Metellum praetorem venisti. A quo repudiatus ad sodalem tuum, virum optumum, M. Metellum, demigrasti; quem tu videlicet et ad custodiendum diligentissimum et ad suspicandum sagacissimum et ad vindicandum fortissimum fore putasti. Sed quam longe videtur a carcere atque a vinculis abesse debere, qui se ipse iam dignum custodia iudicarit!

                [20] Quae cum ita sint, Catilina, dubitas, si emori aequo animo non potes, abire in aliquas terras et vitam istam multis suppliciis iustis debitisque ereptam fugae solitudinique mandare? "Refer" inquis "ad senatum"; id enim postulas et, si hic ordo [sibi] placere decreverit te ire in exilium, optemperaturum te esse dicis. Non referam, id quod abhorret a meis moribus, et tamen faciam, ut intellegas, quid hi de te sentiant. Egredere ex urbe, Catilina, libera rem publicam metu, in exilium, si hanc vocem exspectas, proficiscere. Quid est, Catilina? ecquid attendis, ecquid animadvertis horum silentium? Patiuntur, tacent. Quid exspectas auctoritatem loquentium, quorum voluntatem tacitorum perspicis?

                [21] At si hoc idem huic adulescenti optimo, P. Sestio, si fortissimo viro, M. Marcello, dixissem, iam mihi consuli hoc ipso in templo iure optimo senatus vim et manus intulisset. De te autem, Catilina, cum quiescunt, probant, cum patiuntur, decernunt, cum tacent, clamant, neque hi solum, quorum tibi auctoritas est videlicet cara, vita vilissima, sed etiam illi equites Romani, honestissimi atque optimi viri, ceterique fortissimi cives, qui circumstant senatum, quorum tu et frequentiam videre et studia perspicere et voces paulo ante exaudire potuisti. Quorum ego vix abs te iam diu manus ac tela contineo, eosdem facile adducam, ut te haec, quae vastare iam pridem studes, relinquentem usque ad portas prosequantur.

                [22] IX. Quamquam quid loquor? te ut ulla res frangat, tu ut umquam te corrigas, tu ut ullam fugam meditere, tu ut ullum exilium cogites? Utinam tibi istam mentem di inmortales duint! tametsi video, si mea voce perterritus ire in exilium animum induxeris quanta tempestas invidiae nobis, si minus in praesens tempus recenti memoria scelerum tuorum, at in posteritatem impendeat. Sed est tanti, dum modo ista sit privata calamitas et a rei publicae periculis seiungatur. Sed tu ut vitiis tuis commoveare, ut legum poenas pertimescas, ut temporibus rei publicae cedas, non est postulandum. Neque enim is es, Catilina, ut te aut pudor umquam a turpitudine aut metus a periculo aut ratio a furore revocarit.

                [23] Quam ob rem, ut saepe iam dixi, proficiscere ac, si mihi inimico, ut praedicas, tuo conflare vis invidiam, recta perge in exilium; vix feram sermones hominum, si id feceris, vix molem istius invidiae, si in exilium iussu consulis ieris, sustinebo. Sin autem servire meae laudi et gloriae mavis, egredere cum inportuna sceleratorum manu, confer te ad Manlium, concita perditos cives, secerne te a bonis, infer patriae bellum, exsulta impio latrocinio, ut a me non eiectus ad alienos, sed invitatus ad tuos isse videaris.

                [24] Quamquam quid ego te invitem, a quo iam sciam esse praemissos, qui tibi ad Forum Aurelium praestolarentur armati, cui iam sciam pactam et constitutam cum Manlio diem, a quo etiam aquilam illam argenteam, quam tibi ac tuis omnibus confido perniciosam ac funestam futuram, cui domi tuae sacrarium [scelerum tuorum] constitutum fuit, sciam esse praemissam? Tu ut illa carere diutius possis, quam venerari ad caedem proficiscens solebas, a cuius altaribus saepe istam impiam dexteram ad necem civium transtulisti?

                [25] X. Ibis tandem aliquando, quo te iam pridem ista tua cupiditas effrenata ac furiosa rapiebat; neque enim tibi haec res adfert dolorem, sed quandam incredibilem voluptatem. Ad hanc te amentiam natura peperit, voluntas exercuit, fortuna servavit. Numquam tu non modo otium, sed ne bellum quidem nisi nefarium concupisti. Nactus es ex perditis atque ab omni non modo fortuna, verum etiam spe derelictis conflatam inproborum manum. [26] Hic tu qua laetitia perfruere, quibus gaudiis exultabis, quanta in voluptate bacchabere, cum in tanto numero tuorum neque audies virum bonum quemquam neque videbis! Ad huius vitae studium meditati illi sunt, qui feruntur, labores tui, iacere humi non solum ad obsidendum stuprum, verum etiam ad facinus obeundum, vigilare non solum insidiantem somno maritorum, verum etiam bonis otiosorum. Habes, ubi ostentes tuam illam praeclaram patientiam famis, frigoris, inopiae rerum omnium, quibus te brevi tempore confectum esse senties. [27] Tantum profeci tum, cum te a consulatu reppuli, ut exsul potius temptare quam consul vexare rem publicam posses, atque ut id, quod esset a te scelerate susceptum, latrocinium potius quam bellum nominaretur.

                XI. Nunc, ut a me, patres conscripti, quandam prope iustam patriae querimoniam detester ac deprecer, percipite, quaeso, diligenter, quae dicam, et ea penitus animis vestris mentibusque mandate. Etenim, si mecum patria, quae mihi vita mea multo est carior, si cuncta Italia, si omnis res publica loquatur:

                "M.Tulli, quid agis? Tune eum, quem esse hostem comperisti, quem ducem belli futurum vides, quem expectari imperatorem in castris hostium sentis, auctorem sceleris, principem coniurationis, evocatorem servorum et civium perditorum, exire patiere, ut abs te non emissus ex urbe, sed immissus in urbem esse videatur? Nonne hunc in vincla duci, non ad mortem rapi, non summo supplicio mactari imperabis? [28] Quid tandem te impedit? mosne maiorum? At persaepe etiam privati in hac re publica perniciosos cives morte multarunt. An leges, quae de civium Romanorum supplicio rogatae sunt? At numquam in hac urbe, qui a re publica defecerunt, civium iura tenuerunt. An invidiam posteritatis times? Praeclaram vero populo Romano refers gratiam, qui te, hominem per te cognitum nulla commendatione maiorum tam mature ad summum imperium per omnis honorum gradus extulit, si propter invidiam aut alicuius periculi metum salutem civium tuorum neglegis. [29] Sed, si quis est invidiae metus, non est vehementius severitatis ac fortitudinis invidia quam inertiae ac nequitiae pertimescenda. An, cum bello vastabitur Italia, vexabuntur urbes, tecta ardebunt tum te non existumas invidiae incendio conflagraturum?"

                XII. His ego sanctissimis rei publicae vocibus et eorum hominum, qui hoc idem sentiunt, mentibus pauca respondebo. Ego si hoc optimum factu iudicarem, patres conscripti, Catilinam morte multari, unius usuram horae gladiatori isti ad vivendum non dedissem. Etenim si summi viri et clarissimi cives Saturnini et Gracchorum et Flacci et superiorum complurium sanguine non modo se non contaminarunt, sed etiam honestarunt, certe verendum mihi non erat, ne quid hoc parricida civium interfecto invidiae [mihi] in posteritatem redundaret. Quodsi ea mihi maxime inpenderet tamen hoc animo fui semper, ut invidiam virtute partam gloriam, non invidiam putarem.

                [30] Quamquam non nulli sunt in hoc ordine, qui aut ea, quae inminent non videant aut ea, quae vident, dissimulent; qui spem Catilinae mollibus sententiis aluerunt coniurationemque nascentem non credendo corroboraverunt; quorum auctoritate multi non solum improbi, verum etiam inperiti, si in hunc animadvertissem, crudeliter et regie factum esse dicerent. Nunc intellego, si iste, quo intendit, in Manliana castra pervenerit, neminem tam stultum fore, qui non videat coniurationem esse factam, neminem tam improbum qui non fateatur. Hoc autem uno interfecto intellego hanc rei publicae pestem paulisper reprimi, non in perpetuum comprimi posse. Quodsi se eiecerit secumque suos eduxerit et eodem ceteros undique collectos naufragos adgregarit, extinguetur atque delebitur non modo haec tam adulta rei publicae pestis, verum etiam stirps ac semen malorum omnium.

                [31] Etenim iam diu, patres conscripti, in his periculis coniurationis insidiisque versamur, sed nescio quo pacto omnium scelerum ac veteris furoris et audaciae maturitas in nostri consulatus tempus erupit. Quodsi ex tanto latrocinio iste unus tolletur, videbimur fortasse ad breve quoddam tempus cura et metu esse relevati, periculum autem residebit et erit inclusum penitus in venis atque in visceribus rei publicae. Ut saepe homines aegri morbo gravi cum aestu febrique iactantur, si aquam gelidam biberunt, primo relevari videntur, deinde multo gravius vehementiusque adflictantur, sic hic morbus, qui est in re publica, relevatus istius poena vehementius reliquis vivis ingravescet.

                [32] Quare secedant inprobi, secernant se a bonis, unum in locum congregentur, muro denique, [id] quod saepe iam dixi, secernantur a nobis; desinant insidiari domi suae consuli, circumstare tribunal praetoris urbani, obsidere cum gladiis curiam, malleolos et faces ad inflammandam urbem comparare; sit denique inscriptum in fronte unius cuiusque, quid de re publica sentiat. Polliceor hoc vobis, patres conscripti, tantam in nobis consulibus fore diligentiam, tantam in vobis auctoritatem, tantam in equitibus Romanis virtutem, tantam in omnibus bonis consensionem, ut Catilinae profectione omnia patefacta, inlustrata, oppressa, vindicata esse videatis.

                [33] Hisce ominibus, Catilina, cum summa rei publicae salute, cum tua peste ac pernicie cumque eorum exitio, qui se tecum omni scelere parricidioque iunxerunt, proficiscere ad impium bellum ac nefarium. Tu, Iuppiter, qui isdem quibus haec urbs auspiciis a Romulo es constitutus, quem Statorem huius urbis atque imperii vere nominamus, hunc et huius socios a tuis [aris] ceterisque templis, a tectis urbis ac moenibus, a vita fortunisque civium [omnium] arcebis et homines bonorum inimicos, hostis patriae, latrones Italiae scelerum foedere inter se ac nefaria societate coniunctos aeternis suppliciis vivos mortuosque mactabis.


                """, true, true);
        //Thread.sleep(2000);
        //System.err.println("English - Malcolm X, the Ballot or the Bullet");
        sample.not_french not_french2 = new not_french("""
                Mr. Moderator, Rev. Cleage, brothers and sisters and friends, and I see some enemies. [laughter, applause] In fact, I think we'd be fooling ourselves if we had an audience this large and didn't realize that there were some enemies present.
                                
                This afternoon we want to talk about the ballot or the bullet. The ballot or the bullet explains itself. But before we get into it, since this is the year of the ballot or the bullet, I would like to clarify some things that refer to me personally, concerning my own personal position.
                                
                I'm still a Muslim. That is, my religion is still Islam. [applause] My religion is still Islam. I still credit Mr. Muhammad for what I know and what I am. He's the one who opened my eyes. [applause] At present I am the minister of the newly founded Muslim Mosque Incorporated, which has its offices in the Theresa Hotel right in the heart of Harlem, that's the black belt in New York City. And when we realize that Adam Clayton Powell, is a Christian minister, he has Abyssinian Baptist Church, but at the same time he's more famous for his political struggling. And Dr. King is a Christian minister from Atlanta Georgia, or in Atlanta Georgia, but he's become more famous for being involved in the civil rights struggle. There's another in New York, Rev. Galamison, I don't know if you've heard of him out here, he's a Christian minister from Brooklyn, but has become famous for his fight against the segregated school system in Brooklyn. Rev. Cleage, right here, is a Christian minister, here in Detroit, he's head of the Freedom Now Party. All of these are Christian ministers [applause] …all of these are Christian ministers but they don't come to us as Christian ministers, they come to us as fighters in some other category.
                                
                I am a Muslim minister. The same as they are Christian ministers, I'm a Muslim minister. And I don't believe in fighting today on any one front, but on all fronts. [applause] In fact, I'm a Black Nationalist freedom fighter. [applause] Islam is my religion but I believe my religion is my personal business. [applause] It governs my personal life, my personal morals. And my religious philosophy is personal between me and the God in whom I believe, just as the religious philosophy of these others is between them and the God in whom they believe. And this is best this way. Were we to come out here discussing religion, we'd have too many differences from the out start and we could never get together.
                                
                So today, though Islam is my religious philosophy, my political, economic and social philosophy is black nationalism. You and I – [applause] As I say, if we bring up religion, we'll have differences, we'll have arguments, and we'll never be able to get together. But if we keep our religion at home, keep our religion in the closet, keep our religion between ourselves and our God, but when we come out here we have a fight that's common to all of us against a enemy who is common to all of us. [applause]
                                
                The political philosophy of black nationalism only means that the black man should control the politics and the politicians in his own community. The time when white people can come in our community and get us to vote for them so that they can be our political leaders and tell us what to do and what not to do is long gone. [applause]
                                
                By the same token, the time when that same white man, knowing that your eyes are too far open, can send another Negro in the community, and get you and me to support him, so that he can use him to lead us astray, those days are long gone too. [applause]
                                
                The political philosophy of black nationalism only means that if you and I are going to live in a black community – and that's where we're going to live, 'cause as soon as you move into one of their….soon as you move out of the black community into their community, it's mixed for a period of time, but they're gone and you're right there all by yourself again. [applause]
                                
                We must, we must understand the politics of our community and we must know what politics is supposed to produce. We must know what part politics play in our lives. And until we become politically mature, we will always be misled, led astray, or deceived or maneuvered into supporting someone politically who doesn't have the good of our community at heart. So the political philosophy of black nationalism only means that we will have to carry on a program, a political program, of reeducation – to open our people's eyes, make us become more politically conscious, politically mature. And then, we will – whenever we are ready to cast our ballot, that ballot will be cast for a man of the community, who has the good of the community at heart. [applause]
                                
                The economic philosophy of black nationalism only means that we should own and operate and control the economy of our community. You would never have found—you can't open up a black store in a white community. White man won't even patronize you. And he's not wrong. He got sense enough to look out for himself. It's you who don't have sense enough to look out for yourself. [applause]
                                
                The white man, the white man is too intelligent to let someone else come and gain control of the economy of his community. But you will let anybody come in and control the economy of your community, control the housing, control the education, control the jobs, control the businesses, under the pretext that you want to integrate. Nah, you're out of your mind. [applause]
                                
                The political … the economic philosophy of black nationalism only means that we have to become involved in a program of reeducation, to educate our people into the importance of knowing that when you spend your dollar out of the community in which you live, the community in which you spend your money becomes richer and richer, the community out of which you take your money becomes poorer and poorer. And because these Negroes, who have been misled, misguided, are breaking their necks to take their money and spend it with the Man, the Man is becoming richer and richer, and you're becoming poorer and poorer. And then what happens? The community in which you live becomes a slum. It becomes a ghetto. The conditions become rundown. And then you have the audacity to complain about poor housing in a rundown community, while you're running down yourselves when you take your dollar out. [applause]
                                
                And you and I are in a double trap because not only do we lose by taking our money someplace else and spending it, when we try and spend it in our own community we're trapped because we haven't had sense enough to set up stores and control the businesses of our community. The man who is controlling the stores in our community is a man who doesn't look like we do. He's a man who doesn't even live in the community. So you and I, even when we try and spend our money on the block where we live or the area where we live, we're spending it with a man who, when the sun goes down, takes that basket full of money in another part of the town. [applause]
                                
                So we're trapped, trapped, double-trapped, triple-trapped. Any way we go, we find that we're trapped. Any every kind of solution that someone comes up with is just another trap. But the political and economic philosophy of black nationalism…the economic philosophy of black nationalism shows our people the importance of setting up these little stores, and developing them and expanding them into larger operations. Woolworth didn't start out big like they are today; they started out with a dime store, and expanded, and expanded, and expanded until today they are all over the country and all over the world and they getting some of everybody's money.
                                
                Now this is what you and I – General Motors, the same way, it didn't start out like it is. It started out just a little rat-race type operation. And it expanded and it expanded until today it's where it is right now. And you and I have to make a start. And the best place to start is right in the community where we live. [applause]
                                
                So our people not only have to be reeducated to the importance of supporting black business, but the black man himself has to be made aware of the importance of going into business. And once you and I go into business, we own and operate at least the businesses in our community. What we will be doing is developing a situation, wherein, we will actually be able to create employment for the people in the community. And once you can create some employment in the community where you live, it will eliminate the necessity of you and me having to act ignorantly and disgracefully, boycotting and picketing some cracker someplace else trying to beg him for a job. [applause]
                                
                Anytime you have to rely upon your enemy for a job, you're in bad shape. [applause] When you — and he is your enemy. You wouldn't be in this country if some enemy hadn't kidnapped you and brought you here. [applause] On the other hand, some of you think you came here on the Mayflower. [laughter]
                                
                So as you can see, brothers and sisters, today – this afternoon it is not our intention to discuss religion. We're going to forget religion. If we bring up religion we'll be in an argument. And the best way to keep away from arguments and differences, as I said earlier, put your religion at home, in the closet, keep it between you and your God. Because if it hasn't done anything more for you than it has, you need to forget it anyway. [laughter, applause]
                                
                Whether you are a Christian or a Muslim or a nationalist, we all have the same problem. They don't hang you because you're a Baptist; they hang you 'cause you're black. [applause] They don't attack me because I'm a Muslim. They attack me 'cause I'm black. They attacked all of us for the same reason. All of us catch hell from the same enemy. We're all in the same bag, in the same boat.
                                
                We suffer political oppression, economic exploitation and social degradation. All of 'em from the same enemy. The government has failed us. You can't deny that. Any time you're living in the 20th century, 1964, and you walking around here singing "We Shall Overcome," the government has failed you. [applause] This is part of what's wrong with you, you do too much singing. [laughter] Today it's time to stop singing and start swinging. [laughter, applause]
                                
                You can't sing up on freedom. But you can swing up on some freedom. [cheering] Cassius Clay can sing. But singing didn't help him to become the heavyweight champion of the world. Swinging helped him. [applause]
                                
                So this government has failed us. The government itself has failed us. And the white liberals who have been posing as our friends have failed us. And once we see that all of these other sources to which we've turned have failed, we stop turning to them and turn to ourselves. We need a self-help program, a do-it-yourself philosophy, a do-it-right-now philosophy, a it's-already-too-late philosophy. This is what you and I need to get with. And the only time – the only way we're going to solve our problem is with a self-help program. Before we can get a self-help program started, we have to have a self-help philosophy. Black nationalism is a self-help philosophy.
                                
                What's so good about it – you can stay right in the church where you are and still take black nationalism as your philosophy. You can stay in any kind of civic organization that you belong to and still take black nationalism as your philosophy. You can be an atheist and still take black nationalism as your philosophy. This is a philosophy that eliminates the necessity for division and argument, 'cause if you're black, you should be thinking black. And if you're black and you not thinking black at this late date, well, I'm sorry for you. [applause]
                                
                Once you change your philosophy, you change your thought pattern. Once you change your thought pattern you change your attitude. Once you change your attitude it changes your behavior pattern. And then you go on into some action. As long as you got a sit-down philosophy you'll have a sit-down thought pattern. And as long as you think that old sit-down thought, you'll be in some kind of sit-down action. They'll have you sitting in everywhere. [laughter]
                                
                It's not so good to refer to what you're going to do as a sit-in. That right there castrates you. Right there it brings you down. What goes with it? What – think of the image of someone sitting. An old woman can sit. An old man can sit. A chump can sit, a coward can sit, anything can sit. Well, you and I been sitting long enough and it's time for us today to start doing some standing and some fighting to back that up. [applause]
                                
                When we look at other parts of this Earth upon which we live, we find that black, brown, red and yellow people in Africa and Asia are getting their independence. They're not getting it by singing, 'We Shall Overcome." No, they're getting it through nationalism. It is nationalism that brought about the independence of the people in Asia. Every nation in Asia gained its independence through the philosophy of nationalism. Every nation on the African continent that has gotten its independence brought it about through the philosophy of nationalism. And it will take black nationalism to bring about the freedom of 22 million Afro-Americans, here in this country, where we have suffered colonialism for the past 400 years. [applause]
                                
                America is just as much a colonial power as England ever was. America is just as much a colonial power as France ever was. In fact, America is more so a colonial power than they, because she is a hypocritical colonial power behind it. [applause] What is 20th — what, what do you call second-class citizenship? Why, that's colonization. Second-class citizenship is nothing but 20th slavery. How you gonna to tell me you're a second-class citizen? They don't have second-class citizenship in any other government on this Earth. They just have slaves and people who are free! Well, this country is a hypocrite! They try and make you think they set you free by calling you a second-class citizen. No, you're nothing but a 20th century slave. [applause]
                                
                Just as it took nationalism to remove colonialism from Asia and Africa, it'll take black nationalism today to remove colonialism from the backs and the minds of twenty-two million Afro-Americans here in this country. And 1964 looks like it might be the year of the ballot or the bullet. [applause]
                                
                Why does it look like it might be the year of the ballot or the bullet? Because Negroes have listened to the trickery and the lies and the false promises of the white man now for too long, and they're fed up. They've become disenchanted. They've become disillusioned. They've become dissatisfied. And all of this has built up frustrations in the black community that makes the black community throughout America today more explosive than all of the atomic bombs the Russians can ever invent. Whenever you got a racial powder keg sitting in your lap, you're in more trouble than if you had an atomic powder keg sitting in your lap. When a racial powder keg goes off, it doesn't care who it knocks out the way. Understand this, it's dangerous.
                                
                And in 1964, this seems to be the year. Because what can the white man use, now, to fool us? After he put down that March on Washington – and you see all through that now, he tricked you, had you marching down to Washington. Had you marching back and forth between the feet of a dead man named Lincoln and another dead man named George Washington, singing, "We Shall Overcome." [applause]
                                
                He made a chump out of you. He made a fool out of you. He made you think you were going somewhere and you end up going nowhere but between Lincoln and Washington. [laughter]
                                
                So today our people are disillusioned. They've become disenchanted. They've become dissatisfied. And in their frustrations they want action. And in 1964 you'll see this young black man, this new generation, asking for the ballot or the bullet. That old Uncle Tom action is outdated. The young generation don't want to hear anything about "the odds are against us." What do we care about odds? [applause]
                                
                When this country here was first being founded, there were thirteen colonies. The whites were colonized. They were fed up with this taxation without representation. So some of them stood up and said, "Liberty or death!" I went to a white school over here in Mason, Michigan. The white man made the mistake of letting me read his history books. [laughter] He made the mistake of teaching me that Patrick Henry was a patriot, and George Washington – wasn't nothing non-violent about ol' Pat, or George Washington. "Liberty or death" is was what brought about the freedom of whites in this country from the English. [applause]
                                
                They didn't care about the odds. Why, they faced the wrath of the entire British Empire. And in those days, they used to say that the British Empire was so vast and so powerful that the sun would never set on it. This is how big it was, yet these thirteen little scrawny states, tired of taxation without representation, tired of being exploited and oppressed and degraded, told that big British Empire, "Liberty or death." And here you have 22 million Afro-Americans, black people today, catching more hell than Patrick Henry ever saw. [applause]
                                
                And I'm here to tell you in case you don't know it – that you got a new, you got a new generation of black people in this country who don't care anything whatsoever about odds. They don't want to hear you ol' Uncle Tom, handkerchief-heads talking about the odds. No! [laughter, applause] This is a new generation. If they're going to draft these young black men, and send them over to Korea or to South Vietnam to face 800 million Chinese… [laughter, applause] If you're not afraid of those odds, you shouldn't be afraid of these odds. [applause]
                                
                Why is America – why does this loom to be such an explosive political year? Because this is the year of politics. This is the year when all of the white politicians are going to come into the Negro community. You never see them until election time. You can't find them until election time. [applause] They're going to come in with false promises. And as they make these false promises they're going to feed our frustrations, and this will only serve to make matters worse. I'm no politician. I'm not even a student of politics. I'm not a Republican, nor a Democrat, nor an American – and got sense enough to know it. [applause]
                                
                I'm one of the 22 million black victims of the Democrats. One of the 22 million black victims of the Republicans and one of the 22 million black victims of Americanism. [applause] And when I speak, I don't speak as a Democrat or a Republican, nor an American. I speak as a victim of America's so-called democracy. You and I have never seen democracy – all we've seen is hypocrisy. [applause]
                                
                When we open our eyes today and look around America, we see America not through the eyes of someone who has enjoyed the fruits of Americanism. We see America through the eyes of someone who has been the victim of Americanism. We don't see any American dream. We've experienced only the American nightmare. We haven't benefited from America's democracy. We've only suffered from America's hypocrisy. And the generation that's coming up now can see it. And are not afraid to say it. If you go to jail, so what? If you're black, you were born in jail. [applause]
                                
                If you black you were born in jail, in the North as well as the South. Stop talking about the South. As long as you south of the Canadian border, you South. [laughter, applause] Don't call Governor Wallace a Dixie governor, Romney is a Dixie Governor. [applause]
                                
                Twenty-two million black victims of Americanism are waking up and they are gaining a new political consciousness, becoming politically mature. And as they become – develop this political maturity, they're able to see the recent trends in these political elections. They see that the whites are so evenly divided that every time they vote, the race is so close they have to go back and count the votes all over again. Which means that any block, any minority that has a block of votes that stick together is in a strategic position. Either way you go, that's who gets it. You're in a position to determine who'll go to the White House and who'll stay in the doghouse. [laughter]
                                
                You're the one who has that power. You can keep Johnson in Washington D.C., or you can send him back to his Texas cotton patch. [applause] You're the one who sent Kennedy to Washington. You're the one who put the present Democratic administration in Washington, D.C. The whites were evenly divided. It was the fact that you threw 80 percent of your votes behind the Democrats that put the Democrats in the White House.
                                
                When you see this, you can see that the Negro vote is the key factor. And despite the fact that you are in a position to be the determining factor, what do you get out of it? The Democrats have been in Washington, D.C. only because of the Negro vote. They've been down there four years. And they're – all other legislation they wanted to bring up they've brought it up, and gotten it out of the way, and now they bring up you. And now they bring up you! You put them first and they put you last. Because you're a chump! [applause] A political chump.
                                
                In Washington, D.C., in the House of Representatives there are 257 who are Democrats. Only 177 are Republican. In the Senate there are 67 Democrats. Only 33 are Republicans. The party that you backed controls two-thirds of the House of Representatives and the Senate and still they can't keep their promise to you. 'Cause you're a chump. [applause]
                                
                Any time you throw your weight behind a political party that controls two-thirds of the government, and that party can't keep the promise that it made to you during election-time, and you're dumb enough to walk around continuing to identify yourself with that party, you're not only a chump but you're a traitor to your race. [applause]
                                
                What kind of alibi do come up with? They try and pass the buck to the Dixiecrats. Now, back during the days when you were blind, deaf and dumb, ignorant, politically immature, naturally you went along with that. But today, as your eyes come open, and you develop political maturity, you're able to see and think for yourself, and you can see that a Dixiecrat is nothing but a Democrat – in disguise. [applause]
                                
                You look at the structure of the government that controls this country, is controlled by 16 senatorial committees and 20 congressional committees. Of the 16 senatorial committees that run the government, 10 of them are in the hands of southern segregationists. Of the 20 congressional committees that run the government, 12 of them are in the hands of southern segregationists. And they're going to tell you and me that the South lost the war? [laughter, applause]
                                
                You, today, are in the hands of a government of segregationists. Racists, white supremacists, who belong to the Democratic party but disguise themselves as Dixiecrats. A Dixiecrat is nothing but a Democrat. Whoever runs the Democrats is also the father of the Dixiecrats. And the father of all of them is sitting in the White House. [applause] I say, and I'll say it again, you got a president who's nothing but a southern segregationist [applause] from the state of Texas. They'll lynch in Texas as quick as they'll lynch you in Mississippi. Only in Texas they lynch you with a Texas accent, in Mississippi they lynch you with a Mississippi accent. [cheering]
                                
                The first thing the cracker does when he comes in power, he takes all the Negro leaders and invites them for coffee. To show that he's all right. And those Uncle Toms can't pass up the coffee. [laughter, applause] They come away from the coffee table telling you and me that this man is all right [laughter]. 'Cause he's from the South and since he's from the South he can deal with the South. Look at the logic that they're using. What about Eastland? He's from the South. Why not make him the president? If Johnson is a good man 'cause he's from Texas, and being from Texas will enable him to deal with the South, Eastland can deal with the South better than Johnson! [laughter, applause]
                                
                Oh, I say you been misled. You been had. You been took. [laughter, applause] I was in Washington a couple of weeks ago while the senators were filibustering and I noticed in the back of the Senate a huge map, and on this map it showed the distribution of Negroes in America. And surprisingly, the same senators that were involved in the filibuster were from the states where there were the most Negroes. Why were they filibustering the civil rights legislation? Because the civil rights legislation is supposed to guarantee boarding rights to Negroes from those states. And those senators from those states know that if the Negroes in those states can vote, those senators are down the drain. [applause] The representatives of those states go down the drain.
                                
                And in the Constitution of this country it has a stipulation, wherein, whenever the rights, the voting rights of people in a certain district are violated, then the representative who's from that particular district, according to the Constitution, is supposed to be expelled from the Congress. Now, if this particular aspect of the Constitution was enforced, why, you wouldn't have a cracker in Washington, D.C. [applause]
                                
                But what would happen? When you expel the Dixiecrat, you're expelling the Democrat. When you destroy the power of the Dixiecrat, you are destroying the power of the Democratic Party. So how in the world can the Democratic Party in the South actually side with you, in sincerity, when all of its power is based in the South?
                                
                These Northern Democrats are in cahoots with the southern Democrats. [applause] They're playing a giant con game, a political con game. You know how it goes. One of 'em comes to you and make believe he's for you. And he's in cahoots with the other one that's not for you. Why? Because neither one of 'em is for you. But they got to make you go with one of 'em or the other.
                                
                So this is a con game, and this is what they've been doing with you and me all of these years. First thing, Johnson got off the plane when he become president, he ask, "Where's Dickey?" You know who Dickey is? Dickey is old southern cracker Richard Russell. Lookie here! Yes, Lyndon B. Johnson's best friend is the one who is a head, who's heading the forces that are filibustering civil rights legislation. You tell me how in the hell is he going to be Johnson's best friend? [applause] How can Johnson be his friend and your friend too? No, that man is too tricky. Especially if his friend is still ol' Dickey. [laughter, applause]
                                
                Whenever the Negroes keep the Democrats in power they're keeping the Dixiecrats in power. This is true! A vote for a Democrat is nothing but a vote for a Dixiecrat. I know you don't like me saying that. I'm not the kind of person who come here to say what you like. I'm going to tell you the truth whether you like it or not. [applause]
                                
                Up here in the North you have the same thing. The Democratic Party don't – they don't do it that way. They got a thing they call gerrymandering. They maneuver you out of power. Even though you can vote they fix it so you're voting for nobody. They got you going and coming. In the South they're outright political wolves, in the North they're political foxes. A fox and a wolf are both canine, both belong to the dog family. [laughter, applause] Now, you take your choice. You going to choose a northern dog or a southern dog? Because either dog you choose, I guarantee you, you'll still be in the doghouse.
                                
                This is why I say it's the ballot or the bullet. It's liberty or it's death. It's freedom for everybody or freedom for nobody. [applause] America today finds herself in a unique situation. Historically, revolutions are bloody, oh yes they are. They have never had a bloodless revolution. Or a non-violent revolution. That don't happen even in Hollywood [laughter] You don't have a revolution in which you love your enemy. And you don't have a revolution in which you are begging the system of exploitation to integrate you into it. Revolutions overturn systems. Revolutions destroy systems.
                                
                A revolution is bloody, but America is in a unique position. She's the only country in history, in the position actually to become involved in a bloodless revolution. The Russian Revolution was bloody, Chinese Revolution was bloody, French Revolution was bloody, Cuban Revolution was bloody. And there was nothing more bloody than the American Revolution. But today, this country can become involved in a revolution that won't take bloodshed. All she's got to do is give the black man in this country everything that's due him, everything. [applause]
                                
                I hope that the white man can see this. 'Cause if you don't see it you're finished. If you don't see it you're going to become involved in some action in which you don't have a chance. We don't care anything about your atomic bomb; it's useless, because other countries have atomic bombs. When two or three different countries have atomic bombs, nobody can use them. So it means that the white man today is without a weapon. If you want some action you've got to come on down to Earth, and there's more black people on Earth than there are white people. [applause]
                                
                I only got a couple more minutes. The white man can never win another war on the ground. His days of war – victory – his days of battleground victory are over. Can I prove it? Yes. Take all the action that's going on this Earth right now that he's involved in. Tell me where he's winning – nowhere. Why, some rice farmers, some rice farmers! Some rice-eaters ran him out of Korea, yes they ran him out of Korea. Rice-eaters, with nothing but gym shoes and a rifle and a bowl of rice, took him and his tanks and his napalm and all that other action he's supposed to have and ran him across the Yalu. Why? Because the day that he can win on the ground has passed.
                                
                Up in French Indochina, those little peasants, rice-growers, took on the might of the French army and ran all the Frenchmen, you remember Dien Bien Phu! The same thing happened in Algeria, in Africa. They didn't have anything but a rifle. The French had all these highly mechanized instruments of warfare. But they put some guerilla action on. And a white man can't fight a guerilla warfare. Guerilla action takes heart, take nerve, and he doesn't have that. [cheering] He's brave when he's got tanks. He's brave when he's got planes. He's brave when he's got bombs. He's brave when he's got a whole lot of company along with him. But you take that little man from Africa and Asia; turn him loose in the woods with a blade. A blade. [cheering] That's all he needs. All he needs is a blade. And when the sun comes down – goes down and it's dark, it's even-Stephen. [cheering]
                                
                So it's the, it's the ballot or the bullet. Today, our people can see that we're faced with a government conspiracy. This government has failed us. The senators who are filibustering concerning your and my rights, that's the government. Don't say it's southern senators, this is the government. This is a government filibuster. It's not a segregationist filibuster, it's a government filibuster. Any kind of activity that takes place on the floor of the Congress or the Senate, that's the government. Any kind of dilly-dallying, that's the government. Any kind of pussy-footing, that's the government. Any kind of act that's designed to delay or deprive you and me, right now, of getting full rights, that's the government that's responsible. And anytime you find the government involved in a conspiracy to violate the citizenship or the civil rights of a people in 1964, then you are wasting your time going to that government expecting redress. Instead you have to take that government to the world court and accuse it of genocide and all of the other crimes that it is guilty of today. [applause]
                                
                So those of us whose political and economic and social philosophy is black nationalism have become involved in the civil rights struggle. We have injected ourselves into the civil rights struggle. And we intend to expand it from the level of civil rights to the level of human rights. As long as you fight it on the level of civil rights, you're under Uncle Sam's jurisdiction. You're going to his court expecting him to correct the problem. He created the problem. He's the criminal! You don't take your case to the criminal, you take your criminal to court. [applause]
                                
                When the government of South Africa began to trample upon the human rights of the people of South Africa they were taken to the U.N. When the government of Portugal began to trample upon the rights of our brothers and sisters in Angola, it was taken before the U.N. Why, even the white man took the Hungarian question to the U.N. And just this week, Chief Justice Goldberg was crying over three million Jews in Russia, about their human rights – charging Russia with violating the U.N. Charter because of its mistreatment of the human rights of Jews in Russia. Now you tell me how can the plight of everybody on this Earth reach the halls of the United Nations and you have twenty-two million Afro-Americans whose churches are being bombed, whose little girls are being murdered, whose leaders are being shot down in broad daylight? Now you tell me why the leaders of this struggle have never taken [recording impaired ] [their case to the U.N.?]
                                
                So our next move is to take the entire civil rights struggle – problem – into the United Nations and let the world see that Uncle Sam is guilty of violating the human rights of 22 million Afro-Americans right down to the year of 1964 and still has the audacity or the nerve to stand up and represent himself as the leader of the free world? [cheering] Not only is he a crook, he's a hypocrite. Here he is standing up in front of other people, Uncle Sam, with the blood of your and mine mothers and fathers on his hands. With the blood dripping down his jaws like a bloody-jawed wolf. And still got the nerve to point his finger at other countries. In 1964 you can't even get civil rights legislation and this man has got the nerve to stand up and talk about South Africa or talk about Nazi Germany or talk about Portugal. No, no more days like those! [applause]
                                
                So I say in my conclusion, the only way we're going to solve it: we got to unite. We got to work together in unity and harmony. And black nationalism is the key. How we gonna overcome the tendency to be at each other's throats that always exists in our neighborhood? And the reason this tendency exists – the strategy of the white man has always been divide and conquer. He keeps us divided in order to conquer us. He tells you, I'm for separation and you for integration, and keep us fighting with each other. No, I'm not for separation and you're not for integration, what you and I are for is freedom. [applause] Only, you think that integration will get you freedom; I think that separation will get me freedom. We both got the same objective, we just got different ways of getting' at it. [applause]
                                
                So I studied this man, Billy Graham, who preaches white nationalism. That's what he preaches. [applause] I say, that's what he preaches. The whole church structure in this country is white nationalism, you go inside a white church – that's what they preaching, white nationalism. They got Jesus white, Mary white, God white, everybody white – that's white nationalism. [cheering]
                                
                So what he does – the way he circumvents the jealousy and envy that he ordinarily would incur among the heads of the church – whenever you go into an area where the church already is, you going to run into trouble. Because they got that thing, what you call it, syndicated … they got a syndicate just like the racketeers have. I'm going to say what's on my mind because the preachers already proved to you that they got a syndicate. [applause] And when you're out in the rackets, whenever you're getting in another man's territory, you know, they gang up on you. And that's the same way with you. You run into the same thing. So how Billy Graham gets around that, instead of going into somebody else's territory, like he going to start a new church, he doesn't try and start a church, he just goes in preaching Christ. And he says anybody who believe in him, you go wherever you find him.
                                
                So, this helps all the churches, and since it helps all the churches, they don't fight him. Well, we going to do the same thing, only our gospel is black nationalism. His gospel is white nationalism, our gospel is black nationalism. And the gospel of black nationalism, as I told you, means you should control your own, the politics of your community, the economy of your community, and all of the society in which you live should be under your control. And once you…feel that this philosophy will solve your problem, go join any church where that's preached. Don't join any church where white nationalism is preached. Why, you can go to a Negro church and be exposed to white nationalism. 'Cause when you are on – when you walk in a Negro church and see a white Jesus and a white Mary and some white angels, that Negro church is preaching white nationalism. [applause]
                                
                But, when you go to a church and you see the pastor of that church with a philosophy and a program that's designed to bring black people together and elevate black people, join that church. Join that church. If you see where the NAACP is preaching and practicing that which is designed to make black nationalism materialize, join the NAACP. Join any kind of organization – civic, religious, fraternal, political or otherwise that's based on lifting the black man up and making him master of his own community. [applause]
                """, true, true);
        //Thread.sleep(2000);
        //System.err.println("English - Bible, the Book of Genesis");
        sample.not_french not_french3 = new not_french("""
                
                Book of Genesis
                7 Which went forth and did not return, till the waters were dried up upon the earth.
                8 He sent forth also a dove after him, to see if the waters had now ceased upon the face of the earth.
                9 But she not finding where her foot might rest, returned to him into the ark: for the waters were upon the whole earth: and he put forth his hand, and caught her, and brought her into the ark.
                10 And having waited yet seven other days, he again sent forth the dove out of the ark.
                11 And she came to him in the evening carry- ing a bough of an olive tree, with green leaves, in her mouth. Noe therefore understood that the waters were ceased upon the earth.
                12 And he stayed yet other seven days: and he sent forth the dove, which returned not any more unto him.
                13 Therefore in the six hundredth and first year, the first month, the first day of the month, the waters were lessened upon the earth, and Noe opening the covering of the ark, looked, and saw that the face of the earth was dried.
                14 In the second month, the seven and twen- tieth day of the month, the earth was dried.
                15 And God spoke to Noe, saying:
                16 Go out of the ark, thou and thy wife, thy sons and the wives of thy sons with thee.
                17 All living things that are with thee of all flesh, as well in fowls as in beasts, and all creep- ing things that creep upon the earth, bring out with thee, and go ye upon the earth: increase and multiply upon it.
                18 So Noe went out, he and his sons: his wife, and the wives of his sons with him.
                19 And all living things, and cattle, and creep- ing things that creep upon the earth, according to their kinds went out of the ark.
                11
                20 And Noe built an altar unto the Lord: and taking of all cattle and fowls that were clean, offered holocausts upon the altar.
                21 And the Lord smelled a sweet savour, and said: I will no more curse the earth for the sake of man: for the imagination and thought of man’s heart are prone to evil from his youth: therefore I will no more destroy every living soul as I have done.
                22 All the days of the earth, seedtime and har- vest, cold and heat, summer and winter, night and day, shall not cease.
                Chapter 9
                And God blessed Noe and his sons. And he said to them: Increase, and multiply, and fill the earth.
                2 And let the fear and dread of you be upon all the beasts of the earth, and upon all the fowls of the air, and all that move upon the earth: all the fishes of the sea are delivered into your hand.
                3 And every thing that moveth, and liveth shall be meat for you: even as the green herbs have I delivered them all to you:
                4 Saving that flesh with blood you shall not eat.
                5 For I will require the blood of your lives at the hand of every beast, and at the hand of man, at the hand of every man, and of his brother, will I require the life of man.
                6 Whosoever shall shed man’s blood, his blood shall be shed: for man was made to the image of God.
                7 But increase you and multiply, and go upon the earth and fill it.
                8 Thus also said God to Noe, and to his sons with him:
               
                12
                9 Behold I will establish my covenant with you, and with your seed after you:
                10 And with every living soul that is with you, as well in all birds, as in cattle and beasts of the earth, that are come forth out of the ark, and in all the beasts of the earth.
                11 I will establish my covenant with you, and all flesh shall be no more destroyed with the wa- ters of a flood, neither shall there be from hence- forth a flood to waste the earth.
                12 And God said: This is the sign of the covenant which I give between me and you, and to every living soul that is with you, for perpet- ual generations.
                13 I will set my bow in the clouds, and it shall be the sign of a covenant between me and be- tween the earth.
                14 And when I shall cover the sky with clouds, my bow shall appear in the clouds:
                15 And I will remember my covenant with you, and with every living soul that beareth flesh: and there shall no more be waters of a flood to destroy all flesh.
                16 And the bow shall be in the clouds, and I shall see it, and shall remember the everlasting covenant, that was made between God and every living soul of all flesh which is upon the earth.
                17 And God said to Noe: This shall be the sign of the covenant, which I have established, between me and all flesh upon the earth.
                18 And the sons of Noe, who came out of the ark, were Sem, Cham, and Japheth: and Cham is the father of Chanaan.
                19 These three are the sons of Noe: and from these was all mankind spread over the whole earth.
                20 And Noe a husbandman began to till the ground, and planted a vineyard.
                21 And drinking of the wine was made drunk, and was uncovered in his tent.
                Book of Genesis
                22 Which when Cham the father of Chanaan had seen, to wit, that his father’s nakedness was uncovered, he told it to his two brethren without.
                23 But Sem and Japheth put a cloak upon their shoulders, and going backward, covered the nakedness of their father: and their faces were turned away, and they saw not their father’s nakedness.
                24 And Noe awaking from the wine, when he had learned what his younger son had done to him,
                25 He said: Cursed be Chanaan, a servant of servants shall he be unto his brethren.
                26 And he said: Blessed be the Lord God of Sem, be Chanaan his servant.
                27 May God enlarge Japheth, and may he dwell in the tents of Sem, and Chanaan be his servant.
                28 And Noe lived after the flood three hun- dred and fifty years.
                29 And all his days were in the whole nine hundred and fifty years: and he died.
                Chapter 10
                These are the generations of the sons of Noe: Sem, Cham, and Japheth: and unto them sons were born after the flood.
                2 The sons of Japheth: Gomer, and Magog, and Madai, and Javan, and Thubal, and Mosoch, and Thiras.
                3 And the sons of Gomer: Ascenez and Riphath and Thogorma.
                4 And the sons of Javan: Elisa and Tharsis, Cetthim and Dodanim.
                5 By these were divided the islands of the Gen- tiles in their lands, every one according to his tongue and their families in their nations.
                
                Book of Genesis
                6 And the Sons of Cham: Chus, and Mesram, and Phuth, and Chanaan.
                7 And the sons of Chus: Saba, and Hevila, and Sabatha, and Regma, and Sabatacha. The sons of Regma: Saba, and Dadan.
                8 Now Chus begot Nemrod: he began to be mighty on the earth.
                9 And he was a stout hunter before the Lord. Hence came a proverb: Even as Nemrod the stout hunter before the Lord.
                10 And the beginning of his kingdom was Babylon, and Arach, and Achad, and Chalanne in the land of Sennaar.
                11 Out of that land came forth Assur, and built Ninive, and the streets of the city, and Chale.
                12 Resen also between Ninive and Chale: this is the great city.
                13 And Mesraim begot Ludim, and Anamim and Laabim, Nephthuim.
                14 And Phetrusim, and Chasluim; of whom came forth the Philistines, and the Capthorim.
                15 And Chanaan begot Sidon his firstborn, the Hethite,
                16 And the Jebusite, and the Amorrhite, and the Gergesite.
                17 The Hevite and Aracite: the Sinite,
                18 And the Aradian, the Samarite, and the Hamathite: and afterwards the families of the Chanaanites were spread abroad.
                19 And the limits of Chanaan were from Sidon as one comes to Gerara even to Gaza, until thou enter Sodom and Gomorrha, and Adama, and Seboim even to Lesa.
                20 These are the children of Cham in their kin- dreds and tongues, and generations, and lands, and nations.
                21 Of Sem also the father of all the children of Heber, the elder brother of Japheth, sons were born.
                13
                22 The sons of Sem: Elam and Assur, and Arphaxad, and Lud, and Aram.
                23 The sons of Aram: Us, and Hull, and Gether; and Mes.
                24 But Arphaxad begot Sale, of whom was born Heber.
                25 And to Heber were born two sons: the name of the one was Phaleg, because in his days was the earth divided: and his brother’s name Jectan.
                26 Which Jectan begot Elmodad, and Saleph, and Asarmoth, Jare,
                27 And Aduram, and Uzal, and Decla,
                28 And Ebal, and Abimael, Saba,
                29 And Ophir, and Hevila, and Jobab. All
                these were the sons of Jectan.
                30 And their dwelling was from Messa as we
                go on as far as Sephar, a mountain in the east. 31 These are the children of Sem according to their kindreds and tongues, and countries in
                their nations.
                32 These are the families of Noe, according
                to their people and nations. By these were the nations divided on the earth after the flood.
                Chapter 11
                And the earth was of one tongue, and of the same speech.
                2 And when they removed from the east, they found a plain in the land of Sennaar, and dwelt in it.
                3 And each one said to his neighbour: Come let us make brick, and bake them with fire. And they had brick instead of stones, and slime in- stead of mortar:
                4 And they said: Come, let us make a city and a tower, the top whereof may reach to heaven;
                
                14
                and let us make our name famous before we be scattered abroad into all lands.
                5 And the Lord came down to see the city and the tower, which the children of Adam were building.
                6 And he said: Behold, it is one people, and all have one tongue: and they have begun to do this, neither will they leave off from their designs, till they accomplish them in deed.
                7 Come ye, therefore, let us go down, and there confound their tongue, that they may not understand one another’s speech.
                8 And so the Lord scattered them from that place into all lands, and they ceased to build the city.
                9 And therefore the name thereof was called Babel, because there the language of the whole earth was confounded: and from thence the Lord scattered them abroad upon the face of all coun- tries.
                10 These are the generations of Sem: Sem was a hundred years old when he begot Arphaxad, two years after the flood.
                11 And Sem lived after he begot Arphaxad, five hundred years, and begot sons and daugh- ters.
                12 And Arphaxad lived thirty-five years, and begot Sale.
                13 And Arphaxad lived after he begot Sale, three hundred and three years, and begot sons and daughters.
                14 Sale also lived thirty years, and begot Heber.
                15 And Sale lived after he begot Heber, four hundred and three years: and begot sons and daughters.
                16 And Heber lived thirty-four years, and be- got Phaleg.
                17 And Heber lived after he begot Phaleg, four hundred and thirty years: and begot sons and
                Book of Genesis
                daughters.
                18 Phaleg also lived thirty years, and begot
                Reu.
                19 And Phaleg lived after he begot Reu, two
                hundred and nine years, and begot sons and daughters.
                20 And Reu lived thirty-two years, and begot Sarug.
                21 And Reu lived after he begot Sarug, two hundred and seven years, and begot sons and daughters.
                22 And Sarug lived thirty years, and begot Nachor.
                23 And Sarug lived after he begot Nachor, two hundred years, and begot sons and daughters.
                24 And Nachor lived nine and twenty years, and begot Thare.
                25 And Nachor lived after he begot Thare, a hundred and nineteen years, and begot sons and daughters.
                26 And Thare lived seventy years, and begot Abram, and Nachor, and Aran.
                27 And these are the generations of Thare: Thare begot Abram, Nachor, and Aran. And Aran begot Lot.
                28 And Aran died before Thare his father, in the land of his nativity in Ur of the Chaldees.
                29 And Abram and Nachor married wives: the name of Abram’s wife was Sarai: and the name of Nachor’s wife, Melcha, the daughter of Aran, father of Melcha and father of Jescha.
                30 And Sarai was barren, and had no children.
                31 And Thare took Abram his son, and Lot the son of Aran, his son’s son, and Sarai his daughter in law, the wife of Abram his son, and brought them out of Ur of the Chaldees, to go into the land of Chanaan: and they came as far as Haran, and dwelt there.
                32 And the days of Thare were two hundred and five years, and he died in Haran.
                
                Book of Genesis
                Chapter 12
                And the Lord said to Abram: Go forth out of thy country, and from thy kindred, and out of thy father’s house, and come into the land which I shall shew thee.
                2 And I will make of thee a great nation, and I will bless thee, and magnify thy name, and thou shalt be blessed.
                3 I will bless them that bless thee, and curse them that curse thee, and IN THEE shall all the kindreds of the earth be blessed.
                4 So Abram went out as the Lord had com- manded him, and Lot went with him: Abram was seventy-five years old when he went forth from Haran.
                5 And he took Sarai his wife, and Lot his brother’s son, and all the substance which they had gathered, and the souls which they had got- ten in Haran: and they went out to go into the land of Chanaan. And when they were come into it,
                6 Abram passed through the country unto the place of Sichem, as far as the noble vale: now the Chanaanite was at that time in the land.
                7 And the Lord appeared to Abram, and said to him: To thy seed will I give this land. And he built there an altar to the Lord, who had ap- peared to him.
                8 And passing on from thence to a mountain, that was on the east side of Bethel, he there pitched his tent, having Bethel on the west, and Hai on the east: he built there also an altar to the Lord, and called upon his name.
                9 And Abram went forward, going and pro- ceeding on to the south.
                10 And there came a famine in the country: and Abram went down into Egypt, to sojourn there: for the famine was very grievous in the land.
                15
                11 And when he was near to enter into Egypt, he said to Sarai his wife: I know that thou art a beautiful woman:
                12 And that when the Egyptians shall see thee, they will say: She is his wife: and they will kill me, and keep thee.
                13 Say, therefore, I pray thee, that thou art my sister: that I may be well used for thee, and that my soul may live for thy sake.
                14 And when Abram was come into Egypt, the Egyptians saw the woman that she was very beautiful.
                15 And the princes told Pharao, and praised her before him: and the woman was taken into the house of Pharao.
                16 And they used Abram well for her sake. And he had sheep and oxen and he asses, and men servants, and maid servants, and she asses, and camels.
                17 But the Lord scourged Pharao and his house with most grievous stripes for Sarai, Abram’s wife.
                18 And Pharao called Abram, and said to him: What is this that thou hast done to me? Why didst thou not tell me that she was thy wife?
                19 For what cause didst thou say, she was thy sister, that I might take her to my wife? Now therefore there is thy wife, take her, and go thy way.
                20 And Pharao gave his men orders concern- ing Abram: and they led him away and his wife, and all that he had.
                Chapter 13
                And Abram went up out of Egypt, he and his wife, and all that he had, and Lot with him into the south.
                
                16
                2 And he was very rich in possession of gold and silver.
                3 And he returned by the way, that he came, from the south to Bethel, to the place where be- fore he had pitched his tent between Bethel and Hai,
                4 In the place of the altar which he had made before, and there he called upon the name of the Lord.
                5 But Lot also, who was with Abram, had flocks of sheep, and herds of beasts, and tents.
                6 Neither was the land able to bear them, that they might dwell together: for their substance was great, and they could not dwell together.
                7 Whereupon also there arose a strife between the herdsmen of Abram and of Lot. And at that time the Chanaanite and the Pherezite dwelled in that country.
                8 Abram therefore said to Lot: Let there be no quarrel, I beseech thee, between me and thee, and between my herdsmen and thy herdsmen: for we are brethren.
                9 Behold the whole land is before thee: depart from me, I pray thee: if thou wilt go to the left hand, I will take the right: if thou choose the right hand, I will pass to the left.
                10 And Lot lifting up his eyes, saw all the country about the Jordan, which was watered throughout, before the Lord destroyed Sodom and Gomorrha, as the paradise of the Lord, and like Egypt as one comes to Segor.
                11 And Lot chose to himself the country about the Jordan, and he departed from the east: and they were separated one brother from the other.
                12 Abram dwelt in the land of Chanaan: and Lot abode in the towns, that were about the Jor- dan, and dwelt in Sodom.
                13 And the men of Sodom were very wicked, and sinners before the face of the Lord beyond measure.
                Book of Genesis
                14 And the Lord said to Abram, after Lot was separated from him: Lift up thy eyes, and look from the place wherein thou now art, to the north and to the south, to the east and to the west.
                15 All the land which thou seest, I will give to thee, and to thy seed for ever.
                16 And I will make thy seed as the dust of the earth: if any man be able to number the dust of the earth, he shall be able to number thy seed also.
                17 Arise and walk through the land in the length, and the breadth thereof: for I will give it to thee.
                18 So Abram removing his tent, came, and dwelt by the vale of Mambre, which is in Hebron: and he built there an altar to the Lord.
                Chapter 14
                And it came to pass at that time, that Amraphel, king of Sennaar, and Arioch, king of Pontus, and Chodorlahomor, king of the Elamites, and Thadal, king of nations,
                2 Made war against Bara, king of Sodom, and against Bersa, king of Gomorrha, and against Sennaab, king of Adama, and against Semeber, king of Seboim, and against the king of Bala, which is Segor.
                3 All these came together into the woodland vale, which now is the salt sea.
                4 For they had served Chodorlahomor twelve years, and in the thirteenth year they revolted from him.
                5 And in the fourteenth year came Chodorla- homor, and the kings that were with him: and they smote the Raphaim in Astarothcarnaim, and the Zuzim with them, and the Emim in Save of Cariathaim.
                
                Book of Genesis
                6 And the Chorreans in the mountains of Seir, even to the plains of Pharan, which is in the wilderness.
                7 And they returned, and came to the foun- tain of Misphat, the same is Cades: and they smote all the country of the Amalecites, and the Amorrhean that dwelt in Asasonthamar.
                8 And the king of Sodom, and the king of Go- morrha, and the king of Adama, and the king of Seboim, and the king of Bala, which is Segor, went out: and they set themselves against them in battle array, in the woodland vale:
                9 To wit, against Chodorlahomor king of the Elamites, and Thadal king of nations, and Am- raphel king of Sennaar, and Arioch king of Pon- tus: four kings against five.
                10 Now the woodland vale had many pits of slime. And the king of Sodom, and the king of Gomorrha turned their backs, and were over- thrown there: and they that remained, fled to the mountain.
                11 And they took all the substance of the Sodomites, and Gomorrhites, and all their vict- uals, and went their way:
                12 And Lot also, the son of Abram’s brother, who dwelt in Sodom, and his substance.
                13 And behold one, that had escaped, told Abram the Hebrew, who dwelt in the vale of Mambre the Amorrhite, the brother of Escol, and the brother of Aner: for these had made a league with Abram.
                14 Which when Abram had heard, to wit, that his brother Lot was taken, he numbered of the servants born in his house, three hundred and eighteen, well appointed: and pursued them to Dan.
                15 And dividing his company, he rushed upon them in the night, and defeated them: and pur- sued them as far as Hoba, which is on the left hand of Damascus.
                17
                16 And he brought back all the substance, and Lot his brother, with his substance, the women also, and the people.
                17 And the king of Sodom went out to meet him, after he returned from the slaughter of Chodorlahomor, and of the kings that were with him in the vale of Save, which is the king’s vale.
                18 But Melchisedech, the king of Salem, bring- ing forth bread and wine, for he was the priest of the most high God,
                19 Blessed him, and said: Blessed be Abram by the most high God, who created heaven and earth.
                20 And blessed be the most high God, by whose protection, the enemies are in thy hands. And he gave him the tithes of all.
                21 And the king of Sodom said to Abram: Give me the persons, and the rest take to thyself. 22 And he answered him: I lift up my hand to the Lord God the most high, the possessor of
                heaven and earth,
                23 That from the very woofthread unto the
                shoe latchet, I will not take of any things that are thine, lest thou say: I have enriched Abram. 24 Except such things as the young men have eaten, and the shares of the men that came with me, Aner, Escol, and Mambre: these shall take
                their shares.
                Chapter 15
                Now when these things were done, the word of the Lord came to Abram by a vision, saying: Fear not, Abram, I am thy protector, and thy reward exceeding great.
                2 And Abram said: Lord God, what wilt thou give me? I shall go without children: and the son of the steward of my house is this Damascus Eliezer.
                """, true, true);
        //Thread.sleep(2000);
        //System.err.println("French - Patrick Modiano, Rue de Boutiques Obscures");
        sample.not_french not_french4 = new not_french("""
                Je ne suis rien. Rien qu'une silhouette claire, ce soir-là, à la terrasse d'un café. J'attendais que la pluie s'arrêtât, une averse qui avait commencé de tomber au moment où Hutte me quittait.
                                
                Quelques heures auparavant, nous nous étions retrouvés pour la dernière fois dans les locaux de l'Agence. Hutte se tenait derrière le bureau massif, comme d'habitude, mais gardait son manteau, de sorte qu'on avait vraiment l'impression d'un départ. J'étais assis en face de lui, sur le fauteuil en cuir réservé aux clients. La lampe d'opaline répandait une lumière vive qui m'éblouissait.
                                
                - Eh bien voilà, Guy... C'est fini..., a dit Hutte dans un soupir.
                                
                Un dossier traînait sur le bureau. Peut-être celui du petit homme brun au regard effaré et au visage bouffi, qui nous avait chargés de suivre sa femme. L'après-midi, elle allait rejoindre un autre petit homme brun au visage bouffi, dans un hôtel meublé de la rue Vital, voisine de l'avenue Paul-Doumer. [11]
                                
                Hutte se caressait pensivement la barbe, une barbe poivre et sel, courte, mais qui lui mangeait les joues. Ses gros yeux clairs étaient perdus dans le vague. A gauche du bureau, la chaise d'osier où je m'asseyais aux heures de travail. Derrière Hutte, des rayonnages de bois sombre couvraient la moitié du mur : y étaient rangés des Bottins et des annuaires de toutes espèces et de ces cinquante dernières années. Hutte m'avait souvent dit qu'ils étaient des outils de travail irremplaçables dont il ne se séparerait jamais. Et que ces Bottins et ces annuaires constituaient la plus précieuse et la plus émouvante bibliothèque qu'on pût avoir, car sur leurs pages étaient répertoriés bien des êtres, des choses, des mondes disparus, et dont eux seuls portaient témoignage.
                                
                - Qu'est-ce que vous allez faire de tous ces Bottins ? ai-je demandé à Hutte, en désignant d'un mouvement large du bras les rayonnages.
                                
                - Je les laisse ici, Guy. Je garde le bail de l'appartement.
                                
                Il jeta un regard rapide autour de lui. Les deux battants de la porte qui donnait accès à la petite pièce voisine étaient ouverts et l'on distinguait le canapé au velours usé, la cheminée, et la glace où se réfléchissaient les rangées d'annuaires et de Bottins et le visage de Hutte. Souvent nos clients attendaient dans cette pièce. Un tapis persan protégeait le parquet. Au mur, près de la fenêtre, était accrochée une icône.
                                
                - A quoi pensez-vous, Guy ? [12]
                                
                - A rien. Alors, vous gardez le bail ?
                                
                - Oui. Je reviendrai de temps en temps à Paris et l'Agence sera mon pied-à-terre.
                                
                Il m'a tendu son étui à cigarettes.
                                
                - Je trouve ça moins triste de conserver l'Agence telle qu'elle était.
                                
                Cela faisait plus de huit ans que nous travaillions ensemble. Lui-même avait créé cette agence de police privée en 1947 et travaillé avec bien d'autres personnes, avant moi. Notre rôle était de fournir aux clients ce que Hutte appelait des « renseignements mondains ». Tout se passait, comme il le répétait volontiers, entre « gens du monde ».
                                
                - Vous croyez que vous pourrez vivre à Nice ?
                                
                - Mais oui.
                                
                - Vous n'allez pas vous ennuyer ?
                                
                Il a soufflé la fumée de sa cigarette.
                                
                - Il faut bien prendre sa retraite un jour, Guy.
                                
                Il s'est levé lourdement. Hutte doit peser plus de cent kilos et mesurer un mètre quatre-vingt-quinze.
                                
                - Mon train est à 20 h 55. Nous avons le temps de prendre un verre.
                                
                Il m'a précédé dans le couloir qui mène au vestibule. Celui-ci a une curieuse forme ovale et des murs d'un beige déteint. Une serviette noire, si pleine qu'on n'avait pas pu la fermer, était posée par terre. Hutte la prit. Il la portait en la soutenant de la main.
                                
                - Vous n'avez pas de bagages ?
                                
                - J'ai fait tout envoyer d'avance.
                                
                Hutte a ouvert la porte d'entrée et j'ai éteint la [13] lumière du vestibule. Sur le palier. Hutte a hésité un instant avant de refermer la porte et ce claquement métallique m'a pincé le cœur. Il marquait la fin d'une longue période de ma vie.
                                
                - Ça fout le cafard, hein, Guy? m'a dit Hutte, et il avait sorti de la poche de son manteau un grand mouchoir dont il s'épongeait le front.
                                
                Sur la porte, il y avait toujours la plaque rectangulaire de marbre noir où était inscrit en lettres dorées et pailletées :
                                
                \s
                                
                C M HUTTE
                                
                Enquêtes privées.
                                
                \s
                                
                - Je la laisse, m'a dit Hutte.
                                
                Puis il a donné un tour de clé.
                                
                Nous avons suivi l'avenue Niel jusqu'à la place Pereire. Il faisait nuit et bien que nous entrions dans l'hiver, l'air était tiède. Place Pereire, nous nous sommes assis à la terrasse des Hortensias. Hutte aimait ce café, parce que les chaises y étaient cannées, « comme avant ».
                                
                - Et vous, Guy, qu'est-ce que vous allez devenir ? m'a-t-il demandé après avoir bu une gorgée de fine à l'eau.
                                
                - Moi ? Je suis sur une piste.
                                
                - Une piste ?
                                
                - Oui. Une piste de mon passé...
                                
                J'avais dit cette phrase d'un ton pompeux qui l'a fait sourire. [14]
                                
                - J'ai toujours cru qu'un jour vous retrouveriez votre passé.
                                
                Cette fois-ci, il était grave et cela m'a ému.
                                
                - Mais voyez-vous, Guy, je me demande si cela en vaut vraiment la peine...
                                
                Il a gardé le silence. A quoi rêvait-il ? A son passé à lui?
                                
                - Je vous donne une clé de l'Agence. Vous pouvez y aller de temps en temps. Ça me ferait plaisir.
                                
                Il m'a tendu une clé que j'ai glissée dans la poche de mon pantalon.
                                
                - Et téléphonez-moi à Nice. Mettez-moi au courant... au sujet de votre passé...
                                
                Il s'est levé et m'a serré la main.
                                
                - Voulez-vous que je vous accompagne au train?
                                
                - Oh non... non... C'est tellement triste...
                                
                Il est sorti du café d'une seule enjambée, en évitant de se retourner, et j'ai éprouvé une sensation de vide. Cet homme avait beaucoup compté pour moi. Sans lui, sans son aide, je me demande ce que je serais devenu, voilà dix ans, quand j'avais brusquement été frappé d'amnésie et que je tâtonnais dans le brouillard. Il avait été ému par mon cas et grâce à ses nombreuses relations, m'avait même procuré un état civil.
                                
                - Tenez, m'avait-il dit en ouvrant une grande enveloppe qui contenait une carte d'identité et un passeport. Vous vous appelez maintenant « Guy Roland ». [15]
                                
                Et ce détective que j'étais venu consulter pour qu'il mît son habileté à rechercher des témoins ou des traces de mon passé avait ajouté :
                                
                - Mon cher « Guy Roland », à partir de maintenant, ne regardez plus en arrière et pensez au présent et à l'avenir. Je vous propose de travailler avec moi...
                                
                S'il me prenait en sympathie, c'est que lui aussi - je l'appris plus tard - avait perdu ses propres traces et que toute une partie de sa vie avait sombré d'un seul coup, sans qu'il subsistât le moindre fil conducteur, la moindre attache qui aurait pu encore le relier au passé. Car qu'y a-t-il de commun entre ce vieil homme fourbu que je vois s'éloigner dans la nuit avec son manteau râpé et sa grosse serviette noire, et le joueur de tennis d'autrefois, le bel et blond baron balte Constantin von Hutte ?
                                
                \s
                                
                II
                \s
                                
                - Allô ? Monsieur Paul Sonachitzé ?
                                
                - Lui-même.
                                
                - Guy Roland à l'appareil... Vous savez, le...
                                
                - Mais oui, je sais ! Nous pouvons nous voir ?
                                
                - Comme vous voulez...
                                
                - Par exemple... ce soir vers neuf heures rue
                                
                Anatole-de-la-Forge?... Ça vous va?
                                
                - Entendu.
                                
                - Je vous attends. A tout à l'heure.
                                
                Il a raccroché brusquement et la sueur coulait le long de mes tempes. J'avais bu un verre de cognac afin de me donner du courage. Pourquoi une chose aussi anodine que de composer sur un cadran un numéro de téléphone me cause, à moi, tant de peine et d'appréhension ?
                                
                Au bar de la rue Anatole-de-la-Forge, il n'y avait aucun client, et il se tenait derrière le comptoir en costume de ville.
                                
                - Vous tombez bien, m'a-t-il dit. J'ai congé tous les mercredis soir. [17]
                                
                Il est venu vers moi et m'a pris par l'épaule.
                                
                - J'ai beaucoup pensé à vous.
                                
                - Merci.
                                
                - Ça me préoccupe vraiment, vous savez...
                                
                J'aurais voulu lui dire qu'il ne se fît pas de soucis à mon sujet, mais les mots ne venaient pas.
                                
                - Je crois finalement que vous deviez être dans l'entourage de quelqu'un que je voyais souvent à une certaine époque... Mais qui?
                                
                Il hochait la tête.
                                
                - Vous ne pouvez pas me mettre sur la piste ?
                                
                - Non.
                                
                - Pourquoi?
                                
                - Je n'ai aucune mémoire, monsieur.
                                
                Il a cru que je plaisantais, et comme s'il s'agissait d'un jeu ou d'une devinette, il a dit :
                                
                - Bon. Je me débrouillerai tout seul. Vous me laissez carte blanche ?
                                
                - Si vous voulez.
                                
                - Alors ce soir, je vous emmène dîner chez un ami.
                                
                Avant de sortir, il a baissé, d'un mouvement sec, la manette d'un compteur électrique et fermé la porte de bois massif en donnant plusieurs tours de clé.
                                
                Sa voiture stationnait sur le trottoir opposé. Elle était noire et neuve. Il m'a ouvert la portière poliment.
                                
                - Cet ami s'occupe d'un restaurant très agréable à la limite de Ville-d'Avray et de Saint-Cloud.
                                
                - Et nous allons jusque là-bas ? [18]
                                
                - Oui.
                                
                De la rue Anatole-de-la-Forge, nous débouchions dans l'avenue de la Grande-Armée et j'ai eu la tentation de quitter brusquement la voiture. Aller jusqu'à Ville-d'Avray me semblait insurmontable. Mais il fallait être courageux.
                                
                Jusqu'à ce que nous soyons parvenus à la porte de Saint-Cloud, j'ai dû combattre la peur panique qui m'empoignait. Je connaissais à peine ce Sonachitzé. Ne m'attirait-il pas dans un traquenard ? Mais, peu à peu, en l'écoutant parler, je me suis apaisé. Il me citait les différentes étapes de sa vie professionnelle. Il avait d'abord travaillé dans des boîtes de nuit russes, puis au Langer, un restaurant des jardins des Champs-Elysées, puis à l'hôtel Castille, rue Cambon, et il était passé par d'autres établissements, avant de s'occuper de ce bar de la rue Anatole-de-la-Forge. Chaque fois, il retrouvait Jean Heurteur, l'ami chez lequel nous allions, de sorte qu'ils avaient formé un tandem pendant une vingtaine d'années. Heurteur aussi avait de la mémoire. A eux deux, ils résoudraient certainement « l'énigme » que je posais.
                                
                Sonachitzé conduisait avec une grande prudence et nous avons mis près de trois quarts d'heure pour arriver à destination.
                                
                Une sorte de bungalow dont un saule pleureur cachait la partie gauche. Vers la droite, je discernais un fouillis de buissons. La salle du restaurant était vaste. Du fond, où brillait une lumière vive, un homme marchait vers nous. Il me tendit la main. [19]
                                
                - Enchanté, monsieur. Jean Heurteur.
                                
                Puis, à l'adresse de Sonachitzé :
                                
                - Salut, Paul.
                                
                Il nous entraînait vers le fond de la salle. Une table de trois couverts était dressée, au centre de laquelle il y avait un bouquet de fleurs.
                                
                Il désigna l'une des portes-fenêtres :
                                
                - J'ai des clients dans l'autre bungalow. Une noce.
                                
                - Vous n'êtes jamais venu ici? me demanda Sonachitzé.
                                
                - Non.
                                
                - Alors, Jean, montre-lui la vue.
                                
                Heurteur me précéda sur une véranda qui dominait un étang. A gauche, un petit pont bombé, de style chinois, menait à un autre bungalow, de l'autre côté de l'étang. Les portes-fenêtres étaient violemment éclairées et derrière elles je voyais passer des couples. On dansait. Les bribes d'une musique nous parvenaient de là-bas.
                                
                - Ils ne sont pas nombreux, me dit-il, et j'ai l'impression que cette noce va finir en partouze.
                                
                Il haussa les épaules.
                                
                - Il faudrait que vous veniez en été. On dîne sur la véranda. C'est agréable.
                                
                Nous rentrâmes dans la salle du restaurant et Heurteur ferma la porte-fenêtre.
                                
                - Je vous ai préparé un dîner sans prétention.
                                
                Il nous fit signe de nous asseoir. Ils étaient côte à côte, en face de moi. [20]
                                
                - Qu'est-ce que vous aimez, comme vins ? me demanda Heurteur.
                                
                - Comme vous voulez.
                                
                - Château-petrus ?
                                
                - C'est une excellente idée, Jean, dit Sonachitzé.
                                
                Un jeune homme en veste blanche nous servait. La lumière de l'applique du mur tombait droit sur moi et m'éblouissait. Les autres étaient dans l'ombre, mais sans doute m'avaient-ils placé là pour mieux me reconnaître.
                                
                - Alors, Jean ?
                                
                Heurteur avait entamé sa galantine et me jetait, de temps en temps, un regard aigu. Il était brun, comme Sonachitzé, et comme lui se teignait les cheveux. Une peau grumeleuse, des joues flasques et de minces lèvres de gastronome.
                                
                - Oui, oui..., a-t-il murmuré.
                                
                Je clignais les yeux, à cause de la lumière. Il nous a versé du vin.
                                
                - Oui... oui... je crois que j'ai déjà vu mon-sieur...
                                
                - C'est un véritable casse-tête, a dit Sonachitzé. Monsieur refuse de nous mettre sur la voie...
                                
                Il semblait saisi d'une inspiration.
                                
                - Mais peut-être voulez-vous que nous n'en parlions plus ? Vous préférez rester « incognito » ?
                                
                - Pas du tout, ai-je dit avec le sourire.
                                
                Le jeune homme servait un ris de veau.
                                
                - Quelle est votre profession? m'a demandé Heurteur.[21]
                                
                - J'ai travaillé pendant huit ans dans une agence de police privée, l'agence C. M. Hutte.
                                
                Ils me considéraient, stupéfaits.
                                
                - Mais cela n'a certainement aucun rapport avec ma vie antérieure. Alors, n'en tenez pas compte.
                                
                - C'est curieux, a déclaré Heurteur en me fixant, on ne pourrait pas dire l'âge que vous avez.
                                
                - A cause de ma moustache, sans doute.
                                
                - Sans votre moustache, a dit Sonachitzé, nous vous reconnaîtrions peut-être tout de suite.
                                
                Et il tendait le bras, posait sa main à plat juste audessous de mon nez pour cacher la moustache, et cillait des yeux comme le portraitiste devant son modèle.
                                
                - Plus je regarde monsieur, plus j'ai l'impression qu'il appartenait à un groupe de noctambules..., a dit Heurteur.
                                
                - Mais quand ? a demandé Sonachitzé.
                                
                - Oh... il y a longtemps... Cela fait une éternité que nous ne travaillons plus dans les boîtes de nuit, Paul...
                                
                - Tu crois que ça remonterait au temps du Tanagi a ?
                                
                Heurteur me fixait d'un regard de plus en plus intense.
                                
                - Excusez-moi, me dit-il. Pourriez-vous vous lever une seconde ?
                                
                Je m'exécutai. Il me regardait de haut en bas et de bas en haut. [22]
                                
                - Mais oui, ça me rappelle un client. Votre taille... Attendez...
                                
                Il avait levé la main et se figeait comme s'il voulait retenir quelque chose qui risquait de se dissiper d'un instant à l'autre.
                                
                - Attendez... Attendez... Ça y est, Paul...
                                
                Il avait un sourire triomphal.
                                
                - Vous pouvez vous rasseoir...
                                
                Il jubilait. Il était sûr que ce qu'il allait dire ferait son effet. Il nous versait du vin, à Sonachitzé et à moi, d'une manière cérémonieuse.
                                
                - Voilà... Vous étiez toujours accompagné d'un homme aussi grand que vous... Peut-être plus grand encore... Ça ne te dit rien, Paul ?
                                
                - Mais de quelle époque parles-tu ? a demandé
                                
                Sonachitzé.
                                
                - De celle du Tanagra, bien sûr...
                                
                - Un homme aussi grand que lui? a répété
                                
                Sonachitzé pour lui-même. Au Tanagra?...
                                
                - Tu ne vois pas ?
                                
                Heurteur haussait les épaules.
                                
                Maintenant c'était au tour de Sonachitzé d'avoir un sourire de triomphe. Il hochait la tête.
                                
                - Je vois...
                                
                - Alors?
                                
                - Stioppa.
                                
                - Mais oui. Stioppa...
                                
                Sonachitzé s'était tourné vers moi.
                                
                - Vous connaissiez Stioppa ?
                                
                - Peut-être, ai-je dit prudemment. [23]
                                
                - Oh... ! Ils ont tous disparu, a dit Sonachitzé d'une voix lugubre. Sauf vous, monsieur... Je suis ravi d'avoir pu vous... vous « localiser »... Vous apparteniez à la bande de Stioppa... Je vous félicite... C'était une époque beaucoup plus belle que la nôtre, et surtout les gens étaient de meilleure qualité qu'aujourd'hui...
                                
                - Et surtout, nous étions plus jeunes, a dit Heurteur en riant.
                                
                - Ça remonte à quand ? leur ai-je demandé, le cœur battant.
                                
                - Nous sommes brouillés avec les dates, a dit Sonachitzé. De toute façon, cela remonte au déluge...
                                
                Il était accablé, brusquement.
                                
                - Il y a parfois des coïncidences, a dit Heurteur.
                                
                Et il se leva, se dirigea vers un petit bar, dans un coin de la pièce, et nous rapporta un journal dont il feuilleta les pages. Enfin, il me tendit le journal en me désignant l'annonce suivante :
                                
                « On nous prie d'annoncer le décès de Marie de Resen, survenu le 25 octobre dans sa quatre-vingt-douzième année.
                                
                « De la part de sa fille, de son fils, de ses petits-fils, neveux et petits-neveux.
                                
                « Et de la part de ses amis Georges Sacher et Stioppa de Djagoriew.
                                
                « La cérémonie religieuse, suivie de l'inhumation au cimetière de Sainte-Geneviève-des-Bois, aura lieu le 4 novembre à 16 heures en la chapelle du cimetière. [26]
                                
                «( L'office du 9e jour sera célébré le 5 novembre en l'église orthodoxe russe, 19, rue Claude-Lorrain, Paris XVIe.
                                
                « Le présent avis tient lieu de f airepart. »
                                
                - Alors, Stioppa est vivant? a dit Sonachitzé. Vous le voyez encore ?
                                
                - Non, ai-je dit.
                                
                - Vous avez raison. Il faut vivre au présent. Jean, tu nous sers un alcool ?
                                
                - Tout de suite.
                                
                A partir de ce moment, ils ont paru se désintéresser tout à fait de Stioppa et de mon passé. Mais cela n'avait aucune importance, puisque je tenais enfin une piste.
                                
                - Vous pouvez me laisser ce journal? ai-je demandé avec une feinte indifférence.
                                
                - Bien sûr, a dit Heurteur.
                                
                Nous avons trinqué. Ainsi, de ce que j'avais été jadis, il ne restait plus qu'une silhouette dans la mémoire de deux barmen, et encore était-elle à moitié cachée par celle d'un certain Stioppa de Djagoriew. Et de ce Stioppa, ils n'avaient pas eu de nouvelles « depuis le déluge », comme disait Sonachitzé.
                                
                - Donc, vous êtes détective privé ? m'a demandé Heurteur.
                                
                - Plus maintenant. Mon patron vient de prendre sa retraite.
                                
                - Et vous ? Vous continuez ?
                                
                J'ai haussé les épaules, sans répondre.[27]
                                
                - En tout cas, je serais ravi de vous revoir. Revenez ici quand vous voudrez.
                                
                Il s'était levé et nous tendait la main.
                                
                - Excusez-moi... Je vous mets à la porte mais j'ai encore de la comptabilité à faire... Et les autres, avec leur partouze...
                                
                Il fit un geste en direction de l'étang.
                                
                - Au revoir, Jean.
                                
                - Au revoir, Paul.
                                
                Heurteur me regardait pensivement. D'une voix très lente :
                                
                - Maintenant que vous êtes debout, vous me rappelez autre chose...
                                
                - Il te rappelle quoi ? demanda Sonachitzé.
                                
                - Un client qui rentrait tous les soirs très tard quand nous travaillions à l'hôtel Castille...
                                
                Sonachitzé à son tour me considérait de la tête aux pieds.
                                
                - C'est possible après tout, me dit-il, que vous soyez un ancien client de l'hôtel Castille...
                                
                J'ai eu un sourire embarrassé.
                                
                Sonachitzé m'a pris le bras et nous avons traversé la salle du restaurant, encore plus obscure qu'à notre arrivée. La mariée en robe bleu pâle ne se trouvait plus à sa table. Dehors, nous avons entendu des bouffées de musique et des rires qui venaient de l'autre côté de l'étang.
                                
                - S'il vous plaît, ai-je demandé à Sonachitzé, pouvez-vous me rappeler quelle était la chanson que réclamait toujours ce... ce...
                                
                - Ce Stioppa ? [28]
                                
                - Oui.
                                
                Il s'est mis à siffler les premières mesures. Puis il s'est arrêté.
                                
                - Vous allez revoir Stioppa ?
                                
                - Peut-être.
                                
                Il m'a serré le bras très fort.
                                
                - Dites-lui que Sonachitzé pense encore souvent à lui.
                                
                Son regard s'attardait sur moi :
                                
                - Au fond, Jean a peut-être raison. Vous étiez un client de l'hôtel Castille... Essayez de vous rappeler... l'hôtel Castille, rue Cambon...
                                
                J'ai détourné la tête et ouvert la portière de la voiture. Quelqu'un était blotti sur le siège avant, le front appuyé contre la vitre. Je me suis penché et j'ai reconnu la mariée. Elle dormait, sa robe bleu pâle relevée jusqu'à micuisses.
                                
                - Il faut la sortir de là, m'a dit Sonachitzé.
                                
                Je l'ai secouée doucement mais elle dormait toujours. Alors, je l'ai prise par la taille et je suis parvenu à la tirer hors de la voiture.
                                
                - On ne peut quand même pas la laisser par terre, ai-je dit.
                                
                Je l'ai portée dans mes bras jusqu'à l'auberge. Sa tête avait basculé sur mon épaule et ses cheveux blonds me caressaient le cou. Elle avait un parfum poivré qui me rappelait quelque chose. Mais quoi ?
                                
                                
                """, true, true);
        //Thread.sleep(2000);
        //System.err.println("English - Delia Owens, Where the Crawdads Sing");
        sample.not_french not_french5 = new not_french("""
                Prologue
                1969
                                
                Marsh is not swamp. Marsh is a space of light, where grass grows in water, and water flows into the sky. Slow-moving creeks wander, carrying the orb of the sun with them to the sea, and long-legged birds lift with unexpected grace—as though not built to fly—against the roar of a thousand snow geese.
                                
                Then within the marsh, here and there, true swamp crawls into low-lying bogs, hidden in clammy forests. Swamp water is still and dark, having swallowed the light in its muddy throat. Even night crawlers are diurnal in this lair. There are sounds, of course, but compared to the marsh, the swamp is quiet because decomposition is cellular work. Life decays and reeks and returns to the rotted duff; a poignant wallow of death begetting life.
                                
                On the morning of October 30, 1969, the body of Chase Andrews lay in the swamp, which would have absorbed it silently, routinely. Hiding it for good. A swamp knows all about death, and doesn’t necessarily define it as tragedy, certainly not a sin. But this morning two boys from the village rode their bikes out to the old fire tower and, from the third switchback, spotted his denim jacket.
                                
                1.
                Ma
                1952
                                
                The morning burned so August-hot, the marsh’s moist breath hung the oaks and pines with fog. The palmetto patches stood unusually quiet except for the low, slow flap of the heron’s wings lifting from the lagoon. And then, Kya, only six at the time, heard the screen door slap. Standing on the stool, she stopped scrubbing grits from the pot and lowered it into the basin of worn-out suds. No sounds now but her own breathing. Who had left the shack? Not Ma. She never let the door slam.
                                
                But when Kya ran to the porch, she saw her mother in a long brown skirt, kick pleats nipping at her ankles, as she walked down the sandy lane in high heels. The stubby-nosed shoes were fake alligator skin. Her only going-out pair. Kya wanted to holler out but knew not to rouse Pa, so she opened the door and stood on the brick-’n’-board steps. From there she saw the blue train case Ma carried. Usually, with the confidence of a pup, Kya knew her mother would return with meat wrapped in greasy brown paper or with a chicken, head dangling down. But she never wore the gator heels, never took a case.
                                
                Ma always looked back where the foot lane met the road, one arm held high, white palm waving, as she turned onto the track, which wove through bog forests, cattail lagoons, and maybe—if the tide obliged—eventually into town. But today she walked on, unsteady in the ruts. Her tall figure emerged now and then through the holes of the forest until only swatches of white scarf flashed between the leaves. Kya sprinted to the spot she knew would bare the road; surely Ma would wave from there, but she arrived only in time to glimpse the blue case—the color so wrong for the woods—as it disappeared. A heaviness, thick as black-cotton mud, pushed her chest as she returned to the steps to wait.
                                
                Kya was the youngest of five, the others much older, though later she couldn’t recall their ages. They lived with Ma and Pa, squeezed together like penned rabbits, in the rough-cut shack, its screened porch staring big-eyed from under the oaks.
                                
                Jodie, the brother closest to Kya, but still seven years older, stepped from the house and stood behind her. He had her same dark eyes and black hair; had taught her birdsongs, star names, how to steer the boat through saw grass.
                                
                “Ma’ll be back,” he said.
                                
                “I dunno. She’s wearin’ her gator shoes.”
                                
                “A ma don’t leave her kids. It ain’t in ’em.”
                                
                “You told me that fox left her babies.”
                                
                “Yeah, but that vixen got ’er leg all tore up. She’d’ve starved to death if she’d tried to feed herself ’n’ her kits. She was better off to leave ’em, heal herself up, then whelp more when she could raise ’em good. Ma ain’t starvin’, she’ll be back.” Jodie wasn’t nearly as sure as he sounded, but said it for Kya.
                                
                Her throat tight, she whispered, “But Ma’s carryin’ that blue case like she’s goin’ somewheres big.”
                                
                •   •   •
                THE SHACK SAT BACK from the palmettos, which sprawled across sand flats to a necklace of green lagoons and, in the distance, all the marsh beyond. Miles of blade-grass so tough it grew in salt water, interrupted only by trees so bent they wore the shape of the wind. Oak forests bunched around the other sides of the shack and sheltered the closest lagoon, its surface so rich in life it churned. Salt air and gull-song drifted through the trees from the sea.
                                
                Claiming territory hadn’t changed much since the 1500s. The scattered marsh holdings weren’t legally described, just staked out natural—a creek boundary here, a dead oak there—by renegades. A man doesn’t set up a palmetto lean-to in a bog unless he’s on the run from somebody or at the end of his own road.
                                
                The marsh was guarded by a torn shoreline, labeled by early explorers as the “Graveyard of the Atlantic” because riptides, furious winds, and shallow shoals wrecked ships like paper hats along what would become the North Carolina coast. One seaman’s journal read, “rang’d along the Shoar . . . but could discern no Entrance . . . A violent Storm overtook us . . . we were forced to get off to Sea, to secure Ourselves and Ship, and were driven by the Rapidity of a strong Current . . .
                                
                “The Land . . . being marshy and Swamps, we return’d towards our Ship . . . Discouragement of all such as should hereafter come into those Parts to settle.”
                                
                Those looking for serious land moved on, and this infamous marsh became a net, scooping up a mishmash of mutinous sailors, castaways, debtors, and fugitives dodging wars, taxes, or laws that they didn’t take to. The ones malaria didn’t kill or the swamp didn’t swallow bred into a woodsmen tribe of several races and multiple cultures, each of whom could fell a small forest with a hatchet and pack a buck for miles. Like river rats, each had his own territory, yet had to fit into the fringe or simply disappear some day in the swamp. Two hundred years later, they were joined by runaway slaves, who escaped into the marsh and were called maroons, and freed slaves, penniless and beleaguered, who dispersed into the water-land because of scant options.
                                
                Maybe it was mean country, but not an inch was lean. Layers of life—squiggly sand crabs, mud-waddling crayfish, waterfowl, fish, shrimp, oysters, fatted deer, and plump geese—were piled on the land or in the water. A man who didn’t mind scrabbling for supper would never starve.
                                
                It was now 1952, so some of the claims had been held by a string of disconnected, unrecorded persons for four centuries. Most before the Civil War. Others squatted on the land more recently, especially after the World Wars, when men came back broke and broke-up. The marsh did not confine them but defined them and, like any sacred ground, kept their secrets deep. No one cared that they held the land because nobody else wanted it. After all, it was wasteland bog.
                                
                Just like their whiskey, the marsh dwellers bootlegged their own laws—not like those burned onto stone tablets or inscribed on documents, but deeper ones, stamped in their genes. Ancient and natural, like those hatched from hawks and doves. When cornered, desperate, or isolated, man reverts to those instincts that aim straight at survival. Quick and just. They will always be the trump cards because they are passed on more frequently from one generation to the next than the gentler genes. It is not a morality, but simple math. Among themselves, doves fight as often as hawks.
                                
                •   •   •
                MA DIDN’T COME BACK that day. No one spoke of it. Least of all Pa. Stinking of fish and drum likker, he clanked pot lids. “Whar’s supper?”
                                
                Eyes downcast, the brothers and sisters shrugged. Pa dog-cussed, then limp-stepped out, back into the woods. There had been fights before; Ma had even left a time or two, but she always came back, scooping up whoever would be cuddled.
                                
                The two older sisters cooked a supper of red beans and cornbread, but no one sat to eat at the table, as they would have with Ma. Each dipped beans from the pot, flopped cornbread on top, and wandered off to eat on their floor mattresses or the faded sofa.
                                
                Kya couldn’t eat. She sat on the porch steps, looking down the lane. Tall for her age, bone skinny, she had deep-tanned skin and straight hair, black and thick as crow wings.
                                
                Darkness put a stop to her lookout. Croaking frogs would drown the sounds of footsteps; even so, she lay on her porch bed, listening. Just that morning she’d awakened to fatback crackling in the iron skillet and whiffs of biscuits browning in the wood oven. Pulling up her bib overalls, she’d rushed into the kitchen to put the plates and forks out. Pick the weevils from the grits. Most dawns, smiling wide, Ma hugged her—“Good morning, my special girl”—and the two of them moved about the chores, dancelike. Sometimes Ma sang folk songs or quoted nursery rhymes: “This little piggy went to market.” Or she’d swing Kya into a jitterbug, their feet banging the plywood floor until the music of the battery-operated radio died, sounding as if it were singing to itself at the bottom of a barrel. Other mornings Ma spoke about adult things Kya didn’t understand, but she figured Ma’s words needed somewhere to go, so she absorbed them through her skin, as she poked more wood in the cookstove. Nodding like she knew.
                                
                Then, the hustle of getting everybody up and fed. Pa not there. He had two settings: silence and shouting. So it was just fine when he slept through, or didn’t come home at all.
                                
                But this morning, Ma had been quiet; her smile lost, her eyes red. She’d tied a white scarf pirate style, low across her forehead, but the purple and yellow edges of a bruise spilled out. Right after breakfast, even before the dishes were washed, Ma had put a few personals in the train case and walked down the road.
                                
                •   •   •
                THE NEXT MORNING, Kya took up her post again on the steps, her dark eyes boring down the lane like a tunnel waiting for a train. The marsh beyond was veiled in fog so low its cushy bottom sat right on the mud. Barefoot, Kya drummed her toes, twirled grass stems at doodlebugs, but a six-year-old can’t sit long and soon she moseyed onto the tidal flats, sucking sounds pulling at her toes. Squatting at the edge of the clear water, she watched minnows dart between sunspots and shadows.
                                
                Jodie hollered to her from the palmettos. She stared; maybe he was coming with news. But as he wove through the spiky fronds, she knew by the way he moved, casual, that Ma wasn’t home.
                                
                “Ya wanta play explorers?” he asked.
                                
                “Ya said ya’re too old to play ’splorers.”
                                
                “Nah, I just said that. Never too old. Race ya!”
                                
                They tore across the flats, then through the woods toward the beach. She squealed as he overtook her and laughed until they reached the large oak that jutted enormous arms over the sand. Jodie and their older brother, Murph, had hammered a few boards across the branches as a lookout tower and tree fort. Now, much of it was falling in, dangling from rusty nails.
                                
                Usually if she was allowed to crew at all it was as slave girl, bringing her brothers warm biscuits swiped from Ma’s pan.
                                
                But today Jodie said, “You can be captain.”
                                
                Kya raised her right arm in a charge. “Run off the Spaniards!” They broke off stick-swords and crashed through brambles, shouting and stabbing at the enemy.
                                
                Then—make-believe coming and going easily—she walked to a mossy log and sat. Silently, he joined her. He wanted to say something to get her mind off Ma, but no words came, so they watched the swimming shadows of water striders.
                                
                Kya returned to the porch steps later and waited for a long time, but, as she looked to the end of the lane, she never cried. Her face was still, her lips a simple thin line under searching eyes. But Ma didn’t come back that day either.
                                
                1.
                Ma
                1952
                                
                The morning burned so August-hot, the marsh’s moist breath hung the oaks and pines with fog. The palmetto patches stood unusually quiet except for the low, slow flap of the heron’s wings lifting from the lagoon. And then, Kya, only six at the time, heard the screen door slap. Standing on the stool, she stopped scrubbing grits from the pot and lowered it into the basin of worn-out suds. No sounds now but her own breathing. Who had left the shack? Not Ma. She never let the door slam.
                                
                But when Kya ran to the porch, she saw her mother in a long brown skirt, kick pleats nipping at her ankles, as she walked down the sandy lane in high heels. The stubby-nosed shoes were fake alligator skin. Her only going-out pair. Kya wanted to holler out but knew not to rouse Pa, so she opened the door and stood on the brick-’n’-board steps. From there she saw the blue train case Ma carried. Usually, with the confidence of a pup, Kya knew her mother would return with meat wrapped in greasy brown paper or with a chicken, head dangling down. But she never wore the gator heels, never took a case.
                                
                Ma always looked back where the foot lane met the road, one arm held high, white palm waving, as she turned onto the track, which wove through bog forests, cattail lagoons, and maybe—if the tide obliged—eventually into town. But today she walked on, unsteady in the ruts. Her tall figure emerged now and then through the holes of the forest until only swatches of white scarf flashed between the leaves. Kya sprinted to the spot she knew would bare the road; surely Ma would wave from there, but she arrived only in time to glimpse the blue case—the color so wrong for the woods—as it disappeared. A heaviness, thick as black-cotton mud, pushed her chest as she returned to the steps to wait.
                                
                Kya was the youngest of five, the others much older, though later she couldn’t recall their ages. They lived with Ma and Pa, squeezed together like penned rabbits, in the rough-cut shack, its screened porch staring big-eyed from under the oaks.
                                
                Jodie, the brother closest to Kya, but still seven years older, stepped from the house and stood behind her. He had her same dark eyes and black hair; had taught her birdsongs, star names, how to steer the boat through saw grass.
                                
                “Ma’ll be back,” he said.
                                
                “I dunno. She’s wearin’ her gator shoes.”
                                
                “A ma don’t leave her kids. It ain’t in ’em.”
                                
                “You told me that fox left her babies.”
                                
                “Yeah, but that vixen got ’er leg all tore up. She’d’ve starved to death if she’d tried to feed herself ’n’ her kits. She was better off to leave ’em, heal herself up, then whelp more when she could raise ’em good. Ma ain’t starvin’, she’ll be back.” Jodie wasn’t nearly as sure as he sounded, but said it for Kya.
                                
                Her throat tight, she whispered, “But Ma’s carryin’ that blue case like she’s goin’ somewheres big.”
                                
                •   •   •
                THE SHACK SAT BACK from the palmettos, which sprawled across sand flats to a necklace of green lagoons and, in the distance, all the marsh beyond. Miles of blade-grass so tough it grew in salt water, interrupted only by trees so bent they wore the shape of the wind. Oak forests bunched around the other sides of the shack and sheltered the closest lagoon, its surface so rich in life it churned. Salt air and gull-song drifted through the trees from the sea.
                                
                Claiming territory hadn’t changed much since the 1500s. The scattered marsh holdings weren’t legally described, just staked out natural—a creek boundary here, a dead oak there—by renegades. A man doesn’t set up a palmetto lean-to in a bog unless he’s on the run from somebody or at the end of his own road.
                                
                The marsh was guarded by a torn shoreline, labeled by early explorers as the “Graveyard of the Atlantic” because riptides, furious winds, and shallow shoals wrecked ships like paper hats along what would become the North Carolina coast. One seaman’s journal read, “rang’d along the Shoar . . . but could discern no Entrance . . . A violent Storm overtook us . . . we were forced to get off to Sea, to secure Ourselves and Ship, and were driven by the Rapidity of a strong Current . . .
                                
                “The Land . . . being marshy and Swamps, we return’d towards our Ship . . . Discouragement of all such as should hereafter come into those Parts to settle.”
                                
                Those looking for serious land moved on, and this infamous marsh became a net, scooping up a mishmash of mutinous sailors, castaways, debtors, and fugitives dodging wars, taxes, or laws that they didn’t take to. The ones malaria didn’t kill or the swamp didn’t swallow bred into a woodsmen tribe of several races and multiple cultures, each of whom could fell a small forest with a hatchet and pack a buck for miles. Like river rats, each had his own territory, yet had to fit into the fringe or simply disappear some day in the swamp. Two hundred years later, they were joined by runaway slaves, who escaped into the marsh and were called maroons, and freed slaves, penniless and beleaguered, who dispersed into the water-land because of scant options.
                                
                Maybe it was mean country, but not an inch was lean. Layers of life—squiggly sand crabs, mud-waddling crayfish, waterfowl, fish, shrimp, oysters, fatted deer, and plump geese—were piled on the land or in the water. A man who didn’t mind scrabbling for supper would never starve.
                                
                It was now 1952, so some of the claims had been held by a string of disconnected, unrecorded persons for four centuries. Most before the Civil War. Others squatted on the land more recently, especially after the World Wars, when men came back broke and broke-up. The marsh did not confine them but defined them and, like any sacred ground, kept their secrets deep. No one cared that they held the land because nobody else wanted it. After all, it was wasteland bog.
                                
                Just like their whiskey, the marsh dwellers bootlegged their own laws—not like those burned onto stone tablets or inscribed on documents, but deeper ones, stamped in their genes. Ancient and natural, like those hatched from hawks and doves. When cornered, desperate, or isolated, man reverts to those instincts that aim straight at survival. Quick and just. They will always be the trump cards because they are passed on more frequently from one generation to the next than the gentler genes. It is not a morality, but simple math. Among themselves, doves fight as often as hawks.
                                
                •   •   •
                MA DIDN’T COME BACK that day. No one spoke of it. Least of all Pa. Stinking of fish and drum likker, he clanked pot lids. “Whar’s supper?”
                                
                Eyes downcast, the brothers and sisters shrugged. Pa dog-cussed, then limp-stepped out, back into the woods. There had been fights before; Ma had even left a time or two, but she always came back, scooping up whoever would be cuddled.
                                
                The two older sisters cooked a supper of red beans and cornbread, but no one sat to eat at the table, as they would have with Ma. Each dipped beans from the pot, flopped cornbread on top, and wandered off to eat on their floor mattresses or the faded sofa.
                                
                Kya couldn’t eat. She sat on the porch steps, looking down the lane. Tall for her age, bone skinny, she had deep-tanned skin and straight hair, black and thick as crow wings.
                                
                Darkness put a stop to her lookout. Croaking frogs would drown the sounds of footsteps; even so, she lay on her porch bed, listening. Just that morning she’d awakened to fatback crackling in the iron skillet and whiffs of biscuits browning in the wood oven. Pulling up her bib overalls, she’d rushed into the kitchen to put the plates and forks out. Pick the weevils from the grits. Most dawns, smiling wide, Ma hugged her—“Good morning, my special girl”—and the two of them moved about the chores, dancelike. Sometimes Ma sang folk songs or quoted nursery rhymes: “This little piggy went to market.” Or she’d swing Kya into a jitterbug, their feet banging the plywood floor until the music of the battery-operated radio died, sounding as if it were singing to itself at the bottom of a barrel. Other mornings Ma spoke about adult things Kya didn’t understand, but she figured Ma’s words needed somewhere to go, so she absorbed them through her skin, as she poked more wood in the cookstove. Nodding like she knew.
                                
                Then, the hustle of getting everybody up and fed. Pa not there. He had two settings: silence and shouting. So it was just fine when he slept through, or didn’t come home at all.
                                
                But this morning, Ma had been quiet; her smile lost, her eyes red. She’d tied a white scarf pirate style, low across her forehead, but the purple and yellow edges of a bruise spilled out. Right after breakfast, even before the dishes were washed, Ma had put a few personals in the train case and walked down the road.
                                
                •   •   •
                THE NEXT MORNING, Kya took up her post again on the steps, her dark eyes boring down the lane like a tunnel waiting for a train. The marsh beyond was veiled in fog so low its cushy bottom sat right on the mud. Barefoot, Kya drummed her toes, twirled grass stems at doodlebugs, but a six-year-old can’t sit long and soon she moseyed onto the tidal flats, sucking sounds pulling at her toes. Squatting at the edge of the clear water, she watched minnows dart between sunspots and shadows.
                                
                Jodie hollered to her from the palmettos. She stared; maybe he was coming with news. But as he wove through the spiky fronds, she knew by the way he moved, casual, that Ma wasn’t home.
                                
                “Ya wanta play explorers?” he asked.
                                
                “Ya said ya’re too old to play ’splorers.”
                                
                “Nah, I just said that. Never too old. Race ya!”
                                
                They tore across the flats, then through the woods toward the beach. She squealed as he overtook her and laughed until they reached the large oak that jutted enormous arms over the sand. Jodie and their older brother, Murph, had hammered a few boards across the branches as a lookout tower and tree fort. Now, much of it was falling in, dangling from rusty nails.
                                
                Usually if she was allowed to crew at all it was as slave girl, bringing her brothers warm biscuits swiped from Ma’s pan.
                                
                But today Jodie said, “You can be captain.”
                                
                Kya raised her right arm in a charge. “Run off the Spaniards!” They broke off stick-swords and crashed through brambles, shouting and stabbing at the enemy.
                                
                Then—make-believe coming and going easily—she walked to a mossy log and sat. Silently, he joined her. He wanted to say something to get her mind off Ma, but no words came, so they watched the swimming shadows of water striders.
                                
                Kya returned to the porch steps later and waited for a long time, but, as she looked to the end of the lane, she never cried. Her face was still, her lips a simple thin line under searching eyes. But Ma didn’t come back that day either.
                                
                3.
                Chase
                1969
                                
                The rotted legs of the old abandoned fire tower straddled the bog, which created its own tendrils of mist. Except for cawing crows, the hushed forest seemed to hold an expectant mood as the two boys, Benji Mason and Steve Long, both ten, both blond, started up the damp staircase on the morning of October 30, 1969.
                                
                “Fall ain’t s’posed to be this hot,” Steve called back to Benji.
                                
                “Yeah, and everythang quiet ’cept the crows.”
                                
                Glancing down between the steps, Steve said, “Whoa. What’s that?”
                                
                “Where?”
                                
                “See, there. Blue clothes, like somebody’s lyin’ in the mud.”
                                
                Benji called out, “Hey, you! Whatchadoin’?”
                                
                “I see a face, but it ain’t movin’.”
                                
                Arms pumping, they ran back to the ground and pushed their way to the other side of the tower’s base, greenish mud clinging to their boots. There lay a man, flat on his back, his left leg turned grotesquely forward from the knee. His eyes and mouth wide open.
                                
                “Jesus Christ!” Benji said.
                                
                “My God, it’s Chase Andrews.”
                                
                “We better git the sheriff.”
                                
                “But we ain’t s’posed to be out here.”
                                
                “That don’t matter now. And them crows’ll be snooping ’round anytime now.”
                                
                They swung their heads toward the cawing, as Steve said, “Maybe one of us oughta stay, keep them birds off him.”
                                
                “Ya’re crazy if you think I’m gonna stick ’round here by maself. And I’m bettin’ a Injun-head you won’t either.”
                                
                With that, they grabbed their bikes, pedaled hard down the syrupy sand track back to Main, through town, and ran inside the low-slung building where Sheriff Ed Jackson sat at his desk in an office lit with single lightbulbs dangling on cords. Hefty and of medium height, he had reddish hair, his face and arms splotched with pale freckles, and sat thumbing through a Sports Afield.
                                
                Without knocking, the boys rushed through the open door.
                                
                “Sheriff . . .”
                                
                “Hey, Steve, Benji. You boys been to a fire?”
                                
                “We seen Chase Andrews flat out in the swamp under the fire tower. He looks dead. Ain’t movin’ one bit.”
                                
                Ever since Barkley Cove had been settled in 1751, no lawman extended his jurisdiction beyond the saw grass. In the 1940s and ’50s, a few sheriffs set hounds on some mainland convicts who’d escaped into the marsh, and the office still kept dogs just in case. But Jackson mostly ignored crimes committed in the swamp. Why interrupt rats killing rats?
                                
                But this was Chase. The sheriff stood and took his hat from the rack. “Show me.”
                                
                Limbs of oak and wild holly screeched against the patrol truck as the sheriff maneuvered down the sandy track with Dr. Vern Murphy, lean and fit with graying hair, the town’s only physician, sitting beside him. Each man swayed to the tune of the deep ruts, Vern’s head almost banging against the window. Old friends about the same age, they fished together some and were often thrown onto the same case. Both silent now at the prospect of confirming whose body lay in the bog.
                                
                Steve and Benji sat in the truck bed with their bikes until the truck stopped.
                                
                “He’s over there, Mr. Jackson. Behind them bushes.”
                                
                Ed stepped from the truck. “You boys wait here.” Then he and Dr. Murphy waded the mud to where Chase lay. The crows had flown off when the truck came, but other birds and insects whirred above. Insolent life thrumming on.
                                
                “It’s Chase, all right. Sam and Patti Love won’t survive this.” The Andrewses had ordered every spark plug, balanced every account, strung every price tag at the Western Auto for their only child, Chase.
                                
                Squatting next to the body, listening for a heartbeat with his stethoscope, Vern declared him dead.
                                
                “How long ya reckon?” Ed asked.
                                
                “I’d say at least ten hours. The coroner’ll know for sure.”
                                
                “He must’ve climbed up last night, then. Fell from the top.”
                                
                Vern examined Chase briefly without moving him, then stood next to Ed. Both men stared at Chase’s eyes, still looking skyward from his bloated face, then glanced at his gaping mouth.
                                
                “How many times I’ve told folks in this town something like this was bound to happen,” the sheriff said.
                                
                They had known Chase since he was born. Had watched his life ease from charming child to cute teen; star quarterback and town hot shot to working for his parents. Finally, handsome man wedding the prettiest girl. Now, he sprawled alone, less dignified than the slough. Death’s crude pluck, as always, stealing the show.
                                
                Ed broke the silence. “Thing is, I can’t figure why the others didn’t run for help. They always come up here in a pack, or at least a couple of ’em, to make out.” The sheriff and doctor exchanged brief but knowing nods that even though he was married, Chase might bring another woman to the tower. “Let’s step back out of here. Get a good look at things,” Ed said, as he lifted his feet, stepping higher than necessary. “You boys stay where you are; don’t go making any more tracks.”
                                
                Pointing to some footprints that led from the staircase, across the bog, to within eight feet of Chase, Ed asked them, “These your prints from this morning?”
                                
                “Yessir, that’s as far as we went,” Benji said. “Soon as we seen it was Chase, we backed up. You can see there where we backed up.”
                                
                “Okay.” Ed turned. “Vern, something’s not right. There’s no footprints near the body. If he was with his friends or whoever, once he fell, they would’ve run down here and stepped all around him, knelt next to him. To see if he was alive. Look how deep our tracks are in this mud, but there’re no other fresh tracks. None going toward the stairs or away from the stairs, none around the body.”
                                
                “Maybe he was by himself, then. That would explain everything.”
                                
                “Well, I’ll tell you one thing that doesn’t explain. Where’re his footprints? How did Chase Andrews walk down the path, cross this muck to the stairs so he could climb to the top, and not leave any footprints himself?”
                """, true, true);
        //Thread.sleep(2000);

        //System.err.println("English - Decrypted, MLK, I've been to the Mountaintop");
        not_french not_french6 = new not_french("""
                thank you very kindly my friends as i listened to ralph abernathy and his eloquent and generous introduction andthen thought about myself i wondered who he was talking about its always good to have your closest friend andassociate to say something good about you and ralph abernathy is the best friend that i have in the world imdelighted to see each of you here tonight in spite of a storm warning you reveal that you are determined to go onanyhow
                """, true, true);
        //Thread.sleep(2000);


//        //System.err.println("Cipher - MLK, I've been to the Mountaintop");
//        not_french not_french7 = new not_french("""
//                hsyzz sgi gcdn eabojk, bs xftczsm. sg t juhnwbpb fd lszaf mqyjblrtn ufr sge tfgefczi ufr rcztlgid gzilgrfafxif oyb
//                fwyf hsmgvbl ommgi gqgpjr, x qgbocdtx ovz fq luk hljwxhy ommgi. cl'g ljipsk uzmp ii zogc kdoj qwmetml tcgqcx sbo
//                yehiuwlrq ii koj qabylvtls vigr lzajn qcf. yzs lszaf mqyjblrtn ck hsc ntml tcgqcx lvlr u wuns tl fwy occjp. x'g
//                vswgswnwr em ety wonf au sgi scdt ngbteti cf gagft ix o dragg oocluca. qcf pqkysz efmi sgi lpq sylsckucyv hz ea dh
//                sbjfal.
//                """, true, true);
        //Thread.sleep(2000);

        //System.err.println("Cipher - FDR, Pearl Harbor Address");
//        sample.not_french not_french8 = new not_french("""
//                Bv. Vznt Trvdxheee, Bv. Sgppoei, Xtqbvch sf kst Weelii, aeo dj typ Wsujp dj Rvagisvyietzgtw:
//
//                Yvdiiruln, Hetpbfei 7ew, 1941 -- e dret ahznw aicw amvv tc mnwlbc -- typ Jrikps Wtretw ow Lbirznp aaj djhdvyac aeo silzmtvakpac akepgkvo qc nrgpp aeo pmr wzggej zu xhv Pbtiip dj Jrapr.
//
//                Typ Jrikps Wtretw wrd px pvlri wzew xhre cetzzc enu, li xhv ddpittietzzc sf Aleen, nlh wtzwa mn tzczeidpxify lmty tiw gfgtvndpcx aeo xxs vxeirfc asobtck tfhpvd kst qazyiinryri ow atecv tc xhv Apgiwtr.
//
//                Mnupth, oep wsui luxei Uptaephi azc huurogsnj sph cfxbintps fodmxrg zy ile Rxtvitlc msclch ow Zplu, kst Naglcisv lbfajdphoi ed xhv Fcmtvo Hxakph enu sxw cfwaiaxft hectkirvo is olc Hicipierp zu Wtret e ffcbel ipepy kz p vetpcx Adpgmcry bisjlvi. Aeo llicp ilij cttlp dietvo ilak ti wevxth ujpaisj ed goeexruv ewi eothxier smpczbetzn cigfexetzzcw, ik ndrtrtcid ez ilrvli sr ytcx ow hpv oi zu erdps etklro.1
//
//                Ik hxpl sp gicfcsid kspx typ smsklcge fq Wewrtx jrfx Yepry bekvd xx osgxsuj ewet kst etklro wrd silzmtvakpac pclcreu xpry ulnw oi pkin nptos rrd. Huitck typ xrtvckinzyv xidp, ile Aleenvdt kompgrmvyi laj otpispgetvwn wolrwx tf otgezgt xhv Fcmtvo Hxakph fy wlawe jepxedpcxs rys ixgctwszzcw ow sdte wzg goeexruvo eiatp.
//
//                Ile reiecb jtwtvcsey fy ile Ylleizlc msclchs ylh galdth svgtve ulbegv ed Emvcxgae ypzac lch mzwxxaij usrtph. M rvrgit kz iilc jdy tyli zeij benp Lbirznpr lzgtw hrgt fevy assk. Tc edutimoe, Lbirznpr sytew hrgt fevy gipfciid kzgteuzth oe ewi hzrw werd qitnptr Sry Uvaenxwcf lch Hfydpucf.
//
//                Niskpghap, ewi Jraprejp vsvvccqeee ppsf wpyntsth ae lixatv pkazyhx Mrwpca.
//
//                Clhx nzrwx, Jraprejp usrtph etklroeu Sdrg Bzck.
//
//                Lrdi rixsi, Naglcisv qdvcvd pxtrnzid Xfpq.
//
//                Lrdi rixsi, Naglcisv qdvcvd pxtrnzid kst Thzwxtpzyt Msclchs.
//
//                Clhx nzrwx, typ Yeprytwe reiecbps Aabp Xwlrys.
//
//                Enu ewms dzgrier, ile Aleenvdt etklroeu Xxhwrj Xwlrys.
//
//                Naglc laj, ewirvqdve, lysirklzin r djvpithi owqtrszgt ixkpchier ilrffvlole ile Glrmfzn pver. Ewi frniw ow jtwtvcsey rys xouln wpvlz joi ewimjpazej. Ewi pvzepe fq ile Lyxxeu Dietvd wevv laveron joixth typxv ogtcmoed prd npap ueotvsklch typ xqpctretzzcw tf ewi vvcn piwp prd jluitp zu sui ypxify.
//
//
//
//                Pw Cfxbenupg mn Tsxif fq ile Rcbc aeo Cevp, T wevv oxveteth tyli elc xteslctw bv epoee qdv olc sifvyhi. Ble ppwrjh aicw dyr nsdpe elimoe ctqedmtv typ rlailrxei zu xhv zcwlrfvlt rrpmnje jw.
//
//                Nf xpxtvc wsw czck ik xpc trvt ys kz dzeindqe ksxw pipbidzepxeu tczajtdr, typ Pqeitren gpdtlv tc xhvtg vixsiiold bmgye lmlc hxr tycdygy ed ebjzaytv gxgtfcn.
//
//                M bvwxivv ewet Z tcxeiagit kst aicw dj typ Rsnxctws rys sf kst tefaai wypc M ajdtvt kspx wv hxpl ezi sncj sifvys suidtpvvd is typ jxtvcbssk, mjx wzwa qabp xx vvcn geiepmn kspx tyth joix dj tippghvcn whrwa rempg egrtc inulckei fh.
//
//                Lojexpikttw eothx. Typgi ij yd flzyzmnx li xhv qpgt kspx olc eiogwt, sui etvrzedvy, rys sui tcxeiphxs rct mn xcpze ulckei.
//
//                Hxxh tzcjiupcge zy dyr rcbid wzggej, hxxh kst ynszjrdzyv hekpgqielimoe zu sui atspcp, li wzwa kazy ile zytziklqpe kcxymgs -- hs hvwe ys Xzs.
//
//                M ajv ilak ewi Cfyvvejd sicclgi tyli wient xhv fctrfgdoeu lch drdieruwn etklro bp Uptae zc Wueopc, Dvntqbvc 7il, 1941, a jepxe fq ler ylh ixzdiid spiaevy ile Lyxxeu Dietvd prd kst Naglcisv pbtiip.
//                """,true, true);
        //Thread.sleep(2000);
        //bad this line below is not correct. It needs to select the right documents. It's set for english.
        double FrenchAverageValidityFactor = (not_french.getValidityFactor()+ not_french2.getValidityFactor()+ not_french3.getValidityFactor()+ not_french5.getValidityFactor()+ not_french6.getValidityFactor())/5;
        //System.err.println("French Average Validity Factor");
        //System.out.println(FrenchAverageValidityFactor);
        //Thread.sleep(2000);
        //bad this line below is not correct. It needs to select the right documents. It's set for english.
        double NotFrenchNotCipherAverageValidityFactor = (not_french1.getValidityFactor()+ not_french4.getValidityFactor())/2;
        //System.err.println("Not French Not Cipher Average Validity Factor");
        //System.out.println(NotFrenchNotCipherAverageValidityFactor);
        //Thread.sleep(2000);
//        double CipherAverageValidityFactor = (not_french7.getValidityFactor() + not_french8.validityFactor)/2;
        //System.err.println("Cipher Average Validity Factor ");
        //System.out.println(CipherAverageValidityFactor);
        double rtn = NotFrenchNotCipherAverageValidityFactor;
        boolean big = rtn > 0.4*FrenchAverageValidityFactor;
        if (!big){
            rtn = rtn * 2;
        }
        return rtn;
    }
}
