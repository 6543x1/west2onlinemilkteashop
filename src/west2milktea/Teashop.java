package west2milktea;
import java.util.*;
public class Teashop { 
	
	public interface Shop{
		ArrayList<Bubble> BubbleList2=new ArrayList<Bubble>();
		ArrayList<Coconut> CoconutList2=new ArrayList<Coconut>();//Ϊɶ��2�أ���Ϊһ��ʼд�ڶ�Ӧ������
		abstract void Stock(Ingredient Ing);
		//abstract void addBubble();
		//abstract void addCoconut();
		abstract void add(Ingredient bu);//��Ҫ��ô�жϼ�ʲô�أ�����������ʱ�𣿣�����
		abstract void Sold();
		//ÿ��һ�λ���newһ���¶���Ȼ����ȥ�����󱣴����������ڣ��Ϳ��������
				//�����������˾ͽ���
				//ÿ�ι���ʱ�����٣�
				//����ʱ�������棬�׳�sold out�쳣
				
	}

}
