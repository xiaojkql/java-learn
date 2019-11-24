mybatis默认是下划线转驼峰的命名方式，在创建model的实体类的时候要遵循这种命名方式
注意java类型与数据库字段的对应关系
实体类中不使用基本类型，因为基本类型会被赋初值，而不是null

### 使用mybatis的方式
支持接口来调用方法
mybatis通过Java的动态代理直接调用相应的方法

- 通过sqlSession通过命名空间开调用
- XML+sqlSession的方式
- XML+接口的方式
- 注解+接口的方法


### Mybatis传递参数
通过@param来设置参数，避免手动构造map参数

