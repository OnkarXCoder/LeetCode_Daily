# Write your MySQL query statement below
Select e.name,a.unique_id from Employees as e LEFT JOIN EmployeeUNI as a
ON e.id=a.id;