package Lessons.Lesson9;

public class Girl {
      public String name;
      public int age;

    public Girl(String name, int age) {

        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void goToCinema() {
        System.out.println("Go");
    }

    public String goToRest(String rest) {//передаем название в виде названия ресторана он проверяет и возвращает результат после функции
        if ("Mac".equals(rest)) {
            return "No";
        } else {
            return "Yes";
        }

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("goodbye");

    }
}
