package Addflight;

public class Flights {
	private int FLIGHTID;
	private String START;
	private String END;
	private String NO_SEATS;
	private String PILOT;
	
	
	public Flights(int fLIGHTID, String sTART, String eND, String nO_SEATS, String pILOT,) 
	{
		
		FLIGHTID = flightid;
		START = start;
		END = end;
		NO_SEATS = no_seats;
		PILOT = pilot;
		
	}

	public int getFLIGHTID() {
		return FLIGHTID;
	}

	public String getSTART() {
		return START;
	}

	public String getEND() {
		return END;
	}


	public String getNO_SEATS() {
		return NO_SEATS;
	}

	public String getPILOT() {
		return PILOT;
	}

	
} 
