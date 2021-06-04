package project;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParkingSpace ps = new ParkingSpace();
		NumberComparator nc = new NumberComparator();
		AreaComparator ac = new AreaComparator();
		UserNameComparator uc = new UserNameComparator();

		ParkingSpace[] list = new ParkingSpace[5];
		for (int i = 0; i < 5; i++) {
			list[i] = new ParkingSpace();
			list[i].setNumber(i + 1);
		}
		MergeSort.mergeSort(list, nc);
        System.out.println(list);
	}

}
