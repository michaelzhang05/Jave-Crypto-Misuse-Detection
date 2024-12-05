package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final f f2370a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c f2371a;

        public a(ClipData clipData, int i6) {
            this.f2371a = Build.VERSION.SDK_INT >= 31 ? new b(clipData, i6) : new C0038d(clipData, i6);
        }

        public d a() {
            return this.f2371a.a();
        }

        public a b(Bundle bundle) {
            this.f2371a.setExtras(bundle);
            return this;
        }

        public a c(int i6) {
            this.f2371a.c(i6);
            return this;
        }

        public a d(Uri uri) {
            this.f2371a.b(uri);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f2372a;

        b(ClipData clipData, int i6) {
            h.a();
            this.f2372a = androidx.core.view.g.a(clipData, i6);
        }

        @Override // androidx.core.view.d.c
        public d a() {
            ContentInfo build;
            build = this.f2372a.build();
            return new d(new e(build));
        }

        @Override // androidx.core.view.d.c
        public void b(Uri uri) {
            this.f2372a.setLinkUri(uri);
        }

        @Override // androidx.core.view.d.c
        public void c(int i6) {
            this.f2372a.setFlags(i6);
        }

        @Override // androidx.core.view.d.c
        public void setExtras(Bundle bundle) {
            this.f2372a.setExtras(bundle);
        }
    }

    /* loaded from: classes.dex */
    private interface c {
        d a();

        void b(Uri uri);

        void c(int i6);

        void setExtras(Bundle bundle);
    }

    /* renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0038d implements c {

        /* renamed from: a, reason: collision with root package name */
        ClipData f2373a;

        /* renamed from: b, reason: collision with root package name */
        int f2374b;

        /* renamed from: c, reason: collision with root package name */
        int f2375c;

        /* renamed from: d, reason: collision with root package name */
        Uri f2376d;

        /* renamed from: e, reason: collision with root package name */
        Bundle f2377e;

        C0038d(ClipData clipData, int i6) {
            this.f2373a = clipData;
            this.f2374b = i6;
        }

        @Override // androidx.core.view.d.c
        public d a() {
            return new d(new g(this));
        }

        @Override // androidx.core.view.d.c
        public void b(Uri uri) {
            this.f2376d = uri;
        }

        @Override // androidx.core.view.d.c
        public void c(int i6) {
            this.f2375c = i6;
        }

        @Override // androidx.core.view.d.c
        public void setExtras(Bundle bundle) {
            this.f2377e = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo f2378a;

        e(ContentInfo contentInfo) {
            this.f2378a = androidx.core.view.c.a(androidx.core.util.h.f(contentInfo));
        }

        @Override // androidx.core.view.d.f
        public ClipData a() {
            ClipData clip;
            clip = this.f2378a.getClip();
            return clip;
        }

        @Override // androidx.core.view.d.f
        public int b() {
            int flags;
            flags = this.f2378a.getFlags();
            return flags;
        }

        @Override // androidx.core.view.d.f
        public ContentInfo c() {
            return this.f2378a;
        }

        @Override // androidx.core.view.d.f
        public int d() {
            int source;
            source = this.f2378a.getSource();
            return source;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f2378a + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* loaded from: classes.dex */
    private static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ClipData f2379a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2380b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2381c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f2382d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f2383e;

        g(C0038d c0038d) {
            this.f2379a = (ClipData) androidx.core.util.h.f(c0038d.f2373a);
            this.f2380b = androidx.core.util.h.b(c0038d.f2374b, 0, 5, "source");
            this.f2381c = androidx.core.util.h.e(c0038d.f2375c, 1);
            this.f2382d = c0038d.f2376d;
            this.f2383e = c0038d.f2377e;
        }

        @Override // androidx.core.view.d.f
        public ClipData a() {
            return this.f2379a;
        }

        @Override // androidx.core.view.d.f
        public int b() {
            return this.f2381c;
        }

        @Override // androidx.core.view.d.f
        public ContentInfo c() {
            return null;
        }

        @Override // androidx.core.view.d.f
        public int d() {
            return this.f2380b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f2379a.getDescription());
            sb.append(", source=");
            sb.append(d.e(this.f2380b));
            sb.append(", flags=");
            sb.append(d.a(this.f2381c));
            if (this.f2382d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f2382d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f2383e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    d(f fVar) {
        this.f2370a = fVar;
    }

    static String a(int i6) {
        return (i6 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i6);
    }

    static String e(int i6) {
        return i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? String.valueOf(i6) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static d g(ContentInfo contentInfo) {
        return new d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f2370a.a();
    }

    public int c() {
        return this.f2370a.b();
    }

    public int d() {
        return this.f2370a.d();
    }

    public ContentInfo f() {
        ContentInfo c6 = this.f2370a.c();
        Objects.requireNonNull(c6);
        return androidx.core.view.c.a(c6);
    }

    public String toString() {
        return this.f2370a.toString();
    }
}
