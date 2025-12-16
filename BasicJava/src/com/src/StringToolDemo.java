package src;

import java.util.Locale;
import java.util.Scanner;

public class StringToolDemo
{
    String sentance;
    StringToolDemo( String sentance)
    {
        this.sentance = sentance;
    }
    class Analyzer{
        public int countVowels()
        {
            int count =0;
            String s = sentance.toLowerCase();

            for(int i =0;i<s.length();i++)
            {
                char ch = s.charAt(i);
                if(ch == 'a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                    count++;
                }
            }
            return count;
        }
        public int countWords()
        {
            if(sentance.trim().isEmpty()) return 0;
            String words[]= sentance.trim().split("\\s+");
            return words.length;
        }
        public String reverseString()
        {
            String rev =" ";
            for(int i = sentance.length()-1;i>=0;i--)
            {
                rev = rev+sentance.charAt(i);
            }
            return rev;
        }
    }
    public static void main (String srgs[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        StringToolDemo t1 = new StringToolDemo(str);
        StringToolDemo.Analyzer analyzer = t1.new Analyzer();
        System.out.println("vowels present in sentances is :"+analyzer.countVowels());
        System.out.println("words present in sentance is : "+analyzer.countWords());
        System.out.println("reverse string is : "+analyzer.reverseString());
    }

}
