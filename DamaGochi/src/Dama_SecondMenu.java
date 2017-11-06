import java.util.*;		//클래스 전부 사용
public class Dama_SecondMenu {
	public static boolean door = true;
	
	public void secondMenu() {
		door = true;			//door 초기화로 while문 실행시켜줌
		/***************************************************************
		 * Dama_Speacial speacial - Dama_Speacial에서 도박 땡겨오기 위해 사용
		 * Dama_Eat eat - 1번메뉴 밥주기 클래스 생성		  - eat
		 * Dama_Excersise excersise - 2번 운동 클래스 생성 -excersise
		 * Dama_Clean clean - 3번 청소 클래스 생성	 	  -clean
		 * Dama_FirstMenu first - 부화 클래스 생성		  -first
		 * Scanner scan - 스캐너 클래스 사용
		 * 
		 ****************************************************************/	
		while(door) {			//밥주기 등 메뉴 4번으로 나가도 반복
		Dama_Speacial speacial 		= new Dama_Speacial();	
		Dama_Eat eat 				= new Dama_Eat();		
		Dama_Excersise excersise 	= new Dama_Excersise();
		Dama_Clean clean 			= new Dama_Clean();			
		Dama_FirstMenu first 		= new Dama_FirstMenu();	
		Dama_Status status			= new Dama_Status();
		Scanner scan 				= new Scanner(System.in);			//스캐너 클래스 생성
		int scanGet = 0;										//scanGet - 스위치 입력 제어
		status.status();
		System.out.println("1. 밥주기 | 2. 운동 | 3. 청소 | 4. 특수메뉴");	//메뉴 보여주기
		scanGet=Integer.parseInt(scan.next());					//입력 받은 값을 int로 전환
		//------------------------------------------------------------------------------------------------------------------------------
		switch(scanGet) {						//switch 시작
			case 1 : 
				eat.eatFood();					//밥주기 클래스 넣기
				 Dama_Eat.oneEat = Dama_Eat.oneEat + 1;
				break;
			case 2 : 
				excersise.input();				//운동 클래스 넣기
				break;
			case 3 :
				clean.clean();					//청소 클래스 넣기
				break;
			case 4 :  								//특수메뉴
				while(Dama_Speacial.end < 900){ 	//4번 안의 4번 누르면 빠져나옴(전역변수 사용)
					speacial.speacial_Menu(); 	//스페셜 메뉴 클래스로 이동
				}//while 종료
				Dama_Speacial.end = 0;
			}//end switch
		
		}//end while
	}//end secondMenu
}//end Dama_SecondMenu
