package sss;

public class Students extends Father{

	Majorattribute a ;
	Majorattribute major;
	public Students(String name,String num,String sex,Majorattribute a) {
		Name = name;
		Num = num;
		Sex = sex;
		major = a;

		}

	public String toString() {
	return "学生信息:  姓名：" + Name
    + "    学号：" + Num + "   性别：" + Sex + "   " + a;
	}
	public void setName(String name){
		Name = name;
	}
//自定义set函数，设置修改名字的方法
	public void setCourse(Majorattribute b){
		a = b;
	}

	

}