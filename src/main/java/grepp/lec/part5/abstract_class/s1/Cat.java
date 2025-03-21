package grepp.lec.part5.abstract_class.s1;

public class Cat extends Animal {

    private int age;

    public Cat(String name) {
        super(name);
        this.age = 1;
    }

    public void sayAge() {
        System.out.printf("저는 %d살 입니다!\n", age);
    }

    public void play(String toy) {
        System.out.printf("%s이(가) %s을(를) 가지고 놉니다!", name, toy);
    }

    @Override
    public void eat() {
        System.out.println("생선을 먹습니다!");
    }

    @Override
    public void sleep() {
        System.out.println("가볍게 낮잠을 잡니다!");
    }

//    @Override
//    public void drink() {
//        System.out.println("물을 마십니다.");
//    }

    @Override
    public void hide(String place) {
        System.out.printf("%s가 %s에 숨었습니다!", name, place);
    }
}
