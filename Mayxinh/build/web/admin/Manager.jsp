
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manager</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:400,700" />
        <!-- https://fonts.google.com/specimen/Roboto -->
        <link rel="stylesheet" href="css/fontawesome.min.css" />
        <!-- https://fontawesome.com/ -->
        <link rel="stylesheet" href="css/bootstrap.min.css" />
        <!-- https://getbootstrap.com/ -->
        <link rel="stylesheet" href="css/templatemo-style.css">
    </head>
    <body id="reportsPage">


        <div class="container mt-5">
            <div class="row tm-content-row">
                <div class="col-sm-12 col-md-12 col-lg-8 col-xl-8 tm-block-col">
                    <div class="tm-bg-primary-dark tm-block tm-block-products">
                        <div class="tm-product-table-container">
                            <table class="table table-hover tm-table-small tm-product-table" id="grid">
                                <thead>
                                    <tr>                                       
                                        <th scope="col">ID</th>
                                        <th scope="col">&nbsp;</th>
                                        <th scope="col" data-type="string">Tên sản phẩm</th>
                                        <th scope="col" data-type="number">Giá bán</th>
                                        <th scope="col">&nbsp;</th>
                                        <th scope="col">Trong kho</th>                                     
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${listProducts}" var="product">
                                        <tr >
                                            <th scope="row"><input type="checkbox" /></th>
                                            <td>${product.id}</td>
                                            <td class="tm-product-name" onclick="document.location = 'edit-product?id=${product.id}'">${product.name}</td>
                                            <td>${product.price}</td>
                                            <td>${product.quantity}</td>
                                            <td>
                                                <a href="delete?id=${product.id}" class="tm-product-delete-link">
                                                    <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                                </a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                        <!-- table container -->
                        <a href="add-product" class="btn btn-primary btn-block text-uppercase mb-3">Add new product</a>
                        <button class="btn btn-primary btn-block text-uppercase">
                            Xoá sản phẩm đã chọn
                        </button>
                    </div>
                </div>
                <div class="col-sm-12 col-md-12 col-lg-4 col-xl-4 tm-block-col">
                    <div class="tm-bg-primary-dark tm-block tm-block-product-categories">
                        <h2 class="tm-block-title">Product Categories</h2>
                        <div class="tm-product-table-container">
                            <table class="table tm-table-small tm-product-table">
                                <tbody>
                                    <c:forEach items="${listCategories}" var="category">
                                        <tr>
                                            <td class="tm-product-name">${category.categoryName}</td>
                                            <td class="text-center">
                                                <a href="#" class="tm-product-delete-link">
                                                    <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                                </a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                        <!-- table container -->
                        <button class="btn btn-primary btn-block text-uppercase mb-3">
                            Add new category
                        </button>
                    </div>
                </div>
            </div>
        </div>

        <script src="js/jquery-3.3.1.min.js"></script>
        <!-- https://jquery.com/download/ -->
        <script src="js/bootstrap.min.js"></script>
        <!-- https://getbootstrap.com/ -->
        <script>
                                                grid.onclick = function (e) {
                                                    if (e.target.tagName != 'TH')
                                                        return;

                                                    let th = e.target;
                                                    // if TH, then sort
                                                    // cellIndex is the number of th:
                                                    //   0 for the first column
                                                    //   1 for the second column, etc
                                                    sortGrid(th.cellIndex, th.dataset.type);
                                                };

                                                function sortGrid(colNum, type) {
                                                    let tbody = grid.querySelector('tbody');

                                                    let rowsArray = Array.from(tbody.rows);

                                                    // compare(a, b) compares two rows, need for sorting
                                                    let compare;

                                                    switch (type) {
                                                        case 'number':
                                                            compare = function (rowA, rowB) {
                                                                return rowA.cells[colNum].innerHTML - rowB.cells[colNum].innerHTML;
                                                            };
                                                            break;
                                                        case 'string':
                                                            compare = function (rowA, rowB) {
                                                                return rowA.cells[colNum].innerHTML > rowB.cells[colNum].innerHTML ? 1 : -1;
                                                            };
                                                            break;
                                                    }

                                                    // sort
                                                    rowsArray.sort(compare);
                                                    tbody.append(...rowsArray);
                                                }
        </script>
    </body>
</html>
