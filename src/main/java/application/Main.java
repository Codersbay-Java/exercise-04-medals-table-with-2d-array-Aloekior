package application;

public class Main {

	public static void main(String[] args) {
		final int NUMB_OF_COUNTRIES = 8;
		final int NUMB_OF_MEDAlS = 3;
		String[] countries = {"Deutschland", "Vereinigte Staaten", "Österreich",
				"Russland","Kanada","Schweden","Südkorea","Schweiz"};
		int[][] medals = {{11, 12, 6}, {9, 9, 7}, {9, 7, 7}, {8, 6, 8},
				{7, 10, 7}, {7, 2, 5}, {6, 3, 2}, {5, 4, 5}};

		int[] medalSum = new int[countries.length];
		int countrySum;
		for (int i = 0; i < medals.length; i++) {
			countrySum = 0;
			for (int j = 0; j < medals[i].length; j++) {
				countrySum = countrySum + medals[i][j];
			}
			medalSum[i] = countrySum;
		}


		for (int i = 0; i < medals.length; i++) {
			System.out.println((i+1) + ". " + countries[i] + ": " + medals[i][0] + " " + medals[i][1] + " "
					+ medals[i][2] + "-> Medals in total: " + medalSum[i]);
		}

		int[] silverMedals=getAllSilverMedals(medals);

		for (int i = 0; i < silverMedals.length; i++) {
			System.out.println(countries[i] + " earned " + silverMedals[i] + " silver medals.");
		}

	}
	public static int[] getAllSilverMedals(int[][] medals) {
		int[] silverMedals = new int[medals.length];
		for (int i = 0; i < medals.length; i++) {
			silverMedals[i] = medals[i][1];
		}
		return silverMedals;
	}
}
