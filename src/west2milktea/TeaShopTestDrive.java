package west2milktea;
import java.util.*;
public class TeaShopTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mktype;String name;
		Scanner s=new Scanner(System.in);
		System.out.print("��ӭ�����̲�꣬�����ڼ�һ��ֻ����һ��");
		System.out.printf("1-�����̲�\n2-Ҭ���̲�\n0-����\n");
		System.out.println("Please enter...");
		mktype=s.nextInt();
		s.close();
		switch(mktype){
		case 1:name="BubbleTea";break;
		case 2:name="CoconutTea";break;
		default:name=null;//��Ҳ��֪����ô�˳�
		}
		MilkTea m1=new MilkTea("BubbleTea");//�����ϵķ����ǣ���
		//������
		//�˴�Ӧ��չʾʣ������������
		System.out.println("���"+m1.getname()+"�̲����");
		
		
	}
	
}
