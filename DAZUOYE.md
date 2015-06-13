#Guess Number
##Steps
- Range: 0-100
- Choose a random number using computer
- Guess and input a number
- The computer will tell you whether it's wrong or not and if it's higher or not.
- Restrict turns you can guess 

##Tutor
###Steps
- 系统：获取随机数，输入输出模块，判断模块，记录次数模块
- 输入输出模块：菜单，提示，评价
- 菜单：开始游戏，结束游戏
- 判断模块：数字判断，水平判断，选择判断
###需要解决的问题：

####输入

#####step 1
- 百度了“java输入”，找到了Scanner类 [Scanner用法](file:///C:/Users/Hailey/Desktop/%E5%AD%A6%E4%B9%A0%E7%AC%94%E8%AE%B0%EF%BC%884%EF%BC%89_java%E4%B8%ADScanner%E7%9A%84%E7%94%A8%E6%B3%95%20-%20%E5%B9%BF%E5%9C%9F%E5%AD%90%E7%9A%84%E4%B8%93%E6%A0%8F%20-%20%E5%8D%9A%E5%AE%A2%E9%A2%91%E9%81%93%20-%20CSDN.NET.html)
- 做了第一次尝试，

'

	public static void main(Strings[] args)
	{
		System.out.println("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextlnt();
		if(number1 > 50)
		{
			System.out.println("True");
		}
	}
'
- 尝试结果：失败； 
	- 原因：没有看清楚up主写的是错的。
#####step 2
- 第二次尝试失败，因为string"s"拼写错误。
- 注意文件名不能和已知或者已定义的名字重复。
- 第二次尝试成功！！

'

	public static void main(Strings[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please input a number: ");
		int number = in.nextInt();
		System.out.println(number);
	}
'
#####step 3
- 第三次尝试写代码，共用了Random和scanner和While函数
- 参考 [Java-made-easy-GuessNumber](http://www.java-made-easy.com/guessing-game.html)
- 第三次尝试成功
- 代码如下：

'

	public static void main(Strings[] args)
	{
		Random read = new Random();
		int numberToGuess = read.nextInt(100);
		int numberOfTries = 0;
		Scanner input = new Scanner(System.in);
		int guess;
		boolean win = false;

		while (win == false)
		{
			System.out.println("Guess a number between 1 and 100: ");
			guess = input.nextInt();
			numberOfTries++;

			if (guess == numberToGuess){
				win = true;
			}
			else if (guess < numberToGuess){
			System.out.println("Your guess is too low");
			}
			else if (guess > numberToGuess){
				System.out.println("Your guess is too high");
			}
		}    

		System.out.println("You win!");
		System.out.println("The number was"+numberToGuess);
		System.out.println("It took you"+numberOfTries+"tries");
	}
'



###refer
[java如何生成随机数](http://jingyan.baidu.com/article/bad08e1e836a8609c85121ef.html)

[猜数字Java程序代码](http://wenku.baidu.com/link?url=DFmGdEUE0xrrO0i32U0VJureAVk8OJByqrvH_onROAuijcXVPnOLCW0-Bh5UbozGDCa3rc2TpoM2eV9Yyg__w0HN8RIBuWHii2SjQ89tYDK)


##THE END