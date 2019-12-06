package west2milktea;
import java.util.*;
public abstract class Ingredient {
	protected String name;
	protected int expdate;
	protected int remains;
	protected Date producedate;
	protected int produceday;
	public abstract void setNumber(int number);//其实应该叫setremains才对
	public abstract void delNumber(Ingredient Ing);
	public abstract void removeOutOfDate(Ingredient Ofd);
	public String toString() {
	        return "配料名字"+name+"过期时间"+expdate+"剩余"+remains+"生产日期（dayofmonth）"+produceday;
	    }
}
