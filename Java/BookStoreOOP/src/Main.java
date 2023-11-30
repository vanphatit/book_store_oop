import model.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Collectors;

public class Main {

    private static ArrayList<Book> books;
    private static ArrayList<BookCategory> bookCategories;
    private static ArrayList<Bill> bills;
    private static ArrayList<BillDetail> billDetails;
    private static ArrayList<ReceiptNote> receiptNotes;
    private static ArrayList<ReceiptNoteDetail> receiptNoteDetails;
    private static ArrayList<Staff> staffs;
    private static ArrayList<Suplier> supliers;
    private static ArrayList<Reader> readers;
    private static ArrayList<ReaderCategory> readerCategories;

    public static void main(String[] args) {
        books = new ArrayList<Book>();
        bills = new ArrayList<Bill>();
        billDetails = new ArrayList<BillDetail>();
        receiptNotes = new ArrayList<ReceiptNote>();
        receiptNoteDetails = new ArrayList<ReceiptNoteDetail>();
        staffs = new ArrayList<Staff>();
        bookCategories = new ArrayList<BookCategory>();
        supliers = new ArrayList<Suplier>();
        readers = new ArrayList<Reader>();
        readerCategories = new ArrayList<ReaderCategory>();

        initData();

        cau1();
        System.out.println("-----------------------------------------\n");
        cau2();
        System.out.println("-----------------------------------------\n");
        cau3();
        System.out.println("-----------------------------------------\n");
        cau4();
        System.out.println("-----------------------------------------\n");
        cau5();
        System.out.println("-----------------------------------------\n");
        cau6();
        System.out.println("-----------------------------------------\n");
        cau7();
        System.out.println("-----------------------------------------\n");
        cau8();
        System.out.println("-----------------------------------------\n");
        cau9();
        System.out.println("-----------------------------------------\n");
        cau10();
    }

    static void cau1(){
        System.out.println("Câu 1: Danh sách các sách thuộc từng loại sách");
        for (BookCategory bookCategory : bookCategories) {
            System.out.println(" ---- Loại sách: " + bookCategory.getName() + " ---- ");
            for (Book book : books) {
                if (book.getCategory().equals(bookCategory)) {
                    System.out.println("Tên sách: " + book.getName() + ", Giá: " + book.getUnitPrice());
                }
            }
        }
    }

    static void cau2(){
        System.out.println("Câu 2: in ra danh sách các sách có giá từ 300.000 đến 2.000.000");
        for (Book book : books) {
            if (book.getUnitPrice() >= 300000 && book.getUnitPrice() <= 2000000) {
                System.out.println("Tên sách: " + book.getName() + ", Giá: " + book.getUnitPrice());
            }
        }
    }

    static void cau3(){
        System.out.println("Câu 3: in ra tổng số sách của từng loại sách");
        for (BookCategory cate : bookCategories) {
            ArrayList<Book> listbook = (ArrayList<Book>) books.stream()
                    .filter(book -> book.getCategory().equals(cate))
                    .collect(Collectors.toList());

            System.out.println("Nhom sach: " + cate.getName() + ", Tong so sach: " + listbook.size());

        }
    }

    static void cau4(){
        System.out.println("Câu 4: tính tổng tiền bán được của từng staff");
        for (Staff staff : staffs) {
            ArrayList<Bill> listBill = (ArrayList<Bill>) bills.stream()
                    .filter(bill -> bill.getStaff().equals(staff))
                    .collect(Collectors.toList());

            int total = 0;
            for (Bill bill : listBill) {
                ArrayList<BillDetail> listBillDetail = (ArrayList<BillDetail>) billDetails.stream()
                        .filter(billDetail -> billDetail.getBill().equals(bill))
                        .collect(Collectors.toList());

                for (BillDetail billDetail : listBillDetail) {
                    total += billDetail.getBook().getUnitPrice() * billDetail.getQuantity();
                }
            }

            System.out.println("Nhân viên: " + staff.getName() + ", Tổng tiền bán được: " + total);
        }
    }

