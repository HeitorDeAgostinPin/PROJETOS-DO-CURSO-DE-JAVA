
public class FoeEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leitura: "para cada objeto 'obj' contido em vect, faça:"
		String[] vect = new String[] { "Maria", "Bob", "Alex" };
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		for (String obj : vect) {
			System.out.println(obj);
		}

	}

}
