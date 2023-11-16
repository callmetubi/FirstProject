public class lab2 {
    public static void main(String[] args){
        float earthWeight;
        float marsWeight;
        double marsWeightInDouble;
        int marsWeightInInt;

        earthWeight=58;
        marsWeight=(earthWeight*0.38F);
        System.out.println(earthWeight + "kg on earth is" + marsWeight +"kg on mars  ");

        marsWeightInDouble=marsWeight;
        System.out.println("KG on Mars after converting to double" + marsWeightInDouble);
        System.out.printf("KG on Mars displayed to four decimal places: %.4f %n " ,marsWeightInDouble);


        marsWeightInInt=(int)marsWeightInDouble;
        System.out.println("KG on Mars when casted to Integer" +  marsWeightInInt);

        char c=(char)marsWeightInInt;
        System.out.println("The ASCII table equivalent of MarsWeight is: " + c);

        int example=c*c;
        System.out.println("An example of a mathematical operation on the char type :" + example);




    }

}
