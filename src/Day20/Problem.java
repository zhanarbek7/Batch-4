package Day20;

public class Problem {
    public static void main(String[] args) {
        String[] names = {"Syrga","Elza","Ludmila",
                "Aizhan","Bektur","Mike","Atabek","Elina","Albert",
        "David","Aliya","Uluk"};

        // Syrga, Elza, Ludmila bought a new IPhone 15 pro
        // Aizhan, Bektur, Mike bought a new IPhone 14 pro
        // Atabek, Elina, Albert bought a new IPhone 13 pro
        // David, Aliya, Uluk bought a new IPhone 12 pro
        int iphone = 15;
        for (int i = 0; i < names.length-2; i+=3) {
            String name1 = names[i];
            String name2 = names[i+1];
            String name3 = names[i+2];
            System.out.println(name1 + ", "+ name2 + ", " + name3 +" bought a new IPhone "
                    +iphone+" pro");
            iphone--;
        }




        // 1 2 2
        // 2 2 2
        // 2 2 3
        // 2 3 4
        // 4 5 6
        // 5 6 6
        // 6 6 5
        // 6 5 4
        // 5 4 2
    }
}
