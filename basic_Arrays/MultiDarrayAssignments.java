package basic_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDarrayAssignments {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		MultiDarrayAssignments mda=new MultiDarrayAssignments();
		//
		sumOfArray(scanner);
		mda.addArray(scanner);
		arraySquares(scanner);
		mda.commonElementsInArray(scanner);
		oneZero(scanner);
		mda.transposeMatrix(scanner);
		scanner.close();
	}
	//
	public static void sumOfArray(Scanner scanner) {
		System.out.println("Enter number of rows :");
		int rows=scanner.nextInt();
		int[][] a=new int[rows][];
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter number of columns of : "+i);
			int columns=scanner.nextInt();
			a[i]=new int[columns];
			System.out.println(i+" column values :");
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=scanner.nextInt();
			}
			System.out.println();
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		/***/
		int sum=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				sum+=a[i][j];
			}
		}
		System.out.println("Array sum : "+sum);
	}
	//
	public void addArray(Scanner scanner) {
		System.out.println("Enter number of rows in Array1 :");
		int row1=scanner.nextInt();
		int[][] a1=new int[row1][];
		for(int i=0; i<a1.length; i++) {
			System.out.println("Enter the number of columns of : "+i);
			int column1=scanner.nextInt();
			a1[i]=new int[column1];
			System.out.println("Enter the values :");
			for(int j=0; j<a1[i].length; j++) {
				a1[i][j]=scanner.nextInt();
			}
			System.out.println();
		}
		System.out.println("Output1 :");
		for(int i=0; i<a1.length; i++) {
			System.out.println(Arrays.toString(a1[i]));
		}
		/*//*/
		System.out.println("Enter number of rows in Array2 :");
		int row2=scanner.nextInt();
		int[][] a2=new int[row2][];
		for(int i=0; i<a2.length; i++) {
			System.out.println("Enter the number of columns of : "+i);
			int column2=scanner.nextInt();
			a2[i]=new int[column2];
			System.out.println("Enter the values :");
			for(int j=0; j<a2[i].length; j++) {
				a2[i][j]=scanner.nextInt();
			}
			System.out.println();
		}
		System.out.println("Output2 :");
		for(int i=0; i<a2.length; i++) {
			System.out.println(Arrays.toString(a2[i]));
		}
		/***/
		int[][] a3=new int[a1.length][];
		for(int i=0; i<a1.length; i++) {
			a3[i]=new int[a1.length];
			for(int j=0; j<a1[i].length; j++) {
				a3[i][j]=a1[i][j]+a2[i][j];
			}
		}
		System.out.println("Sum of Array1 and Array2 :");
		for(int i=0; i<a3.length; i++) {
			System.out.println(Arrays.toString(a3[i]));
		}
	}
	//
	public static void arraySquares(Scanner scanner) {
		System.out.println("Enter the number of rows in an array :");
		int rows=scanner.nextInt();
		int[][] as=new int[rows][];
		for(int i=0; i<as.length; i++) {
			System.out.println("Enter the number of columns in row : "+i);
			int column=scanner.nextInt();
			as[i]=new int[column];
			System.out.println("Enter the inputs :");
			for(int j=0; j<as[i].length; j++) {
				as[i][j]=scanner.nextInt();
			}
			System.out.println();
		}
		System.out.println("Input :");
		for(int i=0; i<as.length; i++) {
			System.out.println(Arrays.toString(as[i]));
		}
		/***/
		int[][] aso=new int[as.length][];
		for(int i=0; i<as.length; i++) {
			aso[i]=new int[as.length];
			for(int j=0; j<as[i].length; j++) {
//				aso[i][j]=as[i][j]*as[i][j];
				aso[i][j]=(int) Math.pow(as[i][j], 2);
			}
		}
		System.out.println("Square of an array :");
		for(int i=0; i<aso.length; i++) {
			System.out.println(Arrays.toString(aso[i]));
		}
	}
	//
	public void  commonElementsInArray(Scanner scanner) {
		System.out.printf("Enter the number of rows in Array1 : ");
		int row1=scanner.nextInt();
		int[][] a1=new int[row1][];
		for(int i=0; i<a1.length; i++) {
			System.out.printf("Enter number of columns in row : "+i+" is ");
			int column1=scanner.nextInt();
			a1[i]=new int[column1];
			System.out.println("Enter the inputs :");
			for(int j=0; j<a1[i].length; j++) {
				a1[i][j]=scanner.nextInt();
			}
			System.out.printf("");
		}
		System.out.println("Input-1 :");
		for(int i=0; i<a1.length; i++) {
			System.out.println(Arrays.toString(a1[i]));
		}
		/*//*/
		System.out.printf("Enter the number of rows in Array2 : ");
		int row2=scanner.nextInt();
		int[][] a2=new int[row2][];
		for(int i=0; i<a2.length; i++) {
			System.out.printf("Enter number of columns in row : "+i+" is ");
			int column2=scanner.nextInt();
			a2[i]=new int[column2];
			System.out.println("Enter the inputs :");
			for(int j=0; j<a2[i].length; j++) {
				a2[i][j]=scanner.nextInt();
			}
			System.out.printf("");
		}
		System.out.println("Input-2 :");
		for(int i=0; i<a2.length; i++) {
			System.out.println(Arrays.toString(a2[i]));
		}
		/***/
		boolean isFound=false;
		for(int i=0; i<a1.length; i++) {
			for(int j=0; j<a1[i].length; j++) {
				int targetElement=a1[i][j];
				for(int k=0; k<a2.length; k++) {
					isFound=false;
					for(int l=0; l<a2[k].length; l++) {
						if(targetElement==a2[k][l]) {
							System.out.printf(targetElement+" ");
							isFound=true;
							break;
						}
					}
					if(isFound)
						break;
				}
			}
		}
	}
	//
	public static void oneZero(Scanner scanner) {
		System.out.printf("Enter number of rows in array-1 : ");
		int row1=scanner.nextInt();
		int[][] a=new int[row1][];
		for(int i=0; i<a.length; i++) {
			System.out.printf("Enter number of columns in row : "+i+" is ");
			int column1=scanner.nextInt();
			a[i]=new int[column1];
			System.out.println("Enter the inputs : ");
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Input-1 :");
		for(int i=0; i<a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		/*//*/
		System.out.printf("Enter the number of rows in array-2 : ");
		int row2=scanner.nextInt();
		int[][] b=new int[row2][];
		for(int i=0; i<b.length; i++) {
			System.out.printf("Enter number of columns in row : "+i+" is ");
			int column2=scanner.nextInt();
			b[i]=new int[column2];
			System.out.println("Enter the inputs : ");
			for(int j=0; j<b[i].length; j++) {
				b[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Input-2 :");
		for(int i=0; i<b.length; i++) {
			System.out.println(Arrays.toString(b[i]));
		}
		/***/
		int[][] c=new int[a.length][];
		for(int i=0; i<a.length; i++) {
			c[i]=new int[a[i].length];
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j]==b[i][j])
					c[i][j]=1;
				else
					c[i][j]=0;
			}
		}
		System.out.println("Output :");
		for(int i=0; i<c.length; i++) {
			System.out.println(Arrays.toString(c[i]));
		}
	}
	//
	public void transposeMatrix(Scanner scanner) {
		System.out.printf("Enter the number of rows in an array : ");
		int rows=scanner.nextInt();
		int[][] a=new int[rows][];
		for(int i=0; i<a.length; i++) {
			System.out.printf("Number of columns of row : "+i+" is ");
			int column=scanner.nextInt();
			a[i]=new int[column];
			System.out.println("Enter inputs : ");
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=scanner.nextInt();
			}
			System.out.printf("");
		}
		System.out.println("Input :");
		for(int i=0; i<a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		/***/
		int[][] at=new int[a.length][];
		for(int i=0; i<a.length; i++) {
			at[i]=new int[a[i].length];
			for(int j=0; j<a[i].length; j++) {
				at[i][j]=a[j][i];
			}
		}
		System.out.println("Output : Transpose matrix :-");
		for(int i=0; i<at.length; i++) {
			System.out.println(Arrays.toString(at[i]));
		}
	}
	//
}
