# Introduction
PoC for ElasticSearch pagination and use ModelMapper

## Pagination
Add a configuration file `PageConfiguration.java` to fix: 
* (From Spring DAta documentation) It’s common for Spring MVC controllers to try to ultimately render a representation of a Spring Data page to clients. While one could simply return Page instances from handler methods to let Jackson render them as is, we strongly recommend against this as the underlying implementation class PageImpl is a domain type. This means we might want or have to change its API for unrelated reasons, and such changes might alter the resulting JSON representation in a breaking way.

## Non Null Values Repository Issue
To avoid warnings for null values add repository.package-info.java
to fix:
* Starting with Spring 5, we now have access to an interesting feature helping us write safer code. This feature is called null safety, a group of annotations working like a safeguard that watches out for potential null references.


## How to run 
* view utils/docker-compose.yml
* run ``utils/docker-compose up -d``

## How to test
* Import a collection ``utils/ElasticCarModel.postman_collection.json``


## URL's
* Elasticsearch: ``localhost:9200``
* Kibana: ``localhost:5601``

## Queries
    
``` 
GET /carindex/_search
{
    "query" : {
        "match" : {
            "brand": {
                "query": "mudo"
            }
        }
    }

}
 ```