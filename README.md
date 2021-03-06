#### **HW2**

1. Configure Spring Security for a web application—add DelegatingFilterProxy to web.xml.
2. Configure access control via security namespace. 
Users with role RESGISTERED_USER can only view information about himself. 
Adding new users, view and managing all users should be accessible only to users 
with the role BOOKING_MANAGER. 
Add two new fields to User entity: password and roles. 
Roles field should contain a comma-separated list of user roles. 
All users in the database should have the REGISTERED_USER role by default.
3. Implement a form-based login via security namespace, add a custom login page, 
configure DAOAuthenticationProvider and UserDetailsService to load user data 
from the database. Configure a logout filter.
4. Configure Remember-Me authentication.
5. Implement password encoding during authentication.

 PostgreSQL security_db database - must be created.
 
 After user registered - have to use src\main\resources\data.sql for creating roles.
 
 Then use src\main\resources\data.sql for providing this user with admin role.
 
 Initial page: http://localhost:8080/
