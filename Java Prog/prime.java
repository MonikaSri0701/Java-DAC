class Prime{
    public static void main(String ar[]) {
        
int c=0,n=0,i=1,j=1;  
	while(n<25)  {  
	j=1;  
	c=0;  
		while(j<=i)  {  
	if(i%j==0)  
		c++;  
		j++;   
}  
	if(c==2)  {  
		System.out.print(i);  
		n++;  
}  
		i++;  
}    
	}  
}  

