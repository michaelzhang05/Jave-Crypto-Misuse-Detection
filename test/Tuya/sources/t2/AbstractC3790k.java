package t2;

import M5.AbstractC1246t;
import g6.n;
import j$.util.Objects;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONException;
import t2.C3780a;

/* renamed from: t2.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3790k extends Exception {

    /* renamed from: e, reason: collision with root package name */
    public static final a f38229e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final r2.f f38230a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38231b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38232c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f38233d;

    /* renamed from: t2.k$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final String a(Throwable th) {
            Class<?> cls = th.getClass();
            String name = cls.getName();
            AbstractC3159y.h(name, "getName(...)");
            if (!n.C(name, "android.", false, 2, null)) {
                String name2 = cls.getName();
                AbstractC3159y.h(name2, "getName(...)");
                if (!n.C(name2, "java.", false, 2, null)) {
                    return null;
                }
            }
            return cls.getName();
        }

        public final AbstractC3790k b(Throwable throwable) {
            AbstractC3790k c3784e;
            AbstractC3159y.i(throwable, "throwable");
            if (throwable instanceof AbstractC3790k) {
                return (AbstractC3790k) throwable;
            }
            if (throwable instanceof JSONException) {
                c3784e = new C3781b(throwable);
            } else {
                if (throwable instanceof IOException) {
                    return C3780a.C0881a.b(C3780a.f38225f, (IOException) throwable, null, 2, null);
                }
                if (throwable instanceof IllegalArgumentException) {
                    c3784e = new C3785f(null, null, 0, throwable.getMessage(), throwable, 7, null);
                } else {
                    c3784e = new C3784e(throwable, a(throwable));
                }
            }
            return c3784e;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AbstractC3790k(r2.f r5, java.lang.String r6, int r7, java.lang.Throwable r8, java.lang.String r9, int r10, kotlin.jvm.internal.AbstractC3151p r11) {
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
            java.lang.String r5 = r11.j()
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
        throw new UnsupportedOperationException("Method not decompiled: t2.AbstractC3790k.<init>(r2.f, java.lang.String, int, java.lang.Throwable, java.lang.String, int, kotlin.jvm.internal.p):void");
    }

    private final boolean f(AbstractC3790k abstractC3790k) {
        if (AbstractC3159y.d(this.f38230a, abstractC3790k.f38230a) && AbstractC3159y.d(this.f38231b, abstractC3790k.f38231b) && this.f38232c == abstractC3790k.f38232c && AbstractC3159y.d(getMessage(), abstractC3790k.getMessage())) {
            return true;
        }
        return false;
    }

    public abstract String a();

    public final String b() {
        return this.f38231b;
    }

    public final int c() {
        return this.f38232c;
    }

    public final r2.f d() {
        return this.f38230a;
    }

    public final boolean e() {
        return this.f38233d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC3790k) {
            return f((AbstractC3790k) obj);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f38230a, this.f38231b, Integer.valueOf(this.f38232c), getMessage());
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str;
        String str2 = this.f38231b;
        if (str2 != null) {
            str = "Request-id: " + str2;
        } else {
            str = null;
        }
        return AbstractC1246t.w0(AbstractC1246t.r(str, super.toString()), "\n", null, null, 0, null, null, 62, null);
    }

    public AbstractC3790k(r2.f fVar, String str, int i8, Throwable th, String str2) {
        super(str2, th);
        this.f38230a = fVar;
        this.f38231b = str;
        this.f38232c = i8;
        boolean z8 = false;
        if (400 <= i8 && i8 < 500) {
            z8 = true;
        }
        this.f38233d = z8;
    }
}
