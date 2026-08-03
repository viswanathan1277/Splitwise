package splitwise.model;

public class Friend {

  private final String name;
  private static int lastId = 0 ;
  private final int id ;

   public Friend(String name)
   {
       this.name=name;
       lastId++;
       this.id=lastId;
   }

   public String getName()
   {
       return name;
   }

   public int getId()
   {
       return id;
   }

}
