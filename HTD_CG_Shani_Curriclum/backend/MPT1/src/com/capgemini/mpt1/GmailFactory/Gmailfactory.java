package com.capgemini.mpt1.GmailFactory;

import com.capgemini.mpt1.Gmaildao.Gmaildao;
import com.capgemini.mpt1.Gmaildao.Gmailimpl;

public class Gmailfactory {
private Gmailfactory() {
	
}
public static Gmaildao getInstance() {
	Gmaildao dao= new Gmailimpl();
	return null;
	
}
}
