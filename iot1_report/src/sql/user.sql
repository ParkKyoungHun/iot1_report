# iot_test 라는 데이터베이스 생성
create database iot_test;

# iot_test데이터 베이스 선택
# 이후 모든 작업은 데이터베이스를 변경하기 전까지 해당 데이터 베이스에서 이루어짐
use iot_test;


# user_info라는 테이블 생성
create table user_info(
#user_num이라는 컬럼명에 자료형은 int, 자동증가이며 해당테이블의 기본키
#기본키는 중복 불가
user_num int(5) auto_increment primary key,
user_id varchar(30) not null ,
user_pwd varchar(30) not null,
user_name varchar(100) not null,
class_num int(5) not null,
age int(3),
#기본키는 아니지만 user_id로 인덱스가 만들어지며 unique이기 때문에 중복불가
unique index(user_id)
);

select * from board;

# board라는 테이블 삭제
drop table board;

create table board(
board_num int(7) auto_increment primary key,
title varchar(100) not null,
content text,
user_num int(5),
#board테이블의 user_num이 user_info의 user_num을 참조하게 되며
# 이를 외래키라고 부른다
# 외래키를 설정하게 될경우 참조하는 테이블의 컬럼에 값이 없을경우 저장할 수 없다
foreign key (user_num) references user_info(user_num)
)

#user_info테이블을 수정할건데
#class_num이라는 컬럼명의 int타입을 가지고 null을 허용하지 않는 컬럼을 추가하겠다는 문구
alter table user_info
add column class_num int(5) not null;


#user_info테이블을 수정할건데
#num이라는 컬럼의 이름을 user_num으로 바꾸고 int타입으로 선언하겠다는 문구
ALTER TABLE user_info
CHANGE COLUMN num user_num int;


#user_info테이블을 수정할건데
#id컬럼을 중복불가 인덱스로 추가 하겠다는 문구
alter table user_info 
add unique index(user_id);