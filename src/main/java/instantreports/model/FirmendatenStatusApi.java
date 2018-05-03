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
import java.time.LocalDate;


/**
 * FirmendatenStatusApi
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:01:56.539+02:00")
public class FirmendatenStatusApi   {
  @SerializedName("Aktiv")
  private Boolean aktiv = null;

  @SerializedName("aktuellePeriode")
  private LocalDate aktuellePeriode = null;

  @SerializedName("sbsLohn")
  private Boolean sbsLohn = null;

  public FirmendatenStatusApi aktiv(Boolean aktiv) {
    this.aktiv = aktiv;
    return this;
  }

   /**
   * 
   * @return aktiv
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getAktiv() {
    return aktiv;
  }

  public void setAktiv(Boolean aktiv) {
    this.aktiv = aktiv;
  }

  public FirmendatenStatusApi aktuellePeriode(LocalDate aktuellePeriode) {
    this.aktuellePeriode = aktuellePeriode;
    return this;
  }

   /**
   * 
   * @return aktuellePeriode
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getAktuellePeriode() {
    return aktuellePeriode;
  }

  public void setAktuellePeriode(LocalDate aktuellePeriode) {
    this.aktuellePeriode = aktuellePeriode;
  }

  public FirmendatenStatusApi sbsLohn(Boolean sbsLohn) {
    this.sbsLohn = sbsLohn;
    return this;
  }

   /**
   * 
   * @return sbsLohn
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getSbsLohn() {
    return sbsLohn;
  }

  public void setSbsLohn(Boolean sbsLohn) {
    this.sbsLohn = sbsLohn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirmendatenStatusApi firmendatenStatusApi = (FirmendatenStatusApi) o;
    return Objects.equals(this.aktiv, firmendatenStatusApi.aktiv) &&
        Objects.equals(this.aktuellePeriode, firmendatenStatusApi.aktuellePeriode) &&
        Objects.equals(this.sbsLohn, firmendatenStatusApi.sbsLohn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aktiv, aktuellePeriode, sbsLohn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirmendatenStatusApi {\n");
    
    sb.append("    aktiv: ").append(toIndentedString(aktiv)).append("\n");
    sb.append("    aktuellePeriode: ").append(toIndentedString(aktuellePeriode)).append("\n");
    sb.append("    sbsLohn: ").append(toIndentedString(sbsLohn)).append("\n");
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

