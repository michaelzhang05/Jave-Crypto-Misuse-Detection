package s1;

import android.content.Context;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    static final v f9240a = new p(t.b("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b, reason: collision with root package name */
    static final v f9241b = new q(t.b("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c, reason: collision with root package name */
    static final v f9242c = new r(t.b("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d, reason: collision with root package name */
    static final v f9243d = new s(t.b("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: e, reason: collision with root package name */
    private static final Object f9244e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static Context f9245f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(Context context) {
        synchronized (x.class) {
            if (f9245f != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f9245f = context.getApplicationContext();
            }
        }
    }
}
