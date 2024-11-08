# Write your MySQL query statement below
SELECT p.product_name, SUM(o.unit) as unit
FROM Orders o 
INNER JOIN Products p
on p.product_id = o.product_id
WHERE  month(o.order_date)=2 and year(o.order_date)=2020
GROUP By product_name
HAVING SUM(o.unit)>=100;