    static void cau5(){
        System.out.println("Câu 5: tính tổng tiền nhập sách của từng nhà cung cấp");
        for (Suplier suplier : supliers) {
            ArrayList<ReceiptNote> listReceiptNote = (ArrayList<ReceiptNote>) receiptNotes.stream()
                    .filter(receiptNote -> receiptNote.getSuplier().equals(suplier))
                    .collect(Collectors.toList());

            int total = 0;
            for (ReceiptNote receiptNote : listReceiptNote) {
                ArrayList<ReceiptNoteDetail> listReceiptNoteDetail = (ArrayList<ReceiptNoteDetail>) receiptNoteDetails.stream()
                        .filter(receiptNoteDetail -> receiptNoteDetail.getReceiptNote().equals(receiptNote))
                        .collect(Collectors.toList());

                for (ReceiptNoteDetail receiptNoteDetail : listReceiptNoteDetail) {
                    total += receiptNoteDetail.getUnitPrice() * receiptNoteDetail.getQuantity();
                }
            }

            System.out.println("Nhà cung cấp: " + suplier.getName() + ", Tổng tiền nhập sách: " + total);
        }
    }

    static void cau6(){
        System.out.println("Câu 6: in ra danh sách các sách có số lượng tồn kho lớn hơn 0");
        for (Book book : books) {
            ArrayList<BillDetail> listBillDetail = (ArrayList<BillDetail>) billDetails.stream()
                    .filter(billDetail -> billDetail.getBook().equals(book))
                    .collect(Collectors.toList());

            int total = 0;
            for (BillDetail billDetail : listBillDetail) {
                total += billDetail.getQuantity();
            }

            ArrayList<ReceiptNoteDetail> listReceiptNoteDetail = (ArrayList<ReceiptNoteDetail>) receiptNoteDetails.stream()
                    .filter(receiptNoteDetail -> receiptNoteDetail.getbook().equals(book))
                    .collect(Collectors.toList());

            for (ReceiptNoteDetail receiptNoteDetail : listReceiptNoteDetail) {
                total = receiptNoteDetail.getQuantity() - total;
            }

            if (total > 0) {
                System.out.println("Tên sách: " + book.getName() + ", Số lượng tồn kho: " + total);
            }
        }
    }

    static void cau7(){
        System.out.println("Câu 7: danh sách các đọc giả mua sách kèm số lượng sách đã mua : " + readers.size() + " đọc giả");
        for (Reader reader : readers) {
            ArrayList<Bill> listBill = (ArrayList<Bill>) bills.stream()
                    .filter(bill -> bill.getReader().equals(reader))
                    .collect(Collectors.toList());

            int total = 0;
            for (Bill bill : listBill) {
                ArrayList<BillDetail> listBillDetail = (ArrayList<BillDetail>) billDetails.stream()
                        .filter(billDetail -> billDetail.getBill().equals(bill))
                        .collect(Collectors.toList());

                for (BillDetail billDetail : listBillDetail) {
                    total += billDetail.getQuantity();
                }
            }

            System.out.println("Tên đọc giả: " + reader.getName() + ", Số lượng sách đã mua: " + total);
        }
    }

    static void cau8(){
        System.out.println("Câu 8: tính tổng tiền từng bill và bill có tổng tiền lớn nhất");
        int max = 0;
        Bill maxBill = null;
        for (Bill bill : bills) {
            ArrayList<BillDetail> listBillDetail = (ArrayList<BillDetail>) billDetails.stream()
                    .filter(billDetail -> billDetail.getBill().equals(bill))
                    .collect(Collectors.toList());

            int total = 0;
            for (BillDetail billDetail : listBillDetail) {
                total += billDetail.getBook().getUnitPrice() * billDetail.getQuantity();
            }

            System.out.println("Mã bill: " + bill.getId() + ", Tổng tiền: " + total);

            if (total > max) {
                max = total;
                maxBill = bill;
            }
        }
        System.out.println("Bill có tổng tiền lớn nhất: " + maxBill.getId() + ", Tổng tiền: " + max);
    }

