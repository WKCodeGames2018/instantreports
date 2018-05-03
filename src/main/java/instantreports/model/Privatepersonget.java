/**
 * CPM API
 * Public API for CPM
 *
 * OpenAPI spec version: V1.0
 * Contact: info@addison.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package instantreports.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Privatepersonget
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:01:56.539+02:00")
public class Privatepersonget   {
  @SerializedName("PhonesFaxes")
  private String phonesFaxes = null;

  @SerializedName("FreeFields")
  private String freeFields = null;

  @SerializedName("Active")
  private Boolean active = null;

  @SerializedName("SocialSecurityNumber")
  private String socialSecurityNumber = null;

  @SerializedName("FirstName")
  private String firstName = null;

  @SerializedName("Emails")
  private String emails = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("ContactState")
  private String contactState = null;

  @SerializedName("Surname")
  private String surname = null;

  @SerializedName("PrivatePersonNumber")
  private String privatePersonNumber = null;

  @SerializedName("OrganizationUnitId")
  private String organizationUnitId = null;

  public Privatepersonget phonesFaxes(String phonesFaxes) {
    this.phonesFaxes = phonesFaxes;
    return this;
  }

   /**
   * 
   * @return phonesFaxes
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhonesFaxes() {
    return phonesFaxes;
  }

  public void setPhonesFaxes(String phonesFaxes) {
    this.phonesFaxes = phonesFaxes;
  }

  public Privatepersonget freeFields(String freeFields) {
    this.freeFields = freeFields;
    return this;
  }

   /**
   * 
   * @return freeFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFreeFields() {
    return freeFields;
  }

  public void setFreeFields(String freeFields) {
    this.freeFields = freeFields;
  }

  public Privatepersonget active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * 
   * @return active
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Privatepersonget socialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

   /**
   * 
   * @return socialSecurityNumber
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public Privatepersonget firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * 
   * @return firstName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Privatepersonget emails(String emails) {
    this.emails = emails;
    return this;
  }

   /**
   * 
   * @return emails
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmails() {
    return emails;
  }

  public void setEmails(String emails) {
    this.emails = emails;
  }

  public Privatepersonget id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(example = "f4206901-c9b2-4e6e-8119-f7d623626060", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Privatepersonget contactState(String contactState) {
    this.contactState = contactState;
    return this;
  }

   /**
   * 
   * @return contactState
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getContactState() {
    return contactState;
  }

  public void setContactState(String contactState) {
    this.contactState = contactState;
  }

  public Privatepersonget surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * 
   * @return surname
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Privatepersonget privatePersonNumber(String privatePersonNumber) {
    this.privatePersonNumber = privatePersonNumber;
    return this;
  }

   /**
   * 
   * @return privatePersonNumber
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getPrivatePersonNumber() {
    return privatePersonNumber;
  }

  public void setPrivatePersonNumber(String privatePersonNumber) {
    this.privatePersonNumber = privatePersonNumber;
  }

  public Privatepersonget organizationUnitId(String organizationUnitId) {
    this.organizationUnitId = organizationUnitId;
    return this;
  }

   /**
   * 
   * @return organizationUnitId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getOrganizationUnitId() {
    return organizationUnitId;
  }

  public void setOrganizationUnitId(String organizationUnitId) {
    this.organizationUnitId = organizationUnitId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Privatepersonget privatepersonget = (Privatepersonget) o;
    return Objects.equals(this.phonesFaxes, privatepersonget.phonesFaxes) &&
        Objects.equals(this.freeFields, privatepersonget.freeFields) &&
        Objects.equals(this.active, privatepersonget.active) &&
        Objects.equals(this.socialSecurityNumber, privatepersonget.socialSecurityNumber) &&
        Objects.equals(this.firstName, privatepersonget.firstName) &&
        Objects.equals(this.emails, privatepersonget.emails) &&
        Objects.equals(this.id, privatepersonget.id) &&
        Objects.equals(this.contactState, privatepersonget.contactState) &&
        Objects.equals(this.surname, privatepersonget.surname) &&
        Objects.equals(this.privatePersonNumber, privatepersonget.privatePersonNumber) &&
        Objects.equals(this.organizationUnitId, privatepersonget.organizationUnitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phonesFaxes, freeFields, active, socialSecurityNumber, firstName, emails, id, contactState, surname, privatePersonNumber, organizationUnitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Privatepersonget {\n");
    
    sb.append("    phonesFaxes: ").append(toIndentedString(phonesFaxes)).append("\n");
    sb.append("    freeFields: ").append(toIndentedString(freeFields)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contactState: ").append(toIndentedString(contactState)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    privatePersonNumber: ").append(toIndentedString(privatePersonNumber)).append("\n");
    sb.append("    organizationUnitId: ").append(toIndentedString(organizationUnitId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

