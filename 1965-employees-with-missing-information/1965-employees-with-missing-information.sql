# Write your MySQL query statement below
Select employee_id  from Employees
Where employee_id not in(Select employee_id  from Salaries)
UNION
Select employee_id from Salaries 
Where employee_id not in (Select employee_id from Employees)
Order by employee_id;