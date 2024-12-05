package u2;

import android.util.Log;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: u2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4057d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f39950a = a.f39951a;

    /* renamed from: u2.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f39951a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final b f39952b = new b();

        /* renamed from: c, reason: collision with root package name */
        private static final C0894a f39953c = new C0894a();

        /* renamed from: u2.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0894a implements InterfaceC4057d {
            C0894a() {
            }

            @Override // u2.InterfaceC4057d
            public void a(String msg, Throwable th) {
                AbstractC3255y.i(msg, "msg");
            }

            @Override // u2.InterfaceC4057d
            public void b(String msg) {
                AbstractC3255y.i(msg, "msg");
            }

            @Override // u2.InterfaceC4057d
            public void c(String msg) {
                AbstractC3255y.i(msg, "msg");
            }

            @Override // u2.InterfaceC4057d
            public void d(String msg) {
                AbstractC3255y.i(msg, "msg");
            }
        }

        /* renamed from: u2.d$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC4057d {
            b() {
            }

            @Override // u2.InterfaceC4057d
            public void a(String msg, Throwable th) {
                AbstractC3255y.i(msg, "msg");
                Log.e("StripeSdk", msg, th);
            }

            @Override // u2.InterfaceC4057d
            public void b(String msg) {
                AbstractC3255y.i(msg, "msg");
                Log.d("StripeSdk", msg);
            }

            @Override // u2.InterfaceC4057d
            public void c(String msg) {
                AbstractC3255y.i(msg, "msg");
                Log.w("StripeSdk", msg);
            }

            @Override // u2.InterfaceC4057d
            public void d(String msg) {
                AbstractC3255y.i(msg, "msg");
                Log.i("StripeSdk", msg);
            }
        }

        private a() {
        }

        public final InterfaceC4057d a(boolean z8) {
            if (z8) {
                return c();
            }
            return b();
        }

        public final InterfaceC4057d b() {
            return f39953c;
        }

        public final InterfaceC4057d c() {
            return f39952b;
        }
    }

    void a(String str, Throwable th);

    void b(String str);

    void c(String str);

    void d(String str);
}
