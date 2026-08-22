# Write your MySQL query statement below
select * from Users
where mail REGEXP '^(?-i)[A-Za-z][A-Za-z0-9_\.\-]*@leetcode[.]com$'
