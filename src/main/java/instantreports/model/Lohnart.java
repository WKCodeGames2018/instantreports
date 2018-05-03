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
import instantreports.model.LohnartDefinitionApi;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Lohnart
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:01:56.539+02:00")
public class Lohnart   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("daten")
  private LohnartDefinitionApi daten = null;

  public Lohnart id(String id) {
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

  public Lohnart daten(LohnartDefinitionApi daten) {
    this.daten = daten;
    return this;
  }

   /**
   * Get daten
   * @return daten
  **/
  @ApiModelProperty(example = "null", value = "")
  public LohnartDefinitionApi getDaten() {
    return daten;
  }

  public void setDaten(LohnartDefinitionApi daten) {
    this.daten = daten;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lohnart lohnart = (Lohnart) o;
    return Objects.equals(this.id, lohnart.id) &&
        Objects.equals(this.daten, lohnart.daten);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, daten);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lohnart {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    daten: ").append(toIndentedString(daten)).append("\n");
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

