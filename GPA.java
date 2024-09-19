public class GPA {
    /*private double gpa; //declare var double
    private int study; //declare var int*/


    /*public GPA(double gpa, int study) { 
        this.gpa = gpa; //declare single code pf gpa and study var
        this.study = study;
    }
    
    public void displayResults() { //
        System.out.println("My GPA is: " + gpa + " in " + study + " years of study");
    }

    /*public static void main (String[] args) {
        GPA result = new GPA(3.5, 3);
        result.displayResults();
    }*/

    public static void main (String[] args) {
        double gpaFirst = 3;
        double gpaSecond = 4;
        double gpaThree = 3;
        double gpaSum = gpaFirst + gpaSecond + gpaThree;
        double gpaResult = gpaSum/3;
        System.out.println(gpaResult);
    }
}
