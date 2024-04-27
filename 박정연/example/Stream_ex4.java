package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Board{
    private String title;
    private String content;
    private int hit;

    Board(String title, String content, int hit){
        this.title=title;
        this.content=content;
        this.hit=hit;
    }
    public String getTitleAndContent(){return this.title+":"+this.content;} //getter
    public int getHit(){return this.hit;}
}
public class Stream_ex4 {
    public static void main(String[] args){
        List<Board> boards = new ArrayList<>(Arrays.asList(
                new Board("오늘의 날씨", "맑음",30),
                new Board("오늘의 노래","뉴진스의 하입보이",40),
                new Board("오늘의 게임","리그오브레전드",100),
                new Board("오늘의 운세","운이 좋네요",20)
        ));
        List<String> top3=
                boards.stream()
                        .sorted(Comparator.comparing(Board::getHit).reversed())
                        .limit(3)
                        .map(Board::getTitleAndContent)
                        .collect(Collectors.toList());
        System.out.println(top3);
    }
}
