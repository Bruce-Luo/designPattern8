package flyweight;

public class Client {
	public static void main(String[] args) {
		int extrinsicstate = 22;
		
		FlyweightFactory f = new FlyweightFactory();
		
		Flyweight fx = f.getFlyweight("X");
		fx.operation(--extrinsicstate);  //--�������ָ�Լ�������
		
		Flyweight fy = f.getFlyweight("Y");
		fy.operation(--extrinsicstate);
		
		Flyweight fz = f.getFlyweight("Z");
		fz.operation(--extrinsicstate);
		
		Flyweight uf = new UnsharedConcreteFlyweight();
		
		uf.operation(--extrinsicstate);
		
	}

}
