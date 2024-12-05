package h2;

import M5.AbstractC1246t;
import V5.i;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class d {
    public static final String a(InputStream inputStream) {
        AbstractC3159y.i(inputStream, "inputStream");
        try {
            try {
                String w02 = AbstractC1246t.w0(i.e(new BufferedReader(new InputStreamReader(inputStream, "utf-8"))), "\n", null, null, 0, null, null, 62, null);
                V5.b.a(inputStream, null);
                return w02;
            } catch (Exception unused) {
                throw new RuntimeException("Can't parse HTML file.");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                V5.b.a(inputStream, th);
                throw th2;
            }
        }
    }
}
