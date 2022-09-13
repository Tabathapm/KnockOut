/* Script de la db */

USE db;

INSERT INTO personaje(nombre, imagen, descripcion, enVenta, enMiColeccion, monto)
VALUES
('Iron Man', 'ironMan.jpg', 
'Más conocido como Tony Stark, es un multimillonario magnate empresarial, filántropo, playboy e ingenioso científico' ,true, false, 10000.00),
('Thor', 'thor_.jpg', 'Dios del trueno y fuerza en la mitología nórdica y germánica' ,true, false, 10500.50),
('Valkiria', 'valkiria_.jpg', 
'Conocida por su destreza en la batalla, a menudo se acompaña de su caballo alado Aragorn y lleva la espada encantada Dragonfang' ,true, false, 5000.0),
('Capitán América', 'capitanAmerica.jpg', 
'Cuyo nombre real es Steven Grant Rogers, es un super soldado de los Estados Unidos de América' ,true, false, 8600.75),
('Capitana Marvel', 'capitanaMarvel.jpg', 
'Cuyo nombre real es Carol Danvers, después de que su ADN se fusionara con el de Mar-Vell, obtiene poderes sobrehumanos' ,true, false, 9875.58),
('Black Widow','blackWidow.jpg', 
'Experta espía y combatiente cuerpo a cuerpo. Convocada por Nick Fury, es miembro fundador de la Iniciativa Vengadores.' ,true, false, 10000.00),
('Hawkeye', 'hawkeye_.jpg', 
'Su nombre real es Clint Barton. Tirador experto y un combatiente cuerpo a cuerpo, siendo su arma preferida es un arco recurvo.' ,true, false, 5000.75),
('Hulk', 'hulk_.jpg', 
'Ser humanoide enorme de piel verde, corpulento y musculoso que posee una gran fortaleza física.' ,true, false, 5000.80),
('Kate Bishop', 'kateBishop.jpg', 
 'Miembro de los Jóvenes Vengadores. Tomar el nombre del Ojo de Halcón (Hawkeye) después de Clint Barton' ,true, false, 1000.20),
('Lady Thor', 'ladyThor.jpg', 
'Cuyo nombre es Jane Foster, científica astrofísica. Al hacerse con la legendaria arma llamada Mjölnir, obtiene los poderes de Thor' ,true, false, 7800.00),
('Star Lord', 'starLord.jpg',
'Híbrido Celestial-humano, legendario forajido, líder de Los Guardianes de la Galaxia.' ,true, false, 8900.25),
('Ultron', 'ultron_.jpg', 'Inteligencia artificial que trata de eliminar a los superheroes.' ,true, false, 6000.0),
('Venom', 'venom_.jpg', 
'Simbionte con una forma amorfa, semi-líquido, que sobrevive mediante la unión con un huésped, por lo general humano.' ,true, false, 7460.23),
('Black Panther', 'blackPanther.jpg',
'Rey y protector de Wakanda, poseer habilidades mejoradas logradas a través de rituales antiguos de Wakanda.' ,true, false, 9000.00),
('Doctor Strange', 'doctorStrange.jpg', 
'Poderoso hechicero y miembro destacado de los Maestros de las Artes Místicas.' ,true, false, 12500.00),
('Loki','loki_.jpg', 
'Dios de las Mentiras, Prínciper de Asgard, hermano de Thor' ,true, false, 8500.78),
('Scarlet Witch', 'scarletWitch.jpg', 
'Posee habilidades para alterar la realidad de formas no especificadas y es, además, una poderosa hechicera.' ,true, false, 15500.00),
('Shang-Chi', 'shangChi.jpg', 
'Maestro de artes marciales con habilidades insuperables por muchos, heredero de los Anillos Místicos.' ,true, false, 9000.00),
('Deadpool', 'deadpool_.jpg', 
'Mercenario y antiheroe, mentalmente inestable y desfigurado' ,true, false, 14000.00),
('Duende Verde', 'duendeVerde.jpg',
'Supervillano con temática de Halloween cuyas armas se asemejan a murciélagos, fantasmas y linternas de calabaza. Es estrambótico, bocazas y políticamente incorrecto.' ,true, false, 4000.00);


-- insert leandro--

