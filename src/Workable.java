// Violation of Interface Segregation Principle (ISP)
public interface Workable {
    void work();
    void eat();
    void sleep();
    void attendMeeting();
}