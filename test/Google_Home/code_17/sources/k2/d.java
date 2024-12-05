package k2;

import P5.AbstractC1378t;
import Y5.i;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class d {
    public static final String a(InputStream inputStream) {
        AbstractC3255y.i(inputStream, "inputStream");
        try {
            try {
                String w02 = AbstractC1378t.w0(i.e(new BufferedReader(new InputStreamReader(inputStream, "utf-8"))), "\n", null, null, 0, null, null, 62, null);
                Y5.b.a(inputStream, null);
                return w02;
            } catch (Exception unused) {
                throw new RuntimeException("Can't parse HTML file.");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Y5.b.a(inputStream, th);
                throw th2;
            }
        }
    }
}
