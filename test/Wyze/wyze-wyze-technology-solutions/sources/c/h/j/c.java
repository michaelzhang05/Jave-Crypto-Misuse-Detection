package c.h.j;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter.java */
@Deprecated
/* loaded from: classes.dex */
public class c extends Writer {

    /* renamed from: f, reason: collision with root package name */
    private final String f2744f;

    /* renamed from: g, reason: collision with root package name */
    private StringBuilder f2745g = new StringBuilder(128);

    public c(String str) {
        this.f2744f = str;
    }

    private void a() {
        if (this.f2745g.length() > 0) {
            Log.d(this.f2744f, this.f2745g.toString());
            StringBuilder sb = this.f2745g;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                a();
            } else {
                this.f2745g.append(c2);
            }
        }
    }
}
