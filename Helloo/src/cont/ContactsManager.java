package cont;
/**
 * This class maintains the contacts of your friends / relations / wellwishers et.
 * 
 * The following are the opertaions that this ContactManager application can
 * perform.
 * 
 * You can create a contact of your choice.
 *      Creates a contact and keep this in the ContactManager list.
 * You can search for a contact by name
 *      Search for a contact based on the name in the ContactManager list.
 * You can search for a contact by email.
 *      Search for a contact based on email in the ContactManager list.
 * You can delete a contact by name.
 *      Search for a contact based on name of the contact and delete from the 
 *      ContactManager list.
 * 
 * @author Siva Sankar
 */

class ContactsManager {
	 Contact[] myfriends=new Contact[500];
	    int friendsCount=0;

	    ContactsManager(){
	        this.friendsCount=0;
	        this.myfriends=new Contact[500];
	    }

    /**
     * Define a variable myFriends which is an array that can hold 
     * the contacts of your friends.
     */

    /**
     * Define a variable friendsCount of type int maintain the number of 
     * contacts of your friends.
     */


    /**
     * When the object of ContactManager is created, the constructor should 
     * constrcut the object initialy with the following requirements.
     * 
     * 1. Initializes the friendsCount to 0 as there no contacts in the list.
     * 2. myFriends with array initial size of 500
     */
 
    /**
     * The addContact method takes in a parameter of type contact object and 
     * adds this to the contact list.
     * @param contact, to be added.
     */
    public void addContact(Contact contact) {
        //  Your code goes here....
    	 myfriends[friendsCount]=contact;
         friendsCount=friendsCount+1;

        //  Nothing to be returned... As this method is void...
    }
 
    /**
     * This method search for the contact based on the name of your friend and gives the
     * first occurance of the contact in your friends list.
     * @param searchName, the name of the contact to be searched in the friends list.
     * @return the contact of the friend, null otherwise.
     */
    public Contact searchContact(String searchName) {
        //  Your code goes here....
    	for(int i=0;i<friendsCount;i++){
            if(myfriends[i].name.equals(searchName))
            {
               return myfriends[i];
            }
        }

        return null;
    }

    /**
     * This method search for the contact based on the email of your friend 
     * and gives the first occurance of the contact in your friends list.
     * @param searchName, the email of the contact to be searched in the friends list.
     * @return the contact of the friend, null otherwise.
     */
    public Contact searchContactByEmail(String email) {
        //  Your code goes here....
    	 for(int i=0;i<friendsCount;i++){
             if(myfriends[i].email.equals(email)){
                 return myfriends[i];
             }
         }

        return null;
    }

    /**
     * This method deletes the contact based on the name of your friend and returns
     * true on success and false if failure in deleting the contact.
     * 
     * @param searchName, the name of the contact to be searched in the friends list.
     * @return true if contact has been removed successfully and false otherwise.
     */
    public boolean deleteContact(String searchName) {
        //  Your code goes here....
    	boolean temp=false;
        for(int i=0; i<myfriends.length;i++)
        {
            if(myfriends[i]!=null)
            {
                if(myfriends[i].name.equals(searchName))
                {
                    myfriends[i]=null;
                    temp=true;
                    break;
                }
            }

        }

        return temp;
    }
}
    // Any additional method that you want to implement by yourself.

    //  Happy Coding... Have Fun.....

class Main {
	public static void main(String [] args){
        Contact contact = new Contact("", "", "");
        ContactsManager myContactManager = new ContactsManager();
        myContactManager.addContact( new Contact("Kevin Wayne", "kevin@gmail.com", "9999912342"));
        myContactManager.addContact(new Contact("", "", ""));
        System.out.println(myContactManager.searchContactByEmail("kevin@gmail.com").toString());
        System.out.println(contact.toString());
    }


}
