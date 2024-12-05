package o0;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final List f8205a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f8206a;

        /* renamed from: b, reason: collision with root package name */
        private String f8207b = "appassets.androidplatform.net";

        /* renamed from: c, reason: collision with root package name */
        private final List f8208c = new ArrayList();

        public a a(String str, b bVar) {
            this.f8208c.add(androidx.core.util.d.a(str, bVar));
            return this;
        }

        public e b() {
            ArrayList arrayList = new ArrayList();
            for (androidx.core.util.d dVar : this.f8208c) {
                arrayList.add(new c(this.f8207b, (String) dVar.f2263a, this.f8206a, (b) dVar.f2264b));
            }
            return new e(arrayList);
        }

        public a c(String str) {
            this.f8207b = str;
            return this;
        }

        public a d(boolean z5) {
            this.f8206a = z5;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        WebResourceResponse a(String str);
    }

    /* loaded from: classes.dex */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        final boolean f8209a;

        /* renamed from: b, reason: collision with root package name */
        final String f8210b;

        /* renamed from: c, reason: collision with root package name */
        final String f8211c;

        /* renamed from: d, reason: collision with root package name */
        final b f8212d;

        c(String str, String str2, boolean z5, b bVar) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str2.endsWith("/")) {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            this.f8210b = str;
            this.f8211c = str2;
            this.f8209a = z5;
            this.f8212d = bVar;
        }

        public String a(String str) {
            return str.replaceFirst(this.f8211c, "");
        }

        public b b(Uri uri) {
            if (uri.getScheme().equals("http") && !this.f8209a) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(this.f8210b) && uri.getPath().startsWith(this.f8211c)) {
                return this.f8212d;
            }
            return null;
        }
    }

    e(List list) {
        this.f8205a = list;
    }

    public WebResourceResponse a(Uri uri) {
        WebResourceResponse a6;
        for (c cVar : this.f8205a) {
            b b6 = cVar.b(uri);
            if (b6 != null && (a6 = b6.a(cVar.a(uri.getPath()))) != null) {
                return a6;
            }
        }
        return null;
    }
}
