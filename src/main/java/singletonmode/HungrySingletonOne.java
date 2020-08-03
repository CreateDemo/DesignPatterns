package singletonmode;

/**
 * @Date 2020/7/30 15:35
 **/

/**
 * 饿汗式
 */
public class HungrySingletonOne {
    private  static  HungrySingletonOne instance = new HungrySingletonOne();
     private HungrySingletonOne(){

     }
     public static HungrySingletonOne getInstance(){
         return  instance;
     }
}
