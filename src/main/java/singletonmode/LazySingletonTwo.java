package singletonmode;

/**
 * @Description TODO
 * @ClassName LazySingletonTwo@Description TODO
 * @Author xiaofeng
 * @copyright Copyright (C) 2019 SHEIN, Inc. All right reserved. <br>
 * @company 南京领添科技有限公司
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
