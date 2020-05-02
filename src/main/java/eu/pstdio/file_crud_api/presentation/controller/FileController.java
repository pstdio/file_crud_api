package eu.pstdio.file_crud_api.presentation.controller;

import java.io.InputStream;
import javax.ws.rs.core.StreamingOutput;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

/**
 *
 * @author mib
 */
public interface FileController {
    String post(InputStream inputStream, FormDataContentDisposition fileMetadata, String json);
    String put(InputStream inputStream, String json);
    StreamingOutput get(String json);
    void delete(String json);
}
