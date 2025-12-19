public class VolumeEarth{
	public static void main(String[] args){
		double RadiusInKM = 6378;
		double RadiusInMiles = 6378/1.6;
		double VolumeInKM = (4/3)*3.14*RadiusInKM*RadiusInKM*RadiusInKM;
		double VolumeInMiles = (VolumeInKM)/(1.6*1.6*1.6);
		System.out.print("The volume of the Earth in KM^3 is "+VolumeInKM+" and in Miles^3 is "+VolumeInMiles);
	}
}
