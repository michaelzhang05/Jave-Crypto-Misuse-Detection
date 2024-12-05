package c;

import O5.I;
import a6.InterfaceC1668n;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.gbc.GoogleBasicConsents;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: c.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2001i {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f15552b;

    /* renamed from: a, reason: collision with root package name */
    public static final C2001i f15551a = new C2001i();

    /* renamed from: c, reason: collision with root package name */
    public static Vector f15553c = new Vector(null, 1, null);

    /* renamed from: c.i$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Vector f15554a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Vector vector) {
            super(2);
            this.f15554a = vector;
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (!this.f15554a.contains(intValue)) {
                if (booleanValue) {
                    this.f15554a.set(intValue);
                } else {
                    this.f15554a.unset(intValue);
                }
            }
            return I.f8278a;
        }
    }

    public final Vector a(Vector vector, Vector newVector) {
        AbstractC3255y.i(newVector, "newVector");
        if (vector != null) {
            vector.forEach(new a(newVector));
        }
        return newVector;
    }

    public final GoogleBasicConsents b() {
        return new GoogleBasicConsents(c("adStorage"), c("adUserData"), c("adPersonalization"), c("analyticsStorage"));
    }

    public final GBCConsentValue c(String str) {
        boolean z8;
        Vector vector = f15553c;
        int e8 = e(str);
        if (vector.contains(e8)) {
            z8 = AbstractC3255y.d(vector.get(e8), Boolean.TRUE);
        } else {
            z8 = false;
        }
        if (z8) {
            return GBCConsentValue.GRANTED;
        }
        return GBCConsentValue.DENIED;
    }

    public final void d(int i8, GBCConsentValue value) {
        AbstractC3255y.i(value, "value");
        if (value == GBCConsentValue.GRANTED) {
            f15553c.set(i8);
        } else {
            f15553c.unset(i8);
        }
    }

    public final int e(String value) {
        AbstractC3255y.i(value, "value");
        if (AbstractC3255y.d(value, "adStorage")) {
            return 1;
        }
        if (AbstractC3255y.d(value, "adUserData")) {
            return 2;
        }
        if (AbstractC3255y.d(value, "adPersonalization")) {
            return 3;
        }
        if (AbstractC3255y.d(value, "analyticsStorage")) {
            return 4;
        }
        return 0;
    }
}
