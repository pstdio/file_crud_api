package eu.pstdio.file_crud_api.business.message;

/**
 *
 * @author mib
 */
public interface PostOutputMessage {
    String getUuid();
    void setUuid(String uuid);
    String isCreated();
    void setCreated(String created);
}
