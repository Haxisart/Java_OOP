package Matrix;



public class PrimitiveTypePassing {
    public static void updateInt(int intXValue) {
        intXValue/=2;
        System.out.println("---------");
        System.out.println("intXValue in the update method = "+intXValue);
    }
    public static void updateStrArray(String[] strArrValue) {
        System.out.println("---------");
        for(int i=0; i<strArrValue.length; i++) {
            strArrValue[i]= String.valueOf(i);
            System.out.println("intArrayValue in the update method ["+i+"] = "+strArrValue[i]);
        }
    }
    public static void updateIntArray(int[] intArrayValue) {
        System.out.println("---------");
        for(int i=0; i<intArrayValue.length; i++) {
            intArrayValue[i]=i;
            System.out.println("intArrayValue in the update method ["+i+"] = "+intArrayValue[i]);
        }

    }

    public static void displayValue(int intValue) {
        System.out.println("---------");
        System.out.println("intValue in the display method = "+intValue);
    }
    public static void displayArray(int[] intArrayValue) {
        System.out.println("---------");
        for(int i=0; i<intArrayValue.length; i++)
            System.out.println("intArrayValue in the display method ["+i+"] = "+intArrayValue[i]);
    }
    public static void displayArray(String[] intArrayValue) {
        System.out.println("---------");
        for(int i=0; i<intArrayValue.length; i++)
            System.out.println("intArrayValue in the print method ["+i+"] = "+intArrayValue[i]);
    }

    public static void main(String[] args) {
        // Declare
        int intX;
        int[] intArray;

        //Initialization
        intX=10;
        intArray = new int[5];
        String[] strFruit = {"Apple", "Banna", "Orange"};

        //Pass the primitive type - integer to the method
        displayValue(intX);
        updateInt(intX);
        displayValue(intX);

        //Pass an array to the method
        displayArray(intArray);
        updateIntArray(intArray);
        displayArray(intArray);

        //Pass a String to the method
        displayArray(strFruit);
        updateStrArray(strFruit);
        displayArray(strFruit);


    }

}

