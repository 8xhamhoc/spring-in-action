package com.springinaction.knights;

import java.io.PrintStream;

public class Minstrel {

    private PrintStream printStream;

    public Minstrel(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void singBeforeQuest() {
        printStream.println("Fa la la. Sing before Quest");
    }

    public void singAfterQuest() {
        printStream.print("La La La. Sing after Quest");
    }

}
