SELECT * FROM EMP;
SELECT * FROM DEPT;
SELECT * FROM BONUS;
SELECT * FROM SALGRADE;
SELECT UPPER('yes') FROM DUAL;
select lower('YES') FROM DUAL;
select round (56.12,-1) from dual;
select mod(10,3) from dual;
select sysdate-e.hiredate from emp e;
select sysdate+1 from dual;
select months_between(sysdate,e.hiredate) from emp e;
select months_between(sysdate,e.hiredate)/12 from emp e;
select round((sysdate-e.hiredate)/7) from emp e;
select to_char(sysdate,'fm yyyy-mm-dd hh:mi') from dual;
select to_date('1996-5-9 07:00:01','fm yyyy-mm-dd hh24:mi:ss') from dual;
select e.sal*12+nvl(e.comm,0) from emp e;
select e.ename,
case e.ename
when 'SMITh' THEN '张三'
  when 'ALLEN' THEN '李四'
    when 'WARD' THEN '王五'
      else '鬼脚七'
        end
 from emp e;
select e.ename, 
        decode(e.ename,
          'SMITH',  '曹贼',
            'ALLEN',  '大耳贼',
              'WARD',  '诸葛小儿',
                '无名') "中文名"             
from emp e;
select e.sal, 
       case 
         when e.sal>3000 then '高收入'
           when e.sal>1500 then '中等收入'
               else '低收入'
                 end
from emp e;
select count(1)from emp;
---查询出每个部门工资高于800的员工的平均工资
---然后再查询出平均工资高于2000的部门
select e.deptno,avg(e.sal) asal
from emp e
group by e.deptno
having avg(e.sal)>2000;
