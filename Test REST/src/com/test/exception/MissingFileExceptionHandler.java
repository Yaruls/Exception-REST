package com.test.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class MissingFileExceptionHandler implements ExceptionMapper<MissingFileException> {

	@Override
	public Response toResponse(MissingFileException exception) {
		return Response.status(404).entity(exception.getMessage()).type("text/plain").build();
	}

}
