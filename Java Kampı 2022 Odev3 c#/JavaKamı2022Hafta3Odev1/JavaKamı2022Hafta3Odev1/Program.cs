using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JavaKamı2022Hafta3Odev1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] sayilar1 = new [] { 1, 2, 3 };
            int[] sayilar2 = new [] { 10, 20, 30 };
            sayilar1 = sayilar2;
            sayilar2[0] = 1000;
            Console.WriteLine(sayilar2[0]);
            Console.ReadKey();
            /*
            int sayi1 = 10;
            int sayi2 = 20;
            sayi1 = sayi2;
            sayi2 = 100;
            Console.WriteLine(sayi1);*/
            Console.ReadKey();
        }
    }
}
