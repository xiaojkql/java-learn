[设置用户组](https://www.cnblogs.com/informatics/p/8276172.html)

[使用文档](https://yeasy.gitbooks.io/docker_practice/install/mirror.html)

## 1 redis基本使用
[基本使用命令](https://www.jianshu.com/p/f7f7ab47cc3a)
查看镜像：docker images
启动redis
```properties
docker run --name myredis -p 6379:6379 --restart=always -v $PWD/data:/data  -d redis:latest redis-server --appendonly yes daemonize yes
参数说明：
#本地运行
-d
#本地端口:Docker端口
6379:6379
#指定驱动盘
-v
#Redis的持久化文件存储
$PWD/data
#docker的镜像名
redis
#redis服务器
redis-server
#开启持久化
--appendonly yes
#这个运行的镜像的名称
--name
#守护进程
daemonize yes
#Docker启动容器就启动
--restart=always
```
停止运行的容器: docker container stop container_ID / Name
获取全部容器列表:docker container ls -a
删除某个容器: docker container rm container_ID / Name

用redis客户端进行访问
```properties
docker exec -ti d0b86 redis-cli
docker exec -ti d0b86 redis-cli -h localhost -p 6379 
docker exec -ti d0b86 redis-cli -h 127.0.0.1 -p 6379 
docker exec -ti d0b86 redis-cli -h 172.17.0.3 -p 6379   // 注意，这个是容器运行的ip，可通过 docker inspect redis_s | grep IPAddress 查看
h: 表示地址
p: 表示端口号
```

使用本地配置文件启动redis
```properties
docker run -p 6378:6379 --name myredis --restart always  -v $PWD/conf/redis.conf:/etc/redis/redis.conf -v $PWD/data:/data -d redis redis-server /etc/redis/redis.conf --appendonly yes
注意配置文件中的daemonize 设置为 no 不然会和上面的-d命令参数产生冲突  去掉bind 127.0.0.1
-d                                                  -> 以守护进程的方式启动容器

-p 6379:6379                                        -> 绑定宿主机端口
--name myredis                                      -> 指定容器名称
--restart always                                    -> 开机启动
--privileged=true                                   -> 提升容器内权限
-v /root/docker/redis/conf:/etc/redis/redis.conf    -> 映射配置文件
-v /root/docker/redis/data:/data                    -> 映射数据目录
--appendonly yes                                    -> 开启数据持久化
--requirepass "123456"       设置密码123456
```
