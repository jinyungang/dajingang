package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author JinYunGang
 * @date 2018/11/19 17:28
 */
public class ListDeduplication {

    //我们大家都知道，set集合的特点就是没有重复的元素。如果集合中的数据类型是基本数据类型，
    // 可以直接将list集合转换成set，就会自动去除重复的元素
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(11);
        System.out.println(list);

        Set set = new HashSet();
        List newList = new ArrayList();
        set.addAll(list);
        newList.add(set);
        System.out.println(newList);
    }
}
