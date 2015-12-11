var ioc = {
	dataSource : {
		type : "com.alibaba.druid.pool.DruidDataSource",
		events : {
			create : "init",
			depose : "close"
		},
		fields : {
			url : "jdbc:mysql://127.0.0.1:3306/nutzbook",
			username : "root",
			password : "root",
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