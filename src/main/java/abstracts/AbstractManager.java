package abstracts;

import java.util.List;

/**
 * @param <C> Criteria
 * @param <R> Search Result
 * @param <T> Main domain
 */
public abstract class AbstractManager<C, R, T> {
	
	/**
	 * @Desc For Search Button
	 */
	public abstract List<R> search(C criteria) throws Exception;
	
	/**
	 * @Desc For Load Edit or View Button
	 */
	public abstract T searchById(String id) throws Exception;
	
	/**
	 * @Desc For Add Button
	 */
	public abstract int add(T obj) throws Exception;
	
	/**
	 * @Desc For Edit Button
	 */
	public abstract int edit(T obj) throws Exception;
	
	/**
	 * @Desc For Delete Button
	 */
	public abstract int delete(String ids) throws Exception;

}
