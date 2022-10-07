using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JavaKampı2022Hafta3Odev1Class
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //IoC Container
            CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
            customerManager.GivCredit();

           /* CreditManager creditManager = new CreditManager();
            creditManager.Calculate();
            creditManager.Calculate();
            creditManager.Save();

            Customer customer = new Customer();//newleme işlemi =örneğini oluşturmak,instance oluşturmak,instence creation
            customer.ID = 1;
            customer.City = "Ankara";
            

            CustomerManager customerManager = new CustomerManager(customer);
            customerManager.Save();
            customerManager.Delete();

            Company company = new Company();
            company.TaxNumber = "100000";
            company.CompanyName = "Arçelik";
            company.ID = 100;

            CustomerManager customerManager2 = new CustomerManager(new Person());

            Person person = new Person();
            person.FirstName = "";
            person.NesionalIdentity = "";*/

            Console.ReadKey();
        }
    }
    class CreditManager
    {
        public void Calculate(int creditType)
        {
            if (creditType == 1)//esnaf
            {

            }
            if (creditType == 2)//öğretmen
            {

            }
            Console.WriteLine("Hesaplandı");
        }
        public void Save()
        {
            Console.WriteLine("Kredi Verildi");
        }
    }
    interface ICreditManager
    {
        void Calculate();
         void Save();
    }

    abstract class BaseCreditManager : ICreditManager
    {  //abstract nesneler her yere farklı olan methodlardır
        public abstract void Calculate();
        //genelde aynı olan fakat bazı yerlerde farklı olan methodlar için virtual (sanal) ifadesi kullanılır
        public virtual void Save()
        {
            Console.WriteLine("Kaydedildi");
        }
    }

    class TeacherCreditManager : BaseCreditManager , ICreditManager
    {
        //abstract nesneleri kullanabilmek için override ifadesi kullanılır
        public override void Calculate()
        {
            //Hesaplamalar
            Console.WriteLine("Öğretmen Kredisi Hesaplandı");
        }
        public override void Save()
        {
            base.Save();  //base. anlamı ana sınıf TeacherCreditManager  
        }
    }
    class MilitaryCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Asker Kredisi Hesaplandı");
        }
    }
    class CarCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Araba Kredisi Hesaplandı");
        }
    }
    //SOLID 
    class Customer
    {
        public Customer()
        {
            Console.WriteLine("Müşteri nesnesi başlatıldı");
        }
        public int ID { get; set; }
        public string City { get; set; }
    }

    class Person : Customer
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string NesionalIdentity { get; set; }
    }
    class Company : Customer
    {
        public string CompanyName { get; set; }
        public string TaxNumber { get; set; }
    }
    //Katmalı Mimari Temeli
    class CustomerManager
    {
        private Customer _customer;
        private ICreditManager _creditManager;

        public CustomerManager(Customer customer ,ICreditManager creditManager)
        {
            _customer = customer;
            _creditManager = creditManager;
        }
        public void Save()
        {
            Console.WriteLine("Müşteri Kaydedildi: ");
          
        }
        public void Delete()
        {
            Console.WriteLine("Müşteri Silindi: ");
        }
        public void GivCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("Kredi Verildi");
        }
    }
}
