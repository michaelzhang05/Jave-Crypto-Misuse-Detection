package io.sentry;

import org.jetbrains.annotations.ApiStatus;

/* compiled from: ITransaction.java */
/* loaded from: classes2.dex */
public interface e2 extends d2 {
    @ApiStatus.Internal
    void e(j5 j5Var, boolean z);

    String getName();

    e5 i();

    io.sentry.protocol.q k();

    void l();

    io.sentry.protocol.z p();
}
