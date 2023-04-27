package dto;

import java.sql.Timestamp;

public class TransactionVO {
	private String transaction_num; 
	private String sender_account; // 보내는 고객 계좌
	private String receiver_account; // 받는 고객 계좌
	private long amount; // 이체 금액
	private String send_context; // 보내는 사람 메모
	private Timestamp transaction_date; // 이체한 날짜
	
	/**
	 * @return the transaction_num
	 */
	public String getTransaction_num() {
		return transaction_num;
	}
	/**
	 * @return the transaction_date
	 */
	public Timestamp getTransaction_date() {
		return transaction_date;
	}
	/**
	 * @param transaction_date the transaction_date to set
	 */
	public void setTransaction_date(Timestamp transaction_date) {
		this.transaction_date = transaction_date;
	}
	/**
	 * @param transaction_num the transaction_num to set
	 */
	public void setTransaction_num(String transaction_num) {
		this.transaction_num = transaction_num;
	}
	/**
	 * @return the send_context
	 */
	public String getSend_context() {
		return send_context;
	}
	/**
	 * @param send_context the send_context to set
	 */
	public void setSend_context(String send_context) {
		this.send_context = send_context;
	}
	/**
	 * @return the sender_account
	 */
	public String getSender_account() {
		return sender_account;
	}
	/**
	 * @param sender_account the sender_account to set
	 */
	public void setSender_account(String sender_account) {
		this.sender_account = sender_account;
	}
	/**
	 * @return the receiver_account
	 */
	public String getReceiver_account() {
		return receiver_account;
	}
	/**
	 * @param receiver_account the receiver_account to set
	 */
	public void setReceiver_account(String receiver_account) {
		this.receiver_account = receiver_account;
	}
	/**
	 * @return the amount
	 */
	public long getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(long amount) {
		this.amount = amount;
	}
}
