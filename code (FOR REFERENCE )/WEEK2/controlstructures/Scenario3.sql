
SET SERVEROUTPUT ON;
BEGIN
    FOR rec IN (
        SELECT customer_id, due_date
        FROM loans
        WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan for customer ' || rec.customer_id ||
                             ' is due on ' || TO_CHAR(rec.due_date, 'DD-MON-YYYY'));
    END LOOP;
END;
/