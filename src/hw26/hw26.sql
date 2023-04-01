SELECT * FROM employees
WHERE officeCode in (4,5,6,7);
SELECT * FROM employees
WHERE (officeCode >=4) and (officeCode <=7);
SELECT * FROM employees
WHERE officeCode  between 4 and 7;
SELECT * FROM products
WHERE productName Like '1936%';
SELECT * FROM products
WHERE productVendor in ('Motor City Art Classics', 'Exoto Designs') and productScale = '1:24';
SELECT * FROM orders 
WHERE shippedDate is Null;
SELECT * FROM offices
ORDER BY city DESC;
SELECT * FROM  products
ORDER BY productVendor;
