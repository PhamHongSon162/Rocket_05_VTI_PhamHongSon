 USE `classicmodels`;
 
 /* cau 1 Tính tổng giá trị của các order đã xuất kho (‘shipped’) trong tháng Tám năm 2004 */
 
 SELECT 
       SUM(orderdetails.quantityOrdered * orderdetails.priceEach) 
FROM 
       orders
LEFT JOIN 
       orderdetails
ON     orders.orderNumber = orderdetails.orderNumber
WHERE orders.shippedDate BETWEEN '2004-08-01' AND '2004-08-31' AND orders.status = "Shipped";

/* WHERE Year.(orders.shippedDate) = '2004' AND Mounth.(orders.shippedDate) = '08'






/* cau 2 Tính lợi nhuận (profit) thu được từ mỗi khách hàng dựa trên các orders mà họ thực hiện. Liệt kê theo tên khách hàng */
SELECT 
    customers.customerName,
    SUM((orderdetails.quantityOrdered * orderdetails.priceEach)-(orderdetails.quantityOrdered * products.buyPrice)) AS 'Loi Nhuan(profit)'
FROM
    customers
LEFT JOIN
    orders
ON customers.customerNumber = orders.customerNumber
LEFT JOIN
    orderdetails
ON orders.orderNumber = orderdetails.orderNumber
LEFT JOIN products
ON orderdetails.productCode = products.productCode
GROUP BY customers.customerNumber
ORDER BY customers.customerName ASC;

/* cau 3 Tính doanh thu (revenue) mà mỗi sản phẩm mang lại. Liệt kê theo tên sản phẩm */
SELECT 
       products.productName,
        SUM(orderdetails.quantityOrdered * orderdetails.priceEach) AS 'Doanh Thu(revenue)'
FROM orderdetails
RIGHT JOIN
       products
ON products.productCode = orderdetails.productCode 
GROUP BY orderdetails.productCode
ORDER BY products.productName ASC ;




       


