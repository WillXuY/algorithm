Create table If Not Exists Salary (id int, name varchar(100), sex char(1), salary int)
Truncate table salary
insert into salary (id, name, sex, salary) values ('1', 'A', 'm', '2500')
insert into salary (id, name, sex, salary) values ('2', 'B', 'f', '1500')
insert into salary (id, name, sex, salary) values ('3', 'C', 'm', '5500')
insert into salary (id, name, sex, salary) values ('4', 'D', 'f', '500')

-- id is the primary key for this table.
-- The sex column is ENUM value of type ('m', 'f').
-- The table contains information about an employee.

/*
Write an SQL query to swap all 'f' and 'm' vales (i.e., change all 'f'
values to 'm' and vice versa) with a single update statement and no
intermediate temporary tables.
Note that you must write a single update statement, do not write any
select statement for this problem.
The query result format is in the following example.
 */

UPDATE salary
SET sex =
  CASE sex
  WHEN 'm' THEN 'f'
  ELSE 'm'
  END;
