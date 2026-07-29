# Write your MySQL query statement below
Select w1.id 
from Weather w1
JOIN Weather w2
 ON SubDate(w1.recordDate,1)=w2.recordDate
where w1.temperature>w2.temperature