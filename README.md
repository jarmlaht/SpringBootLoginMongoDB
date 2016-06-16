# SpringBootLoginMongoDB

Prerequisites

We will need :

    Netbeans IDE
    JDK 1.7 or later
    Maven 3.0+
    MongoDB


By default MongoDB is usign "test" database. The example uses "users" collection, so it must be created:

> db.createCollection("users")

Then we need to add user, which can be used for logging in:

> db.users.insert({id: 1, username: 'user', password: 'password', role: 1})

If you want to use another db instead of the default "test" db, this might help:

http://stackoverflow.com/questions/25750815/how-to-specify-database-name-in-spring-data-mongodb
