package u6;

import q6.C3865F;
import q6.I;

/* renamed from: u6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4067e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f40065a;

    /* renamed from: b, reason: collision with root package name */
    private static final C3865F f40066b;

    /* renamed from: c, reason: collision with root package name */
    private static final C3865F f40067c;

    /* renamed from: d, reason: collision with root package name */
    private static final C3865F f40068d;

    /* renamed from: e, reason: collision with root package name */
    private static final C3865F f40069e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f40070f;

    static {
        int e8;
        int e9;
        e8 = I.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f40065a = e8;
        f40066b = new C3865F("PERMIT");
        f40067c = new C3865F("TAKEN");
        f40068d = new C3865F("BROKEN");
        f40069e = new C3865F("CANCELLED");
        e9 = I.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f40070f = e9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4068f h(long j8, C4068f c4068f) {
        return new C4068f(j8, c4068f, 0);
    }
}
