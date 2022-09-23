<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http - equiv="X-UA-Compatible" content="IE-edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Laptop Management</title>
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="./font awsome icon/css/all.css">
</head>
<body>
 <a href = "addlaptop.jsp"><button>add laptop</button></a>
  <a href = "viewlaptop.jsp"><button>view laptop</button></a>
   <a href = "updatelaptop.jsp"><button>update laptop</button></a>
    <a href = "deletelaptop.jsp"><button>delete laptop</button></a>
<!-- header section -->
<header>
     <div class="header-left">
     <a href="#">Laptop Shop</a>
     <p><a href="#">Explore</a> <span>plus<i class="fas fa-plus"></i></span></p>
     </div>
     <div class="header-center">
     <input class="header-center-input" type="text" placeholder="search for products, Brands and more"><i class="fas fa-search"></i>
     </div>
     <div class="header-right">
     <a href="#">Login</a>
     <a href="#">more<i class="fas fa-sort-down"></i></a>
     <a href="#"><i class="fas fa-shopping-cart"></i>cart</a>
     </div>
</header>

<!-- category-section -->

<section>
   <div class="category-row">
      <div class="category-col">
          <img src="Pictures/dell.png" alt="">
          <h5>Dell</h5>
      </div>
   </div>
   <div class="category-row">
      <div class="category-col">
          <img src="Pictures/HP.png" alt="">
          <h5>HP</h5>
      </div>
   </div>
   <div class="category-row">
      <div class="category-col">
          <img src="Pictures/lenovo.jpg" alt="">
          <h5>Lenovo</h5>
      </div>
   </div>
   <div class="category-row">
      <div class="category-col">
          <img src="Pictures/Asus.jpg" alt="">
          <h5>Asus</h5>
      </div>
   </div>
   <div class="category-row">
      <div class="category-col">
          <img src="Pictures/Apple.jpg" alt="">
          <h5>Apple</h5>
      </div>
   </div>
   <div class="category-row">
      <div class="category-col">
          <img src="Pictures/Samsung.jpg" alt="">
          <h5>Samsung</h5>
      </div>
   </div>
</section>

<!-- banner section -->

<section>
  <div class="banner">
     <div class="slider">
       <img src="" alt="banner">
     </div>
  </div>
</section>

<!-- Dell section -->

<section>
  
  <div class="card">
     <div class="common-heading">
        <div class="common-heading-left">
           <h1>Best Bttery laptops</h1>
           <h2>More than 4000mAh</h2>
        </div>
        <div class="commom-heading-right">
        <button>view all</button>
        </div>
     </div>
  </div>
</section>
</body>
</html>