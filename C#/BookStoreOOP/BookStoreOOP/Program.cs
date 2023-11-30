using BookStoreOOP.Model;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookStoreOOP
{
    public class Program
    {
        private static List<Book> books;
        private static List<BookCategory> bookCategories;
        private static List<Bill> bills;
        private static List<BillDetail> billDetails;
        private static List<ReceiptNote> receiptNotes;
        private static List<ReceiptNoteDetail> receiptNoteDetails;
        private static List<Staff> staffs;
        private static List<Suplier> supliers;
        private static List<Reader> readers;
        private static List<ReaderCategory> readerCategories;
        
        static void Main(string[] args)
        {
            books = new List<Book>();
            bookCategories = new List<BookCategory>();
            bills = new List<Bill>();
            billDetails = new List<BillDetail>();
            receiptNotes = new List<ReceiptNote>();
            receiptNoteDetails = new List<ReceiptNoteDetail>();
            staffs = new List<Staff>();
            supliers = new List<Suplier>();
            readers = new List<Reader>();
            readerCategories = new List<ReaderCategory>();

            initData();

        }

        static void initData()
        {
            bookCategories.Add(new BookCategory("BC1", "Sách giáo khoa / giáo trình"));
            bookCategories.Add(new BookCategory("BC2", "Sách tham khảo"));
            bookCategories.Add(new BookCategory("BC3", "Truyện tranh"));
            bookCategories.Add(new BookCategory("BC4", "Tiểu thuyết"));

            supliers.Add(new Suplier("S1", "Nhà xuất bản Kim Đồng", "Hà Nội",
                "0123456789", "kimdong@gmail.com"));
            supliers.Add(new Suplier("S2", "Nhà xuất bản Trẻ", "Hà Nội",
                    "0123456789", "nxbtre@gmail.com"));
            supliers.Add(new Suplier("S3", "Nhà xuất bản Chính trị Quốc gia Sự thật", "Hà Nội",
                    "0123456789", "nxbctqgst@gmail.com"));

            books.Add(new Book("B01", "Sách giáo khoa Toán 10", "Còn hàng", "Nguyễn Văn B",
                            12000, bookCategories[0]));
            books.Add(new Book("B02", "Giáo trình Lịch sử Đảng", "Còn hàng", "NXB CTQGST",
                    350000, bookCategories[0]));
            books.Add(new Book("B03", "Giáo trình Triết học Mác - Lênin", "Còn hàng", "GS.TS Phạm Văn Đức",
                    250000, bookCategories[0]));
            books.Add(new Book("B04", "Android in Action", "Còn hàng", "W. Frank Ableson",
                    1500000, bookCategories[1]));
            books.Add(new Book("B05", "Head First Java", "Còn hàng", "Kathy Sierra & Bert Bates",
                    2000000, bookCategories[1]));
            books.Add(new Book("B06", "Head First Design Patterns", "Còn hàng", "Eric Freeman & Elisabeth Freeman",
                    2500000, bookCategories[1]));
            books.Add(new Book("B07", "Java Generics and Collections", "Còn hàng", "Philip Wadler & Maurice Naftalin",
                    3000000, bookCategories[1]));
            books.Add(new Book("B08", "Thinking in Java", "Còn hàng", "Bruce Eckel",
                    3500000, bookCategories[1]));
            books.Add(new Book("B09", "Truyện tranh Doraemon T1", "Còn hàng", "Fujiko F. Fujio",
                    20000, bookCategories[2]));
            books.Add(new Book("B10", "Truyện tranh Conan", "Còn hàng", "Gosho Aoyama",
                    20000, bookCategories[2]));
            books.Add(new Book("B11", "Truyện tranh Doremon T2", "Còn hàng", "Fujiko F. Fujio",
                    20000, bookCategories[2]));
            books.Add(new Book("B12", "Tiểu thuyết Người giàu cũng khó khăn", "Còn hàng", "Kim Đồng",
                    50000, bookCategories[3]));
            books.Add(new Book("B13", "Tiểu thuyết Nhà giả kim", "Còn hàng", "Paulo Coelho",
                    55000, bookCategories[3]));

            staffs.Add(new Staff("ST1", "Lê Văn Phát", "Ca 1", "TP HCM",
                true, new DateTime(2004, 09, 14), "0123456789"));
            staffs.Add(new Staff("ST2", "Huỳnh Thanh Duy", "Ca 2", "TP HCM",
                    true, new DateTime(2004, 10, 31), "0123456789"));
            staffs.Add(new Staff("ST3", "Lê Văn A", "Ca 1", "Dĩ An",
                    true, new DateTime(2004, 09, 14), "0123456789"));

            readerCategories.Add(new ReaderCategory("RC1", "Học sinh"));
            readerCategories.Add(new ReaderCategory("RC2", "Sinh viên"));
            readerCategories.Add(new ReaderCategory("RC3", "Giáo viên"));
            readerCategories.Add(new ReaderCategory("RC4", "Khác"));

            readers.Add(new Reader("R01", "Nguyễn Văn A", true, readerCategories[0]));
            readers.Add(new Reader("R02", "Nguyễn Văn B", true, readerCategories[0]));
            readers.Add(new Reader("R03", "Lê Văn D", true, readerCategories[1]));
            readers.Add(new Reader("R04", "Huỳnh Văn F", true, readerCategories[1]));
            readers.Add(new Reader("R05", "Nguyễn Văn G", true, readerCategories[2]));
            readers.Add(new Reader("R06", "Phan Văn H", true, readerCategories[2]));
            readers.Add(new Reader("R07", "Lê Văn K", true, readerCategories[3]));

            bills.Add(new Bill("B001", new DateTime(2022, 1, 1), "Hoàn thành",
                    readers[0], staffs[0]);
            bills.Add(new Bill("B002", new DateTime(2022, 1, 2), "Hoàn thành",
                    readers[1], staffs[1]));
            bills.Add(new Bill("B003", new DateTime(2022, 1, 3), "Chưa hoàn thành",
                    readers[2], staffs[2]));
            bills.Add(new Bill("B004", new DateTime(2022, 1, 4), "Hoàn thành",
                    readers[3], staffs[0]));
            bills.Add(new Bill("B005", new DateTime(2022, 1, 5), "Hoàn thành",
                    readers[4], staffs[1]));
            bills.Add(new Bill("B006", new DateTime(2022, 1, 6), "Hoàn thành",
                    readers[5], staffs[2]));
            bills.Add(new Bill("B007", new DateTime(2022, 1, 7), "Hoàn thành",
                    readers[6], staffs[0]));

            billDetails.Add(new BillDetail(1, bills[0], books[0]));
            billDetails.Add(new BillDetail(2, bills[0], books[1]));
            billDetails.Add(new BillDetail(2, bills[0], books[12]));
            billDetails.Add(new BillDetail(2, bills[0], books[11]));
            billDetails.Add(new BillDetail(2, bills[0], books[10]));
            billDetails.Add(new BillDetail(3, bills[1], books[2]));
            billDetails.Add(new BillDetail(3, bills[1], books[12]));
            billDetails.Add(new BillDetail(3, bills[1], books[11]));
            billDetails.Add(new BillDetail(3, bills[1], books[10]));
            billDetails.Add(new BillDetail(4, bills[1], books[3]));
            billDetails.Add(new BillDetail(5, bills[2], books[4]));
            billDetails.Add(new BillDetail(6, bills[2], books[5]));
            billDetails.Add(new BillDetail(7, bills[3], books[6]));
            billDetails.Add(new BillDetail(8, bills[3], books[7]));
            billDetails.Add(new BillDetail(9, bills[4], books[8]));
            billDetails.Add(new BillDetail(10, bills[4], books[9]));
            billDetails.Add(new BillDetail(11, bills[5], books[10]));
            billDetails.Add(new BillDetail(12, bills[5], books[11]));
            billDetails.Add(new BillDetail(13, bills[6], books[12]));
            billDetails.Add(new BillDetail(14, bills[6], books[0]));


            receiptNotes.Add(new ReceiptNote("RN001", new DateTime(2022, 1, 1), "Hoàn thành",
                    supliers[0], staffs[0]));
            receiptNotes.Add(new ReceiptNote("RN002", new DateTime(2022, 1, 2), "Hoàn thành",
                    supliers[1], staffs[1]));
            receiptNotes.Add(new ReceiptNote("RN003", new DateTime(2022, 1, 3), "Chưa hoàn thành",
                    supliers[2], staffs[2]));
            receiptNotes.Add(new ReceiptNote("RN004", new DateTime(2022, 1, 4), "Hoàn thành",
                    supliers[0], staffs[0]));
            receiptNotes.Add(new ReceiptNote("RN005", new DateTime(2022, 1, 5), "Hoàn thành",
                    supliers[1], staffs[1]));

            receiptNoteDetails.Add(new ReceiptNoteDetail(12000, 20, receiptNotes[0], books[0]));
            receiptNoteDetails.Add(new ReceiptNoteDetail(350000, 20, receiptNotes[0], books[1]));
            receiptNoteDetails.Add(new ReceiptNoteDetail(250000, 20, receiptNotes[0], books[2]));
            receiptNoteDetails.Add(new ReceiptNoteDetail(1500000, 20, receiptNotes[1], books[3]));
            receiptNoteDetails.Add(new ReceiptNoteDetail(2000000, 20, receiptNotes[1], books[4]));
            receiptNoteDetails.Add(new ReceiptNoteDetail(2500000, 20, receiptNotes[1], books[5]));
            receiptNoteDetails.Add(new ReceiptNoteDetail(3000000, 20, receiptNotes[2], books[6]));
            receiptNoteDetails.Add(new ReceiptNoteDetail(3500000, 20, receiptNotes[2], books[7]));
            receiptNoteDetails.Add(new ReceiptNoteDetail(20000, 20, receiptNotes[3], books[8]));
            receiptNoteDetails.Add(new ReceiptNoteDetail(20000, 20, receiptNotes[3], books[9]));
            receiptNoteDetails.Add(new ReceiptNoteDetail(20000, 20, receiptNotes[4], books[10]));
            receiptNoteDetails.Add(new ReceiptNoteDetail(50000, 20, receiptNotes[4], books[11]));
            receiptNoteDetails.Add(new ReceiptNoteDetail(55000, 20, receiptNotes[4], books[12]));

            //foreach receptNoteDetails in receiptNoteDetails, unitprice = price - 10%
            foreach (ReceiptNoteDetail item in receiptNoteDetails)
            {
                item.setUnitPrice((int)(item.getUnitPrice() * 0.8));
            }
        }
    }
}
