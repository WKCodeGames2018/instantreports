# BankingApi

All URIs are relative to *http://ocde-pg.wktaa.de/sdn/rest/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bankingBankaccountGet**](BankingApi.md#bankingBankaccountGet) | **GET** /banking/bankaccount | get: banking/bankaccount
[**bankingBankaccountResourceIdGet**](BankingApi.md#bankingBankaccountResourceIdGet) | **GET** /banking/bankaccount/{resourceId} | get: banking/bankaccount/id
[**bankingBankingprovisionGet**](BankingApi.md#bankingBankingprovisionGet) | **GET** /banking/bankingprovision | get: banking/bankingprovision
[**bankingBankingprovisionResourceIdGet**](BankingApi.md#bankingBankingprovisionResourceIdGet) | **GET** /banking/bankingprovision/{resourceId} | get: banking/bankingprovision/id
[**bankingPaymentGet**](BankingApi.md#bankingPaymentGet) | **GET** /banking/payment | get: banking/payment
[**bankingPaymentResourceIdGet**](BankingApi.md#bankingPaymentResourceIdGet) | **GET** /banking/payment/{resourceId} | get: banking/payment/id


<a name="bankingBankaccountGet"></a>
# **bankingBankaccountGet**
> Bankaccount bankingBankaccountGet(authorization, organization, where, order, skip, take)

get: banking/bankaccount



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.BankingApi;


BankingApi apiInstance = new BankingApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Bankaccount result = apiInstance.bankingBankaccountGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankingApi#bankingBankaccountGet");
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

[**Bankaccount**](Bankaccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bankingBankaccountResourceIdGet"></a>
# **bankingBankaccountResourceIdGet**
> Bankaccount bankingBankaccountResourceIdGet(authorization, organization, resourceId)

get: banking/bankaccount/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.BankingApi;


BankingApi apiInstance = new BankingApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Bankaccount result = apiInstance.bankingBankaccountResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankingApi#bankingBankaccountResourceIdGet");
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

[**Bankaccount**](Bankaccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bankingBankingprovisionGet"></a>
# **bankingBankingprovisionGet**
> Bankingprovision bankingBankingprovisionGet(authorization, organization, where, order, skip, take)

get: banking/bankingprovision



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.BankingApi;


BankingApi apiInstance = new BankingApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Bankingprovision result = apiInstance.bankingBankingprovisionGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankingApi#bankingBankingprovisionGet");
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

[**Bankingprovision**](Bankingprovision.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bankingBankingprovisionResourceIdGet"></a>
# **bankingBankingprovisionResourceIdGet**
> Bankingprovision bankingBankingprovisionResourceIdGet(authorization, organization, resourceId)

get: banking/bankingprovision/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.BankingApi;


BankingApi apiInstance = new BankingApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Bankingprovision result = apiInstance.bankingBankingprovisionResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankingApi#bankingBankingprovisionResourceIdGet");
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

[**Bankingprovision**](Bankingprovision.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bankingPaymentGet"></a>
# **bankingPaymentGet**
> Payment bankingPaymentGet(authorization, organization, where, order, skip, take)

get: banking/payment



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.BankingApi;


BankingApi apiInstance = new BankingApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Payment result = apiInstance.bankingPaymentGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankingApi#bankingPaymentGet");
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

[**Payment**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bankingPaymentResourceIdGet"></a>
# **bankingPaymentResourceIdGet**
> Payment bankingPaymentResourceIdGet(authorization, organization, resourceId)

get: banking/payment/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.BankingApi;


BankingApi apiInstance = new BankingApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Payment result = apiInstance.bankingPaymentResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankingApi#bankingPaymentResourceIdGet");
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

[**Payment**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

