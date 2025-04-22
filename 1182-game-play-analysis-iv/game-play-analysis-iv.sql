# Write your MySQL query statement below
with x as (select player_id, min(event_date) as first_date
from activity group by player_id)

select round(count(case when (datediff(event_date,first_date) = 1)
then 1 end)/count(distinct x.player_id),2) as fraction 
from activity join x 
on activity.player_id = x.player_id;