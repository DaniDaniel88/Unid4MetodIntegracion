
package Principal1;

public class FormmulasSimpson {
    
    public double AnchoS(int b, int a, int nIterraciones)
    {  
         return (double) (b-a)/nIterraciones;
        
    }
    
    public double[] FuncionPreterminada(double Xn[], int a, int n){
        double f[] = new double[n+1];
        
        for(int i=0;i<=n;i++)
        {          
                f[i]=Math.PI*(Math.pow(1+(Math.pow(Xn[i], 2)/2),2));
        }
        return f;
    }
    
    public double[] XAumento(int a, double Ax, int n){
        double acum[] =new double[n+1];
        
        
        for(int i=0;i<=n;i++)
        {
            if(i==0){
                
                acum[i]=a;
            }
            else{
                
                acum[i]=Ax*i;
            }               
        }
        return  acum;     
    }
    
    public int[] MultiploFuncion( int n)
    {
        int Ki[] = new int[n+1];
        
        for(int i=0;i<=n;i++)
        {
            
            if(i==0){
                Ki[i]=1;
            }else if(i==n){
                Ki[i]=1;
            }else if(i%2==0){
                Ki[i]=2;
            }else if(i%2!=0 && i!=0 && i!=n){
                Ki[i]=4;
            }
        }
        return Ki;
    }
    
    public double[] K_funcion(int Ki[],double f[], int n){
        double K_f[] = new double[n+1];
        
        for(int i=0;i<=n;i++){
            K_f[i]=f[i]* Ki[i];
        }
        return K_f;
    }
    
    public double SumaFunciones(double K_f[], int n){
        double sum=0;
        for(int i=0;i <=n;i++){
            sum+=K_f[i];
        }
        return sum;
    }
    
    public double resultadoFinal(double Ax,double suma){
        
        return (double) (Ax/3)*suma;
    }
    
}
