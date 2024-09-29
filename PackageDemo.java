package tutorials;
import pack1.Man;
import pack2.Women;
public class PackageDemo {

	public static void main(String[] args) {
		Man m=new Man("Smith",40);
		Women w=new Women("Jane",35);
		m.displayMe();
		w.displayMe();
	}

}
