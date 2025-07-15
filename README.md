# Getting Started

## Container
* run ``docker-compose up``

## URL
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