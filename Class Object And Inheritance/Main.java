class Books {
    public int semester;
    public int year;

    Books(int semester, int year) {
        this.semester = semester;
        this.year = year;
    }
}

class CSE extends Books {
    String specialisation;
    String priority;

    CSE(int semester, int year, String specialisation, String priority) {
        super(semester, year);
        this.specialisation = specialisation;
        this.priority = priority;
    }
}

class Mechanical extends Books {
    String specialisation;

    Mechanical(int semester, int year, String specialisation) {
        super(semester, year);
        this.specialisation = specialisation;
    }
}

class Civil extends Books {
    String specialisation;
    String difficulty;

    Civil(int semester, int year, String specialisation, String difficulty) {
        super(semester, year);
        this.specialisation = specialisation;
        this.difficulty = difficulty;
    }
}

public class Main {
    public static void printInfo(String subject, Books book) {
        System.out.println("Subject: " + subject);
        System.out.println("Semester: " + book.semester);
        System.out.println("Year: " + book.year);

        if (book instanceof CSE) {
            CSE cseBook = (CSE) book;
            System.out.println("Specialisation: " + cseBook.specialisation);
            System.out.println("Priority: " + cseBook.priority);
        } else if (book instanceof Civil) {
            Civil civilBook = (Civil) book;
            System.out.println("Specialisation: " + civilBook.specialisation);
            System.out.println("Difficulty: " + civilBook.difficulty);
        } else if (book instanceof Mechanical) {
            Mechanical mechanicalBook = (Mechanical) book;
            System.out.println("Specialisation: " + mechanicalBook.specialisation);
        }

        System.out.println();

    }

    public static void main(String[] args) {
        CSE Ad = new CSE(3, 2, "no", "major");
        CSE AI = new CSE(3, 2, "yes", "major");
        Civil MMT = new Civil(3, 2, "no", "major");
        Mechanical Mechanics = new Mechanical(3, 2, "no");

            printInfo("Ad", Ad);
            printInfo("AI", AI);
            printInfo("MMT", MMT);
            printInfo("Mechanics", Mechanics);
    }

}