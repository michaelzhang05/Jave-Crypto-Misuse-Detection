package r2;

import android.util.Log;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: r2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3684d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37570a = a.f37571a;

    /* renamed from: r2.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f37571a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final b f37572b = new b();

        /* renamed from: c, reason: collision with root package name */
        private static final C0859a f37573c = new C0859a();

        /* renamed from: r2.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0859a implements InterfaceC3684d {
            C0859a() {
            }

            @Override // r2.InterfaceC3684d
            public void a(String msg, Throwable th) {
                AbstractC3159y.i(msg, "msg");
            }

            @Override // r2.InterfaceC3684d
            public void b(String msg) {
                AbstractC3159y.i(msg, "msg");
            }

            @Override // r2.InterfaceC3684d
            public void c(String msg) {
                AbstractC3159y.i(msg, "msg");
            }

            @Override // r2.InterfaceC3684d
            public void d(String msg) {
                AbstractC3159y.i(msg, "msg");
            }
        }

        /* renamed from: r2.d$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC3684d {
            b() {
            }

            @Override // r2.InterfaceC3684d
            public void a(String msg, Throwable th) {
                AbstractC3159y.i(msg, "msg");
                Log.e("StripeSdk", msg, th);
            }

            @Override // r2.InterfaceC3684d
            public void b(String msg) {
                AbstractC3159y.i(msg, "msg");
                Log.d("StripeSdk", msg);
            }

            @Override // r2.InterfaceC3684d
            public void c(String msg) {
                AbstractC3159y.i(msg, "msg");
                Log.w("StripeSdk", msg);
            }

            @Override // r2.InterfaceC3684d
            public void d(String msg) {
                AbstractC3159y.i(msg, "msg");
                Log.i("StripeSdk", msg);
            }
        }

        private a() {
        }

        public final InterfaceC3684d a(boolean z8) {
            if (z8) {
                return c();
            }
            return b();
        }

        public final InterfaceC3684d b() {
            return f37573c;
        }

        public final InterfaceC3684d c() {
            return f37572b;
        }
    }

    void a(String str, Throwable th);

    void b(String str);

    void c(String str);

    void d(String str);
}
