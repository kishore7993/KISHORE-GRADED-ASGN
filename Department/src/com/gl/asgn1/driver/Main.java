package com.gl.asgn1.driver;

import java.util.Scanner;
import com.gl.asgn1.*;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		byte input;

		// Creating Objects within each class.

		SuperDepartment obj_Sup_Dep = new SuperDepartment();
		AdminDepartment obj_Adm_Dep = new AdminDepartment();
		HrDepartment obj_Hr_Dep = new HrDepartment();
		TechDepartment obj_Tec_Dep = new TechDepartment();

		System.out.println("Welcome, select your department.");
		System.out.println("1.Super Department");
		System.out.println("2.Admin Department");
		System.out.println("3.Hr Department");
		System.out.println("4.Tech Department");
		input = sc.nextByte();
		sc.close();
		switch (input) {

		case 1:
			System.out.println("Welcome to the " + obj_Sup_Dep.departmentName());
			System.out.println(obj_Sup_Dep.getTodaysWork());
			System.out.println(obj_Sup_Dep.getWorkDeadline());
			System.out.println(obj_Sup_Dep.isTodayAHoliday());

			break;

		case 2:
			System.out.println("Welcome to the " + obj_Adm_Dep.departmentName());
			System.out.println(obj_Adm_Dep.getTodaysWork());
			System.out.println(obj_Adm_Dep.getWorkDeadline());
			System.out.println(obj_Adm_Dep.isTodayAHoliday());

			break;

		case 3:
			System.out.println("Welcome to the " + obj_Hr_Dep.departmentName());
			System.out.println(obj_Hr_Dep.doActivity());
			System.out.println(obj_Hr_Dep.getTodaysWork());
			System.out.println(obj_Hr_Dep.getWorkDeadline());
			System.out.println(obj_Hr_Dep.isTodayAHoliday());

			break;

		case 4:
			System.out.println("Welcome to the " + obj_Tec_Dep.departmentName());
			System.out.println(obj_Tec_Dep.getTodaysWork());
			System.out.println(obj_Tec_Dep.getWorkDeadline());
			System.out.println(obj_Tec_Dep.getTechStackInformation());
			System.out.println(obj_Tec_Dep.isTodayAHoliday());

			break;

		default:
			System.out.println("Please select correct department!");
		}
	}
}