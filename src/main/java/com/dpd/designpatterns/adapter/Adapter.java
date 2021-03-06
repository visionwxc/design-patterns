package com.dpd.designpatterns.adapter;

/**
 * 适配器模式 ： 类适配器，对象适配器，接口适配器
 */
public class Adapter {
    /**
     *
     * 适配器模式应用场景
     *
     * 类适配器与对象适配器的使用场景一致，仅仅是实现手段稍有区别，二者主要用于如下场景：
     *
     * 　　（1）想要使用一个已经存在的类，但是它却不符合现有的接口规范，导致无法直接去访问，这时创建一个适配器就能间接去访问这个类中的方法。
     *
     * 　　（2）我们有一个类，想将其设计为可重用的类（可被多处访问），我们可以创建适配器来将这个类来适配其他没有提供合适接口的类。
     *
     * 　　以上两个场景其实就是从两个角度来描述一类问题，那就是要访问的方法不在合适的接口里，一个从接口出发（被访问），一个从访问出发（主动访问）。
     *
     * 接口适配器使用场景：
     *
     * 　　（1）想要使用接口中的某个或某些方法，但是接口中有太多方法，我们要使用时必须实现接口并实现其中的所有方法，可以使用抽象类来实现接口，并不对方法进行实现（仅置空），然后我们再继承这个抽象类来通过重写想用的方法的方式来实现。这个抽象类就是适配器。
     *
     * 类适配模式
     *  public interface Ps2 {
     *    void isPs2();
     * }
     * public interface Usb {
     *     void isUsb();
     *  }
     *
     *  public class Usber implements Usb {
     *
     *     @Override
     *     public void isUsb() {
     *          System.out.println("USB口");
     *      }
     *
     *  }
     *  public class Adapter extends Usber implements Ps2 {
     *
     *      @Override
     *      public void isPs2() {
     *          isUsb();
     *      }
     *
     *  }
     *
     *  对象适配模式
     *   public interface Ps2 {
     *      void isPs2();
     *  }
     *  public interface Usb {
     *      void isUsb();
     *  }
     *  public class Usber implements Usb {
     *
     *      @Override
     *      public void isUsb() {
     *          System.out.println("USB口");
     *      }
     *
     *  }
     *  public class Adapter implements Ps2 {
     *
     *       private Usb usb;
     *       public Adapter(Usb usb){
     *           this.usb = usb;
     *       }
     *       @Override
     *       public void isPs2() {
     *           usb.isUsb();
     *      }
     *
     *  }
     *  接口适配模式
     *  public interface A {
     *      void a();
     *      void b();
     *      void c();
     *      void d();
     *      void e();
     *      void f();
     *  }
     * public abstract class Adapter implements A {
     *      public void a(){}
     *      public void b(){}
     *      public void c(){}
     *      public void d(){}
     *      public void e(){}
     *      public void f(){}
     *  }
     * public class Ashili extends Adapter {
     *      public void a(){
     *          System.out.println("实现A方法被调用");
     *      }
     *      public void d(){
     *          System.out.println("实现d方法被调用");
     *      }
     *  }
     */
}
