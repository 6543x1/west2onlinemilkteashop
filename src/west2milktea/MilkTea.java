package west2milktea;

import java.util.*;
import java.util.Calendar;

import west2milktea.Teashop.Shop;

public class MilkTea implements Shop{
		String Ingname;
		private String name="Bubble";//��ʱ����
		public MilkTea(String name) {//�ð�Ӧ�����̲����ͣ����������֣���
			this.name=name;
		}
		ArrayList<Ingredient> Ingofmk=new ArrayList<>();
		
String getname() {
	return name;
}
String getIng() {
	return Ingname;//����������ʱ�������.....
}
void setBubble(){
	} 
void setCconut() {
	
}
void setIng(String Ingname) {
	if(Ingname=="Bubble") {
		Bubble bu=new Bubble();
		bu.add(bu);
	}
	else {
		Coconut co=new Coconut();
		co.add();
	}
}
@Override
public String toString(){
    return name+" "+Ingname;
}
@Override
public void Stock(Ingredient Ing) {
	Calendar cal=Calendar.getInstance();
	// TODO Auto-generated method stub
	if(Ing instanceof Bubble) {
		Bubble BB=(Bubble) Ing;
		BB.Stock(BB);
		BB.producedate=cal.getTime();
	}
	else {
		Coconut CC=(Coconut) Ing;
		CC.Stock(CC);
		CC.producedate=cal.getTime();
	}
}
@Override
public void add(Ingredient Ing) {
	Calendar cal=Calendar.getInstance();
	// TODO Auto-generated method stub
	if(Ing instanceof Bubble) {
		if(Ing.produceday+7<cal.get(Calendar.DAY_OF_MONTH)) {//�жϹ�����ʱֻ�ж�����......
			throw new SoldOutException();
		}
	Ing.delNumber(Ing);
	Ingofmk.add((Bubble)Ing);
	}
	else {
		if(Ing.produceday+7<cal.get(Calendar.DAY_OF_MONTH)) {
			throw new SoldOutException();
		}
	Ing.delNumber(Ing);
	Ingofmk.add((Coconut)Ing);
	}
}
@Override
public void Sold() {
	System.out.println("�����ˣ���ȡ��");
	// TODO Auto-generated method stub
	
}

}
