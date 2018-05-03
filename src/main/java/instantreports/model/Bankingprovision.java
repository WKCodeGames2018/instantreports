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
 * Bankingprovision
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:01:56.539+02:00")
public class Bankingprovision   {
  @SerializedName("tenantId")
  private String tenantId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("provisionDays")
  private String provisionDays = null;

  @SerializedName("domainId")
  private String domainId = null;

  @SerializedName("bankcode")
  private String bankcode = null;

  public Bankingprovision tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return tenantId
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public Bankingprovision id(String id) {
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

  public Bankingprovision provisionDays(String provisionDays) {
    this.provisionDays = provisionDays;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return provisionDays
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public String getProvisionDays() {
    return provisionDays;
  }

  public void setProvisionDays(String provisionDays) {
    this.provisionDays = provisionDays;
  }

  public Bankingprovision domainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return domainId
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }

  public Bankingprovision bankcode(String bankcode) {
    this.bankcode = bankcode;
    return this;
  }

   /**
   *  (filterable/sortable)
   * @return bankcode
  **/
  @ApiModelProperty(example = "null", required = true, value = " (filterable/sortable)")
  public String getBankcode() {
    return bankcode;
  }

  public void setBankcode(String bankcode) {
    this.bankcode = bankcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bankingprovision bankingprovision = (Bankingprovision) o;
    return Objects.equals(this.tenantId, bankingprovision.tenantId) &&
        Objects.equals(this.id, bankingprovision.id) &&
        Objects.equals(this.provisionDays, bankingprovision.provisionDays) &&
        Objects.equals(this.domainId, bankingprovision.domainId) &&
        Objects.equals(this.bankcode, bankingprovision.bankcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, id, provisionDays, domainId, bankcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bankingprovision {\n");
    
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    provisionDays: ").append(toIndentedString(provisionDays)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    bankcode: ").append(toIndentedString(bankcode)).append("\n");
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

