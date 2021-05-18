package sample;

public class IfElseToTernary {
    interface N{
        String c(String s);
    }
    static N n =s->s.replaceAll(".*(.=).*","$1$0").replaceAll("if.(.*?)\\)","$1?").replaceAll("([ ?]).=","$1").replace(";else ",":");
    public static void main(String[] a){
        System.out.println(n.c("String text = pascalsTriangle.rightAligned();\n" +
                               "        if (centerAligned){\n" +
                               "            text = pascalsTriangle.centerAligned();\n" +
                               "        }"));

        System.out.println(n.c("if(i<0)s=\"Neg\";else if(i>0)s=\"Pos\";else s=\"Neut\";"));
        System.out.println(n.c("if(i%2<1)r=10;else r=20;"));
        System.out.println(n.c("if(n<10)if(m<0)i=0;else i=10;else if(m<0)i=-1;else i=1;"));
        System.out.println(n.c("if(i==1)i=0.0;else i=0.25;"));
        System.out.println(n.c("if(!a)if(b)r=0;else r=1;else r=2;"));
        System.out.println(n.c("if(a)if(b)r=0;else r=1;else if(c)r=2;else r=3;"));
        System.out.println(n.c("if(a&&b)r=0;else if(a&&!b)r=1;else r=-1;"));
        System.out.println(n.c("if(i[0]>0)if(j>0)if(q>0)r=\"q\";else r=\"j\";else r=\"i\";else r=\"other\";"));
        System.out.println(n.c("if(i>0)r=\"i\";else if(j>0)r=\"j\";else if(q>0)r=\"q\";else r=\"other\";"));
        System.out.println(n.c("if(a>0)if(a<2)x=\"one\";else if(a<3)x=\"two\";else if(a<4)x=\"three\";else x=\"other\";else x=\"other\";"));
    }
}

