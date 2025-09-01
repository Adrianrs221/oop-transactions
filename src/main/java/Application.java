import enums.AppType;
import enums.TransactionType;
import models.Transaction;
import service.TransactionService;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        /**
         List<Transaction> transactions = TransactionService.findTransactionsByOriginAccount("account-01");

         for (Transaction trx: transactions) {
         System.out.println(trx);
         }
         **/
        /**
         List<Transaction> transactions = TransactionService.findTransactionsByApp(AppType.YAPE);

         for (Transaction trx: transactions){
         System.out.println(trx);
         }
         **/

        List<Transaction> transactions = TransactionService.findByTransactionsType(TransactionType.TRANSFER);

        for (Transaction trx : transactions) {
            System.out.println(trx);
        }
    }


}
