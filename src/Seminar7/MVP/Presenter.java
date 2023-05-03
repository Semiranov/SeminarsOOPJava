package Seminar7.MVP;

import Seminar7.Input.ConsoleInput;
import Seminar7.Functions.Sum;

public class Presenter {
    public static void startApp(){
        Model sum = new Model(new Sum(), new PrintToConsole(), new ConsoleInput());
        sum.startCalculating();
    }
}
