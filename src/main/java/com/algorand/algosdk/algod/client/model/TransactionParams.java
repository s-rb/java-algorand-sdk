/*
 * Algod REST API.
 * API Endpoint for AlgoD Operations.
 *
 * OpenAPI spec version: 0.0.1
 * Contact: contact@algorand.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.algorand.algosdk.algod.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

/**
 * TransactionParams contains the parameters that help a client construct a new transaction.
 */
@ApiModel(description = "TransactionParams contains the parameters that help a client construct a new transaction.")
@Deprecated
public class TransactionParams {
  @SerializedName("consensusVersion")
  private String consensusVersion = null;

  @SerializedName("fee")
  private java.math.BigInteger fee = null;

  @SerializedName("genesisID")
  private String genesisID = null;

  @SerializedName("genesishashb64")
  private byte[] genesishashb64 = null;

  @SerializedName("lastRound")
  private java.math.BigInteger lastRound = null;

  public TransactionParams consensusVersion(String consensusVersion) {
    this.consensusVersion = consensusVersion;
    return this;
  }

   /**
   * ConsensusVersion indicates the consensus protocol version as of LastRound.
   * @return consensusVersion
  **/
  @ApiModelProperty(required = true, value = "ConsensusVersion indicates the consensus protocol version as of LastRound.")
  public String getConsensusVersion() {
    return consensusVersion;
  }

  public void setConsensusVersion(String consensusVersion) {
    this.consensusVersion = consensusVersion;
  }

  public TransactionParams fee(java.math.BigInteger fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Fee is the suggested transaction fee Fee is in units of micro-Algos per byte. Fee may fall to zero but transactions must still have a fee of at least MinTxnFee for the current network protocol.
   * @return fee
  **/
  @ApiModelProperty(required = true, value = "Fee is the suggested transaction fee Fee is in units of micro-Algos per byte. Fee may fall to zero but transactions must still have a fee of at least MinTxnFee for the current network protocol.")
  public java.math.BigInteger getFee() {
    return fee;
  }

  public void setFee(java.math.BigInteger fee) {
    this.fee = fee;
  }

  public TransactionParams genesisID(String genesisID) {
    this.genesisID = genesisID;
    return this;
  }

   /**
   * Genesis ID
   * @return genesisID
  **/
  @ApiModelProperty(required = true, value = "Genesis ID")
  public String getGenesisID() {
    return genesisID;
  }

  public void setGenesisID(String genesisID) {
    this.genesisID = genesisID;
  }

  public TransactionParams genesishashb64(byte[] genesishashb64) {
    this.genesishashb64 = genesishashb64;
    return this;
  }

   /**
   * Genesis hash
   * @return genesishashb64
  **/
  @ApiModelProperty(required = true, value = "Genesis hash")
  public byte[] getGenesishashb64() {
    return genesishashb64;
  }

  public void setGenesishashb64(byte[] genesishashb64) {
    this.genesishashb64 = genesishashb64;
  }

  public TransactionParams lastRound(java.math.BigInteger lastRound) {
    this.lastRound = lastRound;
    return this;
  }

   /**
   * LastRound indicates the last round seen
   * @return lastRound
  **/
  @ApiModelProperty(required = true, value = "LastRound indicates the last round seen")
  public java.math.BigInteger getLastRound() {
    return lastRound;
  }

  public void setLastRound(java.math.BigInteger lastRound) {
    this.lastRound = lastRound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    TransactionParams transactionParams = (TransactionParams) o;
    return ObjectUtils.equals(this.consensusVersion, transactionParams.consensusVersion) &&
    ObjectUtils.equals(this.fee, transactionParams.fee) &&
    ObjectUtils.equals(this.genesisID, transactionParams.genesisID) &&
    ObjectUtils.equals(this.genesishashb64, transactionParams.genesishashb64) &&
    ObjectUtils.equals(this.lastRound, transactionParams.lastRound);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(consensusVersion, fee, genesisID, genesishashb64, lastRound);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionParams {\n");
    
    sb.append("    consensusVersion: ").append(toIndentedString(consensusVersion)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    genesisID: ").append(toIndentedString(genesisID)).append("\n");
    sb.append("    genesishashb64: ").append(toIndentedString(genesishashb64)).append("\n");
    sb.append("    lastRound: ").append(toIndentedString(lastRound)).append("\n");
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

