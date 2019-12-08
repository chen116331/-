一、实验目的
1、分析学生选课系统，通过字符串的形式读出文件中的数据。
2、使用GUI及其窗体设计组件同时完善输入输出的功能。
3、完成学生选课过程业务逻辑编程。
4、基于文件保存并读取数据，新建文本文件并在GUI中展现文本文件的数据。
5、建立异常类，处理空字符出现的异常等。
二、实验要求
1、内容：设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。 2、基于事件模型对业务逻辑编程，实现在界面上支持上述操作。 3、针对操作过程中可能会出现的各种异常，做异常处理 4、基于输入/输出编程，支持学生、课程、教师等数据的读写操作。 5、基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。
三、实验过程
以上次实验GUI代码为基础，新建NewException类用于处理文本空字符异常。在Gui类中将需要的文本读取和写入代码加入其中，通过文本读取的方法，转化为字符串，按顺序写入Majorattribute类的实例化中，在Gui类执行时调用，用以替代在代码内实例化的操作。监听确定按钮，单机按钮将在文本框显示GUI数据的实例化，同时将字符串写入文件中。
四、流程图
https://github.com/chen116331/-/blob/master/1575791492(1).png
五、核心代码和注释
JLabel label1;JLabel label2;JLabel label3;JLabel label4,label5;JLabel label6;//定义标签
JButton button1,button2;//定义按钮
TextArea ta1,ta2;//定义显示框
JTextField t1,t2,t3,t4,t5,t6,t7,t8;//定义单行可输入框
	CheckboxGroup cbg;//定义可选择组
	JComboBox b1;JComboBox b2;JComboBox b3;JComboBox b4;JComboBox b5;//定义下拉框
	JCheckBox c1,c2,c3;//定义可选择项目
	String time[]={"36","48","72"
			};
	String score[]={"1.0","1.5","2.0","2.5"
			};//将学时和学分实例化
super("北京石油化工学院教务在线");//设置GUI的标题
		label1=new JLabel("请输入个人信息和所选课程"
				+ "。                                     ");//选择流式布局需要用大量的空格进行辅助排版，且调用JLabel方法进行实例化
cbg = new CheckboxGroup();//设置选择组
b1=new JComboBox(year);//调用JComboBox方法对下拉框进行实例化
	c1=new JCheckBox("Python");//对选择项目实例化
setBounds(600,300,625,600);//设置窗口大小
		try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e){}//开始对窗口进行排版
c.setLayout(new FlowLayout(FlowLayout.LEFT));//选择流式布局
c.add(new Checkbox("男", cbg, true)); //调用Checkbox方法对选择项目进行实例化
button1.addActionListener(this);//对按钮1进行监听
Majorattribute p = null;
	    	Majorattribute q = null;
	    	Majorattribute r = null;
	    	Students students = null;
	    	Majorattribute majorattribute = null;
if(e.getSource()==button1)
				ta1.append("姓名："+t1.getText()+"\n"+
				"学号："+t2.getText()+"\n"+"性别："
				+cbg.getSelectedCheckbox().getLabel()+
				"\n"+"生日："+b1.getSelectedItem()+b2.getSelectedItem()
				+b3.getSelectedItem()+"\n");//选择按钮1后对显示的内容进行录入
if(c1.isSelected() && e.getSource()==button1)
					ta1.append( "课程：" + c1.getLabel()+" "+p.toString()+"\n");
					students = new Students(t1.getText(),t2.getText(),cbg.getSelectedCheckbox().getLabel(),p);//若同时选择了c1选择项和按钮1则在显示框中体现如下内容，同时调用Students方法将信息录入
				if(c2.isSelected() && e.getSource()==button1)
if(e.getSource()==button3)
				ta2.append("教师姓名："+t3.getText()+"\n"+
				"课程名称："+t4.getText()+"\n"+"上课地点："+t6.getText()
				+"\n"+"课程编号："+t5.getText()+"\n"+"课时："+b4.getSelectedItem()
				+"\n"+"学分："+b5.getSelectedItem()+"\n");
			
				majorattribute = new Majorattribute(t4.getText(),t5.getText(),
						t6.getText(),t7.getText(),t8.getText());//同理于上一步，判断选择按钮3后调用Majorattribute方法将教师信息录入。
public class NewException extends Exception{
	public NewException(){
 	}
	public NewException(String str){ 
            super(str);
 	}
}
//设置NewException类，用于排除文本内空字符
File file=new File("C:\\Users\\18301\\Desktop\\课程信息.txt");
		    try {
		        FileInputStream in=new FileInputStream(file);
		        // size  为字串的长度 ，这里一次性读完
		        int size=in.available();
		        byte[] buffer=new byte[size];
		        in.read(buffer);
		        in.close();
		        str=new String(buffer,"GB2312");
		    } catch (IOException e1) {
		        
		        e1.printStackTrace();
		    }
		    //打开文件，读取信息，同时排除文本空字符异常
        StringBuffer s_2=new StringBuffer();
					s_2.append(students);
					s_2.append(p);
					try {
						FileWriter fw=new FileWriter("C:\\Users\\18301\\Desktop\\test.txt");
						fw.write(s_2.toString() + "\n");
						fw.close();
						} 
					catch (IOException n) 
						{
						n.printStackTrace();
						}
六、运行截图

https://github.com/chen116331/-/blob/master/1575792843(1).png
https://github.com/chen116331/-/blob/master/1575793134(1).png

