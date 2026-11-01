package lambdas;

@FunctionalInterface
public interface BonusCalculator {

	public double calculate(double baseSalary, double performanceRating);
}
