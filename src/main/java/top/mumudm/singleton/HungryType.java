package top.mumudm.singleton;

/**
 * 饿汉式
 * 无论是否用到，类加载完成就会完成实例化。
 * 类加载到内存后，就会实例化一个对象，有 jvm 保证线程安全。
 * 这个写法简单使用，推荐使用！（有人就说了，这个如果不用就占内存了，但是如果你不用，你写它干啥呢😒😒😒）
 * @author mumu
 * @date 2020/3/15 23:26
 */
public class HungryType {
    private HungryType() {
    }

    private static final HungryType INSTANCE = new HungryType();

    public static HungryType getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        HungryType instance1 = HungryType.getInstance();
        HungryType instance2 = HungryType.getInstance();
        System.out.println(instance1 == instance2);
    }
}
