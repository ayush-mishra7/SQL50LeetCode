# Write your MySQL query statement below
SELECT 
    contest_id,
    ROUND(
        COUNT(DISTINCT r.user_id) * 100.0 / (SELECT COUNT(*) FROM Users), 2
    ) AS percentage
FROM 
    Register r
GROUP BY 
    contest_id
-- Order by percentage descending first, then contest_id ascending in case of a tie
ORDER BY 
    percentage DESC, contest_id ASC;