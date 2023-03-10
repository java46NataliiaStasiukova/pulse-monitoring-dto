package telran.monitoring.model;

public class PulseProbe {

	public PulseProbe(long patientId, long timestamp, long sequenceNumber, int value) {
		this.patientId = patientId;
		this.timestamp = timestamp;
		this.sequenceNumber = sequenceNumber;
		this.value = value;
	}
	
	public PulseProbe() {
		
	}
	public long patientId;
	public long timestamp;
	public long sequenceNumber;
	public int value;
	
}
