package sample;

public class TestFindLengthByIndexOfCoincidence {
    public static void main(String[] args) {
        CharSet charSet = new CharSet();
        CifrarioVigenere cv1 = new CifrarioVigenere("Qcf piov md l izetlwzq wj kzs Lpmvzuoy swtldoelwr, smh tq ir rys hkmr jg alqg tvgdwh iru abdwqxllwzqa lrns lfbiu afchatffgtetc, pgi oll xyw caswwzls – jrc zfdiywmiiwr er jirj hsh pirnwpvb fljrpq. Iru xcc bwy rfr qrz cfmf qdumcasd, wpi nsf ormw egh pql aywb jrc gfes srui. Zl ztymw ff wy pmqfjwpv wj pgic impcgk drthzwfd, vimcgfd, dqvdwb lql Qrjwyha ayg ulym xywwc oqzvk. We hvhljsd lv xyw kzxvh kzoe la wcgk er pird, hsh lmjsptoqxp lvlw qwe’l uzlvk rooj, wpi ujslp blrl klnmw pgi lw vmxzh, zu blv khtinieabr lv cfmf dsqrv ovpq i grj plfsjzjsd gwae lvp vbvvwh. \n", "soldier");
        CifrarioVigenere cv2 = new CifrarioVigenere("\"Xmptpz Xnlhpta\" – ay uheya sqedcd jwnvj jlqlmnxp ew Utzsw, lvv yw fsfvlwg, dro bg yph qpugwg rj qidqmq gzujflhw wqcj Krvawjft Msyilmiq Cltw fvg Plvuj Krvawjft Msclss Pdicbww. Bkidm qtcqk xmf jvomdbwi qq e eqej wi alz, cswzmyo lmmb azcdi ndgp ojjiw hlvyjz. Wlpg ufuh lpzw, yw Fexx Djrhyym, sx bkij bjfqqio ngw bkitz enavmzv. Ssl oedb Suzlp, epwd ehvp alfvgmyo yziuh tv Ssjdv. Tv ss iji hpws axmnqvj qv e hmsuwq, xsmq bmui dcvimqpj nshmg atbz fv rrnwenvj xccup nlpwmv bqwl pfhqwvmgmk. Yphwp bot Udvtvwx awszl lmmlv rzgzvg. Xsmkj bzs Xijnvhw zxwsmg jtzw. Fvg xsmkj bzs Xijnvhw dbguxhh epsy buyns. Ommq xsm lmwxwlvvx wi tzcfia rj pfhqwvmgmk imwsyiljl, wlpg zfl vegmv kqixj Uswqqid ifi Quebq httlgp ezt erywl zfdh fpmf nv wlp bjzkn’w ailm, jxx Nwjuwuew Gsqm dro Tsskh Gzzhtzdp Siwwbhv wwky bkitz gbv omgmk. Owqeepss edw 21. Uwjiiq ala 19.\n", "fidelis");
        CifrarioVigenere cv3 = new CifrarioVigenere("X brge wlrkw'h jsem zlb uwazinm zi ptf depq pdrqew dei updpyxfvv el i wmzx. Scu xzmb jbkytk xziw Pvgudcr zmotrw dpp hgeq xux lgrrkkrrgbftexst uevejdrh svg tnlktu xzm Kszxkivev Ifx ngv riisbhh gaw Crxawqey Tupuieg rj Fvategwa lr gaw bzhkb rj pbnxc asz. Omxxoxji, Hzhwvwwck Vgwviixdi umvv'w lnow iyi dcayer gu tlgwvmaz ttkawmq iawacx e vmsvrlkxfr svg jvzzizry i zee; aw wrh lw gs ohlw. Gvwalhrgl Zvrfmgc qbvc'k lsdh xux djoyjg rj pagdjmfo eigpwte gadlp ebywkw svg wrgvxek ma ws gaw bfsf. \n", "presidents");
        CifrarioVigenere cv4 = new CifrarioVigenere("Tqetpve's hbmyrg kxtepkl sn kal xecjairu. Hgh sq ahhaa, P'f gansbrg qu t rey nxrethmmop vy Emgybgapz ms svli jotdtvd cuw wetcx sut jhynvyr mn qbk glczlvoqtl. Mf avn aapa ms mcrx e dkmyirguvi ip aai lkmx sf qbk ravphr, ih fhy wcum xo ohdi tjl fssv vy cowy melgumw apk widkjtxiqu, bj yqb penv ah qaml rsut ttvk ypml a nlzeca aaet ypep epknve -- voxr jqpg xhg axecjpgk ptvyisuphr. Aolkmcc uxidu fhy. Wg uxid avn mn qbk wudbkfs. Yl gief fhy ip vnv sohep tqdgw. Wg llteeptpla uxid avn mn qbk mnplk givpxw. Wg uxid avn mn estwstvhqs cse ectvlw owy vsupakc.\n", "teach");
        CifrarioVigenere cv5 = new CifrarioVigenere("""
                Lv axy ltie zihpp bkwejje 20 eyegj ami, xwv pkitav ol nlxj conc ifoq ns iye ynvtvty ns rcaog xwv pxiqxje uz e cvw juc, ped zbi ulnjuqtetgf ljdat lmvyty nlpk hgx ftvn jyrxvd zbib wox zeg kou fscx. Sggiifvá Xyzdcuiy -- xwv Vkfztk Rkpsaltoir irumbx jj mghc iyitaw. Xk sniatu uy nlpk pkugtwur jvdkeyn gdllj mlpbe zbi ufutxeizotm su rn kgtxie, ghh topumi iye kgtiznkmw dw at chtfluac. Xk sniatu uy nlpk ssupa toahxgzey wec glgs e ezvunea iory mc noxfh tmetnw, ped zbei poahk evovfi rrn ryes khk qen zn upigtoscrv flj wscwlowxh. Rnj cx eiobyh iyaz gsgrl ryesvrybme zs sivt gocyvull zbec rne qipgot.

                Nlpk's cbc X'd svyezznm ns nfu oh xwv ckhxti ol u Ijiovy xwrt om ttrckzya, lnonis rnj zvtv -- bkwejje ulhxeaxs tt=fpry ftcikpis khgn hxmiycscj cuops se hlmsxej, yzte wnyr iyeol ptrdklw szd tix. Iyee viazebyh iyaz qeacs iiyau cugi sfwt; nlpk pkugt toafh eiebuma.

                Ne gli wvrk nssry hygplsk Uqtiiiurh rnj Wdtthy viazebyh pxaohwi rlr ihsj tnux ifdgs gdllj vi efsycfav.

                Nuq, at jhgli iyiy wsbdot bmhkoxs. Fjk nuq xwzs myrtiazcsc -- fux aicvrgnmde -- cghrdk szurs jtofp. Lv, tui, lpme g wldzck ns brkk. Uw iye civau hgm fttosy ptjs jczxuej, cx wrs hygdde sivt znzyvrfntygivd. Ghh lv'vk mite ebyrij mupi urszyv iyat iyg rbofmip tu wsckruf xwvm -- g apdsar ygdeoss mc trommh, r cnurvznm wpxdazy, xwv pklwxjtkhx srnmyvh ff ufh rfnlfmrks, tya iyrkuxh rnj nlt jpxyes ff iuxpjtxitwzc cyeefny.

                Hscv ol nltje ibeacetaih tat vi hflbyh fliiepn fr kuwxcy. Hox pcl uz xwvm jyqped zbei ne rcwivn zi scv atixwvr ghh lfrq nsvvtnyv; iyaz qi ufcam sc fux wsbdot crivrkmxh, eoz ir dtcgmmdear xmuwexyrrvs; ghh iyaz qi gvalzmgd oal wwrrkx zpcukm, awzcn uvt jtxirvvr zbec rne zsgte zbei toafh siiby yh rpglx.  Iyaz cw iye civz khgn at duyn gpire ir. Iyaz cw iye civz khgn M wrvk wsbv tu Yygfpk ns qvgoh.

                Xd ietya dlr vlshgexcxn, ne tyis rczcsc toulhxeazyh ptrumw qfrjyvh. Khgn qtrny crkvszgicks zi ggvazy rtn juvw. Iyaz gipes xywxjtohk iye cupaj ol jvdkeinmdeiyg xwrt ynecu it nlt nae ij viocnl. Iyaz gipes g wlpegk cr dlr lcrpecoup hpszyq, lztn hil iuryw if pxyztet gvyhv atx jjkuxy ggzsom.

                Ecu wk bekv at ifazggnmde tu iyg tosgsc grumttiizs ecu oal gddmuh ljdatcxn ko krxted g becu tu nldje kgigxita qpikknw ped ogtdmexcwwvd vysece cbs pie yojuvrohk iye siwi, vvkh xwfumb xwvy suc wrvk bes mexs pxktry xd uo ccxw witurrzar wvxjey, qlxth om awp wk mii rsoxi dmex u xgzlrcsc uorfegj ful xwv Itnigeazcscrl Sirtkaxs Jjed kuvazex nlxj wkyo, if mgei hlrk nlpk ebyvnsojs -- ikvrevssp -- rkwixmey msbv aymmhkatwi.

                """, "prague");
        CifrarioVigenere cv6 = new CifrarioVigenere("""
                Ishe Ipgxiapi, Ygmov, Xeuy, Ohjnvg, Nkxevgn, Aevenr, Fybsyvrh, koqorvv mp xur Ohlxiql jdkspl, qmvrsrthmvfoh thivrc, eaq jhjvsj pmwgjiaf:

                Xrbkc jr wdw qsbqfbc ds gui bmertrww armyq si Pywr nrg Hywrcl Ncxrrqc. Wfo abepg uspy ysqe bizrqecb xurmu qyr Rqadpn ef glh fome gs d uomtuxb joknpc; d arezcmrl pse glrqo aub ldb xsar; xkc cshy si rri Qrqrabegvg Sybxl; nrg rri yvsq mp xur Y.V. Qorngi - d kkr jusvc xezr kuymif aidpvc bai wfyyfnrg jkaf, nrg urs crrqcn qbei wfkr guvhc ryaqvhb vejf llkciys.

                Fxr dlbfi rd ew jus omfiq ump, yxh nplh usxu umv nkwfvrj, ixsj Gig Iorarhb zi xur swfov gvxocc lr uiob: Peguiu. Zbsguiu. Fewonrg. Ebeaqjdrrie. Hrfjo Xrqhb, mb ef ui zyc ssgiq ixsja xr fsw lbyqeov avifcc eaq rhnrijf, "Xkc Qvnah Ipyqnti," rp "Dlr Omj Arirfi." L, jsor fs pyxc bglhpc ma glh asxl jlhpo lr jsuioh sbv qckvyl ldjp e prrwsbc, xaiz fsq nf e fmvprnkxc, k qraxrp, krq nfrto eyy, e ipsiaq.""", "kennedy");
        CifrarioVigenere cv7 = new CifrarioVigenere("""
                Div gv rnql eeeewpjwhiy kpx njiuyekx mx wqgv wy kq swnjbtlvmpa Tiugfiv gvuucjw chu iwtawqlj.  Ex'tw kqn fck Qwgtykikw gj Unrbx, Fapnuig Vjarvie.  Ex fszg ilz VGS Hklvkmmj Pgie Xtlwxvu.  Nm ayni qoi Axajivuig hd Vihyeax Uapncru Zyliu; Mvkkclets Eiimdmvuew hd Viruibfcfx qz Ywfcdepx Jmvsjmvs; Rbmmjrgs Xmgcjen Yiqv Fgpfyi; ur Lsxkieie Qwgwlzbr Yvzkmfz Cge Nqhva.  Tlv M yueb mm wwrytqtjdc vbrvd mmv Cwkqge Svebzdbql sh nym Nlaxgx Jbtrww, Cxiqxlfi Vbfutq.

                A enmf etll xq utsgmopgxxm lcnituc uxktitm fn mfw Lqojm pfg lcpv okcsx khkmkckx kh zvmcdpkavvvc eevnvzl.  G oepn kw mfsrm Wfvzpwwugrv Kcqiu, Wfvzpwwugrv Amwounii, Vmfktyjafyf Okhx, il uwpn uj Khlyvgmjutl Llqggahl, xst vvqge zity kwwyq.  Xjues rmm wq glka.

                Rziuy rzx cpxtufzwgfets kqfck jql fck agypnig.  Pc'ji eienkmfxkhx i agkxqlzk xagrqgzk vpawkm.  Nm'kc xmibkqge laq qrzl.  Uw jcwv i kyfkg iw kaydpghxml rzev qzte bwjkhv bac oea nyim Yeitctigq omnf cqoc ar vbv 21am awrvoig.  Lm llglv'a gm klqlkizc gj yiis mm ti fiem, hp jiujfvlgtmnckqxq ls dyrz.

                Tlv ag'pv jxemr vi didc hvqaimlq.  Byun kpbq oige, nm'oc lemye amchw vi gzhrwgv Udmkguep wfvlseitm rvw fgqginvxpk, epx kw kcxstg fck qqwvyd wy egzgleuxll gqhkztalmpa jw mfsx yy smmrwv rlfbxal swl gmhndi ybztx qhipxzvz mmv oiemr kgvg qzaxjq.  Xjy -- zb'l y ysqx sqej.  Llg yeoblww qz fck cuspidg tpw wnintr zwkkheqge ls voiv, tlv ag'lv ehpcmpa kwpyjhu bzammjme lvnhpe sp bvierz gclv igb gr ghvzzw.  A achk bh qsc vi kpx kwqdyia hd Uspaimlq, A agftwfc spn nym xvlvciilblsva qfzd rzev bra ucwr fiem htwv vbvax jswv zfck kgrvbj wg rziuy rvw mllgl zalsww.

                Kh kpx kahun fn tjd xjyjm vfspnyeoxq, zsyymmk, kq wkhxtx kgwv cdxhplepn imlngrucsqeglc cm Gzxqahghk ql rg ogyg bac Sqglzktl hiqjcm lyxi.  Kn'j bac xmtmk bagfk vbrb B rzmpe rjhsl ajye Q pyci wj zv mfw qqleqge.  Ax'u nym eykx vbzvz rzev C kpblc edilb pfwr K af bh qdigj rb ggylv.

                Uel mfaw tyjxhlkmdccqmw aw qhcg fyyrkzzmw gf ep yii pfwr ch vfmpwqkmk qwcgpqap bapwevyea hsj tgigtx, yfh vytpgmdsis xqock e juelysd sh nvzkmjmunj bac hsvyebbyd xq xf cl ejicn yikk.  Oi clv txqk xjue mbezx ayrzl pwqqpvl ypgq vbv lxyvpkyjb trleee fv Tkwvkwrv lmap kh fck fawviig.  Pc crqq kptr sp Suvlt gk eenzdxjq tnuevbly xq ukbtac yu uxibl.  Oi mhfe mfsx vbza mfjicn nqej ti yckp nq xst u cwge lmoy, rvw rzev qv unql yuy rte cdioyebl mx swl gwpcj xq xvnxyl mv.

                Uczxyvc, yy'mm mycip mvdxpsp unvxl rg eebzmoc llcn xwtj.  Xst nym ygjwv nzux qarey 2002, nm'kc hvqpzlbly xjy emvckwclp zxqgytwva tlv wvlrbxeag fcimvrasp nf btiw xjy wqzfl xq nym xvlvggzamq olq ukbtacif oj wg 9/11 gf Ehayiggkxch rvw Nsokmkig.  Uw'vg cedxqlmpa zv mfw 21wv wvvmsjc occqmyjc chu qgrwpncxmgaw gcjrjbjaxkyj bayl akfc iejga wm kw lrsc qhv amch ejyrl hd s rkgstx cfios.  Nm ayni ty-vvxpymbyu i zjgfcf ewg-njsncwmkylmqh imzgei vi umgw llg qfzeb'k qqmk ltlyitila icgtny rkvckw vi kpx ugvnx'j lxyvpkyjb pcstqhj.  Igb oi'xy cinlulgx rv xdxstn kw lcuyty rte jgsuy ecvjwet grbxpaenm nqmfar hilz rcsvu.  Qv'zx zwxvyi xkmlienzvz mmv diilxp, srf cekkcswkhx wnp hvgjrzxbfium wwk yfc hokckc sxvuts hp fevoiie bawcmkmk.  Uw'vg vlqebari hve iyjxpyiaaghw clfcgb llg qfzeb ls fcjznnl, hkmdigrdi, chu lxdwev uc Ytcve chu qmq sjhccqtrww.  Chu ex fszg lvvxuwh Cgvzbasr fcgthksga mf bayl ag iekx yyekh yioc llg mkzxlyxj uel lrsrfceo mm lvwfp txyv xjy nwkjv.

                Xjyjm lrwtu uim tjd gtckqvyd xq evmigfk Cgvzbas wgwlzx.  Zmx K vvtbcni yckp xtwva zzjxp gj os smbly xjuk qg rzi nieo ksf ag ucah asrpik sxch xjcj khsfxts jiyc mrnyja pc wrncjb mfw tqqvz hd gyt gfam dmrfudmgrsp xuccxq.  Llg xfknkwrvm kptr oi jicl bl llkm mmkw zenf -- kpx Bwgnuiimggr qz Zvwchipxvvvc, llg Wfvlraxwnzwg, rzi Dcct hd Jmibka -- mfwwg uim gml wkggtr ugvfm nzbrlip cebh yympa gikazqghk.  Bacq ety kpx dgypxrbbmf sh fzjxplc chu rnqlmey zv mfaw eilvmpq, epx r tbezx vbrb lfargm wwk ydp ybf axcc jtyvlhk, xeklemlq, wuwucqmw, srf xzogglc clfcgb llg qfzeb.

                A wvuel acji viuir yk wqgvwgc olqmv wpl dmhy nil kshg jfalgtpg vp backi fitcfcfxu.  Gp ntrzit wrux rg xjyjm lfgvgm zv lcsveb fn mfw ttidqlc llcn kpxw gjhyimw.  Kq qqnymk kshg gv zbqw fgzfzx bsap nf txyjr vbvqk rjyvbj eacf M ncmmw yk e ebztw gf e hiimbef pchu.  Ur mor Cgvzbasr lilzgcq acm giocv fa avvxpsxkiea hd umvcqmgq olq ardx kwepceo mm llqmv abkhpg qfzwq -- "ls hiiu t kgvg jvzycux whzwg."  G'ni unllbcv xjy Twgqlmvokqhl sw c mkcwcfx, K'pv btsylv ck il y licwymk, G'ni dyvv ummrf vp qm yk e nungxp srf u cmzgkpcnfz.  B rgsm ue wtrz xq jimlcjzg, jiwmcux, chu lxdwrf nym Vmfwvckcmggr cm Twfksrfyi-qg-Azmgz, rvw yk e eckqscf, M mhfe mfsx yy dclr fixyi, mocj, xwle wnp teee fv brk ipxlzbly ttcekbndiu zfz xvhifcvvvc'k wcev.

                Q fyci vbza vjsmo hfb lgetns ra t ksxvyi wy gvicfzaf.  Uw yrbftw mmv oijb vfwvkmymw tspwyj vhr grns smvymwg xfqge ks km iqzfl, fwn smvymwg ck ampwrinymgq gyt wfcgrjc chu qm iwirm la lyxi.  Vcdm tlv eiuzv, hsj zcflml fszg vvmg mmv dyjb gylmqhrt lcuytckg tqkiv -- ce etp srf jvivc; ar vcdml mx icmv igb ar glra hd mtjyrdtj.

                Xmfycqmw ls qoi dtjmiu cj bac jicmfv pfq xjy Lvbrwh Unrbxq gj Cgvzbas ktyn nkme e ugrte qlvkhx wy agpqhzml sfhgl kpx ujmv iw ig cetklv bh rzi uniwgewwv hrbbmf mp nym pmjpf.

                Ck'a mfw vgujwg uzc ghvur qgpfcvzl fszg mlzkcfhglvl mm mw kh simrdi, mhfebly xjyp'l kcuikpv jxrlit nimtreipn wzhk Sqglzkt'q Svoyu Nhpuiu nyig djso nymbp gap afdxpfqghk.

                Qm'q llg lvilmf ajs Ruxpagc bra ucfihckbxb xvqg jbkmfk cfcqtluiu nyim yetncwqxb gyt jfexp, srf xiipl s wjuix, fmjen wfvmpswv qzba mmv cxmmkqsvkyj.

                Qm'q llg lvilmf ajs nm'oc tigh rjec ls qpvzimoit nym bpgr hcjb hd xeuwzaf yfh qokttql xjy zzhl uytnrqg mx gqgdcggkq, chu mgjawv zimx lsxkiea tlv jtyv xxmhpgm vdxpqajyim bl llg wfufmf gcojm tlv gqgdwg cxjqlk wy jafglkg.

                Ypgq Goiwic ls vbv Xtaajkw, nm'oc tigh kpx lsxkie bayl lcm jpnr vsyh kwkrmvg wyifzwvu uel kchpcwvl mwjephp ebrz xjy icec gj nun.  Bayl mu qyw pc svg.  Uel pfwvg nvzkmjmunj wydwv qhcg mfw mpdlamgui qz uqlmjhgl rvw bwwvllkmggr, Cgvzbas qwmk lxkgruniimc llcn fck tspwyj igb gyt ceamglyvcfvl yji oiim kckmncvvm rzep u yimcxyn cumhjgka.""","security");
        CifrarioVigenere[] array = new CifrarioVigenere[]{cv1, cv2, cv3, cv4, cv5, cv6, cv7};
        for (CifrarioVigenere cv : array) {
            String cipher = cv.getCipher();
            String keyWord = cv.getKey();
            System.out.println("Index-Of-Coincidence + Kasiski calculated keyword length: " + charSet.findKeyLengthByIndexOfCoincidenceAndKasiski(cipher) +"\tKasiski calculated keyword length: "+charSet.calculateLengthViaKasiski(cipher)+ "\tactual keyword length: " + keyWord.length() + "\tkeyword: " + keyWord);

        }
    }
}
