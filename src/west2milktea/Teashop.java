package west2milktea;
import java.util.*;
public class Teashop { 
	
	public interface Shop{
		ArrayList<Bubble> BubbleList2=new ArrayList<Bubble>();
		ArrayList<Coconut> CoconutList2=new ArrayList<Coconut>();
		//ÿ��һ�λ���newһ���¶���Ȼ����ȥ�����󱣴����������ڣ��Ϳ��������
		//�����������˾ͽ���
		//ÿ�ι���ʱ�����٣�����������Ա仯
		//����ʱ�������棬�׳�sold out�쳣��������
		//arraylist����һֱ�ӽ�ͬһ�����֣���Ϊʵ�����ǲ�ͬ�Ķ���
		abstract void Stock(Ingredient Ing);
		//abstract void addBubble();
		//abstract void addCoconut();
		abstract void add(Ingredient bu);//��Ҫ��ô�жϼ�ʲô�أ�����������ʱ�𣿣�����
		abstract void Sold();
	}

}
