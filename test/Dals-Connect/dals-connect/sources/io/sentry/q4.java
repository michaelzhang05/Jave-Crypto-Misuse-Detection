package io.sentry;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryIntegrationPackageStorage.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class q4 {
    private static volatile q4 a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<String> f19208b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    private final Set<io.sentry.protocol.r> f19209c = new CopyOnWriteArraySet();

    private q4() {
    }

    public static q4 c() {
        if (a == null) {
            synchronized (q4.class) {
                if (a == null) {
                    a = new q4();
                }
            }
        }
        return a;
    }

    public void a(String str) {
        io.sentry.util.q.c(str, "integration is required.");
        this.f19208b.add(str);
    }

    public void b(String str, String str2) {
        io.sentry.util.q.c(str, "name is required.");
        io.sentry.util.q.c(str2, "version is required.");
        this.f19209c.add(new io.sentry.protocol.r(str, str2));
    }

    public Set<String> d() {
        return this.f19208b;
    }

    public Set<io.sentry.protocol.r> e() {
        return this.f19209c;
    }
}
