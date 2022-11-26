package ru.mirea.task24;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexIP {
    private static String Str;
    private static boolean b;
    private static final String IpRegex="[1,2]\\d{2}\\.(0|\\d{3})\\.(\\d|\\d{3})\\.(\\d|\\d{3})";
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Str=s.next();
        b=validate(Str);
        if(b){
            System.out.println("This is IPv4");
        } else {
            System.out.println("This is not IPv4");
        }
    }
    public static boolean validate(String ip){
        Pattern pattern = Pattern.compile(IpRegex);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
