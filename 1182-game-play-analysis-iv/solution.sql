# Write your MySQL query statement below
SELECT ROUND(SUM(temp)/count(distinct player_id),2) as fraction
FROM (
    SELECT player_id, datediff(event_date,min(event_date) over(partition by player_id))=1 as temp 
    FROM Activity
) as t
