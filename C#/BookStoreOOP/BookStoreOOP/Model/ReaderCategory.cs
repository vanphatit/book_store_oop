using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BookStoreOOP.Model
{
    public class ReaderCategory
    {
        private string id;
        private string name;
        public ReaderCategory(string id, string name)
        {
            this.id = id;
            this.name = name;
        }

        //getters and setters
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
    }
}
