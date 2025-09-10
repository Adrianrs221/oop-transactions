package repository;

import enums.AppType;
import enums.TransactionType;
import models.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {

  public List<Transaction> getAll() {
    Transaction t01 = new Transaction();
    t01.setId(1L);
    t01.setTransactionDate("20250901221517");
    t01.setAmount(100.00);
    t01.setOriginAccount("account-01");
    t01.setDestinationAccount("account-02");
    t01.setType(TransactionType.TRANSFER);
    t01.setApp(AppType.YAPE);

    Transaction t02 = new Transaction();
    t02.setId(2L);
    t02.setTransactionDate("20250901211517");
    t02.setAmount(200.00);
    t02.setOriginAccount("account-02");
    t02.setDestinationAccount("account-03");
    t02.setType(TransactionType.PAYMENT_SERVICES);
    t02.setApp(AppType.YAPE);

    Transaction t03 = new Transaction();
    t03.setId(3L);
    t03.setTransactionDate("20250902211517");
    t03.setAmount(10.00);
    t03.setOriginAccount("account-01");
    t03.setDestinationAccount("account-03");
    t03.setType(TransactionType.DEPOSITS);
    t03.setApp(AppType.YAPE);

    List<Transaction> transactions = new ArrayList<>();
    transactions.add(t01);
    transactions.add(t02);
    transactions.add(t03);

    return transactions;
  }

}
