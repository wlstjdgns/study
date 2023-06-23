package ex06;

// import java.awt.event.ActionEvent;

// import javax.swing.JButton;
// import javax.swing.JLabel;


// public class Event01 extends JFrame {
//     private JButton button;
//     private JLabel label;
//     int counter = 1;

//     public Event01() {

//         setSize(600, 200);
//         setLayout(new FlowLayout());

//         button = new JButton("증가");
//         label = new JLabel("현재의 카운터값: " + counter);
//         //난 클래스가 아니라 메서드를 주입하고 싶지만, 자바언어특성상 클래스주입
//         button.addActionListener(new Inner());//null값에 행위를 넣어야해 타언어였으면 
//         //메소드를 바로 넣을텐데 자바는 클래스가 없으면 작동을 못하니까
        
//         add(button);
//         add(label);

//         setVisible(true);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);

//     }
// class Inner implements ActionListener{
//     public void actionPerformed(ActionEvent e){
//         JButton btn = (JButton) e.getSource();
//         System.out.println("버튼 클릭됨: "+e);
//         System.out.println(btn.getText());

//         counter++;
//         System.out.println(counter);

//         label.setText("현재의 카운터값: " + counter);
//     }
//     //클래스 내부의 클래스 이클래스는 이클래스 안에서만 사용될때
// }
//     public static void main(String[] args) {

//     }
// }
