# Write your MySQL query statement below
select DATE_FORMAT(trans_date,'%Y-%m') As month,
       country,count(id) as trans_count,
       SUM(state='approved') as approved_count,
       Sum(amount) as trans_total_amount,
       Sum(IF(state='approved',amount,0)) as approved_total_amount
From Transactions
Group by month,country