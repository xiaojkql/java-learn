在整个bean的生命周期中怎样调用函数来修改相关的bean

constructor
set
postbeantbefore
initializing
postbeanafter



## 1 自定义bean的初始化和销毁逻辑 



### InitializungBean 和 DisposableBean生命周期接口
一个实现生命周期接口的bean将收到spring的回调
applicationContextAware接口


JSR250's @PostContruct 和 @PreDestroy注解


## 2 使用BeanPostProcessor与新创建的bean实例进行交互
用于在Spring容器调用新创建的bean实例的初始化方法之前和之后与其进行交互



## 3 使用BeanFactoryPostProcessor修改bean定义
希望对bean定义进行修改的类实现
在spring容器加载bean定义之后且在任何bean实例尚未创建之前执行

postProcessBeanFactory
ConfigurableListableBeanFactory 配置Spring容器，迭代bean，修改bean定义
