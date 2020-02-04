class Car{
	int gasolineGauge;
	public Car(int gasolineGauge) {
		this.gasolineGauge = gasolineGauge;
	}
}
class HybridCar extends Car{
	int electricGauge;
	public HybridCar(int gasolineGauge, int electricGauge) {
		super(gasolineGauge);
		this.electricGauge = electricGauge;
	}
}
class HybridWaterCar extends HybridCar{
	int waterGauge;
	public HybridWaterCar(int gasolineGauge,int electricGauge, int waterGauge) {
		super(gasolineGauge,electricGauge);
		this.waterGauge = waterGauge;
	}
	
	public void showCurrentGauge() {
		System.out.println("�ܿ� ���ָ�: "+gasolineGauge);
		System.out.println("�ܿ� ���ⷮ: "+electricGauge);
		System.out.println("�ܿ� ���ͷ�: "+waterGauge);
	}
}

class VariousCar {
	public static void main(String[] args) {
		HybridWaterCar hw = new HybridWaterCar(4,2,3);
		hw.showCurrentGauge();
		
		HybridWaterCar hw2 = new HybridWaterCar(1,2,3);
		hw2.showCurrentGauge();
		
	}
}
