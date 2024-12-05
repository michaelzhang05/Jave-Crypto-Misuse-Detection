package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;
import java.util.Locale;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator f31933b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f31934c = 0;

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f31935a;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Comparator] */
    static {
        new ConcurrentHashMap(16, 0.75f, 2);
        f31933b = new Object();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(r rVar) {
        this.f31935a = rVar;
    }

    public final String b(j$.time.chrono.m mVar, j$.time.temporal.r rVar, long j8, v vVar, Locale locale) {
        return this.f31935a.a(j8, vVar);
    }

    public final String c(j$.time.temporal.r rVar, long j8, v vVar, Locale locale) {
        return this.f31935a.a(j8, vVar);
    }
}
