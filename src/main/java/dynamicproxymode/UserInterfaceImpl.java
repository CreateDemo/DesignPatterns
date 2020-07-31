package dynamicproxymode;

/**
 * @Description TODO
 * @ClassName UserInterfaceImpl@Description TODO
 * @Author xiaofeng
 * @copyright Copyright (C) 2019 SHEIN, Inc. All right reserved. <br>
 * @company 南京领添科技有限公司
 * @Date 2020/7/31 11:34
 **/
public class UserInterfaceImpl implements UserInterface {

    @Override
    public boolean saveUser(String user) {
        System.out.println("保存用户: " + user);
        return false;
    }
}
