import java.util.*;

interface Serializable {}

class Product implements Serializable {
	int product_id, product_cost;
	String product_name, product_quality;
	
	static int count = 0;
	
	Product(){
		this.product_id=0;
		this.product_cost=0;
		this.product_name=null;
		this.product_quality=null;
		count=count+1;
	}
	
	Product(int pid, int pcost, String pname, String pqual){
		this.product_id=pid;
		this.product_cost=pcost;
		this.product_name=pname;
		this.product_quality=pqual;
		count=count+1;
	}
	
	void get(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter product ID: ");
		product_id = sc.nextInt();
		System.out.print("Enter product cost: ");
		product_cost = sc.nextInt();
		System.out.print("Enter product name: ");
		product_name = sc.next();
		System.out.print("Enter product quality (Good / Better / Best): ");
		product_quality = sc.next();
	}
	
	void display(){
		System.out.println(product_id + "\t" + product_cost + "\t" + product_name + "\t" + product_quality);
		System.out.println("Product count: " + count);
	}
}

class a3sb2 {
	public static void main(String args[]){
		while(true){
			Product p = new Product();
			p.get();
			p.display();
		}
	}
}
