create table cafe(
id                      int			auto_increment
									primary key,
name                    char(30)	not null,
historia                text,
sabor 					text,
referencia              char(255),
imagem                  char(255),
uuid_key				char(60)	not null
)
;

create unique index cafe_nome_idx on cafe(name)
;