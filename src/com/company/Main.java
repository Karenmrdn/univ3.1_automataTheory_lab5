package com.company;

public class Main {

    public static void main(String[] args) {
	MyLLAnalyzer.analyze("INSERT INTO <tn> <fb> VALUES <vb>");
	MyLLAnalyzer.analyze("ALTER TABLE <tn> ADD <cn> <t>");
	MyLLAnalyzer.analyze("SELECT <fb> FROM <tn> UNION SELECT <fb> FROM <tn>");
	MyLLAnalyzer.analyze("SELECT <fb>,<fb> FROM  LEFT JOIN <tn> ON <fn>=<fn> ORDER BY <fn>");
    }
}
