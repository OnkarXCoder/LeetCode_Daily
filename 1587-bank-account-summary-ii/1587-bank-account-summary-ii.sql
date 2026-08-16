# Write your MySQL query statement below
Select u.name,SUM(t.amount) as balance
From Users u Join Transactions t
On u.account=t.account
group by u.account,u.name
having SUM(t.amount)>10000;