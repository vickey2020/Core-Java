package com.deepak.throwable;

public class AccountImpl implements Account {
	public long actualFund = 100;

	@Override
	public long fundtransfer(long fund) throws InsufficientFundExcep {
		if (fund > actualFund) {
			throw new InsufficientFundExcep("Insufficient fund");
		} else {
           
			return 0;
		}

	}
	
	public static void main(String[] args) {
		Account account = new AccountImpl();
		try {
			account.fundtransfer(200);
		} catch (InsufficientFundExcep e) {
		e.printStackTrace();
		}
	}

}
