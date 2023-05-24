create table usuario(
id                      bigint		auto_increment
									primary key,
login                   char(30)	not null,
senha					char(60)	not null
)
;

create unique index usuario_login_idx on usuario(login)
;