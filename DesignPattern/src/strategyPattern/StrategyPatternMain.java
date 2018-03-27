package strategyPattern;

public class StrategyPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context(new OperationAdd());
		System.out.println("5 + 6 = " + context.executeStrategy(5, 6));
		
		context = new Context(new OperationSubstract());
		System.out.println("10 - 8 = " + context.executeStrategy(10, 8));
		
		context = new Context(new OperationMultiply());
		System.out.println("5 * 4 = " + context.executeStrategy(5, 4));
	}
}
