package flyweight;

public class ConcreteFlyweight extends Flyweight
{
	@Override
	public void operation(int extrinsicstate) {
		// TODO Auto-generated method stub
		System.out.println("����flyweight��" + extrinsicstate);
	}
}
