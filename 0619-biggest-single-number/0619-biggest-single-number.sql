# Write your MySQL query statement below
Select MAX(num) as num from MyNumbers
where num IN(
    Select num from MyNumbers group by num having Count(num)=1
)