package r6;

import n6.C3486F;
import n6.I;

/* renamed from: r6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3694e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f37685a;

    /* renamed from: b, reason: collision with root package name */
    private static final C3486F f37686b;

    /* renamed from: c, reason: collision with root package name */
    private static final C3486F f37687c;

    /* renamed from: d, reason: collision with root package name */
    private static final C3486F f37688d;

    /* renamed from: e, reason: collision with root package name */
    private static final C3486F f37689e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f37690f;

    static {
        int e8;
        int e9;
        e8 = I.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f37685a = e8;
        f37686b = new C3486F("PERMIT");
        f37687c = new C3486F("TAKEN");
        f37688d = new C3486F("BROKEN");
        f37689e = new C3486F("CANCELLED");
        e9 = I.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f37690f = e9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3695f h(long j8, C3695f c3695f) {
        return new C3695f(j8, c3695f, 0);
    }
}
