package west2milktea;

import java.util.ArrayList;
import java.util.Calendar;


public class MilkTea{
		String Ingname;
		private String name="Bubble";//临时测试
		public MilkTea(String name) {//好吧应该是奶茶类型？而不是名字？？
			this.name=name;
		}
		ArrayList<String> Ingofmk=new ArrayList<>();
		
String getname() {
	return name;
}
String getIng() {
	return Ingname;//最后输出名字时用这个吧.....
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
public String toString(){
    return name+" "+Ingname;
}
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
public void add(Ingredient Ing) {
	Calendar cal=Calendar.getInstance();
	// TODO Auto-generated method stub
	if(Ing instanceof Bubble) {
		if(Ing.produceday+7<cal.get(Calendar.DAY_OF_MONTH)) {//判断过期暂时只判断这里......
			throw new SoldOutException();
		}
	Ing.delNumber(Ing);
	Ingofmk.add("Bubble");
	name="Bubble MilkTea";
	}
	else {
		if(Ing.produceday+7<cal.get(Calendar.DAY_OF_MONTH)) {
			throw new SoldOutException();
		}
	Ing.delNumber(Ing);
	Ingofmk.add("Coconut");
	name="Coconut MilkTea";
	}
}
public void Sold() {
	System.out.println("做好了，请取走");
	// TODO Auto-generated method stub
	
}

}
