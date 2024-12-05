package o5;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import kotlin.jvm.internal.AbstractC3247p;
import o5.AbstractC3658D;

/* renamed from: o5.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3658D {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36483a = new a(null);

    /* renamed from: o5.D$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c() {
            Process.killProcess(Process.myPid());
        }

        public final void b() {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o5.C
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3658D.a.c();
                }
            }, 1000L);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }
}
