package models;

import enums.AppType;
import enums.TransactionType;

public class Transaction {

  private Long id;
  private String transactionDate;
  private Double amount;
  private String originAccount;
  private String destinationAccount;
  private TransactionType type;
  private AppType app;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public String getOriginAccount() {
    return originAccount;
  }

  public void setOriginAccount(String originAccount) {
    this.originAccount = originAccount;
  }

  public String getDestinationAccount() {
    return destinationAccount;
  }

  public void setDestinationAccount(String destinationAccount) {
    this.destinationAccount = destinationAccount;
  }

  public TransactionType getType() {
    return type;
  }

  public void setType(TransactionType type) {
    this.type = type;
  }

  public AppType getApp() {
    return app;
  }

  public void setApp(AppType app) {
    this.app = app;
  }

  @Override
  public String toString() {
    return "Transaction{" +
            "id=" + id +
            ", transactionDate='" + transactionDate + '\'' +
            ", amount=" + amount +
            ", originAccount='" + originAccount + '\'' +
            ", destinationAccount='" + destinationAccount + '\'' +
            ", type=" + type +
            ", app=" + app +
            '}';
  }
}
