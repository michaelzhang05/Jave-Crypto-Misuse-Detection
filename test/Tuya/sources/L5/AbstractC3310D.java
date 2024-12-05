package l5;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import kotlin.jvm.internal.AbstractC3151p;
import l5.AbstractC3310D;

/* renamed from: l5.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3310D {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34482a = new a(null);

    /* renamed from: l5.D$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c() {
            Process.killProcess(Process.myPid());
        }

        public final void b() {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: l5.C
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3310D.a.c();
                }
            }, 1000L);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }
}
