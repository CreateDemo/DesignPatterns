package dynamicproxymode;

/**
 * @Date 2020/7/31 11:34
 **/
public class UserInterfaceImpl implements UserInterface {

    @Override
    public boolean saveUser(String user) {
        System.out.println("保存用户: " + user);
        return false;
    }
}
