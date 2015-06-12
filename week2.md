#HOMEWORK
###steps
- 班上有10名学生
- 计算他们的成绩（和，平均数，中位数）
###需要的知识点
- 输入模块
- 定义10个变量
- 平均数，中位数函数

##教程
###STEPS
####第一次尝试
- 尝试输入模块SCANNER
- 参考   [输入值（百度知道）](http://zhidao.baidu.com/question/54358038.html)
- 第一次用打进中文Input, java compiler不识别
- 将输入换成英文，成功。
- 代码：

'

	public static void main(Strings[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10]; 
		for (int input = 0; input < num.length; input++)
		{
			System.out.print("Please input number" + (input + 1) + "grade");
			num[input] = sc.nextInt();
		}
	}
'
####第二次尝试
- 尝试找出10个数的和
- 参考  [找和（百度知道）](http://zhidao.baidu.com/link?url=VmRMK8iZoUi8D_3Fmkm49dBR-jx2_LfmABFIeczu_iFKbDBbIIWBtHcMrA-baiUSZc2_1HS6BfNuiVSwyQ_uBK)
- 失败
####第三次尝试
- 继续尝试找出10个数的和
- 参考   [Adding Values in a for loop](http://stackoverflow.com/questions/3935498/adding-values-in-a-for-loop)
- 尝试失败，算出的数字不对，程序应该有误
- 代码：

'

	public static void main(Strings[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10]; 
		for (int input = 0; input < num.length; input++)
		{
			System.out.print("Please input number" + (input + 1) + "grade");
			num[input] = sc.nextInt();
			int sum = 0;

			for (int run=1; run<=num[input]; run=run+1)
			{
				System.out.print(run + "");
				sum = sum + run;
				{
					System.out.println("The sum is: " + sum);
				}
			}
		}
	}
'

####第四次尝试
- 尝试做出平均数和总和
- 参考 [How to put scanner into array](http://stackoverflow.com/questions/2795350/how-to-put-a-scanner-input-into-an-array-for-example-a-couple-of-numbers)
- 成功
- 代码：

'

	public static void main(Strings[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10]; 
		int sum = 0;
		int average = 0;

		for (int input = 0; input < num.length; input++)
		{
			System.out.print("Please input number" + (input + 1) + "grade");
			num[input] = sc.nextInt();
			sum=sum+num[input];
			{
				average=sum/10;
				System.out.println("Average="+average);
				System.out.println("sum="+sum);
			}
		}
	}
'
####第五次尝试 
- 尝试加入中位数
- 参考网站： [how to calculate the median of an array](http://stackoverflow.com/questions/11955728/how-to-calculate-the-median-of-an-array)
- 尝试貌似成功了
- 大家可以检验一下，不保证100%正确率
- 代码：

'

	public static void main(Strings[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10]; 
		int sum = 0;
		int average = 0;

		for (int input = 0; input < num.length; input++)
		{
			System.out.print("Please input number" + (input + 1) + "grade");
			num[input] = sc.nextInt();
			sum=sum+num[input];
			Arrays.sort(num);
			double median;
			if (num.length % 2 ==0)
				median = ((double)num[num.length/2]+(double)num[num.length/2-1])/2;
			else
				median = (double)num[num.length/2];
			
			{
				average=sum/10;
				System.out.println("Average="+average);
				System.out.println("sum="+sum);
				System.out.println("Median="+median);
			}
		}
	}
'

###THE END