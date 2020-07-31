package singletonmode;

/**
 * @Description TODO
 * @ClassName HungrySingletonOne@Description TODO
 * @Author xiaofeng
 * @copyright Copyright (C) 2019 SHEIN, Inc. All right reserved. <br>
 * @company 南京领添科技有限公司
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
