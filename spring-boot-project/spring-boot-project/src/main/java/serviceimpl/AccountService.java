package serviceimpl;
import java.util.List;

import demo.account.Account;
@service
public class AccountService {

    private AccountRepository accountRepository;

	    @Autowired
	    public AccountService(AccountRepository accountRepository) {
	        this.accountRepository = accountRepository;
	    }

	    public List<Account> getUserAccounts(String username) {
	        List<Account> accounts = null;
	        accounts = accountRepository.findAccountsByUserId(username);

	       
	        if (accounts != null) {
	            accounts.forEach(acct -> acct.getCreditCards()
	                    .forEach(card ->
	                            card.setNumber(card.getNumber()
	                                    .replaceAll("([\\d]{4})(?!$)", "****-"))));
	        }

	        return accounts;
	    }
	}

}
