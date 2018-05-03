# CrmApi

All URIs are relative to *http://ocde-pg.wktaa.de/sdn/rest/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**crmCompanydataGet**](CrmApi.md#crmCompanydataGet) | **GET** /crm/companydata | get: crm/firmendaten
[**crmCompanydataResourceIdGet**](CrmApi.md#crmCompanydataResourceIdGet) | **GET** /crm/companydata/{resourceId} | get: crm/firmendaten/id
[**crmCompanydataResourceIdPut**](CrmApi.md#crmCompanydataResourceIdPut) | **PUT** /crm/companydata/{resourceId} | put: crm/firmendaten
[**crmContactGet**](CrmApi.md#crmContactGet) | **GET** /crm/contact | get: crm/contact
[**crmContactResourceIdGet**](CrmApi.md#crmContactResourceIdGet) | **GET** /crm/contact/{resourceId} | get: crm/contact/id
[**crmContactResourceIdPut**](CrmApi.md#crmContactResourceIdPut) | **PUT** /crm/contact/{resourceId} | put: crm/contact
[**crmLocationGet**](CrmApi.md#crmLocationGet) | **GET** /crm/location | get: crm/location
[**crmLocationResourceIdGet**](CrmApi.md#crmLocationResourceIdGet) | **GET** /crm/location/{resourceId} | get: crm/location/id
[**crmLocationResourceIdPut**](CrmApi.md#crmLocationResourceIdPut) | **PUT** /crm/location/{resourceId} | put: crm/location
[**crmResourcePost**](CrmApi.md#crmResourcePost) | **POST** /crm/{resource} | post: crm/firmendaten


<a name="crmCompanydataGet"></a>
# **crmCompanydataGet**
> Companydata crmCompanydataGet(authorization, organization, where, order, skip, take)

get: crm/firmendaten



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CrmApi;


CrmApi apiInstance = new CrmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Companydata result = apiInstance.crmCompanydataGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmCompanydataGet");
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

[**Companydata**](Companydata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmCompanydataResourceIdGet"></a>
# **crmCompanydataResourceIdGet**
> Companydata crmCompanydataResourceIdGet(authorization, organization, resourceId)

get: crm/firmendaten/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CrmApi;


CrmApi apiInstance = new CrmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Companydata result = apiInstance.crmCompanydataResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmCompanydataResourceIdGet");
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

[**Companydata**](Companydata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmCompanydataResourceIdPut"></a>
# **crmCompanydataResourceIdPut**
> crmCompanydataResourceIdPut(authorization, organization, resourceId, body)

put: crm/firmendaten



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CrmApi;


CrmApi apiInstance = new CrmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Companydata body = new Companydata(); // Companydata | Input.
try {
    apiInstance.crmCompanydataResourceIdPut(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmCompanydataResourceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Companydata**](Companydata.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmContactGet"></a>
# **crmContactGet**
> Contact crmContactGet(authorization, organization, where, order, skip, take)

get: crm/contact



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CrmApi;


CrmApi apiInstance = new CrmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Contact result = apiInstance.crmContactGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmContactGet");
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

[**Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmContactResourceIdGet"></a>
# **crmContactResourceIdGet**
> Contact crmContactResourceIdGet(authorization, organization, resourceId)

get: crm/contact/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CrmApi;


CrmApi apiInstance = new CrmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Contact result = apiInstance.crmContactResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmContactResourceIdGet");
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

[**Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmContactResourceIdPut"></a>
# **crmContactResourceIdPut**
> crmContactResourceIdPut(authorization, organization, resourceId, body)

put: crm/contact



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CrmApi;


CrmApi apiInstance = new CrmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Contact body = new Contact(); // Contact | Input.
try {
    apiInstance.crmContactResourceIdPut(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmContactResourceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Contact**](Contact.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmLocationGet"></a>
# **crmLocationGet**
> Location crmLocationGet(authorization, organization, where, order, skip, take)

get: crm/location



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CrmApi;


CrmApi apiInstance = new CrmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Location result = apiInstance.crmLocationGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmLocationGet");
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

[**Location**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmLocationResourceIdGet"></a>
# **crmLocationResourceIdGet**
> Location crmLocationResourceIdGet(authorization, organization, resourceId)

get: crm/location/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CrmApi;


CrmApi apiInstance = new CrmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Location result = apiInstance.crmLocationResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmLocationResourceIdGet");
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

[**Location**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmLocationResourceIdPut"></a>
# **crmLocationResourceIdPut**
> crmLocationResourceIdPut(authorization, organization, resourceId, body)

put: crm/location



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CrmApi;


CrmApi apiInstance = new CrmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Location body = new Location(); // Location | Input.
try {
    apiInstance.crmLocationResourceIdPut(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmLocationResourceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Location**](Location.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="crmResourcePost"></a>
# **crmResourcePost**
> crmResourcePost(authorization, organization, resource, body)

post: crm/firmendaten



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CrmApi;


CrmApi apiInstance = new CrmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resource = "resource_example"; // String | The Api-Contract name
Companydata body = new Companydata(); // Companydata | Input.
try {
    apiInstance.crmResourcePost(authorization, organization, resource, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CrmApi#crmResourcePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resource** | **String**| The Api-Contract name |
 **body** | [**Companydata**](Companydata.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

