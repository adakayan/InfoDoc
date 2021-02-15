package com.infodoc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "request")
public class Request {
	private int requestId;
	private String senderId;
	private String recieverId;
	private String message;
	private boolean isApproved;
	public Request() {
	}
	public Request(int requestId, String senderId, String recieverId, String message,boolean isApproved) {
		super();
		this.requestId = requestId;
		this.senderId = senderId;
		this.recieverId = recieverId;
		this.message = message;
		this.isApproved = isApproved;
	}
	@Id
	@Column(name = "request_id")
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	@Column(name = "sender_id",nullable = false)
	public String getSenderId() {
		return senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	@Column(name = "reciever_id",nullable = false)
	public String getRecieverId() {
		return recieverId;
	}
	public void setRecieverId(String recieverId) {
		this.recieverId = recieverId;
	}
	@Column(name = "message")
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Column(name = "is_approved")
	public boolean isApproved() {
		return isApproved;
	}
	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((recieverId == null) ? 0 : recieverId.hashCode());
		result = prime * result + ((senderId == null) ? 0 : senderId.hashCode());
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
		Request other = (Request) obj;
		if (recieverId == null) {
			if (other.recieverId != null)
				return false;
		} else if (!recieverId.equals(other.recieverId))
			return false;
		if (senderId == null) {
			if (other.senderId != null)
				return false;
		} else if (!senderId.equals(other.senderId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Request [requestId=" + requestId + ", senderId=" + senderId + ", recieverId=" + recieverId
				+ ", message=" + message + ", isApproved=" + isApproved + "]";
	}
	
	
}
