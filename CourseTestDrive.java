import java.util.*;
public class CourseTestDrive {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Course[] courses=new Course[3];
			courses [0]=new Course("hsilgne",2.5,60,false);
			courses [1]=new Course("Military training",2,60,false);
			courses [2]=new Course("youshakeya",2,60,true);
			Course.getGpa(courses);
			
		}
	}
class Course {
	private  String name;
	private double credit;
	private static double gradePoint=0;
	private int score;
	private boolean schoolElect;
	static double sumofcredit=0;
	static double sigma=0;//����
	/*public static void main(String[] args) {//���Է����Ƿ���ȷ
		// TODO Auto-generated method stub
		System.out.println("����������Ŀγ��������س�");
		//Course s=new Course(null,0,0,false);
		Scanner g=new Scanner(System.in);
		System.out.println("�������������֡�ѧ�֡��ɼ����Ƿ�Уѡ��");
		int n=0;
		int i=g.nextInt();
		Course[] item=new Course[i];
		String aname;double ucredit;int uscore;boolean theschoolElect;
		for(;n<i;n++) {
		//ʵ�ڲ�֪����ôŪsetter����Ū���м��������Ȼ�о����ԲУ�ϣ��dalao��������
		aname=g.next();ucredit=g.nextDouble();uscore=g.nextInt();theschoolElect=g.nextBoolean();	
		item[n]=new Course(aname,ucredit,uscore,theschoolElect);
		item[n].setname(aname);
		item[n].setcredit(ucredit);
		item[n].setscore(uscore);
		item[n].setschoolElect(theschoolElect);
		System.out.println(item[n].getname()+" "+item[n].getcredit()+" "+item[n].getscore()+" "+item[n].getschoolElect());
		//���������Ƿ�����
		}
		g.close();
		Course.getGpa(null);//����Course[] coursesҪ��ô���أ�������д��ȫ����ȥ����
		//�����Ҫͨ��ȡ�����ݣ�ÿȡ��һ������newһ�����������Ȼ��ִ��һ�鹹�췽��������ӡ�ͺ���
	}*/
//setter�Ǻ�getter��
void setname(String aname) {
	name=aname;
}
String getname() {
	return name;
}
void setcredit(double ucredit) {
	credit=ucredit;
}
double getcredit() {
	return credit;
}
void setscore(int uscore) {
	score=uscore;
}
int getscore() {
	return score;
}
void setschoolElect(boolean theschoolElect){
	schoolElect=theschoolElect;
}
boolean getschoolElect() {
	return schoolElect;
}
double getgradePoint(){
	return gradePoint;
}
public Course(String name,double credit,int score,boolean schoolElect) {
	this.name=name;
	this.credit=credit;
	this.score=score;
	this.schoolElect=schoolElect;
	if(schoolElect==false) {//�ж��Ƿ�Уѡ��
	if(score<60) {//���㼨��
		gradePoint=0;
	}
	else if(score>=60&&score<=61)
		gradePoint=1.3;
	else if(score>=62&&score<=65)
		gradePoint=1.7;
	else if(score>=66&&score<=70)
		gradePoint=2.0;
	else if(score>=71&&score<=74)
		gradePoint=2.3;
	else if(score>=75&&score<=77)
		gradePoint=2.7;
	else if(score>=78&&score<=81)
		gradePoint=3;
	else if(score>=82&&score<=84)
		gradePoint=3.3;
	else if(score>=85&&score<=89)
		gradePoint=3.7;
	else
		gradePoint=4;

	//sumofcredit=sumofcredit+credit;//��ȡ����Gpa�����ֵ
	//sigma=sigma+credit*gradePoint;
	//System.out.println(sumofcredit+" "+sigma);//������
	}
}
public static void getGpa(Course[] courses) {
	double Gpa=0;
	for(int i=0;i<courses.length;i++) {
		System.out.println(courses[i].getcredit());
		sumofcredit+=courses[i].getcredit();
		sigma=sigma+courses[i].getcredit()*gradePoint;
	}
	
		
	
	Gpa=sigma/sumofcredit;
	System.out.println(Gpa);
}
}//Course ����


