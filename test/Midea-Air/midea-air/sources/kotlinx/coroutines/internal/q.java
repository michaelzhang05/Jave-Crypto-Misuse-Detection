package kotlinx.coroutines.internal;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.u1;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainDispatchers.kt */
/* loaded from: classes2.dex */
public final class q extends u1 implements p0 {

    /* renamed from: g, reason: collision with root package name */
    private final Throwable f22238g;

    /* renamed from: h, reason: collision with root package name */
    private final String f22239h;

    public q(Throwable th, String str) {
        this.f22238g = th;
        this.f22239h = str;
    }

    private final Void x0() {
        String m;
        if (this.f22238g != null) {
            String str = this.f22239h;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str != null && (m = kotlin.jvm.internal.l.m(". ", str)) != null) {
                str2 = m;
            }
            throw new IllegalStateException(kotlin.jvm.internal.l.m("Module with the Main dispatcher had failed to initialize", str2), this.f22238g);
        }
        p.c();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.c0
    public boolean t0(CoroutineContext coroutineContext) {
        x0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.u1, kotlinx.coroutines.c0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f22238g;
        sb.append(th != null ? kotlin.jvm.internal.l.m(", cause=", th) : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(']');
        return sb.toString();
    }

    @Override // kotlinx.coroutines.u1
    public u1 u0() {
        return this;
    }

    @Override // kotlinx.coroutines.c0
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public Void s0(CoroutineContext coroutineContext, Runnable runnable) {
        x0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.p0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public Void o(long j2, kotlinx.coroutines.l<? super kotlin.u> lVar) {
        x0();
        throw new KotlinNothingValueException();
    }
}
