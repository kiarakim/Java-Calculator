package chapter13;

public interface List {
	public void add(); //데이터 추가
	public void update(int index, Object value); // 특정 위치에 있는 값 수정
	public void remove(int index);	// 특정 위치에 있는 값 삭제
}
