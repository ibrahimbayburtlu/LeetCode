# Write your MySQL query statement below
SELECT query_name,
ROUND (AVG(CAST(rating as decimal) / position),2)AS quality,
ROUND (SUM(CASE WHEN rating < 3 then 1 else 0 END) * 100 / COUNT(*),2) AS poor_query_percentage
FROM Queries
group by
query_name;


