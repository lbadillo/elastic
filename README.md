# Getting Started
PoC for ElasticSearch pagination and use ModelMapper

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