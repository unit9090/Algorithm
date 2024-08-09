-- 1. 7월 총 주문량과 상반기 아이스크림 총 주문량을 더한 값 - RANK
-- 2. RANK가 큰 값으로 ORDER BY 후 3개의 FLAVOR 뽑기
SELECT
    FLAVOR
FROM (
    SELECT
         T.FLAVOR
        ,SUM(T.TOTAL_ORDER) AS TOTAL
    FROM (
        SELECT
             FH.FLAVOR      AS FLAVOR
            ,FH.TOTAL_ORDER AS TOTAL_ORDER
        FROM FIRST_HALF FH

        UNION ALL

        SELECT
             J.FLAVOR      AS FLAVOR
            ,J.TOTAL_ORDER AS TOTAL_ORDER
        FROM JULY J
    ) T
    GROUP BY T.FLAVOR
    ORDER BY TOTAL DESC
)
WHERE ROWNUM <= 3