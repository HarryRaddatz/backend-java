
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pseudohuery.backend_teste.domain.model.Transaction;
import com.pseudohuery.backend_teste.application.service.TransactionService;

import java.util.List;

@RestController
@RequestMapping("/api/Transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping("/")
    public List<Transaction> getAllTransactions() {
        return this.transactionService.getAllTransactions();
    }

    private static class TransactionRequest extends Transaction {
    }
}
