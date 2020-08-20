http://www.macrozheng.com
1. classpath 和 classpath* 的区别
  classpath: 和classpath*: 在spring加载资源的时候是不同的
  classpath: 只能加载找到的第一个资源文件(上面只匹配了com/eloan/bu/mapper/business下的mapper文件,而com/eloan/base/mapper就陪忽略了)
  classpath*: 能加载多个路径下的资源文件.(com/eloan/bu/mapper/business和com/eloan/base/mapper都被加载进来了.)

2.整合swagger2

3.安装redis （windows）版本
  * https://github.com/MicrosoftArchive/redis/releases
  * 找打目录 在当前地址栏输入cmd
  * 执行redis的启动命令：redis-server.exe redis.windows.conf  
  
4. SpringSecurity 和 JWT
   * https://jwt.io/
   * Hutool 工具包帮助我们简化每一行代码，减少每一个方法
   ums_admin：后台用户表
   ums_role：后台用户角色表
   ums_permission：后台用户权限表
   ums_admin_role_relation：后台用户和角色关系表，用户与角色是多对多关系
   ums_role_permission_relation：后台用户角色和权限关系表，角色与权限是多对多关系
   ums_admin_permission_relation：后台用户和权限关系表(除角色中定义的权限以外的加减权限)，加权限是指用户比角色多出的权限，减权限是指用户比角色少的权限
   
    * configure(HttpSecurity httpSecurity) 用于配置需要拦截的url路径，jwt过滤器及出异常后的处理器
    * configure(AuthenticationManagerBuilder auth) 用于配置UserDetailsService及PasswordEncode
    * RestfulAccessDenieddHandler 当用户没有访问权限时的处理，用于返回json格式的处理
    * RestAuthenticationEntryPoint 当未登录或token失效时，返回json格式的结果
    * UserDetailsService SpringSecurity 定义的核心接口，用于根据用户名获取用户信息，需要自行实现
    * UserDetails SpringSecurity 定义的用于对密码进行编码比对的接口，目前使用的是BCryptPasswordEncoder
    * JwtAuthenticationTokenFilter 在用户名和密码校验前添加的过滤器，如有有jwt的token，会自行根据token信息进行登录

5 SpringTask 实现定时任务