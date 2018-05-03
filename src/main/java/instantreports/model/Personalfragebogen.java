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
import instantreports.model.AltervorsorgeApi;
import instantreports.model.DauerauftraegeApi;
import instantreports.model.EntlohnungApi;
import instantreports.model.PersonendatenApi;
import instantreports.model.PfaendungenApi;
import instantreports.model.SozialversicherungApi;
import instantreports.model.SteuerdatenApi;
import instantreports.model.UnterlagenApi;
import instantreports.model.VermoegenswirksameLeistungenApi;
import instantreports.model.VorerfassungsdatenApi;
import instantreports.model.WeitereEinnahmenApi;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Personalfragebogen
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:01:56.539+02:00")
public class Personalfragebogen   {
  @SerializedName("bearbeitungsstatus")
  private String bearbeitungsstatus = null;

  @SerializedName("weitereEinnahmenApi")
  private WeitereEinnahmenApi weitereEinnahmenApi = null;

  @SerializedName("vorerfassungsdatenApi")
  private VorerfassungsdatenApi vorerfassungsdatenApi = null;

  @SerializedName("monatsabschlussId")
  private String monatsabschlussId = null;

  @SerializedName("personendatenApi")
  private PersonendatenApi personendatenApi = null;

  @SerializedName("unterlagenApi")
  private UnterlagenApi unterlagenApi = null;

  @SerializedName("steuerdatenApi")
  private SteuerdatenApi steuerdatenApi = null;

  @SerializedName("vermoegenswirksameLeistungenApi")
  private VermoegenswirksameLeistungenApi vermoegenswirksameLeistungenApi = null;

  @SerializedName("altervorsorgeApi")
  private AltervorsorgeApi altervorsorgeApi = null;

  @SerializedName("personalNummer")
  private Long personalNummer = null;

  @SerializedName("networkMemberId")
  private String networkMemberId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("entlohnungApi")
  private EntlohnungApi entlohnungApi = null;

  @SerializedName("dauerauftraegeApi")
  private DauerauftraegeApi dauerauftraegeApi = null;

  @SerializedName("pfaendungenApi")
  private PfaendungenApi pfaendungenApi = null;

  @SerializedName("sozialversicherungApi")
  private SozialversicherungApi sozialversicherungApi = null;

  public Personalfragebogen bearbeitungsstatus(String bearbeitungsstatus) {
    this.bearbeitungsstatus = bearbeitungsstatus;
    return this;
  }

   /**
   *  (filterable)
   * @return bearbeitungsstatus
  **/
  @ApiModelProperty(example = "null", value = " (filterable)")
  public String getBearbeitungsstatus() {
    return bearbeitungsstatus;
  }

  public void setBearbeitungsstatus(String bearbeitungsstatus) {
    this.bearbeitungsstatus = bearbeitungsstatus;
  }

  public Personalfragebogen weitereEinnahmenApi(WeitereEinnahmenApi weitereEinnahmenApi) {
    this.weitereEinnahmenApi = weitereEinnahmenApi;
    return this;
  }

   /**
   * Get weitereEinnahmenApi
   * @return weitereEinnahmenApi
  **/
  @ApiModelProperty(example = "null", value = "")
  public WeitereEinnahmenApi getWeitereEinnahmenApi() {
    return weitereEinnahmenApi;
  }

  public void setWeitereEinnahmenApi(WeitereEinnahmenApi weitereEinnahmenApi) {
    this.weitereEinnahmenApi = weitereEinnahmenApi;
  }

  public Personalfragebogen vorerfassungsdatenApi(VorerfassungsdatenApi vorerfassungsdatenApi) {
    this.vorerfassungsdatenApi = vorerfassungsdatenApi;
    return this;
  }

   /**
   * Get vorerfassungsdatenApi
   * @return vorerfassungsdatenApi
  **/
  @ApiModelProperty(example = "null", value = "")
  public VorerfassungsdatenApi getVorerfassungsdatenApi() {
    return vorerfassungsdatenApi;
  }

  public void setVorerfassungsdatenApi(VorerfassungsdatenApi vorerfassungsdatenApi) {
    this.vorerfassungsdatenApi = vorerfassungsdatenApi;
  }

  public Personalfragebogen monatsabschlussId(String monatsabschlussId) {
    this.monatsabschlussId = monatsabschlussId;
    return this;
  }

   /**
   *  (filterable)
   * @return monatsabschlussId
  **/
  @ApiModelProperty(example = "null", value = " (filterable)")
  public String getMonatsabschlussId() {
    return monatsabschlussId;
  }

  public void setMonatsabschlussId(String monatsabschlussId) {
    this.monatsabschlussId = monatsabschlussId;
  }

  public Personalfragebogen personendatenApi(PersonendatenApi personendatenApi) {
    this.personendatenApi = personendatenApi;
    return this;
  }

