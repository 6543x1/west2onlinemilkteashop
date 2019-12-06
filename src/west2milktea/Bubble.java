package west2milktea;

import java.util.*;

import west2milktea.Teashop.Shop;

public class Bubble extends Ingredient implements Shop {
	
	Calendar monment;//其实我也不知道为啥要写这个

	public void setNumber(int number) {
		// TODO Auto-generated method stub
		remains=number;
	}
	public int number() {
		return remains;
	}
	public Bubble(){
		monment=Calendar.getInstance();
		expdate=7;
		name="Bubble";
	}
	public void setTime(Calendar A) {
		monment=A;
		produceday=monment.get(Calendar.DAY_OF_MONTH);//测试过期的时候可以用吧
	}
	@Override
	public void Stock(Ingredient Ing) {
		// TODO Auto-generated method stub
		if(Ing instanceof Bubble)
			Ing.setNumber(100);
			BubbleList2.add((Bubble)Ing);
			Ing.produceday=monment.get(Calendar.DAY_OF_MONTH);
		
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

	@Override
	public void removeOutOfDate(Ingredient Ofd) {
		// TODO Auto-generated method stub
		BubbleList2.remove((Bubble)Ofd);
	}
	 @Override
	 public String toString() {
	        return super.toString();
	    }

	
}
