package n1;

import android.content.Context;
import android.os.Bundle;
import k6.AbstractC3227c;
import k6.C3225a;
import k6.EnumC3228d;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import n1.InterfaceC3463h;

/* renamed from: n1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3457b implements InterfaceC3463h {

    /* renamed from: b, reason: collision with root package name */
    private static final a f35287b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f35288a;

    /* renamed from: n1.b$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C3457b(Context context) {
        AbstractC3255y.i(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f35288a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // n1.InterfaceC3463h
    public Boolean a() {
        if (this.f35288a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f35288a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // n1.InterfaceC3463h
    public C3225a b() {
        if (this.f35288a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return C3225a.e(AbstractC3227c.s(this.f35288a.getInt("firebase_sessions_sessions_restart_timeout"), EnumC3228d.f34141e));
        }
        return null;
    }

    @Override // n1.InterfaceC3463h
    public Object c(S5.d dVar) {
        return InterfaceC3463h.a.a(this, dVar);
    }

    @Override // n1.InterfaceC3463h
    public Double d() {
        if (this.f35288a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f35288a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
