

   class SubClass extends BaseClass
   {

    SubClass()
    {
     x = 10;
     y = 3;
    }

    public int perimeter(int x,int y)
    {
      this.x=x;
      this.y=y;
      return 2*(x+y);
    }

   public void perimeter()
    {
     System.out.println("Perimeter of rectangle"+perimeter(x,y));
    }
  }