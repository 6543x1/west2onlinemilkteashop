package west2milktea;
import java.util.*;
public class TeaShopTestDrive {
	//main����ʵ�ڲ�֪��Ҫ��ôд��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mktype;String name;
		Scanner s=new Scanner(System.in);
		System.out.print("��ӭ�����̲�꣬�����ڼ�һ��ֻ����һ��");
		System.out.printf("1-�����̲�\n2-Ҭ���̲�\n0-����\n");
		System.out.println("Please enter...");
		mktype=s.nextInt();
		s.close();
		Ingredient Ing = null;
		switch(mktype){
		case 1:name="BubbleTea";Ing=new Bubble();break;
		case 2:name="CoconutTea";Ing=new Coconut();break;
		default:name=null;//��Ҳ��֪����ô�˳�
		}
		MilkTea m1=new MilkTea(name);//�����ϵķ����ǣ���
		m1.Stock(Ing);//Ӧ�ö�Ing���в����𣿣���Ing.stock������
		//�ǲ�����m1���ٵ�����Щ��ƨ��������
		m1.add(Ing);
		m1.Sold();
		//������
		//�˴�Ӧ��չʾʣ������������
		System.out.println("���"+m1.getname()+"�̲����");
		
		
	}
	
}
