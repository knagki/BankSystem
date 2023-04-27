package dto;

public class AccountVO {
	private String account_num;
	private long balance;
	private Integer customer_num;
	
	/**
	 * @return the account_num
	 */
	public String getAccount_num() {
		return account_num;
	}
	/**
	 * @param account_num the account_num to set
	 */
	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}
	/**
	 * @return the balance
	 */
	public long getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(long balance) {
		this.balance = balance;
	}
	/**
	 * @return the customer_num
	 */
	public Integer getCustomer_num() {
		return customer_num;
	}
	/**
	 * @param customer_num the customer_num to set
	 */
	public void setCustomer_num(Integer customer_num) {
		this.customer_num = customer_num;
	}
}
