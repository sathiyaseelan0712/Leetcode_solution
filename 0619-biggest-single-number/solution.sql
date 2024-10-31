# Write your MySQL query statement below
Select (Select num FROM MyNumbers Group by num HAving Count(num) =1  Order by num desc limit 1 ) as num;
