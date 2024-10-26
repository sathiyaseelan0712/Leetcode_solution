# Write your MySQL query statement below
SELECT customer_id, COUNT(customer_id) as count_no_trans FROM Visits where visit_id NOT IN(SELECT visit_id from Transactions) GROUP BY customer_id;
