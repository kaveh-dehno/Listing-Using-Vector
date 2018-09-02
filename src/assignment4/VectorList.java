


package assignment4;


/**A class of lists that implements list interface using the vector class
 * @author kaveh Dehno
 *
 */

import java.util.Vector;


public class VectorList<T> implements ListInterface<T>
{
  @SuppressWarnings("rawtypes")
  private Vector vectorList;
  private boolean initialized = false;
//  private int numberOfEntries;
  private static final int DEFAULT_CAPACITY = 10;
  private static final int MAX_CAPACITY = 10000;
  
  public VectorList()
  {
    this(DEFAULT_CAPACITY);
  }
  
  @SuppressWarnings({"rawtypes", "unchecked"})
  public VectorList(int initialCapacity)
  {
    checkCapacity(initialCapacity);
    vectorList = new Vector(initialCapacity);
    vectorList.add(null);
    initialized = true;
  }


  @SuppressWarnings("unchecked")
  public boolean add(T newEntry)
  {
    // TODO Auto-generated method stub
    boolean result = false;
    checkInitialization();
    vectorList.add(newEntry);
    ensureCapacity(DEFAULT_CAPACITY);
    result = true;
    return result;
    
  }

  @SuppressWarnings("unchecked")
  public boolean add(int newPosition, T newEntry)
  {
    // TODO Auto-generated method stub
    boolean result = false;
    checkInitialization();
    vectorList.add(newPosition, newEntry);
    ensureCapacity(DEFAULT_CAPACITY);
    result = true;
    return result;
  }

  @SuppressWarnings("unchecked")
  public T remove(int givenPosition)
  {
    // TODO Auto-generated method stub
    checkInitialization();
    return (T) vectorList.remove(givenPosition);
  }

  public void clear()
  {
    // TODO Auto-generated method stub
    vectorList.clear();
  }

  @SuppressWarnings("unchecked")
  public T replace(int givenPosition, T newEntry)
  {
    // TODO Auto-generated method stub
    checkInitialization();
    vectorList.set(givenPosition, newEntry);
    return null;
  }

  @SuppressWarnings("unchecked")
  public T getEntry(int givenPosition)
  {
    // TODO Auto-generated method stub
    if ( givenPosition == 0)
      throw new SecurityException("Illegeal request");
    return (T) vectorList.get(givenPosition);
  }

  @SuppressWarnings("unchecked")
  public T[] toArray()
  {
    // TODO Auto-generated method stub
    return (T[]) vectorList.toArray();
  }

  public boolean contains(T anEntry)
  {
    // TODO Auto-generated method stub
    return vectorList.contains(anEntry);
  }

  public int getLength()
  {
    // TODO Auto-generated method stub
    if (isEmpty())
      return vectorList.size();
    else
      return (vectorList.size() - 1);
  }

  public boolean isEmpty()
  {
    // TODO Auto-generated method stub
    return vectorList.isEmpty();
  }
  
  private boolean checkCapacity(int capacity)
  {
    return capacity <= MAX_CAPACITY;
  }
  
  private void checkInitialization()
  {
    if (!initialized)
      throw new SecurityException("The list is not initialized proparly.");
  }
  
  private void ensureCapacity(int newCapacity)
  {
    vectorList.ensureCapacity(newCapacity);
  }

}
