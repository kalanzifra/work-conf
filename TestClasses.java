

public class TestClasses {
    public static void main(String[] args){
        Brother Tom = new Brother(false, false, 0, 0, null, null);

        Tom.age = 5;
        Tom.name = "Tom";
        Tom.sex = "Male";
        Tom.cries();
        Tom.getFamilyStatus();

        Brother  Mycs = new Brother(true, true, 0, 0, null, null);
        Mycs.age = 54;
        Mycs.height = 1.05;
        Mycs.name = "Mycs";
        Mycs.cries();
        Mycs.getFamilyStatus();
    }
}
