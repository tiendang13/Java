package stringBuilderDemo;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println("StringBuilder ban dau: " + sb.toString());
		sb.append("Hello");
		System.out.println("StringBuilder append: " + sb.toString());
		sb.insert(1, "Java");
		System.out.println("StringBuilder insert: " + sb.toString());
		sb.delete(1, 5);
		System.out.println("StringBuilder delete: " + sb.toString());
		sb.reverse();
		System.out.println("StringBuilder reverse: " + sb.toString());
	}

}
