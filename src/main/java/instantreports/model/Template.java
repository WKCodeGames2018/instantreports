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
import instantreports.model.TemplateDefinitionApi;
import instantreports.model.TemplateErfassungssschluesselEntryApi;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Template
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:01:56.539+02:00")
public class Template   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("daten")
  private TemplateDefinitionApi daten = null;

  @SerializedName("erfassungssschluesselEntries")
  private List<TemplateErfassungssschluesselEntryApi> erfassungssschluesselEntries = new ArrayList<TemplateErfassungssschluesselEntryApi>();

  public Template id(String id) {
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

  public Template daten(TemplateDefinitionApi daten) {
    this.daten = daten;
    return this;
  }

   /**
   * Get daten
   * @return daten
  **/
  @ApiModelProperty(example = "null", value = "")
  public TemplateDefinitionApi getDaten() {
    return daten;
  }

  public void setDaten(TemplateDefinitionApi daten) {
    this.daten = daten;
  }

  public Template erfassungssschluesselEntries(List<TemplateErfassungssschluesselEntryApi> erfassungssschluesselEntries) {
    this.erfassungssschluesselEntries = erfassungssschluesselEntries;
    return this;
  }

  public Template addErfassungssschluesselEntriesItem(TemplateErfassungssschluesselEntryApi erfassungssschluesselEntriesItem) {
    this.erfassungssschluesselEntries.add(erfassungssschluesselEntriesItem);
    return this;
  }

   /**
   * Get erfassungssschluesselEntries
   * @return erfassungssschluesselEntries
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<TemplateErfassungssschluesselEntryApi> getErfassungssschluesselEntries() {
    return erfassungssschluesselEntries;
  }

  public void setErfassungssschluesselEntries(List<TemplateErfassungssschluesselEntryApi> erfassungssschluesselEntries) {
    this.erfassungssschluesselEntries = erfassungssschluesselEntries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template template = (Template) o;
    return Objects.equals(this.id, template.id) &&
        Objects.equals(this.daten, template.daten) &&
        Objects.equals(this.erfassungssschluesselEntries, template.erfassungssschluesselEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, daten, erfassungssschluesselEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    daten: ").append(toIndentedString(daten)).append("\n");
    sb.append("    erfassungssschluesselEntries: ").append(toIndentedString(erfassungssschluesselEntries)).append("\n");
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

