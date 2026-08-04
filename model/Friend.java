/**
 * Contains the model classes of the Splitwise application.
 */
package splitwise.model;
/**
 * Represents a friend in the Splitwise application.
 * Every friend has a unique id and a name.
 */
public class Friend {

  private final String name;
  private static int lastId = 0 ;
  private final int id ;
/**
        * Creates a new friend.
         * @param name the friend's name
 */
   public Friend(String name)
   {
       this.name=name;
       lastId++;
       this.id=lastId;
   }

    /**
     * Returns the friend's name.
     *
     * @return the friend's name
     */
   public String getName()
   {
       return name;
   }

    /**
     * Returns the friend's unique id.
     *
     * @return the friend's unique id
     */
   public int getId()
   {
       return id;
   }

}
