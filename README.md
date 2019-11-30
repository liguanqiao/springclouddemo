## Spring Cloud 实战项目

### 项目介绍
Spring Cloud + Mybatis Plus 微服务Demo

### 平台目录结构说明
```
├─springclouddemo----------------------------父项目，公共依赖
│  │
│  ├─springclouddemo-eureka--------------------------微服务注册中心
│  │
│  ├─springclouddemo-config-----------------------微服务配置中心
│  │
│  ├─springclouddemo-gateway--------------------------微服务网关中心
│  │
│  ├─springclouddemo-common--------------------------公共包
│  │
│  ├─springclouddemo-generator------------------数据服务中心Mybatis Plus Generator
│  │
│  ├─springclouddemo-provider--------------------------微服务消费者
│  │  │
│  │  ├─springclouddemo-provider-uac------------------用户控制中心
│  │  │
│  │  ├─springclouddemo-provider-test------------------测试消费者
│  │
│  ├─springclouddemo-provider-api--------------------------微服务提供者
│  │  │
│  │  ├─springclouddemo-provider-uac-api------------------用户控制中心API

```