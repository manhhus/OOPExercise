package meunu.menu;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu " 
					+ "\n1.Lab" 
					+ "\n2.Homeword");
		int choiceMenu;
		int choiceHwNumber;
		do {
			System.out.print("Chọn mục 1 (Homework) hoặc 2 (Lab): ");
			choiceMenu = sc.nextInt();
		} while ((choiceMenu < 1) || (choiceMenu > 2));
		switch (choiceMenu) {
		case 1:
			int choiceHw;
			System.out.println();
			do {
				System.out.print("Chọn Homework (1, 2, 3, 4, 5, 6): ");
				choiceHw = sc.nextInt();
			} while ((choiceHw < 1) || (choiceHw > 6));
			switch (choiceHw) {
				case 1:
					System.out.println("Homework 1: " 
							+ "\n1.SquarePattern" 
							+ "\n2.CheckerPattern"
							+ "\n3.TimeTable"
							+ "\n4.TriangularPattern"
							+ "\n5.BoxPattern"
							+ "\n6.HillPattern"
							+ "\n7.Factorial"
							+ "\n8.ReverseString"
							+ "\n9.CountVowelsDigits"
							+ "\n10.PhoneKeyPad"
							+ "\n11.Caesar’s Code"
							+ "\n12.Decipher Caesar’s Code"
							+ "\n13.Exchange Cipher"
							+ "\n14.TestPalindromicPhrase"
							+ "\n15.CheckHexStr"
							+ "\n16.Bin2Dec"
							+ "\n17.Hex2Dec"
							+ "\n18.Oct2Dec"
							+ "\n19.RadixN2Dec");
					System.out.println();
					do {
						System.out.print("Chọn homework number: ");
						choiceHwNumber = sc.nextInt();
					} while ((choiceHwNumber < 1) || (choiceHwNumber > 19));
					switch (choiceHwNumber) {
						case 1:
							hw1.src.squarepattern.SquarePattern.main(args);
							break;
						case 2:
							hw1.src.checkerpattern.CheckerPattern.main(args);
							break;
						case 3:
							hw1.src.timetable.TimeTable.main(args);
							break;
						case 4:
							hw1.src.triangularpatternx.TriangularPatternX.main(args);
							break;
						case 5:
							hw1.src.boxpatternx.BoxPatternX.main(args);							
							break;
						case 6:
							hw1.src.hillpattern.HillPattern.main(args);
							break;
						case 7:
							hw1.src.factorial.Factorial.main(args);
							break;
						case 8:
							hw1.src.reversestring.ReverseString.main(args);
							break;
						case 9:
							hw1.src.countvowelsdigits.CountVowelsDigits.main(args);
							break;
						case 10:
							hw1.src.phonekeypad.PhoneKey_Pad.main(args);
							break;
						case 11:
							hw1.src.caesarcode.CaesarCode.main(args);
							break;
						case 12:
							hw1.src.deciphercaesarcode.DecipherCaesarCode.main(args);
							break;
						case 13:
							hw1.src.exchangecipher.ExchangeCipher.main(args);
							break;
						case 14:
							hw1.src.testpalindromicphrase.TestPalindromicPhrase.main(args);
							break;
						case 15:
							hw1.src.checkhexstr.CheckHexStr.main(args);
							break;
						case 16:
							hw1.src.bin2dec.Bin2Dec.main(args);
							break;
						case 17:
							hw1.src.hex2dex.Hex2Dec.main(args);
							break;
						case 18:
							hw1.src.oct2dec.Oct2Dec.main(args);
							break;
						case 19:
							hw1.src.radixn2dec.RadixN2Dec.main(args);
							break;
					}
				break;
				case 2:
					System.out.println("Homework 2: " 
							+ "\n1.Matrices (2D Arrays)" 
							+ "\n2.Trigonometric Series"
							+ "\n3.Exponential Series"
							+ "\n4.FactorialInt (Handling Overflow)"
							+ "\n5.FibonacciInt (Handling Overflow)"
							+ "\n6.Number System Conversion"
							+ "\n7.NumberGuess"
							+ "\n8.WordGuess"
							+ "\n9.Recursion"
							+ "\n10.Linear Search"
							+ "\n11.Recursive Binary Search"
							+ "\n12.Bubble Sort"
							+ "\n13.Selection Sort"
							+ "\n14.Insertion Sort"
							+ "\n15.Perfect and Deficient Numbers"
							+ "\n16.Prime Numbers"
							+ "\n17.Prime Factors"
							+ "\n18.Greatest Common Divisor (GCD)");
					System.out.println();
					do {
						System.out.print("Chọn homework number: ");
						choiceHwNumber = sc.nextInt();
					} while ((choiceHwNumber < 1) || (choiceHwNumber > 18));
					switch (choiceHwNumber) {
						case 1:
							hw2.src.Matrix.main(args);					
							break;
						case 2:
							hw2.src.TrigonometricSeries.main(args);
							break;
						case 3:
							hw2.src.SpecialSeries.main(args);
							break;
						case 4:
							hw2.src.FactorialInt.main(args);
							break;
						case 5:
							hw2.src.FibonacciInt.main(args);
							break;
						case 6:
							hw2.src.NumberConversion.main(args);
							break;
						case 7:
							hw2.src.NumberGuess.main(args);
							break;
						case 8:
							hw2.src.WorkGuess.main(args);
							break;
						case 9:
							hw2.src.Recusive.main(args);
							break;
						case 10:
							hw2.src.LinearSearch.main(args);
							break;
						case 11:
							hw2.src.BinarySearch.main(args);
							break;
						case 12:
							hw2.src.BubbleSort.main(args);
							break;
						case 13:
							hw2.src.SelectionSort.main(args);
							break;
						case 14:
							hw2.src.InsertionSort.main(args);
							break;
						case 15:
							hw2.src.PerfectNumberList.main(args);
							break;
						case 16:
							hw2.src.PrimeList.main(args);
							break;
						case 17:
							hw2.src.PerfectPrimeFactorList.main(args);
							break;
						case 18:
							hw2.src.GreatestCommonDivisor.main(args);
							break;
					}
				break;
				case 3:
					System.out.println("Homework 3: " 
							+ "\n1.The Circle Class" 
							+ "\n2.The Rectangle Class"
							+ "\n3.The Employee Class"
							+ "\n4.The InvoiceItem Class"
							+ "\n5.The Account Class"
							+ "\n6.The Date Class"
							+ "\n7.The Time Class"
							+ "\n8.The Ball Class"
							+ "\n9.The Author and Book Classes"
							+ "\n10.(Advanced) The Author and Book Classes Again"
							+ "\n11.The Customer and Invoice classes"
							+ "\n12.The Customer and Account classes"
							+ "\n13.The MyPoint Class"
							+ "\n14.The MyLine and MyPoint Classes"
							+ "\n15.The MyTriangle and MyPoint Classes"
							+ "\n16.The MyCircle and MyPoint Classes"
							+ "\n17.The MyRectangle and MyPoint Classes");
					System.out.println();
					do {
						System.out.print("Chọn homework number: ");
						choiceHwNumber = sc.nextInt();
					} while ((choiceHwNumber < 1) || (choiceHwNumber > 17));
					switch (choiceHwNumber) {
						case 1:
							hw3.src.circle.TestMain.main(args);
							break;
						case 2:
							hw3.src.rectangle.TestMain.main(args);
							break;
						case 3:
							hw3.src.employee.TestMain.main(args);
							break;
						case 4:
							hw3.src.invoiceItem.TestMain.main(args);
							break;
						case 5:
							hw3.src.account.TestMain.main(args);
							break;
						case 6:
							hw3.src.date.TestMain.main(args);
							break;
						case 7:
							hw3.src.time.TestMain.main(args);
							break;
						case 8:
							hw3.src.ball.TestMain.main(args);
							break;
						case 9:
							hw3.src.author_book.TestMain.main(args);
							break;
						case 10:
							hw3.src.advanced_author_book.TestBookAdvanced.main(args);
							break;
						case 11:
							hw3.src.customer_invoice.TestMain.main(args);
							break;
						case 12:
							hw3.src.customer_account.TestMain.main(args);
							break;
						case 13:
							hw3.src.mypoint_shapes.TestMyPoint.main(args);
							break;
						case 14:
							hw3.src.mypoint_shapes.TestMyLine.main(args);
							break;
						case 15:
							hw3.src.mypoint_shapes.TestMyTriangle.main(args);
							break;
						case 16:
							hw3.src.mypoint_shapes.TestMyCircle.main(args);
							break;
						case 17:
							hw3.src.mypoint_shapes.TestMyRectangle.main(args);
							break;						
					}
				break;
				case 4:
					System.out.println("Homework 4: " 
							+ "\n1.The MyComplex class" 
							+ "\n2.The MyPolynomial Class"
							+ "\n3.The BigInteger Class"
							+ "\n4.The MyTime Class"
							+ "\n5.The MyDate Class"
							+ "\n6.Ball and Container Classes");
					System.out.println();
					do {
						System.out.print("Chọn homework number: ");
						choiceHwNumber = sc.nextInt();
					} while ((choiceHwNumber < 1) || (choiceHwNumber > 7));
					switch (choiceHwNumber) {
						case 1:
							hw4.src.mycomplex.TestMain.main(args);
							break;
						case 2:
							hw4.src.mypolynomial.TestMain.main(args);
							break;
						case 3:
							hw4.src.biginteger.TestBigInteger.main(args);
							break;
						case 4:
							hw4.src.mytime.TestMain.main(args);
							break;
						case 5:
							hw4.src.mydate.TestMain.main(args);
							break;
						case 6:
							hw4.src.ball.TestMain.main(args);
							break;						
					}
				break;
				case 5:
					System.out.println("Homework 5: " 
							+ "\n1.The Circle and Cylinder Classes" 
							+ "\n2.Superclass Person and its subclasses"
							+ "\n3.Point2D and Point3D"
							+ "\n4.Superclass Shape and its subclasses"
							+ "\n5.Superclass Animal and its subclasses"
							+ "\n6.The Point and Line Classes"
							+ "\n7.The Circle and Cylinder Classes Using Composition");
					System.out.println();
					do {
						System.out.print("Chọn homework number: ");
						choiceHwNumber = sc.nextInt();
					} while ((choiceHwNumber < 1) || (choiceHwNumber > 7));
					switch (choiceHwNumber) {
						case 1:
							hw5.src.cylinder.TestMain.main(args);
							break;
						case 2:
							hw5.src.person.TestMain.main(args);
							break;
						case 3:
							hw5.src.point3d.TestMain.main(args);
							break;
						case 4:
							hw5.src.shape.TestMain.main(args);
							break;
						case 5:
							hw5.src.animal.TestMain.main(args);
							break;
						case 6:
							hw5.src.line.TestMain.main(args);
							break;
						case 7:
							hw5.src.cylinder2.TestMain.main(args);
							break;						
					}
				break;
				case 6:
					System.out.println("Homework 6: " 
							+ "\n1.Abstract Superclass Shape" 
							+ "\n2.GeometricObject Interface"
							+ "\n3.Movable Interface and MovablePoint"
							+ "\n4.Movable Interface and MovableCircle"
							+ "\n5.Interfaces Resizable and GeometricObject"
							+ "\n6.Abstract Superclass Animal"
							+ "\n7.Movable Interface and MovableRectangle");
					System.out.println();
					do {
						System.out.print("Chọn homework number: ");
						choiceHwNumber = sc.nextInt();
					} while ((choiceHwNumber < 1) || (choiceHwNumber > 7));
					switch (choiceHwNumber) {
						case 1:
							hw6.src.shape.TestMain.main(args);
							break;
						case 2:
							hw6.src.geometricobject.TestMain.main(args);
							break;
						case 3:
							hw6.src.movable.TestMovablePoint.main(args);
							break;
						case 4:
							hw6.src.movable.TestMovablePoint.main(args);
							break;
						case 5:
							hw6.src.resizable.TestResizableCircle.main(args);
							break;
						case 6:
							hw6.src.animal.TestMain.main(args);
							break;
						case 7:
							hw6.src.movable.TestMovableRectangle.main(args);
							break;						
					}
				break;
			}
		break;
		case 2:
			int choiceLab;
			do {
				System.out.print("Chọn Lab (1, 2): ");
				choiceLab = sc.nextInt();
			} while ((choiceLab < 1) || (choiceLab > 2));
			switch (choiceLab) {
			case 1:
				System.out.println("Lab 1: " 
						+ "\n1.CheckPassFail" 
						+ "\n2.CheckOddEven"
						+ "\n3.PrintNumberInWord"
						+ "\n4.PrintDayInWord"
						+ "\n5.SumAverageRunningInt"
						+ "\n6.HarmonicSum"
						+ "\n7.ComputePI"
						+ "\n8.Fibonacci"
						+ "\n9.Tribonacci"
						+ "\n10.ExtractDigits"
						+ "\n11.SumProductMinMax3"
						+ "\n12.SumProductMinMax5"
						+ "\n13.CircleComputation"
						+ "\n14.SphereComputation"
						+ "\n15.CylinderComputation"
						+ "\n16.PensionContributionCalculator"
						+ "\n17.PensionContributionCalculatorWithSentinel"
						+ "\n18.ReverseInt"
						+ "\n19.InputValidation"
						+ "\n20.AverageWithInputValidation");
				System.out.println();
				do {
					System.out.print("Chọn lab number: ");
					choiceHwNumber = sc.nextInt();
				} while ((choiceHwNumber < 1) || (choiceHwNumber > 20));
				switch (choiceHwNumber) {
					case 1:
						lab1.src.CheckPassFail.main(args);
						break;
					case 2:
						lab1.src.CheckOddEven.main(args);
						break;
					case 3:
						lab1.src.PrintNumberInWord.main(args);
						break;
					case 4:
						lab1.src.PrintDayInWord.main(args);
						break;
					case 5:
						lab1.src.SumAverageRunningInt.main(args);
						break;
					case 6:
						lab1.src.HarmanicSum.main(args);
						break;
					case 7:
						lab1.src.ComputePI.main(args);
						break;
					case 8:
						lab1.src.Fibonacci.main(args);
						break;
					case 9:
						lab1.src.Tribonacci.main(args);
						break;
					case 10:
						lab1.src.ExtractDigits.main(args);
						break;
					case 11:
						lab1.src.SumProductMinMax3.main(args);
						break;
					case 12:
						lab1.src.SumProductMinMax5.main(args);
						break;
					case 13:
						lab1.src.CircleComputation.main(args);
						break;
					case 14:
						lab1.src.SphereComputation.main(args);
						break;
					case 15:
						lab1.src.CylinderComputation.main(args);
						break;
					case 16:
						lab1.src.PensionContributionCalculator.main(args);
						break;
					case 17:
						lab1.src.PensionContributionCalculatorWithSentinel.main(args);
						break;
					case 18:
						lab1.src.ReverseInt.main(args);
						break;
					case 19:
						lab1.src.InputValidation.main(args);
						break;
					case 20:
						lab1.src.AverageWithInputValidation.main(args);
						break;
				}
			break;
			case 2:
				System.out.println("Lab 2: " 
						+ "\n1.PrintArray" 
						+ "\n2.PrintArrayInStars"
						+ "\n3.GradesStatistics"
						+ "\n4.Hex2Bin"
						+ "\n5.Dec2Hex"
						+ "\n6.Exponent"
						+ "\n7.MagicSum"
						+ "\n8.arrayToString"
						+ "\n9.Contains"
						+ "\n10.Search"
						+ "\n11.Equals"
						+ "\n12.CopyOf"
						+ "\n13.Swap"
						+ "\n14.Reverse"
						+ "\n15.GradesStatistics2"
						+ "\n16.GradesHistogram");
				System.out.println();
				do {
					System.out.print("Chọn lab number: ");
					choiceHwNumber = sc.nextInt();
				} while ((choiceHwNumber < 1) || (choiceHwNumber > 16));
				switch (choiceHwNumber) {
					case 1:
						lab2.src.PrintArray.main(args);
						break;
					case 2:
						lab2.src.PrintArrayInStars.main(args);
						break;
					case 3:
						lab2.src.GradesStatistics.main(args);
						break;
					case 4:
						lab2.src.Hex2Bin.main(args);
						break;
					case 5:
						lab2.src.Dec2Hex.main(args);
						break;
					case 6:
						lab2.src.Exponent.main(args);
						break;
					case 7:
						lab2.src.MagicSum.main(args);
						break;
					case 8:
						lab2.src.Array2String.main(args);
						break;
					case 9:
						lab2.src.ContainsArray.main(args);
						break;
					case 10:
						lab2.src.SearchArray.main(args);
						break;
					case 11:
						lab2.src.EqualsArray.main(args);
						break;
					case 12:
						lab2.src.CopyOfArray.main(args);
						break;
					case 13:
						lab2.src.SwapArray.main(args);
						break;
					case 14:
						lab2.src.ReverseArray.main(args);
						break;
					case 15:
						lab2.src.GradesStatistics2.main(args);
						break;
					case 16:
						lab2.src.GradesHistogram.main(args);
						break;					
				}
			break;
			}
		break;
		}
		sc.close();
	}
}
