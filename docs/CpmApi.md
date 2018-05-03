# CpmApi

All URIs are relative to *http://ocde-pg.wktaa.de/sdn/rest/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cpmClientGet**](CpmApi.md#cpmClientGet) | **GET** /cpm/client | get: cpm/client
[**cpmClientResourceIdGet**](CpmApi.md#cpmClientResourceIdGet) | **GET** /cpm/client/{resourceId} | get: cpm/client/id
[**cpmClientactivitiesGet**](CpmApi.md#cpmClientactivitiesGet) | **GET** /cpm/clientactivities | get: cpm/clientactivities
[**cpmClientactivitiesResourceIdGet**](CpmApi.md#cpmClientactivitiesResourceIdGet) | **GET** /cpm/clientactivities/{resourceId} | get: cpm/clientactivities/id
[**cpmClientactivitychangestateResourceIdPut**](CpmApi.md#cpmClientactivitychangestateResourceIdPut) | **PUT** /cpm/clientactivitychangestate/{resourceId} | put: cpm/clientactivitychangestate
[**cpmEmployeeGet**](CpmApi.md#cpmEmployeeGet) | **GET** /cpm/employee | get: cpm/employee
[**cpmEmployeeResourceIdGet**](CpmApi.md#cpmEmployeeResourceIdGet) | **GET** /cpm/employee/{resourceId} | get: cpm/employee/id
[**cpmEmployeeactivitiesGet**](CpmApi.md#cpmEmployeeactivitiesGet) | **GET** /cpm/employeeactivities | get: cpm/employeeactivities
[**cpmEmployeeactivitiesResourceIdGet**](CpmApi.md#cpmEmployeeactivitiesResourceIdGet) | **GET** /cpm/employeeactivities/{resourceId} | get: cpm/employeeactivities/id
[**cpmFirmGet**](CpmApi.md#cpmFirmGet) | **GET** /cpm/firm | get: cpm/firm
[**cpmFirmResourceIdGet**](CpmApi.md#cpmFirmResourceIdGet) | **GET** /cpm/firm/{resourceId} | get: cpm/firm/id


<a name="cpmClientGet"></a>
# **cpmClientGet**
> Client cpmClientGet(authorization, organization, where, order, skip, take)

get: cpm/client



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CpmApi;


CpmApi apiInstance = new CpmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Client result = apiInstance.cpmClientGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpmApi#cpmClientGet");
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

[**Client**](Client.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cpmClientResourceIdGet"></a>
# **cpmClientResourceIdGet**
> Client cpmClientResourceIdGet(authorization, organization, resourceId)

get: cpm/client/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CpmApi;


CpmApi apiInstance = new CpmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Client result = apiInstance.cpmClientResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpmApi#cpmClientResourceIdGet");
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

[**Client**](Client.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cpmClientactivitiesGet"></a>
# **cpmClientactivitiesGet**
> Clientactivities cpmClientactivitiesGet(authorization, organization, where, order, skip, take)

get: cpm/clientactivities



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CpmApi;


CpmApi apiInstance = new CpmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Clientactivities result = apiInstance.cpmClientactivitiesGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpmApi#cpmClientactivitiesGet");
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

[**Clientactivities**](Clientactivities.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cpmClientactivitiesResourceIdGet"></a>
# **cpmClientactivitiesResourceIdGet**
> Clientactivities cpmClientactivitiesResourceIdGet(authorization, organization, resourceId)

get: cpm/clientactivities/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CpmApi;


CpmApi apiInstance = new CpmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Clientactivities result = apiInstance.cpmClientactivitiesResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpmApi#cpmClientactivitiesResourceIdGet");
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

[**Clientactivities**](Clientactivities.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cpmClientactivitychangestateResourceIdPut"></a>
# **cpmClientactivitychangestateResourceIdPut**
> cpmClientactivitychangestateResourceIdPut(authorization, organization, resourceId, body)

put: cpm/clientactivitychangestate



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CpmApi;


CpmApi apiInstance = new CpmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Clientactivitychangestate body = new Clientactivitychangestate(); // Clientactivitychangestate | Input.
try {
    apiInstance.cpmClientactivitychangestateResourceIdPut(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CpmApi#cpmClientactivitychangestateResourceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Clientactivitychangestate**](Clientactivitychangestate.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cpmEmployeeGet"></a>
# **cpmEmployeeGet**
> Employee cpmEmployeeGet(authorization, organization, where, order, skip, take)

get: cpm/employee



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CpmApi;


CpmApi apiInstance = new CpmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Employee result = apiInstance.cpmEmployeeGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpmApi#cpmEmployeeGet");
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

[**Employee**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cpmEmployeeResourceIdGet"></a>
# **cpmEmployeeResourceIdGet**
> Employee cpmEmployeeResourceIdGet(authorization, organization, resourceId)

get: cpm/employee/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CpmApi;


CpmApi apiInstance = new CpmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Employee result = apiInstance.cpmEmployeeResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpmApi#cpmEmployeeResourceIdGet");
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

[**Employee**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cpmEmployeeactivitiesGet"></a>
# **cpmEmployeeactivitiesGet**
> Employeeactivities cpmEmployeeactivitiesGet(authorization, organization, where, order, skip, take)

get: cpm/employeeactivities



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CpmApi;


CpmApi apiInstance = new CpmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Employeeactivities result = apiInstance.cpmEmployeeactivitiesGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpmApi#cpmEmployeeactivitiesGet");
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

[**Employeeactivities**](Employeeactivities.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cpmEmployeeactivitiesResourceIdGet"></a>
# **cpmEmployeeactivitiesResourceIdGet**
> Employeeactivities cpmEmployeeactivitiesResourceIdGet(authorization, organization, resourceId)

get: cpm/employeeactivities/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CpmApi;


CpmApi apiInstance = new CpmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Employeeactivities result = apiInstance.cpmEmployeeactivitiesResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpmApi#cpmEmployeeactivitiesResourceIdGet");
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

[**Employeeactivities**](Employeeactivities.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cpmFirmGet"></a>
# **cpmFirmGet**
> Firm cpmFirmGet(authorization, organization, where, order, skip, take)

get: cpm/firm



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CpmApi;


CpmApi apiInstance = new CpmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Firm result = apiInstance.cpmFirmGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpmApi#cpmFirmGet");
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

[**Firm**](Firm.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cpmFirmResourceIdGet"></a>
# **cpmFirmResourceIdGet**
> Firm cpmFirmResourceIdGet(authorization, organization, resourceId)

get: cpm/firm/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.CpmApi;


CpmApi apiInstance = new CpmApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Firm result = apiInstance.cpmFirmResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CpmApi#cpmFirmResourceIdGet");
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

[**Firm**](Firm.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

