public class InnerExercise {
    public static void main(String[] args) {
        Cellphone cp = new Cellphone();
        cp.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        cp.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}

interface Bell {
    public void ring();
}

class Cellphone {

    public void alarmClock(Bell bell) {
        bell.ring();
    }
}
