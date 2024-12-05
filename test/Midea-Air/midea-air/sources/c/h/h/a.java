package c.h.h;

import android.graphics.Typeface;
import android.os.Handler;
import c.h.h.e;
import c.h.h.f;

/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
class a {
    private final f.c a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f2672b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CallbackWithHandler.java */
    /* renamed from: c.h.h.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0056a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f.c f2673f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Typeface f2674g;

        RunnableC0056a(f.c cVar, Typeface typeface) {
            this.f2673f = cVar;
            this.f2674g = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2673f.b(this.f2674g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CallbackWithHandler.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f.c f2676f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f2677g;

        b(f.c cVar, int i2) {
            this.f2676f = cVar;
            this.f2677g = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2676f.a(this.f2677g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(f.c cVar, Handler handler) {
        this.a = cVar;
        this.f2672b = handler;
    }

    private void a(int i2) {
        this.f2672b.post(new b(this.a, i2));
    }

    private void c(Typeface typeface) {
        this.f2672b.post(new RunnableC0056a(this.a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(e.C0057e c0057e) {
        if (c0057e.a()) {
            c(c0057e.a);
        } else {
            a(c0057e.f2695b);
        }
    }
}
