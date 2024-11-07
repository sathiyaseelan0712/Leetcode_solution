# Write your MySQL query statement below
SELECT (
    SELECT salary 
    FROM Employee 
    GROUP BY salary 
    ORDER BY salary desc limit 1,1
) as SecondHighestSalary;
