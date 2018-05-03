# instantreports-service

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>codegames.codefiction</groupId>
    <artifactId>instantreports-service</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "codegames.codefiction:instantreports-service:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/instantreports-service-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import instantreports.*;
import instantreports.auth.*;
import instantreports.model.*;
import instantreports.api.AccountingApi;

import java.io.File;
import java.util.*;

public class AccountingApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://ocde-pg.wktaa.de/sdn/rest/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountingApi* | [**accountingEinstellungenGet**](docs/AccountingApi.md#accountingEinstellungenGet) | **GET** /accounting/einstellungen | get: accounting/einstellungen
*AccountingApi* | [**accountingEinstellungenResourceIdGet**](docs/AccountingApi.md#accountingEinstellungenResourceIdGet) | **GET** /accounting/einstellungen/{resourceId} | get: accounting/einstellungen/id
*AccountingApi* | [**accountingKontostammGet**](docs/AccountingApi.md#accountingKontostammGet) | **GET** /accounting/kontostamm | get: accounting/kontostammdaten
*AccountingApi* | [**accountingKontostammResourceIdGet**](docs/AccountingApi.md#accountingKontostammResourceIdGet) | **GET** /accounting/kontostamm/{resourceId} | get: accounting/kontostammdaten/id
*AccountingschemaApi* | [**accountingSchemaGruppensummeGet**](docs/AccountingschemaApi.md#accountingSchemaGruppensummeGet) | **GET** /accounting_schema/gruppensumme | get: accounting_schema/gruppensummen
*AccountingschemaApi* | [**accountingSchemaGruppensummeResourceIdGet**](docs/AccountingschemaApi.md#accountingSchemaGruppensummeResourceIdGet) | **GET** /accounting_schema/gruppensumme/{resourceId} | get: accounting_schema/gruppensummen/id
*AccountingschemaApi* | [**accountingSchemaSchemaentryGet**](docs/AccountingschemaApi.md#accountingSchemaSchemaentryGet) | **GET** /accounting_schema/schemaentry | get: accounting_schema/schemaentries
*AccountingschemaApi* | [**accountingSchemaSchemaentryResourceIdGet**](docs/AccountingschemaApi.md#accountingSchemaSchemaentryResourceIdGet) | **GET** /accounting_schema/schemaentry/{resourceId} | get: accounting_schema/schemaentries/id
*BankingApi* | [**bankingBankaccountGet**](docs/BankingApi.md#bankingBankaccountGet) | **GET** /banking/bankaccount | get: banking/bankaccount
*BankingApi* | [**bankingBankaccountResourceIdGet**](docs/BankingApi.md#bankingBankaccountResourceIdGet) | **GET** /banking/bankaccount/{resourceId} | get: banking/bankaccount/id
*BankingApi* | [**bankingBankingprovisionGet**](docs/BankingApi.md#bankingBankingprovisionGet) | **GET** /banking/bankingprovision | get: banking/bankingprovision
*BankingApi* | [**bankingBankingprovisionResourceIdGet**](docs/BankingApi.md#bankingBankingprovisionResourceIdGet) | **GET** /banking/bankingprovision/{resourceId} | get: banking/bankingprovision/id
*BankingApi* | [**bankingPaymentGet**](docs/BankingApi.md#bankingPaymentGet) | **GET** /banking/payment | get: banking/payment
*BankingApi* | [**bankingPaymentResourceIdGet**](docs/BankingApi.md#bankingPaymentResourceIdGet) | **GET** /banking/payment/{resourceId} | get: banking/payment/id
*CommonApi* | [**commonResourcePost**](docs/CommonApi.md#commonResourcePost) | **POST** /common/{resource} | post: common/tagdefinition
*CommonApi* | [**commonTagdefinitionGet**](docs/CommonApi.md#commonTagdefinitionGet) | **GET** /common/tagdefinition | get: common/tagdefinition
*CommonApi* | [**commonTagdefinitionResourceIdGet**](docs/CommonApi.md#commonTagdefinitionResourceIdGet) | **GET** /common/tagdefinition/{resourceId} | get: common/tagdefinition/id
*CommonApi* | [**commonTagdefinitionResourceIdPut**](docs/CommonApi.md#commonTagdefinitionResourceIdPut) | **PUT** /common/tagdefinition/{resourceId} | put: common/tagdefinition
*CpmApi* | [**cpmClientGet**](docs/CpmApi.md#cpmClientGet) | **GET** /cpm/client | get: cpm/client
*CpmApi* | [**cpmClientResourceIdGet**](docs/CpmApi.md#cpmClientResourceIdGet) | **GET** /cpm/client/{resourceId} | get: cpm/client/id
*CpmApi* | [**cpmClientactivitiesGet**](docs/CpmApi.md#cpmClientactivitiesGet) | **GET** /cpm/clientactivities | get: cpm/clientactivities
*CpmApi* | [**cpmClientactivitiesResourceIdGet**](docs/CpmApi.md#cpmClientactivitiesResourceIdGet) | **GET** /cpm/clientactivities/{resourceId} | get: cpm/clientactivities/id
*CpmApi* | [**cpmClientactivitychangestateResourceIdPut**](docs/CpmApi.md#cpmClientactivitychangestateResourceIdPut) | **PUT** /cpm/clientactivitychangestate/{resourceId} | put: cpm/clientactivitychangestate
*CpmApi* | [**cpmEmployeeGet**](docs/CpmApi.md#cpmEmployeeGet) | **GET** /cpm/employee | get: cpm/employee
*CpmApi* | [**cpmEmployeeResourceIdGet**](docs/CpmApi.md#cpmEmployeeResourceIdGet) | **GET** /cpm/employee/{resourceId} | get: cpm/employee/id
*CpmApi* | [**cpmEmployeeactivitiesGet**](docs/CpmApi.md#cpmEmployeeactivitiesGet) | **GET** /cpm/employeeactivities | get: cpm/employeeactivities
*CpmApi* | [**cpmEmployeeactivitiesResourceIdGet**](docs/CpmApi.md#cpmEmployeeactivitiesResourceIdGet) | **GET** /cpm/employeeactivities/{resourceId} | get: cpm/employeeactivities/id
*CpmApi* | [**cpmFirmGet**](docs/CpmApi.md#cpmFirmGet) | **GET** /cpm/firm | get: cpm/firm
*CpmApi* | [**cpmFirmResourceIdGet**](docs/CpmApi.md#cpmFirmResourceIdGet) | **GET** /cpm/firm/{resourceId} | get: cpm/firm/id
*CrmApi* | [**crmCompanydataGet**](docs/CrmApi.md#crmCompanydataGet) | **GET** /crm/companydata | get: crm/firmendaten
*CrmApi* | [**crmCompanydataResourceIdGet**](docs/CrmApi.md#crmCompanydataResourceIdGet) | **GET** /crm/companydata/{resourceId} | get: crm/firmendaten/id
*CrmApi* | [**crmCompanydataResourceIdPut**](docs/CrmApi.md#crmCompanydataResourceIdPut) | **PUT** /crm/companydata/{resourceId} | put: crm/firmendaten
*CrmApi* | [**crmContactGet**](docs/CrmApi.md#crmContactGet) | **GET** /crm/contact | get: crm/contact
*CrmApi* | [**crmContactResourceIdGet**](docs/CrmApi.md#crmContactResourceIdGet) | **GET** /crm/contact/{resourceId} | get: crm/contact/id
*CrmApi* | [**crmContactResourceIdPut**](docs/CrmApi.md#crmContactResourceIdPut) | **PUT** /crm/contact/{resourceId} | put: crm/contact
*CrmApi* | [**crmLocationGet**](docs/CrmApi.md#crmLocationGet) | **GET** /crm/location | get: crm/location
*CrmApi* | [**crmLocationResourceIdGet**](docs/CrmApi.md#crmLocationResourceIdGet) | **GET** /crm/location/{resourceId} | get: crm/location/id
*CrmApi* | [**crmLocationResourceIdPut**](docs/CrmApi.md#crmLocationResourceIdPut) | **PUT** /crm/location/{resourceId} | put: crm/location
*CrmApi* | [**crmResourcePost**](docs/CrmApi.md#crmResourcePost) | **POST** /crm/{resource} | post: crm/firmendaten
*DirectoryApi* | [**directoryMemberGet**](docs/DirectoryApi.md#directoryMemberGet) | **GET** /directory/member | get: directory/member
*DirectoryApi* | [**directoryMemberResourceIdDelete**](docs/DirectoryApi.md#directoryMemberResourceIdDelete) | **DELETE** /directory/member/{resourceId} | delete: directory/member
*DirectoryApi* | [**directoryMemberResourceIdGet**](docs/DirectoryApi.md#directoryMemberResourceIdGet) | **GET** /directory/member/{resourceId} | get: directory/member/id
*DirectoryApi* | [**directoryMemberResourceIdPut**](docs/DirectoryApi.md#directoryMemberResourceIdPut) | **PUT** /directory/member/{resourceId} | put: directory/member
*DirectoryApi* | [**directoryOrganizationGet**](docs/DirectoryApi.md#directoryOrganizationGet) | **GET** /directory/organization | get: directory/organization
*DirectoryApi* | [**directoryOrganizationResourceIdDelete**](docs/DirectoryApi.md#directoryOrganizationResourceIdDelete) | **DELETE** /directory/organization/{resourceId} | delete: directory/organization
*DirectoryApi* | [**directoryOrganizationResourceIdGet**](docs/DirectoryApi.md#directoryOrganizationResourceIdGet) | **GET** /directory/organization/{resourceId} | get: directory/organization/id
*DirectoryApi* | [**directoryOrganizationResourceIdPut**](docs/DirectoryApi.md#directoryOrganizationResourceIdPut) | **PUT** /directory/organization/{resourceId} | put: directory/organization
*DirectoryApi* | [**directoryResourcePost**](docs/DirectoryApi.md#directoryResourcePost) | **POST** /directory/{resource} | post: directory/member
*DirectoryApi* | [**directoryTenantGet**](docs/DirectoryApi.md#directoryTenantGet) | **GET** /directory/tenant | get: directory/tenant
*DirectoryApi* | [**directoryTenantResourceIdGet**](docs/DirectoryApi.md#directoryTenantResourceIdGet) | **GET** /directory/tenant/{resourceId} | get: directory/tenant/id
*MeServiceApi* | [**meGet**](docs/MeServiceApi.md#meGet) | **GET** /me | me service
*MeldecenterApi* | [**meldecenterMeldungendataGet**](docs/MeldecenterApi.md#meldecenterMeldungendataGet) | **GET** /meldecenter/meldungendata | get: meldecenter/meldung
*MeldecenterApi* | [**meldecenterMeldungendataResourceIdGet**](docs/MeldecenterApi.md#meldecenterMeldungendataResourceIdGet) | **GET** /meldecenter/meldungendata/{resourceId} | get: meldecenter/meldung/id
*MeldecenterApi* | [**meldecenterMeldungendataResourceIdPut**](docs/MeldecenterApi.md#meldecenterMeldungendataResourceIdPut) | **PUT** /meldecenter/meldungendata/{resourceId} | put: meldecenter/meldung
*MeldecenterApi* | [**meldecenterResourcePost**](docs/MeldecenterApi.md#meldecenterResourcePost) | **POST** /meldecenter/{resource} | post: meldecenter/meldung
*PayrollApi* | [**payrollFirmendatenGet**](docs/PayrollApi.md#payrollFirmendatenGet) | **GET** /payroll/firmendaten | get: payroll/firmendaten
*PayrollApi* | [**payrollFirmendatenResourceIdGet**](docs/PayrollApi.md#payrollFirmendatenResourceIdGet) | **GET** /payroll/firmendaten/{resourceId} | get: payroll/firmendaten/id
*PayrollApi* | [**payrollLohnerfassungsschluesselGet**](docs/PayrollApi.md#payrollLohnerfassungsschluesselGet) | **GET** /payroll/lohnerfassungsschluessel | get: payroll/lohnerfassungsschluessel
*PayrollApi* | [**payrollLohnerfassungsschluesselResourceIdGet**](docs/PayrollApi.md#payrollLohnerfassungsschluesselResourceIdGet) | **GET** /payroll/lohnerfassungsschluessel/{resourceId} | get: payroll/lohnerfassungsschluessel/id
*PayrollApi* | [**payrollLohnerfassungsschluesselResourceIdPut**](docs/PayrollApi.md#payrollLohnerfassungsschluesselResourceIdPut) | **PUT** /payroll/lohnerfassungsschluessel/{resourceId} | put: payroll/lohnerfassungsschluessel
*PayrollApi* | [**payrollMitarbeiterGet**](docs/PayrollApi.md#payrollMitarbeiterGet) | **GET** /payroll/mitarbeiter | get: payroll/mitarbeiter
*PayrollApi* | [**payrollMitarbeiterResourceIdGet**](docs/PayrollApi.md#payrollMitarbeiterResourceIdGet) | **GET** /payroll/mitarbeiter/{resourceId} | get: payroll/mitarbeiter/id
*PayrollApi* | [**payrollMitarbeiterResourceIdPut**](docs/PayrollApi.md#payrollMitarbeiterResourceIdPut) | **PUT** /payroll/mitarbeiter/{resourceId} | put: payroll/mitarbeiter
*PayrollApi* | [**payrollPersonalfragebogenGet**](docs/PayrollApi.md#payrollPersonalfragebogenGet) | **GET** /payroll/personalfragebogen | get: payroll/personalfragebogen
*PayrollApi* | [**payrollPersonalfragebogenResourceIdGet**](docs/PayrollApi.md#payrollPersonalfragebogenResourceIdGet) | **GET** /payroll/personalfragebogen/{resourceId} | get: payroll/personalfragebogen/id
*PayrollApi* | [**payrollPersonalfragebogenResourceIdPut**](docs/PayrollApi.md#payrollPersonalfragebogenResourceIdPut) | **PUT** /payroll/personalfragebogen/{resourceId} | put: payroll/personalfragebogen
*PayrollApi* | [**payrollResourcePost**](docs/PayrollApi.md#payrollResourcePost) | **POST** /payroll/{resource} | post: payroll/mitarbeiter
*PayrollApi* | [**payrollSofortmeldungGet**](docs/PayrollApi.md#payrollSofortmeldungGet) | **GET** /payroll/sofortmeldung | get: payroll/instantmessage
*PayrollApi* | [**payrollSofortmeldungResourceIdGet**](docs/PayrollApi.md#payrollSofortmeldungResourceIdGet) | **GET** /payroll/sofortmeldung/{resourceId} | get: payroll/instantmessage/id
*PayrollschemaApi* | [**payrollSchemaLohnartGet**](docs/PayrollschemaApi.md#payrollSchemaLohnartGet) | **GET** /payroll_schema/lohnart | get: payroll_schema/lohnart
*PayrollschemaApi* | [**payrollSchemaLohnartResourceIdGet**](docs/PayrollschemaApi.md#payrollSchemaLohnartResourceIdGet) | **GET** /payroll_schema/lohnart/{resourceId} | get: payroll_schema/lohnart/id
*PayrollschemaApi* | [**payrollSchemaLohnartResourceIdPut**](docs/PayrollschemaApi.md#payrollSchemaLohnartResourceIdPut) | **PUT** /payroll_schema/lohnart/{resourceId} | put: payroll_schema/lohnart
*PayrollschemaApi* | [**payrollSchemaLohnartenplanGet**](docs/PayrollschemaApi.md#payrollSchemaLohnartenplanGet) | **GET** /payroll_schema/lohnartenplan | get: payroll_schema/lohnartenplan
*PayrollschemaApi* | [**payrollSchemaLohnartenplanResourceIdGet**](docs/PayrollschemaApi.md#payrollSchemaLohnartenplanResourceIdGet) | **GET** /payroll_schema/lohnartenplan/{resourceId} | get: payroll_schema/lohnartenplan/id
*PayrollschemaApi* | [**payrollSchemaLohnartenplanResourceIdPut**](docs/PayrollschemaApi.md#payrollSchemaLohnartenplanResourceIdPut) | **PUT** /payroll_schema/lohnartenplan/{resourceId} | put: payroll_schema/lohnartenplan
*PayrollschemaApi* | [**payrollSchemaLohnartmergedGet**](docs/PayrollschemaApi.md#payrollSchemaLohnartmergedGet) | **GET** /payroll_schema/lohnartmerged | get: payroll_schema/lohnartmerged
*PayrollschemaApi* | [**payrollSchemaLohnartmergedResourceIdGet**](docs/PayrollschemaApi.md#payrollSchemaLohnartmergedResourceIdGet) | **GET** /payroll_schema/lohnartmerged/{resourceId} | get: payroll_schema/lohnartmerged/id
*PayrollschemaApi* | [**payrollSchemaLohnartmergedResourceIdPut**](docs/PayrollschemaApi.md#payrollSchemaLohnartmergedResourceIdPut) | **PUT** /payroll_schema/lohnartmerged/{resourceId} | put: payroll_schema/lohnartmerged
*PayrollschemaApi* | [**payrollSchemaResourcePost**](docs/PayrollschemaApi.md#payrollSchemaResourcePost) | **POST** /payroll_schema/{resource} | post: payroll_schema/lohnart
*PayrollschemaApi* | [**payrollSchemaTemplateGet**](docs/PayrollschemaApi.md#payrollSchemaTemplateGet) | **GET** /payroll_schema/template | get: payroll_schema/template
*PayrollschemaApi* | [**payrollSchemaTemplateResourceIdGet**](docs/PayrollschemaApi.md#payrollSchemaTemplateResourceIdGet) | **GET** /payroll_schema/template/{resourceId} | get: payroll_schema/template/id
*PayrollschemaApi* | [**payrollSchemaTemplateResourceIdPut**](docs/PayrollschemaApi.md#payrollSchemaTemplateResourceIdPut) | **PUT** /payroll_schema/template/{resourceId} | put: payroll_schema/template
*SearchOrganizationApi* | [**searchorganizationGet**](docs/SearchOrganizationApi.md#searchorganizationGet) | **GET** /searchorganization | Get Organizations


## Documentation for Models

 - [ActivityApi](docs/ActivityApi.md)
 - [AddressdataApi](docs/AddressdataApi.md)
 - [AltervorsorgeApi](docs/AltervorsorgeApi.md)
 - [AuswertungskreisDataApi](docs/AuswertungskreisDataApi.md)
 - [Bankaccount](docs/Bankaccount.md)
 - [Bankingprovision](docs/Bankingprovision.md)
 - [BankverbindungApi](docs/BankverbindungApi.md)
 - [BetriebstaetteApi](docs/BetriebstaetteApi.md)
 - [BuchungskreisDataApi](docs/BuchungskreisDataApi.md)
 - [Client](docs/Client.md)
 - [Clientactivities](docs/Clientactivities.md)
 - [Clientactivitychangestate](docs/Clientactivitychangestate.md)
 - [CommunicationApi](docs/CommunicationApi.md)
 - [CompanyContactDataApi](docs/CompanyContactDataApi.md)
 - [Companydata](docs/Companydata.md)
 - [Companyget](docs/Companyget.md)
 - [Contact](docs/Contact.md)
 - [ContactDataApi](docs/ContactDataApi.md)
 - [ContactTagApi](docs/ContactTagApi.md)
 - [DauerauftraegeApi](docs/DauerauftraegeApi.md)
 - [DomainDataApi](docs/DomainDataApi.md)
 - [Einstellungen](docs/Einstellungen.md)
 - [Employee](docs/Employee.md)
 - [EmployeeActivityApi](docs/EmployeeActivityApi.md)
 - [Employeeactivities](docs/Employeeactivities.md)
 - [Employeeget](docs/Employeeget.md)
 - [Employeemilestoneget](docs/Employeemilestoneget.md)
 - [Employeeprocessget](docs/Employeeprocessget.md)
 - [EntlohnungApi](docs/EntlohnungApi.md)
 - [ExternalTenantId](docs/ExternalTenantId.md)
 - [Firm](docs/Firm.md)
 - [Firmendaten](docs/Firmendaten.md)
 - [FirmendatenGehaltsmodellApi](docs/FirmendatenGehaltsmodellApi.md)
 - [FirmendatenStatusApi](docs/FirmendatenStatusApi.md)
 - [GroupAccessApi](docs/GroupAccessApi.md)
 - [Gruppensumme](docs/Gruppensumme.md)
 - [KontoStammDataApi](docs/KontoStammDataApi.md)
 - [Kontostamm](docs/Kontostamm.md)
 - [Location](docs/Location.md)
 - [LocationApi](docs/LocationApi.md)
 - [LohnErfassungsSchluesselDefinitionApi](docs/LohnErfassungsSchluesselDefinitionApi.md)
 - [Lohnart](docs/Lohnart.md)
 - [LohnartDefinitionApi](docs/LohnartDefinitionApi.md)
 - [Lohnartenplan](docs/Lohnartenplan.md)
 - [LohnartenplanDefinitionApi](docs/LohnartenplanDefinitionApi.md)
 - [Lohnartmerged](docs/Lohnartmerged.md)
 - [Lohnerfassungsschluessel](docs/Lohnerfassungsschluessel.md)
 - [Meldungendata](docs/Meldungendata.md)
 - [Member](docs/Member.md)
 - [Mitarbeiter](docs/Mitarbeiter.md)
 - [MitarbeiterdatenApi](docs/MitarbeiterdatenApi.md)
 - [Organization](docs/Organization.md)
 - [OrganizationDataApi](docs/OrganizationDataApi.md)
 - [OrganizationIDAccessApi](docs/OrganizationIDAccessApi.md)
 - [Organizationunitget](docs/Organizationunitget.md)
 - [Payment](docs/Payment.md)
 - [Personalfragebogen](docs/Personalfragebogen.md)
 - [PersonendatenApi](docs/PersonendatenApi.md)
 - [PfaendungenApi](docs/PfaendungenApi.md)
 - [Privatepersonget](docs/Privatepersonget.md)
 - [Roleget](docs/Roleget.md)
 - [Schemaentry](docs/Schemaentry.md)
 - [Sofortmeldung](docs/Sofortmeldung.md)
 - [SozialversicherungApi](docs/SozialversicherungApi.md)
 - [SteuerdatenApi](docs/SteuerdatenApi.md)
 - [Tagdefinition](docs/Tagdefinition.md)
 - [Template](docs/Template.md)
 - [TemplateDefinitionApi](docs/TemplateDefinitionApi.md)
 - [TemplateErfassungssschluesselEntryApi](docs/TemplateErfassungssschluesselEntryApi.md)
 - [Tenant](docs/Tenant.md)
 - [UnterlagenApi](docs/UnterlagenApi.md)
 - [VermoegenswirksameLeistungenApi](docs/VermoegenswirksameLeistungenApi.md)
 - [VorerfassungsdatenApi](docs/VorerfassungsdatenApi.md)
 - [WeitereEinnahmenApi](docs/WeitereEinnahmenApi.md)
 - [WirtschaftsjahrDataApi](docs/WirtschaftsjahrDataApi.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

info@addison.de

