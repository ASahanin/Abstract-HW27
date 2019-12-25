package HwAbstract;

public class Main {
    public static void main(String[] args) {

        District[] districts = new District[4];
        districts[0] = new District("Moskovskiy", "Dedushkin", 140000);
        districts[1] = new District("Centralniy", "Babushkin", 123000);
        districts[2] = new District("Leningradskiy", "Nededushkin", 2222000);
        districts[3] = new District("Baltijskiy", "Nebabushkin", 1133333);
        City city = new City("Kaliningrad", "Alihanov", 2000000, districts);

        District[] districts1 = new District[4];
        districts1[0] = new District("Leninskiy", "Bolotov", 360000);
        districts1[1] = new District("Oktyabrskiy", "Ibragimov", 400123);
        districts1[2] = new District("Pervomaiskiy", "Ismailov", 345678);
        districts1[3] = new District("Sverdlovkiy", "Jakypov", 555999);
        City city1 = new City("Bishkek", "Surakmatov", 3000000, districts1);

        District[] districts2 = new District[4];
        districts2[0] = new District("Akademicheskiy", "Ivanov", 30004000);
        districts2[1] = new District("Arbat", "Petrov", 1234567);
        districts2[2] = new District("Veshnyaki", "Sidorov", 2345634);
        districts2[3] = new District("Chertanovo", "Mihalkov", 2345433);
        City city2 = new City("Moscow", "Sobyanin", 75444311, districts2);

        District search = City.findByManager("Bolotov");
        if (search != null){
            System.out.println(search.getName());
        } else {
            System.out.println("Sorry. There is no such district.");
        }

        Village village = new Village("Leninskoe", "Balabanova", 15000);
        Village village1 = new Village("Lugovoe", "Demidova", 5000);
    }
}
