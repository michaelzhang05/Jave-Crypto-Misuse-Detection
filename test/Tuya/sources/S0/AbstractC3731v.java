package s0;

import P.a;
import R.AbstractC1317n;
import android.accounts.Account;
import android.content.Context;
import j0.C3025b;
import j0.C3041r;
import j0.C3046w;
import java.util.Locale;
import v0.InterfaceC3819i;

/* renamed from: s0.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3731v {

    /* renamed from: a, reason: collision with root package name */
    public static final P.a f37811a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.g f37812b;

    /* renamed from: c, reason: collision with root package name */
    private static final a.AbstractC0166a f37813c;

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC3819i f37814d;

    /* renamed from: e, reason: collision with root package name */
    public static final C3041r f37815e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3046w f37816f;

    /* renamed from: s0.v$a */
    /* loaded from: classes3.dex */
    public static final class a implements a.d.InterfaceC0167a {

        /* renamed from: a, reason: collision with root package name */
        public final int f37817a;

        /* renamed from: b, reason: collision with root package name */
        public final int f37818b;

        /* renamed from: c, reason: collision with root package name */
        public final Account f37819c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f37820d;

        /* renamed from: s0.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0871a {

            /* renamed from: a, reason: collision with root package name */
            private int f37821a = 3;

            /* renamed from: b, reason: collision with root package name */
            private int f37822b = 1;

            /* renamed from: c, reason: collision with root package name */
            private boolean f37823c = true;

            public a a() {
                return new a(this);
            }

            public C0871a b(int i8) {
                if (i8 != 0) {
                    if (i8 != 0) {
                        if (i8 != 2 && i8 != 1 && i8 != 23 && i8 != 3) {
                            throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", Integer.valueOf(i8)));
                        }
                    } else {
                        i8 = 0;
                    }
                }
                this.f37821a = i8;
                return this;
            }
        }

        private a(C0871a c0871a) {
            this.f37817a = c0871a.f37821a;
            this.f37818b = c0871a.f37822b;
            this.f37820d = c0871a.f37823c;
            this.f37819c = null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (AbstractC1317n.a(Integer.valueOf(this.f37817a), Integer.valueOf(aVar.f37817a)) && AbstractC1317n.a(Integer.valueOf(this.f37818b), Integer.valueOf(aVar.f37818b)) && AbstractC1317n.a(null, null) && AbstractC1317n.a(Boolean.valueOf(this.f37820d), Boolean.valueOf(aVar.f37820d))) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return AbstractC1317n.b(Integer.valueOf(this.f37817a), Integer.valueOf(this.f37818b), null, Boolean.valueOf(this.f37820d));
        }

        @Override // P.a.d.InterfaceC0167a
        public Account i() {
            return null;
        }
    }

    static {
        a.g gVar = new a.g();
        f37812b = gVar;
        I i8 = new I();
        f37813c = i8;
        f37811a = new P.a("Wallet.API", i8, gVar);
        f37815e = new C3041r();
        f37814d = new C3025b();
        f37816f = new C3046w();
    }

    public static C3723m a(Context context, a aVar) {
        return new C3723m(context, aVar);
    }
}
