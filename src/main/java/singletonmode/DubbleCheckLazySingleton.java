package singletonmode;

/**
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
