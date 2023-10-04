class Main {
  public static void main(String[] args) {
    int arr[]={-2,-3,4,-1,-2,1,5,-3};
    //Deals with the basic array questions
    System.out.println("Pairs in an Array!")
    for(int i=0;i<arr.length;i++)
    {
      int curr=arr[i];
      for(int j=i+1;j<arr.length;j++) 
      {
         System.out.println(curr+","+arr[j]);
      }
    }

    System.out.println("Reverse an Array!");
    for(int i=arr.length-1;i>=0;i--)
    {
       System.out.println(arr[i]);
    }

    System.out.println("Rotate an Array!");
    int arro[]={1,2,3,4,5,6,7};
    int k=3;
    reverse(arro,0,arro.length-1);
    reverse(arro, 0, k-1);
    reverse(arro, k, arr.length-1);
    for(int i=0;i<arro.length;i++)
    {
      System.out.println(arro[i]);
    }

    System.out.println("Sub-Array!");
    for(int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
        for(int k=i;k<j;k++){
            System.out.println(arr[k]+" ");
          }
      }
    }

    System.out.println("Kadanes Algorithm!");
    int ms=Integer.MIN_VALUE;
    int cs=0;
    for(int i=0;i<arr.length;i++)
      {
        cs=cs+arr[i];
        if(cs<0)
        {
          cs=0;
        }
        ms=Math.max(cs,ms);
      }
    System.out.println(ms);

    System.out.println("Trapping the rainwater!");
    int height[]={1,2,5,3,4,2,1};
    int n=height.length;
    int leftmax[]=new int[n];
    int rightmax[]=new int[n];

    //Traversing straight
    leftmax[0]=height[0];
    for(int i=1;i<height.length;i++)
    {
      leftmax[i]=Math.max(height[i],leftmax[i-1]); 
    } 

    //Reverse value
    for(int i=n-2;i>=0;i--)
    {
       rightmax[i]=Math.max(height[i],rightmax[i+1]);
    }

    int trappedwater=0;
    int water_level=0;
    for(int i=0;i<n;i++)
      {
        water_level=Math.min(leftmax[i],rightmax[i]);
        trappedwater+=water_level-height[i];
      }
    System.out.println(trappedwater);


    System.out.println("Buy and Sell Price");
    int prices[]={1,2,3,22,-3};
    int bp=Integer.MAX_VALUE;
    int maxprofit=0;
    for(int i=0;i<prices.length;i++)
      {
        if(bp<prices[i])
        {
          int profit=prices[i]-bp;
          maxprofit=Math.max(profit,maxprofit);
        }
        else{
          bp=prices[i];
        }
      }
    System.out.println(maxprofit);
    
      
  }
  public static void reverse(int[] nums,int start,int end)
  {
     while(start<=end)
     {
          int temp=nums[start];
          nums[start]=nums[end];
          nums[end]=temp;
          start++;
          end--;
      }
  }
}
