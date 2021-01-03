public class Options {
    private String radio;
    private String bluetooth;

    // Constructor
    public Options(String radio, String bluetooth){
        this.radio = radio;
        this.bluetooth = bluetooth;
    }
    
    public void setRadio(String radio){
        this.radio = radio;
    }
    public void setBluetooth(String bluetooth){
        this.bluetooth = bluetooth;
    }

    public String getRadio(){
        return radio;
    }

    public String getBluetooth(){
        return bluetooth;
    }

    // toString
    public String toString(){
        return "Radio: " + radio + ", Bluetooth: " + bluetooth;
    }
}
