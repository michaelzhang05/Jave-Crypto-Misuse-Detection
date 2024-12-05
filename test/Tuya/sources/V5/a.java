package V5;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class a {
    public static final long a(InputStream inputStream, OutputStream out, int i8) {
        AbstractC3159y.i(inputStream, "<this>");
        AbstractC3159y.i(out, "out");
        byte[] bArr = new byte[i8];
        int read = inputStream.read(bArr);
        long j8 = 0;
        while (read >= 0) {
            out.write(bArr, 0, read);
            j8 += read;
            read = inputStream.read(bArr);
        }
        return j8;
    }

    public static /* synthetic */ long b(InputStream inputStream, OutputStream outputStream, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 8192;
        }
        return a(inputStream, outputStream, i8);
    }
}
