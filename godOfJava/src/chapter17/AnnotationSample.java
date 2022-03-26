package chapter17;

public class AnnotationSample {
	@SuppressWarnings("deprecation")
	public void useDeprecated() {
		AnnotationDeprecated child = new AnnotationDeprecated();
		child.noMoreUse();
	}

	public static void main(String[] args) {
		AnnotationSample sample = new AnnotationSample();
		sample.useDeprecated();
	}

}
