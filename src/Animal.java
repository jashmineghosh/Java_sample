public class Animal {

        void eat(){System.out.println("animal is eating...");}
//    void display() {
//        System.out.println("something");
//    }
    }

    class Dog extends Animal{
        void eat(){
            super.eat();
            System.out.println("dog is eating...");}

        void display() {
            System.out.println("something");
        }
        public static void main(String args[]){
            Dog b=new Dog();
            Animal a=new Dog();
            a.eat();
            ((Dog) a).display();
        }
    }


