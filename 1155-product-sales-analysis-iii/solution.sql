# Write your MySQL query statement below
select product_id, year as first_year, quantity, price 
FROM Sales
where (product_id, year) in (Select product_id, min(year) from Sales
Group by product_id);
