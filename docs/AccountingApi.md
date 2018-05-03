# AccountingApi

All URIs are relative to *http://ocde-pg.wktaa.de/sdn/rest/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountingEinstellungenGet**](AccountingApi.md#accountingEinstellungenGet) | **GET** /accounting/einstellungen | get: accounting/einstellungen
[**accountingEinstellungenResourceIdGet**](AccountingApi.md#accountingEinstellungenResourceIdGet) | **GET** /accounting/einstellungen/{resourceId} | get: accounting/einstellungen/id
[**accountingKontostammGet**](AccountingApi.md#accountingKontostammGet) | **GET** /accounting/kontostamm | get: accounting/kontostammdaten
[**accountingKontostammResourceIdGet**](AccountingApi.md#accountingKontostammResourceIdGet) | **GET** /accounting/kontostamm/{resourceId} | get: accounting/kontostammdaten/id


<a name="accountingEinstellungenGet"></a>
# **accountingEinstellungenGet**
> Einstellungen accountingEinstellungenGet(authorization, organization, where, order, skip, take)

get: accounting/einstellungen



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.AccountingApi;


AccountingApi apiInstance = new AccountingApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Einstellungen result = apiInstance.accountingEinstellungenGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#accountingEinstellungenGet");
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

[**Einstellungen**](Einstellungen.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountingEinstellungenResourceIdGet"></a>
# **accountingEinstellungenResourceIdGet**
> Einstellungen accountingEinstellungenResourceIdGet(authorization, organization, resourceId)

get: accounting/einstellungen/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.AccountingApi;


AccountingApi apiInstance = new AccountingApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Einstellungen result = apiInstance.accountingEinstellungenResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#accountingEinstellungenResourceIdGet");
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

[**Einstellungen**](Einstellungen.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountingKontostammGet"></a>
# **accountingKontostammGet**
> Kontostamm accountingKontostammGet(authorization, organization, where, order, skip, take)

get: accounting/kontostammdaten



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.AccountingApi;


AccountingApi apiInstance = new AccountingApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Kontostamm result = apiInstance.accountingKontostammGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#accountingKontostammGet");
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

[**Kontostamm**](Kontostamm.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountingKontostammResourceIdGet"></a>
# **accountingKontostammResourceIdGet**
> Kontostamm accountingKontostammResourceIdGet(authorization, organization, resourceId)

get: accounting/kontostammdaten/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.AccountingApi;


AccountingApi apiInstance = new AccountingApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Kontostamm result = apiInstance.accountingKontostammResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountingApi#accountingKontostammResourceIdGet");
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

[**Kontostamm**](Kontostamm.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

