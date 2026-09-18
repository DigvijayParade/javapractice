package stream_api;

@FunctionalInterface
public interface EmployeeProcessor {
    void process(Employees emp); 
}