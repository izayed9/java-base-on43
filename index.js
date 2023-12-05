// Create an Array whose values are 9 objects and each object property should be name, description, image, or status.
// Create a card with each of the array items in the array created above. 
// Create an html file and create one gallery with the cards that created above.


const root = document.querySelector('.root') 

const listItems =[
    {name:"name1", descripttion:"desc1", image:"https://picsum.photos/200", price:100},
    {name:"name2", descripttion:"desc1", image:"https://picsum.photos/200", price:100},
    {name:"name3", descripttion:"desc1", image:"https://picsum.photos/200", price:100},
    {name:"name4", descripttion:"desc1", image:"https://picsum.photos/200", price:100},
    {name:"name5", descripttion:"desc1", image:"https://picsum.photos/200", price:100},
    {name:"name6", descripttion:"desc1", image:"https://picsum.photos/200", price:100},
    {name:"name7", descripttion:"desc1", image:"https://picsum.photos/200", price:100},
    {name:"name8", descripttion:"desc1", image:"https://picsum.photos/200", price:100},
    {name:"name9", descripttion:"desc1", image:"https://picsum.photos/200", price:100},

];

const markup = listItems
    .map((item) => {
        // destructur
        const { name, descripttion, price, image } = item;
        return (
          `
            <div class="card ">
             <div class="photo-wrapper">
                <img
                class="card-img-top"
                src=${image}
                alt=${title}/>
             </div>
              <div class="card-body">
                <h5 class="card-name">${name} <span>${price}</span></h5>
                <p class="card-text">
                  ${descripttion}
                </p>
                <button class="gallery-btn" onclick="addToCart(${id})">Add to Cart</button>
              </div>
            </div>
          `
        )
      }
    ).join('');

root.innerHTML = markup;
