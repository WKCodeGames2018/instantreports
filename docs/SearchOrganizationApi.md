# SearchOrganizationApi

All URIs are relative to *http://ocde-pg.wktaa.de/sdn/rest/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchorganizationGet**](SearchOrganizationApi.md#searchorganizationGet) | **GET** /searchorganization | Get Organizations


<a name="searchorganizationGet"></a>
# **searchorganizationGet**
> searchorganizationGet(authorization, where, order, skip, take)

Get Organizations

Returns the Organizations depending of the query params

### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.SearchOrganizationApi;


SearchOrganizationApi apiInstance = new SearchOrganizationApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    apiInstance.searchorganizationGet(authorization, where, order, skip, take);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchOrganizationApi#searchorganizationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **where** | **String**| Filter on one or more Api-Contract fields. Default: \&quot;\&quot; | [optional] [default to ]
 **order** | **String**| Sorting by a field of Api-contract. Default:\&quot;\&quot; | [optional] [default to ]
 **skip** | **String**| Number of records to be skipped. Default: 0 | [optional] [default to 0]
 **take** | **String**| Max. Number of result set. Default: 15 | [optional] [default to 15]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

