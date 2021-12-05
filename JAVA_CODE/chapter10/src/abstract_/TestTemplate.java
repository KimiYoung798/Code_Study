package abstract_;

public class TestTemplate {
    public static void main(String[] args) {
        new AA().calculate();
        new BB().calculate();
    }
}
//模板
abstract class Template {
    public abstract void job();
    public void calculate() {

        //得到开始时间
        long star = System.currentTimeMillis();
        //执行时间
        job();
        //得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("执行时间" + (end - star));
    }
}

class AA extends Template{
    @Override
    public void job() {
        long sum = 0;
        for (long i = 1; i <= 800000; i++) {
            sum += i;
        }

    }
}

class BB extends Template{

    @Override
    public void job() {
        long sum = 0;
        for (long i = 1; i <= 800000; i++) {
            sum *= i;
        }
    }

}