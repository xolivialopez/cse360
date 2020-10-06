package cse360assignment02;

public class driver {
	 public static void main(String[] args)
	   {
	      AddingMachine addingMachine = new AddingMachine();
	      addingMachine.add (4); 
	      addingMachine.subtract (2); 
	      addingMachine.add(5);
	      System.out.print(addingMachine.getTotal() + "\n");
	      System.out.print(addingMachine.toString());
	   }
}
