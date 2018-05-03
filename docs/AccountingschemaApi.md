# AccountingschemaApi

All URIs are relative to *http://ocde-pg.wktaa.de/sdn/rest/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountingSchemaGruppensummeGet**](AccountingschemaApi.md#accountingSchemaGruppensummeGet) | **GET** /accounting_schema/gruppensumme | get: accounting_schema/gruppensummen
[**accountingSchemaGruppensummeResourceIdGet**](AccountingschemaApi.md#accountingSchemaGruppensummeResourceIdGet) | **GET** /accounting_schema/gruppensumme/{resourceId} | get: accounting_schema/gruppensummen/id
[**accountingSchemaSchemaentryGet**](AccountingschemaApi.md#accountingSchemaSchemaentryGet) | **GET** /accounting_schema/schemaentry | get: accounting_schema/schemaentries
[**accountingSchemaSchemaentryResourceIdGet**](AccountingschemaApi.md#accountingSchemaSchemaentryResourceIdGet) | **GET** /accounting_schema/schemaentry/{resourceId} | get: accounting_schema/schemaentries/id


<a name="accountingSchemaGruppensummeGet"></a>
# **accountingSchemaGruppensummeGet**
> Gruppensumme accountingSchemaGruppensummeGet(authorization, organization, where, order, skip, take)

get: accounting_schema/gruppensummen



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.AccountingschemaApi;


AccountingschemaApi apiInstance = new AccountingschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Gruppensumme result = apiInstance.accountingSchemaGruppensummeGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingschemaApi#accountingSchemaGruppensummeGet");
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

[**Gruppensumme**](Gruppensumme.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountingSchemaGruppensummeResourceIdGet"></a>
# **accountingSchemaGruppensummeResourceIdGet**
> Gruppensumme accountingSchemaGruppensummeResourceIdGet(authorization, organization, resourceId)

get: accounting_schema/gruppensummen/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.AccountingschemaApi;


AccountingschemaApi apiInstance = new AccountingschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Gruppensumme result = apiInstance.accountingSchemaGruppensummeResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingschemaApi#accountingSchemaGruppensummeResourceIdGet");
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

[**Gruppensumme**](Gruppensumme.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountingSchemaSchemaentryGet"></a>
# **accountingSchemaSchemaentryGet**
> Schemaentry accountingSchemaSchemaentryGet(authorization, organization, where, order, skip, take)

get: accounting_schema/schemaentries



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.AccountingschemaApi;


AccountingschemaApi apiInstance = new AccountingschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Schemaentry result = apiInstance.accountingSchemaSchemaentryGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingschemaApi#accountingSchemaSchemaentryGet");
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

[**Schemaentry**](Schemaentry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountingSchemaSchemaentryResourceIdGet"></a>
# **accountingSchemaSchemaentryResourceIdGet**
> Schemaentry accountingSchemaSchemaentryResourceIdGet(authorization, organization, resourceId)

get: accounting_schema/schemaentries/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.AccountingschemaApi;


AccountingschemaApi apiInstance = new AccountingschemaApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Schemaentry result = apiInstance.accountingSchemaSchemaentryResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingschemaApi#accountingSchemaSchemaentryResourceIdGet");
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

[**Schemaentry**](Schemaentry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

