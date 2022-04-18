package stream;

import junit.framework.TestCase;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

/**
 * @author wendongchao
 * @ClassName StreamTest01
 * @Date 2022/4/18 10:29
 */
public class StreamTest01 extends TestCase {

    /*
    Function.identity()：返回一个始终返回其输入参数的函数。作用相当于：tt -> tt
    stream 双下划线：相当于key，映射value，key -> value，一对一映射
     */
    public void test01() {
        List<String> memberList = new ArrayList<>();
        memberList.add("1");
        memberList.add("2");
        memberList.add("3");
        memberList.add("4");

        Set<String> missDimNameSets = new HashSet<>();
        missDimNameSets.add("a");
        missDimNameSets.add("b");
        missDimNameSets.add("c");

        mergeDimParamMap(memberList,missDimNameSets);
    }

    public Map<String, String> mergeDimParamMap(List<String> memberList, Set<String> missDimNameSets) {
        Iterator<String> iterator = memberList.iterator();
        Map<String, String> collect = missDimNameSets.stream().collect(toMap(Function.identity(), __ -> iterator.next()));
        return collect;
    }
}
