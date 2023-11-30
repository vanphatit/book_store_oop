using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookStoreOOP.Model
{
    public class BookCategory
    {
        private string id;
        private string name;

        public BookCategory(string id, string name)
        {
            this.id = id;
            this.name = name;
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
        public void setId(string id)
        {
            this.id = id;
        }

        public void setName(string name)
        {
            this.name = name;
        }
    }
}
