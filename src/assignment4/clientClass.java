package assignment4;




/**
 * A class to test the operation of the implemented vector class
 * @author kaveh DEHNO
 *
 */
public class clientClass
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    ListInterface<String> nameList = new VectorList<>();
    System.out.println("Storing elements into the list");
    String[] stringArray = {"kaveh", "dave", "carlos"}; 
    testAdd(nameList, stringArray);
    System.out.println("\nThe length of the list is: "  +  nameList.getLength());
    
  System.out.println("\n\nThe list contains: ");
    listDisplay(nameList);
    


    
    System.out.println("\n\nStoring Ali into position 2.");
    nameList.add(2, "Ali");
    listDisplay(nameList);
    System.out.println("\nThe length of the list is: "  +  nameList.getLength());
    
    System.out.println("\n\nRemoving the element in position 4.");
    nameList.remove(3);
    listDisplay(nameList);
    System.out.println("\nThe length of the list is: "  +  nameList.getLength());
    
    
    
    System.out.println("\n\nreplacing the element in position 2 with samantha");
    nameList.replace(2, "Samantha");
    listDisplay(nameList);
    System.out.println("\nThe length of the list is: "  +  nameList.getLength());

    
    
    System.out.println("\n\nGetting the entry in position 2:      " + nameList.getEntry(2));

    
    System.out.println("\n\nVerifiying whether the list contains kaveh.     " + nameList.contains("kaveh"));
    nameList.replace(2, "Samantha");
    listDisplay(nameList);
    System.out.println("\nThe length of the list is: "  +  nameList.getLength());
    
    
    
    System.out.println("\n\nclearing the list. ");
    nameList.clear();
    listDisplay(nameList);
    System.out.println("\nThe length of the list is: "  +  nameList.getLength());
  }
 
  private static void testAdd(ListInterface<String> theList, String[] theArray)
  {
    for (int index = 0; index < theArray.length; index++)
    {
      if (theList.add(theArray[index]));
      {
        System.out.print(theArray[index] + ", ");
      }
    }
  }
  
  private static void listDisplay(ListInterface<String> theList)
  {
    Object[] listArray = theList.toArray();

  int iteration = listArray.length;
  for (int index = 0; index < iteration; index++)
  {
    if (listArray[index] == null)
    {

    }
   else if (listArray[index] != null)
      {
        System.out.print(listArray[index] + ", ");
      }
  }
  System.out.println("\nDisplay ended");
  }

}
