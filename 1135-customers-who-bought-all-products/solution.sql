# Write your MySQL query statement below
SELECT customer_id
FROM Customer
Group by customer_id 
Having COUNT(Distinct product_key) = (Select COUNT(product_key) from Product);
