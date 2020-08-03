package dynamicproxymode;

/**
 * @Date 2020/7/31 11:42
 **/
public class MainApplication {
    public static void main(String[] args) {
        UserProxy user =new UserProxy(new UserInterfaceImpl());
        UserInterface instance = (UserInterface) user.getInstance();
        instance.saveUser("廖云锋");
    }
}
