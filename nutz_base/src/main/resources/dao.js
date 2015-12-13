var ioc = {
	dataSource : {
		type : "com.alibaba.druid.pool.DruidDataSource",
		events : {
			create : "init",
			depose : "close"
		},
		fields : {
			url : "jdbc:mysql://566ce6da3f270.gz.cdb.myqcloud.com:7000/test?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false",
			username : "root",
			password : "qw238778400",
			testWhileIdle : true,
			validationQuery : "select 1",
			maxActive : 100,
			maxWait: 15000
		}
	},
	dao : {
		type : "org.nutz.dao.impl.NutDao",
		args : [ {
			refer : "dataSource"
		} ]
	},
	// 直接初始化Ehcache,默认找ehcache.xml
    cacheManager : {
        type : "net.sf.ehcache.CacheManager",
        factory : "net.sf.ehcache.CacheManager#create"
    }
};