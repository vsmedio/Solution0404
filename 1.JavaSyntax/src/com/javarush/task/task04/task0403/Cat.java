package com.javarush.task.task04.task0403;

/* 

Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной private String name равное переданному параметру String name.


Требования:
1. Класс Cat должен содержать только одну переменную name.
2. Переменная name должна иметь модификатор доступа private и тип String.
3. Класс Cat должен содержать только два метода setName и main.
4. Метод setName класса Cat должен устанавливать значение переменной private String name равным переданному параметру String name.

//Latviski:

Ieviest setName metodi, lai tā varētu iestatīt privātā String nosaukuma mainīgā vērtību uz nodoto parametru String name.


Prasības:
1. Cat klasei ir jābūt tikai vienam mainīgajam nosaukumam.
2. Mainīgo nosaukumam ir jābūt privātam piekļuves modificētājam un String tipam.
3. Cat klases sastāvā ir tikai divas metodes, setName un galvenā.
4. Cat klases class setName metodei jānosaka privātā String nosaukuma mainīgā vērtība nodotajam parametram String name.
*/

public class Cat {
    private String name;

    public void setName(String name) {
        //напишите тут ваш код
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
