#Questions

Question 1:

Quelles modifications sont apportées lorsque vous ajoutez une deuxième activité à votre application en choisissant File > New > Activity et un modèle d'activité? Choisissez-en un:

->La deuxième activité est ajoutée en tant que classe Java, le fichier de présentation (layout) XML est créé et le fichier AndroidManifest.xml est modifié pour déclarer une deuxième activité.

Question 2:

Que se passe-t-il si vous supprimez les éléments android:parentActivityName et <méta-data> de la deuxième déclaration d'activité du fichier AndroidManifest.xml?

->Le bouton Back (Précédent) ne fonctionne plus dans la deuxième activité pour renvoyer l'utilisateur à l'activité principale.

Question 3:

Quelle méthode de constructeur utilisez-vous pour créer une nouvelle intention (Intent) explicite? Choisissez-en un:

->new Intent(Context context, Class<?> class)

Question 4

Dans l'application HelloToast (du Travail à faire), comment ajoutez-vous la valeur actuelle du comptage à l'intention (Intent)? Choisissez-en un:

->Comme extra d'intention (Intent)

Question 5

Dans l'application HelloToast (du Travail à faire), comment afficher le nombre actuel dans la deuxième activité "Hello"? Choisissez-en un:

->Obtenez l'intention (Intent) avec laquelle l'activité a été lancée.
  Obtenez la valeur actuelle du comptage de l'intention.
  Mettez à jour le TextView pour le comptage.
