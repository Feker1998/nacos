# nacos
nacos的demo
该项目仅仅是测试nacos的demo而已，要下载nacos注册中心，需要去
https://github.com/alibaba/nacos/releases/tag/2.0.0-ALPHA.2
这里我下载的是2.0.0版本，下载解压后直接去bin下执行
startup.sh或者startup.cmd 即可开始
shutdown.sh或者shutdown.cmd即可关闭
当然，这里的执行语句应该是
sh startup.sh -m standalone    才能启动

启动后，访问 http://127.0.0.1:8848/nacos

输入账号和密码，nacos/nacos

接下来就是nacos之旅了

本demo完全是自己开发，但是参照
https://www.zhihu.com/people/fen-cun-15/posts
该大神简易讲了nacos的基本用法，希望大家学习，在搭建的过程中遇到了好多问题，也都解决了

服务demo：
nacos-provide
nacos-comsumer
nacos-feign
配置demo：
nacos-config
nacos-namespace-one
nacos-namespace-two
nacos-config-share