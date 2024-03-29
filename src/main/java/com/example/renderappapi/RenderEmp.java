package com.example.renderappapi;

public class RenderEmp {
		private int id;
		private String name;
		private int sal;
		public RenderEmp(int id, String name, int sal) {
			super();
			this.id = id;
			this.name = name;
			this.sal = sal;
		}
		public RenderEmp() {
			super();
		}
		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSal() {
			return sal;
		}
		public void setSal(int sal) {
			this.sal = sal;
		}
}
