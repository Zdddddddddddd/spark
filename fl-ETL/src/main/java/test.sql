--5.2.13 按平均成绩从高到低显示所有学生的所有课程的成绩以及平均成绩
select *
from(
        select t3.stu_name name,sum(t3.course) sum_score,avg(t3.course)avg_score
        from(
                select *
                from student t1 join (
                    select *
                    from course join score s on course.course_id = s.course_id
                )t2 on t1.stu_id=t2.stu_id
            )t3
group by t3.stu_name
        )t4
order by t4.avg_score desc;


--6.1.1 查询每个学生的学生平均成绩及其名次
select t1.stu_name,avg(t1.course) avg_score,row_number()
from(
        select *
        from student t1 join (
            select *
            from course join score s on course.course_id = s.course_id
        )t2 on t1.stu_id=t2.stu_id
    )t1
group by t1.stu_name;
select *,row_number() over (order by t4.avg_score desc)
from(
        select t3.stu_name,avg(t3.course) avg_score
        from(
                select *
                from student t1 join (
                    select *
                    from course join score s on course.course_id = s.course_id
                )t2 on t1.stu_id=t2.stu_id
            )t3
        group by t3.stu_name
    )t4;
--6.1.2 按各科成绩进行排序，并显示在这个学科中的排名
select *,row_number() over (partition by t3.course_id order by t3.course desc)
from(
        select *
        from student t1 join (
            select *
            from course join score s on course.course_id = s.course_id
        )t2 on t1.stu_id=t2.stu_id
    )t3;
select *
