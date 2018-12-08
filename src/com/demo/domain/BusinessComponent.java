package com.demo.domain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.demo.model.Trader;
import com.demo.model.Transaction;

import static java.util.stream.Collectors.toList;

public class BusinessComponent {
	static Trader raoul = new Trader("Raoul", "Cambridge");
	static Trader mario = new Trader("Mario", "Milan");
	static Trader alan = new Trader("Alan", "Cambridge");
	static Trader brian = new Trader("Brian", "Cambridge");
	static List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
			new Transaction(raoul, 2012, 1000),
			new Transaction(raoul, 2011, 400),
			new Transaction(mario, 2012, 710),
			new Transaction(mario, 2012, 700),
			new Transaction(alan, 2012, 950)
	);

	public static void main(String[] args) {
		Stream<Integer> ss;
		int sum = new BusinessComponent().getTransactionsValuesFromTradersInCambridge()
				.stream()
				.mapToInt(obiectDinStreamulDeObiecte -> {
					return obiectDinStreamulDeObiecte;
					//il mapeaza la un int
				})
				.sum();
		System.out.println(sum);
	}

	/**
	 * Find all transactions in 2011 and sort by value (small to high)
	 */
	public List<Transaction> findTransactionsIn2011() {
		return transactions.stream()
				.filter(transaction -> transaction.getYear() == 2011)
				.collect(toList());

	}

	/**
	 * What are all the unique cities where the traders work?
	 */

	public List<String> getUniqueCitiesOfTraders() {
		return transactions
				.stream()
				.map(transaction -> transaction.getTrader().getCity())
				.distinct()
				.collect(toList());
	}

	/**
	 * Find all traders from Cambridge sorted by name
	 */
	public List<Trader> getTradersFromCambridge() {
		return transactions.stream()
                .map(Transaction::getTrader)
				.filter(trader -> trader.getCity().equals("Cambridge"))
				.distinct()
				.sorted(Comparator.comparing(Trader::getName))
				.collect(toList());
	}

	/**
	 * Return a string of all traders’ names sorted alphabetically
	 */
	public String getTraderNamesAsString() {
		return transactions.stream()
				.map(transaction -> transaction.getTrader().getName())
				.distinct()
				.sorted()
				.collect(Collectors.joining(","));

	}

	/**
	 * Are any traders based in Milan?
	 */
	public boolean areTradersInMilan() {
		return transactions.stream()
				.map(Transaction::getTrader)
				.anyMatch(trader -> trader.getCity().equals("Milan"));
	}

	/**
	 * Get all transactions’ values from the traders living in Cambridge
	 */
	public List<Integer> getTransactionsValuesFromTradersInCambridge() {
		return transactions.stream()
				.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
				.map(Transaction::getValue)
				.sorted()
				.collect(toList());
	}

	/**
	 * What’s the highest value of all the transactions?
	 */
	public int findMaxTransactionValue() {
		return transactions.stream()
				.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
				.max(Comparator.comparing(Transaction::getValue))
				.get()
				.getValue();
	}

}