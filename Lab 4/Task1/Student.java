import java.util.*;
class Student extends Parent{
	public static void main(String[] args) {
    LinkedList<String>instance=new LinkedList<String>();
    instance.add("18SW10");
    
    System.out.println("Instance Of Student="+instance);
    System.out.println("Size="+instance.size());
    System.out.println("Rollnum="+instance.getFirst());
    System.out.println(""+instance.getLast());
    System.out.println(""+instance.peek());
    System.out.println(""+instance.pop());
    System.out.println(""+instance.poll());
    System.out.println(""+instance.offerFirst("Amna"));
    System.out.println(""+instance.offerLast("Software"));
    System.out.println(""+instance.pollFirst());
    System.out.println(""+instance.pollLast());
}


}