package _01_double._2_test_scores;
import javax.swing.JOptionPane;
public class testscores {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = JOptionPane.showInputDialog("What did you get on your most recent test as a percent with a decimal.");
		Double testscore = Double.parseDouble(test);
		if(testscore < 90) {
			JOptionPane.showMessageDialog(null,"You sold big WOMP WOMP to you.");
			
		}else {
			JOptionPane.showMessageDialog(null, "That test must have not been up to curriclulum standards.");
		}
	}

}
