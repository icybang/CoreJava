package p2;
import p1.EnumDeclaration;
public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumDeclaration [] data = EnumDeclaration.values();
		for(EnumDeclaration e:data)
			System.out.println("Name :"+e.getName()+" Number : "+e.getNum());
	}

}
