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