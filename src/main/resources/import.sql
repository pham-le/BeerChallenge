-- CREATE TABLE BeerChallenge.Game (id  SERIAL NOT NULL, numPeople int4 NOT NULL, teamName VARCHAR(255), PRIMARY KEY (id));

-- CREATE TABLE BeerChallenge.Player (id  serial NOT NULL, name VARCHAR(255), score VARCHAR(255), status VARCHAR(255), game_id int4, PRIMARY KEY (id));

INSERT INTO BeerChallenge.Game (numPeople, teamName) VALUES (3, 'Green');

INSERT INTO BeerChallenge.Player (game_id, name, score, status) VALUES (1, 'Jennifer', '[30000, 90000, 150000, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1]', 'LOSER');

INSERT INTO BeerChallenge.Player (game_id, name, score, status) VALUES (1, 'Christina', '[30000,90000,150000,210000,270000,330000,390000,450000,510000,570000,630000,690000,750000,810000,870000,930000,990000,1050000,1110000,1170000,1230000,1290000,1350000,1410000,1470000,1530000,1590000,1650000,1710000,1770000,1830000,1890000,1950000,2010000,2070000,2130000,2190000,2250000,2310000,2370000,2430000,2490000,2550000,2610000,2670000,2730000,2790000,2850000,2910000,2970000,3030000,3090000,3150000,3210000,3270000,3330000,3390000,3450000,3510000,3570000]', 'WINNER');

INSERT INTO BeerChallenge.Player (game_id, name, score, status) VALUES (1, 'Mimi', '[50030, 120532, 210022, 27777, 390023, 508883, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1]', 'LOSER');