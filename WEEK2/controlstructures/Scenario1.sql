-- Scenario 1: Apply 1% discount to loan interest rates for customers above 60
BEGIN
    FOR rec IN (SELECT customer_id, age FROM customers) LOOP
        IF rec.age > 60 THEN
            UPDATE loans
            SET interest_rate = interest_rate - 1
            WHERE customer_id = rec.customer_id;
        END IF;
    END LOOP;
    COMMIT;
END;
/