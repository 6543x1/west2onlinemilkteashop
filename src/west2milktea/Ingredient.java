package west2milktea;
import java.util.*;
public abstract class Ingredient {
	protected String name;
	protected int expdate;
	protected int remains;
	protected Date producedate;
	protected int produceday;
	public abstract void setNumber(int number);//��ʵӦ�ý�setremains�Ŷ�
	public abstract void delNumber(Ingredient Ing);
	public abstract void removeOutOfDate(Ingredient Ofd);
	public String toString() {
	        return "��������"+name+"����ʱ��"+expdate+"ʣ��"+remains+"�������ڣ�dayofmonth��"+produceday;
	    }
}
