package west2milktea;

import java.util.*;

import west2milktea.Teashop.Shop;

public class Bubble extends Ingredient implements Shop {
	Calendar monment;
	@Override
	public void getIngredient() {
		// TODO Auto-generated method stub
		
	}

	public void setNumber(int number) {
		// TODO Auto-generated method stub
		remains=number;
	}
	public int number() {
		return remains;
	}
	public Bubble(){
		monment=Calendar.getInstance();
	}
	@Override
	public void Stock(Ingredient Ing) {
		// TODO Auto-generated method stub
		if(Ing instanceof Bubble)
			Ing.setNumber(100);
			BubbleList2.add((Bubble)Ing);
		
	}
	@Override
	public void Sold() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void add(Ingredient bu){
		// TODO Auto-generated method stub
		//判断一下加不加？？？
		
		
		
	}
	@Override
	public void delNumber(Ingredient Ing) {
		// TODO Auto-generated method stub
		remains--;
		if(remains==-1) {
			throw new SoldOutException();//卖完进货的工作恐怕只能？？交给主函数了
		}
	}
	
	
}
