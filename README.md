# SOLID design principles

[Présentation](https://coder-may-cry.github.io/solid-kata-java/)

Ce dépôt contient des exemples de code qui violent les principes SOLID :

- **Single Responsibility** Principle: Chaque classe devrait avoir une seule responsabilité. Une classe doit avoir une, et une seule raison de changer.<br/>
  [Aller à l'exercice](/srp/README.md)

- **Open/Closed** Principle: Vous devez pouvoir étendre le comportement d'une classe sans la modifier. Les entités logicielles doivent être ouvertes à l'extension, mais fermées à la modification.<br/>
  [Aller à l'exercice](/ocp/README.md)

- **Liskov Substitution** Principle: Les classes dérivées doivent être substituables à leurs classes de base. Les fonctions qui utilisent des références à des classes de base doivent pouvoir utiliser des objets de classes dérivées sans le savoir.<br/>
  [Aller à l'exercice](/lsp/README.md)

- **Interface Segregation** Principle: Il faut créer des interfaces à granularité fine qui sont spécifiques au client. Les clients ne doivent pas être contraints de dépendre d'interfaces qu'ils n'utilisent pas.<br/>
  [Aller à l'exercice](/isp/README.md)

- **Dependency Inversion** Principle: Il faut dépendre des abstractions et non des implémentations. Les modules de haut niveau ne doivent pas dépendre modules de bas niveau. Les deux doivent dépendre d'abstractions. Les abstractions ne doivent pas dépendre des détails. Les détails doivent dépendre des abstractions.<br/>
  [Aller à l'exercice](/dip/README.md)
