SELECT 
(
    CASE
    WHEN id%2=0 THEN id-1 
    WHEN id%2!=0 and id != (select max(id) from seat)
    Then id+1 else id end
) as id, student FROM Seat order BY id;
