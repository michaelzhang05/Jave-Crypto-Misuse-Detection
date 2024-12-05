package C6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;
import y6.k;

/* loaded from: classes5.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f1599a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    private int[] f1600b;

    /* renamed from: c, reason: collision with root package name */
    private int f1601c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1602a = new a();

        private a() {
        }
    }

    public D() {
        int[] iArr = new int[8];
        for (int i8 = 0; i8 < 8; i8++) {
            iArr[i8] = -1;
        }
        this.f1600b = iArr;
        this.f1601c = -1;
    }

    private final void e() {
        int i8 = this.f1601c * 2;
        Object[] copyOf = Arrays.copyOf(this.f1599a, i8);
        AbstractC3255y.h(copyOf, "copyOf(...)");
        this.f1599a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f1600b, i8);
        AbstractC3255y.h(copyOf2, "copyOf(...)");
        this.f1600b = copyOf2;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i8 = this.f1601c + 1;
        for (int i9 = 0; i9 < i8; i9++) {
            Object obj = this.f1599a[i9];
            if (obj instanceof y6.f) {
                y6.f fVar = (y6.f) obj;
                if (AbstractC3255y.d(fVar.getKind(), k.b.f41058a)) {
                    if (this.f1600b[i9] != -1) {
                        sb.append("[");
                        sb.append(this.f1600b[i9]);
                        sb.append("]");
                    }
                } else {
                    int i10 = this.f1600b[i9];
                    if (i10 >= 0) {
                        sb.append(".");
                        sb.append(fVar.f(i10));
                    }
                }
            } else if (obj != a.f1602a) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "toString(...)");
        return sb2;
    }

    public final void b() {
        int i8 = this.f1601c;
        int[] iArr = this.f1600b;
        if (iArr[i8] == -2) {
            iArr[i8] = -1;
            this.f1601c = i8 - 1;
        }
        int i9 = this.f1601c;
        if (i9 != -1) {
            this.f1601c = i9 - 1;
        }
    }

    public final void c(y6.f sd) {
        AbstractC3255y.i(sd, "sd");
        int i8 = this.f1601c + 1;
        this.f1601c = i8;
        if (i8 == this.f1599a.length) {
            e();
        }
        this.f1599a[i8] = sd;
    }

    public final void d() {
        int[] iArr = this.f1600b;
        int i8 = this.f1601c;
        if (iArr[i8] == -2) {
            this.f1599a[i8] = a.f1602a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f1600b;
        int i8 = this.f1601c;
        if (iArr[i8] != -2) {
            int i9 = i8 + 1;
            this.f1601c = i9;
            if (i9 == this.f1599a.length) {
                e();
            }
        }
        Object[] objArr = this.f1599a;
        int i10 = this.f1601c;
        objArr[i10] = obj;
        this.f1600b[i10] = -2;
    }

    public final void g(int i8) {
        this.f1600b[this.f1601c] = i8;
    }

    public String toString() {
        return a();
    }
}
