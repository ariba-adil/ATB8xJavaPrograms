package sept.ex_20092024;

//Input → int score = 85
//
//// String grade →
//
////  score >= 90 → A
////  score >= 80 → B
////  score >= 70 → C

public class Task2_TernaryOperator_MultipleConditions {
    public static void main(String [] args) {
        int score = 85;
        String grade=(score >=90) ?  "A":(( score >=80)? "B" : "C");
        System.out.println("Score: " + score + ", Grade: " + grade);

    }
}
