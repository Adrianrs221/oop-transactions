import enums.AppType;
import enums.TransactionType;
import models.Transaction;
import service.TransactionService;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        TransactionService service = new TransactionService();


        List<Transaction> transactions = service.findByTransactionsType(TransactionType.TRANSFER);

        for (Transaction trx : transactions) {
            System.out.println(trx);
        }
    }


}
