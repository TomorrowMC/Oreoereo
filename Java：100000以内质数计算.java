//获取当前时间距离1970-01-0100:00:00的毫秒数
long start = System.currentTimeMillis();
label:for(int i =2;i<=100000;i++){//遍历100000以内的自然数
	for(int j =2;j <= Math.sqrt(i);j++){  //j:被i去除，这里使用开方的话可以有效减少计算
		if(i%j== 0){  //i被j除尽
			continue label;
		}//能执行到此步骤的，都是质数
		count++;    
//获取当前时间距离1970-01-8100:00:00的毫秒数
long end = System.currentTimeMillis();
System.out println("质数的个数为:”+ count);
System.out. println("所花费的时间为:”+(end - start));//17110-优化一:break:1546-优化二:13
