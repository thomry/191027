package classproj;

import javax.swing.JOptionPane;

public class PersonMain {

	public static void main(String[] args) {
		
		// 자바옵션패널 (자바의 gui도구 : swing)]
		
		// 입력: JOptionPane.showInputDialog("입력메세지")
		// 출력: JOptionPane.showMessageDialog
		String name = JOptionPane.showInputDialog("성명을 입력하세요!");
		// int age  = JOptionPane.showInputDialog("나이를 입력하세요!"); - error int 안됨
		String age  = JOptionPane.showInputDialog("나이를 입력하세요!");
		
		String message = "입력된 성명은 "+name+"이고, 나이는 "+age+"입니다.";
		JOptionPane.showMessageDialog(null, message);
		
		Person person = new Person(name, Integer.parseInt(age));
		person.output();

	}

}
