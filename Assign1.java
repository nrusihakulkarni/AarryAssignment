package Arry;

/*
Check fro the package related to arry , where Arry related in build method are present ?
> create simple code using package in buld function
> whenever required use fro - foreach loops to iterate
>following Naming convention and indentation while coding (space and tab )
 */

class ArryAssinment1 {

    public void AscendingArryPrint(int[] Arry) {
        System.out.println("Ascending Array Printing ");
        for (int Number : Arry) {
            System.out.println(Number);
        }
    }

    public void DesscendingArryPrint(int[] Arry) {
        System.out.println("Descending Array Printing");
        for (int x = Arry.length - 1; x >= 0; x--)
            System.out.println(Arry[x]);
    }
}

class Copy {
    void ArryCopy(int[] Arry) {
        int[] Arry2 = new int[Arry.length];
        Arry2 = Arry;
        System.out.println("Coping Array From Array to Array1");
        for (int Number : Arry2)
            System.out.println(Number);
    }
}

class DuplicateElement {
    void duplicatgeElement(int[] arry) {
        System.out.println("Printing Duplicate Numbre ");
        for (int x = 0; x < arry.length; x++) {
            for (int j = x + 1; j < arry.length; j++) {
                if (arry[x] == arry[j]) {
                    System.out.println("Duplicate Number: " + arry[x] + " = " + arry[j] + " At Index " + x + " and  " + j);
                }
            }
        }
    }
}


public class Assign1 {

    public static void main(String[] args) {
        int[] Arry = new int[]{20, 60, 50, 60, 81};

        ArryAssinment1 arry = new ArryAssinment1();
        arry.AscendingArryPrint(Arry);
        arry.DesscendingArryPrint(Arry);
        Copy copy = new Copy() ;
        copy.ArryCopy(Arry);
        DuplicateElement duplicateelement = new DuplicateElement();
        duplicateelement.duplicatgeElement(Arry);
    }
}
