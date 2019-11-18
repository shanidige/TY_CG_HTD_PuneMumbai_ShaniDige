package com.capgemini.jabcinsertion.egex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataVerification {

	public boolean idVer(String userid) {
		Pattern pat = Pattern.compile("\\d+");
		Matcher mat = pat.matcher("userid");
		if (mat.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean nameVer(String username) {
		Pattern pat = Pattern.compile("\\w+"); // represents multiple char
		Matcher mat = pat.matcher("username");
		if (mat.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean emailVer(String email) {
		Pattern pat = Pattern.compile("\\w+\\@\\w+.\\w+"); // represents multiple char
		Matcher mat = pat.matcher("username");
		if (mat.matches()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean passVer(String pass) {
		Pattern pat = Pattern.compile("\\S+"); // represents multiple char
		Matcher mat = pat.matcher("username");
		if (mat.matches()) {
			return true;
		} else {
			return false;
		}

	}

}