   /**
   * Get personendatenApi
   * @return personendatenApi
  **/
  @ApiModelProperty(example = "null", value = "")
  public PersonendatenApi getPersonendatenApi() {
    return personendatenApi;
  }

  public void setPersonendatenApi(PersonendatenApi personendatenApi) {
    this.personendatenApi = personendatenApi;
  }

  public Personalfragebogen unterlagenApi(UnterlagenApi unterlagenApi) {
    this.unterlagenApi = unterlagenApi;
    return this;
  }

   /**
   * Get unterlagenApi
   * @return unterlagenApi
  **/
  @ApiModelProperty(example = "null", value = "")
  public UnterlagenApi getUnterlagenApi() {
    return unterlagenApi;
  }

  public void setUnterlagenApi(UnterlagenApi unterlagenApi) {
    this.unterlagenApi = unterlagenApi;
  }

  public Personalfragebogen steuerdatenApi(SteuerdatenApi steuerdatenApi) {
    this.steuerdatenApi = steuerdatenApi;
    return this;
  }

   /**
   * Get steuerdatenApi
   * @return steuerdatenApi
  **/
  @ApiModelProperty(example = "null", value = "")
  public SteuerdatenApi getSteuerdatenApi() {
    return steuerdatenApi;
  }

  public void setSteuerdatenApi(SteuerdatenApi steuerdatenApi) {
    this.steuerdatenApi = steuerdatenApi;
  }

  public Personalfragebogen vermoegenswirksameLeistungenApi(VermoegenswirksameLeistungenApi vermoegenswirksameLeistungenApi) {
    this.vermoegenswirksameLeistungenApi = vermoegenswirksameLeistungenApi;
    return this;
  }

   /**
   * Get vermoegenswirksameLeistungenApi
   * @return vermoegenswirksameLeistungenApi
  **/
  @ApiModelProperty(example = "null", value = "")
  public VermoegenswirksameLeistungenApi getVermoegenswirksameLeistungenApi() {
    return vermoegenswirksameLeistungenApi;
  }

  public void setVermoegenswirksameLeistungenApi(VermoegenswirksameLeistungenApi vermoegenswirksameLeistungenApi) {
    this.vermoegenswirksameLeistungenApi = vermoegenswirksameLeistungenApi;
  }

  public Personalfragebogen altervorsorgeApi(AltervorsorgeApi altervorsorgeApi) {
    this.altervorsorgeApi = altervorsorgeApi;
    return this;
  }

   /**
   * Get altervorsorgeApi
   * @return altervorsorgeApi
  **/
  @ApiModelProperty(example = "null", value = "")
  public AltervorsorgeApi getAltervorsorgeApi() {
    return altervorsorgeApi;
  }

  public void setAltervorsorgeApi(AltervorsorgeApi altervorsorgeApi) {
    this.altervorsorgeApi = altervorsorgeApi;
  }

  public Personalfragebogen personalNummer(Long personalNummer) {
    this.personalNummer = personalNummer;
    return this;
  }

   /**
   *  (filterable)
   * @return personalNummer
  **/
  @ApiModelProperty(example = "null", value = " (filterable)")
  public Long getPersonalNummer() {
    return personalNummer;
  }

  public void setPersonalNummer(Long personalNummer) {
    this.personalNummer = personalNummer;
  }

  public Personalfragebogen networkMemberId(String networkMemberId) {
    this.networkMemberId = networkMemberId;
    return this;
  }

   /**
   *  (filterable)
   * @return networkMemberId
  **/
  @ApiModelProperty(example = "null", value = " (filterable)")
  public String getNetworkMemberId() {
    return networkMemberId;
  }

  public void setNetworkMemberId(String networkMemberId) {
    this.networkMemberId = networkMemberId;
  }

