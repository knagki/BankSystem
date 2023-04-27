package controller;

import controller.action.TransactionAction;
import controller.action.TransactionWriteAction;
import controller.action.TransactionWriteFormAction;
import controller.action.Action;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();

	private ActionFactory() {
		super();
	}

	public static ActionFactory getInstance() {
		return instance;
	}

	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory : " + command);

		if (command.equals("transaction")) {
			action = new TransactionAction();
		}else if (command.equals("transaction_write_form")) {
			action = new TransactionWriteFormAction();
		} else if (command.equals("transaction_write")) {
			action = new TransactionWriteAction();
		}

		return action;
	}
}
