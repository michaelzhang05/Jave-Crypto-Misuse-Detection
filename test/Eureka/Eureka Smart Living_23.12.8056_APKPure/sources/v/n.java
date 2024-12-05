package v;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final c f9494a;

    /* loaded from: classes.dex */
    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final InputContentInfo f9495a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            i.a();
            this.f9495a = h.a(uri, clipDescription, uri2);
        }

        @Override // v.n.c
        public void a() {
            this.f9495a.requestPermission();
        }

        @Override // v.n.c
        public Uri b() {
            Uri linkUri;
            linkUri = this.f9495a.getLinkUri();
            return linkUri;
        }

        @Override // v.n.c
        public Object c() {
            return this.f9495a;
        }

        @Override // v.n.c
        public Uri d() {
            Uri contentUri;
            contentUri = this.f9495a.getContentUri();
            return contentUri;
        }

        @Override // v.n.c
        public ClipDescription getDescription() {
            ClipDescription description;
            description = this.f9495a.getDescription();
            return description;
        }

        a(Object obj) {
            this.f9495a = e.a(obj);
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f9496a;

        /* renamed from: b, reason: collision with root package name */
        private final ClipDescription f9497b;

        /* renamed from: c, reason: collision with root package name */
        private final Uri f9498c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f9496a = uri;
            this.f9497b = clipDescription;
            this.f9498c = uri2;
        }

        @Override // v.n.c
        public void a() {
        }

        @Override // v.n.c
        public Uri b() {
            return this.f9498c;
        }

        @Override // v.n.c
        public Object c() {
            return null;
        }

        @Override // v.n.c
        public Uri d() {
            return this.f9496a;
        }

        @Override // v.n.c
        public ClipDescription getDescription() {
            return this.f9497b;
        }
    }

    /* loaded from: classes.dex */
    private interface c {
        void a();

        Uri b();

        Object c();

        Uri d();

        ClipDescription getDescription();
    }

    public n(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f9494a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public static n f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new n(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f9494a.d();
    }

    public ClipDescription b() {
        return this.f9494a.getDescription();
    }

    public Uri c() {
        return this.f9494a.b();
    }

    public void d() {
        this.f9494a.a();
    }

    public Object e() {
        return this.f9494a.c();
    }

    private n(c cVar) {
        this.f9494a = cVar;
    }
}
