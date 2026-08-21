# Write your MySQL query statement below
Select user_id,
      CONCAT(
        UPPER(SUBSTRING(name,1,1)),
        LOWER(SUBSTRING(name,2,length(name)))
      ) As name
From Users
order by user_id;