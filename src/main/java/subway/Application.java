package subway;

import subway.view.PreSetting;
import subway.view.ViewController;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ViewController.setPrepare();

        while (ViewController.hasNext()){
            ViewController.play();
        }
    }
}
