package x2;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: x2.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3867E extends Closeable {

    /* renamed from: x2.E$a */
    /* loaded from: classes4.dex */
    public static abstract class a implements InterfaceC3867E {

        /* renamed from: b, reason: collision with root package name */
        public static final C0908a f39117b = new C0908a(null);

        /* renamed from: c, reason: collision with root package name */
        private static final String f39118c = StandardCharsets.UTF_8.name();

        /* renamed from: a, reason: collision with root package name */
        private final HttpsURLConnection f39119a;

        /* renamed from: x2.E$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0908a {
            private C0908a() {
            }

            public final String a() {
                return a.f39118c;
            }

            public /* synthetic */ C0908a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        public a(HttpsURLConnection conn) {
            AbstractC3159y.i(conn, "conn");
            this.f39119a = conn;
        }

        private final InputStream e() {
            int b8 = b();
            if (200 <= b8 && b8 < 300) {
                return this.f39119a.getInputStream();
            }
            return this.f39119a.getErrorStream();
        }

        public /* synthetic */ int b() {
            return this.f39119a.getResponseCode();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            InputStream e8 = e();
            if (e8 != null) {
                e8.close();
            }
            this.f39119a.disconnect();
        }

        @Override // x2.InterfaceC3867E
        public /* synthetic */ C3870H z() {
            int b8 = b();
            Object B8 = B(e());
            Map<String, List<String>> headerFields = this.f39119a.getHeaderFields();
            AbstractC3159y.h(headerFields, "getHeaderFields(...)");
            return new C3870H(b8, B8, headerFields);
        }
    }

    /* renamed from: x2.E$b */
    /* loaded from: classes4.dex */
    public static final class b extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HttpsURLConnection conn) {
            super(conn);
            AbstractC3159y.i(conn, "conn");
        }

        @Override // x2.InterfaceC3867E
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String B(InputStream inputStream) {
            String str;
            if (inputStream == null) {
                return null;
            }
            try {
                Scanner useDelimiter = new Scanner(inputStream, a.f39117b.a()).useDelimiter("\\A");
                if (useDelimiter.hasNext()) {
                    str = useDelimiter.next();
                } else {
                    str = null;
                }
                V5.b.a(inputStream, null);
                return str;
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

    Object B(InputStream inputStream);

    C3870H z();
}
