# Write your MySQL query statement below
Select id,
   MAX(If(month="Jan",revenue,NULL)) AS Jan_revenue,
   MAX(If(month="feb",revenue,NULL)) AS Feb_revenue,
   MAX(If(month="Mar",revenue,NULL)) AS Mar_revenue,
   MAX(If(month="Apr",revenue,NULL)) AS Apr_revenue,
   MAX(If(month="May",revenue,NULL)) AS May_revenue,
   MAX(If(month="Jun",revenue,NULL)) AS Jun_revenue,
   MAX(If(month="Jul",revenue,NULL)) AS Jul_revenue,
   MAX(If(month="Aug",revenue,NULL)) AS Aug_revenue,
   MAX(If(month="Sep",revenue,NULL)) AS Sep_revenue,
   MAX(If(month="Oct",revenue,NULL)) AS Oct_revenue,
   MAX(If(month="Nov",revenue,NULL)) AS Nov_revenue,
   MAX(If(month="Dec",revenue,NULL)) AS Dec_revenue
From Department
Group by id 