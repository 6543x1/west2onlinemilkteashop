package west2milktea;

public class SoldOutException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SoldOutException() {
		
	}
	public SoldOutException(Ingredient Ing) {
		System.out.println("不好意思，卖完了！！");
	}
}
