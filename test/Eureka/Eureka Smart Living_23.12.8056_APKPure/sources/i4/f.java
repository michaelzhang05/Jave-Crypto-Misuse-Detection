package i4;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.v;
import i4.j;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import z3.e0;

/* loaded from: classes.dex */
public class f implements i, j {

    /* renamed from: a, reason: collision with root package name */
    private final k4.b f6999a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f7000b;

    /* renamed from: c, reason: collision with root package name */
    private final k4.b f7001c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f7002d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f7003e;

    private f(final Context context, final String str, Set set, k4.b bVar, Executor executor) {
        this(new k4.b() { // from class: i4.e
            @Override // k4.b
            public final Object get() {
                q j6;
                j6 = f.j(context, str);
                return j6;
            }
        }, set, executor, bVar, context);
    }

    public static z3.c g() {
        final e0 a6 = e0.a(y3.a.class, Executor.class);
        return z3.c.d(f.class, i.class, j.class).b(z3.r.i(Context.class)).b(z3.r.i(w3.e.class)).b(z3.r.l(g.class)).b(z3.r.k(s4.i.class)).b(z3.r.j(a6)).e(new z3.h() { // from class: i4.b
            @Override // z3.h
            public final Object a(z3.e eVar) {
                f h6;
                h6 = f.h(e0.this, eVar);
                return h6;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f h(e0 e0Var, z3.e eVar) {
        return new f((Context) eVar.a(Context.class), ((w3.e) eVar.a(w3.e.class)).n(), eVar.c(g.class), eVar.b(s4.i.class), (Executor) eVar.g(e0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() {
        String byteArrayOutputStream;
        synchronized (this) {
            q qVar = (q) this.f6999a.get();
            List c6 = qVar.c();
            qVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i6 = 0; i6 < c6.size(); i6++) {
                r rVar = (r) c6.get(i6);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", rVar.c());
                jSONObject.put("dates", new JSONArray((Collection) rVar.b()));
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
                    gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                } finally {
                }
            } finally {
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ q j(Context context, String str) {
        return new q(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() {
        synchronized (this) {
            ((q) this.f6999a.get()).k(System.currentTimeMillis(), ((s4.i) this.f7001c.get()).a());
        }
        return null;
    }

    @Override // i4.i
    public l2.i a() {
        return v.a(this.f7000b) ^ true ? l2.l.e("") : l2.l.c(this.f7003e, new Callable() { // from class: i4.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i6;
                i6 = f.this.i();
                return i6;
            }
        });
    }

    @Override // i4.j
    public synchronized j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        q qVar = (q) this.f6999a.get();
        if (!qVar.i(currentTimeMillis)) {
            return j.a.NONE;
        }
        qVar.g();
        return j.a.GLOBAL;
    }

    public l2.i l() {
        if (this.f7002d.size() > 0 && !(!v.a(this.f7000b))) {
            return l2.l.c(this.f7003e, new Callable() { // from class: i4.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void k6;
                    k6 = f.this.k();
                    return k6;
                }
            });
        }
        return l2.l.e(null);
    }

    f(k4.b bVar, Set set, Executor executor, k4.b bVar2, Context context) {
        this.f6999a = bVar;
        this.f7002d = set;
        this.f7003e = executor;
        this.f7001c = bVar2;
        this.f7000b = context;
    }
}
