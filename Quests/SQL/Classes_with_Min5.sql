SELECT class as class
from Courses
Group by class
having count(class) >= 5