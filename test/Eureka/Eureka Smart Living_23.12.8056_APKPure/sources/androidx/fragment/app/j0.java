package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
final class j0 extends Writer {

    /* renamed from: a, reason: collision with root package name */
    private final String f2903a;

    /* renamed from: b, reason: collision with root package name */
    private StringBuilder f2904b = new StringBuilder(128);

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(String str) {
        this.f2903a = str;
    }

    private void g() {
        if (this.f2904b.length() > 0) {
            Log.d(this.f2903a, this.f2904b.toString());
            StringBuilder sb = this.f2904b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        g();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i6, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            char c6 = cArr[i6 + i8];
            if (c6 == '\n') {
                g();
            } else {
                this.f2904b.append(c6);
            }
        }
    }
}
