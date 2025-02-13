-- ayush
SELECT e.unique_id, e.name
FROM (
    SELECT emp.name, eu.unique_id
    FROM Employees emp
    LEFT JOIN EmployeeUNI eu ON emp.id = eu.id
) e;
