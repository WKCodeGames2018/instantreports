# MeldecenterApi

All URIs are relative to *http://ocde-pg.wktaa.de/sdn/rest/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**meldecenterMeldungendataGet**](MeldecenterApi.md#meldecenterMeldungendataGet) | **GET** /meldecenter/meldungendata | get: meldecenter/meldung
[**meldecenterMeldungendataResourceIdGet**](MeldecenterApi.md#meldecenterMeldungendataResourceIdGet) | **GET** /meldecenter/meldungendata/{resourceId} | get: meldecenter/meldung/id
[**meldecenterMeldungendataResourceIdPut**](MeldecenterApi.md#meldecenterMeldungendataResourceIdPut) | **PUT** /meldecenter/meldungendata/{resourceId} | put: meldecenter/meldung
[**meldecenterResourcePost**](MeldecenterApi.md#meldecenterResourcePost) | **POST** /meldecenter/{resource} | post: meldecenter/meldung


<a name="meldecenterMeldungendataGet"></a>
# **meldecenterMeldungendataGet**
> Meldungendata meldecenterMeldungendataGet(authorization, organization, where, order, skip, take)

get: meldecenter/meldung



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.MeldecenterApi;


MeldecenterApi apiInstance = new MeldecenterApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Meldungendata result = apiInstance.meldecenterMeldungendataGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeldecenterApi#meldecenterMeldungendataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **where** | **String**| Filter on one or more Api-Contract fields. Default: \&quot;\&quot; | [optional] [default to ]
 **order** | **String**| Sorting by a field of Api-contract. Default:\&quot;\&quot; | [optional] [default to ]
 **skip** | **String**| Number of records to be skipped. Default: 0 | [optional] [default to 0]
 **take** | **String**| Max. Number of result set. Default: 15 | [optional] [default to 15]

### Return type

[**Meldungendata**](Meldungendata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="meldecenterMeldungendataResourceIdGet"></a>
# **meldecenterMeldungendataResourceIdGet**
> Meldungendata meldecenterMeldungendataResourceIdGet(authorization, organization, resourceId)

get: meldecenter/meldung/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.MeldecenterApi;


MeldecenterApi apiInstance = new MeldecenterApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Meldungendata result = apiInstance.meldecenterMeldungendataResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeldecenterApi#meldecenterMeldungendataResourceIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |

### Return type

[**Meldungendata**](Meldungendata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="meldecenterMeldungendataResourceIdPut"></a>
# **meldecenterMeldungendataResourceIdPut**
> meldecenterMeldungendataResourceIdPut(authorization, organization, resourceId, body)

put: meldecenter/meldung



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.MeldecenterApi;


MeldecenterApi apiInstance = new MeldecenterApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Meldungendata body = new Meldungendata(); // Meldungendata | Input.
try {
    apiInstance.meldecenterMeldungendataResourceIdPut(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling MeldecenterApi#meldecenterMeldungendataResourceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Meldungendata**](Meldungendata.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="meldecenterResourcePost"></a>
# **meldecenterResourcePost**
> meldecenterResourcePost(authorization, organization, resource, body)

post: meldecenter/meldung



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.MeldecenterApi;


MeldecenterApi apiInstance = new MeldecenterApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resource = "resource_example"; // String | The Api-Contract name
Meldungendata body = new Meldungendata(); // Meldungendata | Input.
try {
    apiInstance.meldecenterResourcePost(authorization, organization, resource, body);
} catch (ApiException e) {
    System.err.println("Exception when calling MeldecenterApi#meldecenterResourcePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resource** | **String**| The Api-Contract name |
 **body** | [**Meldungendata**](Meldungendata.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

