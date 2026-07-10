CREATE OR REPLACE PROCEDURE TransferFunds(

p_source NUMBER,

p_destination NUMBER,

p_amount NUMBER

)

IS

v_balance NUMBER;

BEGIN

    SELECT Balance

    INTO v_balance

    FROM Accounts

    WHERE AccountID=p_source;

    IF v_balance>=p_amount THEN

        UPDATE Accounts

        SET Balance=Balance-p_amount

        WHERE AccountID=p_source;

        UPDATE Accounts

        SET Balance=Balance+p_amount

        WHERE AccountID=p_destination;

        COMMIT;

        DBMS_OUTPUT.PUT_LINE('Transfer Successful');

    ELSE

        DBMS_OUTPUT.PUT_LINE('Insufficient Balance');

    END IF;

END;
/