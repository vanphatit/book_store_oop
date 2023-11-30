using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookStoreOOP.Model
{
    public class Reader
    {
        private string id;
        private string name;
        private bool gender;
        private ReaderCategory category;

        public Reader(string id, string name, bool gender, ReaderCategory category)
        {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.category = category;
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

        public bool getGender()
        {
            return gender;
        }

        public void setGender(bool gender)
        {
            this.gender = gender;
        }

        public ReaderCategory getCategory()
        {
            return category;
        }

        public void setCategory(ReaderCategory category)
        {
            this.category = category;
        }
    }
}
