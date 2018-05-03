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
 * SozialversicherungApi
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T09:01:56.539+02:00")
public class SozialversicherungApi   {
  @SerializedName("basisabsicherungKv")
  private String basisabsicherungKv = null;

  @SerializedName("krankenkasse")
  private String krankenkasse = null;

  @SerializedName("arbeitslosenversicherung")
  private Integer arbeitslosenversicherung = null;

  @SerializedName("nummerKrankenkasse")
  private String nummerKrankenkasse = null;

  @SerializedName("krankenversicherung")
  private Integer krankenversicherung = null;

  @SerializedName("pflegeversicherung")
  private Integer pflegeversicherung = null;

  @SerializedName("rvAufstockung")
  private Boolean rvAufstockung = null;

  @SerializedName("ausschlussUmlagepflicht1")
  private Integer ausschlussUmlagepflicht1 = null;

  @SerializedName("nummerVersorgungswerk")
  private String nummerVersorgungswerk = null;

  @SerializedName("ausschlussUmlagepflicht2")
  private Integer ausschlussUmlagepflicht2 = null;

  @SerializedName("versorgungswerk")
  private String versorgungswerk = null;

  @SerializedName("ausschlussInsolvenzgeldumlage")
  private Integer ausschlussInsolvenzgeldumlage = null;

  @SerializedName("betriebsnummerVersorgungswerk")
  private String betriebsnummerVersorgungswerk = null;

  @SerializedName("rentenversicherung")
  private Integer rentenversicherung = null;

  @SerializedName("betriebsnummerKrankenkasse")
  private String betriebsnummerKrankenkasse = null;

  @SerializedName("gesamtbetragPv")
  private String gesamtbetragPv = null;

  @SerializedName("statuskennzeichen")
  private Integer statuskennzeichen = null;

  @SerializedName("gesamtbetragKv")
  private String gesamtbetragKv = null;

  @SerializedName("basisabsicherungPv")
  private String basisabsicherungPv = null;

  @SerializedName("befreiungRentenversicherungspflicht")
  private Boolean befreiungRentenversicherungspflicht = null;

  @SerializedName("hoeherversicherungsbetragRv")
  private String hoeherversicherungsbetragRv = null;

  @SerializedName("elterneigenschaft")
  private Boolean elterneigenschaft = null;

  public SozialversicherungApi basisabsicherungKv(String basisabsicherungKv) {
    this.basisabsicherungKv = basisabsicherungKv;
    return this;
  }

