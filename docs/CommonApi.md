# CommonApi

All URIs are relative to *http://ocde-pg.wktaa.de/sdn/rest/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commonResourcePost**](CommonApi.md#commonResourcePost) | **POST** /common/{resource} | post: common/tagdefinition
[**commonTagdefinitionGet**](CommonApi.md#commonTagdefinitionGet) | **GET** /common/tagdefinition | get: common/tagdefinition
[**commonTagdefinitionResourceIdGet**](CommonApi.md#commonTagdefinitionResourceIdGet) | **GET** /common/tagdefinition/{resourceId} | get: common/tagdefinition/id
[**commonTagdefinitionResourceIdPut**](CommonApi.md#commonTagdefinitionResourceIdPut) | **PUT** /common/tagdefinition/{resourceId} | put: common/tagdefinition


<a name="commonResourcePost"></a>
# **commonResourcePost**
> commonResourcePost(authorization, organization, resource, body)

post: common/tagdefinition



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resource = "resource_example"; // String | The Api-Contract name
Tagdefinition body = new Tagdefinition(); // Tagdefinition | Input.
try {
    apiInstance.commonResourcePost(authorization, organization, resource, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonResourcePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resource** | **String**| The Api-Contract name |
 **body** | [**Tagdefinition**](Tagdefinition.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commonTagdefinitionGet"></a>
# **commonTagdefinitionGet**
> Tagdefinition commonTagdefinitionGet(authorization, organization, where, order, skip, take)

get: common/tagdefinition



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Tagdefinition result = apiInstance.commonTagdefinitionGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonTagdefinitionGet");
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

[**Tagdefinition**](Tagdefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commonTagdefinitionResourceIdGet"></a>
# **commonTagdefinitionResourceIdGet**
> Tagdefinition commonTagdefinitionResourceIdGet(authorization, organization, resourceId)

get: common/tagdefinition/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Tagdefinition result = apiInstance.commonTagdefinitionResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonTagdefinitionResourceIdGet");
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

[**Tagdefinition**](Tagdefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="commonTagdefinitionResourceIdPut"></a>
# **commonTagdefinitionResourceIdPut**
> commonTagdefinitionResourceIdPut(authorization, organization, resourceId, body)

put: common/tagdefinition



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CommonApi;


CommonApi apiInstance = new CommonApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Tagdefinition body = new Tagdefinition(); // Tagdefinition | Input.
try {
    apiInstance.commonTagdefinitionResourceIdPut(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#commonTagdefinitionResourceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Tagdefinition**](Tagdefinition.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

