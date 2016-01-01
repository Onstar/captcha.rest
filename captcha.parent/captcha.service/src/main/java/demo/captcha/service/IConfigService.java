package demo.captcha.service;

import java.util.List;

import demo.captcha.model.Client;
import demo.captcha.model.Config;
import demo.captcha.rs.model.Assignment;

public interface IConfigService {
	
	Config saveOrUpdate(Config config);
	Config saveOrUpdate(Config config, Client client);
	Config removeClient(Config config);

	List<Config> listAll();
	void delete(String config);
	Config queryByNo(String no);
	
	void assignment(List<Assignment> assignments);
}
