# MeServiceApi

All URIs are relative to *http://ocde-pg.wktaa.de/sdn/rest/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**meGet**](MeServiceApi.md#meGet) | **GET** /me | me service


<a name="meGet"></a>
# **meGet**
> meGet(authorization)

me service

information to currently logged in user

### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.MeServiceApi;


MeServiceApi apiInstance = new MeServiceApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
try {
    apiInstance.meGet(authorization);
} catch (ApiException e) {
    System.err.println("Exception when calling MeServiceApi#meGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

