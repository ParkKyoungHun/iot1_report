CREATE TABLE VENDOR_INFO( #제품생성자 테이블(생성회사 정보)
VINUM INT AUTO_INCREMENT PRIMARY KEY,
VINAME VARCHAR(200) NOT NULL,#회사이름
VIDESC VARCHAR(300) NOT NULL,#회사설명
VIADDRESS VARCHAR(300) NOT NULL,#회사주소
VIPHONE VARCHAR(20) NOT NULL,#회사전화번호
VICREDAT VARCHAR(8) NOT NULL,#데이터생성일자
VICRETIM VARCHAR(6) NOT NULL);#데이터생성시간

CREATE TABLE GOODS_INFO( #제품정보 테이블
GINUM INT AUTO_INCREMENT PRIMARY KEY, 
GINAME VARCHAR(200) NOT NULL,#제품이름
GIDESC VARCHAR(300) NOT NULL,#제품설명
VINUM INT NOT NULL,          #생산회사 번호
GICREDAT VARCHAR(8) NOT NULL,#데이터 생성일자
GICRETIM VARCHAR(6) NOT NULL); #데이터 생성시간

 select gi.ginum, gi.giname, gi.gidesc, gi.vinum,
 gi.gicredat, gi.gicretim,
 vi.viname, vi.videsc, vi.viaddress, vi.viphone
  from GOODS_INFO gi, vendor_info vi
 where gi.vinum=vi.vinum;

select DATE_FORMAT(NOW(),'%Y%m%d');
select DATE_FORMAT(NOW(),'%H%i%s');

CREATE PROCEDURE p_insert_goods_info(IN loop_cnt int(1))
BEGIN
	DECLARE i INT DEFAULT 0;

	/* 만약 SQL에러라면 ROLLBACK 처리한다. */
	DECLARE exit handler for SQLEXCEPTION
	  BEGIN
		ROLLBACK;        
	END;
	/* 트랜젝션 시작 */
	START TRANSACTION;
	WHILE (i <= loop_cnt) DO
        INSERT INTO goods_info(giname,gidesc, vinum, gicredat,gicretim)
        VALUES (concat('giname',i), concat('gidesc', i), 1, 
		  DATE_FORMAT(NOW(),'%Y%m%d'), DATE_FORMAT(NOW(),'%H%i%s'));
        SET i = i + 1;
    END WHILE;
	/* 커밋 */
	COMMIT;
END
$$
delimiter ;

drop procedure p_insert_goods_info;
call p_insert_goods_info(1000);