package com.marlabs.io.examples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainApplication {

	public static void serializeTheObject(final Customers customer) {
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;

		try {
			fileOutputStream = new FileOutputStream("src/CustomerObjStatus");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(customer);
			System.out.println("Object Serialized");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
				if (objectOutputStream != null) {
					objectOutputStream.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void deSerializeTheObject() {

	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println("1) Serialize the Object");
		System.out.println("2) De-Serialize the object");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice");

		int choice = sc.nextInt();
		sc.close();
		switch (choice) {
		case 1:
			Customers customerObj = new Customers(1, "Deepti", "Pass", 100001, "NJ");
			serializeTheObject(customerObj);
			break;
		case 2:

			break;
		default:
			System.exit(0);
			break;
		}
		System.out.println("Main Ends");
	}

}
