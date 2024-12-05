package Z0;

import D0.C1053c;
import D0.F;
import D0.InterfaceC1055e;
import D0.r;
import Z0.j;
import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.UserManagerCompat;
import b1.InterfaceC1956b;
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
import q0.AbstractC3828l;

/* loaded from: classes3.dex */
public class f implements i, j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1956b f13597a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f13598b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1956b f13599c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f13600d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f13601e;

    private f(final Context context, final String str, Set set, InterfaceC1956b interfaceC1956b, Executor executor) {
        this(new InterfaceC1956b() { // from class: Z0.c
            @Override // b1.InterfaceC1956b
            public final Object get() {
                k j8;
                j8 = f.j(context, str);
                return j8;
            }
        }, set, executor, interfaceC1956b, context);
    }

    public static C1053c g() {
        final F a8 = F.a(C0.a.class, Executor.class);
        return C1053c.f(f.class, i.class, j.class).b(r.l(Context.class)).b(r.l(A0.f.class)).b(r.o(g.class)).b(r.n(j1.i.class)).b(r.k(a8)).f(new D0.h() { // from class: Z0.b
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                f h8;
                h8 = f.h(F.this, interfaceC1055e);
                return h8;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f h(F f8, InterfaceC1055e interfaceC1055e) {
        return new f((Context) interfaceC1055e.a(Context.class), ((A0.f) interfaceC1055e.a(A0.f.class)).o(), interfaceC1055e.e(g.class), interfaceC1055e.c(j1.i.class), (Executor) interfaceC1055e.b(f8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() {
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                k kVar = (k) this.f13597a.get();
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
            ((k) this.f13597a.get()).k(System.currentTimeMillis(), ((j1.i) this.f13599c.get()).a());
        }
        return null;
    }

    @Override // Z0.i
    public Task a() {
        if (!UserManagerCompat.isUserUnlocked(this.f13598b)) {
            return AbstractC3828l.e("");
        }
        return AbstractC3828l.c(this.f13601e, new Callable() { // from class: Z0.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i8;
                i8 = f.this.i();
                return i8;
            }
        });
    }

    @Override // Z0.j
    public synchronized j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        k kVar = (k) this.f13597a.get();
        if (kVar.i(currentTimeMillis)) {
            kVar.g();
            return j.a.GLOBAL;
        }
        return j.a.NONE;
    }

    public Task l() {
        if (this.f13600d.size() <= 0) {
            return AbstractC3828l.e(null);
        }
        if (!UserManagerCompat.isUserUnlocked(this.f13598b)) {
            return AbstractC3828l.e(null);
        }
        return AbstractC3828l.c(this.f13601e, new Callable() { // from class: Z0.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void k8;
                k8 = f.this.k();
                return k8;
            }
        });
    }

    f(InterfaceC1956b interfaceC1956b, Set set, Executor executor, InterfaceC1956b interfaceC1956b2, Context context) {
        this.f13597a = interfaceC1956b;
        this.f13600d = set;
        this.f13601e = executor;
        this.f13599c = interfaceC1956b2;
        this.f13598b = context;
    }
}
