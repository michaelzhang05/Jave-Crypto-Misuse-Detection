package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: Internal.java */
/* loaded from: classes2.dex */
public class i {
    public static final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f21934b;

    /* compiled from: Internal.java */
    /* loaded from: classes2.dex */
    public interface a {
        int a();
    }

    /* compiled from: Internal.java */
    /* loaded from: classes2.dex */
    public interface b<T extends a> {
        T a(int i2);
    }

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        f21934b = ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return v.e(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }
}
