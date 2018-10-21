import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Created by Kor on 19.10.2018.
 */
class MailService<T> implements Consumer<Object> {
    Map<String,List<Object>> mapMassage = new HashMap<>();
    Map<String,List<Object>> mapSalary = new HashMap<>();
    MailMessage massage;
    Salary salary;
    Boolean isMassage = false;




    @Override
    public void accept(Object o) {

        if(o instanceof MailMessage) {
            List<Object> temp = new ArrayList<>();
            isMassage = true;
            String key = ((MailMessage) o).getTo();
            String value = ((MailMessage) o).getContent();
            massage = (MailMessage) o;
            if (mapMassage.containsKey(key)) {
                temp = mapMassage.get(key);
                temp.add(value);
                mapMassage.put(key, temp);
                temp = null;
            } else {
                temp.add(value);
                mapMassage.put(key, temp);
                temp = null;
            }
        }
        if(o instanceof Salary){
            List<Object> temp1 = new ArrayList<>();
            isMassage = false;
            String key = ((Salary) o).getTo();
            Integer value = ((Salary) o).getSalary();
            salary = (Salary) o;
            if (mapSalary.containsKey(key)) {
                temp1 = mapSalary.get(key);
                temp1.add(value);
                mapSalary.put(key, temp1);
                temp1 = null;
            } else {
                temp1.add(value);
                mapSalary.put(key, temp1);
                temp1 = null;
            }
        }

    }

    public Map<String, List<Object>> getMailBox() {
        if(isMassage)
        return mapMassage;
        else return mapSalary;
    }


}
