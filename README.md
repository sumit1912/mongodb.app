# mongodb.app
This is Spring boot application which makes different CRUD operations with MongoDB database

Sample payload:
```json
        {
            "name" : "Sumit",
            "email" : "sumit1912@gmail.com",
            "address" : {
                "city" : "Bokaro",
                "country" : "INDIA"
            },
            "department" : {
                "departmentName" : "Computer Science",
                "location" : "INDIA"
            },
            "subjects" : [
                {
                    "subjectName" : "Java",
                    "marksObtained" : 90
                },
                {
                    "subjectName" : "Python",
                    "marksObtained" : 80
                }
            ]
        }
```