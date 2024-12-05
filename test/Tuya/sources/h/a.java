package H;

import L.h;
import P.a;
import R.AbstractC1317n;
import android.os.Bundle;
import d0.C2533e;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final P.a f3241a;

    /* renamed from: b, reason: collision with root package name */
    public static final P.a f3242b;

    /* renamed from: c, reason: collision with root package name */
    public static final P.a f3243c;

    /* renamed from: d, reason: collision with root package name */
    public static final J.a f3244d;

    /* renamed from: e, reason: collision with root package name */
    public static final I.a f3245e;

    /* renamed from: f, reason: collision with root package name */
    public static final K.a f3246f;

    /* renamed from: g, reason: collision with root package name */
    public static final a.g f3247g;

    /* renamed from: h, reason: collision with root package name */
    public static final a.g f3248h;

    /* renamed from: i, reason: collision with root package name */
    private static final a.AbstractC0166a f3249i;

    /* renamed from: j, reason: collision with root package name */
    private static final a.AbstractC0166a f3250j;

    /* renamed from: H.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0050a implements a.d {

        /* renamed from: d, reason: collision with root package name */
        public static final C0050a f3251d = new C0050a(new C0051a());

        /* renamed from: a, reason: collision with root package name */
        private final String f3252a = null;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f3253b;

        /* renamed from: c, reason: collision with root package name */
        private final String f3254c;

        /* renamed from: H.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0051a {

            /* renamed from: a, reason: collision with root package name */
            protected Boolean f3255a;

            /* renamed from: b, reason: collision with root package name */
            protected String f3256b;

            public C0051a() {
                this.f3255a = Boolean.FALSE;
            }

            public final C0051a a(String str) {
                this.f3256b = str;
                return this;
            }

            public C0051a(C0050a c0050a) {
                this.f3255a = Boolean.FALSE;
                C0050a.b(c0050a);
                this.f3255a = Boolean.valueOf(c0050a.f3253b);
                this.f3256b = c0050a.f3254c;
            }
        }

        public C0050a(C0051a c0051a) {
            this.f3253b = c0051a.f3255a.booleanValue();
            this.f3254c = c0051a.f3256b;
        }

        static /* bridge */ /* synthetic */ String b(C0050a c0050a) {
            String str = c0050a.f3252a;
            return null;
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f3253b);
            bundle.putString("log_session_id", this.f3254c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0050a)) {
                return false;
            }
            C0050a c0050a = (C0050a) obj;
            String str = c0050a.f3252a;
            if (AbstractC1317n.a(null, null) && this.f3253b == c0050a.f3253b && AbstractC1317n.a(this.f3254c, c0050a.f3254c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return AbstractC1317n.b(null, Boolean.valueOf(this.f3253b), this.f3254c);
        }
    }

    static {
        a.g gVar = new a.g();
        f3247g = gVar;
        a.g gVar2 = new a.g();
        f3248h = gVar2;
        d dVar = new d();
        f3249i = dVar;
        e eVar = new e();
        f3250j = eVar;
        f3241a = b.f3257a;
        f3242b = new P.a("Auth.CREDENTIALS_API", dVar, gVar);
        f3243c = new P.a("Auth.GOOGLE_SIGN_IN_API", eVar, gVar2);
        f3244d = b.f3258b;
        f3245e = new C2533e();
        f3246f = new h();
    }
}
