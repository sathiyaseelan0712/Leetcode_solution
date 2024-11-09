SELECT visited_on, amount, average_amount
FROM(
    SELECT visited_on,
    ROUND(SUM(SUM(amount)) OVER(ROWS BETWEEN 6 PRECEDING AND CURRENT ROW),2) AS amount,
    ROUND(AVG(SUM(amount)) OVER(ROWS BETWEEN 6 PRECEDING AND CURRENT ROW),2) AS average_amount,
    ROW_NUMBER() OVER() new
    FROM Customer
    group by visited_on
    order by visited_on
) new_tb
where new >=7
