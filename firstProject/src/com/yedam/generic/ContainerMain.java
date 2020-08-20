package com.yedam.generic;

public class ContainerMain<T, M> {
	
	
		private T key;
		private M value;
	
		
		public T getKey() {
			return key;
		}
		
		public void setKey(T key) {
			this.key = key;
		}
		
		public M getValue() {
			return value;
		}
		
		public void setValue(M value) {
			this.value = value;
		}
		
		
		public void set(T key, M value ) {  //확인문제 3번 교과서에 set이니까 여기도 set으로 새로 정의해야함
			this.value = value;
			this.key = key;
		}
		
		
		
}
