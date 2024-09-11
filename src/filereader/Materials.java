package filereader;

public class Materials { //class file with 
		int cod_material;
		String name;
		double price;
		int amount;

	public Materials(int cod_material, String name, double price, int amount) throws Exception{
	    this.cod_material = cod_material;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	public void showsMaterial() {
		System.out.println("\ncode: " + cod_material);
		System.out.println("name: " + name);
		System.out.println("price: " + price);
		System.out.println("amount: " + amount);
	}
}
