package com.company;

public class MyLLAnalyzer {
    public static void analyze(String command) {
        int i = 1;
        while (true) {
            String tmp = command;
            System.out.println("("+i+")"+command);
            i++;
            command = command.replace("<fb>,<fn>", "<fn>");
            if (!command.equals(tmp)) {
                continue;
            }
            command = command.replace("<fb>,<fn>", "<fn>");
            if (!command.equals(tmp)) {
                continue;
            }
            command = command.replace("<t>,<tpn>", "<tpn>");
            if (!command.equals(tmp)) {
                continue;
            }
            command = command.replace("<vb>,<values>", "<values>");
            if (!command.equals(tmp)) {
                continue;
            }
            command = command.replace("<fb>", "<fb>,<fn>");
            if (!command.equals(tmp)) {
                continue;
            }
            command = command.replace("<vb>", "<vb>,<values>");
            if (!command.equals(tmp)) {
                continue;
            }
            command = command.replace("<t>", "<t>,<tpn>");
            if (!command.equals(tmp)) {
                continue;
            }
            break;
        }
        while (true){
            String tmp = command;
            i++;
            command = command.replace("<fn>", "id");
            if (!command.equals(tmp)) {
                System.out.println("("+i+")"+command);
                continue;
            }
            command = command.replace("<tn>", "id");
            if (!command.equals(tmp)) {
                System.out.println("("+i+")"+command);
                continue;
            }
            command = command.replace("<values>", "num");
            if (!command.equals(tmp)) {
                System.out.println("("+i+")"+command);
                continue;
            }
            command = command.replace("<cn>", "id");
            if (!command.equals(tmp)) {
                System.out.println("("+i+")"+command);
                continue;
            }
            command = command.replace("<tpn>", "NUMERIC");
            if (!command.equals(tmp)) {
                System.out.println("("+i+")"+command);
                continue;
            }
            break;
        }
        System.out.println();
    }
}
