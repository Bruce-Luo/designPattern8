package flyweight_shareWebsiteCode;

public class Client {
	public static void main(String[] args) {
		WebsiteFactory f = new WebsiteFactory();
		
		Website fx = f.getWebsiteCategory("��Ʒչʾ");
		Website fy = f.getWebsiteCategory("��Ʒչʾ");
		Website Fz = f.getWebsiteCategory("��Ʒչʾ");
		
		
		Website f1 = f.getWebsiteCategory("����");
		f1.use();
		
		Website f2 = f.getWebsiteCategory("����");
		f2.use();
		
		Website f3 = f.getWebsiteCategory("����");
		f3.use();
		
		System.out.println("��վ��������Ϊ��" + f.getWebsiteCount());
		
		
	}

}
