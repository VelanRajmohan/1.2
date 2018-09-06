import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class seventh
{
	public static void main(String[] args) throws Exception
	{

		URL imageLocation = new URL(
			"https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/1200px-Java_programming_language_logo.svg.png");
		JOptionPane.showMessageDialog(null, "Sup", "Title",
			JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));

	}
}