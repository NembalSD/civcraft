package com.avrgaming.civcraft.database;

public class SQLParams {
    protected static String appendJdbcParams(String baseUrl, String params) {
        if(params == null) params = "";
        params = params.trim();
        if(params.isEmpty()) return baseUrl;
        if(params.startsWith("?")) params = params.substring(1);
        else if(params.startsWith("&")) params = params.substring(1);
        return baseUrl + (baseUrl.contains("?") ? "&" : "?") + params;
    }
}
