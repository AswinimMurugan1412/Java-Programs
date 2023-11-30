package Linked_List;
import java.util.Scanner;
class SelfOrganising{
private int[]list;
private int[] count;
private int size;

  public SelfOrganising(int listSize)
    {
        list = new int[listSize];
        count = new int[listSize];
        size = 0;
    }
  public boolean isEmpty() {
	  return size == 0;
  }   
  public boolean isFull() { 
	  return size == list.length; 
  }
  public int getSize() {
	  return size;
  }
  public void insert(int val) {
	  if(isFull()) {
		  System.out.println("Error: List is Full");
		  return;
	  }
	  list[size]=val;
	  count[size]=0;
	  size++;
  }
  public void remove(int pos) {
	  pos--;
	  if(pos<0 || pos>=size) {
		  System.out.println("Invalid position");
		  return;
	  }
	  for(int i=pos;i<size-1;i++) {
		  list[i]=list[i+1];
		  count[i]=count[i+1];
	  }
  }
  public boolean search(int x) {
	  boolean searchResult=false;
	  int pos=1;
	  for(int i=0;i<size;i++) {
		  if(list[i]==x) {
			  searchResult=true;
			  pos=i;
			  break;
		  }
	  }
	  if(searchResult) {
		  count[pos]++;
		  int c=count[pos];
		  for(int i=0;i<pos;i++) {
			  if(count[pos]>count[i]) {
				  list[i]=list[i=1];
				  count[j]=count[j-1];
			  }
		  }
	  }
  }

public class Organaising_list {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Self Organizing List\n");
        System.out.println("Enter size of list ");
        int size = scan.nextInt();
        SelfOrganising list = new SelfOrganising(scan.nextInt());
        char ch;
        do {
            System.out.println(
                "\nSelfOrganizingList Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete at position");
            System.out.println("3. search");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            System.out.println("6. get size");
            int choice = scan.nextInt();
            switch (choice) {
            case 1:
                System.out.println(
                    "Enter integer element to insert");
                list.insert(scan.nextInt());
                break;
            case 2:
                System.out.println(
                    "Enter position to delete");
                list.remove(scan.nextInt());
                break;
            case 3:
                System.out.println(
                    "Enter integer element to search");
                System.out.println(
                    "Search Result : "
                    + list.search(scan.nextInt()));
                break;
            case 4:
                System.out.println("Empty status = "
                                   + list.isEmpty());
                break;
            case 5:
                System.out.println("Full status = "
                                   + list.isFull());
                break;
            case 6:
                System.out.println(
                    "Size = " + list.getSize() + " \n");
                break;
            default:
                System.out.println("Wrong Entry \n ");
                break;
            }
            list.printList();
 
            System.out.println(
                "\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}

	}

