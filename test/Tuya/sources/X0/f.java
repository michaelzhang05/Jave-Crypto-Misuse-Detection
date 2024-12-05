package X0;

import B0.C1062c;
import B0.F;
import B0.InterfaceC1064e;
import B0.r;
import X0.j;
import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f implements i, j {

    /* renamed from: a, reason: collision with root package name */
    private final Z0.b f12176a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f12177b;

    /* renamed from: c, reason: collision with root package name */
    private final Z0.b f12178c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f12179d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f12180e;

    private f(final Context context, final String str, Set set, Z0.b bVar, Executor executor) {
        this(new Z0.b() { // from class: X0.c
            @Override // Z0.b
            public final Object get() {
                k j8;
                j8 = f.j(context, str);
                return j8;
            }
        }, set, executor, bVar, context);
    }

    public static C1062c g() {
        final F a8 = F.a(A0.a.class, Executor.class);
        return C1062c.f(f.class, i.class, j.class).b(r.k(Context.class)).b(r.k(y0.e.class)).b(r.n(g.class)).b(r.m(h1.i.class)).b(r.j(a8)).f(new B0.h() { // from class: X0.b
            @Override // B0.h
            public final Object a(InterfaceC1064e interfaceC1064e) {
                f h8;
                h8 = f.h(F.this, interfaceC1064e);
                return h8;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f h(F f8, InterfaceC1064e interfaceC1064e) {
        return new f((Context) interfaceC1064e.a(Context.class), ((y0.e) interfaceC1064e.a(y0.e.class)).o(), interfaceC1064e.g(g.class), interfaceC1064e.d(h1.i.class), (Executor) interfaceC1064e.f(f8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() {
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                k kVar = (k) this.f12176a.get();
                List c8 = kVar.c();
                kVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i8 = 0; i8 < c8.size(); i8++) {
                    l lVar = (l) c8.get(i8);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", lVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) lVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes(C.UTF8_NAME));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString(C.UTF8_NAME);
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k j(Context context, String str) {
        return new k(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() {
        synchronized (this) {
            ((k) this.f12176a.get()).k(System.currentTimeMillis(), ((h1.i) this.f12178c.get()).a());
        }
        return null;
    }

    @Override // X0.i
    public Task a() {
        if (!UserManagerCompat.isUserUnlocked(this.f12177b)) {
            return r0.l.e("");
        }
        return r0.l.c(this.f12180e, new Callable() { // from class: X0.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i8;
                i8 = f.this.i();
                return i8;
            }
        });
    }

    @Override // X0.j
    public synchronized j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        k kVar = (k) this.f12176a.get();
        if (kVar.i(currentTimeMillis)) {
            kVar.g();
            return j.a.GLOBAL;
        }
        return j.a.NONE;
    }

    public Task l() {
        if (this.f12179d.size() <= 0) {
            return r0.l.e(null);
        }
        if (!UserManagerCompat.isUserUnlocked(this.f12177b)) {
            return r0.l.e(null);
        }
        return r0.l.c(this.f12180e, new Callable() { // from class: X0.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void k8;
                k8 = f.this.k();
                return k8;
            }
        });
    }

    f(Z0.b bVar, Set set, Executor executor, Z0.b bVar2, Context context) {
        this.f12176a = bVar;
        this.f12179d = set;
        this.f12180e = executor;
        this.f12178c = bVar2;
        this.f12177b = context;
    }
}
