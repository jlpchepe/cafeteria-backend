

namespace Backend.Models {
    public class Item
    {
        public Item(string name, string description, string imageSource, decimal price)
        {
            Name = name;
            Description = description;
            ImageSource = imageSource;
            Price = price;
        }

        public string Name { get; set; }
        public string Description { get; set; }
        public string ImageSource { get; set; }
        public decimal Price { get; set; }
    }
}