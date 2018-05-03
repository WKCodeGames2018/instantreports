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
import instantreports.model.AddressdataApi;
import instantreports.model.CommunicationApi;
import instantreports.model.ContactDataApi;
import instantreports.model.ContactTagApi;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Contact
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:01:56.539+02:00")
public class Contact   {
  @SerializedName("contactData")
  private ContactDataApi contactData = null;

  @SerializedName("communicationElements")
  private List<CommunicationApi> communicationElements = new ArrayList<CommunicationApi>();

  @SerializedName("contactTagApis")
  private List<ContactTagApi> contactTagApis = new ArrayList<ContactTagApi>();

  @SerializedName("id")
  private String id = null;

  @SerializedName("addressData")
  private AddressdataApi addressData = null;

  public Contact contactData(ContactDataApi contactData) {
    this.contactData = contactData;
    return this;
  }

   /**
   * Get contactData
   * @return contactData
  **/
  @ApiModelProperty(example = "null", value = "")
  public ContactDataApi getContactData() {
    return contactData;
  }

  public void setContactData(ContactDataApi contactData) {
    this.contactData = contactData;
  }

  public Contact communicationElements(List<CommunicationApi> communicationElements) {
    this.communicationElements = communicationElements;
    return this;
  }

  public Contact addCommunicationElementsItem(CommunicationApi communicationElementsItem) {
    this.communicationElements.add(communicationElementsItem);
    return this;
  }

   /**
   * Get communicationElements
   * @return communicationElements
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CommunicationApi> getCommunicationElements() {
    return communicationElements;
  }

  public void setCommunicationElements(List<CommunicationApi> communicationElements) {
    this.communicationElements = communicationElements;
  }

  public Contact contactTagApis(List<ContactTagApi> contactTagApis) {
    this.contactTagApis = contactTagApis;
    return this;
  }

  public Contact addContactTagApisItem(ContactTagApi contactTagApisItem) {
    this.contactTagApis.add(contactTagApisItem);
    return this;
  }

   /**
   * Get contactTagApis
   * @return contactTagApis
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ContactTagApi> getContactTagApis() {
    return contactTagApis;
  }

  public void setContactTagApis(List<ContactTagApi> contactTagApis) {
    this.contactTagApis = contactTagApis;
  }

  public Contact id(String id) {
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

  public Contact addressData(AddressdataApi addressData) {
    this.addressData = addressData;
    return this;
  }

   /**
   * Get addressData
   * @return addressData
  **/
  @ApiModelProperty(example = "null", value = "")
  public AddressdataApi getAddressData() {
    return addressData;
  }

  public void setAddressData(AddressdataApi addressData) {
    this.addressData = addressData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.contactData, contact.contactData) &&
        Objects.equals(this.communicationElements, contact.communicationElements) &&
        Objects.equals(this.contactTagApis, contact.contactTagApis) &&
        Objects.equals(this.id, contact.id) &&
        Objects.equals(this.addressData, contact.addressData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactData, communicationElements, contactTagApis, id, addressData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    contactData: ").append(toIndentedString(contactData)).append("\n");
    sb.append("    communicationElements: ").append(toIndentedString(communicationElements)).append("\n");
    sb.append("    contactTagApis: ").append(toIndentedString(contactTagApis)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    addressData: ").append(toIndentedString(addressData)).append("\n");
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

