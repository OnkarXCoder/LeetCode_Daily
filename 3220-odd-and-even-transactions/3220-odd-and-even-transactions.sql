# Write your MySQL query statement below
Select transaction_date,
       SUM(CASE when amount%2=1 Then amount else 0 end) as odd_sum,
       SUM(CASE when amount%2=0 Then amount else 0 end) as even_sum
From transactions
group by transaction_date
order by transaction_date;