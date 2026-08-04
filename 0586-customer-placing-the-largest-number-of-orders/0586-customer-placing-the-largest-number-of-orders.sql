# Write your MySQL query statement below
Select customer_number
from Orders
Group by customer_number
order by COUNT(customer_number) desc
limit 1; 