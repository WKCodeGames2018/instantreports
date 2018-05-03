# DirectoryApi

All URIs are relative to *http://ocde-pg.wktaa.de/sdn/rest/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**directoryMemberGet**](DirectoryApi.md#directoryMemberGet) | **GET** /directory/member | get: directory/member
[**directoryMemberResourceIdDelete**](DirectoryApi.md#directoryMemberResourceIdDelete) | **DELETE** /directory/member/{resourceId} | delete: directory/member
[**directoryMemberResourceIdGet**](DirectoryApi.md#directoryMemberResourceIdGet) | **GET** /directory/member/{resourceId} | get: directory/member/id
[**directoryMemberResourceIdPut**](DirectoryApi.md#directoryMemberResourceIdPut) | **PUT** /directory/member/{resourceId} | put: directory/member
[**directoryOrganizationGet**](DirectoryApi.md#directoryOrganizationGet) | **GET** /directory/organization | get: directory/organization
[**directoryOrganizationResourceIdDelete**](DirectoryApi.md#directoryOrganizationResourceIdDelete) | **DELETE** /directory/organization/{resourceId} | delete: directory/organization
[**directoryOrganizationResourceIdGet**](DirectoryApi.md#directoryOrganizationResourceIdGet) | **GET** /directory/organization/{resourceId} | get: directory/organization/id
[**directoryOrganizationResourceIdPut**](DirectoryApi.md#directoryOrganizationResourceIdPut) | **PUT** /directory/organization/{resourceId} | put: directory/organization
[**directoryResourcePost**](DirectoryApi.md#directoryResourcePost) | **POST** /directory/{resource} | post: directory/member
[**directoryTenantGet**](DirectoryApi.md#directoryTenantGet) | **GET** /directory/tenant | get: directory/tenant
[**directoryTenantResourceIdGet**](DirectoryApi.md#directoryTenantResourceIdGet) | **GET** /directory/tenant/{resourceId} | get: directory/tenant/id


<a name="directoryMemberGet"></a>
# **directoryMemberGet**
> Member directoryMemberGet(authorization, organization, where, order, skip, take)

get: directory/member



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Member result = apiInstance.directoryMemberGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#directoryMemberGet");
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

[**Member**](Member.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="directoryMemberResourceIdDelete"></a>
# **directoryMemberResourceIdDelete**
> directoryMemberResourceIdDelete(authorization, organization, resourceId, body)

delete: directory/member



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Member body = new Member(); // Member | Input.
try {
    apiInstance.directoryMemberResourceIdDelete(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#directoryMemberResourceIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Member**](Member.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="directoryMemberResourceIdGet"></a>
# **directoryMemberResourceIdGet**
> Member directoryMemberResourceIdGet(authorization, organization, resourceId)

get: directory/member/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Member result = apiInstance.directoryMemberResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#directoryMemberResourceIdGet");
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

[**Member**](Member.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="directoryMemberResourceIdPut"></a>
# **directoryMemberResourceIdPut**
> directoryMemberResourceIdPut(authorization, organization, resourceId, body)

put: directory/member



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Member body = new Member(); // Member | Input.
try {
    apiInstance.directoryMemberResourceIdPut(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#directoryMemberResourceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Member**](Member.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="directoryOrganizationGet"></a>
# **directoryOrganizationGet**
> Organization directoryOrganizationGet(authorization, organization, where, order, skip, take)

get: directory/organization



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Organization result = apiInstance.directoryOrganizationGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#directoryOrganizationGet");
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

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="directoryOrganizationResourceIdDelete"></a>
# **directoryOrganizationResourceIdDelete**
> directoryOrganizationResourceIdDelete(authorization, organization, resourceId, body)

delete: directory/organization



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Organization body = new Organization(); // Organization | Input.
try {
    apiInstance.directoryOrganizationResourceIdDelete(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#directoryOrganizationResourceIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Organization**](Organization.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="directoryOrganizationResourceIdGet"></a>
# **directoryOrganizationResourceIdGet**
> Organization directoryOrganizationResourceIdGet(authorization, organization, resourceId)

get: directory/organization/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Organization result = apiInstance.directoryOrganizationResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#directoryOrganizationResourceIdGet");
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

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="directoryOrganizationResourceIdPut"></a>
# **directoryOrganizationResourceIdPut**
> directoryOrganizationResourceIdPut(authorization, organization, resourceId, body)

put: directory/organization



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
Organization body = new Organization(); // Organization | Input.
try {
    apiInstance.directoryOrganizationResourceIdPut(authorization, organization, resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#directoryOrganizationResourceIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resourceId** | **String**| The desired Api-Contract ID |
 **body** | [**Organization**](Organization.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="directoryResourcePost"></a>
# **directoryResourcePost**
> directoryResourcePost(authorization, organization, resource, body)

post: directory/member



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resource = "resource_example"; // String | The Api-Contract name
Member body = new Member(); // Member | Input.
try {
    apiInstance.directoryResourcePost(authorization, organization, resource, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#directoryResourcePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| The authorization token. | [default to Bearer 47d86eefe5a4643d8bb23014eb412cc2]
 **organization** | **String**| The corresponding ID for Mandanten, Kanzlei etc. |
 **resource** | **String**| The Api-Contract name |
 **body** | [**Member**](Member.md)| Input. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="directoryTenantGet"></a>
# **directoryTenantGet**
> Tenant directoryTenantGet(authorization, organization, where, order, skip, take)

get: directory/tenant



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String where = ""; // String | Filter on one or more Api-Contract fields. Default: \"\"
String order = ""; // String | Sorting by a field of Api-contract. Default:\"\"
String skip = "0"; // String | Number of records to be skipped. Default: 0
String take = "15"; // String | Max. Number of result set. Default: 15
try {
    Tenant result = apiInstance.directoryTenantGet(authorization, organization, where, order, skip, take);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#directoryTenantGet");
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

[**Tenant**](Tenant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="directoryTenantResourceIdGet"></a>
# **directoryTenantResourceIdGet**
> Tenant directoryTenantResourceIdGet(authorization, organization, resourceId)

get: directory/tenant/id



### Example
```java
// Import classes:
//import instantreports.ApiException;
//import instantreports.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
String authorization = "Bearer 47d86eefe5a4643d8bb23014eb412cc2"; // String | The authorization token.
String organization = "organization_example"; // String | The corresponding ID for Mandanten, Kanzlei etc.
String resourceId = "resourceId_example"; // String | The desired Api-Contract ID
try {
    Tenant result = apiInstance.directoryTenantResourceIdGet(authorization, organization, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#directoryTenantResourceIdGet");
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

[**Tenant**](Tenant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

