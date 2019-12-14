Se crea el repositorio local desde la carpeta contenedora de los archivos.
para añadir el repositorio remotamente utilizamos el siguiente comando:
-git remote add repos https://github.com/DenisseDuc/repos.git
Después para hacer el seguimientos de los archivos del repositorio, se utiliza el comando siguiente: 
-git status
Como aún no se había hecho ningún commit, los archivos están sin seguimiento, por lo que los añadimos:
-git add "xx"
Y hacemos el commit:
-git commit -m test
Para hacer el repositorio remoto, se hace un push:
-git push https://github.com/DenisseDuc/repos.git master

Como hice esta práctica sola,  cloné mi propio repositorio abriendo el terminal con el comando:
-git clone https://github.com/DenisseDuc/repos.git

Se creó la carpeta con el nombre del repositorio remoto "repos".

Se modificaron los archivos. Desde la cuenta DenDuelin, subí un cambio hecho en el repositorio clonado:

-git status
Señala que un archivo ha sido modificado, por lo que lo voy a añadir al repositorio remoto siendo colaboladora:

-git add denisseduc
-git commit -m actualizado
-git push
 una vez añadidos los cambios, desde el usuario propietario del repositorio(DenisseDuc), hago un pull para ver todos los cambios realizados:
-git pull https://github.com/DenisseDuc/repos.git

y ya está.






