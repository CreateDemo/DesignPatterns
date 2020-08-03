package decoratormode;

/**
 * @Description TODO
 * @ClassName MainApplication@Description TODO
 * @Author xiaofeng
 * @copyright Copyright (C) 2019 SHEIN, Inc. All right reserved. <br>
 * @company 南京领添科技有限公司
 * @Date 2020/7/31 16:10
 **/
public class MainApplication {
    public static void main(String[] args) {
        ABattercake aBattercake =null;
        aBattercake = new Battercake();
        aBattercake =new EggDecorator(aBattercake);
        aBattercake =new EggDecorator(aBattercake);
        aBattercake=new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc()+" 销售价格:"+aBattercake.cost());
    }
}
