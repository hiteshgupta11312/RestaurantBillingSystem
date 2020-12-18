/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author Hitesh SM
 */
import java.util.Scanner;
class Menu
{
	int bread,sandwich,pasta,pizza,soup,panner,rice,gol,dal,roti;
	void items()
	{
		System.out.println("\n\t\t\tMenu\n\nS.No\t\t\tItems\t\t\tPrice");
		System.out.println("\n1.\t\tGarlic Bread With Cheese\t119");
		bread = 119;
		System.out.println("\n2.\t\tGrilled Sandwich\t\t175");
		sandwich = 175;
		System.out.println("\n3.\t\tPasta Spicy Tomato\t\t190");
		pasta = 190;
		System.out.println("\n4.\t\tSuper Veggie Pizza\t\t265");
		pizza = 265;
		System.out.println("\n5.\t\tVeg. Noodle Soup\t\t109");
		soup = 109;
		System.out.println("\n6.\t\tChilly Panner Dry\t\t195");
		panner = 195;
		System.out.println("\n7.\t\tVeg Fried Rice\t\t\t165");
		rice = 165;
		System.out.println("\n8.\t\tGol Gappa[6 pcs.]\t\t68");
		gol = 68;
		System.out.println("\n9.\t\tDal Makhani\t\t\t192");
		dal = 192;
		System.out.println("\n10.\t\tButter Roti\t\t\t36");
		roti = 36;
		System.out.println("\n\n    You Can Order 6 Items Maximum\n");
	}
}
class Order extends Menu
{
	int s_no,qty,qty1,qty2,qty3,qty4,qty5,ch = 0,ch1 = 0,ch2 = 0,ch3 = 0,ch4 = 0,ch5 = 0,price = 0,price1 = 0,price2 = 0,price3 = 0,price4 = 0,price5 = 0;
	char any;
	Scanner scan = new Scanner(System.in);
	void getOrder()
	{
		System.out.print("\nEnter Item Serial No. : ");
		s_no = scan.nextInt();
		System.out.println();
		switch(s_no)
		{
			case 1 : System.out.print("Enter the Quantity of the item : ");
			qty = scan.nextInt();
			price = qty * bread;
			ch = 1;
			break;
			case 2 : System.out.print("Enter the Quantity of the item : ");
			qty = scan.nextInt();
			price = qty * sandwich;
			ch = 2;
			break;
			case 3 : System.out.print("Enter the Quantity of the item : ");
			qty = scan.nextInt();
			price = qty * pasta;
			ch = 3;
			break;
			case 4 : System.out.print("Enter the Quantity of the item : ");
			qty = scan.nextInt();
			price = qty * pizza;
			ch = 4;
			break;
			case 5 : System.out.print("Enter the Quantity of the item : ");
			qty = scan.nextInt();
			price = qty * soup;
			ch = 5;
			break;
			case 6 : System.out.print("Enter the Quantity of the item : ");
			qty = scan.nextInt();
			price = qty * panner;
			ch = 6;
			break;
			case 7 : System.out.print("Enter the Quantity of the item : ");
			qty = scan.nextInt();
			price = qty * rice;
			ch = 7;
			break;
			case 8 : System.out.print("Enter the Quantity of the item : ");
			qty = scan.nextInt();
			price = qty * gol;
			ch = 8;
			break;
			case 9 : System.out.print("Enter the Quantity of the item : ");
			qty = scan.nextInt();
			price = qty * dal;
			ch = 9;
			break;
			case 10 :  System.out.print("Enter the Quantity of the item : ");
			qty = scan.nextInt();
			price = qty * roti;
			ch = 10;
			break;
			default:
				System.out.println("Please Enter a Valid S.No. of the Item");
		}
	}
	void getOrder1()
	{
		System.out.print("\nDo you want to order something else??\n\nIf Yes press y otherwise press any another Key : ");
			any = scan.next().charAt(0);
			if(any == 'y' || any == 'Y')
			{
				
				System.out.print("\nEnter Item Serial No. : ");
				s_no = scan.nextInt();
				System.out.println();
				switch(s_no)
				{
					case 1 : System.out.print("Enter the Quantity of the item : ");
					qty1 = scan.nextInt();
					price1  = qty1 * bread;
					ch1 = 1;
					break;
					case 2 : System.out.print("Enter the Quantity of the item : ");
					qty1 = scan.nextInt();
					price1 = qty1 * sandwich;
					ch1 = 2;
					break;
					case 3 : System.out.print("Enter the Quantity of the item : ");
					qty1 = scan.nextInt();
					price1 = qty1 * pasta;
					ch1 = 3;
					break;
					case 4 : System.out.print("Enter the Quantity of the item : ");
					qty1 = scan.nextInt();
					price1 = qty1 * pizza;
					ch1 = 4;
					break;
					case 5 : System.out.print("Enter the Quantity of the item : ");
					qty1 = scan.nextInt();
					price1 = qty1 * soup;
					ch1 = 5;
					break;
					case 6 : System.out.print("Enter the Quantity of the item : ");
					qty1 = scan.nextInt();
					price1 = qty1 * panner;
					ch1 = 6;
					break;
					case 7 : System.out.print("Enter the Quantity of the item : ");
					qty1 = scan.nextInt();
					price1 = qty1 * rice;
					ch1 = 7;
					break;
					case 8 : System.out.print("Enter the Quantity of the item : ");
					qty1 = scan.nextInt();
					price1 = qty1 * gol;
					ch1 = 8;
					break;
					case 9 : System.out.print("Enter the Quantity of the item : ");
					qty1 = scan.nextInt();
					price1 = qty1 * dal;
					ch1 = 9;
					break;
					case 10 :  System.out.print("Enter the Quantity of the item : ");
					qty1 = scan.nextInt();
					price1 = qty1 * roti;
					ch1 = 10;
					break;
					default:
						System.out.println("Please Enter a Valid S.No. of the Item");
				}
			}
	}
	void getOrder2()
	{
		System.out.print("\nDo you want to order something else??\n\nIf Yes press y otherwise press any another Key : ");
			any = scan.next().charAt(0);
			if(any == 'y' || any == 'Y')
			{
				
				System.out.print("\nEnter Item Serial No. : ");
				s_no = scan.nextInt();
				System.out.println();
				switch(s_no)
				{
					case 1 : System.out.print("Enter the Quantity of the item : ");
					qty2 = scan.nextInt();
					price2 = qty2 * bread;
					ch2 = 1;
					break;
					case 2 : System.out.print("Enter the Quantity of the item : ");
					qty2 = scan.nextInt();
					price2 = qty2 * sandwich;
					ch2 = 2;
					break;
					case 3 : System.out.print("Enter the Quantity of the item : ");
					qty2 = scan.nextInt();
					price2 = qty2 * pasta;
					ch2 = 3;
					break;
					case 4 : System.out.print("Enter the Quantity of the item : ");
					qty2 = scan.nextInt();
					price2 = qty2 * pizza;
					ch2 = 4;
					break;
					case 5 : System.out.print("Enter the Quantity of the item : ");
					qty2 = scan.nextInt();
					price2 = qty2 * soup;
					ch2 = 5;
					break;
					case 6 : System.out.print("Enter the Quantity of the item : ");
					qty2 = scan.nextInt();
					price2 = qty2 * panner;
					ch2 = 6;
					break;
					case 7 : System.out.print("Enter the Quantity of the item : ");
					qty2 = scan.nextInt();
					price2 = qty2 * rice;
					ch2 = 7;
					break;
					case 8 : System.out.print("Enter the Quantity of the item : ");
					qty2 = scan.nextInt();
					price2 = qty2 * gol;
					ch2 = 8;
					break;
					case 9 : System.out.print("Enter the Quantity of the item : ");
					qty2 = scan.nextInt();
					price2 = qty2 * dal;
					ch2 = 9;
					break;
					case 10 :  System.out.print("Enter the Quantity of the item : ");
					qty2 = scan.nextInt();
					price2 = qty2 * roti;
					ch2 = 10;
					break;
					default:
						System.out.println("Please Enter a Valid S.No. of the Item");
				}
			}
	}
	void getOrder3()
	{
		System.out.print("\nDo you want to order something else??\n\nIf Yes press y otherwise press any another Key : ");
			any = scan.next().charAt(0);
			if(any == 'y' || any == 'Y')
			{
				
				System.out.print("\nEnter Item Serial No. : ");
				s_no = scan.nextInt();
				System.out.println();
				switch(s_no)
				{
					case 1 : System.out.print("Enter the Quantity of the item : ");
					qty3 = scan.nextInt();
					price3 = qty3 * bread;
					ch3 = 1;
					break;
					case 2 : System.out.print("Enter the Quantity of the item : ");
					qty3 = scan.nextInt();
					price3 = qty3 * sandwich;
					ch3 = 2;
					break;
					case 3 : System.out.print("Enter the Quantity of the item : ");
					qty3 = scan.nextInt();
					price3 = qty3 * pasta;
					ch3 = 3;
					break;
					case 4 : System.out.print("Enter the Quantity of the item : ");
					qty3 = scan.nextInt();
					price3 = qty3 * pizza;
					ch3 = 4;
					break;
					case 5 : System.out.print("Enter the Quantity of the item : ");
					qty3 = scan.nextInt();
					price3 = qty3 * soup;
					ch3 = 5;
					break;
					case 6 : System.out.print("Enter the Quantity of the item : ");
					qty3 = scan.nextInt();
					price3 = qty3 * panner;
					ch3 = 6;
					break;
					case 7 : System.out.print("Enter the Quantity of the item : ");
					qty3 = scan.nextInt();
					price3 = qty3 * rice;
					ch3 = 7;
					break;
					case 8 : System.out.print("Enter the Quantity of the item : ");
					qty3 = scan.nextInt();
					price3 = qty3 * gol;
					ch3 = 8;
					break;
					case 9 : System.out.print("Enter the Quantity of the item : ");
					qty3 = scan.nextInt();
					price3 = qty3 * dal;
					ch3 = 9;
					break;
					case 10 :  System.out.print("Enter the Quantity of the item : ");
					qty3 = scan.nextInt();
					price3 = qty3 * roti;
					ch3 = 10;
					break;
					default:
						System.out.println("Please Enter a Valid S.No. of the Item");
				}
			}
	}
	void getOrder4()
	{
		System.out.print("\nDo you want to order something else??\n\nIf Yes press y otherwise press any another Key : ");
			any = scan.next().charAt(0);
			if(any == 'y' || any == 'Y')
			{
				
				System.out.print("\nEnter Item Serial No. : ");
				s_no = scan.nextInt();
				System.out.println();
				switch(s_no)
				{
					case 1 : System.out.print("Enter the Quantity of the item : ");
					qty4 = scan.nextInt();
					price4 = qty4 * bread;
					ch4 = 1;
					break;
					case 2 : System.out.print("Enter the Quantity of the item : ");
					qty4 = scan.nextInt();
					price4 = qty4 * sandwich;
					ch4 = 2;
					break;
					case 3 : System.out.print("Enter the Quantity of the item : ");
					qty4 = scan.nextInt();
					price4 = qty4 * pasta;
					ch4 = 3;
					break;
					case 4 : System.out.print("Enter the Quantity of the item : ");
					qty4 = scan.nextInt();
					price4 = qty4 * pizza;
					ch4 = 4;
					break;
					case 5 : System.out.print("Enter the Quantity of the item : ");
					qty4 = scan.nextInt();
					price4 = qty4 * soup;
					ch4 = 5;
					break;
					case 6 : System.out.print("Enter the Quantity of the item : ");
					qty4 = scan.nextInt();
					price4 = qty4 * panner;
					ch4 = 6;
					break;
					case 7 : System.out.print("Enter the Quantity of the item : ");
					qty4 = scan.nextInt();
					price4 = qty4 * rice;
					ch4 = 7;
					break;
					case 8 : System.out.print("Enter the Quantity of the item : ");
					qty4 = scan.nextInt();
					price4 = qty4 * gol;
					ch4 = 8;
					break;
					case 9 : System.out.print("Enter the Quantity of the item : ");
					qty4 = scan.nextInt();
					price4 = qty4 * dal;
					ch4 = 9;
					break;
					case 10 :  System.out.print("Enter the Quantity of the item : ");
					qty4 = scan.nextInt();
					price4 = qty4 * roti;
					ch4 = 10;
					break;
					default:
						System.out.println("Please Enter a Valid S.No. of the Item");
				}
			}
	}
	void getOrder5()
	{
		System.out.print("\nDo you want to order something else??\n\nIf Yes press y otherwise press any another Key : ");
			any = scan.next().charAt(0);
			if(any == 'y' || any == 'Y')
			{
				
				System.out.print("\nEnter Item Serial No. : ");
				s_no = scan.nextInt();
				System.out.println();
				switch(s_no)
				{
					case 1 : System.out.print("Enter the Quantity of the item : ");
					qty5 = scan.nextInt();
					price5 = qty5 * bread;
					ch5 = 1;
					break;
					case 2 : System.out.print("Enter the Quantity of the item : ");
					qty5 = scan.nextInt();
					price5 = qty5 * sandwich;
					ch5 = 2;
					break;
					case 3 : System.out.print("Enter the Quantity of the item : ");
					qty5 = scan.nextInt();
					price5 = qty5 * pasta;
					ch5 = 3;
					break;
					case 4 : System.out.print("Enter the Quantity of the item : ");
					qty5 = scan.nextInt();
					price5 = qty5 * pizza;
					ch5 = 4;
					break;
					case 5 : System.out.print("Enter the Quantity of the item : ");
					qty5 = scan.nextInt();
					price5 = qty5 * soup;
					ch5 = 5;
					break;
					case 6 : System.out.print("Enter the Quantity of the item : ");
					qty5 = scan.nextInt();
					price5 = qty5 * panner;
					ch5 = 6;
					break;
					case 7 : System.out.print("Enter the Quantity of the item : ");
					qty5 = scan.nextInt();
					price5 = qty5 * rice;
					ch5 = 7;
					break;
					case 8 : System.out.print("Enter the Quantity of the item : ");
					qty5 = scan.nextInt();
					price5 = qty5 * gol;
					ch5 = 8;
					break;
					case 9 : System.out.print("Enter the Quantity of the item : ");
					qty5 = scan.nextInt();
					price5 = qty5 * dal;
					ch5 = 9;
					break;
					case 10 :  System.out.print("Enter the Quantity of the item : ");
					qty5 = scan.nextInt();
					price5 = qty5 * roti;
					ch5 = 10;
					break;
					default:
						System.out.println("Please Enter a Valid S.No. of the Item");
				}
			}
	}
	void putOrder()
	{
		switch (ch) {
			case 1 : System.out.println("\n\t\t\tYour Order\n\nS.No\t\t\tItems\t\t\tPrice");
			System.out.println("\n1.\t\t"+ qty +" Garlic Bread With Cheese\t"+price);
			break;
			case 2 : System.out.println("\n\t\t\tYour Order\n\nS.No\t\t\tItems\t\t\tPrice");
			System.out.println("\n2.\t\t"+ qty +" Grilled Sandwich\t\t"+price);
			break;
			case 3 : System.out.println("\n\t\t\tYour Order\n\nS.No\t\t\tItems\t\t\tPrice");
			System.out.println("\n3.\t\t"+ qty +" Pasta Spicy Tomato\t\t"+price);
			break;
			case 4 : System.out.println("\n\t\t\tYour Order\n\nS.No\t\t\tItems\t\t\tPrice");
			System.out.println("\n4.\t\t"+ qty +" Super Veggie Pizza\t\t"+price);
			break;
			case 5 : System.out.println("\n\t\t\tYour Order\n\nS.No\t\t\tItems\t\t\tPrice");
			System.out.println("\n5.\t\t"+ qty +" Veg. Noodle Soup\t\t"+price);
			break;
			case 6 : System.out.println("\n\t\t\tYour Order\n\nS.No\t\t\tItems\t\t\tPrice");
			System.out.println("\n6.\t\t"+ qty +" Chilly Panner Dry\t\t"+price);
			break;
			case 7 : System.out.println("\n\t\t\tYour Order\n\nS.No\t\t\tItems\t\t\tPrice");
			System.out.println("\n7.\t\t"+ qty +" Veg Fried Rice\t\t"+price);
			break;
			case 8 : System.out.println("\n\t\t\tYour Order\n\nS.No\t\t\tItems\t\t\tPrice");
			System.out.println("\n8.\t\t"+ qty +" Gol Gappa[6 pcs.]\t\t"+price);
			break;
			case 9 : System.out.println("\n\t\t\tYour Order\n\nS.No\t\t\tItems\t\t\tPrice");
			System.out.println("\n9.\t\t"+ qty +" Dal Makhani\t\t\t"+price);
			break;
			case 10 : System.out.println("\n\t\t\tYour Order\n\nS.No\t\t\tItems\t\t\tPrice");
			System.out.println("\n10.\t\t"+ qty +" Butter Roti\t\t\t"+price);
			break;
		}
		switch (ch1) {
			case 1 : System.out.println("\n1.\t\t"+ qty1 +" Garlic Bread With Cheese\t"+price1);
			break;
			case 2 : System.out.println("\n2.\t\t"+ qty1 +" Grilled Sandwich\t\t"+price1);
			break;
			case 3 : System.out.println("\n3.\t\t"+ qty1 +" Pasta Spicy Tomato\t\t"+price1);
			break;
			case 4 : System.out.println("\n4.\t\t"+ qty1 +" Super Veggie Pizza\t\t"+price1);
			break;
			case 5 : System.out.println("\n5.\t\t"+ qty1 +" Veg. Noodle Soup\t\t"+price1);
			break;
			case 6 : System.out.println("\n6.\t\t"+ qty1 +" Chilly Panner Dry\t\t"+price1);
			break;
			case 7 : System.out.println("\n7.\t\t"+ qty1 +" Veg Fried Rice\t\t"+price1);
			break;
			case 8 : System.out.println("\n8.\t\t"+ qty1 +" Gol Gappa[6 pcs.]\t\t"+price1);
			break;
			case 9 : System.out.println("\n9.\t\t"+ qty1 +" Dal Makhani\t\t\t"+price1);
			break;
			case 10 : System.out.println("\n10.\t\t"+ qty1 +" Butter Roti\t\t\t"+price1);
			break;
		}
		switch (ch2) {
			case 1 : System.out.println("\n1.\t\t"+ qty2 +" Garlic Bread With Cheese\t"+price2);
			break;
			case 2 : System.out.println("\n2.\t\t"+ qty2 +" Grilled Sandwich\t\t"+price2);
			break;
			case 3 : System.out.println("\n3.\t\t"+ qty2 +" Pasta Spicy Tomato\t\t"+price2);
			break;
			case 4 : System.out.println("\n4.\t\t"+ qty2 +" Super Veggie Pizza\t\t"+price2);
			break;
			case 5 : System.out.println("\n5.\t\t"+ qty2 +" Veg. Noodle Soup\t\t"+price2);
			break;
			case 6 : System.out.println("\n6.\t\t"+ qty2 +" Chilly Panner Dry\t\t"+price2);
			break;
			case 7 : System.out.println("\n7.\t\t"+ qty2 +" Veg Fried Rice\t\t"+price2);
			break;
			case 8 : System.out.println("\n8.\t\t"+ qty2 +" Gol Gappa[6 pcs.]\t\t"+price2);
			break;
			case 9 : System.out.println("\n9.\t\t"+ qty2 +" Dal Makhani\t\t\t"+price2);
			break;
			case 10 : System.out.println("\n10.\t\t"+ qty2 +" Butter Roti\t\t\t"+price2);
			break;
		}
		switch (ch3) {
			case 1 : System.out.println("\n1.\t\t"+ qty3 +" Garlic Bread With Cheese\t"+price3);
			break;
			case 2 : System.out.println("\n2.\t\t"+ qty3 +" Grilled Sandwich\t\t"+price3);
			break;
			case 3 : System.out.println("\n3.\t\t"+ qty3 +" Pasta Spicy Tomato\t\t"+price3);
			break;
			case 4 : System.out.println("\n4.\t\t"+ qty3 +" Super Veggie Pizza\t\t"+price3);
			break;
			case 5 : System.out.println("\n5.\t\t"+ qty3 +" Veg. Noodle Soup\t\t"+price3);
			break;
			case 6 : System.out.println("\n6.\t\t"+ qty3 +" Chilly Panner Dry\t\t"+price3);
			break;
			case 7 : System.out.println("\n7.\t\t"+ qty3 +" Veg Fried Rice\t\t"+price3);
			break;
			case 8 : System.out.println("\n8.\t\t"+ qty3 +" Gol Gappa[6 pcs.]\t\t"+price3);
			break;
			case 9 : System.out.println("\n9.\t\t"+ qty3 +" Dal Makhani\t\t\t"+price3);
			break;
			case 10 : System.out.println("\n10.\t\t"+ qty3 +" Butter Roti\t\t\t"+price3);
			break;
		}
		switch (ch4) {
			case 1 : System.out.println("\n1.\t\t"+ qty4 +" Garlic Bread With Cheese\t"+price4);
			break;
			case 2 : System.out.println("\n2.\t\t"+ qty4 +" Grilled Sandwich\t\t"+price4);
			break;
			case 3 : System.out.println("\n3.\t\t"+ qty4 +" Pasta Spicy Tomato\t\t"+price4);
			break;
			case 4 : System.out.println("\n4.\t\t"+ qty4 +" Super Veggie Pizza\t\t"+price4);
			break;
			case 5 : System.out.println("\n5.\t\t"+ qty4 +" Veg. Noodle Soup\t\t"+price4);
			break;
			case 6 : System.out.println("\n6.\t\t"+ qty4 +" Chilly Panner Dry\t\t"+price4);
			break;
			case 7 : System.out.println("\n7.\t\t"+ qty4 +" Veg Fried Rice\t\t"+price4);
			break;
			case 8 : System.out.println("\n8.\t\t"+ qty4 +" Gol Gappa[6 pcs.]\t\t"+price4);
			break;
			case 9 : System.out.println("\n9.\t\t"+ qty4 +" Dal Makhani\t\t\t"+price4);
			break;
			case 10 : System.out.println("\n10.\t\t"+ qty4 +" Butter Roti\t\t\t"+price4);
			break;
		}
		switch (ch5) {
			case 1 : System.out.println("\n1.\t\t"+ qty5 +" Garlic Bread With Cheese\t"+price5);
			break;
			case 2 : System.out.println("\n2.\t\t"+ qty5 +" Grilled Sandwich\t\t"+price5);
			break;
			case 3 : System.out.println("\n3.\t\t"+ qty5 +" Pasta Spicy Tomato\t\t"+price5);
			break;
			case 4 : System.out.println("\n4.\t\t"+ qty5 +" Super Veggie Pizza\t\t"+price5);
			break;
			case 5 : System.out.println("\n5.\t\t"+ qty5 +" Veg. Noodle Soup\t\t"+price5);
			break;
			case 6 : System.out.println("\n6.\t\t"+ qty5 +" Chilly Panner Dry\t\t"+price5);
			break;
			case 7 : System.out.println("\n7.\t\t"+ qty5 +" Veg Fried Rice\t\t"+price5);
			break;
			case 8 : System.out.println("\n8.\t\t"+ qty5 +" Gol Gappa[6 pcs.]\t\t"+price5);
			break;
			case 9 : System.out.println("\n9.\t\t"+ qty5 +" Dal Makhani\t\t\t"+price5);
			break;
			case 10 : System.out.println("\n10.\t\t"+ qty5 +" Butter Roti\t\t\t"+price5);
			break;
		}
	}
}
class Bill extends Order
{
	char any;
	int total;
	float tax;
	Scanner scan = new Scanner(System.in);
	void confirm()
	{
		System.out.print("\n\n\t\tIs this order Confirmed\n\nIf yes press y otherwise press another key : ");
		any = scan.next().charAt(0);
		System.out.println("\n");
		if(any == 'y' || any == 'Y')
		{
			switch (ch) {
				case 1 : System.out.println("\n\n\t\t\tYour Bill\n\nS.No\t\t\tItems\t\t\tPrice");
				System.out.println("\n1.\t\t"+ qty +" Garlic Bread With Cheese\t"+price);
				break;
				case 2 : System.out.println("\n\n\t\t\tYour Bill\n\nS.No\t\t\tItems\t\t\tPrice");
				System.out.println("\n2.\t\t"+ qty +" Grilled Sandwich\t\t"+price);
				break;
				case 3 : System.out.println("\n\n\t\t\tYour Bill\n\nS.No\t\t\tItems\t\t\tPrice");
				System.out.println("\n3.\t\t"+ qty +" Pasta Spicy Tomato\t\t"+price);
				break;
				case 4 : System.out.println("\n\n\t\t\tYour Bill\n\nS.No\t\t\tItems\t\t\tPrice");
				System.out.println("\n4.\t\t"+ qty +" Super Veggie Pizza\t\t"+price);
				break;
				case 5 : System.out.println("\n\n\t\t\tYour Bill\n\nS.No\t\t\tItems\t\t\tPrice");
				System.out.println("\n5.\t\t"+ qty +" Veg. Noodle Soup\t\t"+price);
				break;
				case 6 : System.out.println("\n\n\t\t\tYour Bill\n\nS.No\t\t\tItems\t\t\tPrice");
				System.out.println("\n6.\t\t"+ qty +" Chilly Panner Dry\t\t"+price);
				break;
				case 7 : System.out.println("\n\n\t\t\tYour Bill\n\nS.No\t\t\tItems\t\t\tPrice");
				System.out.println("\n7.\t\t"+ qty +" Veg Fried Rice\t\t"+price);
				break;
				case 8 : System.out.println("\n\n\t\t\tYour Bill\n\nS.No\t\t\tItems\t\t\tPrice");
				System.out.println("\n8.\t\t"+ qty +" Gol Gappa[6 pcs.]\t\t"+price);
				break;
				case 9 : System.out.println("\n\n\t\t\tYour Bill\n\nS.No\t\t\tItems\t\t\tPrice");
				System.out.println("\n9.\t\t"+ qty +" Dal Makhani\t\t\t"+price);
				break;
				case 10 : System.out.println("\n\n\t\t\tYour Bill\n\nS.No\t\t\tItems\t\t\tPrice");
				System.out.println("\n10.\t\t"+ qty +" Butter Roti\t\t\t"+price);
				break;
			}
			switch (ch1) {
				case 1 : System.out.println("\n1.\t\t"+ qty1 +" Garlic Bread With Cheese\t"+price1);
				break;
				case 2 : System.out.println("\n2.\t\t"+ qty1 +" Grilled Sandwich\t\t"+price1);
				break;
				case 3 : System.out.println("\n3.\t\t"+ qty1 +" Pasta Spicy Tomato\t\t"+price1);
				break;
				case 4 : System.out.println("\n4.\t\t"+ qty1 +" Super Veggie Pizza\t\t"+price1);
				break;
				case 5 : System.out.println("\n5.\t\t"+ qty1 +" Veg. Noodle Soup\t\t"+price1);
				break;
				case 6 : System.out.println("\n6.\t\t"+ qty1 +" Chilly Panner Dry\t\t"+price1);
				break;
				case 7 : System.out.println("\n7.\t\t"+ qty1 +" Veg Fried Rice\t\t"+price1);
				break;
				case 8 : System.out.println("\n8.\t\t"+ qty1 +" Gol Gappa[6 pcs.]\t\t"+price1);
				break;
				case 9 : System.out.println("\n9.\t\t"+ qty1 +" Dal Makhani\t\t\t"+price1);
				break;
				case 10 : System.out.println("\n10.\t\t"+ qty1 +" Butter Roti\t\t\t"+price1);
				break;
			}
			switch (ch2) {
				case 1 : System.out.println("\n1.\t\t"+ qty2 +" Garlic Bread With Cheese\t"+price2);
				break;
				case 2 : System.out.println("\n2.\t\t"+ qty2 +" Grilled Sandwich\t\t"+price2);
				break;
				case 3 : System.out.println("\n3.\t\t"+ qty2 +" Pasta Spicy Tomato\t\t"+price2);
				break;
				case 4 : System.out.println("\n4.\t\t"+ qty2 +" Super Veggie Pizza\t\t"+price2);
				break;
				case 5 : System.out.println("\n5.\t\t"+ qty2 +" Veg. Noodle Soup\t\t"+price2);
				break;
				case 6 : System.out.println("\n6.\t\t"+ qty2 +" Chilly Panner Dry\t\t"+price2);
				break;
				case 7 : System.out.println("\n7.\t\t"+ qty2 +" Veg Fried Rice\t\t"+price2);
				break;
				case 8 : System.out.println("\n8.\t\t"+ qty2 +" Gol Gappa[6 pcs.]\t\t"+price2);
				break;
				case 9 : System.out.println("\n9.\t\t"+ qty2 +" Dal Makhani\t\t\t"+price2);
				break;
				case 10 : System.out.println("\n10.\t\t"+ qty2 +" Butter Roti\t\t\t"+price2);
				break;
			}
			switch (ch3) {
				case 1 : System.out.println("\n1.\t\t"+ qty3 +" Garlic Bread With Cheese\t"+price3);
				break;
				case 2 : System.out.println("\n2.\t\t"+ qty3 +" Grilled Sandwich\t\t"+price3);
				break;
				case 3 : System.out.println("\n3.\t\t"+ qty3 +" Pasta Spicy Tomato\t\t"+price3);
				break;
				case 4 : System.out.println("\n4.\t\t"+ qty3 +" Super Veggie Pizza\t\t"+price3);
				break;
				case 5 : System.out.println("\n5.\t\t"+ qty3 +" Veg. Noodle Soup\t\t"+price3);
				break;
				case 6 : System.out.println("\n6.\t\t"+ qty3 +" Chilly Panner Dry\t\t"+price3);
				break;
				case 7 : System.out.println("\n7.\t\t"+ qty3 +" Veg Fried Rice\t\t"+price3);
				break;
				case 8 : System.out.println("\n8.\t\t"+ qty3 +" Gol Gappa[6 pcs.]\t\t"+price3);
				break;
				case 9 : System.out.println("\n9.\t\t"+ qty3 +" Dal Makhani\t\t\t"+price3);
				break;
				case 10 : System.out.println("\n10.\t\t"+ qty3 +" Butter Roti\t\t\t"+price3);
				break;
			}
			switch (ch4) {
				case 1 : System.out.println("\n1.\t\t"+ qty4 +" Garlic Bread With Cheese\t"+price4);
				break;
				case 2 : System.out.println("\n2.\t\t"+ qty4 +" Grilled Sandwich\t\t"+price4);
				break;
				case 3 : System.out.println("\n3.\t\t"+ qty4 +" Pasta Spicy Tomato\t\t"+price4);
				break;
				case 4 : System.out.println("\n4.\t\t"+ qty4 +" Super Veggie Pizza\t\t"+price4);
				break;
				case 5 : System.out.println("\n5.\t\t"+ qty4 +" Veg. Noodle Soup\t\t"+price4);
				break;
				case 6 : System.out.println("\n6.\t\t"+ qty4 +" Chilly Panner Dry\t\t"+price4);
				break;
				case 7 : System.out.println("\n7.\t\t"+ qty4 +" Veg Fried Rice\t\t"+price4);
				break;
				case 8 : System.out.println("\n8.\t\t"+ qty4 +" Gol Gappa[6 pcs.]\t\t"+price4);
				break;
				case 9 : System.out.println("\n9.\t\t"+ qty4 +" Dal Makhani\t\t\t"+price4);
				break;
				case 10 : System.out.println("\n10.\t\t"+ qty4 +" Butter Roti\t\t\t"+price4);
				break;
			}
			switch (ch5) {
				case 1 : System.out.println("\n1.\t\t"+ qty5 +" Garlic Bread With Cheese\t"+price5);
				break;
				case 2 : System.out.println("\n2.\t\t"+ qty5 +" Grilled Sandwich\t\t"+price5);
				break;
				case 3 : System.out.println("\n3.\t\t"+ qty5 +" Pasta Spicy Tomato\t\t"+price5);
				break;
				case 4 : System.out.println("\n4.\t\t"+ qty5 +" Super Veggie Pizza\t\t"+price5);
				break;
				case 5 : System.out.println("\n5.\t\t"+ qty5 +" Veg. Noodle Soup\t\t"+price5);
				break;
				case 6 : System.out.println("\n6.\t\t"+ qty5 +" Chilly Panner Dry\t\t"+price5);
				break;
				case 7 : System.out.println("\n7.\t\t"+ qty5 +" Veg Fried Rice\t\t"+price5);
				break;
				case 8 : System.out.println("\n8.\t\t"+ qty5 +" Gol Gappa[6 pcs.]\t\t"+price5);
				break;
				case 9 : System.out.println("\n9.\t\t"+ qty5 +" Dal Makhani\t\t\t"+price5);
				break;
				case 10 : System.out.println("\n10.\t\t"+ qty5 +" Butter Roti\t\t\t"+price5);
				break;
			}
			total = price+price1+price2+price3+price4+price5;
			tax = total * (float)0.1; 
			System.out.println("\n  \t\t\t\t\t       ------");
			System.out.println("\n  \t\tTotal Price\t\t\t"+total);
			System.out.println("\n  \t\t+10% Tax   \t\t\t"+tax);
			System.out.println("\n  \t\t\t\t\t       ------");
			System.out.println("\n  \t\tNet Amount\t\t\t"+(total+tax));
		}
		else
		{
			System.out.println("\n\t\tPlease Place Your Order Again\n\n\n");
			getOrder();
			getOrder1();
			getOrder2();
			getOrder3();
			getOrder4();
			getOrder5();
			putOrder();
			confirm();
		}
	}
}
class Restaurant
{
	public static void main(String[] args) 
	{
		int n;
		Scanner scan = new Scanner(System.in);
		Bill item = new Bill();
		System.out.println("\n\n\tWelcome To Java Programming Restaurant\n\n");
		item.items();
		System.out.print("Enter the No. of orders You Want to place : ");
		n = scan.nextInt();
		if(n==1)
		{
			item.getOrder();
		}
		else if(n==2)
		{
			item.getOrder();
			item.getOrder1();
		}
		else if(n==3)
		{
			item.getOrder();
			item.getOrder1();
			item.getOrder2();
		}
		else if(n==4)
		{
			item.getOrder();
			item.getOrder1();
			item.getOrder2();
			item.getOrder3();
		}
		else if(n==5)
		{
			item.getOrder();
			item.getOrder1();
			item.getOrder2();
			item.getOrder3();
			item.getOrder4();
		}
		else if(n==6)
		{
			item.getOrder();
			item.getOrder1();
			item.getOrder2();
			item.getOrder3();
			item.getOrder4();
			item.getOrder5();
		}
		else
		{
			System.out.println("Sorry You Can Maximum Upto 6 Items");
		}
		item.putOrder();
		item.confirm();
	}
}
