package eu.pstdio.file_crud_api.integration.dao;

import eu.pstdio.file_crud_api.business.message.DeleteInputMessage;
import eu.pstdio.file_crud_api.business.message.PostInputMessage;
import eu.pstdio.file_crud_api.business.message.PutInputMessage;
import java.io.InputStream;
import javax.ws.rs.core.StreamingOutput;

/**
 *
 * @author mib
 */
public interface FileDao {
    void create(PostInputMessage msg, InputStream inputStream);
    StreamingOutput getByGetInputMessage();
    void update(PutInputMessage msg, InputStream inputStream);
    void delete(DeleteInputMessage msg);
}
