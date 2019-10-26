package com.erkuai.androiddesignpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.erkuai.androiddesignpattern.pattern10_command_pattern.ConcreteCommand;
import com.erkuai.androiddesignpattern.pattern10_command_pattern.Invoker;
import com.erkuai.androiddesignpattern.pattern10_command_pattern.Receiver;
import com.erkuai.androiddesignpattern.pattern11_Observer_pattern.Coder;
import com.erkuai.androiddesignpattern.pattern11_Observer_pattern.DevTechFrontier;
import com.erkuai.androiddesignpattern.pattern17_proxy_pattern.ProxySubject;
import com.erkuai.androiddesignpattern.pattern17_proxy_pattern.RealSubject;
import com.erkuai.androiddesignpattern.pattern18_composite_pattern.Composite;
import com.erkuai.androiddesignpattern.pattern18_composite_pattern.Leaf;
import com.erkuai.androiddesignpattern.pattern19_adapter_pattern.Volt220;
import com.erkuai.androiddesignpattern.pattern19_adapter_pattern.VoltAdapter;
import com.erkuai.androiddesignpattern.pattern19_adapter_pattern.VoltAdapter2;
import com.erkuai.androiddesignpattern.pattern1_singleton_pattern.Singleton;
import com.erkuai.androiddesignpattern.pattern20_decorator_pattern.ConcreteComponent;
import com.erkuai.androiddesignpattern.pattern20_decorator_pattern.ConcreteDecoratorA;
import com.erkuai.androiddesignpattern.pattern21_flyweight_pattern.Ticket;
import com.erkuai.androiddesignpattern.pattern21_flyweight_pattern.TicketFactory;
import com.erkuai.androiddesignpattern.pattern22_facade_pattern.MobilePhone;
import com.erkuai.androiddesignpattern.pattern23_bridge_pattern.LargeCoffee;
import com.erkuai.androiddesignpattern.pattern23_bridge_pattern.Ordinary;
import com.erkuai.androiddesignpattern.pattern23_bridge_pattern.SmallCoffee;
import com.erkuai.androiddesignpattern.pattern23_bridge_pattern.Sugar;
import com.erkuai.androiddesignpattern.pattern2_builder_pattern.Computer;
import com.erkuai.androiddesignpattern.pattern2_builder_pattern.Director;
import com.erkuai.androiddesignpattern.pattern2_builder_pattern.MacBookBuilder;
import com.erkuai.androiddesignpattern.pattern3_clone_pattern.WordDocument;
import com.erkuai.androiddesignpattern.pattern4_factory_pattern.ConcreteFactory;
import com.erkuai.androiddesignpattern.pattern4_factory_pattern.ConcreteFactory2;
import com.erkuai.androiddesignpattern.pattern4_factory_pattern.ConcreteProductA;
import com.erkuai.androiddesignpattern.pattern4_factory_pattern.Product;
import com.erkuai.androiddesignpattern.pattern5_abstract_factory_pattern.A1;
import com.erkuai.androiddesignpattern.pattern5_abstract_factory_pattern.A2;
import com.erkuai.androiddesignpattern.pattern5_abstract_factory_pattern.AbstractFactory;
import com.erkuai.androiddesignpattern.pattern5_abstract_factory_pattern.AbstractProductA;
import com.erkuai.androiddesignpattern.pattern5_abstract_factory_pattern.B1;
import com.erkuai.androiddesignpattern.pattern5_abstract_factory_pattern.B2;
import com.erkuai.androiddesignpattern.pattern5_abstract_factory_pattern.ConcreteFactory1;
import com.erkuai.androiddesignpattern.pattern6_strategy_pattern.BusStrategy;
import com.erkuai.androiddesignpattern.pattern6_strategy_pattern.SubwayStrategy;
import com.erkuai.androiddesignpattern.pattern6_strategy_pattern.TrafficCalculator;
import com.erkuai.androiddesignpattern.pattern7_state_pattern.TvController;
import com.erkuai.androiddesignpattern.pattern8_iterator_pattern.ConcreteHandler1;
import com.erkuai.androiddesignpattern.pattern8_iterator_pattern.ConcreteHandler2;
import com.erkuai.androiddesignpattern.pattern9_interpreter_pattern.Calculator;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "PATTERN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*************************** 1.单例模式 ***************************/
        Singleton singleton = Singleton.getSingleton();


        /*************************** 2.Builder模式 ***************************/
        MacBookBuilder builder = new MacBookBuilder();
        Director director = new Director(builder);
        director.construct("intel", "Retina");
        Computer computer = builder.create();


        /*************************** 3.原型模式 ***************************/
        //构建文档对象
        WordDocument document = new WordDocument();
        //编辑文档，添加图片等
        document.setText("这是一篇文档");
        document.addImage("图片1");
        document.addImage("图片2");
        document.addImage("图片3");
        document.showDocument();

        //以原始文档为原型，拷贝一份副本
        try {
            WordDocument clone = document.clone();
            clone.showDocument();

            //修改文档副本，不会影响原始文档
            clone.setText("这是修改过的DOC文档");
            clone.showDocument();


            document.showDocument();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        /*************************** 4.工厂方法模式 ***************************/
        ConcreteFactory factory = new ConcreteFactory();
        Product product = factory.createProduct();
        product.method();

        //通过反射方式：
        ConcreteFactory2 factory1 = new ConcreteFactory2();
        ConcreteProductA product1 = factory1.createProduct(ConcreteProductA.class);
        product1.method();


        /*************************** 5.抽象工厂模式 ***************************/
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        A1 a1 = concreteFactory1.createProductA();
        B1 b1 = concreteFactory1.createProductB();
        a1.method();
        b1.method();
        com.erkuai.androiddesignpattern.pattern5_abstract_factory_pattern.ConcreteFactory2 concreteFactory2
                = new com.erkuai.androiddesignpattern.pattern5_abstract_factory_pattern.ConcreteFactory2();
        A2 a2 = concreteFactory2.createProductA();
        B2 b2 = concreteFactory2.createProductB();
        a2.method();
        b2.method();


        /*************************** 6.策略模式 ***************************/
        TrafficCalculator calculator = new TrafficCalculator();
        //设置策略
        //calculator.setStrategy(new BusStrategy());
        calculator.setStrategy(new SubwayStrategy());
        int price = calculator.calculatePrice(10);
        Log.i(MainActivity.TAG + "-6", "price:" + price);


        /*************************** 7.状态模式 ***************************/
        TvController tvController = new TvController();
        tvController.powerOn();
        tvController.nextChannel();
        tvController.turnUp();
        tvController.powerOff();
        //此时不会生效
        tvController.turnDown();


        /*************************** 8.责任链模式 ***************************/
        //构建一个handler1
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        //构建一个handler2
        ConcreteHandler2 handler2 = new ConcreteHandler2();
        //设置handler1的下一个节点
        handler1.nextHandler = handler2;
        //设置handler2的下一个节点
        handler2.nextHandler = handler1;
        //处理请求
        handler1.handleRequest("for handler2");


        /*************************** 9.解释器模式 ***************************/
        Calculator calculator1 = new Calculator("1 + 11 + 1 - 10");
        int calculate = calculator1.calculate();
        Log.i(MainActivity.TAG + "-9", "结果：" + calculate);


        /*************************** 10.命令模式 ***************************/
        //构造一个接收者对象
        Receiver receiver = new Receiver();
        //根据接收者对象构造一个命令对象
        ConcreteCommand command = new ConcreteCommand(receiver);
        //根据具体的对象构造请求者对象
        Invoker invoker = new Invoker(command);
        //执行请求方法
        invoker.action();


        /*************************** 11.观察者模式 ***************************/
        //创建被观察者
        DevTechFrontier techFrontier = new DevTechFrontier();
        Coder coder = new Coder("Mr.Wu");
        Coder coder1 = new Coder("Mrs.Liu");
        Coder coder2 = new Coder("Mrs.Li");

        //观察者
        techFrontier.addObserver(coder);
        techFrontier.addObserver(coder1);
        techFrontier.addObserver(coder2);

        //发布消息
        techFrontier.postNewPublication("这是一条新消息。");


        /*************************** 12.备忘录模式 ***************************/
        /*************************** 13.迭代器模式 ***************************/
        /*************************** 14.模板方法模式 ***************************/
        /*************************** 15.访问者模式 ***************************/
        /*************************** 16.中介者模式 ***************************/

        /*************************** 17.代理模式 ***************************/
        //构造一个真实主题对象
        RealSubject realSubject = new RealSubject();
        //通过真实主题对象构造一个代理对象
        ProxySubject proxySubject = new ProxySubject(realSubject);
        //调用代理的相关方法
        proxySubject.visit();

        /*************************** 18.组合模式 ***************************/
        //构造一个根节点
        Composite root = new Composite("Root");
        //构造两个枝叶节点
        Composite branch1 = new Composite("branch1");
        Composite branch2 = new Composite("branch2");
        //构造两个叶子节点
        Leaf leaf1 = new Leaf("Leaf1");
        Leaf leaf2 = new Leaf("Leaf2");
        //将叶子节点添加至枝干节点中
        branch1.addChild(leaf1);
        branch2.addChild(leaf2);
        //将枝干节点添加至根节点中
        root.addChild(branch1);
        root.addChild(branch2);
        //执行方法
        root.doSomething();

        /*************************** 19.组合模式 ***************************/
        //类适配器模式
        VoltAdapter voltAdapter = new VoltAdapter();
        Log.i(TAG + "-19", "输出电压1：" + voltAdapter.getVolt5());
        //对象适配器模式
        VoltAdapter2 voltAdapter2 = new VoltAdapter2(new Volt220());
        Log.i(TAG + "-19", "输出电压2：" + voltAdapter2.getVolt220());

        /*************************** 20.装饰模式 ***************************/
        //构造被装饰的组件对象
        ConcreteComponent concreteComponent = new ConcreteComponent();
        //根据组件对象构造装饰者对象A并调用，此时相当于给组件对象增加装饰者A的功能方法
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(concreteComponent);
        concreteDecoratorA.operate();

        /*************************** 21.享元模式 ***************************/
        Ticket ticket = TicketFactory.getTicket("gz", "cd");
        ticket.showTicketInfo("zuo piao");
        Ticket ticket1 = TicketFactory.getTicket("bj", "sh");
        ticket1.showTicketInfo("zhan piao");
        Ticket ticket2 = TicketFactory.getTicket("xz", "xj");
        ticket2.showTicketInfo("wu piao");

        /*************************** 22.外观模式 ***************************/
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.takePhoto();
        mobilePhone.videoChat();

        /*************************** 23.桥接模式 ***************************/
        //原味
        Ordinary ordinary = new Ordinary();
        //准备糖类
        Sugar sugar = new Sugar();
        //大杯  原味
        LargeCoffee largeCoffee = new LargeCoffee(ordinary);
        largeCoffee.makeCoffee();
        //小杯  原味
        SmallCoffee smallCoffee = new SmallCoffee(ordinary);
        smallCoffee.makeCoffee();
        //大杯  加糖
        LargeCoffee largeCoffee1 = new LargeCoffee(sugar);
        largeCoffee1.makeCoffee();
        //小杯  加糖
        SmallCoffee smallCoffee1 = new SmallCoffee(sugar);
        smallCoffee1.makeCoffee();

    }
}
