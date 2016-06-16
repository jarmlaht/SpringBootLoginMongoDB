# SpringBootLoginMongoDB

By default MongoDB is usign "test" database. The example uses "users" collection, so it must be created:

> db.createCollection("users")

Then we need to add user, which can be used for logging in:

> db.users.insert({id: 1, username: 'user', password: 'password, role: 1})


