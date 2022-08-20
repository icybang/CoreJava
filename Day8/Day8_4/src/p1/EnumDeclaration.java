package p1;

public enum EnumDeclaration {
	com(10,"Computer Scinece"),it(20,"Information Technology"),mech(30,"Mechanical"),
	civil(40,"Civil"),elect(50,"Electrical"),entc(60,"Electronics");
	int num;
	String name;
	EnumDeclaration()
	{
		num = 0;
		name = "";
	}
	EnumDeclaration(int n,String newname)
	{
		num = n;
		name = newname;
	}
	public int getNum()
	{
		return num;
	}
	public String getName()
	{
		return name;
	}
}
