package west2milktea;
import java.util.*;
public class TeaShopTestDrive {
	//main函数实在不知道要怎么写了
	//一个很失败的并且未完成的main函数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mktype;String name = null;
		Scanner s=new Scanner(System.in);
		System.out.print("欢迎光临奶茶店，测试期间一次只能买一杯");
		System.out.printf("1-珍珠奶茶\n2-椰果奶茶\n其他-不买\n");
		System.out.println("Please enter...");
		mktype=s.nextInt();
		s.close();
		Ingredient Ing = null;
		switch(mktype){
		case 1:name="Bubble MilkTea";Ing=new Bubble();break;
		case 2:name="Coconut MilkTea";Ing=new Coconut();break;
		default:System.exit(0);
		}
		MilkTea m1=new MilkTea(name);//加配料的方法是？？
		m1.Stock(Ing);//应该对Ing进行操作吗？？？Ing.stock？？？
		//是不是在m1里再调用那些狗屁方法？？
		m1.add(Ing);
		m1.Sold();
		//制作中
		//此处应当展示剩余库存和其他情况
		System.out.println("你的"+m1.getname()+"奶茶好了");
		
		
	}
	
}
