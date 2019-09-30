package service;

import java.util.List;

import pojo.IpLog;

public interface IpLogService {
	
	public List<IpLog> queryIpLogByUsername(String Username);
}
