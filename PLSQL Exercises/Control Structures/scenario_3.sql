SET SERVEROUTPUT ON;

BEGIN

    FOR loan IN (

        SELECT c.Name,
               l.EndDate

        FROM Customers c

        JOIN Loans l

        ON c.CustomerID=l.CustomerID

        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE+30

    )

    LOOP

        DBMS_OUTPUT.PUT_LINE(

            'Reminder: '

            ||loan.Name||

            ' loan due on '

            ||loan.EndDate

        );

    END LOOP;

END;
/