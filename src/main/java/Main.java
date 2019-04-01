import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> opa = new ArrayList<Integer>(Arrays.asList(0, -1, 108, 150, 151, 153, 409, 427, 449, 464, 475, 494, 525, 538, 548, 558, 583, 115, 153, 223, 256, 291, 294, 314, 355, 366, 369, 385, 405, 414, 513, 514, 119, 135, 146, 215));
		
		InsertionSort d = new InsertionSort(opa);
		d.getListaOrdenada();

		for(int x : opa) {
			System.out.println(x);
		}
	}

}
