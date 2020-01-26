1. The class name, by default, is mapped to the table name in lower case and separated by underscores instead of camel 
case so a domain class named BookStore by default would map to a table named book_store. Each property maps to individual columns.   


2. if same domain name multiple plugin, grails.gorm.table.prefix.enabled = true


3. mappedBy
                                                                                