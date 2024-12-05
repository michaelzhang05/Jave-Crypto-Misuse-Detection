package g3;

import t3.a0;
import t3.i0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final a0 f6719a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6720a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f6721b;

        static {
            int[] iArr = new int[b.values().length];
            f6721b = iArr;
            try {
                iArr[b.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6721b[b.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6721b[b.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6721b[b.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i0.values().length];
            f6720a = iArr2;
            try {
                iArr2[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6720a[i0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6720a[i0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6720a[i0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private l(a0 a0Var) {
        this.f6719a = a0Var;
    }

    public static l a(String str, byte[] bArr, b bVar) {
        return new l((a0) a0.c0().s(str).t(com.google.crypto.tink.shaded.protobuf.h.l(bArr)).r(c(bVar)).i());
    }

    static i0 c(b bVar) {
        int i6 = a.f6721b[bVar.ordinal()];
        if (i6 == 1) {
            return i0.TINK;
        }
        if (i6 == 2) {
            return i0.LEGACY;
        }
        if (i6 == 3) {
            return i0.RAW;
        }
        if (i6 == 4) {
            return i0.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0 b() {
        return this.f6719a;
    }
}
