package Day38.students;

public class Main {
    public static void main(String[] args) {
        LocalStudent ls = new LocalStudent("James",17,3.4);
        InternationalStudent is = new InternationalStudent("Khan", 19,3.8);

        ls.getGovernmentScholarship();
        ls.getUniversityScholarship();

        is.getUniversityScholarship();
    }
}
