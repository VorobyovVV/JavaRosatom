SELECT surname
FROM (
  SELECT surname, ROW_NUMBER() OVER (ORDER BY experience DESC) as exp_rank
  FROM employees
) as subquery
WHERE exp_rank = 2