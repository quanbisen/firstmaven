package lollipop;

import junit.framework.Assert;
import org.junit.Test;

/**
 * 测试Util工具类的测试类
 * @author super lollipop
 * @version  2019/10/6
 */
public class UtilTest {

    /**
     * 单元测试，对Util的countCharacter进行测试*/
    @Test
    public void testCountCharacter(){
        String string= "计科164-09-lollipop";
        char character = '-';
        int countExpect = 2;
        int count = Util.countCharacter(string,character);
        Assert.assertEquals(countExpect,count);
    }
}
