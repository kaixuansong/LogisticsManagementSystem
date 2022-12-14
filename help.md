# 目录说明

```
命令：tree /f > tree.txt 

├─java
│  └─com
│      └─zhao
│          │  Application.java  启动类
│          │  
│          ├─config  配置类
│          │      MvcConfig.java mvc配置
│          │      
│          ├─controller  前端请求控制
│          ├─dto 前端返回参数封装
│          ├─filter 过滤器
│          ├─mapper 数据库接口
│          ├─pojo 数据库表映射
│          ├─service 服务层
│          ├─unit 工具类
│          └─vo 返回数据格式化
└─resources
│  application.yml 核心配置类，集成所有xml
│  
├─mapper 复杂sql语句
├─static 静态资源
│  ├─api 模拟数据
│  ├─css
│  ├─images
│  └─js
├─templates
│      index.html
│      
└─upload

```

# 响应状态码
|  状态码   | 说明  |
|  ----  | ----  |
| 200  | 客户端请求成功 |
| 302  | 重定向 |
| 304  | 告诉客户端，你请求的资源至上次取得后，服务端并未更改，直接用你本地缓存吧。隐式重定向 |
| 400  | 客户端请求有语法错误，不能被服务器所理解 |
| 403  | 服务器收到请求，但是拒绝提供服务，比如：没有权限访问相关资源 |
| 404  | 请求资源不存在，一般是URL输入有误，或者网站资源被删除了 |
| 428  | 服务器要求有条件的请求，告诉客户端要想访问该资源，必须携带特定的请求头 |
| 429  | 太多请求，限制客户端请求某个资源的数量，配合 Retry-After(多长时间后可以请求)响应头一起使用 |
| 405  | 请求方式有误，比如应该用GET请求方式的资源，用了POST |
| 500  | 服务器发生不可预期的错误。服务器出异常了。 |
| 503  | 服务器尚未准备好处理请求，服务器刚刚启动，还未初始化好 |
| 511  | 客户端需要进行身份验证才能获得网络访问权限 |

# 后台响应格式
```json
{
  "code": 200,
  "msg": "消息",
  "data": "数据"
}
```
