/**
 * Created by zhoumao on 2017/4/20.
 * 查找子字符串
 */
public class SearchStr {

    private static int searchStr(String key, String str) {
        if (key == null || str == null) return -1;
        byte[] arrKey = key.getBytes();
        byte[] arrStr = str.getBytes();
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrKey.length; j++) {
                if (arrKey[j] != arrStr[i + j]) {
                    break;
                }
                if (j == arrKey.length - 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String arg[]) {
        System.out.println("位置在： " + searchStr("h1", "this h1"));
    }
}
