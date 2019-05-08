package Principal1;

public class FormulasTrapecio {
    public FormulasTrapecio(){
    }
    
    public double AX(int b, int a, int n){  
        return (double) (b-a)/n;
    }
    
    public double[] funcion(double Xi[], int a, int n){
        double f[];
        f=new double[n+1];
        
        for(int i=0;i<=n;i++){          
                f[i]=Math.pow(Xi[i], 2);  //funcion   
        }
        return f;
    }
    
    public double[] XI(int a, double Ax, int n){
        double acum[];
        double sum=0;
        acum=new double[n+1];
        
        for(int i=0;i<=n;i++){
            if(i==0){
                sum+=a;
                acum[i]=sum;
            }
            else{
                sum+=Ax;
                acum[i]=sum;
            }               
        }
        return  acum;     
    }
    
    public int[] K( int n){
        int Ki[];
        Ki=new int[n+1];
        
        for(int i=0;i<=n;i++){
            
            if(i==0)
                Ki[i]=1;
            else if(i==n)
                Ki[i]=1;
            else
                Ki[i]=2;            
        }
        return Ki;
    }
    
    public double[] Kfuncion(int Ki[],double f[], int n){
        double K_f[];
        K_f=new double[n+1];
        
        for(int i=0;i<=n;i++){
            K_f[i]=f[i]* Ki[i];
        }
        return K_f;
    }
    
    public double Suma(double K_f[], int n){
        double sum=0;
        for(int i=0;i <=n;i++){
            sum+=K_f[i];
        }
        return sum;
    }
    
    public double Resul(double Ax,double suma){
        
        return (double) (Ax*suma)/2;
    }
}
