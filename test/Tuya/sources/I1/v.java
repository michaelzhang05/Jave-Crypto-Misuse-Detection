package i1;

import android.os.SystemClock;
import h6.AbstractC2760c;
import h6.C2758a;
import h6.EnumC2761d;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes3.dex */
public final class v implements w {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31549a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @Override // i1.w
    public long a() {
        C2758a.C0756a c0756a = C2758a.f31409b;
        return AbstractC2760c.t(SystemClock.elapsedRealtime(), EnumC2761d.f31418d);
    }

    @Override // i1.w
    public long b() {
        return System.currentTimeMillis() * 1000;
    }
}
