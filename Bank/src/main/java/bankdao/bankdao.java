package bankdao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.Bank.BankApplication;

import bankrepo.bankrepo;
@Repository 
public class bankdao {
 final bankrepo bankrep;
	public String insertlist(List<BankApplication> detail) {
		
 bankrep.saveAll(detail);
 return "sesuess";
	}

}
