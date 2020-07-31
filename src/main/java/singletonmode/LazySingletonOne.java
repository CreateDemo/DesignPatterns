package singletonmode;

/**
 * @Description TODO
 * @ClassName LazySingleton@Description TODO
 * @Author xiaofeng
 * @copyright Copyright (C) 2019 SHEIN, Inc. All right reserved. <br>
 * @company 南京领添科技有限公司
 * @Date 2020/7/30 15:25
 **/

/**
 *  懒汉式
 */
public class LazySingletonOne {
    private   static LazySingletonOne instance= null;
    private LazySingletonOne(){}    //private 避免类在外部被实例化
    //效率不高
    private  synchronized  static LazySingletonOne getInstance(){
        if(instance!=null){
         return instance;
        }
        return  new LazySingletonOne();
    }
}
