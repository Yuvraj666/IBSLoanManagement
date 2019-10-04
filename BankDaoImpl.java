package com.cg.ibsproject.dao;

public class BankDaoImpl implements BankDao {
	
	private final double rateOfInterestHomeLoan = 8.85;
	private final double rateOfInterestEducationLoan = 10.35;
	private final double rateOfInterestPersonalLoan = 11.75;
	private final double rateOfInterestVehicleLoan = 8.82;

	public double sendInterestHomeLoan() {
		return rateOfInterestHomeLoan;
	}

	public double sendInterestEducationLoan() {
		return rateOfInterestEducationLoan;
	}

	public double sendInterestPersonalLoan() {
		return rateOfInterestPersonalLoan;
	}

	public double sendInterestVehicleLoan() {
		return rateOfInterestVehicleLoan;
	}
}
