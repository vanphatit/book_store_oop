using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookStoreOOP.Model
{
    public class Suplier
    {
        private string id;
        private string name;
        private string address;
        private string phone;
        private string email;

        public Suplier(string id, string name, string address, string phone, string email)
        {
            this.id = id;
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.email = email;
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
        public string getAddress()
        {
            return address;
        }

        public string getPhone()
        {
            return phone;
        }

        public string getEmail()
        {
            return email;
        }
        public void setId(string id)
        {
            this.id = id;
        }
        public void setName(string name)
        {
            this.name = name;
        }
        public void setAddress(string address)
        {
            this.address = address;
        }
        public void setPhone(string phone)
        {
            this.phone = phone;
        }

        public void setEmail(string email)
        {
            this.email = email;
        }
    }
}
