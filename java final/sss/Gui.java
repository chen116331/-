package sss;
import sss.*;
import sss.NewException;
import java.io.*;
import java.util.*;
import java.util.List;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener{

	Majorattribute majorattribute;

	Container c;
	JLabel label1;JLabel label2;JLabel label3;JLabel label4,label5;JLabel label6;
	JLabel label7;JLabel label8;JLabel label9;JLabel label10,label11;JLabel label12;JLabel label13;

	JButton button1,button2;
	JButton button3,button4;
	TextArea ta1,ta2;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	CheckboxGroup cbg;
	JComboBox b1;JComboBox b2;JComboBox b3;JComboBox b4;JComboBox b5;
	JCheckBox c1,c2,c3;
	String year[]={"1999年","2000年"};
	String month[]={"1月","2月","3月","4月","5月","6月","1月",
			"7月","8月","9月","10月","11月","12月"};
	String day[]={"1日","2日","3日","4日","5日","6日","7日","8日","9日",
			"10日","11日","12日","13日",
			"14日","15日","16日","17日",
			"18日","19日","20日","21日",
			"22日","23日","24日","25日",
			"26日","27日","28日","29日",
			"30日","31日"};
	String time[]={"0.5","1.0","1.5","2.0","2.5","3.0"};
	String score[]={"2.0","2.5","3.0"
			};

	public Gui(){
		super("选课系统");
		label1=new JLabel("请输入个人信息和所选课程，完成后单击确定。           ");
		label7=new JLabel("请输入开设的课程和信息，完成后单击确定。        ");
		b1=new JComboBox(year);
		b2=new JComboBox(month);
		b3=new JComboBox(day);
		b4=new JComboBox(time);
		b5=new JComboBox(score);
		label2=new JLabel("学生姓名：");
		label8=new JLabel("教师姓名：");
		label3=new JLabel("性别:");
		cbg = new CheckboxGroup(); 
		label9=new JLabel("课程名称：");
		label6=new JLabel("学号：");
		label4=new JLabel("生日：");
		label10=new JLabel("课程编号：");
		label5=new JLabel("课程：");
		label11=new JLabel("上课地点：");
		label12=new JLabel("课时：");
		label13=new JLabel("学分：");

		c1=new JCheckBox("pyhton");
		c2=new JCheckBox("c++");
		c3=new JCheckBox("Java");
		ta1=new TextArea(17,35);
		ta2=new TextArea(17,35);
		button1=new JButton("确定");
		button2=new JButton("取消");
		button3=new JButton("确定");
		button4=new JButton("取消");
		t1=new JTextField("",5);
		t2=new JTextField("",10);
		t3=new JTextField("",5);
		t4=new JTextField("",5);
		t5=new JTextField("",5);
		t6=new JTextField("",5);
		t7=new JTextField("",5);
		t8=new JTextField("",5);
		setBounds(600,300,625,620);
		try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e){}
		c = getContentPane();
		c.setBackground(Color.pink);
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		c.add(label1);
		c.add(label7);
		c.add(label2);
		c.add(t1);
		c.add(label3);
		c.add(new Checkbox("男", cbg, true)); 
		c.add(new Checkbox("女", cbg, false));
		c.add(new JLabel("           "));
		c.add(label8);
		c.add(t3);
		c.add(new JLabel("                          "));
		c.add(label6);
		c.add(t2);

		c.add(new JLabel("                        "));
		c.add(label9);
		c.add(t4);
		c.add(new JLabel("                          "));
		c.add(label4);
		c.add(b1);c.add(b2);c.add(b3);
		c.add(new JLabel("           "));

		c.add(label11);
		c.add(t6);
		c.add(new JLabel("                         "));
		c.add(label5);c.add(c1);c.add(c2);c.add(c3);
		c.add(new JLabel("               "));
		c.add(label10);
		c.add(t5);
		c.add(new JLabel("                                                   "));
		c.add(label12);
		c.add(b4);
		c.add(new JLabel("                                                   "));
		c.add(label13);
		c.add(b5);
	

		c.add(new JLabel("                      "));
		c.add(ta1);
		c.add(new JLabel("     "));
		c.add(ta2);
		c.add(new JLabel("                               "));
		c.add(button1);

		c.add(new JLabel("                                        "));
		c.add(button3);
		c.add(new JLabel("                                        "));
		c.add(new JLabel("                                          "));
		c.add(button4);
		setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		}
	public void actionPerformed(ActionEvent e){
	    	Majorattribute p = null;
	    	Majorattribute q = null;
	    	Majorattribute r = null;
	    	Students students = null;
	    	Majorattribute majorattribute = null;
		    String str="";

		    File file=new File("C:\\新建文件夹\\a.txt");

		    try {

		        FileInputStream in=new FileInputStream(file);



		        int size=in.available();

		        byte[] buffer=new byte[size];

		        in.read(buffer);

		        in.close();

		        str=new String(buffer,"GB2312");

		    } catch (IOException e1) {

		        
		        e1.printStackTrace();

		    }
			String b[] = str.split(",");
	    	p  = new Majorattribute(b[0],b[1],b[2],b[3],b[4]);
	    	q  = new Majorattribute(b[5],b[6],b[7],b[8],b[9]);
	    	r  = new Majorattribute(b[10],b[11],b[12],b[13],b[14]);

	    	
	    	if(e.getSource()==button1)
				ta1.append("姓名："+t1.getText()+"\n"+
				"学号："+t2.getText()+"\n"+"性别："
				+cbg.getSelectedCheckbox().getLabel()+
				"\n"+"生日："+b1.getSelectedItem()+b2.getSelectedItem()
				+b3.getSelectedItem()+"\n");

			
	    	
	    			if(c1.isSelected() && e.getSource()==button1)
					ta1.append( "课程：" + c1.getLabel()+" "+p.toString()+"\n");

					students = new Students(t1.getText(),t2.getText(),cbg.getSelectedCheckbox().getLabel(),p);
					StringBuffer s1=new StringBuffer();
					s1.append(students);
					s1.append(p);
					try {
						FileWriter fw=new FileWriter("C:\\新建文件夹\\b.txt");
						fw.write(s1.toString() + "\n");
						fw.close();
						} 
					catch (IOException n) 
						{
						n.printStackTrace();
						}
					
					if(c2.isSelected() && e.getSource()==button1)
					ta1.append( "课程：" + c2.getLabel()+" "+q.toString()+"\n");
					students = new Students(t1.getText(),t2.getText(),cbg.getSelectedCheckbox().getLabel(),q);
					StringBuffer s_1=new StringBuffer();
					s_1.append(students);
					s_1.append(p);
					try {
						FileWriter fw=new FileWriter("C:\\新建文件夹\\b.txt");
						fw.write(s_1.toString() + "\n");
						fw.close();
						} 
					catch (IOException n) 
						{
						n.printStackTrace();
						}
					
					
					if(c3.isSelected() && e.getSource()==button1)
					ta1.append( "课程：" + c3.getLabel()+" "+r.toString()+"\n");

					students = new Students(t1.getText(),t2.getText(),cbg.getSelectedCheckbox().getLabel(),r);


					
					StringBuffer s_2=new StringBuffer();
					s_2.append(students);
					s_2.append(p);
					try {
						FileWriter fw=new FileWriter("C:\\新建文件夹\\b.txt");
						fw.write(s_2.toString() + "\n");
						fw.close();
						} 
					catch (IOException n) 
						{
						n.printStackTrace();
						}
					
					
					if(e.getSource()==button1)
					ta1.append("\n");
			if(e.getSource()==button4){
				System.exit(0);
			}

			if(e.getSource()==button3)
				ta2.append("教师姓名："+t3.getText()+"\n"+
				"课程名称："+t4.getText()+"\n"+"上课地点："+t6.getText()
				+"\n"+"课程编号："+t5.getText()+"\n"+"课时："+b4.getSelectedItem()
				+"\n"+"学分："+b5.getSelectedItem()+"\n");
			if(e.getSource()==button3)
				ta2.append("\n");
				majorattribute = new Majorattribute(t4.getText(),t5.getText(),
						t6.getText(),t7.getText(),t8.getText());


		}
	public static void main(String args[]) throws NewException
	{
			
			Gui d =new Gui();
			
	}
	
}
