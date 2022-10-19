--Select
--ANSII
Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers

Select * from Customers where City='Berlin'

--case insensitive	büyük küçük harf
Select * From Products where CategoryID=1 or CategoryID=3

Select * From Products where CategoryID=1 and UnitPrice>=10

Select * From Products where CategoryID=1 order by UnitPrice desc   --ascending (artan)  descending (azalan)

Select count(*) Adet From Products 

Select CategoryID,count(*) From Products where unitPrice<20 group by CategoryID having count(*)<10

Select p.ProductID,p.ProductName,p.UnitPrice,c.CategoryName
From Products p inner join Categories c on p.CategoryID=c.CategoryID where p.UnitPrice>10

--Dro Data Transfermation Object

Select * From Products p inner join [Order Details] od  on p.ProductID=od.ProductID 
inner join Orders o on o.OrderID=od.OrderID

Select * From Customers c left join Orders o on c.CustomerID=o.CustomerID where o.CustomerID is null




