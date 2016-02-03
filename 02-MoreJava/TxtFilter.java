package ca.cmpt213.as1content;

import java.io.File;
import java.io.FileFilter;

class TxtFilter implements FileFilter {
	@Override
	public boolean accept(File file) {
		// REVISIT:- How to improve this code?
		if (file.getName().endsWith(".txt")) {
			return true;
		} else {
			return false;
		}
	}

}	