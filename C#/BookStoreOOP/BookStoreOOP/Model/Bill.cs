using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookStoreOOP.Model
{
    public class Bill
    {
        private string id;
        private DateTime date;
        private string status;
        private Reader reader;
        private Staff staff;

        public Bill(string id, DateTime date, string status, Reader reader, Staff staff)
        {
            this.id = id;
            this.date = date;
            this.status = status;
            this.reader = reader;
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

        public string getStatus()
        {
            return status;
        }

        public void setStatus(string status)
        {
            this.status = status;
        }

        public Reader getReader()
        {
            return reader;
        }

        public void setReader(Reader reader)
        {
            this.reader = reader;
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
