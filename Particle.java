public class Particle
{
    double X;
    double Y;
    double Z;
    double Mass;
    ///////////////////////////
    public void Particle(){}
    public void Particle(double X, double Y, double Z, double Mass)
    {
        Update(X, Y, Z, Mass);
    }
    public void Update(double X, double Y, double Z, double Mass)
    {
        this.X = X;
        this.Y = Y;
        this.Z = Z;
        this.Mass = Mass;
    }
    ///////////////////////////
    public double getY(){return Y;}
    public double getZ(){return Z;}
    public double getMass(){return Mass;}

}
