package factory;

import notify.Notification;

public abstract class AbstractDocumentCreator {
	
	public AbstractDocument orderDocument(Notification type) {
		
		AbstractDocument doc;
		doc = createDocument(type);
		
		return doc;
		
	}
	
	public abstract AbstractDocument createDocument(Notification type);

}
