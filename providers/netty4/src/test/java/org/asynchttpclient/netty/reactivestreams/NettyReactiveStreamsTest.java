package org.asynchttpclient.netty.reactivestreams;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.AsyncHttpClientConfig;
import org.asynchttpclient.netty.NettyProviderUtil;
import org.asynchttpclient.reactivestreams.ReactiveStreamsTest;

public class NettyReactiveStreamsTest extends ReactiveStreamsTest {

    @Override
    public AsyncHttpClient getAsyncHttpClient(AsyncHttpClientConfig config) {
        return NettyProviderUtil.nettyProvider(config);
    }
}
