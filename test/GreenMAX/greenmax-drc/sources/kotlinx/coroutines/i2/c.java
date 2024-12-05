package kotlinx.coroutines.i2;

import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.n0;

/* compiled from: Dispatcher.kt */
/* loaded from: classes2.dex */
public class c extends d1 {

    /* renamed from: h, reason: collision with root package name */
    private final int f22182h;

    /* renamed from: i, reason: collision with root package name */
    private final int f22183i;

    /* renamed from: j, reason: collision with root package name */
    private final long f22184j;

    /* renamed from: k, reason: collision with root package name */
    private final String f22185k;
    private a l;

    public c(int i2, int i3, long j2, String str) {
        this.f22182h = i2;
        this.f22183i = i3;
        this.f22184j = j2;
        this.f22185k = str;
        this.l = u0();
    }

    private final a u0() {
        return new a(this.f22182h, this.f22183i, this.f22184j, this.f22185k);
    }

    @Override // kotlinx.coroutines.c0
    public void s0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            a.z(this.l, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            n0.l.s0(coroutineContext, runnable);
        }
    }

    public final void v0(Runnable runnable, j jVar, boolean z) {
        try {
            this.l.w(runnable, jVar, z);
        } catch (RejectedExecutionException unused) {
            n0.l.J0(this.l.f(runnable, jVar));
        }
    }

    public /* synthetic */ c(int i2, int i3, String str, int i4, kotlin.jvm.internal.g gVar) {
        this((i4 & 1) != 0 ? l.f22196c : i2, (i4 & 2) != 0 ? l.f22197d : i3, (i4 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    public c(int i2, int i3, String str) {
        this(i2, i3, l.f22198e, str);
    }
}
