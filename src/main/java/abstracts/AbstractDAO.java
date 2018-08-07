package abstracts;

import java.util.List;

import struts.core.config.parameter.domain.SQLPath;

/**
 * @param <C> Criteria
 * @param <R> Search Result
 * @param <T> Main domain
 */
public abstract class AbstractDAO<C, R, T> {
	
	private SQLPath sqlPath;
	
	/**
	 * @Desc For Count Search Button
	 */
	protected abstract long countData(C criteria) throws Exception;
	
	/**
	 * @Desc For Search Button
	 */
	protected abstract List<R> search(C criteria) throws Exception;
	
	/**
	 * @Desc For Load Edit or View Button
	 */
	protected abstract T searchById(String id) throws Exception;
	
	/**
	 * @Desc Check duplicate before add or edit
	 */
	protected abstract boolean checkDup(T obj) throws Exception;
	
	/**
	 * @Desc For Add Button
	 */
	protected abstract int add(T obj) throws Exception;
	
	/**
	 * @Desc For Edit Button
	 */
	protected abstract int edit(T obj) throws Exception;
	
	/**
	 * @Desc For Delete Button
	 */
	protected abstract int delete(String ids) throws Exception;
	
	public SQLPath getSqlPath() {
		return sqlPath;
	}
	public void setSqlPath(SQLPath sqlPath) {
		this.sqlPath = sqlPath;
	}
	
	
	
}
