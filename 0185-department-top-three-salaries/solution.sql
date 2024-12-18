# Write your MySQL query statement below
SELECT d.name as Department , e.name as Employee, e.salary as Salary from Employee e JOIN Department d on e.departmentId = d.id
where 3 > (
    SELECT COUNT(DISTINCT (e1.salary)) From Employee e1 Where e1.Salary>e.Salary 
    and e.departmentId = e1.departmentId
)
