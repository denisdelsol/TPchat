package ChatServeur;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable{
	private int idMessage;
	private String idPersonne;
	private String corps;
	private Date date;
	
	public Message (String idPersonne, String corps, Date date){
		this.idMessage = IdMessageCreator.getInstance().getNewMessageId();
		this.idPersonne = idPersonne;
		this.corps = corps;
		this.date = date;
	}

	/**
	 * @return the idMessage
	 */
	public int getIdMessage() {
		return idMessage;
	}

	/**
	 * @return the idPersonne
	 */
	public String getIdPersonne() {
		return idPersonne;
	}

	/**
	 * @return the corps
	 */
	public String getCorps() {
		return corps;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

}
