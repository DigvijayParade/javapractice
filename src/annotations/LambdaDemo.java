package annotations;

@FunctionalInterface
public interface LambdaDemo {

	int m1(int a ,int b);
	LambdaDemo multi = (int a , int b) ->  a * b ;
	
}
