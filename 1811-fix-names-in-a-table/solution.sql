SELECT
    user_id,
    CONCAT(UPPER(LEFT(name, 1)), LOWER(RIGHT(name, length(name)-1))) AS name
FROM users
ORDER BY user_id;
