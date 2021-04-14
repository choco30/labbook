package ninth;
 
interface ab{
	public void power(int x,int y);
}
public class first {
public static void main(String[] args) {
	
	ab a=(x,y)->{System.out.print(Math.pow(x,y));};
	a.power(2,10);
}
}
