package west2milktea;
import java.util.*;
public class Teashop { 
	
	public interface Shop{
		ArrayList<Bubble> BubbleList2=new ArrayList<Bubble>();
		ArrayList<Coconut> CoconutList2=new ArrayList<Coconut>();//为啥是2呢？因为一开始写在对应类中了
		abstract void Stock(Ingredient Ing);
		//abstract void addBubble();
		//abstract void addCoconut();
		abstract void add(Ingredient bu);//那要怎么判断加什么呢，主函数输入时吗？？？？
		abstract void Sold();
		//每进一次货就new一个新对象然后存进去。对象保存有生产日期，和库存数量。
				//如果库存用完了就进货
				//每次购买时库存减少，
				//过期时清理掉库存，抛出sold out异常
				
	}

}
