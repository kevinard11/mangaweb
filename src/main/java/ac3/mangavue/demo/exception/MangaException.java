package ac3.mangavue.demo.exception;

import org.springframework.web.server.ResponseStatusException;

public class MangaException extends ResponseStatusException {
    public MangaException(HttpStatus status) {
        super(status.getHttpStatus(), status.getStatus());
    }
}
