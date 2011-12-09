package ChatServeur;

public final class IdMessageCreator {
	private static volatile IdMessageCreator instance = null;
	
	private int idCourrant = 0;
	
	private IdMessageCreator(){
		super();
	}
	
	public final static IdMessageCreator getInstance(){
		if(IdMessageCreator.instance==null){
			synchronized(IdMessageCreator.class) {
	              if (IdMessageCreator.instance == null) {
	            	  IdMessageCreator.instance = new IdMessageCreator();
	              }
	            }
	         }
	         return IdMessageCreator.instance;
	}
	
	public int getNewMessageId(){
		final int id = idCourrant;
		idCourrant++;
		return id;
	}
	
	

}
