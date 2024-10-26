SELECT a1.name FROM Employee  a1 INNER JOIN Employee  a2 on a1.id=a2.managerId GROUP BY a1.name ,a1.id HAVING count(a2.id)>=5;
