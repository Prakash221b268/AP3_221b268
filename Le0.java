/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Le0
{	String name;
	int age;
	void setAge(int age) {
		this.age=age;
	}
	void setName(String name) {
		this.name=name;
	}
	int getAge() {
		return this.age;
	}
	String getName() {
		return this.name;
	}
	public static void main(String[] args) {
		System.out.println("Set Operation and Get Operations:\n");
		Le0 m1=new Le0();
		m1.setName("sada");
		m1.setAge(10);
		System.out.println(m1.getAge()+" "+m1.getName());



	}
}
