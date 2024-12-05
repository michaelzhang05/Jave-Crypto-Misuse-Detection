package c;

import L5.I;
import X5.n;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.gbc.GoogleBasicConsents;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: c.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1895i {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f14840b;

    /* renamed from: a, reason: collision with root package name */
    public static final C1895i f14839a = new C1895i();

    /* renamed from: c, reason: collision with root package name */
    public static Vector f14841c = new Vector(null, 1, null);

    /* renamed from: c.i$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Vector f14842a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Vector vector) {
            super(2);
            this.f14842a = vector;
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (!this.f14842a.contains(intValue)) {
                if (booleanValue) {
                    this.f14842a.set(intValue);
                } else {
                    this.f14842a.unset(intValue);
                }
            }
            return I.f6487a;
        }
    }

    public final Vector a(Vector vector, Vector newVector) {
        AbstractC3159y.i(newVector, "newVector");
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
        Vector vector = f14841c;
        int e8 = e(str);
        if (vector.contains(e8)) {
            z8 = AbstractC3159y.d(vector.get(e8), Boolean.TRUE);
        } else {
            z8 = false;
        }
        if (z8) {
            return GBCConsentValue.GRANTED;
        }
        return GBCConsentValue.DENIED;
    }

    public final void d(int i8, GBCConsentValue value) {
        AbstractC3159y.i(value, "value");
        if (value == GBCConsentValue.GRANTED) {
            f14841c.set(i8);
        } else {
            f14841c.unset(i8);
        }
    }

    public final int e(String value) {
        AbstractC3159y.i(value, "value");
        if (AbstractC3159y.d(value, "adStorage")) {
            return 1;
        }
        if (AbstractC3159y.d(value, "adUserData")) {
            return 2;
        }
        if (AbstractC3159y.d(value, "adPersonalization")) {
            return 3;
        }
        if (AbstractC3159y.d(value, "analyticsStorage")) {
            return 4;
        }
        return 0;
    }
}
