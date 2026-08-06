# Write your MySQL query statement below
Select employee_id from Employees 
where manager_id is not null and salary<30000 And manager_id not in (Select employee_id from Employees)
order by employee_id;