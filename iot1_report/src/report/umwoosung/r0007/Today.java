<<<<<<< HEAD
package report.umwoosung.r007;



	/*접근제어자.
		public 어디서든지 끌어올수있다.
		default 같은 패키지 내에서 접근가능.(접근제어자가 아예 없는것)
		private 다른클래스는 아예 못쓴다.
		protected 다른패키지에서 사용불가능하지만 상속받는다면(extend)가능하다.

	디폴트된 클래스를 쓰고싶다면 클래스앞에서다 public 을 붙여준다면 다른 클래스에서도 끌어쓸수있다.

디폴트된 클래스를 접근제어자를 안쓰고 끌어쓰고싶다면 
디폴트 돼어있는 변수를 public로 함수 선언해서
그선언값을 끌어오면된다.(다른 클래스로 접근이 안되니 같은 
클래스에 끌어올수있는 public 을 하나만들고 거기서 끌어온다고 
생각하자.private도 동일안 방법으로 끌고올수있다.)

a와 b의값을 새로운 함수를 선언해서 그대로 가지고 오고싶다면
새로운 함수를 선언하고 그곳에 return a; return b;를 선언하면
다른 클래스에서 선언한 함수를 호출하고 return이 a,b로 보내준다.

this.a = a;는 해당클래스에 함수를 a를 default int a에 대입하는것으로
default int a = 1일때 this.a = a;에서 a의 값이 3이면 3으로 대입된다.

생성자는 대부분 초기값을 설정할때 사용한다.



>>>>>>>>>
1.return의개념과 return과 배열을 선언하는것을 어떤순서로 넣어야하는것인가?
2.배열을 처음부터 다시 공부해봐야 할것같은데 어떤방식으로 해야하는가?
<<<<<<<<<외워야할것.
 this.a = a; < a의값을 새로 대입하는것. >
=======
package report.umwoosung.r0007;



	/*접근제어자.
		public 어디서든지 끌어올수있다.
		default 같은 패키지(현패키지는umwoosung에 포함되어있어서 다른패키지에서 접근가능)  내에서 접근가능.(접근제어자가 아예 없는것)
		private 다른클래스는 아예 못쓴다.(단 private 클래스 내에서 변수값이 변환이 되는것이라면 다른클래스에서도 쓸수있다.)
		protected (현패키지 사용가능)다른패키지에서 사용불가능하지만 상속받는다면(extend)가능하다.

	디폴트된 클래스를 쓰고싶다면 클래스앞에서다 public 을 붙여준다면 다른 클래스에서도 끌어쓸수있다.

디폴트된 클래스를 접근제어자를 안쓰고 끌어쓰고싶다면 
디폴트 돼어있는 변수를 public로 함수 선언해서
그선언값을 끌어오면된다.(다른 클래스로 접근이 안되니 같은 
클래스에 끌어올수있는 public 을 하나만들고 거기서 끌어온다고 
생각하자.private도 동일안 방법으로 끌고올수있다.)

a와 b의값을 새로운 함수를 선언해서 그대로 가지고 오고싶다면
새로운 함수를 선언하고 그곳에 return a; return b;를 선언하면
다른 클래스에서 선언한 함수를 호출하고 return이 a,b로 보내준다.

this.a = a;는 해당클래스에 함수를 a를 default int a에 대입하는것으로
default int a = 1일때 this.a = a;에서 a의 값이 3이면 3으로 대입된다.

생성자는 대부분 초기값을 설정할때 사용한다.






>>>>>>>>>
1.return의개념과 return과 배열을 선언하는것을 어떤순서로 넣어야하는것인가?
2.배열을 처음부터 다시 공부해봐야 할것같은데 어떤방식으로 해야하는가?
<<<<<<<<<외워야할것.
 this.a = a; < a의값을 위에 선언되어있는 a에 새로 대입하는것. >
>>>>>>> branch 'master' of https://github.com/ParkKyoungHun/iot1_report.git
 String[]a = new String[정수혹은 a,b로 대입]; 배열의 방을 선언하는것.
*/
