# spring-cloud-zookeeper
spring cloud 使用zookeeper做服务发现

## 使用 zookeeper 做服务发现的一个坑

SpringCloud 内嵌的 Curator 版本需要与目标zookeeper相适配，例如`curactor 4.x`的版本只支持`ZooKeeper 3.5.x`及以上的版本,在开发过程中需要根据当前所使用的zookeeper的情况剔除掉zookeeper依赖，重新选择适配版本
