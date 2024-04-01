package example;

    class TV{
        String color;
        boolean power;
        int channel;

        void Power(){power =! power;}
        void ChannelUp(){channel++;}
        void ChannelDown(){channel--;}
    }
public class Class_ex {
    public static void main(String[] args){
        TV LGtv = new TV();
        TV Samsungtv = new TV();
        TV Appletv = new TV();

        Samsungtv.Power();
    }
}
