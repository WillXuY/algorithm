Create table If Not Exists World (name varchar(255),
  continent varchar(255), area int, population int, gdp int)
Truncate table World
insert into World (name, continent, area, population, gdp)
  values ('Afghanistan', 'Asia', '652230', '25500100', '20343000000')
insert into World (name, continent, area, population, gdp)
  values ('Albania', 'Europe', '28748', '2831741', '12960000000')
insert into World (name, continent, area, population, gdp)
  values ('Algeria', 'Africa', '2381741', '37100000', '188681000000')
insert into World (name, continent, area, population, gdp)
  values ('Andorra', 'Europe', '468', '78115', '3712000000')
insert into World (name, continent, area, population, gdp)
  values ('Angola', 'Africa', '1246700', '20609294', '100990000000');

/*
A country is big if it has an area of bigger than 3 million square km or
a population of more than 25 million.
Write a SQL solution to output big countries' name, population and area.
For example, according to the above table, we should output:

+--------------+-------------+--------------+
| name         | population  | area         |
+--------------+-------------+--------------+
| Afghanistan  | 25500100    | 652230       |
| Algeria      | 37100000    | 2381741      |
+--------------+-------------+--------------+

 */

SELECT name, population, area
FROM World
Where population > 25000000
OR area > 3000000;
