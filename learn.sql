CREATE TABLE if not exists  employees (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    salary INT,
    city VARCHAR(50)
);


INSERT INTO employees (id, name, department, salary, city)
VALUES
(1, 'Ravi', 'IT', 60000, 'Hyderabad'),
(2, 'Priya', 'HR', 50000, 'Pune'),
(3, 'Arjun', 'IT', 75000, 'Pune'),
(4, 'Sneha', 'Sales', 45000, 'Mumbai'),
(5, 'Kiran', 'IT', 80000, 'Hyderabad');



SELECT name,salary from employees ;

select name,salary from employees where salary > 50000;

select name,salary from employees where salary > 50000 and city = 'Pune';  
<!-- we can also use or as well -->

SELECT name, city
FROM employees
WHERE salary BETWEEN 50000 AND 75000;

select name,department from employees where department in ('IT','HR','Sales');

select name,department from employees where department not in ('IT','HR');

select name from employees where name like 'A%';

select name from employees where name like '%A';  <!-- here  the A is not case sensitive -->

select name from employees where name like '%i%';

select name from employees where name like '____';

select name,salary from employees where city in ('Pune','Hyderabad') and salary >=60000 and name like '%r%';

select name,salary  from employees order by salary desc;

select distinct city from employees;


select name,salary  from employees order by salary desc limit 1;

select name,salary  from employees order by salary desc  limit 1 offset 1;

select name,department, salary  from employees order by department ,salary desc;

select count(*) from employees;

select sum(salary) from employees;

select avg(salary) from employees;

select min(salary),max(salary) from employees;


select avg(salary) from employees group by department;

select sum(salary) from employees group by department;

SELECT department, AVG(salary) AS avg_salary
FROM employees
GROUP BY department
HAVING AVG(salary) > 60000;


select department from employees group by department having count(*) >= 2;

select department from employees where salary >60000 group by department having count(*) >=2;

select department from employees group by department having sum(salary) > 100000;

select department from employees group by department having count(*) >= 2 and avg(salary) > 60000;


SELECT DISTINCT salary
FROM employees
ORDER BY salary DESC
LIMIT 1 OFFSET 1;


SELECT MAX(salary) AS second_highest
FROM employees
WHERE salary < (
    SELECT MAX(salary)
    FROM employees
);


select * from employees where salary > (select avg(salary) from employees);

select * from employees e where salary > (select avg(salary) from employees e2 where  e.department = e2.department);

select * from employees where department in (select department from employees where name = 'Arjun');



















SELECT e.name AS employee,
       m.name AS manager
FROM employees e
LEFT JOIN employees m
ON e.manager_id = m.id; 