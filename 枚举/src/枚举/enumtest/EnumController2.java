package ö��.enumtest;
/*
 * ö���ж�����󷽷�
 */
public enum EnumController2 
{
	ON {
		@Override
		public EnumController2 downAction() {
			return OFF;
		}
	},OFF {
		@Override
		public EnumController2 downAction() {
			return ON;
		}
	};
	
	public abstract EnumController2 downAction();
}
