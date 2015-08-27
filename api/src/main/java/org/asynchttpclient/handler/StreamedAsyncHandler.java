package org.asynchttpclient.handler;

import org.asynchttpclient.AsyncHandler;
import org.asynchttpclient.HttpResponseBodyPart;
import org.reactivestreams.Publisher;

/**
 * AsyncHandler that uses reactive streams to handle the request.
 */
public interface StreamedAsyncHandler<T> extends AsyncHandler<T> {

    /**
     * Called when the body is received. May not be called if there's no body.
     *
     * @param publisher The publisher of response body parts.
     * @return Whether to continue or abort.
     */
    State onStream(Publisher<HttpResponseBodyPart> publisher);
}
