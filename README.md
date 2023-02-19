# User
## Framework And language used
- SpringBoot
- Java
## Data Flow
### Controller
 1) UserController
 2) AddressController
 3) OrderController
 4) ProductController
### Service
 1) UserService
 2) AddressService
 3) OrderService
 4) ProductService
### Repository
 - JpaRepository
### Database Design
 - Here we are using the H2 DataBase and it is in a Tabular Form
## Data Structure used
 - NA
## Project Summary
 In this Project we are performing the CRUD operations by hitting the API and here we have the links :
 1) User
  - PostMapping -> http://localhost:8080/Createuser
  - GetMapping  -> http://localhost:8080/getAllUser
  - GetMapping (by Id) ->http://localhost:8080/userid/{id}
  2) Product
 - PostMapping -> http://localhost:8080/createpro
 - GetMapping - > http://localhost:8080/getAllProduct
 - GetMapping (by Id) -> http://localhost:8080/productid/{id}
  3) Order
 - PostMapping -> http://localhost:8080/Order/createorder
 - GetMapping (by Id) ->http://localhost:8080/orderid/{id}
  4) Address
 - PostMapping -> http://localhost:8080/Createaddress












