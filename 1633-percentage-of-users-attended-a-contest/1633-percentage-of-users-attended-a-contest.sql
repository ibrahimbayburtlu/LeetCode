# Write your MySQL query statement below
SELECT 
    r.contest_id,
    ROUND(COUNT(r.user_id)*100.0 / u.total_users, 2) AS percentage
FROM 
    Register r
INNER JOIN 
    Users u ON r.user_id = u.user_id
CROSS JOIN 
    (SELECT COUNT(*) as total_users FROM Users) u
GROUP BY 
    r.contest_id
ORDER BY 
    percentage DESC,
    r.contest_id ASC;