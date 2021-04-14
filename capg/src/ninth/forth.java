package ninth;
interface demo
{
	void doo(int no);
	}
class methodref{
static void some(int g)
{
	System.out.println("THIS IS FOR DEMONSTATION OF METHOD REFRENCE"+" "+g);
	}
    
}
public class forth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  demo s=methodref::some;
    s.doo(10);
	}

}
