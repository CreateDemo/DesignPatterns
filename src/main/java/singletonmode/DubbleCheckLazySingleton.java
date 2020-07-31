package singletonmode;

/**
 * @Description TODO
 * @ClassName DubbleCheckLazySingleton@Description TODO
 * @Author xiaofeng
 * @copyright Copyright (C) 2019 SHEIN, Inc. All right reserved. <br>
 * @company 南京领添科技有限公司
 * @Date 2020/7/30 15:38
 **/

/**
 * 双重检查
 */
public class DubbleCheckLazySingleton {
    //用volatile修饰
    private  static volatile DubbleCheckLazySingleton instance;
    private DubbleCheckLazySingleton(){

    }

    public static DubbleCheckLazySingleton getInstance(){
        if (instance == null){
            synchronized (DubbleCheckLazySingleton.class){
                if (instance==null){
                    return  new DubbleCheckLazySingleton();
                }
            }
        }
        return  instance;
    }
}
