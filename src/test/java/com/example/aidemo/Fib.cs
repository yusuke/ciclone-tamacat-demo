
using System;

class Fib
{
    static void Main(string[] args)
    {
        Console.Write("フィボナッチ数列を何項まで表示しますか: ");
        int n = int.Parse(Console.ReadLine());

        Console.WriteLine("フィボナッチ数列:");
        if (n <= 0)
        {
            Console.WriteLine("正の整数を入力してください。");
            return;
        }

        int a = 0, b = 1;

        for (int i = 0; i < n; i++)
        {
            Console.WriteLine(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
 