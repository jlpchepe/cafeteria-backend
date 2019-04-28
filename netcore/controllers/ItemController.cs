using Microsoft.EntityFrameworkCore;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Backend.Services;
using Backend.Models;
using Microsoft.AspNetCore.Mvc;

namespace Backend.Controllers
{
    [Route("api/[controller]")]
    public class ItemController : ControllerBase
    {
        public ItemController(ItemService service)
        {
            this.service = service;
        }

        readonly ItemService service;

        [HttpGet]
        public async Task<IReadOnlyList<Item>> GetAll()
        {
            return await this.service.GetAll();
        }
    }
}