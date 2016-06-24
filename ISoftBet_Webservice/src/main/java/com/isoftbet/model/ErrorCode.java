package com.isoftbet.model;

public enum ErrorCode {
	ER00 (ErrorType.GENERAL),
	R_02 (ErrorType.REQUEST),
	R_03 (ErrorType.REQUEST),
	R_09 (ErrorType.REQUEST),
	R_10 (ErrorType.REQUEST),
	R_11 (ErrorType.REQUEST),
	R_13 (ErrorType.REQUEST),
	I_03 (ErrorType.INIT),
	I_04 (ErrorType.INIT),
	B_03 (ErrorType.BET),
	B_04 (ErrorType.BET),
	B_05 (ErrorType.BET),
	B_06 (ErrorType.BET),
	B_07 (ErrorType.BET),
	W_03 (ErrorType.WIN),
	W_06 (ErrorType.WIN),
	W_07 (ErrorType.WIN),
	C_03 (ErrorType.CANCEL),
	C_04 (ErrorType.CANCEL),
	C_05 (ErrorType.CANCEL),
	D_01 (ErrorType.DIALOG);
	
	private ErrorType errorType;
	
	private ErrorCode(ErrorType errorType) {
		this.errorType = errorType;
	}
}
