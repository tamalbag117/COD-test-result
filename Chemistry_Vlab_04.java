//This pogram being create to calculate chemical oxygen demand of sample water

import java.util.Scanner;
class COD {
    COD(float a, float b, float s) {
        System.out.println("The Strength of the FAS is : 1.1321X 0.1(M)");
        System.out.println("The Burette reading  of the Distilled water is :\n" + a + "ml\t when Strength of FAS is:" + s + "(M)\n");
        System.out.println("The Burette reading of the Sample water is:\n" + b + "ml\twhen Strength of FAS is:" + s + "(M)\n");
        System.out.println("volume of the FAS used=" + (a - b) + "ml");
        if (s == 1f) {
            float cod = ((a - b) * 1.1321f * s * 800f / 20f);
            System.out.println("Volume of FAs used="+a+"\t-\t"+b+"\t=\t"+(a-b)+"ml");
            System.out.println("Normality of FAs=1.1321x0.1(N);\t EW of FAS=MW of FAS\n volume of SAmple Water=20ml");
            System.out.println("Sample=(" + (a - b) + "X1.1321X0.1X8000)/2\t mg/l\n\t=" + cod + "mg/l");
        } else if (s == 2f) {
            float cod = ((a - b) * 1.1321f * s * 800f / 20f);
            System.out.println("Volume of FAs used="+a+"\t-\t"+b+"\t=\t"+(a-b)+"ml");
            System.out.println("Normality of FAs=1.1321x0.2(N);\t EW of FAS=MW of FAS\n volume of SAmple Water=20ml");
            System.out.println("Sample=(" + (a - b) + "X1.1321X0.2X8000)/2\t mg/l\n\t=" + cod + "mg/l");
        } else {
            float cod =  ((a - b) * 1.1321f * s * 800f / 20f);
            System.out.println("Volume of FAs used="+a+"\t-\t"+b+"\t=\t"+(a-b)+"ml");
            System.out.println("Normality of FAs=1.1321x0.3(N);\t EW of FAS=MW of FAS\n volume of SAmple Water=20ml");
            System.out.println("Sample=(" + (a - b) + "X1.1321X0.3X8000)/2\t mg/l\n\t=" + cod + "mg/l");
        }
    }
}
public class Chemistry_Vlab_04 {
    public static void main(String[] args) {
        System.out.println("Let's calculate the COD off water samples");
       Scanner sc=new Scanner(System.in);
       System.out.println("The Table");
       float []array=new float[20];
       System.out.println("Burette reading of Distilled Water \nwhen Strength of FAS is 1.1321x0.1(M)");
       array[0]=sc.nextFloat();
       System.out.println("Burette reading of Distilled Water \nwhen Strength of FAS is 1.1321x0.2(M)");
       array[1]=sc.nextFloat();
       System.out.println("Burette reading of Distilled Water \nwhen Strength of FAS is 1.1321x0.3(M)");
       array[2]=sc.nextFloat();
       System.out.println("Burette reading of Tap Water \nwhen Strength of FAS is 1.1321x0.1(M)");
       array[3]=sc.nextFloat();
        System.out.println("Burette reading of Tap water \nwhen Strength of FAS is 1.1321x0.2(M)");
        array[4]=sc.nextFloat();
        System.out.println("Burette reading of Tap Water \nwhen Strength of FAS is 1.1321x0.3(M)");
        array[5]=sc.nextFloat();
        System.out.println("Burette reading of Well Water \nwhen Strength of FAS is 1.1321x0.1(M)");
        array[6]=sc.nextFloat();
        System.out.println("Burette reading of Well Water \nwhen Strength of FAS is 1.1321x0.2(M)");
        array[7]=sc.nextFloat();
        System.out.println("Burette reading of Well Water \nwhen Strength of FAS is 1.1321x0.3(M)");
        array[8]=sc.nextFloat();
        System.out.println("Burette reading of Domestic waste Waste \nwhen Strength of FAS is 1.1321x0.1(M)");
        array[9]=sc.nextFloat();
        System.out.println("Burette reading of Domestic Waste Water \nwhen Strength of FAS is 1.1321x0.2(M)");
        array[10]=sc.nextFloat();
        System.out.println("Burette reading of Domestic Waste Water \nwhen Strength of FAS is 1.1321x0.3(M)");
        array[11]= sc.nextFloat();
        System.out.println("\n\n\t\t\tCalculations:\t\t\n\n ");
        System.out.println("1.Tap water sample:\n");
        System.out.println("serial no.1:\n COD of Tap Water \n\t");
        COD obj=new COD(array[0],array[3],1f);
        System.out.println("serial no.2:\n COD of Tap Water \n\t");
        COD obj1=new COD(array[1],array[4],2f);
        System.out.println("serial no.3:\n COD of Tap Water \n\t");
        COD obj2=new COD(array[2],array[5],3f);
        System.out.println("2.Well Water Sample:\n");
        System.out.println("serial no.1:\n COD of Well Water \n\t");
        COD obj3=new COD(array[0],array[6],1f);
        System.out.println("serial no.2:\n COD of Well Water \n\t");
        COD obj4=new COD(array[1],array[7],2f);
        System.out.println("serial no.3:\n COD of Well Water \n\t");
        COD obj5=new COD(array[2],array[8],3f);
        System.out.println("3.Domestic Waste Water Sample:");
        System.out.println("serial no.1:\n COD of Domestic waste Water \n\t");
        COD obj6=new COD(array[0],array[9],1f);
        System.out.println("serial no.2:\n COD of Domestic waste Water \n\t");
        COD obj7=new COD(array[1],array[10],2f);
        System.out.println("serial no.3:\n COD of Domestic waste Water \n\t");
        COD obj8=new COD(array[2],array[11],3f);
        System.out.println("\n\n\n\t\t\tThank You\t\t\t");
    }
}


