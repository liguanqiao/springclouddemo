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
│  ├─paascloud-generator------------------数据服务中心Mybatis Plus Generator
│  │
│  ├─paascloud-provider--------------------------微服务消费者
│  │  │
│  │  ├─paascloud-provider-mdc------------------数据服务中心
│  │  │
│  │  ├─paascloud-provider-omc------------------订单服务中心
│  │  │
│  │  ├─paascloud-provider-opc------------------对接服务中心
│  │  │
│  │  ├─paascloud-provider-tpc------------------任务服务中心
│  │  │
│  │  └─paascloud-provider-uac------------------用户服务中心
│  │
│  ├─paascloud-provider-api--------------------------微服务提供者
│  │  │
│  │  ├─paascloud-provider-mdc-api------------------数据服务中心API
│  │  │
│  │  ├─paascloud-provider-omc-api------------------订单服务中心API
│  │  │
│  │  ├─paascloud-provider-opc-api------------------对接服务中心API
│  │  │
│  │  ├─paascloud-provider-tpc-api------------------任务服务中心API
│  │  │
│  │  ├─paascloud-provider-sdk-api------------------可靠消息服务API
│  │  │
│  │  └─paascloud-provider-uac-api------------------用户服务中心API

```