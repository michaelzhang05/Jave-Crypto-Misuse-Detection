package g3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import t3.c0;
import t3.i0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f6707a = new byte[0];

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6708a;

        static {
            int[] iArr = new int[i0.values().length];
            f6708a = iArr;
            try {
                iArr[i0.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6708a[i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6708a[i0.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6708a[i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(c0.c cVar) {
        ByteBuffer put;
        int i6 = a.f6708a[cVar.b0().ordinal()];
        if (i6 == 1 || i6 == 2) {
            put = ByteBuffer.allocate(5).put((byte) 0);
        } else {
            if (i6 != 3) {
                if (i6 == 4) {
                    return f6707a;
                }
                throw new GeneralSecurityException("unknown output prefix type");
            }
            put = ByteBuffer.allocate(5).put((byte) 1);
        }
        return put.putInt(cVar.a0()).array();
    }
}
