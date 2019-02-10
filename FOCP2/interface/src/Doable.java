public interface Doable
{
	public static final String NAME=" ";
	public void doThis();
	public int doThat();
	public void doThis2(float value,char ch);
	public boolean doTheOther(int num);
	public class Test implements Doable
	{
		public void doThis()
		{
			//whatever
		}
		public void doThat()
		{
			//whatever
		}
		//etc
	}
}