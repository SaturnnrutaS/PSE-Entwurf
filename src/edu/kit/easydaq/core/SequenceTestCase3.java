package edu.kit.easydaq.core;


/**
 * 
 * 
 * @author David
 * 
 * 
@startuml



actor Benutzer

participant ":Anwendung" as A
participant "PR:PhyPiDAQundRaspy" as PR
participant "K1:Konfiguration" as K1
participant "S1:Sensor" as S1
participant "S2:Sensor" as S2
participant "T1:Transformation" as T1
activate A

activate K1
activate PR
Benutzer -> A: füge Sensor S1 hinzu

 
A -> S1: <<erstelle>>
activate S1
S1 --> A: 

A -> PR: prüfe(S1)
PR --> A:

A -> K1: fugeHinzu(S1)
K1 --> A : 
A --> Benutzer: zeigeAn(S1)

Benutzer -> A: füge Sensor S2 hinzu
A -> S2: <<erstelle>>
activate S2
S1 --> A: 

A -> PR: prüfe(S2)
PR --> A:

A -> K1: fugeHinzu(S2)
S2 --> A: 

A --> Benutzer: zeigeAn(S2)


Benutzer -> A: füge Transformation T1 hinzu
A -> T1: <<erstelle>>
activate T1
T1 --> A: 

A -> K1: fuge T1 hinzu
K1 --> A : 
A -->Benutzer: zeige Transformation T1 an

Benutzer -> A: ändere Konfigurationseinstellungen
A -> K1: mache Änderungen
K1 --> A: 
A --> Benutzer: zeige Änderung
Benutzer -> A: speichere KonfigurationK1
A -> A: speichere(K1)
A --> Benutzer







@enduml
*/


public class SequenceTestCase3 {

}
