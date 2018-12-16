package com.spring.demo.DI.innerbeans;

public class FileEditor {
	private FileChecker fileChecker;

	public void setFileChecker(FileChecker fileChecker) {
		System.out.println("Inside setFileChecker.");
		this.fileChecker = fileChecker;
	}

	public FileChecker getFileChecker() {
		return fileChecker;
	}

	public void fileCheck() {
		fileChecker.fileSpelling();
	}
}
