package com.ygwei.UrlRazorServices.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class codeC1 {

    public String longUrl;

    public codeC1(String url) {
        this.longUrl = url;
    }

    private Map<Integer, String> dataBase = new HashMap<Integer, String>();
    private Map<Integer, String> dataBase2 = new HashMap<Integer, String>();
    private Map<String, Integer> urlToKey = new HashMap<String, Integer>();

    private Map<Integer, String> dataBase3 = new HashMap<Integer, String>();
    private Random random = new Random();


    private int id;

    static final int K1 = 1117;
    static final int K2 = 1000000007;

    public String set(String longUrl) {
        this.longUrl = longUrl;
        return this.longUrl;
    }


    public String encode1() {
        id++;
        dataBase.put(id, longUrl);
        return "http://razorurl1.com/" + id;
    }
    public String encode2() {
        if (urlToKey.containsKey(longUrl)) {
            return "http://razorurl2.com/" + urlToKey.get(longUrl);
        }
        int key = 0;
        long base = 1;
        for (int i = 0; i < longUrl.length(); i++) {
            char c = longUrl.charAt(i);
            key = (int) ((key + (long) c * base) % K2);
            base = (base * K1) % K2;
        }
        while (dataBase2.containsKey(key)) {
            key = (key + 1) % K2;
        }
        dataBase2.put(key, longUrl);
        urlToKey.put(longUrl, key);
        return "http://razorurl2.com/" + key;

    }
    public String encode3() {
        int key;
        while (true) {
            key = random.nextInt();
            if (!dataBase3.containsKey(key)) {
                break;
            }
        }
        dataBase3.put(key, longUrl);
        return "http://razorurl3.com/" + key;
    }

}
