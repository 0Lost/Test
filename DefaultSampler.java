package lecture5.strategy;

public class DefaultSampler implements Sampler {

	@Override
	public double read() {
		return Math.random() * 10;
	}

}
