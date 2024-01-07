
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pseudohuery.backend_teste.domain.model.Bank;
import com.pseudohuery.backend_teste.application.service.BankService;

import java.util.List;

@RestController
@RequestMapping("/api/Bank")
public class BankController {
    @Autowired
    private BankService bankService;

    @GetMapping("/")
    public List<Bank> getAllBanks() {
        return this.bankService.getAllBanks();
    }

    private static class BankRequest extends Bank {
    }
}
