package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.graphics.u0;
import androidx.core.os.t;
import androidx.core.provider.g;
import androidx.emoji2.text.e;
import androidx.emoji2.text.j;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class j extends e.c {

    /* renamed from: j, reason: collision with root package name */
    private static final a f2554j = new a();

    /* loaded from: classes.dex */
    public static class a {
        public Typeface a(Context context, g.b bVar) {
            return androidx.core.provider.g.a(context, null, new g.b[]{bVar});
        }

        public g.a b(Context context, androidx.core.provider.e eVar) {
            return androidx.core.provider.g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements e.g {

        /* renamed from: a, reason: collision with root package name */
        private final Context f2555a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.provider.e f2556b;

        /* renamed from: c, reason: collision with root package name */
        private final a f2557c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f2558d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private Handler f2559e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f2560f;

        /* renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f2561g;

        /* renamed from: h, reason: collision with root package name */
        e.h f2562h;

        /* renamed from: i, reason: collision with root package name */
        private ContentObserver f2563i;

        /* renamed from: j, reason: collision with root package name */
        private Runnable f2564j;

        b(Context context, androidx.core.provider.e eVar, a aVar) {
            androidx.core.util.h.g(context, "Context cannot be null");
            androidx.core.util.h.g(eVar, "FontRequest cannot be null");
            this.f2555a = context.getApplicationContext();
            this.f2556b = eVar;
            this.f2557c = aVar;
        }

        private void b() {
            synchronized (this.f2558d) {
                this.f2562h = null;
                ContentObserver contentObserver = this.f2563i;
                if (contentObserver != null) {
                    this.f2557c.c(this.f2555a, contentObserver);
                    this.f2563i = null;
                }
                Handler handler = this.f2559e;
                if (handler != null) {
                    handler.removeCallbacks(this.f2564j);
                }
                this.f2559e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2561g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2560f = null;
                this.f2561g = null;
            }
        }

        private g.b e() {
            try {
                g.a b6 = this.f2557c.b(this.f2555a, this.f2556b);
                if (b6.c() == 0) {
                    g.b[] b7 = b6.b();
                    if (b7 == null || b7.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return b7[0];
                }
                throw new RuntimeException("fetchFonts failed (" + b6.c() + ")");
            } catch (PackageManager.NameNotFoundException e6) {
                throw new RuntimeException("provider not found", e6);
            }
        }

        @Override // androidx.emoji2.text.e.g
        public void a(e.h hVar) {
            androidx.core.util.h.g(hVar, "LoaderCallback cannot be null");
            synchronized (this.f2558d) {
                this.f2562h = hVar;
            }
            d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c() {
            synchronized (this.f2558d) {
                if (this.f2562h == null) {
                    return;
                }
                try {
                    g.b e6 = e();
                    int b6 = e6.b();
                    if (b6 == 2) {
                        synchronized (this.f2558d) {
                        }
                    }
                    if (b6 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + b6 + ")");
                    }
                    try {
                        t.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Typeface a6 = this.f2557c.a(this.f2555a, e6);
                        ByteBuffer f6 = u0.f(this.f2555a, null, e6.d());
                        if (f6 == null || a6 == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        m b7 = m.b(a6, f6);
                        t.b();
                        synchronized (this.f2558d) {
                            e.h hVar = this.f2562h;
                            if (hVar != null) {
                                hVar.b(b7);
                            }
                        }
                        b();
                    } catch (Throwable th) {
                        t.b();
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (this.f2558d) {
                        e.h hVar2 = this.f2562h;
                        if (hVar2 != null) {
                            hVar2.a(th2);
                        }
                        b();
                    }
                }
            }
        }

        void d() {
            synchronized (this.f2558d) {
                if (this.f2562h == null) {
                    return;
                }
                if (this.f2560f == null) {
                    ThreadPoolExecutor b6 = androidx.emoji2.text.b.b("emojiCompat");
                    this.f2561g = b6;
                    this.f2560f = b6;
                }
                this.f2560f.execute(new Runnable() { // from class: androidx.emoji2.text.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.b.this.c();
                    }
                });
            }
        }

        public void f(Executor executor) {
            synchronized (this.f2558d) {
                this.f2560f = executor;
            }
        }
    }

    public j(Context context, androidx.core.provider.e eVar) {
        super(new b(context, eVar, f2554j));
    }

    public j c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
