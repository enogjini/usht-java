public class VeprimeMeString

{ public static void main(String[] args)

{ String s1=" tungtung ";

String s2="tung";

int gjatesia=s1.length();

boolean krahasimi=s1.equals(s2);

String rezultat=s1.trim();

String sKapitale=s1.toUpperCase();

char c;

c=s1.charAt(5);

int a,b;

a=5;

b=6;

double fuqia=Math.pow(a, b);

double maksimumi=Math.max(a, b);

int i;

i=8;

int incPost=i++;//i=9

int incPre=++i;//i=10

int decPre=--i;//i=9;

int decPost=i--;

System.out.println(incPost);

System.out.println(incPre);

System.out.println(decPre);

System.out.println(decPost);

int x=7;

int y=9;

// > < >= <= == !=

boolean rez=(x!=y);

System.out.println(x==y);

x=x+4;

x/=4;

}

}