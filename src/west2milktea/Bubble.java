package west2milktea;

import java.util.*;

import west2milktea.Teashop.Shop;

public class Bubble extends Ingredient implements Shop {
	
	Calendar monment;//��ʵ��Ҳ��֪��ΪɶҪд���

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
		produceday=monment.get(Calendar.DAY_OF_MONTH);//���Թ��ڵ�ʱ������ð�
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
		//�ж�һ�¼Ӳ��ӣ�����
		
		
		
	}
	@Override
	public void delNumber(Ingredient Ing) {
		// TODO Auto-generated method stub
		remains--;
		if(remains==-1) {
			throw new SoldOutException();//��������Ĺ�������ֻ�ܣ���������������
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
