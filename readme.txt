Install mysql community server https://dev.mysql.com/downloads/mysql/
Moved contents to root dir and add bin to path
run as admin:
    mysqld --initialize-insecure
    net start mysql
    mysqladmin -u root password newpass
    mysql -u root -p
    newpass

    #create database
    mysql -u root -p newpass < path/to/sql_scipts/init_db.sql