    static void cau9(){
        System.out.println("Câu 9: sắp xếp các bill theo thứ tự giảm dần của tổng tiền");
        ArrayList<Bill> listBill = (ArrayList<Bill>) bills.stream()
                .sorted((bill1, bill2) -> {
                    ArrayList<BillDetail> listBillDetail1 = (ArrayList<BillDetail>) billDetails.stream()
                            .filter(billDetail -> billDetail.getBill().equals(bill1))
                            .collect(Collectors.toList());

                    int total1 = 0;
                    for (BillDetail billDetail : listBillDetail1) {
                        total1 += billDetail.getBook().getUnitPrice() * billDetail.getQuantity();
                    }

                    ArrayList<BillDetail> listBillDetail2 = (ArrayList<BillDetail>) billDetails.stream()
                            .filter(billDetail -> billDetail.getBill().equals(bill2))
                            .collect(Collectors.toList());

                    int total2 = 0;
                    for (BillDetail billDetail : listBillDetail2) {
                        total2 += billDetail.getBook().getUnitPrice() * billDetail.getQuantity();
                    }

                    return total2 - total1;
                })
                .collect(Collectors.toList());
        for (Bill bill : listBill) {
            ArrayList<BillDetail> listBillDetail = (ArrayList<BillDetail>) billDetails.stream()
                    .filter(billDetail -> billDetail.getBill().equals(bill))
                    .collect(Collectors.toList());

            int total = 0;
            for (BillDetail billDetail : listBillDetail) {
                total += billDetail.getBook().getUnitPrice() * billDetail.getQuantity();
            }

            System.out.println("Mã bill: " + bill.getId() + ", Tổng tiền: " + total);
        }
    }

    static void cau10(){
        System.out.println("Câu 10: in ra các nhân viên có số bill đã bán được nhiều nhất");
        int max = 0;
        Staff maxStaff = null;
        for (Staff staff : staffs) {
            ArrayList<Bill> listBill = (ArrayList<Bill>) bills.stream()
                    .filter(bill -> bill.getStaff().equals(staff))
                    .collect(Collectors.toList());

            int total = 0;
            for (Bill bill : listBill) {
                ArrayList<BillDetail> listBillDetail = (ArrayList<BillDetail>) billDetails.stream()
                        .filter(billDetail -> billDetail.getBill().equals(bill))
                        .collect(Collectors.toList());

                for (BillDetail billDetail : listBillDetail) {
                    total += billDetail.getBook().getUnitPrice() * billDetail.getQuantity();
                }
            }

            if (listBill.size() > max) {
                max = listBill.size();
                maxStaff = staff;
            }
        }
        System.out.println("Nhân viên có số bill đã bán được nhiều nhất: " + maxStaff.getName() + ", Số bill: " + max);
    }

