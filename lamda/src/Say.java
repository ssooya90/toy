@FunctionalInterface
interface Say{
	int someting(int a,int b);
}
class Person{
	public void hi(Say say) {
		int number = say.someting(3,4);
		System.out.println("Number is "+number);
	}
}