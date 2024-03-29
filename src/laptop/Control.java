package laptop;

public interface Control {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리합니다.");
            setVolume(MIN_VOLUME);
        }else {
            System.out.println("무음 해제합니다.");
        }
    }

    static void changeBattery(){
        System.out.println("노트북 배터리를 교환합니다.");
    }
}



