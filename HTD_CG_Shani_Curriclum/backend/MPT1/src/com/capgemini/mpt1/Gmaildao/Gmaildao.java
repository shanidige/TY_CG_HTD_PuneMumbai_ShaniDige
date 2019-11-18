package com.capgemini.mpt1.Gmaildao;

import com.capgemini.mpt1.GmailBean.GmailBeans;

public interface Gmaildao {
 public GmailBeans login(String email,String password);
 
 public GmailBeans register(int user_id,String user_name ,String password,String email);

 public GmailBeans compose(String email,String message);
 public GmailBeans showinbox(String email);


 
 
}
