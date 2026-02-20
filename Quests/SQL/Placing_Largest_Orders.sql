SELECT customer_number
from Orders
Group BY customer_number
order by count(customer_number) DESC
Limit 1 