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
	return "ѧ����Ϣ:  ������" + Name
    + "    ѧ�ţ�" + Num + "   �Ա�" + Sex + "   " + a;
	}
	public void setName(String name){
		Name = name;
	}
//�Զ���set�����������޸����ֵķ���
	public void setCourse(Majorattribute b){
		a = b;
	}

	

}