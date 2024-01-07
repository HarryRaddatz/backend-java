
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pseudohuery.backend_teste.domain.model.Client;
import com.pseudohuery.backend_teste.application.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public List<Client> getAllClients() {
        return this.clientService.getAllClients();
    }

    private static class ClientRequest extends Client {
    }
}
