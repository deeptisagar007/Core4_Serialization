package com.marlabs.io.examples;

import java.io.Serializable;

public final class Customers implements Serializable {
	private int customeId;
	private String customeName;
	private String customerPassWord;
	private long customerPinCode;
	private String cuatomerCity;

	/**
	 * @param customeId
	 * @param customeName
	 * @param customerPassWord
	 * @param customerPinCode
	 * @param cuatomerCity
	 */
	public Customers(int customeId, String customeName, String customerPassWord, long customerPinCode,
			String cuatomerCity) {
		this.customeId = customeId;
		this.customeName = customeName;
		this.customerPassWord = customerPassWord;
		this.customerPinCode = customerPinCode;
		this.cuatomerCity = cuatomerCity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cuatomerCity == null) ? 0 : cuatomerCity.hashCode());
		result = prime * result + customeId;
		result = prime * result + ((customeName == null) ? 0 : customeName.hashCode());
		result = prime * result + ((customerPassWord == null) ? 0 : customerPassWord.hashCode());
		result = prime * result + (int) (customerPinCode ^ (customerPinCode >>> 32));
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Customers)) {
			return false;
		}
		Customers other = (Customers) obj;
		if (cuatomerCity == null) {
			if (other.cuatomerCity != null) {
				return false;
			}
		} else if (!cuatomerCity.equals(other.cuatomerCity)) {
			return false;
		}
		if (customeId != other.customeId) {
			return false;
		}
		if (customeName == null) {
			if (other.customeName != null) {
				return false;
			}
		} else if (!customeName.equals(other.customeName)) {
			return false;
		}
		if (customerPassWord == null) {
			if (other.customerPassWord != null) {
				return false;
			}
		} else if (!customerPassWord.equals(other.customerPassWord)) {
			return false;
		}
		if (customerPinCode != other.customerPinCode) {
			return false;
		}
		return true;
	}

}
