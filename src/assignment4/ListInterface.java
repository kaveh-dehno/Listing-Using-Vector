package assignment4;

/** An interface for the ADT list
 * Entries in the list have positions that begins with 1.
 * @author kaveh DEHNO
 *
 */
public interface ListInterface<T>
{

  /** adds new entry to the end of the list.
   * increases the size of the list by 1.
   * @param newEntry the entry to be added
   */
  public boolean add(T newEntry);
  
  /** adds a new entry to an specific position in the list.
   * Increases the size of the list by 1.
   * @param newPosition the desired position of the new entry to be added.
   * @param newEntry the entry to be added.
   * @throws throws exception if new position is less than 1 or the new position is 
   * greater than the length of the list + 1
   */
  public boolean add(int newPosition, T newEntry);
  
  /** Removes an entry at a given position from the list.
   * Decreases the size of the list by 1
   * @param givenPosition the desired position to be removed
   * @return the removed element from the list
   * @throws exception if position less than 1 or > the length of the list
   */
  public T remove(int givenPosition);
  
  /** removes all the elements of the list
   * 
   */
  public void clear();
  
  /** replace an entry with a new entry at a given position
   * 
   * @param givenPosition the desired position to be replace
   * @param newEntry the entry to replace the old entry
   * @return the replaced entry of that position
   * @throws exception if givenPosition less than 1 or > the length of the list
   */
  public T replace(int givenPosition, T newEntry);
  
  /** retrieves the entry at a given position
   * 
   * @param givenPosition the position of the desired entry to be verified
   * @return the entry of the desired position
   * @throws exception if givenPosition less than 1 or > the length of the list
   */
  public T getEntry(int givenPosition);
  
  /** retrieves all entries in the list in the order of importance
   * 
   * @return a new array of all the entries of the list. and returns empty
   * array if the list is empty
   */
  public T[] toArray();
  
  /** verifies whether the list contains a desired element
   * 
   * @param anEntry the entry to be verified
   * @return true if the element exist in the list and false otherwise
   */
  public boolean contains(T anEntry);
  
  /** returns the size of the list
   * 
   * @return an integer number indicating the size of the list
   */
  public int getLength();
  
  /** verifies whether the list is empty
   * 
   * @return true if the list is empty and false otherwise
   */
  public boolean isEmpty();
}
