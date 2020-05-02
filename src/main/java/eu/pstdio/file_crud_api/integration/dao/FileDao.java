package eu.pstdio.file_crud_api.integration.dao;

import eu.pstdio.file_crud_api.business.message.DeleteInputMessage;
import eu.pstdio.file_crud_api.business.message.GetInputMessage;
import eu.pstdio.file_crud_api.business.message.PostInputMessage;
import eu.pstdio.file_crud_api.business.message.PutInputMessage;
import java.io.InputStream;
import javax.ws.rs.core.StreamingOutput;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

/**
 *
 * @author mib
 */
public interface FileDao {
    String create(PostInputMessage msg, FormDataContentDisposition fileMetadata, InputStream inputStream);
    StreamingOutput getByGetInputMessage(GetInputMessage msg);
    void update(PutInputMessage msg, InputStream inputStream);
    void delete(DeleteInputMessage msg);
}
