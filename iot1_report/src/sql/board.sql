create table board_info(
binum int(5) auto_increment primary key,
bititle varchar(255) not null,
bicontent text not null,
bipwd varchar(100) not null
creusr varchar(100) not null,
credat datetime not null
)
/*
board_info테이블의 insert, select, delete 만들어주시고
삭제나 수정시에는 비밀번호를 입력하여 비밀번호가 맞을때만 삭제나 수정이 가능하게
만들어 주세요.
*/