package lollipop;

/**
 * 统计字符的一个工具类
 * @author super lollipop
 * @version  2019/10/6
 */
public final class Util {
    /**
     * 统计某个字符串某个字符出现次数的函数
     * @param string 某个字符串
     * @param character 某个字符串
     * @return int 数字
    * */
    public static int countCharacter(String string,char character){
        char[] chars = string.toCharArray();
        int count = 0;
        for (char c:chars){
            if (c == character){
                count = count + 1;
            }
        }
        return count;
    }
}
