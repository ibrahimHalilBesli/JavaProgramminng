package day33_Statics.practiceTask;

public class AddressTest {

    public static void main(String[] args) {

        Address address1 = new Address("Schulenburger Land Str","Hannover","Niedersachsen",30165);

        System.out.println(address1);

        Address address2 = new Address();

        address2.setInfo("Hasimiscan ","Antalya","Akdeniz",7100);


        System.out.println(Address.country);
        System.out.println(Address.planet);
        System.out.println(address2);




    }
}
