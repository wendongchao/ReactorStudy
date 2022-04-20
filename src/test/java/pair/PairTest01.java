package pair;

import junit.framework.TestCase;
import org.apache.commons.lang3.tuple.Pair;

/**
 * 配对：key-value
 * 与map的不同：
 *      map是集合，pair是一对值（只能是一对值），List<Pair<>>和Map<>才是类似的东西
 * @ClassName PairTest01
 * @Author wendongchao
 * @Date 2022/4/20 15:25
 */
public class PairTest01 extends TestCase {

    public void test01() {
        System.out.println(Pair.of(1, "aa"));
    }
}
