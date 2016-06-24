package com.isoftbet.rest.model;

public enum RestResponseStatus {	
	SUCCESS("success"), ERROR("error"); 
	
	enum SUCCESS {
		
	};
	
	enum ERROR {		
		ER01("Some optional information for the Player or Error info");
		
		private String error_desc;
		
		ERROR(String desc) {
			this.error_desc = desc;
		}

		public String getError_desc() {
			return error_desc;
		}		
	};
	
	private String status;
	
	RestResponseStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
	
}
