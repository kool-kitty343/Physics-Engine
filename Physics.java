public class Physics
  {
    double distance;
    double XYangle;
    double Zangle;

    int current;
    int other;

    Particle Current = new Particle();
    Particle Other = new Particle();
    boolean shutdown = false;
    public void Physics()
    {
      while(!shutdown)
      {
        for (current = 1; current <= 123; current++)
        {
          //set current particle

          for (other = 1; other <= 123; other++)
          {
            //set other particle

            calcDistanceAndAngle();
            calcGravity();
            calcElectromagnetism();



          }
        }
      }
    }
    private void calcDistanceAndAngle()
    {
      double DeltaX = Other.getX() - ;
      double DeltaY = ;
      double DeltaZ = ;
    }
    private void calcGravity()
    {
      
    }
    private void calcElectromagnetism()
    {

    }
  }
