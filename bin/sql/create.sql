create sequence seq start with 1 increment by 1 ;
create function getSeq return number is 
begin 
return seq.nextval ;
end ;
/
create function getPasse return String is 
begin 
return select nomJoueur from equipe  ;
end ;
/
create table equipe (
idEquipe integer primary key ,
nomEquipe varchar(25) ,
nombreJoueur varchar (25),
nomJoueur varchar(15) 
) ;
 
create table tir (
idTir integer primary key ,
idEquipe int,
nombreDeTirJoueur int ,
nombreDetirMarque int,
foreign key (idEquipe) references equipe(idEquipe)
);

create table passe (
idPasse integer primary key ,
PersonnPasse varchar (25) ,
PersonnAvant varchar (25),
nombrePasseParJoueur int
);

create table ballec (
idBallec integer primary key,
idEquipe int,
idTir int ,
nombreBalleMarque int,
nombreBallePerdue int,
foreign key (idEquipe) references equipe(idEquipe),
foreign key (idTir) references tir(idTir)
);