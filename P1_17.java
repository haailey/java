public class P1_17
{
	public static void main(String[] args) throws Exception
	{
		URL imageLocation = new URL(
			"http://horstmann.com/java4everyone/duke.gif");
		JOptionPane.showMessageDialog(null, "Hello", "Title",
			JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
		System.exit(0);
	}
}