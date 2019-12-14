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
