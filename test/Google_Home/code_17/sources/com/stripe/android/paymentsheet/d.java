package com.stripe.android.paymentsheet;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.i;
import com.stripe.android.model.n;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class d {

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26952a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f26953b;

        static {
            int[] iArr = new int[u.m.e.values().length];
            try {
                iArr[u.m.e.f27542a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.m.e.f27543b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26952a = iArr;
            int[] iArr2 = new int[u.m.a.values().length];
            try {
                iArr2[u.m.a.f27531a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[u.m.a.f27532b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[u.m.a.f27533c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f26953b = iArr2;
        }
    }

    private static final i.b a(u.m.d dVar) {
        StripeIntent.Usage usage;
        if (dVar instanceof u.m.d.a) {
            u.m.d.a aVar = (u.m.d.a) dVar;
            long b8 = aVar.b();
            String M8 = aVar.M();
            u.m.e a8 = dVar.a();
            if (a8 != null) {
                usage = d(a8);
            } else {
                usage = null;
            }
            return new i.b.a(b8, M8, usage, c(aVar.g()));
        }
        if (dVar instanceof u.m.d.b) {
            u.m.d.b bVar = (u.m.d.b) dVar;
            return new i.b.C0498b(bVar.M(), d(bVar.a()));
        }
        throw new O5.p();
    }

    public static final com.stripe.android.model.i b(u.m mVar) {
        AbstractC3255y.i(mVar, "<this>");
        return new com.stripe.android.model.i(a(mVar.a()), mVar.e(), mVar.g(), mVar.b());
    }

    private static final n.b c(u.m.a aVar) {
        int i8 = a.f26953b[aVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return n.b.f25420e;
                }
                throw new O5.p();
            }
            return n.b.f25419d;
        }
        return n.b.f25418c;
    }

    private static final StripeIntent.Usage d(u.m.e eVar) {
        int i8 = a.f26952a[eVar.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return StripeIntent.Usage.f25216d;
            }
            throw new O5.p();
        }
        return StripeIntent.Usage.f25215c;
    }
}
