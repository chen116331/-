package sss;

public class Majorattribute {
	
		String Num;
		String Name;
		String Place;
		String getPlace() {
		    return Place;
		  }
		String getNum() {
		    return Num;
		  }
		String getName() {
		    return Name;
		  }
		String Time;
		String getTime() {
		    return Time;
		  }
		String Score;
		String getScore() {
		    return Score;
		  }
		public Majorattribute(String name,String num,String place,String time,String score) {
			Name = name;
			Num = num;
			Place = place;
			Time = time;
			Score = score;
			}
		public void setNEW(String name,String num,String place,String time,String score){
			Name = name;
			Num = num;
			Place = place;
			Time = time;
			Score = score;
		}
		public String toString() {
		return"\n"+"     课程概述：" + Name
				+"\n"+ "     课程编号：" + Num +"\n"+ "     上课地点：" + Place+"\n" + "     课程时间：" + Time + "小时"+"\n" 
		+ "     课程学分：" +  Score + "分" ;
		}
	}

