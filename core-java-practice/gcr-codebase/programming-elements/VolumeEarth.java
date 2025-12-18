public class VolumeEarth{
	public static void main(String[] args){
		double raK = 6378;
		double raM = 6378/1.6;
		double VolK = (4/3)*3.14*raK*raK*raK;
		double VolM = (VolK)/(1.6*1.6*1.6);
		System.out.print("The volume of the Earth in KM^3 is "+VolK+" and in Miles^3 is "+VolM);
	}
}