    static void initData(){
        bookCategories.add(new BookCategory("BC1", "Sách giáo khoa / giáo trình"));
        bookCategories.add(new BookCategory("BC2", "Sách tham khảo"));
        bookCategories.add(new BookCategory("BC3", "Truyện tranh"));
        bookCategories.add(new BookCategory("BC4", "Tiểu thuyết"));

        supliers.add(new Suplier("S1", "Nhà xuất bản Kim Đồng", "Hà Nội",
                "0123456789", "kimdong@gmail.com"));
        supliers.add(new Suplier("S2", "Nhà xuất bản Trẻ", "Hà Nội",
                "0123456789", "nxbtre@gmail.com"));
        supliers.add(new Suplier("S3", "Nhà xuất bản Chính trị Quốc gia Sự thật", "Hà Nội",
                "0123456789", "nxbctqgst@gmail.com"));

        books.add(new Book("B01", "Sách giáo khoa Toán 10", "Còn hàng", "Nguyễn Văn B",
                        12000, bookCategories.get(0)));
        books.add(new Book("B02", "Giáo trình Lịch sử Đảng", "Còn hàng", "NXB CTQGST",
                350000, bookCategories.get(0)));
        books.add(new Book("B03", "Giáo trình Triết học Mác - Lênin", "Còn hàng", "GS.TS Phạm Văn Đức",
                250000, bookCategories.get(0)));
        books.add(new Book("B04", "Android in Action", "Còn hàng", "W. Frank Ableson",
                1500000, bookCategories.get(1)));
        books.add(new Book("B05", "Head First Java", "Còn hàng", "Kathy Sierra & Bert Bates",
                2000000, bookCategories.get(1)));
        books.add(new Book("B06", "Head First Design Patterns", "Còn hàng", "Eric Freeman & Elisabeth Freeman",
                2500000, bookCategories.get(1)));
        books.add(new Book("B07", "Java Generics and Collections", "Còn hàng", "Philip Wadler & Maurice Naftalin",
                3000000, bookCategories.get(1)));
        books.add(new Book("B08", "Thinking in Java", "Còn hàng", "Bruce Eckel",
                3500000, bookCategories.get(1)));
        books.add(new Book("B09", "Truyện tranh Doraemon T1", "Còn hàng", "Fujiko F. Fujio",
                20000, bookCategories.get(2)));
        books.add(new Book("B10", "Truyện tranh Conan", "Còn hàng", "Gosho Aoyama",
                20000, bookCategories.get(2)));
        books.add(new Book("B11", "Truyện tranh Doremon T2", "Còn hàng", "Fujiko F. Fujio",
                20000, bookCategories.get(2)));
        books.add(new Book("B12", "Tiểu thuyết Người giàu cũng khó khăn", "Còn hàng", "Kim Đồng",
                50000, bookCategories.get(3)));
        books.add(new Book("B13", "Tiểu thuyết Nhà giả kim", "Còn hàng", "Paulo Coelho",
                55000, bookCategories.get(3)));

        staffs.add(new Staff("ST1", "Lê Văn Phát", "Ca 1", "TP HCM",
                true, new Date(2004, Calendar.SEPTEMBER, 14), "0123456789"));
        staffs.add(new Staff("ST2", "Huỳnh Thanh Duy", "Ca 2", "TP HCM",
                true, new Date(2004, Calendar.OCTOBER, 31), "0123456789"));
        staffs.add(new Staff("ST3", "Lê Văn A", "Ca 1", "Dĩ An",
                true, new Date(2004, Calendar.SEPTEMBER, 14), "0123456789"));

        readerCategories.add(new ReaderCategory("RC1", "Học sinh"));
        readerCategories.add(new ReaderCategory("RC2", "Sinh viên"));
        readerCategories.add(new ReaderCategory("RC3", "Giáo viên"));
        readerCategories.add(new ReaderCategory("RC4", "Khác"));

        readers.add(new Reader("R01", "Nguyễn Văn A", true, readerCategories.get(0)));
        readers.add(new Reader("R02", "Nguyễn Văn B", true, readerCategories.get(0)));
        readers.add(new Reader("R03", "Lê Văn D", true, readerCategories.get(1)));
        readers.add(new Reader("R04", "Huỳnh Văn F", true, readerCategories.get(1)));
        readers.add(new Reader("R05", "Nguyễn Văn G", true, readerCategories.get(2)));
        readers.add(new Reader("R06", "Phan Văn H", true, readerCategories.get(2)));
        readers.add(new Reader("R07", "Lê Văn K", true, readerCategories.get(3)));

        bills.add(new Bill("B001", new Date(2022, Calendar.JANUARY, 1), "Hoàn thành",
                readers.get(0), staffs.get(0)));
        bills.add(new Bill("B002", new Date(2022, Calendar.JANUARY, 2), "Hoàn thành",
                readers.get(1), staffs.get(1)));
        bills.add(new Bill("B003", new Date(2022, Calendar.JANUARY, 3), "Chưa hoàn thành",
                readers.get(2), staffs.get(2)));
        bills.add(new Bill("B004", new Date(2022, Calendar.JANUARY, 4), "Hoàn thành",
                readers.get(3), staffs.get(0)));
        bills.add(new Bill("B005", new Date(2022, Calendar.JANUARY, 5), "Hoàn thành",
                readers.get(4), staffs.get(1)));
        bills.add(new Bill("B006", new Date(2022, Calendar.JANUARY, 6), "Hoàn thành",
                readers.get(5), staffs.get(2)));
        bills.add(new Bill("B007", new Date(2022, Calendar.JANUARY, 7), "Hoàn thành",
                readers.get(6), staffs.get(0)));

        billDetails.add(new BillDetail(1, bills.get(0), books.get(0)));
        billDetails.add(new BillDetail(2, bills.get(0), books.get(1)));
        billDetails.add(new BillDetail(2, bills.get(0), books.get(12)));
        billDetails.add(new BillDetail(2, bills.get(0), books.get(11)));
        billDetails.add(new BillDetail(3, bills.get(0), books.get(10)));
        billDetails.add(new BillDetail(3, bills.get(1), books.get(2)));
        billDetails.add(new BillDetail(3, bills.get(1), books.get(12)));
        billDetails.add(new BillDetail(3, bills.get(1), books.get(11)));
        billDetails.add(new BillDetail(3, bills.get(1), books.get(10)));
        billDetails.add(new BillDetail(4, bills.get(1), books.get(3)));
        billDetails.add(new BillDetail(5, bills.get(2), books.get(4)));
        billDetails.add(new BillDetail(6, bills.get(2), books.get(5)));
        billDetails.add(new BillDetail(7, bills.get(3), books.get(6)));
        billDetails.add(new BillDetail(8, bills.get(3), books.get(7)));
        billDetails.add(new BillDetail(9, bills.get(4), books.get(8)));
        billDetails.add(new BillDetail(10, bills.get(4), books.get(9)));
        billDetails.add(new BillDetail(11, bills.get(5), books.get(10)));
        billDetails.add(new BillDetail(12, bills.get(5), books.get(11)));
        billDetails.add(new BillDetail(13, bills.get(6), books.get(12)));
        billDetails.add(new BillDetail(14, bills.get(6), books.get(0)));

        receiptNotes.add(new ReceiptNote("RN001", new Date(2022, Calendar.JANUARY, 1), "Hoàn thành",
                supliers.get(0), staffs.get(0)));
        receiptNotes.add(new ReceiptNote("RN002", new Date(2022, Calendar.JANUARY, 2), "Hoàn thành",
                supliers.get(1), staffs.get(1)));
        receiptNotes.add(new ReceiptNote("RN003", new Date(2022, Calendar.JANUARY, 3), "Chưa hoàn thành",
                supliers.get(2), staffs.get(2)));
        receiptNotes.add(new ReceiptNote("RN004", new Date(2022, Calendar.JANUARY, 4), "Hoàn thành",
                supliers.get(0), staffs.get(0)));
        receiptNotes.add(new ReceiptNote("RN005", new Date(2022, Calendar.JANUARY, 5), "Hoàn thành",
                supliers.get(1), staffs.get(1)));

        receiptNoteDetails.add(new ReceiptNoteDetail(12000, 20, receiptNotes.get(0), books.get(0)));
        receiptNoteDetails.add(new ReceiptNoteDetail(350000, 20, receiptNotes.get(0), books.get(1)));
        receiptNoteDetails.add(new ReceiptNoteDetail(250000, 20, receiptNotes.get(0), books.get(2)));
        receiptNoteDetails.add(new ReceiptNoteDetail(1500000, 20, receiptNotes.get(1), books.get(3)));
        receiptNoteDetails.add(new ReceiptNoteDetail(2000000, 20, receiptNotes.get(1), books.get(4)));
        receiptNoteDetails.add(new ReceiptNoteDetail(2500000, 20, receiptNotes.get(1), books.get(5)));
        receiptNoteDetails.add(new ReceiptNoteDetail(3000000, 20, receiptNotes.get(2), books.get(6)));
        receiptNoteDetails.add(new ReceiptNoteDetail(3500000, 20, receiptNotes.get(2), books.get(7)));
        receiptNoteDetails.add(new ReceiptNoteDetail(20000, 20, receiptNotes.get(3), books.get(8)));
        receiptNoteDetails.add(new ReceiptNoteDetail(20000, 20, receiptNotes.get(3), books.get(9)));
        receiptNoteDetails.add(new ReceiptNoteDetail(20000, 20, receiptNotes.get(4), books.get(10)));
        receiptNoteDetails.add(new ReceiptNoteDetail(50000, 20, receiptNotes.get(4), books.get(11)));
        receiptNoteDetails.add(new ReceiptNoteDetail(55000, 20, receiptNotes.get(4), books.get(12)));

        //foreach receptNoteDetails in receiptNoteDetails, unitprice = price - 10%
        for (ReceiptNoteDetail receiptNoteDetail : receiptNoteDetails) {
            receiptNoteDetail.setUnitPrice((int) (receiptNoteDetail.getUnitPrice() * 0.8));
        }
    }
}