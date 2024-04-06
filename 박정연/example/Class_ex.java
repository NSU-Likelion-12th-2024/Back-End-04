package example;
    //클래스
    class TV{
        String color;
        boolean power;
        int channel;

        //클래스 생성자
        TV(){}
        TV(String color, boolean power, int channel){
            //this.color = 클래스 매개변수_String color
            this.color =color;
            this.power =power;
            this.channel = channel;
        }

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
