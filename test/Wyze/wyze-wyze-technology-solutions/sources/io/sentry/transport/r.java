package io.sentry.transport;

import io.sentry.h4;
import io.sentry.n1;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: ITransport.java */
/* loaded from: classes2.dex */
public interface r extends Closeable {
    void d(long j2);

    void x(h4 h4Var, n1 n1Var) throws IOException;
}
