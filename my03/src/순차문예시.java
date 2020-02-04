import javax.swing.JOptionPane;

public class 순차문예시 {

	public static void main(String[] args) {
		
		String group =JOptionPane.showInputDialog("당신의 소속은?");
		
		String name = JOptionPane.showInputDialog("당신의 이름은?");
		
		String result = name+"의 소속은 "+group+"소속입니다.";
		
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
		
	}

}
