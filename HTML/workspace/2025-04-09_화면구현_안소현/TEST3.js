const smallgImg = document.querySelectorAll('.sImg div')
const bigImage = document.querySelectorAll('.bigImg img')
for(let i = 0; i < smallgImg.length; i++){
    smallgImg[i].addEventListener('click', function(){
        for(let j = 0; j < smallgImg.length; j++){
            bigImage[j].style.display = 'none';
        }
        bigImage[i].style.display = 'block';
    })
}
 
for(let k = 0; k < smallgImg.length; k++){
    smallgImg[k].addEventListener('click', function(){
        for(let l = 0; l < smallgImg.length; l++){
            smallgImg[l].style.border = 'none'
        }
        smallgImg[k].style.border = '5px solid red'
    }
    )}
    

 
    