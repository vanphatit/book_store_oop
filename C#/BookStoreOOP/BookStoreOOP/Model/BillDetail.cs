using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookStoreOOP.Model
{
    public class BillDetail
    {
        private int quantity;
        private Bill bill;
        private Book book;

        public BillDetail(int quantity, Bill bill, Book book)
        {
            this.quantity = quantity;
            this.bill = bill;
            this.book = book;
        }

        public int getQuantity()
        {
            return quantity;
        }

        public Bill getBill()
        {
            return bill;
        }

        public Book getBook()
        {
            return book;
        }

        public void setQuantity(int quantity)
        {
            this.quantity = quantity;
        }

        public void setBill(Bill bill)
        {
            this.bill = bill;
        }

        public void setBook(Book book)
        {
            this.book = book;
        }
    }
}
