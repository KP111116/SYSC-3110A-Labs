import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if(buddy != null) {
            this.buddies.add(buddy);
            System.out.println(buddy.getName() + " added to address book");
        }
    }

    public void removeBuddy(int index){
        if(index >= 0 && index < buddies.size()){
            this.buddies.remove(index);
            System.out.println(buddies.get(index).getName() + " removed from the address book");
        }
    }

    public static void main(String[] args) {
        BuddyInfo homer = new BuddyInfo("Homer");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(homer);
        addressBook.removeBuddy(0);
    }
}
