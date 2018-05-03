# PayrollschemaApi

All URIs are relative to *http://ocde-pg.wktaa.de/sdn/rest/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**payrollSchemaLohnartGet**](PayrollschemaApi.md#payrollSchemaLohnartGet) | **GET** /payroll_schema/lohnart | get: payroll_schema/lohnart
[**payrollSchemaLohnartResourceIdGet**](PayrollschemaApi.md#payrollSchemaLohnartResourceIdGet) | **GET** /payroll_schema/lohnart/{resourceId} | get: payroll_schema/lohnart/id
[**payrollSchemaLohnartResourceIdPut**](PayrollschemaApi.md#payrollSchemaLohnartResourceIdPut) | **PUT** /payroll_schema/lohnart/{resourceId} | put: payroll_schema/lohnart
[**payrollSchemaLohnartenplanGet**](PayrollschemaApi.md#payrollSchemaLohnartenplanGet) | **GET** /payroll_schema/lohnartenplan | get: payroll_schema/lohnartenplan
[**payrollSchemaLohnartenplanResourceIdGet**](PayrollschemaApi.md#payrollSchemaLohnartenplanResourceIdGet) | **GET** /payroll_schema/lohnartenplan/{resourceId} | get: payroll_schema/lohnartenplan/id
[**payrollSchemaLohnartenplanResourceIdPut**](PayrollschemaApi.md#payrollSchemaLohnartenplanResourceIdPut) | **PUT** /payroll_schema/lohnartenplan/{resourceId} | put: payroll_schema/lohnartenplan
[**payrollSchemaLohnartmergedGet**](PayrollschemaApi.md#payrollSchemaLohnartmergedGet) | **GET** /payroll_schema/lohnartmerged | get: payroll_schema/lohnartmerged
[**payrollSchemaLohnartmergedResourceIdGet**](PayrollschemaApi.md#payrollSchemaLohnartmergedResourceIdGet) | **GET** /payroll_schema/lohnartmerged/{resourceId} | get: payroll_schema/lohnartmerged/id
[**payrollSchemaLohnartmergedResourceIdPut**](PayrollschemaApi.md#payrollSchemaLohnartmergedResourceIdPut) | **PUT** /payroll_schema/lohnartmerged/{resourceId} | put: payroll_schema/lohnartmerged
[**payrollSchemaResourcePost**](PayrollschemaApi.md#payrollSchemaResourcePost) | **POST** /payroll_schema/{resource} | post: payroll_schema/lohnart
[**payrollSchemaTemplateGet**](PayrollschemaApi.md#payrollSchemaTemplateGet) | **GET** /payroll_schema/template | get: payroll_schema/template
[**payrollSchemaTemplateResourceIdGet**](PayrollschemaApi.md#payrollSchemaTemplateResourceIdGet) | **GET** /payroll_schema/template/{resourceId} | get: payroll_schema/template/id
[**payrollSchemaTemplateResourceIdPut**](PayrollschemaApi.md#payrollSchemaTemplateResourceIdPut) | **PUT** /payroll_schema/template/{resourceId} | put: payroll_schema/template


<a name="payrollSchemaLohnartGet"></a>
# **payrollSchemaLohnartGet**
> Lohnart payrollSchemaLohnartGet(authorization, organization, where, order, skip, take)

get: payroll_schema/lohnart



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollschemaApi;


PayrollschemaApi apiInstance = new PayrollschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Lohnart result = apiInstance.payrollSchemaLohnartGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollschemaApi#payrollSchemaLohnartGet");
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

[**Lohnart**](Lohnart.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollSchemaLohnartResourceIdGet"></a>
# **payrollSchemaLohnartResourceIdGet**
> Lohnart payrollSchemaLohnartResourceIdGet(authorization, organization, resourceId)

get: payroll_schema/lohnart/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollschemaApi;


PayrollschemaApi apiInstance = new PayrollschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Lohnart result = apiInstance.payrollSchemaLohnartResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollschemaApi#payrollSchemaLohnartResourceIdGet");
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

[**Lohnart**](Lohnart.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollSchemaLohnartResourceIdPut"></a>
# **payrollSchemaLohnartResourceIdPut**
> payrollSchemaLohnartResourceIdPut(authorization, organization, resourceId, body)

put: payroll_schema/lohnart



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollschemaApi;


PayrollschemaApi apiInstance = new PayrollschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Lohnart body = new Lohnart(); // Lohnart | Input.
try {
    apiInstance.payrollSchemaLohnartResourceIdPut(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollschemaApi#payrollSchemaLohnartResourceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Lohnart**](Lohnart.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollSchemaLohnartenplanGet"></a>
# **payrollSchemaLohnartenplanGet**
> Lohnartenplan payrollSchemaLohnartenplanGet(authorization, organization, where, order, skip, take)

get: payroll_schema/lohnartenplan



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollschemaApi;


PayrollschemaApi apiInstance = new PayrollschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Lohnartenplan result = apiInstance.payrollSchemaLohnartenplanGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollschemaApi#payrollSchemaLohnartenplanGet");
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

[**Lohnartenplan**](Lohnartenplan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollSchemaLohnartenplanResourceIdGet"></a>
# **payrollSchemaLohnartenplanResourceIdGet**
> Lohnartenplan payrollSchemaLohnartenplanResourceIdGet(authorization, organization, resourceId)

get: payroll_schema/lohnartenplan/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollschemaApi;


PayrollschemaApi apiInstance = new PayrollschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Lohnartenplan result = apiInstance.payrollSchemaLohnartenplanResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollschemaApi#payrollSchemaLohnartenplanResourceIdGet");
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

[**Lohnartenplan**](Lohnartenplan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollSchemaLohnartenplanResourceIdPut"></a>
# **payrollSchemaLohnartenplanResourceIdPut**
> payrollSchemaLohnartenplanResourceIdPut(authorization, organization, resourceId, body)

put: payroll_schema/lohnartenplan



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollschemaApi;


PayrollschemaApi apiInstance = new PayrollschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Lohnartenplan body = new Lohnartenplan(); // Lohnartenplan | Input.
try {
    apiInstance.payrollSchemaLohnartenplanResourceIdPut(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollschemaApi#payrollSchemaLohnartenplanResourceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Lohnartenplan**](Lohnartenplan.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollSchemaLohnartmergedGet"></a>
# **payrollSchemaLohnartmergedGet**
> Lohnartmerged payrollSchemaLohnartmergedGet(authorization, organization, where, order, skip, take)

get: payroll_schema/lohnartmerged



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollschemaApi;


PayrollschemaApi apiInstance = new PayrollschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Lohnartmerged result = apiInstance.payrollSchemaLohnartmergedGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollschemaApi#payrollSchemaLohnartmergedGet");
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

[**Lohnartmerged**](Lohnartmerged.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollSchemaLohnartmergedResourceIdGet"></a>
# **payrollSchemaLohnartmergedResourceIdGet**
> Lohnartmerged payrollSchemaLohnartmergedResourceIdGet(authorization, organization, resourceId)

get: payroll_schema/lohnartmerged/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollschemaApi;


PayrollschemaApi apiInstance = new PayrollschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Lohnartmerged result = apiInstance.payrollSchemaLohnartmergedResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollschemaApi#payrollSchemaLohnartmergedResourceIdGet");
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

[**Lohnartmerged**](Lohnartmerged.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollSchemaLohnartmergedResourceIdPut"></a>
# **payrollSchemaLohnartmergedResourceIdPut**
> payrollSchemaLohnartmergedResourceIdPut(authorization, organization, resourceId, body)

put: payroll_schema/lohnartmerged



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollschemaApi;


PayrollschemaApi apiInstance = new PayrollschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Lohnartmerged body = new Lohnartmerged(); // Lohnartmerged | Input.
try {
    apiInstance.payrollSchemaLohnartmergedResourceIdPut(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollschemaApi#payrollSchemaLohnartmergedResourceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Lohnartmerged**](Lohnartmerged.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollSchemaResourcePost"></a>
# **payrollSchemaResourcePost**
> payrollSchemaResourcePost(authorization, organization, resource, body)

post: payroll_schema/lohnart



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollschemaApi;


PayrollschemaApi apiInstance = new PayrollschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resource = "resource_example"; // String | The Api-Contract name
Lohnart body = new Lohnart(); // Lohnart | Input.
try {
    apiInstance.payrollSchemaResourcePost(authorization, organization, resource, body);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollschemaApi#payrollSchemaResourcePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resource** | **String**| The Api-Contract name |
 **body** | [**Lohnart**](Lohnart.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollSchemaTemplateGet"></a>
# **payrollSchemaTemplateGet**
> Template payrollSchemaTemplateGet(authorization, organization, where, order, skip, take)

get: payroll_schema/template



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollschemaApi;


PayrollschemaApi apiInstance = new PayrollschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Template result = apiInstance.payrollSchemaTemplateGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollschemaApi#payrollSchemaTemplateGet");
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

[**Template**](Template.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollSchemaTemplateResourceIdGet"></a>
# **payrollSchemaTemplateResourceIdGet**
> Template payrollSchemaTemplateResourceIdGet(authorization, organization, resourceId)

get: payroll_schema/template/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollschemaApi;


PayrollschemaApi apiInstance = new PayrollschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Template result = apiInstance.payrollSchemaTemplateResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollschemaApi#payrollSchemaTemplateResourceIdGet");
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

[**Template**](Template.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollSchemaTemplateResourceIdPut"></a>
# **payrollSchemaTemplateResourceIdPut**
> payrollSchemaTemplateResourceIdPut(authorization, organization, resourceId, body)

put: payroll_schema/template



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollschemaApi;


PayrollschemaApi apiInstance = new PayrollschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Template body = new Template(); // Template | Input.
try {
    apiInstance.payrollSchemaTemplateResourceIdPut(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollschemaApi#payrollSchemaTemplateResourceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Template**](Template.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

