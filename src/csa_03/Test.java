package csa_03;

public class Test {
    public static void main(String[] args) {
        UseCompute useCompute = new UseCompute();
        Compute add = new add();
        Compute subtract = new sub();
        Compute multiply = new product();
        Compute divide = new divide();

        // 加法
        useCompute.useCom(add, 5, 3);
        // 减法
        useCompute.useCom(subtract, 5, 3);
        // 乘法
        useCompute.useCom(multiply, 5, 3);
        // 除法
        useCompute.useCom(divide, 6, 3);
    }
    static class add implements Compute{
        @Override
        public int computer(int n, int m) {
            return n+m;
        }
    }
    static class sub  implements Compute{
        @Override
        public int computer(int n, int m) {
            return Math.abs(n-m);
        }
    }
    static class product implements Compute{
        @Override
        public int computer(int n, int m) {
            return n*m;
        }
    }
    static class divide implements Compute{
        @Override
        public int computer(int n, int m) {
            return n/m;
        }
    }
    static class UseCompute{
        public void useCom(Compute compute, int one,int two){
            System.out.println(compute.computer(one, two));
        }
    }
}
