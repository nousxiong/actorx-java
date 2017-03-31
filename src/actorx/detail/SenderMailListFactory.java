/**
 * 
 */
package actorx.detail;

import cque.IObjectFactory;
import cque.IPooledObject;

/**
 * @author Xiong
 * 
 */
public class SenderMailListFactory implements IObjectFactory {

	@Override
	public IPooledObject createInstance() {
		return new SenderMailList();
	}

}
