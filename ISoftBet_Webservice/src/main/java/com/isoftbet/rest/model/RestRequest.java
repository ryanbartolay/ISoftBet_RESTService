package com.isoftbet.rest.model;

import java.util.List;

public class RestRequest {
	
	private String sessionId; // size : 48	
	private String playerId; // size : 64
	private String currency; // size : 3
	private int skinId; // size : 32
	private boolean allowOpenRounds; // size : 5
	private String state; // size : 16
	private String operator; // size : 250
	private List<Action> action; // json object
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getSkinId() {
		return skinId;
	}
	public void setSkinId(int skinId) {
		this.skinId = skinId;
	}
	public boolean isAllowOpenRounds() {
		return allowOpenRounds;
	}
	public void setAllowOpenRounds(boolean allowOpenRounds) {
		this.allowOpenRounds = allowOpenRounds;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public List<Action> getAction() {
		return action;
	}
	public void setAction(List<Action> action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "RestRequest [sessionId=" + sessionId + ", playerId=" + playerId + ", currency=" + currency + ", skinId="
				+ skinId + ", allowOpenRounds=" + allowOpenRounds + ", state=" + state + ", operator=" + operator
				+ ", action=" + action + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RestRequest other = (RestRequest) obj;
		if (playerId == null) {
			if (other.playerId != null)
				return false;
		} else if (!playerId.equals(other.playerId))
			return false;
		return true;
	}
}