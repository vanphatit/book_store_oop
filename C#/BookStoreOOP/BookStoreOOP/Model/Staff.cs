using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookStoreOOP.Model
{
    public class Staff
    {
        private string id;
        private string name;
        private string workShift;
        private string address;
        private bool gender;
        private DateTime birthday;
        private string phone;

        public Staff(string id, string name, string workShift, string address, bool gender, DateTime birthday, string phone)
        {
            this.id = id;
            this.name = name;
            this.workShift = workShift;
            this.address = address;
            this.gender = gender;
            this.birthday = birthday;
            this.phone = phone;
        }

        public string getId()
        {
            return id;
        }

        public void setId(string id)
        {
            this.id = id;
        }

        public string getName()
        {
            return name;
        }

        public void setName(string name)
        {
            this.name = name;
        }

        public string getworkShift()
        {
            return workShift;
        }

        public void setworkShift(string workShift)
        {
            this.workShift = workShift;
        }

        public string getAddress()
        {
            return address;
        }

        public void setAddress(string address)
        {
            this.address = address;
        }

        public bool getGender()
        {
            return gender;
        }

        public void setGender(bool gender)
        {
            this.gender = gender;
        }

        public DateTime getBirthday()
        {
            return birthday;
        }

        public void setBirthday(DateTime birthday)
        {
            this.birthday = birthday;
        }

        public string getPhone()
        {
            return phone;
        }

        public void setPhone(string phone)
        {
            this.phone = phone;
        }
    }
}
