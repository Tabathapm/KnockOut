/* Script de la db */

USE db;

INSERT INTO personaje(nombre, imagen, descripcion, enVenta, enMiColeccion, monto)
VALUES
('Iron Man', 'iron_man.jpg', 
'Más conocido como Tony Stark, es un multimillonario magnate empresarial, filántropo, playboy e ingenioso científico' ,true, false, 10000.00),
('Thor', 'thor.jpg', 'Dios del trueno y fuerza en la mitología nórdica y germánica' ,true, false, 10500.50),
('Valkiria', 'valkiria.jpg', 
'Conocida por su destreza en la batalla, a menudo se acompaña de su caballo alado Aragorn y lleva la espada encantada Dragonfang' ,true, false, 5000.0),
('Capitán América', 'capitan_america.jpg', 
'Cuyo nombre real es Steven Grant Rogers, es un super soldado de los Estados Unidos de América' ,true, false, 8600.75),
('Capitana Marvel', 'capitana_marvel.jpg', 
'Cuyo nombre real es Carol Danvers, después de que su ADN se fusionara con el de Mar-Vell, obtiene poderes sobrehumanos' ,true, false, 9875.58),
('Black Widow','black_widow.jpg', 
'Experta espía y combatiente cuerpo a cuerpo. Convocada por Nick Fury, es miembro fundador de la Iniciativa Vengadores.' ,true, false, 10000.00),
('Hawkeye', 'hawkeye.jpg', 
'Su nombre real es Clint Barton. Tirador experto y un combatiente cuerpo a cuerpo, siendo su arma preferida es un arco recurvo.' ,true, false, 5000.75),
('Hulk', 'hulk.jpg', 
'Ser humanoide enorme de piel verde, corpulento y musculoso que posee una gran fortaleza física.' ,true, false, 5000.80),
('Kate Bishop', 'kate_bishop.jpg', 
 'Miembro de los Jóvenes Vengadores. Tomar el nombre del Ojo de Halcón (Hawkeye) después de Clint Barton' ,true, false, 1000.20),
('Lady Thor', 'lady_thor.jpg', 
'Cuyo nombre es Jane Foster, científica astrofísica. Al hacerse con la legendaria arma llamada Mjölnir, obtiene los poderes de Thor' ,true, false, 7800.00),
('Star Lord', 'star_lord.jpg',
'Híbrido Celestial-humano, legendario forajido, líder de Los Guardianes de la Galaxia.' ,true, false, 8900.25),
('Ultron', 'ultron.jpg', 'Inteligencia artificial que trata de eliminar a los superheroes.' ,true, false, 6000.0),
('Venom', 'venom.jpg', 
'Simbionte con una forma amorfa, semi-líquido, que sobrevive mediante la unión con un huésped, por lo general humano.' ,true, false, 7460.23),
('Black Panther', 'black_panther.jpg',
'Rey y protector de Wakanda, poseer habilidades mejoradas logradas a través de rituales antiguos de Wakanda.' ,true, false, 9000.00),
('Doctor Strange', 'doctor_strange.jpg', 
'Poderoso hechicero y miembro destacado de los Maestros de las Artes Místicas.' ,true, false, 12500.00),
('Loki','loki.jpg', 
'Dios de las Mentiras, Prínciper de Asgard, hermano de Thor' ,true, false, 8500.78),
('Scarlet Witch', 'scarlet_witch.jpg', 
'Posee habilidades para alterar la realidad de formas no especificadas y es, además, una poderosa hechicera.' ,true, false, 15500.00),
('Shang-Chi', 'shang-chi.jpg', 
'Maestro de artes marciales con habilidades insuperables por muchos, heredero de los Anillos Místicos.' ,true, false, 9000.00),
('Deadpool', 'deadpool.jpg', 
'Mercenario y antiheroe, mentalmente inestable y desfigurado' ,true, false, 14000.00),
('Duende Verde', 'duende_verde.jpg',
'Supervillano con temática de Halloween cuyas armas se asemejan a murciélagos, fantasmas y linternas de calabaza. Es estrambótico, bocazas y políticamente incorrecto.' ,true, false, 4000.00);



-- insert leandro--

insert into personaje(nombre,imagen,descripcion,enVenta, enMiColeccion, monto)
values('Ermac','ermac.jpg',
       'Ermac es una entidad compuesta de legiones de almas de los muertos, que se enviaron a guerras sin sentido, la manera en que las almas fueron fusionados en Ermac es desconocida.',false,true,5000.00);



insert into personaje(nombre,imagen,descripcion,enVenta, enMiColeccion, monto)
values('Johnny Cage','johnny.jpg',
       'Una superestrella de las artes marciales entrenado por grandes maestros de todo el mundo.',true,false,8000.00);

insert into personaje(nombre,imagen,descripcion,enVenta, enMiColeccion, monto)
values('Kitana','kitana.jpg',
       'Princesa del místico reino de Edenia,el arma de Kitana es un par de abanicos de acero con puntas afiladas',true,false,8500.00);

insert into personaje(nombre,imagen,descripcion,enVenta, enMiColeccion, monto)
values('Liu Kang','liukang.jpg',
       'Liu Kang sigue las enseñanzas de la Sociedad del Loto Blanco del Shaolin y fue enviado por el Templo de la Luz a derrotar al hechicero Shang Tsung.',true,false,9000.00);

insert into personaje(nombre,imagen,descripcion,enVenta, enMiColeccion, monto)
values('Mileena','milena.jpg',
       ' Mileena es un clon de Kitana. Su odio hacia Kitana consume sus pensamientos; desea matarla para tomar el trono de Edenia.',true,false,5600.00);


insert into personaje(nombre,imagen,descripcion,enVenta, enMiColeccion, monto)
values('Reptile','reptile.jpg',
       'Un general del ejército de la oscuridad de Shinnok, Reptile pertenece a una raza extinta de criaturas reptilianas. Fue desterrado al Netherrealm acusado del genocidio contra su propia especie.',false,true,8300.00);

insert into personaje(nombre,imagen,descripcion,enVenta, enMiColeccion, monto)
values('Scorpion','scorpion.jpg','Espectro Ninja no muerto que busca venganza por su propia muerte a manos de Sub-Zero.',false,true,10000.00);

insert into personaje(nombre,imagen,descripcion,enVenta, enMiColeccion, monto)
values('Shang Tsung','shang.jpg','Es un poderoso hechicero con la capacidad de absorber almas y cambiar de forma. Bajo el mando de Shao Kahn buscara conquistar la tierra.',true,false,9200.00);

insert into personaje(nombre,imagen,descripcion,enVenta, enMiColeccion, monto)
values('Shao Kahn','shao.jpg','Emperador del Reino del Outworld.Lo conocen por su divina fuerza, la insensibilidad, extrema brutalidad y su afición por las ejecuciones personales, intentara conquistar la tierra mandando a Shang Tsung.',true,false,12000.00);

insert into personaje(nombre,imagen,descripcion,enVenta, enMiColeccion, monto)
values('Sonya Blade','sonya.jpg','miembro de una unidad superior de las Fuerzas Especiales de los Estados Unidos. Sonya representa a una mujer muy emancipada y testaruda, con obstinación y orgullo, ella se preocupa por las vidas de sus amigos y compañeros.',true,false,7900.00);

insert into personaje(nombre,imagen,descripcion,enVenta, enMiColeccion, monto)
values('Sub-Zero','sub.jpg','Un asesino del clan Lin Kuei. Que asumió el mando, cuando su hermano fue asesinado por el espectro ninja Scorpion en el mismo torneo de Mortal Kombat',false,true,10000.0);
