package exercices;

public class excercice3 {
int x,y,z;

public excercice3() {
	
}
public excercice3(int xx,int yy,int zz) {
	this.x=xx;
	this.y=yy;
	this.z=zz;
}
public excercice3(int xx,int yy) {
	this.x=xx;
	this.y=yy;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		excercice3 a = new excercice3(1,1,1);
		excercice3 b = new excercice3(1,1,1);
		excercice3 c = new excercice3(1,1);
		excercice3 d = new excercice3(1,1);
		System.out.println(a.toString());
	}
	@Override
	public String toString() {
		return "Point X= "+x+ " Y= "+y+" Z= "+z;
	}
}
