package o3;

import t3.i0;
import t3.y;

/* loaded from: classes.dex */
public final class e extends g3.g {

    /* renamed from: a, reason: collision with root package name */
    private final o f8229a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8230a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f8231b;

        static {
            int[] iArr = new int[y.c.values().length];
            f8231b = iArr;
            try {
                iArr[y.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8231b[y.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[i0.values().length];
            f8230a = iArr2;
            try {
                iArr2[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8230a[i0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8230a[i0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8230a[i0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public e(o oVar, g3.y yVar) {
        a(oVar, yVar);
        this.f8229a = oVar;
    }

    private static void a(o oVar, g3.y yVar) {
        int i6 = a.f8231b[oVar.d().ordinal()];
        if (i6 == 1 || i6 == 2) {
            g3.y.b(yVar);
        }
    }
}
