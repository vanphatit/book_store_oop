using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookStoreOOP.Model
{
    public class ReceiptNoteDetail
    {
        private int unitPrice;
        private int quantity;
        private ReceiptNote receiptNote;
        private Book book;

        public ReceiptNoteDetail(int unitPrice, int quantity, ReceiptNote receiptNote, Book book)
        {
            this.unitPrice = unitPrice;
            this.quantity = quantity;
            this.receiptNote = receiptNote;
            this.book = book;
        }

        public int getUnitPrice()
        {
            return unitPrice;
        }

        public void setUnitPrice(int unitPrice)
        {
            this.unitPrice = unitPrice;
        }

        public int getQuantity()
        {
            return quantity;
        }

        public void setQuantity(int quantity)
        {
            this.quantity = quantity;
        }

        public ReceiptNote getReceiptNote()
        {
            return receiptNote;
        }

        public void setReceiptNote(ReceiptNote receiptNote)
        {
            this.receiptNote = receiptNote;
        }

        public Book getbook()
        {
            return book;
        }

        public void setBook(Book book)
        {
            this.book = book;
        }
    }
}
