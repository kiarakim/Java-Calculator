package chapter16;

public class AnonymousSample {
	
	public class MagicButtonListener implements EventListener{
		public void onClick() {
			System.out.println("Magic Button Clicked!!");
		}
	}

	public static void main(String[] args) {
		AnonymousSample sample = new AnonymousSample();
//		sample.setButtonListener();
//		sample.setButtonAnonymous();
		sample.setButtonListenerAnonymousObject();
	}
	

	
//	public void setButtonListener() {	
//		MagicButton button = new MagicButton();
//		MagicButtonListener listener = new MagicButtonListener();
//		button.setListener(listener);
//		button.onClickProcess();
//	}
	
//	public void setButtonAnonymous() {	//¿Õ∏Ì
//		MagicButton button = new MagicButton();
//		button.setListener(new EventListener() {
//			public void onClick() {
//				System.out.println("Magic Button Clicked!!");
//			}
//		});
//	}
	
	public void setButtonListenerAnonymousObject() {
		MagicButton button = new MagicButton();
		EventListener listener = new EventListener() {
			public void onClick() {
				System.out.println("Magic Button Clicked!!");
			}
		};
		button.setListener(listener);
		button.onClickProcess();  
	}

}
