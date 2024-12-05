package io.sentry;

import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryEnvelope.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class h4 {
    private final i4 a;

    /* renamed from: b, reason: collision with root package name */
    private final Iterable<j4> f18949b;

    public h4(i4 i4Var, Iterable<j4> iterable) {
        this.a = (i4) io.sentry.util.q.c(i4Var, "SentryEnvelopeHeader is required.");
        this.f18949b = (Iterable) io.sentry.util.q.c(iterable, "SentryEnvelope items are required.");
    }

    public static h4 a(c2 c2Var, d5 d5Var, io.sentry.protocol.o oVar) throws IOException {
        io.sentry.util.q.c(c2Var, "Serializer is required.");
        io.sentry.util.q.c(d5Var, "session is required.");
        return new h4(null, oVar, j4.f(c2Var, d5Var));
    }

    public i4 b() {
        return this.a;
    }

    public Iterable<j4> c() {
        return this.f18949b;
    }

    public h4(io.sentry.protocol.q qVar, io.sentry.protocol.o oVar, j4 j4Var) {
        io.sentry.util.q.c(j4Var, "SentryEnvelopeItem is required.");
        this.a = new i4(qVar, oVar);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(j4Var);
        this.f18949b = arrayList;
    }
}
