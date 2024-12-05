package q6;

import kotlin.jvm.internal.AbstractC3255y;
import l6.V0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final S5.g f38380a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f38381b;

    /* renamed from: c, reason: collision with root package name */
    private final V0[] f38382c;

    /* renamed from: d, reason: collision with root package name */
    private int f38383d;

    public P(S5.g gVar, int i8) {
        this.f38380a = gVar;
        this.f38381b = new Object[i8];
        this.f38382c = new V0[i8];
    }

    public final void a(V0 v02, Object obj) {
        Object[] objArr = this.f38381b;
        int i8 = this.f38383d;
        objArr[i8] = obj;
        V0[] v0Arr = this.f38382c;
        this.f38383d = i8 + 1;
        AbstractC3255y.g(v02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        v0Arr[i8] = v02;
    }

    public final void b(S5.g gVar) {
        int length = this.f38382c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i8 = length - 1;
            V0 v02 = this.f38382c[length];
            AbstractC3255y.f(v02);
            v02.restoreThreadContext(gVar, this.f38381b[length]);
            if (i8 >= 0) {
                length = i8;
            } else {
                return;
            }
        }
    }
}
