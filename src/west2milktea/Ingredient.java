package west2milktea;
import java.util.*;
public abstract class Ingredient {
	protected String name;
	protected int expdate;
	protected int remains;
	Calendar cal=Calendar.getInstance();
	protected Date producedate;
	protected int producemonth=cal.get(Calendar.MONTH)+1;
	protected int produceday=cal.get(Calendar.DAY_OF_MONTH);
	public abstract void getIngredient();
	public abstract void setNumber(int number);
	public abstract void delNumber(Ingredient Ing);
}
