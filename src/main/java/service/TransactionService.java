package service;

import enums.AppType;
import enums.TransactionType;
import models.Transaction;
import repository.TransactionRepository;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {

    private final TransactionRepository repository;

    public TransactionService() {
        this.repository = new TransactionRepository();
    }

    public List<Transaction> findTransactionsByOriginAccount(String originAccount) {
        List<Transaction> allTransactions = repository.getAll();

        List<Transaction> foundTransactions = new ArrayList<>();
        for (Transaction trx : allTransactions) {
            if (trx.getOriginAccount().equals(originAccount)) {
                foundTransactions.add(trx);
            }
        }

        return foundTransactions;
    }

    public List<Transaction> findTransactionsByApp(AppType app) {
        List<Transaction> allTransactions = repository.getAll();

        List<Transaction> foundTransactions = new ArrayList<>();
        for (Transaction trx : allTransactions) { // por cada transaccion trx de la lista allTransactions
            if (trx.getApp().equals(app)) {
                foundTransactions.add(trx);
            }
        }

        return foundTransactions;
    }

    public List<Transaction> findByTransactionsType(TransactionType type) {
        List<Transaction> allTransactions = repository.getAll();

        List<Transaction> foundTransactions = new ArrayList<>();
        for (Transaction trx : allTransactions) {
            if (trx.getType().equals(type)) {
                foundTransactions.add(trx);
            }
        }
        return foundTransactions;
    }

}
