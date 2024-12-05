package k1;

import android.content.Context;
import android.os.Bundle;
import h6.AbstractC2760c;
import h6.C2758a;
import h6.EnumC2761d;
import k1.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3102b implements InterfaceC3108h {

    /* renamed from: b, reason: collision with root package name */
    private static final a f33297b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f33298a;

    /* renamed from: k1.b$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C3102b(Context context) {
        AbstractC3159y.i(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f33298a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // k1.InterfaceC3108h
    public Boolean a() {
        if (this.f33298a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f33298a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // k1.InterfaceC3108h
    public C2758a b() {
        if (this.f33298a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return C2758a.e(AbstractC2760c.s(this.f33298a.getInt("firebase_sessions_sessions_restart_timeout"), EnumC2761d.f31419e));
        }
        return null;
    }

    @Override // k1.InterfaceC3108h
    public Double c() {
        if (this.f33298a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f33298a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // k1.InterfaceC3108h
    public Object d(P5.d dVar) {
        return InterfaceC3108h.a.a(this, dVar);
    }
}
