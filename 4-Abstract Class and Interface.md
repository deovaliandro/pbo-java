## Abstract method vs Overriding
abstract method - harus di implementasikan sedangkan overriding itu opsional
Didalam class bluprint:
```java
abstract String getName();
```

Diluar class blueprint, menggunakan interface.

## Interface - Kumpulan abstract method
```java
public interface KontrolTv{
    public void tvOn(boolean on);
    public void moveChannel(int channel);
    public void turnUpSound(int plus);
    public void turnDownSound(int less);
}

public class Tv implements KontrolTv{
    private string merk;
    private boolean on;
    private String[] saluran =("RCTI", "SCTV", "INDOSIAR", "TPI", "ANTV", "TRANSTV", "TRANS7"};
    private int volume=0;
    
    public TV(String merk){
        this.merk = merk;
    }

    public void tvOn(boolean on){
        if(on){
            this.on = true;
            System.out.println("Televisi dihidupkan");
        }else{
            this.on = false;
            System.out.println("Televisi dimatikan");
        }
    }

    ...
}
```