using Backend.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Backend.Services
{
    /// <summary>
    /// Servicio encargado de manipular los artículos
    /// </summary>
    public class ItemService
    {
        public Task<IReadOnlyList<Item>> GetAll() {
            return Task.FromResult(this.GenerateMocks());
        }

        private IReadOnlyList<Item> GenerateMocks() {
            Func<List<Item>> generateBaseItems = () =>
                new List<Item>() {
                    new Item(
                        "Hamburguer",
                        "Tasty hamburguer with onion",
                        "https://images.unsplash.com/photo-1551615593-ef5fe247e8f7?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1380&q=80",
                        50
                    ),
                    new Item(
                        "Pizza",
                        "Delicious italian cheese pizza",
                        "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?ixlib=rb-1.2.1&auto=format&fit=crop&w=1355&q=80",
                        40
                    ),
                    new Item(
                        "Sandwich",
                        "Delicious italian cheese hamburguer",
                        "https://images.unsplash.com/photo-1521390188846-e2a3a97453a0?ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80",
                        35
                    ),
                    new Item(
                        "Salad",
                        "Delicious salad",
                        "https://images.unsplash.com/photo-1543339308-43e59d6b73a6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80",
                        60
                    ),
                    new Item(
                        "French fries",
                        "Salty french fries",
                        "https://images.unsplash.com/photo-1463183665146-ce2ed31df6b0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80",
                        20
                    )
                };

            //Generamos 100 artículos
            return Enumerable.Range(0, 20)
                .SelectMany(n => generateBaseItems())
                .ToList();
        }

        
    }
}