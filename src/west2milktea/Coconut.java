package west2milktea;

import java.util.*;

import west2milktea.Teashop.Shop;

public class Coconut extends Ingredient implements Shop{
	Calendar now;
	public Coconut(){
	now=Calendar.getInstance();
	name="Coconut";
	expdate=5;
	}
	@Override
	public void setNumber(int number) {
		remains=number;
	}
	public int number() {
		return remains;
	}
	@Override
	public void Stock(Ingredient Ing) {
		// TODO Auto-generated method stub
		if(Ing instanceof Coconut)
			Ing.setNumber(100);
			CoconutList2.add((Coconut)Ing);
			Ing.produceday=now.get(Calendar.DAY_OF_MONTH);
	}
	public void setTime(Calendar A) {
		now=A;//应该想在main函数里用的吧
		produceday=now.get(Calendar.DAY_OF_MONTH);
	}
	
	@Override
	public void Sold() {
		// TODO Auto-generated method stub
		
	}
	public void add() {
		// TODO Auto-generated method stub
		//if(Ing instanceof Coconut)
		//CoconutList2.add((Coconut)Ing);
		
	}
	@Override
	public void add(Ingredient bu) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delNumber(Ingredient Ing) {
		// TODO Auto-generated method stub
		remains--;
			if(remains==-1) {
				throw new SoldOutException();//catch should be done by main
			}
		
	}
	@Override
	public void removeOutOfDate(Ingredient Ofd) {
		// TODO Auto-generated method stub
		CoconutList2.remove((Coconut)Ofd);
	}
	 @Override
	 public String toString() {
	        return super.toString();
	    }
	 
	
}

