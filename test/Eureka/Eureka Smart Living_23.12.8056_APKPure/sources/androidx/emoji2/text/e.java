package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class e {

    /* renamed from: n, reason: collision with root package name */
    private static final Object f2497n = new Object();

    /* renamed from: o, reason: collision with root package name */
    private static final Object f2498o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static volatile e f2499p;

    /* renamed from: b, reason: collision with root package name */
    private final Set f2501b;

    /* renamed from: e, reason: collision with root package name */
    private final b f2504e;

    /* renamed from: f, reason: collision with root package name */
    final g f2505f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f2506g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f2507h;

    /* renamed from: i, reason: collision with root package name */
    final int[] f2508i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f2509j;

    /* renamed from: k, reason: collision with root package name */
    private final int f2510k;

    /* renamed from: l, reason: collision with root package name */
    private final int f2511l;

    /* renamed from: m, reason: collision with root package name */
    private final d f2512m;

    /* renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f2500a = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f2502c = 3;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f2503d = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    private static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.h f2513b;

        /* renamed from: c, reason: collision with root package name */
        private volatile m f2514c;

        /* renamed from: androidx.emoji2.text.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0042a extends h {
            C0042a() {
            }

            @Override // androidx.emoji2.text.e.h
            public void a(Throwable th) {
                a.this.f2516a.m(th);
            }

            @Override // androidx.emoji2.text.e.h
            public void b(m mVar) {
                a.this.d(mVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        void a() {
            try {
                this.f2516a.f2505f.a(new C0042a());
            } catch (Throwable th) {
                this.f2516a.m(th);
            }
        }

        @Override // androidx.emoji2.text.e.b
        CharSequence b(CharSequence charSequence, int i6, int i7, int i8, boolean z5) {
            return this.f2513b.h(charSequence, i6, i7, i8, z5);
        }

        @Override // androidx.emoji2.text.e.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f2514c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f2516a.f2506g);
        }

        void d(m mVar) {
            if (mVar == null) {
                this.f2516a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f2514c = mVar;
            m mVar2 = this.f2514c;
            i iVar = new i();
            d dVar = this.f2516a.f2512m;
            e eVar = this.f2516a;
            this.f2513b = new androidx.emoji2.text.h(mVar2, iVar, dVar, eVar.f2507h, eVar.f2508i);
            this.f2516a.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final e f2516a;

        b(e eVar) {
            this.f2516a = eVar;
        }

        abstract void a();

        abstract CharSequence b(CharSequence charSequence, int i6, int i7, int i8, boolean z5);

        abstract void c(EditorInfo editorInfo);
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final g f2517a;

        /* renamed from: b, reason: collision with root package name */
        boolean f2518b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2519c;

        /* renamed from: d, reason: collision with root package name */
        int[] f2520d;

        /* renamed from: e, reason: collision with root package name */
        Set f2521e;

        /* renamed from: f, reason: collision with root package name */
        boolean f2522f;

        /* renamed from: g, reason: collision with root package name */
        int f2523g = -16711936;

        /* renamed from: h, reason: collision with root package name */
        int f2524h = 0;

        /* renamed from: i, reason: collision with root package name */
        d f2525i = new androidx.emoji2.text.d();

        /* JADX INFO: Access modifiers changed from: protected */
        public c(g gVar) {
            androidx.core.util.h.g(gVar, "metadataLoader cannot be null.");
            this.f2517a = gVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final g a() {
            return this.f2517a;
        }

        public c b(int i6) {
            this.f2524h = i6;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(CharSequence charSequence, int i6, int i7, int i8);
    }

    /* renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0043e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List f2526a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f2527b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2528c;

        f(AbstractC0043e abstractC0043e, int i6) {
            this(Arrays.asList((AbstractC0043e) androidx.core.util.h.g(abstractC0043e, "initCallback cannot be null")), i6, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2526a.size();
            int i6 = 0;
            if (this.f2528c != 1) {
                while (i6 < size) {
                    ((AbstractC0043e) this.f2526a.get(i6)).a(this.f2527b);
                    i6++;
                }
            } else {
                while (i6 < size) {
                    ((AbstractC0043e) this.f2526a.get(i6)).b();
                    i6++;
                }
            }
        }

        f(Collection collection, int i6) {
            this(collection, i6, null);
        }

        f(Collection collection, int i6, Throwable th) {
            androidx.core.util.h.g(collection, "initCallbacks cannot be null");
            this.f2526a = new ArrayList(collection);
            this.f2528c = i6;
            this.f2527b = th;
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(h hVar);
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(m mVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i {
        i() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public androidx.emoji2.text.i a(androidx.emoji2.text.g gVar) {
            return new o(gVar);
        }
    }

    private e(c cVar) {
        this.f2506g = cVar.f2518b;
        this.f2507h = cVar.f2519c;
        this.f2508i = cVar.f2520d;
        this.f2509j = cVar.f2522f;
        this.f2510k = cVar.f2523g;
        this.f2505f = cVar.f2517a;
        this.f2511l = cVar.f2524h;
        this.f2512m = cVar.f2525i;
        l.b bVar = new l.b();
        this.f2501b = bVar;
        Set set = cVar.f2521e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f2521e);
        }
        this.f2504e = new a(this);
        l();
    }

    public static e b() {
        e eVar;
        synchronized (f2497n) {
            eVar = f2499p;
            androidx.core.util.h.h(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i6, int i7, boolean z5) {
        return androidx.emoji2.text.h.c(inputConnection, editable, i6, i7, z5);
    }

    public static boolean f(Editable editable, int i6, KeyEvent keyEvent) {
        return androidx.emoji2.text.h.d(editable, i6, keyEvent);
    }

    public static e g(c cVar) {
        e eVar = f2499p;
        if (eVar == null) {
            synchronized (f2497n) {
                eVar = f2499p;
                if (eVar == null) {
                    eVar = new e(cVar);
                    f2499p = eVar;
                }
            }
        }
        return eVar;
    }

    public static boolean h() {
        return f2499p != null;
    }

    private boolean j() {
        return d() == 1;
    }

    private void l() {
        this.f2500a.writeLock().lock();
        try {
            if (this.f2511l == 0) {
                this.f2502c = 0;
            }
            this.f2500a.writeLock().unlock();
            if (d() == 0) {
                this.f2504e.a();
            }
        } catch (Throwable th) {
            this.f2500a.writeLock().unlock();
            throw th;
        }
    }

    public int c() {
        return this.f2510k;
    }

    public int d() {
        this.f2500a.readLock().lock();
        try {
            return this.f2502c;
        } finally {
            this.f2500a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f2509j;
    }

    public void k() {
        androidx.core.util.h.h(this.f2511l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (j()) {
            return;
        }
        this.f2500a.writeLock().lock();
        try {
            if (this.f2502c == 0) {
                return;
            }
            this.f2502c = 0;
            this.f2500a.writeLock().unlock();
            this.f2504e.a();
        } finally {
            this.f2500a.writeLock().unlock();
        }
    }

    void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2500a.writeLock().lock();
        try {
            this.f2502c = 2;
            arrayList.addAll(this.f2501b);
            this.f2501b.clear();
            this.f2500a.writeLock().unlock();
            this.f2503d.post(new f(arrayList, this.f2502c, th));
        } catch (Throwable th2) {
            this.f2500a.writeLock().unlock();
            throw th2;
        }
    }

    void n() {
        ArrayList arrayList = new ArrayList();
        this.f2500a.writeLock().lock();
        try {
            this.f2502c = 1;
            arrayList.addAll(this.f2501b);
            this.f2501b.clear();
            this.f2500a.writeLock().unlock();
            this.f2503d.post(new f(arrayList, this.f2502c));
        } catch (Throwable th) {
            this.f2500a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i6, int i7) {
        return q(charSequence, i6, i7, Integer.MAX_VALUE);
    }

    public CharSequence q(CharSequence charSequence, int i6, int i7, int i8) {
        return r(charSequence, i6, i7, i8, 0);
    }

    public CharSequence r(CharSequence charSequence, int i6, int i7, int i8, int i9) {
        androidx.core.util.h.h(j(), "Not initialized yet");
        androidx.core.util.h.d(i6, "start cannot be negative");
        androidx.core.util.h.d(i7, "end cannot be negative");
        androidx.core.util.h.d(i8, "maxEmojiCount cannot be negative");
        androidx.core.util.h.a(i6 <= i7, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.core.util.h.a(i6 <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.h.a(i7 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i6 == i7) {
            return charSequence;
        }
        return this.f2504e.b(charSequence, i6, i7, i8, i9 != 1 ? i9 != 2 ? this.f2506g : false : true);
    }

    public void s(AbstractC0043e abstractC0043e) {
        androidx.core.util.h.g(abstractC0043e, "initCallback cannot be null");
        this.f2500a.writeLock().lock();
        try {
            if (this.f2502c != 1 && this.f2502c != 2) {
                this.f2501b.add(abstractC0043e);
            }
            this.f2503d.post(new f(abstractC0043e, this.f2502c));
        } finally {
            this.f2500a.writeLock().unlock();
        }
    }

    public void t(AbstractC0043e abstractC0043e) {
        androidx.core.util.h.g(abstractC0043e, "initCallback cannot be null");
        this.f2500a.writeLock().lock();
        try {
            this.f2501b.remove(abstractC0043e);
        } finally {
            this.f2500a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (!j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f2504e.c(editorInfo);
    }
}
