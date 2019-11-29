package west2milktea;
import java.util.*;
public class TeaShopTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mktype;String name;
		Scanner s=new Scanner(System.in);
		System.out.print("欢迎光临奶茶店，测试期间一次只能买一杯");
		System.out.printf("1-珍珠奶茶\n2-椰果奶茶\n0-不买\n");
		System.out.println("Please enter...");
		mktype=s.nextInt();
		s.close();
		switch(mktype){
		case 1:name="BubbleTea";break;
		case 2:name="CoconutTea";break;
		default:name=null;//我也不知道怎么退出
		}
		MilkTea m1=new MilkTea("BubbleTea");//加配料的方法是？？
		//制作中
		//此处应当展示剩余库存和其他情况
		System.out.println("你的"+m1.getname()+"奶茶好了");
		
		
	}
	
}
