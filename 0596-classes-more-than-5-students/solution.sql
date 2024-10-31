# Write your MySQL query statement below
Select class from Courses
GROUP BY class
HAVING Count(1) >= 5;
