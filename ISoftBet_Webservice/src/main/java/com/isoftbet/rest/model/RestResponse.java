package com.isoftbet.rest.model;

public class RestResponse {
	private RestResponseStatus status;
	private String session_id;
	private String player_id;
	private String currency;
	private long balance;
	
	public RestResponseStatus getStatus() {
		return status;
	}
	public void setStatus(RestResponseStatus status) {
		this.status = status;
	}
	public String getSession_id() {
		return session_id;
	}
	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}
	public String getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(String player_id) {
		this.player_id = player_id;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "RestResponse [status=" + status + ", session_id=" + session_id + ", player_id=" + player_id
				+ ", currency=" + currency + ", balance=" + balance + "]";
	}
}
