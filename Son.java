//子类与父类初始化过程 子类
public class Son extends Father {
    static {
        System.out.println("son{}");
    }

    public Son(){
        System.out.println("son constructor");
    }


    public static void main(String[] args) {
        Son s1 = new Son();
        //输出:
//        father {}
//        son{}
//        father constructor
//        son constructor
        //如果把 father {}的static去掉会有不一样的结果,好奇的请自己尝试
    }
}
