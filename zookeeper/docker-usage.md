1 安装
- docker pull zookeeper

## 1 运行单机版
启动镜像
- docker run --name myzookeeper  -d zookeeper:latest
连接客户端
- docker run -it --rm --link myzookeeper:zookeeper zookeeper zkCli.sh -server zookeeper
- docker exec -it myzookeeper/bin/bash  +  ./bin/zkCli.sh -server ip:2181
- docker exec -it myzookeeper/bin/bash  + cd bin/ + ./zkCli.sh
- docker exec -it 容器id/name zkCli.sh

 查看日志
- docker logs -f my_zookeeper
**此时用java客户端或者zkCli.sh连接该zookeeper时用localhost或者本台电脑的ip地址都可以使用该zookeeper**

## 2 用docker搭建集群
[zookeeper的错误](https://blog.csdn.net/weixin_43885494/article/details/102718746)
[容器化系列 - Zookeeper启动和配置 on Docker](https://www.cnblogs.com/yorkwu/p/9858306.html)
https://www.cnblogs.com/wintersoft/p/11128484.html

## 3 zookeeper的客户端
https://blog.csdn.net/qq_26641781/article/details/80886831
