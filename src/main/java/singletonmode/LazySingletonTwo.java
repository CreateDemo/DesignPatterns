package singletonmode;

/**
 * @Date 2020/7/30 15:43
 **/

/**
 * 静态内部类
 */
public class LazySingletonTwo {
    private LazySingletonTwo(){

    }
    private static  class  Singleton {
        private static  final LazySingletonTwo instance = new  LazySingletonTwo();
    }
    public static LazySingletonTwo getInstance(){
        return  Singleton.instance;
    }
}
