package 枚举.enumtest;
/*
 * 枚举中定义抽象方法
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
