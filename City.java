package HwAbstract;

public class City extends Community{
    private static District[] districts;

    public City(String name, String manager, int population, District[] districts) {
        super(name, manager, population);
        this.districts = districts;
    }

    public District getDistrict(int index){
        if (index < 0 || index > districts.length) return null;
        return districts[index];
    }

    public static District findByManager(String manager){

        for (int i = 0; i < districts.length; i++) {
            if (districts[i].getManager().equals(manager)) {
                return  districts[i];
            }
        }
        return null;
    }
}
