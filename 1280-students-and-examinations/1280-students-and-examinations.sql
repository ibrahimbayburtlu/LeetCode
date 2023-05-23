# Write your MySQL query statement below
select s.Student_id, s.Student_name, u.subject_name, count(e.subject_name) as attended_exams from
Students as s join Subjects as u left join Examinations as e on
s.student_id = e.student_id and u.subject_name = e.subject_name
group by s.student_id, u.subject_name order by s.student_id, u.subject_name