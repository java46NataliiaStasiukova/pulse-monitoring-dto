package telran.monitoring.model;

public class PulseJump {

	public long patientId;
	public int prevValue;
	public int currentValue;
	public long timestamp;
	
	public PulseJump(long patientId, int prevValue, int currentValue, long timestamp) {
		this.patientId = patientId;
		this.prevValue = prevValue;
		this.currentValue = currentValue;
		this.timestamp = System.currentTimeMillis();
	}
	
	public PulseJump() {
		
	}

	@Override
	public String toString() {
		return "PulseJump [patientId=" + patientId + ", prevValue=" + prevValue + ", currentValue=" + currentValue
				+ ", timestamp=" + timestamp + "]";
	}

}
