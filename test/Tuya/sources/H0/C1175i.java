package H0;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: H0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1175i {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f3300a = new AtomicLong(0);

    /* renamed from: b, reason: collision with root package name */
    private static String f3301b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1175i(z zVar) {
        byte[] bArr = new byte[10];
        e(bArr);
        d(bArr);
        c(bArr);
        String C8 = AbstractC1176j.C(zVar.a().c());
        String w8 = AbstractC1176j.w(bArr);
        Locale locale = Locale.US;
        f3301b = String.format(locale, "%s%s%s%s", w8.substring(0, 12), w8.substring(12, 16), w8.subSequence(16, 20), C8.substring(0, 12)).toUpperCase(locale);
    }

    private static byte[] a(long j8) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j8);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private static byte[] b(long j8) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j8);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private void c(byte[] bArr) {
        byte[] b8 = b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b8[0];
        bArr[9] = b8[1];
    }

    private void d(byte[] bArr) {
        byte[] b8 = b(f3300a.incrementAndGet());
        bArr[6] = b8[0];
        bArr[7] = b8[1];
    }

    private void e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a8 = a(time / 1000);
        bArr[0] = a8[0];
        bArr[1] = a8[1];
        bArr[2] = a8[2];
        bArr[3] = a8[3];
        byte[] b8 = b(time % 1000);
        bArr[4] = b8[0];
        bArr[5] = b8[1];
    }

    public String toString() {
        return f3301b;
    }
}
