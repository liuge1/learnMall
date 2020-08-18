1. classpath 和 classpath* 的区别
classpath: 和classpath*: 在spring加载资源的时候是不同的
classpath: 只能加载找到的第一个资源文件(上面只匹配了com/eloan/bu/mapper/business下的mapper文件,而com/eloan/base/mapper就陪忽略了)
classpath*: 能加载多个路径下的资源文件.(com/eloan/bu/mapper/business和com/eloan/base/mapper都被加载进来了.)

2.整合swagger