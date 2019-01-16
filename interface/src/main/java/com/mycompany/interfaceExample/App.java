package com.mycompany.interfaceExample;

import java.util.*;

public class App {
    public static void main(String[] args) {

        List<Thread> threadPool = new ArrayList<Thread>();

        FirstDependencyTask firstDependencyTask = new FirstDependencyTask();
        firstDependencyTask.start();
        threadPool.add(firstDependencyTask);

        SecondDependencyTask secondDependencyTask = new SecondDependencyTask();
        secondDependencyTask.start();
        threadPool.add(secondDependencyTask);

        for (Thread t : threadPool) {
            ((GetResult) t).GetResult();
        }
    }
}

interface GetResult {
    public void GetResult();
}

class FirstDependencyTask extends Thread implements GetResult {
    public void run() {
        System.out.println("Running firstDependencyTask");
    }

    public void GetResult() {
        System.out.println("my firstDependencyTask result");
    }
}

class SecondDependencyTask extends Thread implements GetResult {
    public void run() {
        System.out.println("Running secondDependencyTask");
    }

    public void GetResult() {
        System.out.println("my secondDependencyTask result");
    }
}
