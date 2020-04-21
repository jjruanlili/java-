package bishiti;
//子类与父类初始化过程 父类
public abstract class Father {
    static {
        System.out.println("father {}");
    }

    public Father(){
        System.out.println("father constructor");
    }
}
