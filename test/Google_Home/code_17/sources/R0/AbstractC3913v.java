package r0;

import O.a;
import Q.AbstractC1398n;
import android.accounts.Account;
import android.content.Context;
import i0.C2972b;
import java.util.Locale;

/* renamed from: r0.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3913v {

    /* renamed from: a, reason: collision with root package name */
    public static final O.a f38546a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.g f38547b;

    /* renamed from: c, reason: collision with root package name */
    private static final a.AbstractC0143a f38548c;

    /* renamed from: d, reason: collision with root package name */
    public static final u0.i f38549d;

    /* renamed from: e, reason: collision with root package name */
    public static final i0.r f38550e;

    /* renamed from: f, reason: collision with root package name */
    public static final i0.w f38551f;

    /* renamed from: r0.v$a */
    /* loaded from: classes3.dex */
    public static final class a implements a.d.InterfaceC0144a {

        /* renamed from: a, reason: collision with root package name */
        public final int f38552a;

        /* renamed from: b, reason: collision with root package name */
        public final int f38553b;

        /* renamed from: c, reason: collision with root package name */
        public final Account f38554c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f38555d;

        /* renamed from: r0.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0865a {

            /* renamed from: a, reason: collision with root package name */
            private int f38556a = 3;

            /* renamed from: b, reason: collision with root package name */
            private int f38557b = 1;

            /* renamed from: c, reason: collision with root package name */
            private boolean f38558c = true;

            public a a() {
                return new a(this);
            }

            public C0865a b(int i8) {
                if (i8 != 0) {
                    if (i8 != 0) {
                        if (i8 != 2 && i8 != 1 && i8 != 23 && i8 != 3) {
                            throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", Integer.valueOf(i8)));
                        }
                    } else {
                        i8 = 0;
                    }
                }
                this.f38556a = i8;
                return this;
            }
        }

        private a(C0865a c0865a) {
            this.f38552a = c0865a.f38556a;
            this.f38553b = c0865a.f38557b;
            this.f38555d = c0865a.f38558c;
            this.f38554c = null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (AbstractC1398n.a(Integer.valueOf(this.f38552a), Integer.valueOf(aVar.f38552a)) && AbstractC1398n.a(Integer.valueOf(this.f38553b), Integer.valueOf(aVar.f38553b)) && AbstractC1398n.a(null, null) && AbstractC1398n.a(Boolean.valueOf(this.f38555d), Boolean.valueOf(aVar.f38555d))) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return AbstractC1398n.b(Integer.valueOf(this.f38552a), Integer.valueOf(this.f38553b), null, Boolean.valueOf(this.f38555d));
        }

        @Override // O.a.d.InterfaceC0144a
        public Account l() {
            return null;
        }
    }

    static {
        a.g gVar = new a.g();
        f38547b = gVar;
        I i8 = new I();
        f38548c = i8;
        f38546a = new O.a("Wallet.API", i8, gVar);
        f38550e = new i0.r();
        f38549d = new C2972b();
        f38551f = new i0.w();
    }

    public static C3905m a(Context context, a aVar) {
        return new C3905m(context, aVar);
    }
}