   /**
   * 
   * @return basisabsicherungKv
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBasisabsicherungKv() {
    return basisabsicherungKv;
  }

  public void setBasisabsicherungKv(String basisabsicherungKv) {
    this.basisabsicherungKv = basisabsicherungKv;
  }

  public SozialversicherungApi krankenkasse(String krankenkasse) {
    this.krankenkasse = krankenkasse;
    return this;
  }

   /**
   * 
   * @return krankenkasse
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getKrankenkasse() {
    return krankenkasse;
  }

  public void setKrankenkasse(String krankenkasse) {
    this.krankenkasse = krankenkasse;
  }

  public SozialversicherungApi arbeitslosenversicherung(Integer arbeitslosenversicherung) {
    this.arbeitslosenversicherung = arbeitslosenversicherung;
    return this;
  }

   /**
   * 
   * @return arbeitslosenversicherung
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getArbeitslosenversicherung() {
    return arbeitslosenversicherung;
  }

  public void setArbeitslosenversicherung(Integer arbeitslosenversicherung) {
    this.arbeitslosenversicherung = arbeitslosenversicherung;
  }

  public SozialversicherungApi nummerKrankenkasse(String nummerKrankenkasse) {
    this.nummerKrankenkasse = nummerKrankenkasse;
    return this;
  }

   /**
   * 
   * @return nummerKrankenkasse
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNummerKrankenkasse() {
    return nummerKrankenkasse;
  }

  public void setNummerKrankenkasse(String nummerKrankenkasse) {
    this.nummerKrankenkasse = nummerKrankenkasse;
  }

  public SozialversicherungApi krankenversicherung(Integer krankenversicherung) {
    this.krankenversicherung = krankenversicherung;
    return this;
  }

   /**
   * 
   * @return krankenversicherung
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getKrankenversicherung() {
    return krankenversicherung;
  }

  public void setKrankenversicherung(Integer krankenversicherung) {
    this.krankenversicherung = krankenversicherung;
  }

  public SozialversicherungApi pflegeversicherung(Integer pflegeversicherung) {
    this.pflegeversicherung = pflegeversicherung;
    return this;
  }

   /**
   * 
   * @return pflegeversicherung
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPflegeversicherung() {
    return pflegeversicherung;
  }

  public void setPflegeversicherung(Integer pflegeversicherung) {
    this.pflegeversicherung = pflegeversicherung;
  }

  public SozialversicherungApi rvAufstockung(Boolean rvAufstockung) {
    this.rvAufstockung = rvAufstockung;
    return this;
  }

   /**
   * 
   * @return rvAufstockung
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRvAufstockung() {
    return rvAufstockung;
  }

  public void setRvAufstockung(Boolean rvAufstockung) {
    this.rvAufstockung = rvAufstockung;
  }

  public SozialversicherungApi ausschlussUmlagepflicht1(Integer ausschlussUmlagepflicht1) {
    this.ausschlussUmlagepflicht1 = ausschlussUmlagepflicht1;
    return this;
  }

   /**
   * 
   * @return ausschlussUmlagepflicht1
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAusschlussUmlagepflicht1() {
    return ausschlussUmlagepflicht1;
  }

  public void setAusschlussUmlagepflicht1(Integer ausschlussUmlagepflicht1) {
    this.ausschlussUmlagepflicht1 = ausschlussUmlagepflicht1;
  }

  public SozialversicherungApi nummerVersorgungswerk(String nummerVersorgungswerk) {
    this.nummerVersorgungswerk = nummerVersorgungswerk;
    return this;
  }

   /**
   * 
   * @return nummerVersorgungswerk
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNummerVersorgungswerk() {
    return nummerVersorgungswerk;
  }

  public void setNummerVersorgungswerk(String nummerVersorgungswerk) {
    this.nummerVersorgungswerk = nummerVersorgungswerk;
  }

  public SozialversicherungApi ausschlussUmlagepflicht2(Integer ausschlussUmlagepflicht2) {
    this.ausschlussUmlagepflicht2 = ausschlussUmlagepflicht2;
    return this;
  }

   /**
   * 
   * @return ausschlussUmlagepflicht2
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAusschlussUmlagepflicht2() {
    return ausschlussUmlagepflicht2;
  }

  public void setAusschlussUmlagepflicht2(Integer ausschlussUmlagepflicht2) {
    this.ausschlussUmlagepflicht2 = ausschlussUmlagepflicht2;
  }

  public SozialversicherungApi versorgungswerk(String versorgungswerk) {
    this.versorgungswerk = versorgungswerk;
    return this;
  }

   /**
   * 
   * @return versorgungswerk
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVersorgungswerk() {
    return versorgungswerk;
  }

  public void setVersorgungswerk(String versorgungswerk) {
    this.versorgungswerk = versorgungswerk;
  }

  public SozialversicherungApi ausschlussInsolvenzgeldumlage(Integer ausschlussInsolvenzgeldumlage) {
    this.ausschlussInsolvenzgeldumlage = ausschlussInsolvenzgeldumlage;
    return this;
  }

   /**
   * 
   * @return ausschlussInsolvenzgeldumlage
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAusschlussInsolvenzgeldumlage() {
    return ausschlussInsolvenzgeldumlage;
  }

  public void setAusschlussInsolvenzgeldumlage(Integer ausschlussInsolvenzgeldumlage) {
    this.ausschlussInsolvenzgeldumlage = ausschlussInsolvenzgeldumlage;
  }

  public SozialversicherungApi betriebsnummerVersorgungswerk(String betriebsnummerVersorgungswerk) {
    this.betriebsnummerVersorgungswerk = betriebsnummerVersorgungswerk;
    return this;
  }

   /**
   * 
   * @return betriebsnummerVersorgungswerk
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBetriebsnummerVersorgungswerk() {
    return betriebsnummerVersorgungswerk;
  }

  public void setBetriebsnummerVersorgungswerk(String betriebsnummerVersorgungswerk) {
    this.betriebsnummerVersorgungswerk = betriebsnummerVersorgungswerk;
  }

  public SozialversicherungApi rentenversicherung(Integer rentenversicherung) {
    this.rentenversicherung = rentenversicherung;
    return this;
  }

   /**
   * 
   * @return rentenversicherung
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRentenversicherung() {
    return rentenversicherung;
  }

  public void setRentenversicherung(Integer rentenversicherung) {
    this.rentenversicherung = rentenversicherung;
  }

  public SozialversicherungApi betriebsnummerKrankenkasse(String betriebsnummerKrankenkasse) {
    this.betriebsnummerKrankenkasse = betriebsnummerKrankenkasse;
    return this;
  }

   /**
   * 
   * @return betriebsnummerKrankenkasse
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBetriebsnummerKrankenkasse() {
    return betriebsnummerKrankenkasse;
  }

  public void setBetriebsnummerKrankenkasse(String betriebsnummerKrankenkasse) {
    this.betriebsnummerKrankenkasse = betriebsnummerKrankenkasse;
  }

  public SozialversicherungApi gesamtbetragPv(String gesamtbetragPv) {
    this.gesamtbetragPv = gesamtbetragPv;
    return this;
  }

   /**
   * 
   * @return gesamtbetragPv
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGesamtbetragPv() {
    return gesamtbetragPv;
  }

  public void setGesamtbetragPv(String gesamtbetragPv) {
    this.gesamtbetragPv = gesamtbetragPv;
  }

  public SozialversicherungApi statuskennzeichen(Integer statuskennzeichen) {
    this.statuskennzeichen = statuskennzeichen;
    return this;
  }

   /**
   * 
   * @return statuskennzeichen
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStatuskennzeichen() {
    return statuskennzeichen;
  }

  public void setStatuskennzeichen(Integer statuskennzeichen) {
    this.statuskennzeichen = statuskennzeichen;
  }

  public SozialversicherungApi gesamtbetragKv(String gesamtbetragKv) {
    this.gesamtbetragKv = gesamtbetragKv;
    return this;
  }

   /**
   * 
   * @return gesamtbetragKv
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGesamtbetragKv() {
    return gesamtbetragKv;
  }

  public void setGesamtbetragKv(String gesamtbetragKv) {
    this.gesamtbetragKv = gesamtbetragKv;
  }

  public SozialversicherungApi basisabsicherungPv(String basisabsicherungPv) {
    this.basisabsicherungPv = basisabsicherungPv;
    return this;
  }

   /**
   * 
   * @return basisabsicherungPv
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBasisabsicherungPv() {
    return basisabsicherungPv;
  }

  public void setBasisabsicherungPv(String basisabsicherungPv) {
    this.basisabsicherungPv = basisabsicherungPv;
  }

  public SozialversicherungApi befreiungRentenversicherungspflicht(Boolean befreiungRentenversicherungspflicht) {
    this.befreiungRentenversicherungspflicht = befreiungRentenversicherungspflicht;
    return this;
  }

   /**
   * 
   * @return befreiungRentenversicherungspflicht
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getBefreiungRentenversicherungspflicht() {
    return befreiungRentenversicherungspflicht;
  }

  public void setBefreiungRentenversicherungspflicht(Boolean befreiungRentenversicherungspflicht) {
    this.befreiungRentenversicherungspflicht = befreiungRentenversicherungspflicht;
  }

  public SozialversicherungApi hoeherversicherungsbetragRv(String hoeherversicherungsbetragRv) {
    this.hoeherversicherungsbetragRv = hoeherversicherungsbetragRv;
    return this;
  }

   /**
   * 
   * @return hoeherversicherungsbetragRv
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHoeherversicherungsbetragRv() {
    return hoeherversicherungsbetragRv;
  }

  public void setHoeherversicherungsbetragRv(String hoeherversicherungsbetragRv) {
    this.hoeherversicherungsbetragRv = hoeherversicherungsbetragRv;
  }

  public SozialversicherungApi elterneigenschaft(Boolean elterneigenschaft) {
    this.elterneigenschaft = elterneigenschaft;
    return this;
  }

   /**
   * 
   * @return elterneigenschaft
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getElterneigenschaft() {
    return elterneigenschaft;
  }

  public void setElterneigenschaft(Boolean elterneigenschaft) {
    this.elterneigenschaft = elterneigenschaft;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SozialversicherungApi sozialversicherungApi = (SozialversicherungApi) o;
    return Objects.equals(this.basisabsicherungKv, sozialversicherungApi.basisabsicherungKv) &&
        Objects.equals(this.krankenkasse, sozialversicherungApi.krankenkasse) &&
        Objects.equals(this.arbeitslosenversicherung, sozialversicherungApi.arbeitslosenversicherung) &&
        Objects.equals(this.nummerKrankenkasse, sozialversicherungApi.nummerKrankenkasse) &&
        Objects.equals(this.krankenversicherung, sozialversicherungApi.krankenversicherung) &&
        Objects.equals(this.pflegeversicherung, sozialversicherungApi.pflegeversicherung) &&
        Objects.equals(this.rvAufstockung, sozialversicherungApi.rvAufstockung) &&
        Objects.equals(this.ausschlussUmlagepflicht1, sozialversicherungApi.ausschlussUmlagepflicht1) &&
        Objects.equals(this.nummerVersorgungswerk, sozialversicherungApi.nummerVersorgungswerk) &&
        Objects.equals(this.ausschlussUmlagepflicht2, sozialversicherungApi.ausschlussUmlagepflicht2) &&
        Objects.equals(this.versorgungswerk, sozialversicherungApi.versorgungswerk) &&
        Objects.equals(this.ausschlussInsolvenzgeldumlage, sozialversicherungApi.ausschlussInsolvenzgeldumlage) &&
        Objects.equals(this.betriebsnummerVersorgungswerk, sozialversicherungApi.betriebsnummerVersorgungswerk) &&
        Objects.equals(this.rentenversicherung, sozialversicherungApi.rentenversicherung) &&
        Objects.equals(this.betriebsnummerKrankenkasse, sozialversicherungApi.betriebsnummerKrankenkasse) &&
        Objects.equals(this.gesamtbetragPv, sozialversicherungApi.gesamtbetragPv) &&
        Objects.equals(this.statuskennzeichen, sozialversicherungApi.statuskennzeichen) &&
        Objects.equals(this.gesamtbetragKv, sozialversicherungApi.gesamtbetragKv) &&
        Objects.equals(this.basisabsicherungPv, sozialversicherungApi.basisabsicherungPv) &&
        Objects.equals(this.befreiungRentenversicherungspflicht, sozialversicherungApi.befreiungRentenversicherungspflicht) &&
        Objects.equals(this.hoeherversicherungsbetragRv, sozialversicherungApi.hoeherversicherungsbetragRv) &&
        Objects.equals(this.elterneigenschaft, sozialversicherungApi.elterneigenschaft);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basisabsicherungKv, krankenkasse, arbeitslosenversicherung, nummerKrankenkasse, krankenversicherung, pflegeversicherung, rvAufstockung, ausschlussUmlagepflicht1, nummerVersorgungswerk, ausschlussUmlagepflicht2, versorgungswerk, ausschlussInsolvenzgeldumlage, betriebsnummerVersorgungswerk, rentenversicherung, betriebsnummerKrankenkasse, gesamtbetragPv, statuskennzeichen, gesamtbetragKv, basisabsicherungPv, befreiungRentenversicherungspflicht, hoeherversicherungsbetragRv, elterneigenschaft);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SozialversicherungApi {\n");
    
    sb.append("    basisabsicherungKv: ").append(toIndentedString(basisabsicherungKv)).append("\n");
    sb.append("    krankenkasse: ").append(toIndentedString(krankenkasse)).append("\n");
    sb.append("    arbeitslosenversicherung: ").append(toIndentedString(arbeitslosenversicherung)).append("\n");
    sb.append("    nummerKrankenkasse: ").append(toIndentedString(nummerKrankenkasse)).append("\n");
    sb.append("    krankenversicherung: ").append(toIndentedString(krankenversicherung)).append("\n");
    sb.append("    pflegeversicherung: ").append(toIndentedString(pflegeversicherung)).append("\n");
    sb.append("    rvAufstockung: ").append(toIndentedString(rvAufstockung)).append("\n");
    sb.append("    ausschlussUmlagepflicht1: ").append(toIndentedString(ausschlussUmlagepflicht1)).append("\n");
    sb.append("    nummerVersorgungswerk: ").append(toIndentedString(nummerVersorgungswerk)).append("\n");
    sb.append("    ausschlussUmlagepflicht2: ").append(toIndentedString(ausschlussUmlagepflicht2)).append("\n");
    sb.append("    versorgungswerk: ").append(toIndentedString(versorgungswerk)).append("\n");
    sb.append("    ausschlussInsolvenzgeldumlage: ").append(toIndentedString(ausschlussInsolvenzgeldumlage)).append("\n");
    sb.append("    betriebsnummerVersorgungswerk: ").append(toIndentedString(betriebsnummerVersorgungswerk)).append("\n");
    sb.append("    rentenversicherung: ").append(toIndentedString(rentenversicherung)).append("\n");
    sb.append("    betriebsnummerKrankenkasse: ").append(toIndentedString(betriebsnummerKrankenkasse)).append("\n");
    sb.append("    gesamtbetragPv: ").append(toIndentedString(gesamtbetragPv)).append("\n");
    sb.append("    statuskennzeichen: ").append(toIndentedString(statuskennzeichen)).append("\n");
    sb.append("    gesamtbetragKv: ").append(toIndentedString(gesamtbetragKv)).append("\n");
    sb.append("    basisabsicherungPv: ").append(toIndentedString(basisabsicherungPv)).append("\n");
    sb.append("    befreiungRentenversicherungspflicht: ").append(toIndentedString(befreiungRentenversicherungspflicht)).append("\n");
    sb.append("    hoeherversicherungsbetragRv: ").append(toIndentedString(hoeherversicherungsbetragRv)).append("\n");
    sb.append("    elterneigenschaft: ").append(toIndentedString(elterneigenschaft)).append("\n");
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

