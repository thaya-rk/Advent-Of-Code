package AdventOfCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mull_It_Over {
    public static void main(String[] args) {
        String str="xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))";
        System.out.println(mulSum(str));


    }
    static int mulSum(String str){
        String regex = "mul\\((\\d+),(\\d+)\\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        int sum=0;

        while(matcher.find()){
            int num1=Integer.parseInt(matcher.group(1));
            int num2=Integer.parseInt(matcher.group(2));
            int mul=num1*num2;
            sum+=mul;
        }
        return sum;
    }

}
