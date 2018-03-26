package iteratorPattern;

public class IteratorPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRepository nameRepository = new NameRepository();
		for(Iterator iterator = nameRepository.getIterator(); iterator.hasNext();){
			String name = (String)iterator.next();
			System.out.println("Name: " + name);
		}
	}

}
