/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AuditReportDTO
 */

public class AuditReportDTO {
  @SerializedName("report")
  private String report = null;

  @SerializedName("grade")
  private String grade = null;

  @SerializedName("numErrors")
  private Integer numErrors = null;

  public AuditReportDTO report(String report) {
    this.report = report;
    return this;
  }

   /**
   * The API Security Audit Report 
   * @return report
  **/
  @ApiModelProperty(value = "The API Security Audit Report ")
  public String getReport() {
    return report;
  }

  public void setReport(String report) {
    this.report = report;
  }

  public AuditReportDTO grade(String grade) {
    this.grade = grade;
    return this;
  }

   /**
   * The overall grade of the Security Audit 
   * @return grade
  **/
  @ApiModelProperty(example = "27.95", value = "The overall grade of the Security Audit ")
  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public AuditReportDTO numErrors(Integer numErrors) {
    this.numErrors = numErrors;
    return this;
  }

   /**
   * The number of errors in the API Definition 
   * @return numErrors
  **/
  @ApiModelProperty(example = "20", value = "The number of errors in the API Definition ")
  public Integer getNumErrors() {
    return numErrors;
  }

  public void setNumErrors(Integer numErrors) {
    this.numErrors = numErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditReportDTO auditReport = (AuditReportDTO) o;
    return Objects.equals(this.report, auditReport.report) &&
        Objects.equals(this.grade, auditReport.grade) &&
        Objects.equals(this.numErrors, auditReport.numErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(report, grade, numErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditReportDTO {\n");
    
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    numErrors: ").append(toIndentedString(numErrors)).append("\n");
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
