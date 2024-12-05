package m2;

import com.stripe.android.model.StripeIntent;

/* renamed from: m2.K, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3413K implements y2.f {

    /* renamed from: a, reason: collision with root package name */
    private final int f34938a;

    /* renamed from: m2.K$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34939a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f34940b;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                iArr[StripeIntent.Status.f25206e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Status.f25204c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.Status.f25208g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StripeIntent.Status.f25209h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StripeIntent.Status.f25210i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StripeIntent.Status.f25207f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StripeIntent.Status.f25205d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f34939a = iArr;
            int[] iArr2 = new int[StripeIntent.NextActionType.values().length];
            try {
                iArr2[StripeIntent.NextActionType.f25187c.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[StripeIntent.NextActionType.f25188d.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[StripeIntent.NextActionType.f25190f.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[StripeIntent.NextActionType.f25192h.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[StripeIntent.NextActionType.f25195k.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[StripeIntent.NextActionType.f25199o.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[StripeIntent.NextActionType.f25191g.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[StripeIntent.NextActionType.f25189e.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[StripeIntent.NextActionType.f25196l.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[StripeIntent.NextActionType.f25197m.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[StripeIntent.NextActionType.f25198n.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[StripeIntent.NextActionType.f25194j.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[StripeIntent.NextActionType.f25193i.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            f34940b = iArr2;
        }
    }

    public AbstractC3413K(int i8) {
        this.f34938a = i8;
    }

    private final int a(StripeIntent stripeIntent, int i8) {
        if (i8 != 0) {
            return i8;
        }
        return i(stripeIntent);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0014. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int i(com.stripe.android.model.StripeIntent r6) {
        /*
            r5 = this;
            com.stripe.android.model.StripeIntent$Status r0 = r6.getStatus()
            if (r0 != 0) goto L8
            r0 = -1
            goto L10
        L8:
            int[] r1 = m2.AbstractC3413K.a.f34939a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L10:
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            switch(r0) {
                case 1: goto L31;
                case 2: goto L43;
                case 3: goto L2f;
                case 4: goto L2d;
                case 5: goto L2d;
                case 6: goto L2d;
                case 7: goto L19;
                default: goto L17;
            }
        L17:
            r1 = 0
            goto L43
        L19:
            com.stripe.android.model.StripeIntent r6 = r5.g()
            com.stripe.android.model.o r6 = r6.r()
            if (r6 == 0) goto L17
            com.stripe.android.model.o$p r6 = r6.f25467e
            if (r6 == 0) goto L17
            boolean r6 = r6.h()
            if (r6 != r4) goto L17
        L2d:
            r1 = 1
            goto L43
        L2f:
            r1 = 2
            goto L43
        L31:
            com.stripe.android.model.StripeIntent$a r6 = r6.j()
            if (r6 != 0) goto L38
            goto L2f
        L38:
            com.stripe.android.model.StripeIntent r6 = r5.g()
            boolean r6 = r5.l(r6)
            if (r6 == 0) goto L43
            goto L2d
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.AbstractC3413K.i(com.stripe.android.model.StripeIntent):int");
    }

    private final boolean l(StripeIntent stripeIntent) {
        int i8;
        StripeIntent.NextActionType k8 = stripeIntent.k();
        if (k8 == null) {
            i8 = -1;
        } else {
            i8 = a.f34940b[k8.ordinal()];
        }
        switch (i8) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            case 0:
            default:
                throw new O5.p();
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return true;
        }
    }

    public abstract String b();

    public abstract StripeIntent g();

    public final int h() {
        return a(g(), this.f34938a);
    }
}
