package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final g.c f2176a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f2177b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0029a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f2178a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f2179b;

        RunnableC0029a(g.c cVar, Typeface typeface) {
            this.f2178a = cVar;
            this.f2179b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2178a.b(this.f2179b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f2181a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2182b;

        b(g.c cVar, int i6) {
            this.f2181a = cVar;
            this.f2182b = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2181a.a(this.f2182b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(g.c cVar, Handler handler) {
        this.f2176a = cVar;
        this.f2177b = handler;
    }

    private void a(int i6) {
        this.f2177b.post(new b(this.f2176a, i6));
    }

    private void c(Typeface typeface) {
        this.f2177b.post(new RunnableC0029a(this.f2176a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f2205a);
        } else {
            a(eVar.f2206b);
        }
    }
}
