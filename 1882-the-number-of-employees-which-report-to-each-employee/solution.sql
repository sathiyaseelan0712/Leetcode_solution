# Write your MySQL query statement below
SELECT 
    m.employee_id, 
    m.name, 
    count(e.employee_id) as reports_count, 
    round(avg(e.age)) as average_age
FROM employees e join employees m
on e.reports_to = m.employee_id
group by employee_id
order by employee_id;
