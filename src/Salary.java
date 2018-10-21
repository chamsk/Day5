/**
 * Created by Kor on 21.10.2018.
 */
public class Salary {
    private String from;
    private String to;
    private Integer salary;

    public Salary(String from, String to, Integer salary) {
        this.from = from;
        this.to = to;
        this.salary = salary;
    }



    public String getFrom(){
        return from;

    }
    public String getTo(){
        return to;
    }
    public Integer getSalary(){
        return salary;
    }

}
