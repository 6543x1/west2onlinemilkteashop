package west2milktea;

import java.util.*;

import west2milktea.Teashop.Shop;

public class Coconut extends Ingredient implements Shop{
	Calendar now;
	public Coconut(){
	now=Calendar.getInstance();
	name="Coconut";
	}
	public void setCnums(ArrayList<Coconut> N) {
	}
	@Override
	public void getIngredient() {
		// TODO Auto-generated method stub
		
	}
	public void setNumber(int number) {
		remains=number;
	}
	@Override
	public void Stock(Ingredient Ing) {
		// TODO Auto-generated method stub
		
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
		if(remains==0) {
			//Ing.Stock(Ing);
		}
	}
	
	
}

