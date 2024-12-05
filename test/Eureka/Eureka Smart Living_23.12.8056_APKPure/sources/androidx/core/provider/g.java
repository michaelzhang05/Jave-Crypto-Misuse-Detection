package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.k;

/* loaded from: classes.dex */
public abstract class g {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f2207a;

        /* renamed from: b, reason: collision with root package name */
        private final b[] f2208b;

        public a(int i6, b[] bVarArr) {
            this.f2207a = i6;
            this.f2208b = bVarArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static a a(int i6, b[] bVarArr) {
            return new a(i6, bVarArr);
        }

        public b[] b() {
            return this.f2208b;
        }

        public int c() {
            return this.f2207a;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f2209a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2210b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2211c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f2212d;

        /* renamed from: e, reason: collision with root package name */
        private final int f2213e;

        public b(Uri uri, int i6, int i7, boolean z5, int i8) {
            this.f2209a = (Uri) androidx.core.util.h.f(uri);
            this.f2210b = i6;
            this.f2211c = i7;
            this.f2212d = z5;
            this.f2213e = i8;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static b a(Uri uri, int i6, int i7, boolean z5, int i8) {
            return new b(uri, i6, i7, z5, i8);
        }

        public int b() {
            return this.f2213e;
        }

        public int c() {
            return this.f2210b;
        }

        public Uri d() {
            return this.f2209a;
        }

        public int e() {
            return this.f2211c;
        }

        public boolean f() {
            return this.f2212d;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public abstract void a(int i6);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return k.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i6, boolean z5, int i7, Handler handler, c cVar) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(cVar, handler);
        return z5 ? f.e(context, eVar, aVar, i6, i7) : f.d(context, eVar, i6, null, aVar);
    }
}
