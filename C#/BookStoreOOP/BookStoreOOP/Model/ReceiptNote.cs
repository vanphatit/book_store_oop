using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookStoreOOP.Model
{
    public class ReceiptNote
    {
        private string id;
        private DateTime date;
        private string moreInfo;
        private Suplier suplier;
        private Staff staff;

        public ReceiptNote(string id, DateTime date, string moreInfo, Suplier suplier, Staff staff)
        {
            this.id = id;
            this.date = date;
            this.moreInfo = moreInfo;
            this.suplier = suplier;
            this.staff = staff;
        }

        public string getId()
        {
            return id;
        }

        public void setId(string id)
        {
            this.id = id;
        }

        public DateTime getDate()
        {
            return date;
        }

        public void setDate(DateTime date)
        {
            this.date = date;
        }

        public string getMoreInfo()
        {
            return moreInfo;
        }

        public void setMoreInfo(string moreInfo)
        {
            this.moreInfo = moreInfo;
        }

        public Suplier getSuplier()
        {
            return suplier;
        }

        public void setSuplier(Suplier suplier)
        {
            this.suplier = suplier;
        }

        public Staff getStaff()
        {
            return staff;
        }

        public void setStaff(Staff staff)
        {
            this.staff = staff;
        }
    }
}