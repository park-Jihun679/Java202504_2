package ch09_generic_collection.advanced.ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        Board board1 = new Board();
        board1.setSubject("공지사항");
        board1.setContent("공지사항 내용을 확인하세요.");
        board1.setWriter("운영자");

        Board board2 = new Board();
        board2.setSubject("자유게시판");
        board2.setContent("자유롭게 글을 작성하세요.");
        board2.setWriter("홍길동");

        Board board3 = new Board();
        board3.setSubject("질문게시판");
        board3.setContent("궁금한 점을 질문하세요.");
        board3.setWriter("이몽룡");

        Board board4 = new Board();
        board4.setSubject("후기게시판");
        board4.setContent("이용 후기를 남겨주세요.");
        board4.setWriter("성춘향");

        Board board5 = new Board();
        board5.setSubject("이벤트");
        board5.setContent("이벤트 참여 안내입니다.");
        board5.setWriter("관리자");

        List<Board> boardList = new LinkedList<>();
        boardList.add(board1);
        boardList.add(board2);
        boardList.add(board3);
        boardList.add(board4);
        boardList.add(board5);

        System.out.println(boardList.size());
        System.out.println(" ");

        System.out.println(boardList.get(2));   // 3번째 데이터
        System.out.println(" ");

        for (int i = 0; i < boardList.size(); i++) {
            System.out.println(boardList.get(i));
        }
        System.out.println(" ");

        boardList.remove(2);
        boardList.remove(2);

        for(Board board : boardList) {
            System.out.println(board);
        }
    }
}
