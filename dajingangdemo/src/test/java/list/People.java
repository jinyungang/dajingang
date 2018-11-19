package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author JinYunGang
 * @date 2018/11/19 17:54
 */
public class People {
    private String name;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public People setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public People setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public People(String name, String phoneNumber) {
        super();
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "People{" + "name='" + name +
                "phoneNumber='" + phoneNumber + '\'' + '}';
    }

    @Override
    public boolean equals(Object arg0) {
        People people = (People) arg0;
        return name.equals(people.name) && phoneNumber.equals(people.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        String str = name + phoneNumber;
        return str.hashCode();
    }


    public static void main(String[] args) {
        List<People> listPeople = new ArrayList<People>();
        listPeople.add(new People("张三", "1111"));
        listPeople.add(new People("李四", "2222"));
        listPeople.add(new People("张三", "2222"));
        listPeople.add(new People("李四", "1111"));
        listPeople.add(new People("张三", "1111"));
        Set<People> setData = new HashSet<People>();
        setData.addAll(listPeople);
        System.out.println("list:" + listPeople.toString());
        System.out.println("set:" + setData.toString());

    }
}
