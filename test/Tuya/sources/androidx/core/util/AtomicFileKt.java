package androidx.core.util;

import g6.C2728d;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3157w;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class AtomicFileKt {
    public static final byte[] readBytes(android.util.AtomicFile atomicFile) {
        return atomicFile.readFully();
    }

    public static final String readText(android.util.AtomicFile atomicFile, Charset charset) {
        return new String(atomicFile.readFully(), charset);
    }

    public static /* synthetic */ String readText$default(android.util.AtomicFile atomicFile, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = C2728d.f31293b;
        }
        return readText(atomicFile, charset);
    }

    public static final void tryWrite(android.util.AtomicFile atomicFile, Function1 function1) {
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            function1.invoke(startWrite);
            AbstractC3157w.b(1);
            atomicFile.finishWrite(startWrite);
            AbstractC3157w.a(1);
        } catch (Throwable th) {
            AbstractC3157w.b(1);
            atomicFile.failWrite(startWrite);
            AbstractC3157w.a(1);
            throw th;
        }
    }

    public static final void writeBytes(android.util.AtomicFile atomicFile, byte[] bArr) {
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    public static final void writeText(android.util.AtomicFile atomicFile, String str, Charset charset) {
        byte[] bytes = str.getBytes(charset);
        AbstractC3159y.h(bytes, "this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile atomicFile, String str, Charset charset, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            charset = C2728d.f31293b;
        }
        writeText(atomicFile, str, charset);
    }
}
