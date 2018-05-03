# PayrollApi

All URIs are relative to *http://ocde-pg.wktaa.de/sdn/rest/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**payrollFirmendatenGet**](PayrollApi.md#payrollFirmendatenGet) | **GET** /payroll/firmendaten | get: payroll/firmendaten
[**payrollFirmendatenResourceIdGet**](PayrollApi.md#payrollFirmendatenResourceIdGet) | **GET** /payroll/firmendaten/{resourceId} | get: payroll/firmendaten/id
[**payrollLohnerfassungsschluesselGet**](PayrollApi.md#payrollLohnerfassungsschluesselGet) | **GET** /payroll/lohnerfassungsschluessel | get: payroll/lohnerfassungsschluessel
[**payrollLohnerfassungsschluesselResourceIdGet**](PayrollApi.md#payrollLohnerfassungsschluesselResourceIdGet) | **GET** /payroll/lohnerfassungsschluessel/{resourceId} | get: payroll/lohnerfassungsschluessel/id
[**payrollLohnerfassungsschluesselResourceIdPut**](PayrollApi.md#payrollLohnerfassungsschluesselResourceIdPut) | **PUT** /payroll/lohnerfassungsschluessel/{resourceId} | put: payroll/lohnerfassungsschluessel
[**payrollMitarbeiterGet**](PayrollApi.md#payrollMitarbeiterGet) | **GET** /payroll/mitarbeiter | get: payroll/mitarbeiter
[**payrollMitarbeiterResourceIdGet**](PayrollApi.md#payrollMitarbeiterResourceIdGet) | **GET** /payroll/mitarbeiter/{resourceId} | get: payroll/mitarbeiter/id
[**payrollMitarbeiterResourceIdPut**](PayrollApi.md#payrollMitarbeiterResourceIdPut) | **PUT** /payroll/mitarbeiter/{resourceId} | put: payroll/mitarbeiter
[**payrollPersonalfragebogenGet**](PayrollApi.md#payrollPersonalfragebogenGet) | **GET** /payroll/personalfragebogen | get: payroll/personalfragebogen
[**payrollPersonalfragebogenResourceIdGet**](PayrollApi.md#payrollPersonalfragebogenResourceIdGet) | **GET** /payroll/personalfragebogen/{resourceId} | get: payroll/personalfragebogen/id
[**payrollPersonalfragebogenResourceIdPut**](PayrollApi.md#payrollPersonalfragebogenResourceIdPut) | **PUT** /payroll/personalfragebogen/{resourceId} | put: payroll/personalfragebogen
[**payrollResourcePost**](PayrollApi.md#payrollResourcePost) | **POST** /payroll/{resource} | post: payroll/mitarbeiter
[**payrollSofortmeldungGet**](PayrollApi.md#payrollSofortmeldungGet) | **GET** /payroll/sofortmeldung | get: payroll/instantmessage
[**payrollSofortmeldungResourceIdGet**](PayrollApi.md#payrollSofortmeldungResourceIdGet) | **GET** /payroll/sofortmeldung/{resourceId} | get: payroll/instantmessage/id


<a name="payrollFirmendatenGet"></a>
# **payrollFirmendatenGet**
> Firmendaten payrollFirmendatenGet(authorization, organization, where, order, skip, take)

get: payroll/firmendaten



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollApi;


PayrollApi apiInstance = new PayrollApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Firmendaten result = apiInstance.payrollFirmendatenGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#payrollFirmendatenGet");
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

[**Firmendaten**](Firmendaten.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollFirmendatenResourceIdGet"></a>
# **payrollFirmendatenResourceIdGet**
> Firmendaten payrollFirmendatenResourceIdGet(authorization, organization, resourceId)

get: payroll/firmendaten/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollApi;


PayrollApi apiInstance = new PayrollApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Firmendaten result = apiInstance.payrollFirmendatenResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#payrollFirmendatenResourceIdGet");
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

[**Firmendaten**](Firmendaten.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollLohnerfassungsschluesselGet"></a>
# **payrollLohnerfassungsschluesselGet**
> Lohnerfassungsschluessel payrollLohnerfassungsschluesselGet(authorization, organization, where, order, skip, take)

get: payroll/lohnerfassungsschluessel



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollApi;


PayrollApi apiInstance = new PayrollApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Lohnerfassungsschluessel result = apiInstance.payrollLohnerfassungsschluesselGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#payrollLohnerfassungsschluesselGet");
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

[**Lohnerfassungsschluessel**](Lohnerfassungsschluessel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollLohnerfassungsschluesselResourceIdGet"></a>
# **payrollLohnerfassungsschluesselResourceIdGet**
> Lohnerfassungsschluessel payrollLohnerfassungsschluesselResourceIdGet(authorization, organization, resourceId)

get: payroll/lohnerfassungsschluessel/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollApi;


PayrollApi apiInstance = new PayrollApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Lohnerfassungsschluessel result = apiInstance.payrollLohnerfassungsschluesselResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#payrollLohnerfassungsschluesselResourceIdGet");
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

[**Lohnerfassungsschluessel**](Lohnerfassungsschluessel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollLohnerfassungsschluesselResourceIdPut"></a>
# **payrollLohnerfassungsschluesselResourceIdPut**
> payrollLohnerfassungsschluesselResourceIdPut(authorization, organization, resourceId, body)

put: payroll/lohnerfassungsschluessel



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollApi;


PayrollApi apiInstance = new PayrollApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Lohnerfassungsschluessel body = new Lohnerfassungsschluessel(); // Lohnerfassungsschluessel | Input.
try {
    apiInstance.payrollLohnerfassungsschluesselResourceIdPut(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#payrollLohnerfassungsschluesselResourceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Lohnerfassungsschluessel**](Lohnerfassungsschluessel.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollMitarbeiterGet"></a>
# **payrollMitarbeiterGet**
> Mitarbeiter payrollMitarbeiterGet(authorization, organization, where, order, skip, take)

get: payroll/mitarbeiter



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollApi;


PayrollApi apiInstance = new PayrollApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Mitarbeiter result = apiInstance.payrollMitarbeiterGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#payrollMitarbeiterGet");
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

[**Mitarbeiter**](Mitarbeiter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollMitarbeiterResourceIdGet"></a>
# **payrollMitarbeiterResourceIdGet**
> Mitarbeiter payrollMitarbeiterResourceIdGet(authorization, organization, resourceId)

get: payroll/mitarbeiter/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollApi;


PayrollApi apiInstance = new PayrollApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Mitarbeiter result = apiInstance.payrollMitarbeiterResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#payrollMitarbeiterResourceIdGet");
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

[**Mitarbeiter**](Mitarbeiter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollMitarbeiterResourceIdPut"></a>
# **payrollMitarbeiterResourceIdPut**
> payrollMitarbeiterResourceIdPut(authorization, organization, resourceId, body)

put: payroll/mitarbeiter



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollApi;


PayrollApi apiInstance = new PayrollApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Mitarbeiter body = new Mitarbeiter(); // Mitarbeiter | Input.
try {
    apiInstance.payrollMitarbeiterResourceIdPut(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#payrollMitarbeiterResourceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Mitarbeiter**](Mitarbeiter.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollPersonalfragebogenGet"></a>
# **payrollPersonalfragebogenGet**
> Personalfragebogen payrollPersonalfragebogenGet(authorization, organization, where, order, skip, take)

get: payroll/personalfragebogen



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollApi;


PayrollApi apiInstance = new PayrollApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Personalfragebogen result = apiInstance.payrollPersonalfragebogenGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#payrollPersonalfragebogenGet");
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

[**Personalfragebogen**](Personalfragebogen.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollPersonalfragebogenResourceIdGet"></a>
# **payrollPersonalfragebogenResourceIdGet**
> Personalfragebogen payrollPersonalfragebogenResourceIdGet(authorization, organization, resourceId)

get: payroll/personalfragebogen/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollApi;


PayrollApi apiInstance = new PayrollApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Personalfragebogen result = apiInstance.payrollPersonalfragebogenResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#payrollPersonalfragebogenResourceIdGet");
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

[**Personalfragebogen**](Personalfragebogen.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollPersonalfragebogenResourceIdPut"></a>
# **payrollPersonalfragebogenResourceIdPut**
> payrollPersonalfragebogenResourceIdPut(authorization, organization, resourceId, body)

put: payroll/personalfragebogen



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollApi;


PayrollApi apiInstance = new PayrollApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Personalfragebogen body = new Personalfragebogen(); // Personalfragebogen | Input.
try {
    apiInstance.payrollPersonalfragebogenResourceIdPut(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#payrollPersonalfragebogenResourceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Personalfragebogen**](Personalfragebogen.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollResourcePost"></a>
# **payrollResourcePost**
> payrollResourcePost(authorization, organization, resource, body)

post: payroll/mitarbeiter



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollApi;


PayrollApi apiInstance = new PayrollApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resource = "resource_example"; // String | The Api-Contract name
Mitarbeiter body = new Mitarbeiter(); // Mitarbeiter | Input.
try {
    apiInstance.payrollResourcePost(authorization, organization, resource, body);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#payrollResourcePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resource** | **String**| The Api-Contract name |
 **body** | [**Mitarbeiter**](Mitarbeiter.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollSofortmeldungGet"></a>
# **payrollSofortmeldungGet**
> Sofortmeldung payrollSofortmeldungGet(authorization, organization, where, order, skip, take)

get: payroll/instantmessage



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollApi;


PayrollApi apiInstance = new PayrollApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Sofortmeldung result = apiInstance.payrollSofortmeldungGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#payrollSofortmeldungGet");
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

[**Sofortmeldung**](Sofortmeldung.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payrollSofortmeldungResourceIdGet"></a>
# **payrollSofortmeldungResourceIdGet**
> Sofortmeldung payrollSofortmeldungResourceIdGet(authorization, organization, resourceId)

get: payroll/instantmessage/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.PayrollApi;


PayrollApi apiInstance = new PayrollApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Sofortmeldung result = apiInstance.payrollSofortmeldungResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayrollApi#payrollSofortmeldungResourceIdGet");
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

[**Sofortmeldung**](Sofortmeldung.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

