CREATE TABLE Utilisateurs(
                             idUtilisateur INT,
                             nomUtilisateur VARCHAR(50) NOT NULL,
                             prenomUtilisateur VARCHAR(50) NOT NULL,
                             PRIMARY KEY(idUtilisateur)
);

CREATE TABLE Comptes(
                        numero INT,
                        nomCompte VARCHAR(50) NOT NULL,
                        PRIMARY KEY(numero)
);

CREATE TABLE Transactions(
                             idTransaction INT,
                             montant INT NOT NULL,
                             description VARCHAR(200),
                             dates DATE,
                             crediteur LOGICAL NOT NULL,
                             debiteur LOGICAL NOT NULL,
                             idUtilisateur INT NOT NULL,
                             numero INT NOT NULL,
                             PRIMARY KEY(idTransaction),
                             FOREIGN KEY(idUtilisateur) REFERENCES Utilisateurs(idUtilisateur),
                             FOREIGN KEY(numero) REFERENCES Comptes(numero)
);
