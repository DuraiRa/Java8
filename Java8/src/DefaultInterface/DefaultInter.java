package DefaultInterface;


interface Phone
{
	void call();
	default void show()
	{
		System.out.println("Show Calling ");
	}
	
}

/*class IPhone implements Phone
{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("call is calling");
	}
	
}*/
public class DefaultInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p;
		/*p = new Phone()
				{
			 public void call()
			{
				System.out.println("Calling");
			}
				};*/
		
		p =()->{
			System.out.println("lambada calling");
		};
		p.call();
		p.show();
		
	}

}