  public Personalfragebogen id(String id) {
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

  public Personalfragebogen entlohnungApi(EntlohnungApi entlohnungApi) {
    this.entlohnungApi = entlohnungApi;
    return this;
  }

   /**
   * Get entlohnungApi
   * @return entlohnungApi
  **/
  @ApiModelProperty(example = "null", value = "")
  public EntlohnungApi getEntlohnungApi() {
    return entlohnungApi;
  }

  public void setEntlohnungApi(EntlohnungApi entlohnungApi) {
    this.entlohnungApi = entlohnungApi;
  }

  public Personalfragebogen dauerauftraegeApi(DauerauftraegeApi dauerauftraegeApi) {
    this.dauerauftraegeApi = dauerauftraegeApi;
    return this;
  }

   /**
   * Get dauerauftraegeApi
   * @return dauerauftraegeApi
  **/
  @ApiModelProperty(example = "null", value = "")
  public DauerauftraegeApi getDauerauftraegeApi() {
    return dauerauftraegeApi;
  }

  public void setDauerauftraegeApi(DauerauftraegeApi dauerauftraegeApi) {
    this.dauerauftraegeApi = dauerauftraegeApi;
  }

  public Personalfragebogen pfaendungenApi(PfaendungenApi pfaendungenApi) {
    this.pfaendungenApi = pfaendungenApi;
    return this;
  }

   /**
   * Get pfaendungenApi
   * @return pfaendungenApi
  **/
  @ApiModelProperty(example = "null", value = "")
  public PfaendungenApi getPfaendungenApi() {
    return pfaendungenApi;
  }

  public void setPfaendungenApi(PfaendungenApi pfaendungenApi) {
    this.pfaendungenApi = pfaendungenApi;
  }

  public Personalfragebogen sozialversicherungApi(SozialversicherungApi sozialversicherungApi) {
    this.sozialversicherungApi = sozialversicherungApi;
    return this;
  }

   /**
   * Get sozialversicherungApi
   * @return sozialversicherungApi
  **/
  @ApiModelProperty(example = "null", value = "")
  public SozialversicherungApi getSozialversicherungApi() {
    return sozialversicherungApi;
  }

  public void setSozialversicherungApi(SozialversicherungApi sozialversicherungApi) {
    this.sozialversicherungApi = sozialversicherungApi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Personalfragebogen personalfragebogen = (Personalfragebogen) o;
    return Objects.equals(this.bearbeitungsstatus, personalfragebogen.bearbeitungsstatus) &&
        Objects.equals(this.weitereEinnahmenApi, personalfragebogen.weitereEinnahmenApi) &&
        Objects.equals(this.vorerfassungsdatenApi, personalfragebogen.vorerfassungsdatenApi) &&
        Objects.equals(this.monatsabschlussId, personalfragebogen.monatsabschlussId) &&
        Objects.equals(this.personendatenApi, personalfragebogen.personendatenApi) &&
        Objects.equals(this.unterlagenApi, personalfragebogen.unterlagenApi) &&
        Objects.equals(this.steuerdatenApi, personalfragebogen.steuerdatenApi) &&
        Objects.equals(this.vermoegenswirksameLeistungenApi, personalfragebogen.vermoegenswirksameLeistungenApi) &&
        Objects.equals(this.altervorsorgeApi, personalfragebogen.altervorsorgeApi) &&
        Objects.equals(this.personalNummer, personalfragebogen.personalNummer) &&
        Objects.equals(this.networkMemberId, personalfragebogen.networkMemberId) &&
        Objects.equals(this.id, personalfragebogen.id) &&
        Objects.equals(this.entlohnungApi, personalfragebogen.entlohnungApi) &&
        Objects.equals(this.dauerauftraegeApi, personalfragebogen.dauerauftraegeApi) &&
        Objects.equals(this.pfaendungenApi, personalfragebogen.pfaendungenApi) &&
        Objects.equals(this.sozialversicherungApi, personalfragebogen.sozialversicherungApi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bearbeitungsstatus, weitereEinnahmenApi, vorerfassungsdatenApi, monatsabschlussId, personendatenApi, unterlagenApi, steuerdatenApi, vermoegenswirksameLeistungenApi, altervorsorgeApi, personalNummer, networkMemberId, id, entlohnungApi, dauerauftraegeApi, pfaendungenApi, sozialversicherungApi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Personalfragebogen {\n");
    
    sb.append("    bearbeitungsstatus: ").append(toIndentedString(bearbeitungsstatus)).append("\n");
    sb.append("    weitereEinnahmenApi: ").append(toIndentedString(weitereEinnahmenApi)).append("\n");
    sb.append("    vorerfassungsdatenApi: ").append(toIndentedString(vorerfassungsdatenApi)).append("\n");
    sb.append("    monatsabschlussId: ").append(toIndentedString(monatsabschlussId)).append("\n");
    sb.append("    personendatenApi: ").append(toIndentedString(personendatenApi)).append("\n");
    sb.append("    unterlagenApi: ").append(toIndentedString(unterlagenApi)).append("\n");
    sb.append("    steuerdatenApi: ").append(toIndentedString(steuerdatenApi)).append("\n");
    sb.append("    vermoegenswirksameLeistungenApi: ").append(toIndentedString(vermoegenswirksameLeistungenApi)).append("\n");
    sb.append("    altervorsorgeApi: ").append(toIndentedString(altervorsorgeApi)).append("\n");
    sb.append("    personalNummer: ").append(toIndentedString(personalNummer)).append("\n");
    sb.append("    networkMemberId: ").append(toIndentedString(networkMemberId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entlohnungApi: ").append(toIndentedString(entlohnungApi)).append("\n");
    sb.append("    dauerauftraegeApi: ").append(toIndentedString(dauerauftraegeApi)).append("\n");
    sb.append("    pfaendungenApi: ").append(toIndentedString(pfaendungenApi)).append("\n");
    sb.append("    sozialversicherungApi: ").append(toIndentedString(sozialversicherungApi)).append("\n");
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

