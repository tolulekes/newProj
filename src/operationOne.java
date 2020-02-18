public class operationOne implements operation {
    @Override
    public int sum(int n1, int n2) {
        return n1+n2;
    }

    @Override
    public int sub(int n1, int n2) {
        return n1-n2;
    }

    @Override
    public double mul(int n1, int n2) {
        return n1*n2;
    }

    @Override
    public double div(int n1, int n2) {
        return n1/n2;
    }
}
