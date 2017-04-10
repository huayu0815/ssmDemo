package com.huayu.study.ssmDemo.spring.demo;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import net.sf.ehcache.config.CacheConfiguration;
import net.sf.ehcache.config.PersistenceConfiguration;
import net.sf.ehcache.store.MemoryStoreEvictionPolicy;

/**
 * Created by zhaohuayu on 17/3/30.
 */
public class EhcacheDemo {

    public static void demo() {
        // Create a cache manager
        final CacheManager cacheManager = new CacheManager();

        // create the cache called "helloworld"
        final Cache cache = cacheManager.getCache("helloworld");

        // create a key to map the data to
        final String key = "greeting";

        // Create a data element
        final Element putGreeting = new Element(key, "Hello, World!");

        // Put the element into the data store
        cache.put(putGreeting);

        // Retrieve the data element
        final Element getGreeting = cache.get(key);

        // Print the value
        System.out.println(getGreeting.getObjectValue());
    }

    public static void main(String[] args) throws Exception {
        cacheMangerUtil();
    }

    public static void cacheMangerUtil() {
        // 使用特定的配置添加缓存
        CacheManager manager = CacheManager.create();
        Cache testCache = new Cache(
                new CacheConfiguration("testCache", 1024)
                        .memoryStoreEvictionPolicy(MemoryStoreEvictionPolicy.LFU)
                        .eternal(false)
                        .timeToLiveSeconds(60)
                        .timeToIdleSeconds(30)
                        .diskExpiryThreadIntervalSeconds(0)
                        .persistence(new PersistenceConfiguration().strategy(PersistenceConfiguration.Strategy.LOCALTEMPSWAP)));
        manager.addCache(testCache);

        final String key = "greeting";

        // Create a data element
        final Element putGreeting = new Element(key, "Hello, World!");

        // Put the element into the data store
        testCache.put(putGreeting);

        // Retrieve the data element
        final Element getGreeting = testCache.get(key);

        // Print the value
        System.out.println(getGreeting.getObjectValue());
    }
}
