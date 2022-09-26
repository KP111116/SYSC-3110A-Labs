import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        this.buddies.add(buddy);
        System.out.println(buddy.getName() + " added to address book");
    }

    public void removeBuddy(BuddyInfo buddy){
        this.buddies.remove(buddy);
        System.out.println(buddy.getName() + " removed from the address book");
    }

    public static void main(String[] args) {

        System.out.println("AddressBook");
    }
}
