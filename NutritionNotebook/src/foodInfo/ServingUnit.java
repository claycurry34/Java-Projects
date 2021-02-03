package foodInfo;

enum State{
	ct, mass, volume, mass_volume;
}

public enum ServingUnit{
	ct(0f, State.ct),
	g(1f, State.mass),
	ml(1f, State.volume),
	cup(236.58f, State.volume),
	gallon(3785.4f, State.volume),
	kg(1000f, State.mass),
	tbs(14.78f, State.volume),
	tsp(4.929f, State.volume),
	oz(28.35f, State.mass),
	fl_oz(29.57f, State.volume);
	private ServingUnit(final float conversionFactor, State state)
	{
		this.conversionFactor = conversionFactor;
		this.state = state;
	}
	private final float conversionFactor;	
	private final State state;
}
