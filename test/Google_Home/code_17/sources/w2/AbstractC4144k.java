package w2;

import P5.AbstractC1378t;
import j$.util.Objects;
import j6.n;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONException;
import w2.C4134a;

/* renamed from: w2.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4144k extends Exception {

    /* renamed from: e, reason: collision with root package name */
    public static final a f40356e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final u2.f f40357a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40358b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40359c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f40360d;

    /* renamed from: w2.k$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final String a(Throwable th) {
            Class<?> cls = th.getClass();
            String name = cls.getName();
            AbstractC3255y.h(name, "getName(...)");
            if (!n.C(name, "android.", false, 2, null)) {
                String name2 = cls.getName();
                AbstractC3255y.h(name2, "getName(...)");
                if (!n.C(name2, "java.", false, 2, null)) {
                    return null;
                }
            }
            return cls.getName();
        }

        public final AbstractC4144k b(Throwable throwable) {
            AbstractC4144k c4138e;
            AbstractC3255y.i(throwable, "throwable");
            if (throwable instanceof AbstractC4144k) {
                return (AbstractC4144k) throwable;
            }
            if (throwable instanceof JSONException) {
                c4138e = new C4135b(throwable);
            } else {
                if (throwable instanceof IOException) {
                    return C4134a.C0915a.b(C4134a.f40352f, (IOException) throwable, null, 2, null);
                }
                if (throwable instanceof IllegalArgumentException) {
                    c4138e = new C4139f(null, null, 0, throwable.getMessage(), throwable, 7, null);
                } else {
                    c4138e = new C4138e(throwable, a(throwable));
                }
            }
            return c4138e;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AbstractC4144k(u2.f r5, java.lang.String r6, int r7, java.lang.Throwable r8, java.lang.String r9, int r10, kotlin.jvm.internal.AbstractC3247p r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L7
            r11 = r0
            goto L8
        L7:
            r11 = r5
        L8:
            r5 = r10 & 2
            if (r5 == 0) goto Le
            r1 = r0
            goto Lf
        Le:
            r1 = r6
        Lf:
            r5 = r10 & 4
            if (r5 == 0) goto L16
            r7 = 0
            r2 = 0
            goto L17
        L16:
            r2 = r7
        L17:
            r5 = r10 & 8
            if (r5 == 0) goto L1d
            r3 = r0
            goto L1e
        L1d:
            r3 = r8
        L1e:
            r5 = r10 & 16
            if (r5 == 0) goto L2b
            if (r11 == 0) goto L2a
            java.lang.String r5 = r11.i()
            r9 = r5
            goto L2b
        L2a:
            r9 = r0
        L2b:
            r10 = r9
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.AbstractC4144k.<init>(u2.f, java.lang.String, int, java.lang.Throwable, java.lang.String, int, kotlin.jvm.internal.p):void");
    }

    private final boolean f(AbstractC4144k abstractC4144k) {
        if (AbstractC3255y.d(this.f40357a, abstractC4144k.f40357a) && AbstractC3255y.d(this.f40358b, abstractC4144k.f40358b) && this.f40359c == abstractC4144k.f40359c && AbstractC3255y.d(getMessage(), abstractC4144k.getMessage())) {
            return true;
        }
        return false;
    }

    public abstract String a();

    public final String b() {
        return this.f40358b;
    }

    public final int c() {
        return this.f40359c;
    }

    public final u2.f d() {
        return this.f40357a;
    }

    public final boolean e() {
        return this.f40360d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC4144k) {
            return f((AbstractC4144k) obj);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f40357a, this.f40358b, Integer.valueOf(this.f40359c), getMessage());
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str;
        String str2 = this.f40358b;
        if (str2 != null) {
            str = "Request-id: " + str2;
        } else {
            str = null;
        }
        return AbstractC1378t.w0(AbstractC1378t.r(str, super.toString()), "\n", null, null, 0, null, null, 62, null);
    }

    public AbstractC4144k(u2.f fVar, String str, int i8, Throwable th, String str2) {
        super(str2, th);
        this.f40357a = fVar;
        this.f40358b = str;
        this.f40359c = i8;
        boolean z8 = false;
        if (400 <= i8 && i8 < 500) {
            z8 = true;
        }
        this.f40360d = z8;
    }
}