insert into personaje(nombre,imagen,descripcion,enVenta, enMiColeccion, monto)
values('Ermac','ermac.jpg',
       'Ermac es una entidad compuesta de legiones de almas de los muertos, que se enviaron a guerras sin sentido, la manera en que las almas fueron fusionados en Ermac es desconocida.',true,false,5000.00),
      ('Johnny Cage','johnny_.jpg',
       'Una superestrella de las artes marciales entrenado por grandes maestros de todo el mundo.',true,false,8000.00),
      ('Kitana','kitana_.jpg',
       'Princesa del místico reino de Edenia,el arma de Kitana es un par de abanicos de acero con puntas afiladas',true,false,8500.00),
      ('Liu Kang','liukang_.jpg',
       'Liu Kang sigue las enseñanzas de la Sociedad del Loto Blanco del Shaolin y fue enviado por el Templo de la Luz a derrotar al hechicero Shang Tsung.',true,false,9000.00),
      ('Mileena','milena_.jpg',
       ' Mileena es un clon de Kitana. Su odio hacia Kitana consume sus pensamientos; desea matarla para tomar el trono de Edenia.',true,false,5600.00),
      ('Reptile','reptile.jpg',
       'Un general del ejército de la oscuridad de Shinnok, Reptile pertenece a una raza extinta de criaturas reptilianas. Fue desterrado al Netherrealm acusado del genocidio contra su propia especie.',true,false,8300.00),
      ('Scorpion','scorpion.jpg','Espectro Ninja no muerto que busca venganza por su propia muerte a manos de Sub-Zero.',true,false,10000.00),
      ('Shang Tsung','shang_.jpg','Es un poderoso hechicero con la capacidad de absorber almas y cambiar de forma. Bajo el mando de Shao Kahn buscara conquistar la tierra.',true,false,9200.00),
      ('Shao Kahn','sk.jpg','Emperador del Reino del Outworld.Lo conocen por su divina fuerza, la insensibilidad, extrema brutalidad y su afición por las ejecuciones personales, intentara conquistar la tierra mandando a Shang Tsung.',true,false,12000.00),
      ('Sonya Blade','sonya_.jpg','miembro de una unidad superior de las Fuerzas Especiales de los Estados Unidos. Sonya representa a una mujer muy emancipada y testaruda, con obstinación y orgullo, ella se preocupa por las vidas de sus amigos y compañeros.',true,false,7900.00),
      ('Sub-Zero','sub.jpg','Un asesino del clan Lin Kuei. Que asumió el mando, cuando su hermano fue asesinado por el espectro ninja Scorpion en el mismo torneo de Mortal Kombat',true,false,10000.0),
      ('Kung Lao','kunglao.jpg','Monje Shaolin y un miembro de la Sociedad del Loto Blanco que se encuentra a la sombra de su antepasado. Kung Lao es el mejor amigo de Liu Kang.',true,false,98000.0);

-- Insert superheroes DC--

insert into personaje(nombre,imagen,descripcion,enVenta, enMiColeccion, monto)
values('Superman','superman_.jpg','Superheroe nacido en el planeta de Krypton.Sus poderes provienen de la absorción solar,entre ellos se encuentran: super fuerza,super velocidad,factor curativo,volar,visión de rayos X,etc. ',true,false,15000.0),
      ('Aquaman','aquaman_.jpg','Rey de Atlantis,forma parte de la Liga de La Justicia.Tiene control de los mares y criaturas marinas.Posee super fuerza y resistencia. ',true,false,8500.0),
      ('Batman','batman_.jpg',' Millonario que por las noches se convierte en un justiciero.Tiene una basta experiencia en multiples artes marciales.Cuenta con una inteligencia superior',true,false,10000.0),
      ('Black Adam','blackAdam_.jpg',' Black Adam es un antiguo egipcio llamado Teth-Adam (es decir, "Poderoso humano"), que es elegido por el mago Shazam para ser su sucesor debido a su presunta pureza moral. ',true,false,10500.0),
      ('Brainiac','brainiac_.jpg','Es un villano humanoide de piel verde.Posee poderes telepáticos y psicoquinéticos cuyos límites se desconocen ',true,false,12300.0),
      ('Deadshot','deadshot_.jpg','Floyd Lawton, más conocido como Deadshot, es un pistolero a sueldo, conocido por ser el segundo asesino más letal de todo el universo de DC Comics',true,false,8500.0),
      ('Flash','flash_.jpg','Superheroe integrante de La Liga de La Justicia.Posee super velocidad,puede atravesar las paredes ,lanzar rayos y hasta viajar en el tiempo.',true,false,12000.0),
      ('Lex Luthor','lexLuthor_.jpg','Alexander J. Luthor, conocido simplemente como Lex Luthor, es un supervillano y el archienemigo de Superman.Es un millonario con una gran inteligencia. ',true,false,10200.0),
      ('Mujer Maravilla','mujerMaravilla_.jpg','Princesa guerrera de las Amazonas.Forma parte de La Liga de La Justicia.',true,false,11000.0),
      ('Deadthstroke','deadthstroke_.jpg','Mercenario y villano, mentalmente inestable y con una gran habilidad en el manejo de las espadas ',true,false,7500.0);

