package A2;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface E extends Closeable {

    /* loaded from: classes4.dex */
    public static abstract class a implements E {

        /* renamed from: b, reason: collision with root package name */
        public static final C0000a f112b = new C0000a(null);

        /* renamed from: c, reason: collision with root package name */
        private static final String f113c = StandardCharsets.UTF_8.name();

        /* renamed from: a, reason: collision with root package name */
        private final HttpsURLConnection f114a;

        /* renamed from: A2.E$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0000a {
            private C0000a() {
            }

            public final String a() {
                return a.f113c;
            }

            public /* synthetic */ C0000a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        public a(HttpsURLConnection conn) {
            AbstractC3255y.i(conn, "conn");
            this.f114a = conn;
        }

        private final InputStream f() {
            int b8 = b();
            if (200 <= b8 && b8 < 300) {
                return this.f114a.getInputStream();
            }
            return this.f114a.getErrorStream();
        }

        public /* synthetic */ int b() {
            return this.f114a.getResponseCode();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            InputStream f8 = f();
            if (f8 != null) {
                f8.close();
            }
            this.f114a.disconnect();
        }

        @Override // A2.E
        public /* synthetic */ H w() {
            int b8 = b();
            Object z8 = z(f());
            Map<String, List<String>> headerFields = this.f114a.getHeaderFields();
            AbstractC3255y.h(headerFields, "getHeaderFields(...)");
            return new H(b8, z8, headerFields);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HttpsURLConnection conn) {
            super(conn);
            AbstractC3255y.i(conn, "conn");
        }

        @Override // A2.E
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public String z(InputStream inputStream) {
            String str;
            if (inputStream == null) {
                return null;
            }
            try {
                Scanner useDelimiter = new Scanner(inputStream, a.f112b.a()).useDelimiter("\\A");
                if (useDelimiter.hasNext()) {
                    str = useDelimiter.next();
                } else {
                    str = null;
                }
                Y5.b.a(inputStream, null);
                return str;
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

    H w();

    Object z(InputStream inputStream);
}
