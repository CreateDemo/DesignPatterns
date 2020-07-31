package dynamicproxymode;

/**
 * @Description TODO
 * @ClassName MainApplication@Description TODO
 * @Author xiaofeng
 * @copyright Copyright (C) 2019 SHEIN, Inc. All right reserved. <br>
 * @company 南京领添科技有限公司
 * @Date 2020/7/31 11:42
 **/
public class MainApplication {
    public static void main(String[] args) {
        UserProxy user =new UserProxy(new UserInterfaceImpl());
        UserInterface instance = (UserInterface) user.getInstance();
        instance.saveUser("廖云锋");
    }
}
