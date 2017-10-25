package ru.spec.java1.lec8;

public enum Menu implements Runnable {
	MAIN("�������"),
	PROJECTS("�������"){
		public void run() {
			System.out.println("Hello world");
		}
	},
	PROJECT_1("������_1",PROJECTS),
	PROJECT_1_1("������_1_1",PROJECT_1),
	PROJECT_2("������_2",PROJECTS),
	PROJECT3("������_3",PROJECTS),
	ABOUT("� ���"),
	CONTACTS("��������");
	
	
	
	

	String title;
	Menu parent;
	
	private Menu(String title, Menu parent) {
		this.title = title;
		this.parent = parent;
	}
	
	private Menu(String title) {
		this.title = null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (parent==null?"":(parent.toString()+ " >> ")) + title;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
