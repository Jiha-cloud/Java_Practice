package java_20210511;

class Notepad {
	int a;

	Notepad(int a) { // 이게 있으므로서 디폴드 생성자가 자동으로 생성이 안됨.
		this.a = a;
	}

	Notepad() { // 이게 없으면 에러남. 디폴드 생성자가 있어야함.

	}
}

class B extends Notepad {
	B(){
		super();
	}
}
