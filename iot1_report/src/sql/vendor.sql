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