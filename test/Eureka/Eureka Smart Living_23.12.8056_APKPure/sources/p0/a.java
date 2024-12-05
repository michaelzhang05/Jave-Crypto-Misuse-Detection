package p0;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class a implements q {

    /* renamed from: c, reason: collision with root package name */
    private static final Set f8737c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final String f8738a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8739b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0130a {

        /* renamed from: a, reason: collision with root package name */
        static final Set f8740a = new HashSet(Arrays.asList(y.c().a()));
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // p0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 23;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // p0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public d(String str, String str2) {
            super(str, str2);
        }

        @Override // p0.a
        public final boolean c() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // p0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // p0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public g(String str, String str2) {
            super(str, str2);
        }

        @Override // p0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public h(String str, String str2) {
            super(str, str2);
        }

        @Override // p0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* loaded from: classes.dex */
    public static class i extends a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public i(String str, String str2) {
            super(str, str2);
        }

        @Override // p0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    a(String str, String str2) {
        this.f8738a = str;
        this.f8739b = str2;
        f8737c.add(this);
    }

    public static Set e() {
        return Collections.unmodifiableSet(f8737c);
    }

    @Override // p0.q
    public String a() {
        return this.f8738a;
    }

    @Override // p0.q
    public boolean b() {
        return c() || d();
    }

    public abstract boolean c();

    public boolean d() {
        return q5.a.b(C0130a.f8740a, this.f8739b);
    }
}
