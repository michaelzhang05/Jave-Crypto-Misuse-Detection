package androidx.emoji2.text;

import android.content.Context;
import androidx.core.os.t;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.e;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements k0.a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends e.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements e.g {

        /* renamed from: a, reason: collision with root package name */
        private final Context f2489a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends e.h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e.h f2490a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f2491b;

            a(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f2490a = hVar;
                this.f2491b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.h
            public void a(Throwable th) {
                try {
                    this.f2490a.a(th);
                } finally {
                    this.f2491b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.h
            public void b(m mVar) {
                try {
                    this.f2490a.b(mVar);
                } finally {
                    this.f2491b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f2489a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.g
        public void a(final e.h hVar) {
            final ThreadPoolExecutor b6 = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            b6.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.d(hVar, b6);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                j a6 = androidx.emoji2.text.c.a(this.f2489a);
                if (a6 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a6.c(threadPoolExecutor);
                a6.a().a(new a(hVar, threadPoolExecutor));
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                t.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.h()) {
                    e.b().k();
                }
            } finally {
                t.b();
            }
        }
    }

    @Override // k0.a
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // k0.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        e.g(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        final androidx.lifecycle.h r5 = ((androidx.lifecycle.m) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).r();
        r5.a(new androidx.lifecycle.d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.d
            public void a(androidx.lifecycle.m mVar) {
                EmojiCompatInitializer.this.e();
                r5.c(this);
            }

            @Override // androidx.lifecycle.d
            public /* synthetic */ void b(androidx.lifecycle.m mVar) {
                androidx.lifecycle.c.b(this, mVar);
            }

            @Override // androidx.lifecycle.d
            public /* synthetic */ void c(androidx.lifecycle.m mVar) {
                androidx.lifecycle.c.a(this, mVar);
            }

            @Override // androidx.lifecycle.d
            public /* synthetic */ void e(androidx.lifecycle.m mVar) {
                androidx.lifecycle.c.c(this, mVar);
            }

            @Override // androidx.lifecycle.d
            public /* synthetic */ void f(androidx.lifecycle.m mVar) {
                androidx.lifecycle.c.e(this, mVar);
            }

            @Override // androidx.lifecycle.d
            public /* synthetic */ void g(androidx.lifecycle.m mVar) {
                androidx.lifecycle.c.d(this, mVar);
            }
        });
    }

    void e() {
        androidx.emoji2.text.b.d().postDelayed(new c(), 500L);
    }
}
