public class GradeManager {

    // Method to reverse student names in an array
    public static String[] reverseStudentNames(String[] names) {
        // Reverse each individual name (like "John" becomes "nhoJ")
        String[] reverseStudentNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            String  reverseName = "";
            for (int j = 0; j < names[i].length(); j++) {
                reverseName = names[i].charAt(j) +  reverseName;
            }
            reverseStudentNames[i] =  reverseName;
        }
        return reverseStudentNames;
    }
    // Method to calculate letter grades
        public static char getLetterGrade( int score) {
            // Use if-else conditions:
            if(score >= 90 && score <= 100) {
                return 'A';
            } else if (score >= 80 && score <= 89) {
                return 'B';
            } else if (score >= 70 && score <= 79) {
                return 'C';
            } else if (score >= 60 && score <= 69) {
                return 'D';
            } else if (score < 60) {
                return 'F';
            }else {
                return 0;
            }
        }
        // Method to find students who need to retake exam
        public static String[] findFailingStudents (String[]names,int[] scores) {
            String[] findFailingStudents = new String[names.length];
            int failCount = 0;
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] < 60) {
                    findFailingStudents[failCount] = names[i];
                    failCount+=1;
                }
            }
            return findFailingStudents;
        }
        public static void main (String[]args){
            String[] students = {"Alice", "Bob", "Charlie", "Diana"};
            int[] scores = {95, 67, 45, 78};

            // Test the reverseStudentNames
            System.out.println("reverseStudentNames: ");
            String[] reversedNames = reverseStudentNames(students);
            for (String i : reversedNames) {
                System.out.println(i);
            }
            // Test getLetter
            System.out.println("Letter Grades:");
            for (int score : scores) {
                System.out.println(score + "  " + getLetterGrade(score));
            }

            // Test findFailingStudents
            System.out.println("Failing Students: ");
            String[] failedStudentsNames = findFailingStudents(students,scores);
            for (String name : failedStudentsNames) {
                if(name != null) {
                    System.out.println(name);
                }
            }
    }
    }

