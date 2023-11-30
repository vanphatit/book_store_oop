using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookStoreOOP.Model
{
    public class Book
    {
        private string id;
        private string name;
        private string status;
        private string author;
        private int unitPrice;
        private BookCategory category;

        public Book(string id, string name, string status, string author, int unitPrice, BookCategory category)
        {
            this.id = id;
            this.name = name;
            this.status = status;
            this.author = author;
            this.unitPrice = unitPrice;
            this.category = category;
        }

        //getter and setter
        public string getId()
        {
            return id;
        }
        public string getName()
        {
            return name;
        }
        public string getStatus()
        {
            return status;
        }
        public string getauthor()
        {
            return author;
        }
        public int getUnitPrice()
        {
            return unitPrice;
        }
        public BookCategory getCategory()
        {
            return category;
        }
        public void setId(string id)
        {
            this.id = id;
        }
        public void setName(string name)
        {
            this.name = name;
        }
        public void setStatus(string status)
        {
            this.status = status;
        }
        public void setauthor(string author)
        {
            this.author = author;
        }
        public void setUnitPrice(int unitPrice)
        {
            this.unitPrice = unitPrice;
        }
        public void setCategory(BookCategory category)
        {
            this.category = category;
        }
    }
}
