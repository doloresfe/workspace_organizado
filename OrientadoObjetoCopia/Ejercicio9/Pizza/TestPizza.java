package Pizza;

public class TestPizza {

	public static void main(String[] args) {
		
		Pizza p1= new Pizza("margarita","mediana");
		
		Pizza p2=new Pizza("fughi","familiar");
	
		p2.sirve();
		Pizza p3=new Pizza("cuatro quesos","mediana");
		
		
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p2.sirve();
		System.out.println("Total pedidas "+Pizza.getTotalPedida());
		System.out.println("Total servida "+Pizza.getTotalServida());
		
	}

}
