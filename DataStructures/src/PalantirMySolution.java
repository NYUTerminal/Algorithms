import java.util.HashMap;
import java.util.List;

public class PalantirMySolution {

	public static void main(String[] args) {

	}

	private static void printBasinsInDecreasingOrder(int[][] input) {
		HashMap<LocationIndex, LandPiece> altitudeMap = new HashMap<LocationIndex, LandPiece>();
		// altitudeMap.put(key, value);
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				int altitude = input[i][j];
				LandPiece land = new LandPiece(altitude, false);
				if (isSink(input, new LocationIndex(i, j))) {
					land.isSink = true;
				}
				altitudeMap.put(new LocationIndex(i, j), land);
			}
		}

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (altitudeMap.get(new LocationIndex(i, j)).isSink) {

				}
			}
		}

	}

	private static boolean isSink(int[][] input, LocationIndex index) {
		int size = input.length;
		LocationIndex upper = new LocationIndex(index.x, index.y + 1);
		LocationIndex lower = new LocationIndex(index.x, index.y - 1);
		LocationIndex right = new LocationIndex(index.x + 1, index.y);
		LocationIndex left = new LocationIndex(index.x - 1, index.y + 1);
		if (isValidIndex(upper, size)
				&& input[index.x][index.y] > input[upper.x][upper.y]
				|| isValidIndex(lower, size)
				&& input[index.x][index.y] > input[lower.x][lower.y]
				|| isValidIndex(right, size)
				&& input[index.x][index.y] > input[right.x][right.y]
				|| isValidIndex(left, size)
				&& input[index.x][index.y] > input[left.x][left.y]) {
			return false;
		}

		return true;

	}

	private static boolean isValidIndex(LocationIndex index, int n) {
		return (index.x > 0 && index.y > 0 && index.x < n && index.y < n) ? true
				: false;
	}
}

class LocationIndex {
	public int x;
	public int y;

	public LocationIndex(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		if((LocationIndex)obj.	)
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}

class LandPiece {

	public int altitude;

	public List<LandPiece> basinsConnected;

	public boolean isSink;

	public LandPiece sinkNode;

	public LandPiece(int alt, boolean isSink) {
		// TODO Auto-generated constructor stub
		this.altitude = alt;
		this.isSink = isSink;
	}

}
