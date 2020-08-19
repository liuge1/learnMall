1. classpath 和 classpath* 的区别
  classpath: 和classpath*: 在spring加载资源的时候是不同的
  classpath: 只能加载找到的第一个资源文件(上面只匹配了com/eloan/bu/mapper/business下的mapper文件,而com/eloan/base/mapper就陪忽略了)
  classpath*: 能加载多个路径下的资源文件.(com/eloan/bu/mapper/business和com/eloan/base/mapper都被加载进来了.)

2.整合swagger2

3.安装redis （windows）版本
  * https://github.com/MicrosoftArchive/redis/releases
  * 找打目录 在当前地址栏输入cmd
  * 执行redis的启动命令：redis-server.exe redis.windows.conf  